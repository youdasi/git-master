package com.youdasi.gitmater;

import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GitMaterApplicationTests {

	@Test
	public void contextLoads() {

	    try(Repository existingRepo = new FileRepositoryBuilder()
                .setGitDir(new File("my_repo/.git"))
                .build();){
            Ref master = existingRepo.findRef("master");
            // 获取该引用所指向的对象
            ObjectId masterTip = master.getObjectId();
        }catch (Exception e) {

        }

    }

}

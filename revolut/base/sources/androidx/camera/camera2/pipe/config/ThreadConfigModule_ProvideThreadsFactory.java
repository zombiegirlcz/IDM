package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import e4m.e;
import kotlinx.coroutines.Job;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class ThreadConfigModule_ProvideThreadsFactory implements e {
    public static Threads provideThreads(ThreadConfigModule threadConfigModule, CameraPipeLifetime cameraPipeLifetime, Job job2) {
        Threads threadsProvideThreads = threadConfigModule.provideThreads(cameraPipeLifetime, job2);
        s.k(threadsProvideThreads);
        return threadsProvideThreads;
    }
}

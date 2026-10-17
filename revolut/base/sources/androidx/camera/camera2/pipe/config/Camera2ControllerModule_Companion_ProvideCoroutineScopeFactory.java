package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.core.Threads;
import e4m.e;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class Camera2ControllerModule_Companion_ProvideCoroutineScopeFactory implements e {
    public static CoroutineScope provideCoroutineScope(Threads threads, Job job2) {
        CoroutineScope coroutineScopeProvideCoroutineScope = Camera2ControllerModule.INSTANCE.provideCoroutineScope(threads, job2);
        s.k(coroutineScopeProvideCoroutineScope);
        return coroutineScopeProvideCoroutineScope;
    }
}

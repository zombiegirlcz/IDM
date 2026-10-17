package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.core.Threads;
import e4m.e;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class SharedCameraGraphModules_Companion_ProvideCameraGraphCoroutineScopeFactory implements e {
    public static CoroutineScope provideCameraGraphCoroutineScope(Threads threads, Job job2) {
        CoroutineScope coroutineScopeProvideCameraGraphCoroutineScope = SharedCameraGraphModules.INSTANCE.provideCameraGraphCoroutineScope(threads, job2);
        s.k(coroutineScopeProvideCameraGraphCoroutineScope);
        return coroutineScopeProvideCameraGraphCoroutineScope;
    }
}

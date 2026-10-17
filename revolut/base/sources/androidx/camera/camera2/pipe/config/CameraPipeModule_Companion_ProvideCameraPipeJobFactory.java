package androidx.camera.camera2.pipe.config;

import e4m.e;
import kotlinx.coroutines.Job;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CameraPipeModule_Companion_ProvideCameraPipeJobFactory implements e {
    public static Job provideCameraPipeJob() {
        Job jobProvideCameraPipeJob = CameraPipeModule.INSTANCE.provideCameraPipeJob();
        s.k(jobProvideCameraPipeJob);
        return jobProvideCameraPipeJob;
    }
}

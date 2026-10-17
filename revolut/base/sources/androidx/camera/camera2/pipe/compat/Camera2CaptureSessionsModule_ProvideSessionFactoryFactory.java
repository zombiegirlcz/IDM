package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraGraph;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class Camera2CaptureSessionsModule_ProvideSessionFactoryFactory implements e {
    public static CaptureSessionFactory provideSessionFactory(phm.a aVar, phm.a aVar2, phm.a aVar3, phm.a aVar4, phm.a aVar5, CameraGraph.Config config) {
        CaptureSessionFactory captureSessionFactoryProvideSessionFactory = Camera2CaptureSessionsModule.INSTANCE.provideSessionFactory(aVar, aVar2, aVar3, aVar4, aVar5, config);
        s.k(captureSessionFactoryProvideSessionFactory);
        return captureSessionFactoryProvideSessionFactory;
    }
}

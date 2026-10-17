package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class InactiveSurfaceCloser_Bindings_Companion_ProvideInactiveSurfaceCloserFactory implements e {
    public static InactiveSurfaceCloser provideInactiveSurfaceCloser(CameraQuirks cameraQuirks) {
        InactiveSurfaceCloser inactiveSurfaceCloserProvideInactiveSurfaceCloser = InactiveSurfaceCloser.Bindings.INSTANCE.provideInactiveSurfaceCloser(cameraQuirks);
        s.k(inactiveSurfaceCloserProvideInactiveSurfaceCloser);
        return inactiveSurfaceCloserProvideInactiveSurfaceCloser;
    }
}

package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.workaround.UseTorchAsFlash;
import androidx.camera.camera2.internal.IntrinsicZoomCalculator;
import androidx.camera.camera2.pipe.CameraDevices;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class UseTorchAsFlash_Bindings_Companion_ProvideUseTorchAsFlashFactory implements e {
    public static UseTorchAsFlash provideUseTorchAsFlash(CameraQuirks cameraQuirks, CameraDevices cameraDevices, IntrinsicZoomCalculator intrinsicZoomCalculator) {
        UseTorchAsFlash useTorchAsFlashProvideUseTorchAsFlash = UseTorchAsFlash.Bindings.INSTANCE.provideUseTorchAsFlash(cameraQuirks, cameraDevices, intrinsicZoomCalculator);
        s.k(useTorchAsFlashProvideUseTorchAsFlash);
        return useTorchAsFlashProvideUseTorchAsFlash;
    }
}

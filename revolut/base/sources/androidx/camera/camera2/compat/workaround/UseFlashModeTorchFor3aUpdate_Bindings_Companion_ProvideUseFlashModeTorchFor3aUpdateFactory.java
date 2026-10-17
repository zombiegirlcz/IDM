package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class UseFlashModeTorchFor3aUpdate_Bindings_Companion_ProvideUseFlashModeTorchFor3aUpdateFactory implements e {
    public static UseFlashModeTorchFor3aUpdate provideUseFlashModeTorchFor3aUpdate(CameraQuirks cameraQuirks) {
        UseFlashModeTorchFor3aUpdate useFlashModeTorchFor3aUpdateProvideUseFlashModeTorchFor3aUpdate = UseFlashModeTorchFor3aUpdate.Bindings.INSTANCE.provideUseFlashModeTorchFor3aUpdate(cameraQuirks);
        s.k(useFlashModeTorchFor3aUpdateProvideUseFlashModeTorchFor3aUpdate);
        return useFlashModeTorchFor3aUpdateProvideUseFlashModeTorchFor3aUpdate;
    }
}

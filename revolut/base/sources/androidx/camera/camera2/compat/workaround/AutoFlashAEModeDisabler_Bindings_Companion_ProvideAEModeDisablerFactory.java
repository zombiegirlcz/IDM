package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AutoFlashAEModeDisabler_Bindings_Companion_ProvideAEModeDisablerFactory implements e {
    public static AutoFlashAEModeDisabler provideAEModeDisabler(CameraQuirks cameraQuirks) {
        AutoFlashAEModeDisabler autoFlashAEModeDisablerProvideAEModeDisabler = AutoFlashAEModeDisabler.Bindings.INSTANCE.provideAEModeDisabler(cameraQuirks);
        s.k(autoFlashAEModeDisablerProvideAEModeDisabler);
        return autoFlashAEModeDisablerProvideAEModeDisabler;
    }
}

package androidx.camera.camera2.config;

import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.core.impl.EncoderProfilesProvider;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CameraModule_Companion_ProvideEncoderProfilesProviderFactory implements e {
    public static EncoderProfilesProvider provideEncoderProfilesProvider(String str, CameraQuirks cameraQuirks) {
        EncoderProfilesProvider encoderProfilesProviderProvideEncoderProfilesProvider = CameraModule.INSTANCE.provideEncoderProfilesProvider(str, cameraQuirks);
        s.k(encoderProfilesProviderProvideEncoderProfilesProvider);
        return encoderProfilesProviderProvideEncoderProfilesProvider;
    }
}

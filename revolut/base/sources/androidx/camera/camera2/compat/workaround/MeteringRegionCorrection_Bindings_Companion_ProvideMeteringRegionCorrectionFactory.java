package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.workaround.MeteringRegionCorrection;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class MeteringRegionCorrection_Bindings_Companion_ProvideMeteringRegionCorrectionFactory implements e {
    public static MeteringRegionCorrection provideMeteringRegionCorrection(CameraQuirks cameraQuirks) {
        MeteringRegionCorrection meteringRegionCorrectionProvideMeteringRegionCorrection = MeteringRegionCorrection.Bindings.INSTANCE.provideMeteringRegionCorrection(cameraQuirks);
        s.k(meteringRegionCorrectionProvideMeteringRegionCorrection);
        return meteringRegionCorrectionProvideMeteringRegionCorrection;
    }
}

package q;

import androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.CapturePipelineImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraProperties f241054b;

    public /* synthetic */ a(CameraProperties cameraProperties, int i) {
        this.f241053a = i;
        this.f241054b = cameraProperties;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zIsLegacyDevice_delegate$lambda$0;
        switch (this.f241053a) {
            case 0:
                zIsLegacyDevice_delegate$lambda$0 = CapturePipelineTorchCorrection.isLegacyDevice_delegate$lambda$0(this.f241054b);
                break;
            default:
                zIsLegacyDevice_delegate$lambda$0 = CapturePipelineImpl.hasFlashUnit_delegate$lambda$0(this.f241054b);
                break;
        }
        return Boolean.valueOf(zIsLegacyDevice_delegate$lambda$0);
    }
}

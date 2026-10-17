package androidx.camera.camera2.pipe.compat;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class PruningCamera2DeviceManager$queue$1 extends q implements Function1<List<CameraRequest>, Unit> {
    public PruningCamera2DeviceManager$queue$1(Object obj2) {
        super(1, 0, PruningCamera2DeviceManager.class, obj2, "prune", "prune$camera_camera2_pipe(Ljava/util/List;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((List<CameraRequest>) obj2);
        return Unit.f186387a;
    }

    public final void invoke(List<CameraRequest> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((PruningCamera2DeviceManager) this.receiver).prune$camera_camera2_pipe(p0);
    }
}

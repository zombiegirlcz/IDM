package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.pipe.FrameMetadata;
import aqd.o1;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u001a.\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004H\u0000¨\u0006\b"}, d2 = {"toConditionChecker", "Lkotlin/Function1;", "Landroidx/camera/camera2/pipe/FrameMetadata;", "", "", "Landroid/hardware/camera2/CaptureResult$Key;", "", "", "camera-camera2-pipe"}, k = 2, mv = {2, 1, 0}, xi = 48)
public abstract class Result3AStateListenerKt {
    @NotNull
    public static final Function1<FrameMetadata, Boolean> toConditionChecker(@NotNull Map<CaptureResult.Key<?>, ? extends List<? extends Object>> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new o1(map, 25);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toConditionChecker$lambda$0(Map map, FrameMetadata frameMetadata) {
        Intrinsics.checkNotNullParameter(frameMetadata, "frameMetadata");
        for (Map.Entry entry : map.entrySet()) {
            CaptureResult.Key key = (CaptureResult.Key) entry.getKey();
            if (!d0.T((List) entry.getValue(), frameMetadata.get(key))) {
                return false;
            }
        }
        return true;
    }
}

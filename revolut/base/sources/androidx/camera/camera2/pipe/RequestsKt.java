package androidx.camera.camera2.pipe;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.pipe.core.Log;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\t\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\r\u001a\u00020\u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroid/hardware/camera2/CaptureRequest$Builder;", "", "", "parameters", "", "writeParameters", "(Landroid/hardware/camera2/CaptureRequest$Builder;Ljava/util/Map;)V", "key", "value", "writeParameter", "(Landroid/hardware/camera2/CaptureRequest$Builder;Ljava/lang/Object;Ljava/lang/Object;)V", "", "metadata", "putAllMetadata", "(Ljava/util/Map;Ljava/util/Map;)V", "camera-camera2-pipe"}, k = 2, mv = {2, 1, 0}, xi = 48)
public abstract class RequestsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void putAllMetadata(@NotNull Map<Object, Object> map, @NotNull Map<?, ? extends Object> metadata) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        map.putAll(metadata);
    }

    public static final void writeParameter(@NotNull CaptureRequest.Builder builder, Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (obj2 == null || !(obj2 instanceof CaptureRequest.Key)) {
            return;
        }
        try {
            builder.set((CaptureRequest.Key) obj2, obj3);
        } catch (IllegalArgumentException e) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str = "Failed to set [" + ((CaptureRequest.Key) obj2).getName() + ": " + obj3 + "] on CaptureRequest.Builder";
            }
        }
    }

    public static final void writeParameters(@NotNull CaptureRequest.Builder builder, @NotNull Map<?, ? extends Object> parameters) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        for (Map.Entry<?, ? extends Object> entry : parameters.entrySet()) {
            writeParameter(builder, entry.getKey(), entry.getValue());
        }
    }
}

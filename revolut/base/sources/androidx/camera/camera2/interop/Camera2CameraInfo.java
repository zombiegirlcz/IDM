package androidx.camera.camera2.interop;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import androidx.camera.camera2.adapter.CameraInfoAdapter;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.AdapterCameraInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B3\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR,\u0010\u0007\u001a\u001a\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/camera/camera2/interop/Camera2CameraInfo;", "", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "", "Landroid/util/Pair;", "Landroid/hardware/camera2/CameraCharacteristics$Key;", "extensionsSpecificChars", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Ljava/util/List;)V", "", "getCameraId", "()Ljava/lang/String;", "Landroidx/camera/camera2/impl/CameraProperties;", "Ljava/util/List;", "cameraId", "Ljava/lang/String;", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2CameraInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public final /* synthetic */ String cameraId;

    @NotNull
    private final CameraProperties cameraProperties;
    private final List<Pair<CameraCharacteristics.Key<?>, Object>> extensionsSpecificChars;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Landroidx/camera/camera2/interop/Camera2CameraInfo$Companion;", "", "<init>", "()V", "from", "Landroidx/camera/camera2/interop/Camera2CameraInfo;", "cameraInfo", "Landroidx/camera/core/CameraInfo;", "create", "cameraProperties", "Landroidx/camera/camera2/impl/CameraProperties;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final Camera2CameraInfo create(@NotNull CameraProperties cameraProperties) {
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            return new Camera2CameraInfo(cameraProperties, null, 2, 0 == true ? 1 : 0);
        }

        @NotNull
        public final Camera2CameraInfo from(@NotNull CameraInfo cameraInfo) {
            Intrinsics.checkNotNullParameter(cameraInfo, "cameraInfo");
            Camera2CameraInfo camera2CameraInfo = (Camera2CameraInfo) CameraInfoAdapter.INSTANCE.unwrapAs(cameraInfo, o0.f186429a.b(Camera2CameraInfo.class));
            if (camera2CameraInfo != null) {
                if (cameraInfo instanceof AdapterCameraInfo) {
                    ((AdapterCameraInfo) cameraInfo).getSessionProcessor();
                }
                return camera2CameraInfo;
            }
            throw new IllegalArgumentException(("Could not unwrap " + cameraInfo + " as Camera2CameraInfo!").toString());
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Camera2CameraInfo(CameraProperties cameraProperties, List<? extends Pair<CameraCharacteristics.Key<?>, Object>> list) {
        this.cameraProperties = cameraProperties;
        this.extensionsSpecificChars = list;
        this.cameraId = cameraProperties.mo31getCameraIdDz_R5H8();
    }

    @NotNull
    public static final Camera2CameraInfo from(@NotNull CameraInfo cameraInfo) {
        return INSTANCE.from(cameraInfo);
    }

    @NotNull
    public final String getCameraId() {
        return this.cameraId;
    }

    public /* synthetic */ Camera2CameraInfo(CameraProperties cameraProperties, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cameraProperties, (i & 2) != 0 ? null : list);
    }
}

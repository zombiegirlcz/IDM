package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.graph.GraphListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import skm.g0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001JK\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\nH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\b\b\u0002\u0010\u0015\u001a\u00020\bH&¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2DeviceManager;", "", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "", "sharedCameraIds", "Landroidx/camera/camera2/pipe/graph/GraphListener;", "graphListener", "", "isPrewarm", "Lkotlin/Function1;", "", "isForegroundObserver", "Landroidx/camera/camera2/pipe/compat/VirtualCamera;", "open-zDSwpeU", "(Ljava/lang/String;Ljava/util/List;Landroidx/camera/camera2/pipe/graph/GraphListener;ZLkotlin/jvm/functions/Function1;)Landroidx/camera/camera2/pipe/compat/VirtualCamera;", "open", "Lskm/g0;", "close-EfqyGwQ", "(Ljava/lang/String;)Lskm/g0;", "close", "forceCancelOpen", "closeAll", "(Z)Lskm/g0;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Camera2DeviceManager {
    @NotNull
    /* JADX INFO: renamed from: close-EfqyGwQ, reason: not valid java name */
    g0 mo394closeEfqyGwQ(@NotNull String cameraId);

    @NotNull
    g0 closeAll(boolean forceCancelOpen);

    /* JADX INFO: renamed from: open-zDSwpeU, reason: not valid java name */
    VirtualCamera mo395openzDSwpeU(@NotNull String cameraId, @NotNull List<CameraId> sharedCameraIds, @NotNull GraphListener graphListener, boolean isPrewarm, @NotNull Function1<? super Unit, Boolean> isForegroundObserver);
}

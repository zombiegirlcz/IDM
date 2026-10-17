package androidx.camera.camera2.compat;

import android.util.Range;
import android.util.Rational;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import skm.g0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/compat/EvCompCompat;", "", "", "throwable", "", "stopRunningTask", "(Ljava/lang/Throwable;)V", "", "evCompIndex", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "requestControl", "", "cancelPreviousTask", "Lskm/g0;", "applyAsync", "(ILandroidx/camera/camera2/impl/UseCaseCameraRequestControl;Z)Lskm/g0;", "getSupported", "()Z", "supported", "Landroid/util/Range;", "getRange", "()Landroid/util/Range;", "range", "Landroid/util/Rational;", "getStep", "()Landroid/util/Rational;", "step", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface EvCompCompat {
    @NotNull
    g0 applyAsync(int evCompIndex, @NotNull UseCaseCameraRequestControl requestControl, boolean cancelPreviousTask);

    @NotNull
    Range<Integer> getRange();

    @NotNull
    Rational getStep();

    boolean getSupported();

    void stopRunningTask(@NotNull Throwable throwable);
}

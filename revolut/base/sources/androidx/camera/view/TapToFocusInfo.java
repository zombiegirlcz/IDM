package androidx.camera.view;

import android.graphics.PointF;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/camera/view/TapToFocusInfo;", "", "", "focusState", "Landroid/graphics/PointF;", "tapPoint", "<init>", "(ILandroid/graphics/PointF;)V", "I", "getFocusState", "()I", "Landroid/graphics/PointF;", "getTapPoint", "()Landroid/graphics/PointF;", "camera-view"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TapToFocusInfo {
    private final int focusState;
    private final PointF tapPoint;

    public TapToFocusInfo(int i, PointF pointF) {
        this.focusState = i;
        this.tapPoint = pointF;
    }

    public final int getFocusState() {
        return this.focusState;
    }
}

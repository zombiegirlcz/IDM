package xq0;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends LinearSnapHelper {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f308044a = -1;

    public static final class a {
        private a() {
        }
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public final View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return super.findSnapView(layoutManager);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        return linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0 ? linearLayoutManager.findViewByPosition(0) : linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() + (-1) ? linearLayoutManager.findViewByPosition(linearLayoutManager.getItemCount() - 1) : super.findSnapView(layoutManager);
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public final int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int i3;
        int iFindTargetSnapPosition = super.findTargetSnapPosition(layoutManager, i / 2, i2 / 2);
        if (iFindTargetSnapPosition >= 0 && (i3 = this.f308044a) > 0 && (layoutManager instanceof LinearLayoutManager)) {
            int iFindFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
            if (Math.abs(iFindFirstVisibleItemPosition - iFindTargetSnapPosition) > i3) {
                return (Integer.signum(i) * i3) + iFindFirstVisibleItemPosition;
            }
        }
        return iFindTargetSnapPosition;
    }
}

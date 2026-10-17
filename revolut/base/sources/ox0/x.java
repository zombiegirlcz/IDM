package ox0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class x {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f230517a = new int[2];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f230518b = new int[2];

    public static final class a {
        private a() {
        }
    }

    public final Float a(View scroller, View boundaryView) {
        View childAt;
        View childAt2;
        int iFindLastVisibleItemPosition;
        Intrinsics.checkNotNullParameter(scroller, "scroller");
        Intrinsics.checkNotNullParameter(boundaryView, "boundaryView");
        if (scroller instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) scroller;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null && (iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition()) != -1) {
                if (iFindLastVisibleItemPosition != (recyclerView.getAdapter() != null ? r6.getItemCount() : 0) - 1) {
                    return Float.valueOf(Float.MAX_VALUE);
                }
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindLastVisibleItemPosition);
                if (viewFindViewByPosition != null) {
                    return Float.valueOf(b(viewFindViewByPosition, boundaryView));
                }
            }
        } else if (scroller instanceof NestedScrollView) {
            View childAt3 = ((NestedScrollView) scroller).getChildAt(0);
            ViewGroup viewGroup = childAt3 instanceof ViewGroup ? (ViewGroup) childAt3 : null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount() - 1;
                while (true) {
                    if (-1 >= childCount) {
                        childAt2 = null;
                        break;
                    }
                    childAt2 = viewGroup.getChildAt(childCount);
                    Intrinsics.h(childAt2);
                    if (childAt2.getVisibility() == 0) {
                        break;
                    }
                    childCount--;
                }
                if (childAt2 != null) {
                    return Float.valueOf(b(childAt2, boundaryView));
                }
            }
        } else if ((scroller instanceof ScrollView) && (childAt = ((ScrollView) scroller).getChildAt(0)) != null) {
            return Float.valueOf(b(childAt, boundaryView));
        }
        return null;
    }

    public final float b(View view, View view2) {
        view2.getLocationOnScreen(this.f230517a);
        view.getLocationOnScreen(this.f230518b);
        return (view.getHeight() + r4[1]) - r0[1];
    }
}

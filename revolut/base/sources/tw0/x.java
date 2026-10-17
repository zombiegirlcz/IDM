package tw0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f274891a = new int[2];

    public static final void a(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        js0.f fVarP = jb3.l.p(js0.f.Companion, recyclerView);
        AppBarLayout appBarLayoutA = fVarP != null ? fVarP.a() : null;
        if (appBarLayoutA != null) {
            appBarLayoutA.setExpanded(false, false);
        }
        recyclerView.scrollToPosition(i);
    }

    public static final void b(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        js0.f fVarP = jb3.l.p(js0.f.Companion, recyclerView);
        AppBarLayout appBarLayoutA = fVarP != null ? fVarP.a() : null;
        if (appBarLayoutA != null) {
            appBarLayoutA.setExpanded(false, false);
        }
        recyclerView.smoothScrollToPosition(i);
    }

    public static final void c(FrameLayout frameLayout) {
        js0.f fVarP = jb3.l.p(js0.f.Companion, frameLayout);
        AppBarLayout appBarLayoutA = fVarP != null ? fVarP.a() : null;
        if (appBarLayoutA != null) {
            appBarLayoutA.setExpanded(false, false);
        }
        View childAt = frameLayout.getChildAt(0);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        View childAt2 = viewGroup != null ? viewGroup.getChildAt(viewGroup.getChildCount() - 1) : null;
        if (childAt2 == null) {
            if (frameLayout instanceof NestedScrollView) {
                ((NestedScrollView) frameLayout).fullScroll(130);
                return;
            } else {
                if (frameLayout instanceof ScrollView) {
                    ((ScrollView) frameLayout).fullScroll(130);
                    return;
                }
                return;
            }
        }
        int bottom = childAt2.getBottom();
        ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int paddingBottom = frameLayout.getPaddingBottom() + bottom + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
        if (frameLayout instanceof NestedScrollView) {
            ((NestedScrollView) frameLayout).smoothScrollTo(0, paddingBottom);
        } else if (frameLayout instanceof ScrollView) {
            ((ScrollView) frameLayout).smoothScrollTo(0, paddingBottom);
        }
    }

    public static final void d(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        v vVar = new v();
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        vVar.a(recyclerView, 0);
    }
}

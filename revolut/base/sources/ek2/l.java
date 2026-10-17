package ek2;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.navbar.NavBarScrollingViewBehavior;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements RecyclerView.OnItemTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavBarScrollingViewBehavior f126943a;

    public l(NavBarScrollingViewBehavior navBarScrollingViewBehavior) {
        this.f126943a = navBarScrollingViewBehavior;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean onInterceptTouchEvent(RecyclerView rv4, MotionEvent e) {
        Intrinsics.checkNotNullParameter(rv4, "rv");
        Intrinsics.checkNotNullParameter(e, "e");
        rv4.getParent().requestDisallowInterceptTouchEvent(!pd.b.k(this.f126943a != null ? Boolean.valueOf(r3.d()) : null));
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onTouchEvent(RecyclerView rv4, MotionEvent e) {
        Intrinsics.checkNotNullParameter(rv4, "rv");
        Intrinsics.checkNotNullParameter(e, "e");
    }
}

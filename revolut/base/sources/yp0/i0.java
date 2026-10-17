package yp0;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i0 implements RecyclerView.OnItemTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f315736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f315737b;

    public i0(ViewPager2 viewPager2) {
        this.f315737b = viewPager2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean onInterceptTouchEvent(RecyclerView rv4, MotionEvent e) {
        Intrinsics.checkNotNullParameter(rv4, "rv");
        Intrinsics.checkNotNullParameter(e, "e");
        int actionMasked = e.getActionMasked();
        if (actionMasked == 0) {
            this.f315736a = false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(e);
        ViewPager2 viewPager2 = this.f315737b;
        motionEventObtain.offsetLocation(viewPager2.getX(), viewPager2.getY());
        if (rv4.getScrollState() == 1 || this.f315736a) {
            motionEventObtain.setAction(3);
            this.f315736a = true;
        }
        Object parent = viewPager2.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.onTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        if (actionMasked != 1 && actionMasked != 3) {
            return false;
        }
        this.f315736a = false;
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

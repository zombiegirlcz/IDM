package au0;

import android.view.MotionEvent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.revolut.core.ui_kit.internal.views.navbar.NavBarWithContainerBehaviour;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoordinatorLayout f9337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithContainer f9338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9339c;
    public boolean d;
    public final /* synthetic */ NavBarWithContainerBehaviour e;

    public r3(NavBarWithContainerBehaviour navBarWithContainerBehaviour, CoordinatorLayout parent, NavBarWithContainer child, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        this.e = navBarWithContainerBehaviour;
        this.f9337a = parent;
        this.f9338b = child;
        this.f9339c = i;
        this.d = true;
    }

    public final void a() {
        if (this.d) {
            this.d = false;
            NavBarWithContainerBehaviour navBarWithContainerBehaviour = this.e;
            s3 s3Var = navBarWithContainerBehaviour.f57321j;
            s3 s3Var2 = s3.HEADER_SCROLLING;
            NavBarWithContainer navBarWithContainer = this.f9338b;
            if (s3Var == s3Var2) {
                MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, navBarWithContainerBehaviour.o, navBarWithContainerBehaviour.f57325p, 0);
                try {
                    CoordinatorLayout coordinatorLayout = this.f9337a;
                    Intrinsics.h(motionEventObtain);
                    NavBarWithContainerBehaviour.e(navBarWithContainerBehaviour, coordinatorLayout, navBarWithContainer, motionEventObtain);
                } finally {
                    motionEventObtain.recycle();
                }
            }
            navBarWithContainer.removeCallbacks(this);
            OverScroller overScroller = navBarWithContainerBehaviour.f57322l;
            if (overScroller != null) {
                overScroller.abortAnimation();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        NavBarWithContainerBehaviour navBarWithContainerBehaviour = this.e;
        OverScroller overScroller = navBarWithContainerBehaviour.f57322l;
        if (!this.d || overScroller == null) {
            return;
        }
        boolean zComputeScrollOffset = overScroller.computeScrollOffset();
        NavBarWithContainer navBarWithContainer = this.f9338b;
        if (!zComputeScrollOffset) {
            a();
            navBarWithContainerBehaviour.l(navBarWithContainer);
            return;
        }
        int currY = overScroller.getCurrY();
        int i = currY - this.f9339c;
        this.f9339c = currY;
        float f = i;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 2, navBarWithContainerBehaviour.o, navBarWithContainerBehaviour.f57325p + f, 0);
        try {
            int i2 = q3.f9326a[navBarWithContainerBehaviour.f57321j.ordinal()];
            CoordinatorLayout coordinatorLayout = this.f9337a;
            if (i2 == 1) {
                Intrinsics.h(motionEventObtain);
                navBarWithContainerBehaviour.i(coordinatorLayout, navBarWithContainer, motionEventObtain);
            } else if (i2 != 2) {
                motionEventObtain.recycle();
                return;
            } else {
                Intrinsics.h(motionEventObtain);
                navBarWithContainerBehaviour.j(coordinatorLayout, navBarWithContainer, motionEventObtain);
            }
            motionEventObtain.recycle();
            navBarWithContainerBehaviour.f57325p += f;
            navBarWithContainer.postOnAnimation(this);
        } catch (Throwable th10) {
            motionEventObtain.recycle();
            throw th10;
        }
    }
}

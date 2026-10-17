package jji;

import android.view.View;
import android.view.ViewGroup;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f174986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f174987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FloatingBottomBarView f174988c;

    public u(ViewController controller) {
        n navigationPanelHostFinder = new n();
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(navigationPanelHostFinder, "navigationPanelHostFinder");
        this.f174986a = controller;
    }

    public final View a() {
        return ((h) this.f174986a).v();
    }

    public final void b() {
        View childAt;
        if (this.f174987b == null && this.f174988c == null) {
            ViewController descendant = this.f174986a;
            Intrinsics.checkNotNullParameter(descendant, "descendant");
            com.revolut.kompot.navigable.a aVar = descendant;
            while (true) {
                if (aVar == null) {
                    aVar = null;
                    break;
                } else if (aVar instanceof m) {
                    break;
                } else {
                    aVar = aVar.f98405m;
                }
            }
            if (aVar == null) {
                return;
            }
            View viewD2 = aVar.D2();
            ViewGroup viewGroup = viewD2 instanceof ViewGroup ? (ViewGroup) viewD2 : null;
            if (viewGroup == null) {
                return;
            }
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = viewGroup.getChildAt(i);
                Intrinsics.h(childAt);
                if (childAt instanceof wx0.b) {
                    break;
                } else {
                    i++;
                }
            }
            this.f174987b = viewGroup;
            this.f174988c = childAt instanceof FloatingBottomBarView ? (FloatingBottomBarView) childAt : null;
            descendant.D2().addOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v.removeOnAttachStateChangeListener(this);
        this.f174987b = null;
        this.f174988c = null;
    }
}

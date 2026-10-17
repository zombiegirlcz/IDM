package xu0;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import b9.u;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import kotlin.jvm.internal.Intrinsics;
import vu0.o;
import vu0.r;
import vu0.t;
import zhm.d0;
import zu0.i;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends ViewDragHelper.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwipeToActionLayout f308854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zu0.e f308855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yu0.c f308856c;
    public final g d;
    public final c e;
    public final u f;

    public b(SwipeToActionLayout layout, zu0.e layoutController, yu0.c itemController, g touchController, c dragHelperProvider) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(layoutController, "layoutController");
        Intrinsics.checkNotNullParameter(itemController, "itemController");
        Intrinsics.checkNotNullParameter(touchController, "touchController");
        Intrinsics.checkNotNullParameter(dragHelperProvider, "dragHelperProvider");
        this.f308854a = layout;
        this.f308855b = layoutController;
        this.f308856c = itemController;
        this.d = touchController;
        this.e = dragHelperProvider;
        u uVar = new u();
        uVar.f13478c = this;
        this.f = uVar;
    }

    public final void a(r direction) {
        o oVar;
        View view;
        SwipeToActionLayout swipeToActionLayout = this.f308854a;
        int i = a.f308853b[swipeToActionLayout.getDragDirection().ordinal()];
        yu0.c cVar = this.f308856c;
        if (i == 1) {
            oVar = (o) d0.o0(cVar.f316857g);
        } else if (i != 2) {
            return;
        } else {
            oVar = (o) d0.d0(cVar.e);
        }
        Object tag2 = (oVar == null || (view = oVar.getView()) == null) ? null : view.getTag(R$id.internal_swipe_action_tag);
        SwipeToActionDelegate.SwipeAction swipeAction = tag2 instanceof SwipeToActionDelegate.SwipeAction ? (SwipeToActionDelegate.SwipeAction) tag2 : null;
        if (oVar == null || swipeAction == null) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            swipeToActionLayout.f57621n.e(true, direction);
            return;
        }
        this.f308855b.f325196b.j();
        vf.c action = new vf.c(this, 5, oVar, swipeAction);
        Context context = swipeToActionLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        long jB = (long) (jq0.a.b(context) * 200);
        g gVar = this.d;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        gVar.f = true;
        gVar.f308865g = action;
        if (jB == 0) {
            action.run();
        } else {
            gVar.d.postDelayed(action, jB);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0123  */
    @Override // androidx.customview.widget.ViewDragHelper.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int clampViewPositionHorizontal(android.view.View r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xu0.b.clampViewPositionHorizontal(android.view.View, int, int):int");
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onEdgeDragStarted(int i, int i2) {
        super.onEdgeDragStarted(i, i2);
        if (this.d.e) {
            return;
        }
        View view = this.f308854a.getMainView();
        Intrinsics.checkNotNullParameter(view, "view");
        this.e.f308858b.f308870n.captureChildView(view, i2);
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewDragStateChanged(int i) {
        super.onViewDragStateChanged(i);
        if (i == 0) {
            SwipeToActionLayout swipeToActionLayout = this.f308854a;
            swipeToActionLayout.setState$ui_kit_components_release(swipeToActionLayout.getMainView().getLeft() == this.f308855b.f325197c.left ? vu0.u.CLOSE : vu0.u.OPEN);
        }
    }

    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final void onViewPositionChanged(View changedView, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        this.f308856c.b();
        super.onViewPositionChanged(changedView, i, i2, i3, i5);
        zu0.e eVar = this.f308855b;
        boolean zA = eVar.a();
        i iVar = eVar.f325196b;
        Rect rect = eVar.f325197c;
        SwipeToActionLayout swipeToActionLayout = this.f308854a;
        if (!swipeToActionLayout.getOnSwipeListeners$ui_kit_components_release().isEmpty() && zA) {
            for (t tVar : swipeToActionLayout.getOnSwipeListeners$ui_kit_components_release()) {
                if (swipeToActionLayout.getMainView().getLeft() == rect.left) {
                    tVar.a(swipeToActionLayout);
                } else {
                    if (swipeToActionLayout.getMainView().getLeft() == iVar.g() + rect.left || swipeToActionLayout.getMainView().getRight() == rect.right - iVar.g()) {
                        tVar.b(swipeToActionLayout);
                    } else {
                        vu0.u state = swipeToActionLayout.getState();
                        int i6 = a.f308852a[this.d.i.ordinal()];
                        if (i6 == 1) {
                            swipeToActionLayout.getMainView().getLeft();
                            int i21 = rect.left;
                        } else if (i6 == 2) {
                            int i22 = rect.right;
                            swipeToActionLayout.getMainView().getLeft();
                        }
                        tVar.c(swipeToActionLayout, state);
                    }
                }
            }
        }
        eVar.d = eVar.f325195a.getMainView().getLeft();
        ViewCompat.postInvalidateOnAnimation(swipeToActionLayout);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    @Override // androidx.customview.widget.ViewDragHelper.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewReleased(android.view.View r13, float r14, float r15) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xu0.b.onViewReleased(android.view.View, float, float):void");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.customview.widget.ViewDragHelper.Callback
    public final boolean tryCaptureView(View child, int i) {
        Intrinsics.checkNotNullParameter(child, "child");
        g gVar = this.d;
        if (gVar.e || gVar.f || (((Boolean) jo0.g.O.getValue()).booleanValue() && gVar.f308871p.k != vu0.b.CLAIMED)) {
            return false;
        }
        SwipeToActionLayout swipeToActionLayout = this.f308854a;
        swipeToActionLayout.getDemoController().a();
        View view = swipeToActionLayout.getMainView();
        Intrinsics.checkNotNullParameter(view, "view");
        this.e.f308858b.f308870n.captureChildView(view, i);
        return false;
    }
}

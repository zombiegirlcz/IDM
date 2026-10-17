package com.revolut.core.ui_kit.internal.views.navbar;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.collection.MutableIntSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.j;
import au0.k;
import au0.l;
import au0.o;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayoutProxy;
import java.lang.ref.WeakReference;
import jq0.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"com/revolut/core/ui_kit/internal/views/navbar/CollapsingAppBarLayout$Behavior", "Lcom/google/android/material/appbar/AppBarLayoutProxy$Behavior;", "<init>", "()V", "au0/k", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CollapsingAppBarLayout$Behavior extends AppBarLayoutProxy.Behavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f57238a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f57240c;
    public final k e;
    public a4.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ValueAnimator f57241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MutableIntSet f57242h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f57239b = true;
    public final a d = new a();

    public static final class a extends AppBarLayout.Behavior.DragCallback {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback
        public final boolean canDrag(AppBarLayout appBarLayout) {
            Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
            return false;
        }
    }

    public CollapsingAppBarLayout$Behavior() {
        k kVar = new k(this);
        this.e = kVar;
        this.f57242h = new MutableIntSet(0, 1, null);
        setDragCallback(kVar);
    }

    public final void a(AppBarLayout appBarLayout) {
        a4.a aVar = this.f;
        if (aVar != null) {
            appBarLayout.removeCallbacks(aVar);
        }
        this.f = null;
        ValueAnimator valueAnimator = this.f57241g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f57241g = null;
    }

    public final void b(View view) {
        o oVar;
        WeakReference weakReference = this.f57240c;
        if (Intrinsics.f(weakReference != null ? (View) weakReference.get() : null, view)) {
            return;
        }
        this.f57240c = new WeakReference(view);
        WeakReference weakReference2 = this.f57238a;
        if (weakReference2 == null || (oVar = (o) weakReference2.get()) == null) {
            return;
        }
        l lVar = o.Companion;
        oVar.p(view);
    }

    public final void c(o oVar, int i) {
        int lastOffset = oVar.getLastOffset();
        if (lastOffset == i) {
            return;
        }
        a(oVar);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(lastOffset, i);
        valueAnimatorOfInt.setDuration(120L);
        valueAnimatorOfInt.setInterpolator(r.f177392a);
        this.f57241g = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new j(oVar, this, 2));
        valueAnimatorOfInt.start();
    }

    public final void d(float f) {
        o oVar;
        WeakReference weakReference = this.f57238a;
        if (weakReference == null || (oVar = (o) weakReference.get()) == null) {
            return;
        }
        c(oVar, (int) ((1.0f - f) * (-(oVar.getMaxCollapseOffset$ui_kit_components_release() == Integer.MAX_VALUE ? oVar.getTotalScrollRange() : Math.min(oVar.getTotalScrollRange(), oVar.getMaxCollapseOffset$ui_kit_components_release())))));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onNestedFling(CoordinatorLayout coordinatorLayout, View view, View target, float f, float f4, boolean z) {
        AppBarLayout child = (AppBarLayout) view;
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        a(child);
        return super.onNestedFling(coordinatorLayout, child, target, f, f4, z);
    }

    @Override // com.google.android.material.appbar.AppBarLayoutProxy.Behavior, com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.HeaderBehavior
    public final void onFlingFinished(CoordinatorLayout parent, AppBarLayout layout) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(layout, "layout");
        super.onFlingFinished(parent, layout);
        o oVar = (o) layout;
        if (!this.f57242h.isNotEmpty() && this.f == null) {
            a4.a aVar = new a4.a(this, oVar, 9);
            this.f = aVar;
            oVar.post(aVar);
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout parent, AppBarLayout abl2, int i) {
        View view;
        View view2;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(abl2, "abl");
        boolean zOnLayoutChild = super.onLayoutChild(parent, abl2, i);
        if (!(abl2 instanceof o)) {
            abl2 = null;
        }
        o oVar = (o) abl2;
        if (oVar != null) {
            WeakReference weakReference = this.f57238a;
            if (!Intrinsics.f(weakReference != null ? (o) weakReference.get() : null, oVar)) {
                this.f57238a = new WeakReference(oVar);
                WeakReference weakReference2 = this.f57240c;
                if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null) {
                    l lVar = o.Companion;
                    oVar.p(view2);
                }
            }
        }
        WeakReference weakReference3 = this.f57240c;
        if (weakReference3 != null && (view = (View) weakReference3.get()) != null && view.isShown()) {
            return zOnLayoutChild;
        }
        this.f57240c = null;
        return zOnLayoutChild;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout child, View target, int i, int i2, int[] consumed, int i3) {
        o oVar;
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        b(target);
        if (this.f57239b) {
            WeakReference weakReference = this.f57238a;
            int maxCollapseOffset$ui_kit_components_release = (weakReference == null || (oVar = (o) weakReference.get()) == null) ? Integer.MAX_VALUE : oVar.getMaxCollapseOffset$ui_kit_components_release();
            if (maxCollapseOffset$ui_kit_components_release == Integer.MAX_VALUE || i2 <= 0) {
                super.onNestedPreScroll(coordinatorLayout, child, target, i, i2, consumed, i3);
            } else {
                super.onNestedPreScroll(coordinatorLayout, child, target, i, Math.min(i2, Math.max(0, getTopAndBottomOffset() + maxCollapseOffset$ui_kit_components_release)), consumed, i3);
            }
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onStartNestedScroll(CoordinatorLayout parent, AppBarLayout child, View directTargetChild, View target, int i, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(directTargetChild, "directTargetChild");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f57242h.add(i2);
        a(child);
        b(target);
        if (!this.f57239b) {
            return false;
        }
        boolean zIsLiftOnScroll = child.isLiftOnScroll();
        child.setLiftOnScroll(true);
        boolean zOnStartNestedScroll = super.onStartNestedScroll(parent, child, directTargetChild, target, i, i2);
        child.setLiftOnScroll(zIsLiftOnScroll);
        return zOnStartNestedScroll;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout abl2, View target, int i) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(abl2, "abl");
        Intrinsics.checkNotNullParameter(target, "target");
        MutableIntSet mutableIntSet = this.f57242h;
        mutableIntSet.remove(i);
        super.onStopNestedScroll(coordinatorLayout, abl2, target, i);
        o oVar = (o) abl2;
        if (!mutableIntSet.isNotEmpty() && this.f == null) {
            a4.a aVar = new a4.a(this, oVar, 9);
            this.f = aVar;
            oVar.post(aVar);
        }
    }
}

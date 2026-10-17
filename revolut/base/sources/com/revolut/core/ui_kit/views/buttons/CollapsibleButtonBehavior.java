package com.revolut.core.ui_kit.views.buttons;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import jo0.g;
import knm.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import mx0.tb;
import ox0.i;
import ox0.n;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u000b\fB!\b\u0007\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/revolut/core/ui_kit/views/buttons/CollapsibleButtonBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Landroid/view/View;", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "a", "ox0/i", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CollapsibleButtonBehavior extends CoordinatorLayout.Behavior<View> implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f58973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f58974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f58975c;
    public CoordinatorLayout d;
    public n e;
    public final tb f;

    public CollapsibleButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new tb("COLLAPSIBLE_PADDING_REQUEST_TOKEN");
    }

    public final void a(CoordinatorLayout coordinatorLayout) {
        n nVar;
        View view;
        tb tbVar;
        int height;
        View view2 = this.f58974b;
        if (!(view2 instanceof i)) {
            view2 = null;
        }
        if ((view2 == null && (view2 = this.f58975c) == null) || (nVar = this.e) == null || (view = nVar.f230490b) == null) {
            return;
        }
        View view3 = view2;
        do {
            int visibility = view3.getVisibility();
            tbVar = this.f;
            height = 0;
            if (visibility != 0) {
                break;
            }
            Object parent = view3.getParent();
            view3 = parent instanceof View ? (View) parent : null;
            if (view3 == null) {
                break;
            }
        } while (view3 != coordinatorLayout);
        int iG = b.g(coordinatorLayout, view2, false);
        int iB = tbVar.b();
        if (((view.getHeight() + b.g(coordinatorLayout, view, false)) - iB) - iG > 0) {
            height = ((coordinatorLayout.getHeight() - coordinatorLayout.getPaddingBottom()) - iG) - iB;
        }
        tbVar.d(height);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0090 A[PHI: r5
      0x0090: PHI (r5v2 android.view.View) = (r5v1 android.view.View), (r5v8 android.view.View), (r5v11 android.view.View), (r5v14 android.view.View) binds: [B:28:0x005b, B:33:0x0066, B:39:0x0072, B:48:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean layoutDependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, android.view.View r7) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "dependency"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = r7 instanceof com.google.android.material.appbar.AppBarLayout
            r1 = 0
            if (r0 == 0) goto L15
            return r1
        L15:
            boolean r0 = r6 instanceof vy0.a
            r2 = 0
            if (r0 == 0) goto L1c
            r0 = r6
            goto L33
        L1c:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L24
            r0 = r6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L25
        L24:
            r0 = r2
        L25:
            if (r0 == 0) goto L32
            java.lang.Class<vy0.a> r3 = vy0.a.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}
            android.view.View r0 = kotlin.jvm.internal.s.i(r0, r3, r2)
            goto L33
        L32:
            r0 = r2
        L33:
            r4.f58975c = r0
            android.view.View r0 = r4.f58974b
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r6)
            if (r0 != 0) goto L59
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r4.d
            if (r0 == 0) goto L44
            r0.removeOnLayoutChangeListener(r4)
        L44:
            android.view.View r0 = r4.f58975c
            if (r0 != 0) goto L52
            boolean r0 = r6 instanceof ox0.i
            if (r0 == 0) goto L4d
            goto L52
        L4d:
            r4.f58974b = r2
            r4.d = r2
            goto L59
        L52:
            r4.f58974b = r6
            r4.d = r5
            r5.addOnLayoutChangeListener(r4)
        L59:
            android.view.View r5 = r4.f58973a
            if (r5 != 0) goto L90
            boolean r5 = r7 instanceof androidx.recyclerview.widget.RecyclerView
            if (r5 == 0) goto L65
            r5 = r7
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            goto L66
        L65:
            r5 = r2
        L66:
            if (r5 == 0) goto L69
            goto L90
        L69:
            boolean r5 = r7 instanceof androidx.core.widget.NestedScrollView
            if (r5 == 0) goto L71
            r5 = r7
            androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
            goto L72
        L71:
            r5 = r2
        L72:
            if (r5 == 0) goto L75
            goto L90
        L75:
            boolean r5 = r7 instanceof android.view.ViewGroup
            if (r5 == 0) goto L7c
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L7d
        L7c:
            r7 = r2
        L7d:
            if (r7 == 0) goto L8c
            java.lang.Class<androidx.core.widget.NestedScrollView> r5 = androidx.core.widget.NestedScrollView.class
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r6 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5, r6}
            android.view.View r5 = kotlin.jvm.internal.s.i(r7, r5, r2)
            goto L8d
        L8c:
            r5 = r2
        L8d:
            if (r5 != 0) goto L90
            goto Lc5
        L90:
            ox0.n r6 = r4.e
            if (r6 == 0) goto L97
            android.view.View r7 = r6.f230490b
            goto L98
        L97:
            r7 = r2
        L98:
            if (r5 == r7) goto Lbf
            if (r6 == 0) goto L9f
            r6.a()
        L9f:
            mx0.tb r6 = r4.f
            r6.a(r5)
            android.view.View r6 = r4.f58975c
            if (r6 == 0) goto Lad
            ox0.n r2 = new ox0.n
            r2.<init>(r6, r5)
        Lad:
            r4.e = r2
            if (r2 == 0) goto Lb4
            r2.c(r1)
        Lb4:
            android.view.View r5 = r4.f58975c
            if (r5 == 0) goto Lbf
            ox0.n r6 = r4.e
            if (r6 == 0) goto Lbf
            r6.d(r5)
        Lbf:
            ox0.n r5 = r4.e
            if (r5 == 0) goto Lc5
            r5 = 1
            return r5
        Lc5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.buttons.CollapsibleButtonBehavior.layoutDependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof CoordinatorLayout) {
            a((CoordinatorLayout) view);
            n nVar = this.e;
            if (nVar != null) {
                nVar.e();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout parent, View child, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        CoordinatorLayout coordinatorLayout = parent != null ? parent : null;
        this.f58973a = coordinatorLayout != null ? s.i(coordinatorLayout, new Class[]{NestedScrollView.class, RecyclerView.class}, "MAIN_SCROLLABLE_TAG") : null;
        return super.onLayoutChild(parent, child, i);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View child, View target, int i, int i2, int i3, int i5, int i6, int[] consumed) {
        n nVar;
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        a(coordinatorLayout);
        if (((Boolean) g.Q.getValue()).booleanValue() || (nVar = this.e) == null) {
            return;
        }
        nVar.e();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View child, View directTargetChild, View target, int i, int i2) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(directTargetChild, "directTargetChild");
        Intrinsics.checkNotNullParameter(target, "target");
        return true;
    }

    public CollapsibleButtonBehavior() {
        this(null, null);
    }
}

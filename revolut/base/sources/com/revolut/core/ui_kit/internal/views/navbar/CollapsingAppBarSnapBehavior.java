package com.revolut.core.ui_kit.internal.views.navbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import au0.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/navbar/CollapsingAppBarSnapBehavior;", "Lcom/revolut/core/ui_kit/internal/views/navbar/CollapsingAppBarLayout$Behavior;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CollapsingAppBarSnapBehavior extends CollapsingAppBarLayout$Behavior {
    public float i;

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View target, float f, float f4) {
        AppBarLayout child = (AppBarLayout) view;
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        this.i = f4;
        return super.onNestedPreFling(coordinatorLayout, child, target, f, f4);
    }

    @Override // com.revolut.core.ui_kit.internal.views.navbar.CollapsingAppBarLayout$Behavior, com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout child, View target, int i, int i2, int[] consumed, int i3) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (i2 != 0) {
            this.i = i2;
        }
        super.onNestedPreScroll(coordinatorLayout, child, target, i, i2, consumed, i3);
    }

    @Override // com.revolut.core.ui_kit.internal.views.navbar.CollapsingAppBarLayout$Behavior, com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout abl2, View target, int i) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(abl2, "abl");
        Intrinsics.checkNotNullParameter(target, "target");
        o oVar = abl2 instanceof o ? (o) abl2 : null;
        if (oVar != null && oVar.getExpandRatio() > BitmapDescriptorFactory.HUE_RED && oVar.getExpandRatio() < 1.0f) {
            abl2.setExpanded(this.i < BitmapDescriptorFactory.HUE_RED, true);
        }
        super.onStopNestedScroll(coordinatorLayout, abl2, target, i);
    }
}

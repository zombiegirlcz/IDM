package com.revolut.uicomponent.toolbar.app_bar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewGroupKt;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nkm.t;
import nkm.u;
import nkm.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J \u0010\u0014\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/revolut/uicomponent/toolbar/app_bar/ToolbarShadowAddBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "toolbarShadow", "Lcom/revolut/uicomponent/toolbar/app_bar/ToolbarShadow;", "shadowInitialized", "", "layoutDependsOn", "parent", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "child", "Lcom/google/android/material/appbar/AppBarLayout;", "dependency", "Landroid/view/View;", "findFirstDependency", "onLayoutChild", "layoutDirection", "", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ToolbarShadowAddBehavior extends AppBarLayout.Behavior {
    private boolean shadowInitialized;
    private ToolbarShadow toolbarShadow;

    /* JADX WARN: Multi-variable type inference failed */
    public ToolbarShadowAddBehavior() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final ToolbarShadow findFirstDependency(CoordinatorLayout parent) {
        return this.shadowInitialized ? this.toolbarShadow : (ToolbarShadow) y.r(u.i(t.c(ViewGroupKt.iterator(parent)), ToolbarShadow.class));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ToolbarShadowAddBehavior(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(@NotNull CoordinatorLayout parent, @NotNull AppBarLayout child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        return dependency instanceof RevolutAppBarLayout;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NotNull CoordinatorLayout parent, @NotNull AppBarLayout child, int layoutDirection) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (findFirstDependency(parent) == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ToolbarShadow toolbarShadow = new ToolbarShadow(context, null, 2, null);
            parent.addView(toolbarShadow);
            ToolbarShadowBehavior shadowBehaviour = toolbarShadow.getShadowBehaviour();
            ViewGroup.LayoutParams layoutParams = toolbarShadow.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = -1;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
            layoutParams2.setBehavior(shadowBehaviour);
            toolbarShadow.setLayoutParams(layoutParams2);
            this.shadowInitialized = true;
            this.toolbarShadow = toolbarShadow;
        }
        return super.onLayoutChild(parent, child, layoutDirection);
    }

    public ToolbarShadowAddBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public /* synthetic */ ToolbarShadowAddBehavior(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : context, (i & 2) != 0 ? null : attributeSet);
    }
}

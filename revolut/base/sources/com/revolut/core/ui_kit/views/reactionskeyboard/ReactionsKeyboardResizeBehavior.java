package com.revolut.core.ui_kit.views.reactionskeyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import ts0.t;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/views/reactionskeyboard/ReactionsKeyboardResizeBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReactionsKeyboardResizeBehavior extends CoordinatorLayout.Behavior<View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f59618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f59619b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionsKeyboardResizeBehavior(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.f59619b = w.y0(new t(context, 5));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        if (!(dependency instanceof ReactionsKeyboardView)) {
            return super.onDependentViewChanged(parent, child, dependency);
        }
        Integer num = this.f59618a;
        ReactionsKeyboardView reactionsKeyboardView = (ReactionsKeyboardView) dependency;
        int visibility = reactionsKeyboardView.getVisibility();
        if (num != null && num.intValue() == visibility) {
            return false;
        }
        this.f59618a = Integer.valueOf(reactionsKeyboardView.getVisibility());
        if (dependency.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = child.getHeight() - ((Number) this.f59619b.getValue()).intValue();
            child.setLayoutParams(layoutParams2);
            return true;
        }
        ViewGroup.LayoutParams layoutParams3 = child.getLayoutParams();
        Intrinsics.i(layoutParams3, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.LayoutParams layoutParams4 = (CoordinatorLayout.LayoutParams) layoutParams3;
        ((ViewGroup.MarginLayoutParams) layoutParams4).height = -1;
        child.setLayoutParams(layoutParams4);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onDependentViewRemoved(CoordinatorLayout parent, View child, View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        super.onDependentViewRemoved(parent, child, dependency);
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = -1;
        child.setLayoutParams(layoutParams2);
    }
}

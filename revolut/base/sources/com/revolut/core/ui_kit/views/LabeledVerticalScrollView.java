package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import ix0.c2;
import ix0.w0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.t8;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003 !\"B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lcom/revolut/core/ui_kit/views/LabeledVerticalScrollView;", "Landroid/widget/FrameLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$AttachedBehavior;", "Lix0/w0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "getBehavior", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "", "Lcom/revolut/core/ui_kit/models/Clause;", "labels", "", "setLabels", "(Ljava/util/List;)V", "", "getListItemsCount$ui_kit_components_release", "()I", "getListItemsCount", "getScrollerSizePx$ui_kit_components_release", "getScrollerSizePx", "getSearchTrackSizePx$ui_kit_components_release", "getSearchTrackSizePx", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "layoutManager", "Companion", "b", "mx0/t8", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LabeledVerticalScrollView extends FrameLayout implements CoordinatorLayout.AttachedBehavior, w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f58711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f58712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t8 f58713c;
    public RecyclerView d;

    public static final class b extends CoordinatorLayout.Behavior {
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(child, "child");
            Intrinsics.checkNotNullParameter(dependency, "dependency");
            return dependency instanceof au0.o;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(child, "child");
            Intrinsics.checkNotNullParameter(dependency, "dependency");
            ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
            CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return true;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = parent.getMeasuredHeight() - dependency.getMeasuredHeight();
            layoutParams2.gravity |= 80;
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onDependentViewRemoved(CoordinatorLayout parent, View child, View dependency) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(child, "child");
            Intrinsics.checkNotNullParameter(dependency, "dependency");
            ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
            CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                CoordinatorLayout.LayoutParams layoutParams3 = dependency.getVisibility() == 0 ? null : layoutParams2;
                if (layoutParams3 != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams3).height = -1;
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabeledVerticalScrollView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final RecyclerView.LayoutManager getLayoutManager() {
        RecyclerView.LayoutManager layoutManager;
        RecyclerView recyclerView = this.d;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            return layoutManager;
        }
        throw new IllegalStateException("Recycler '" + this.d + "' has no layout manager yet");
    }

    public final void a(int i) {
        getLayoutManager().scrollToPosition(i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NotNull
    /* JADX INFO: renamed from: getBehavior */
    public CoordinatorLayout.Behavior<?> getShadowBehaviour() {
        return new b();
    }

    @Override // ix0.w0, ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable();
    }

    public final int getListItemsCount$ui_kit_components_release() {
        return getLayoutManager().getItemCount();
    }

    public final int getScrollerSizePx$ui_kit_components_release() {
        return getMeasuredHeight();
    }

    public final int getSearchTrackSizePx$ui_kit_components_release() {
        return this.f58712b.getMeasuredHeight();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(this.f58711a.a(insets));
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    public final void setLabels(@NotNull List<? extends Clause> labels) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        t8 t8Var = this.f58713c;
        ArrayList arrayList = new ArrayList(labels);
        t8Var.getClass();
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        t8Var.f210018b = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabeledVerticalScrollView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58711a = new c2(this);
        t8 t8Var = new t8(this);
        this.f58713c = t8Var;
        View viewFindViewById = View.inflate(context, R$layout.internal_labeled_scroller_view, this).findViewById(R$id.textView_track);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f58712b = (TextView) viewFindViewById;
        setOnTouchListener(t8Var);
    }
}

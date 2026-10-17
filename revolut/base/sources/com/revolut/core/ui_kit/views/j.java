package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.core.ui_kit.internal.dialogs.MiddleStateBottomSheetBehavior;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.p5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public class j extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomExpandableDialogView f59131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MiddleStateBottomSheetBehavior f59132b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setupRecyclerView$default(j jVar, RecyclerView.ItemAnimator itemAnimator, Function0 function0, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupRecyclerView");
        }
        if ((i & 1) != 0) {
            itemAnimator = new DefaultItemAnimator();
        }
        jVar.setupRecyclerView(itemAnimator, function0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        BottomExpandableDialogView bottomExpandableDialogView = this.f59131a;
        bottomExpandableDialogView.setCloseAutomaticallyByChevron(false);
        bottomExpandableDialogView.setHideable(false);
        bottomExpandableDialogView.r0(cr0.h.ANCHORED, false);
    }

    public final void setAnchoredState() {
        this.f59131a.r0(cr0.h.ANCHORED, false);
    }

    public final void setAnchoredStateOffset(int i) {
        this.f59131a.setAnchoredStateOffset(i);
    }

    public final void setDisableExpandingForShortContent(boolean z) {
        this.f59131a.setDisableExpandingForShortContent(z);
    }

    public final void setExpandedStateOffset(int i) {
        this.f59131a.setExpandedStateOffset(i);
    }

    public final void setHasCollapsedState(boolean z) {
        this.f59131a.setHasCollapsedState(z);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalStateException("BottomExpandableDialogView must be a direct child of Coordinator layout");
        }
        CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
        CoordinatorLayout.Behavior behavior = layoutParams2.getBehavior();
        MiddleStateBottomSheetBehavior middleStateBottomSheetBehavior = this.f59132b;
        if (behavior != null && !Intrinsics.f(layoutParams2.getBehavior(), middleStateBottomSheetBehavior)) {
            throw new IllegalStateException("BottomExpandableDialogView has behavior inside, you don't have to set it explicitly");
        }
        layoutParams2.setBehavior(middleStateBottomSheetBehavior);
        super.setLayoutParams(layoutParams);
    }

    public final void setOnOffsetChangeListener(@NotNull Function1<? super Float, Unit> offsetChangeListener) {
        Intrinsics.checkNotNullParameter(offsetChangeListener, "offsetChangeListener");
        this.f59131a.setOnOffsetChangeListener(offsetChangeListener);
    }

    public final void setRecyclerBottomPadding(int i) {
        this.f59131a.setRecyclerBottomPadding(i);
    }

    public final void setupAnchorParameters(@NotNull p5 anchorParameters) {
        Intrinsics.checkNotNullParameter(anchorParameters, "anchorParameters");
        this.f59131a.setupDialog(new BottomExpandableDialogView.b.a(R$attr.uikit_windowBackground, anchorParameters, 4));
    }

    public final void setupRecyclerView(RecyclerView.ItemAnimator itemAnimator, @NotNull Function0<? extends List<? extends koi.k>> delegatesProvider) {
        Intrinsics.checkNotNullParameter(delegatesProvider, "delegatesProvider");
        this.f59131a.setupRecyclerView((List<? extends koi.k>) delegatesProvider.invoke(), itemAnimator);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        BottomExpandableDialogView bottomExpandableDialogView = new BottomExpandableDialogView(context, null, 6, 0);
        this.f59131a = bottomExpandableDialogView;
        MiddleStateBottomSheetBehavior<?> middleStateBottomSheetBehavior = new MiddleStateBottomSheetBehavior<>(context, attributeSet);
        this.f59132b = middleStateBottomSheetBehavior;
        bottomExpandableDialogView.setCustomBehavior$ui_kit_components_release(middleStateBottomSheetBehavior);
        bottomExpandableDialogView.setNeedDrawToolbarShadow(false);
        bottomExpandableDialogView.setDisableExpandingForShortContent(true);
        bottomExpandableDialogView.setSupportBackButtonHideDialog(false);
        bottomExpandableDialogView.setHideAnchorInExpandedState(true);
        addView(bottomExpandableDialogView);
    }

    public /* synthetic */ j(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}

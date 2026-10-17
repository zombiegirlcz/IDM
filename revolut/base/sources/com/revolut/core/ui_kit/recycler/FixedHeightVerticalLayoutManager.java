package com.revolut.core.ui_kit.recycler;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/recycler/FixedHeightVerticalLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FixedHeightVerticalLayoutManager extends RecyclerView.LayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58167a;

    public FixedHeightVerticalLayoutManager(int i) {
        this.f58167a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* JADX INFO: renamed from: canScrollHorizontally */
    public final boolean getF53278a() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            return;
        }
        detachAndScrapAttachedViews(recycler);
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int itemCount = state.getItemCount();
        int i = paddingTop;
        int i2 = 0;
        while (i2 < itemCount) {
            View viewForPosition = recycler.getViewForPosition(i2);
            Intrinsics.checkNotNullExpressionValue(viewForPosition, "getViewForPosition(...)");
            int minimumHeight = viewForPosition.getMinimumHeight();
            int i3 = this.f58167a;
            if (minimumHeight <= i3) {
                minimumHeight = i3;
            }
            ViewGroup.LayoutParams layoutParams = viewForPosition.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).height = minimumHeight;
            if (minimumHeight + i > height) {
                recycler.recycleView(viewForPosition);
                return;
            }
            addView(viewForPosition);
            measureChildWithMargins(viewForPosition, 0, 0);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewForPosition) + i;
            layoutDecoratedWithMargins(viewForPosition, paddingLeft, i, width, decoratedMeasuredHeight);
            i2++;
            i = decoratedMeasuredHeight;
        }
    }
}

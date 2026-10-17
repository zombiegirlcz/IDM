package com.revolut.core.ui_kit.recycler;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/recycler/CenterScrollableLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CenterScrollableLinearLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f58166a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenterScrollableLinearLayoutManager(Context context) {
        super(context, 0, false);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void measureChildWithMargins(View child, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        super.measureChildWithMargins(child, i, i2);
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        if (!(layoutParams instanceof RecyclerView.LayoutParams) || ((RecyclerView.LayoutParams) layoutParams).getAbsoluteAdapterPosition() == 0) {
            int width = (getWidth() - getDecoratedMeasuredWidth(child)) / 2;
            RecyclerView recyclerView = this.f58166a;
            if (recyclerView != null) {
                recyclerView.setPadding(width, recyclerView.getPaddingTop(), width, recyclerView.getPaddingBottom());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAttachedToWindow(view);
        this.f58166a = view;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView view, RecyclerView.Recycler recycler) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        this.f58166a = null;
        super.onDetachedFromWindow(view, recycler);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        if (getChildCount() == 0 && state.getItemCount() > 0) {
            View viewForPosition = recycler.getViewForPosition(0);
            Intrinsics.checkNotNullExpressionValue(viewForPosition, "getViewForPosition(...)");
            measureChildWithMargins(viewForPosition, 0, 0);
            recycler.recycleView(viewForPosition);
        }
        super.onLayoutChildren(recycler, state);
    }
}

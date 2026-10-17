package com.revolut.core.ui_kit.recycler;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/recycler/CenteredHorizontalLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CenteredHorizontalLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onLayoutChildren(recycler, state);
        if (state.getItemCount() == 0 || state.isPreLayout() || getChildCount() == 0) {
            return;
        }
        int childCount = getChildCount();
        int i = 0;
        int decoratedMeasuredWidth = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null) {
                decoratedMeasuredWidth += getDecoratedMeasuredWidth(childAt);
            }
        }
        boolean z = findFirstVisibleItemPosition() == 0 && findLastVisibleItemPosition() == state.getItemCount() - 1;
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        if (z && decoratedMeasuredWidth < width) {
            i = (width - decoratedMeasuredWidth) / 2;
        }
        if (i > 0) {
            if (getLayoutDirection() == 1) {
                i = -i;
            }
            offsetChildrenHorizontal(i);
        }
    }
}

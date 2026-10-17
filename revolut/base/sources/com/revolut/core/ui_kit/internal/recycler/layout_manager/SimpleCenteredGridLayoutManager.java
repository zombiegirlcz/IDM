package com.revolut.core.ui_kit.internal.recycler.layout_manager;

import a0.d;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/internal/recycler/layout_manager/SimpleCenteredGridLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SimpleCenteredGridLayoutManager extends RecyclerView.LayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56059a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f56060b = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        ArrayList arrayList = this.f56060b;
        arrayList.clear();
        if (state.getItemCount() == 0) {
            removeAllViews();
            return;
        }
        detachAndScrapAttachedViews(recycler);
        int paddingTop = getPaddingTop();
        int itemCount = state.getItemCount();
        int i = paddingTop;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while (i2 < itemCount) {
            View viewForPosition = recycler.getViewForPosition(i2);
            Intrinsics.checkNotNullExpressionValue(viewForPosition, "getViewForPosition(...)");
            arrayList.add(viewForPosition);
            measureChildWithMargins(viewForPosition, 0, 0);
            addView(viewForPosition);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewForPosition);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewForPosition);
            if (decoratedMeasuredWidth <= i3) {
                decoratedMeasuredWidth = i3;
            }
            int i6 = decoratedMeasuredHeight > i5 ? decoratedMeasuredHeight : i5;
            int i21 = i2 + 1;
            int i22 = this.f56059a;
            if (i21 % i22 == 0 || i2 == state.getItemCount() - 1) {
                int iD = d.D(i22 - arrayList.size(), decoratedMeasuredWidth, 2, getPaddingStart());
                Iterator it8 = arrayList.iterator();
                int i32 = iD;
                while (it8.hasNext()) {
                    int i33 = i32 + decoratedMeasuredWidth;
                    layoutDecoratedWithMargins((View) it8.next(), i32, i, i33, i + i6);
                    i32 = i33;
                }
                i += i6;
                arrayList.clear();
            }
            i3 = decoratedMeasuredWidth;
            i5 = i6;
            i2 = i21;
        }
    }
}

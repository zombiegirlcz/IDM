package com.revolut.core.ui_kit.internal.recycler.layout_manager;

import a10.b;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import or0.g;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/internal/recycler/layout_manager/LimitedLinesLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$SmoothScroller$ScrollVectorProvider;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LimitedLinesLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56053a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f56054b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f56055c = new int[0];
    public int[] d = new int[0];
    public int[] e = new int[0];
    public View[] f = new View[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f56056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f56057h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f56058j;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* JADX INFO: renamed from: canScrollHorizontally */
    public final boolean getF53278a() {
        int i = this.i - this.f56057h;
        if (i < 0) {
            i = 0;
        }
        return i > 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return this.f56057h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (getLayoutDirection() != 1) {
            return this.f56058j;
        }
        int i = this.i - this.f56057h;
        if (i < 0) {
            i = 0;
        }
        return i - this.f56058j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return this.i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public final PointF computeScrollVectorForPosition(int i) {
        if (i < 0 || i >= this.f56056g) {
            return null;
        }
        float f = this.e[i] < this.f56058j ? -1.0f : 1.0f;
        if (getLayoutDirection() == 1) {
            f = -f;
        }
        return new PointF(f, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    public final int m(int i) {
        int i2 = this.f56056g;
        int i3 = 1;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i21 = this.f56055c[i6];
            if (i5 > 0 && i5 + i21 > i) {
                i3++;
                i5 = 0;
            }
            this.e[i6] = i5;
            i5 += i21;
        }
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getItemCount() == 0) {
            removeAllViews();
            this.f56056g = 0;
            this.i = 0;
            this.f56058j = 0;
            return;
        }
        detachAndScrapAttachedViews(recycler);
        int itemCount = state.getItemCount();
        int[] iArr = this.f56055c;
        if (iArr.length < itemCount) {
            int iMax = Math.max(itemCount, iArr.length * 2);
            this.f56055c = new int[iMax];
            this.d = new int[iMax];
            this.e = new int[iMax];
            this.f = new View[iMax];
        }
        this.f56056g = state.getItemCount();
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        if (width < 0) {
            width = 0;
        }
        this.f56057h = width;
        int i = this.f56056g;
        for (int i2 = 0; i2 < i; i2++) {
            View viewForPosition = recycler.getViewForPosition(i2);
            Intrinsics.checkNotNullExpressionValue(viewForPosition, "getViewForPosition(...)");
            addView(viewForPosition);
            ViewGroup.LayoutParams layoutParams = viewForPosition.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            Rect rect = this.f56054b;
            calculateItemDecorationsForChild(viewForPosition, rect);
            viewForPosition.measure(RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingEnd() + getPaddingStart() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).width, false), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).height, false));
            this.f[i2] = viewForPosition;
            int[] iArr2 = this.f56055c;
            ViewGroup.LayoutParams layoutParams3 = viewForPosition.getLayoutParams();
            Intrinsics.i(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.LayoutParams layoutParams4 = (RecyclerView.LayoutParams) layoutParams3;
            iArr2[i2] = getDecoratedMeasuredWidth(viewForPosition) + ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin;
            int[] iArr3 = this.d;
            ViewGroup.LayoutParams layoutParams5 = viewForPosition.getLayoutParams();
            Intrinsics.i(layoutParams5, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.LayoutParams layoutParams6 = (RecyclerView.LayoutParams) layoutParams5;
            iArr3[i2] = getDecoratedMeasuredHeight(viewForPosition) + ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin;
        }
        int iM = m(this.f56057h);
        int i3 = this.f56053a;
        if (iM > i3) {
            int i5 = this.f56057h + 1;
            int i6 = this.f56056g;
            int i21 = 0;
            for (int i22 = 0; i22 < i6; i22++) {
                i21 += this.f56055c[i22];
            }
            while (i5 < i21) {
                int iA = b.a(i21, i5, 2, i5);
                if (m(iA) <= i3) {
                    i21 = iA;
                } else {
                    i5 = iA + 1;
                }
            }
            m(i5);
        }
        int i32 = this.f56056g;
        int iMax2 = 0;
        for (int i33 = 0; i33 < i32; i33++) {
            iMax2 = Math.max(iMax2, this.e[i33] + this.f56055c[i33]);
        }
        this.i = iMax2;
        int i43 = this.f56058j;
        int i59 = iMax2 - this.f56057h;
        if (i59 < 0) {
            i59 = 0;
        }
        this.f56058j = f.g(i43, 0, i59);
        int paddingTop = getPaddingTop();
        int i66 = this.f56056g;
        int i74 = 0;
        int i92 = 0;
        while (i74 < i66) {
            if (i74 > 0) {
                int[] iArr4 = this.e;
                int i96 = i74 - 1;
                if (iArr4[i74] < iArr4[i96] + this.f56055c[i96]) {
                    paddingTop += i92;
                    i92 = 0;
                }
            }
            int i99 = paddingTop;
            int iMax3 = Math.max(i92, this.d[i74]);
            View view = this.f[i74];
            if (view != null) {
                int paddingStart = (getPaddingStart() + this.e[i74]) - this.f56058j;
                g.a(this, view, paddingStart, i99, paddingStart + this.f56055c[i74], i99 + this.d[i74]);
                this.f[i74] = null;
            }
            i74++;
            i92 = iMax3;
            paddingTop = i99;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        if (getChildCount() != 0 && i != 0) {
            int i2 = getLayoutDirection() == 1 ? -1 : 1;
            int i3 = (i * i2) + this.f56058j;
            int i5 = this.i - this.f56057h;
            if (i5 < 0) {
                i5 = 0;
            }
            int iG = f.g(i3, 0, i5);
            int i6 = this.f56058j;
            int i21 = iG - i6;
            if (i21 != 0) {
                this.f56058j = i6 + i21;
                offsetChildrenHorizontal((-i21) * i2);
                return i21 * i2;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        if (i < 0 || i >= this.f56056g) {
            return;
        }
        int i2 = this.e[i];
        int i3 = this.f56055c[i] + i2;
        int i5 = this.f56058j;
        if (i2 >= i5) {
            int i6 = this.f56057h;
            i2 = i3 > i5 + i6 ? i3 - i6 : i5;
        }
        this.f56058j = i2;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(state, "state");
        if (i < 0 || i >= state.getItemCount()) {
            return;
        }
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }
}

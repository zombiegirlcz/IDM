package com.revolut.core.ui_kit.internal.delegates.scroller.lm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import vim.f;
import xq0.l;
import yhm.j;
import yq0.a;
import yq0.b;
import yq0.d;
import yq0.e;
import yq0.g;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/internal/delegates/scroller/lm/WrapContentScrollerLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WrapContentScrollerLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f55877c;
    public final int d;
    public final b e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f55878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RecyclerView.Recycler f55879h;
    public final g i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentScrollerLayoutManager(Context context, int i, int i2, l spaceType, int i3) {
        super(context, 0, false);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(spaceType, "spaceType");
        this.f55875a = i;
        this.f55876b = i2;
        this.f55877c = spaceType;
        this.d = i3;
        this.e = new b(0);
        this.f = j.b(new e(this, 0));
        this.i = new g(this);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return false;
    }

    public final int m(int i, int i2, int i3) {
        int paddingStart = ((i2 - getPaddingStart()) - getPaddingEnd()) - (this.d * 2);
        d dVar = (d) this.f.getValue();
        int i5 = this.f55875a;
        int iA = dVar.a(paddingStart, i5, 0, 0);
        f it8 = new IntRange(i, Math.min((i5 + i) - 1, i3 - 1), 1).iterator();
        int measuredHeight = 0;
        while (it8.f289625c) {
            int iNextInt = it8.nextInt();
            View viewFindViewByPosition = findViewByPosition(iNextInt);
            if (viewFindViewByPosition == null) {
                RecyclerView.Recycler recycler = this.f55879h;
                if (recycler == null) {
                    Intrinsics.r("recycler");
                    throw null;
                }
                viewFindViewByPosition = recycler.getViewForPosition(iNextInt);
                Intrinsics.checkNotNullExpressionValue(viewFindViewByPosition, "getViewForPosition(...)");
            }
            if (viewFindViewByPosition.getMeasuredWidth() != iA || viewFindViewByPosition.getMeasuredHeight() == 0) {
                viewFindViewByPosition.measure(View.MeasureSpec.makeMeasureSpec(iA, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            if (viewFindViewByPosition.getMeasuredHeight() > measuredHeight) {
                measuredHeight = viewFindViewByPosition.getMeasuredHeight();
            }
        }
        return measuredHeight;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void measureChild(View child, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        ((d) this.f.getValue()).b(child, this.f55875a, i, i2, 0, 0, this.e, this.d, f0.f322471a);
        child.measure(this.e.f315956a, View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void measureChildWithMargins(View child, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        ((d) this.f.getValue()).b(child, this.f55875a, i, i2, ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, this.e, this.d, f0.f322471a);
        child.measure(this.e.f315956a, View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAttachedToWindow(view);
        view.setItemAnimator(new yq0.f(this, view));
        view.addOnScrollListener(this.i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView view, RecyclerView.Recycler recycler) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        super.onDetachedFromWindow(view, recycler);
        view.removeOnScrollListener(this.i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f55879h = recycler;
        if (state.getItemCount() == 0) {
            super.onMeasure(recycler, state, i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        a aVar = this.f55878g;
        if (aVar != null) {
            setMeasuredDimension(size, (int) (((aVar.f315954b - r4) * aVar.f315955c) + aVar.f315953a));
            return;
        }
        int iFindFirstVisibleItemPosition = findFirstVisibleItemPosition();
        Integer numValueOf = iFindFirstVisibleItemPosition == -1 ? null : Integer.valueOf(iFindFirstVisibleItemPosition);
        int iM = m(numValueOf != null ? numValueOf.intValue() : 0, size, state.getItemCount());
        if (mode == Integer.MIN_VALUE) {
            size2 = Math.min(iM, size2);
        } else if (mode != 1073741824) {
            size2 = iM;
        }
        setMeasuredDimension(size, size2);
    }
}

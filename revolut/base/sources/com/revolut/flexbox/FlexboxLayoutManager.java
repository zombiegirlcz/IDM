package com.revolut.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ihi.d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements ihi.a, RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final Rect z = new Rect();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f98207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f98208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f98209c;
    public int d;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f98210g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView.Recycler f98212j;
    public RecyclerView.State k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f98213l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public OrientationHelper f98215n;
    public OrientationHelper o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SavedState f98216p;
    public final Context v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f98221w;
    public int e = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f98211h = new ArrayList();
    public final b i = new b(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f98214m = new d(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f98217q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f98218r = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f98219s = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f98220t = Integer.MIN_VALUE;
    public final SparseArray u = new SparseArray();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f98222x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ihi.b f98223y = new ihi.b();

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f98229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f98230b;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.f98229a = parcel.readInt();
                savedState.f98230b = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb6 = new StringBuilder("SavedState{mAnchorPosition=");
            sb6.append(this.f98229a);
            sb6.append(", mAnchorOffset=");
            return j6.a.t(sb6, this.f98230b, CoreConstants.CURLY_RIGHT);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f98229a);
            parcel.writeInt(this.f98230b);
        }
    }

    public FlexboxLayoutManager(Context context, int i) {
        z(0);
        A(i);
        y(4);
        this.v = context;
    }

    public static boolean isMeasurementUpToDate(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public final void A(int i) {
        if (i == 2) {
            throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        }
        int i2 = this.f98208b;
        if (i2 != i) {
            if (i2 == 0 || i == 0) {
                removeAllViews();
                this.f98211h.clear();
                d dVar = this.f98214m;
                d.b(dVar);
                dVar.d = 0;
            }
            this.f98208b = i;
            this.f98215n = null;
            this.o = null;
            requestLayout();
        }
    }

    public final void B(int i) {
        if (this.f98209c != i) {
            this.f98209c = i;
            requestLayout();
        }
    }

    public final boolean C(View view, int i, int i2, LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && isMeasurementUpToDate(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    public final void D(int i) {
        View viewS = s(getChildCount() - 1, -1);
        if (i >= (viewS != null ? getPosition(viewS) : -1)) {
            return;
        }
        int childCount = getChildCount();
        b bVar = this.i;
        bVar.j(childCount);
        bVar.k(childCount);
        bVar.i(childCount);
        if (i >= bVar.f98251c.length) {
            return;
        }
        this.f98222x = i;
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.f98217q = getPosition(childAt);
        if (l() || !this.f) {
            this.f98218r = this.f98215n.getDecoratedStart(childAt) - this.f98215n.getStartAfterPadding();
        } else {
            this.f98218r = this.f98215n.getEndPadding() + this.f98215n.getDecoratedEnd(childAt);
        }
    }

    public final void E(d dVar, boolean z3, boolean z4) {
        int i;
        if (z4) {
            x();
        } else {
            this.f98213l.f98232b = false;
        }
        if (l() || !this.f) {
            this.f98213l.f98231a = this.f98215n.getEndAfterPadding() - dVar.f161425c;
        } else {
            this.f98213l.f98231a = dVar.f161425c - getPaddingRight();
        }
        a aVar = this.f98213l;
        aVar.d = dVar.f161423a;
        aVar.f98235h = 1;
        aVar.i = 1;
        aVar.e = dVar.f161425c;
        aVar.f = Integer.MIN_VALUE;
        aVar.f98233c = dVar.f161424b;
        if (!z3 || this.f98211h.size() <= 1 || (i = dVar.f161424b) < 0 || i >= this.f98211h.size() - 1) {
            return;
        }
        com.revolut.flexbox.a aVar2 = (com.revolut.flexbox.a) this.f98211h.get(dVar.f161424b);
        a aVar3 = this.f98213l;
        aVar3.f98233c++;
        aVar3.d += aVar2.f98241h;
    }

    public final void F(d dVar, boolean z3, boolean z4) {
        if (z4) {
            x();
        } else {
            this.f98213l.f98232b = false;
        }
        if (l() || !this.f) {
            this.f98213l.f98231a = dVar.f161425c - this.f98215n.getStartAfterPadding();
        } else {
            this.f98213l.f98231a = (this.f98221w.getWidth() - dVar.f161425c) - this.f98215n.getStartAfterPadding();
        }
        a aVar = this.f98213l;
        aVar.d = dVar.f161423a;
        aVar.f98235h = 1;
        aVar.i = -1;
        aVar.e = dVar.f161425c;
        aVar.f = Integer.MIN_VALUE;
        int i = dVar.f161424b;
        aVar.f98233c = i;
        if (!z3 || i <= 0) {
            return;
        }
        int size = this.f98211h.size();
        int i2 = dVar.f161424b;
        if (size > i2) {
            com.revolut.flexbox.a aVar2 = (com.revolut.flexbox.a) this.f98211h.get(i2);
            a aVar3 = this.f98213l;
            aVar3.f98233c--;
            aVar3.d -= aVar2.f98241h;
        }
    }

    @Override // ihi.a
    public final View b(int i) {
        View view = (View) this.u.get(i);
        return view != null ? view : this.f98212j.getViewForPosition(i);
    }

    @Override // ihi.a
    public final int c(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), i2, i3, canScrollVertically());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* JADX INFO: renamed from: canScrollHorizontally */
    public final boolean getF53278a() {
        if (this.f98208b == 0) {
            return l();
        }
        if (!l()) {
            return true;
        }
        int width = getWidth();
        View view = this.f98221w;
        return width > (view != null ? view.getWidth() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        if (this.f98208b == 0) {
            return !l();
        }
        if (!l()) {
            int height = getHeight();
            View view = this.f98221w;
            if (height <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    public final int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        m();
        View viewO = o(itemCount);
        View viewQ = q(itemCount);
        if (state.getItemCount() == 0 || viewO == null || viewQ == null) {
            return 0;
        }
        return Math.min(this.f98215n.getTotalSpace(), this.f98215n.getDecoratedEnd(viewQ) - this.f98215n.getDecoratedStart(viewO));
    }

    public final int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View viewO = o(itemCount);
        View viewQ = q(itemCount);
        if (state.getItemCount() != 0 && viewO != null && viewQ != null) {
            int position = getPosition(viewO);
            int position2 = getPosition(viewQ);
            int iAbs = Math.abs(this.f98215n.getDecoratedEnd(viewQ) - this.f98215n.getDecoratedStart(viewO));
            int i = this.i.f98251c[position];
            if (i != 0 && i != -1) {
                return Math.round((i * (iAbs / ((r4[position2] - i) + 1))) + (this.f98215n.getStartAfterPadding() - this.f98215n.getDecoratedStart(viewO)));
            }
        }
        return 0;
    }

    public final int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() != 0) {
            int itemCount = state.getItemCount();
            View viewO = o(itemCount);
            View viewQ = q(itemCount);
            if (state.getItemCount() != 0 && viewO != null && viewQ != null) {
                View viewS = s(0, getChildCount());
                int position = viewS == null ? -1 : getPosition(viewS);
                return (int) ((Math.abs(this.f98215n.getDecoratedEnd(viewQ) - this.f98215n.getDecoratedStart(viewO)) / (((s(getChildCount() - 1, -1) != null ? getPosition(r4) : -1) - position) + 1)) * state.getItemCount());
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public final PointF computeScrollVectorForPosition(int i) {
        View childAt;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        int i2 = i < getPosition(childAt) ? -1 : 1;
        return l() ? new PointF(BitmapDescriptorFactory.HUE_RED, i2) : new PointF(i2, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    @Override // ihi.a
    public final int d(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (l()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return rightDecorationWidth + leftDecorationWidth;
    }

    @Override // ihi.a
    public final View e(int i) {
        return b(i);
    }

    @Override // ihi.a
    public final void f(com.revolut.flexbox.a aVar) {
    }

    public final int fixLayoutEndGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z3) {
        int iU;
        int endAfterPadding;
        if (l() || !this.f) {
            int endAfterPadding2 = this.f98215n.getEndAfterPadding() - i;
            if (endAfterPadding2 <= 0) {
                return 0;
            }
            iU = -u(-endAfterPadding2, recycler, state);
        } else {
            int startAfterPadding = i - this.f98215n.getStartAfterPadding();
            if (startAfterPadding <= 0) {
                return 0;
            }
            iU = u(startAfterPadding, recycler, state);
        }
        int i2 = i + iU;
        if (!z3 || (endAfterPadding = this.f98215n.getEndAfterPadding() - i2) <= 0) {
            return iU;
        }
        this.f98215n.offsetChildren(endAfterPadding);
        return endAfterPadding + iU;
    }

    public final int fixLayoutStartGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z3) {
        int iU;
        int startAfterPadding;
        if (l() || !this.f) {
            int startAfterPadding2 = i - this.f98215n.getStartAfterPadding();
            if (startAfterPadding2 <= 0) {
                return 0;
            }
            iU = -u(startAfterPadding2, recycler, state);
        } else {
            int endAfterPadding = this.f98215n.getEndAfterPadding() - i;
            if (endAfterPadding <= 0) {
                return 0;
            }
            iU = u(-endAfterPadding, recycler, state);
        }
        int i2 = i + iU;
        if (!z3 || (startAfterPadding = i2 - this.f98215n.getStartAfterPadding()) <= 0) {
            return iU;
        }
        this.f98215n.offsetChildren(-startAfterPadding);
        return iU - startAfterPadding;
    }

    @Override // ihi.a
    public final int g(View view, int i, int i2) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (l()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return bottomDecorationHeight + topDecorationHeight;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // ihi.a
    public final int getAlignContent() {
        return 5;
    }

    @Override // ihi.a
    public final int getAlignItems() {
        return this.d;
    }

    @Override // ihi.a
    public final int getFlexDirection() {
        return this.f98207a;
    }

    @Override // ihi.a
    public final int getFlexItemCount() {
        return this.k.getItemCount();
    }

    @Override // ihi.a
    public final List getFlexLinesInternal() {
        return this.f98211h;
    }

    @Override // ihi.a
    public final int getFlexWrap() {
        return this.f98208b;
    }

    @Override // ihi.a
    public final int getLargestMainSize() {
        if (this.f98211h.size() == 0) {
            return 0;
        }
        int size = this.f98211h.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, ((com.revolut.flexbox.a) this.f98211h.get(i)).e);
        }
        return iMax;
    }

    @Override // ihi.a
    public final int getMaxLine() {
        return this.e;
    }

    @Override // ihi.a
    public final int getSumOfCrossSize() {
        int size = this.f98211h.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((com.revolut.flexbox.a) this.f98211h.get(i2)).f98240g;
        }
        return i;
    }

    @Override // ihi.a
    public final int h(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), i2, i3, getF53278a());
    }

    @Override // ihi.a
    public final void i(View view) {
        calculateItemDecorationsForChild(view, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // ihi.a
    public final void j(int i, View view) {
        this.u.put(i, view);
    }

    @Override // ihi.a
    public final void k(View view, int i, int i2, com.revolut.flexbox.a aVar) {
        calculateItemDecorationsForChild(view, z);
        if (l()) {
            int rightDecorationWidth = getRightDecorationWidth(view) + getLeftDecorationWidth(view);
            aVar.e += rightDecorationWidth;
            aVar.f += rightDecorationWidth;
            return;
        }
        int bottomDecorationHeight = getBottomDecorationHeight(view) + getTopDecorationHeight(view);
        aVar.e += bottomDecorationHeight;
        aVar.f += bottomDecorationHeight;
    }

    @Override // ihi.a
    public final boolean l() {
        int i = this.f98207a;
        return i == 0 || i == 1;
    }

    public final void m() {
        if (this.f98215n != null) {
            return;
        }
        if (l()) {
            if (this.f98208b == 0) {
                this.f98215n = OrientationHelper.createHorizontalHelper(this);
                this.o = OrientationHelper.createVerticalHelper(this);
                return;
            } else {
                this.f98215n = OrientationHelper.createVerticalHelper(this);
                this.o = OrientationHelper.createHorizontalHelper(this);
                return;
            }
        }
        if (this.f98208b == 0) {
            this.f98215n = OrientationHelper.createVerticalHelper(this);
            this.o = OrientationHelper.createHorizontalHelper(this);
        } else {
            this.f98215n = OrientationHelper.createHorizontalHelper(this);
            this.o = OrientationHelper.createVerticalHelper(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x042e, code lost:
    
        r3 = r34.f98231a - r8;
        r34.f98231a = r3;
        r4 = r34.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0437, code lost:
    
        if (r4 == Integer.MIN_VALUE) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0439, code lost:
    
        r4 = r4 + r8;
        r34.f = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x043c, code lost:
    
        if (r3 >= 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x043e, code lost:
    
        r34.f = r4 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0441, code lost:
    
        w(r32, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0448, code lost:
    
        return r27 - r34.f98231a;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int n(androidx.recyclerview.widget.RecyclerView.Recycler r32, androidx.recyclerview.widget.RecyclerView.State r33, com.revolut.flexbox.FlexboxLayoutManager.a r34) {
        /*
            Method dump skipped, instruction units count: 1097
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.flexbox.FlexboxLayoutManager.n(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, com.revolut.flexbox.FlexboxLayoutManager$a):int");
    }

    public final View o(int i) {
        View viewT = t(0, getChildCount(), i);
        if (viewT == null) {
            return null;
        }
        int i2 = this.i.f98251c[getPosition(viewT)];
        if (i2 == -1) {
            return null;
        }
        return p(viewT, (com.revolut.flexbox.a) this.f98211h.get(i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f98221w = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        D(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        super.onItemsMoved(recyclerView, i, i2, i3);
        D(Math.min(i, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        D(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj2) {
        super.onItemsUpdated(recyclerView, i, i2, obj2);
        D(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ee  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r22, androidx.recyclerview.widget.RecyclerView.State r23) {
        /*
            Method dump skipped, instruction units count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.flexbox.FlexboxLayoutManager.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f98216p = null;
        this.f98217q = -1;
        this.f98218r = Integer.MIN_VALUE;
        this.f98222x = -1;
        d.b(this.f98214m);
        this.u.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f98216p = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = this.f98216p;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f98229a = savedState.f98229a;
            savedState2.f98230b = savedState.f98230b;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (getChildCount() <= 0) {
            savedState3.f98229a = -1;
            return savedState3;
        }
        View childAt = getChildAt(0);
        savedState3.f98229a = getPosition(childAt);
        savedState3.f98230b = this.f98215n.getDecoratedStart(childAt) - this.f98215n.getStartAfterPadding();
        return savedState3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View p(android.view.View r6, com.revolut.flexbox.a r7) {
        /*
            r5 = this;
            boolean r0 = r5.l()
            int r7 = r7.f98241h
            r1 = 1
        L7:
            if (r1 >= r7) goto L3f
            android.view.View r2 = r5.getChildAt(r1)
            if (r2 == 0) goto L3c
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L18
            goto L3c
        L18:
            boolean r3 = r5.f
            if (r3 == 0) goto L2d
            if (r0 != 0) goto L2d
            androidx.recyclerview.widget.OrientationHelper r3 = r5.f98215n
            int r3 = r3.getDecoratedEnd(r6)
            androidx.recyclerview.widget.OrientationHelper r4 = r5.f98215n
            int r4 = r4.getDecoratedEnd(r2)
            if (r3 >= r4) goto L3c
            goto L3b
        L2d:
            androidx.recyclerview.widget.OrientationHelper r3 = r5.f98215n
            int r3 = r3.getDecoratedStart(r6)
            androidx.recyclerview.widget.OrientationHelper r4 = r5.f98215n
            int r4 = r4.getDecoratedStart(r2)
            if (r3 <= r4) goto L3c
        L3b:
            r6 = r2
        L3c:
            int r1 = r1 + 1
            goto L7
        L3f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.flexbox.FlexboxLayoutManager.p(android.view.View, com.revolut.flexbox.a):android.view.View");
    }

    public final View q(int i) {
        View viewT = t(getChildCount() - 1, -1, i);
        if (viewT == null) {
            return null;
        }
        return r(viewT, (com.revolut.flexbox.a) this.f98211h.get(this.i.f98251c[getPosition(viewT)]));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View r(android.view.View r6, com.revolut.flexbox.a r7) {
        /*
            r5 = this;
            boolean r0 = r5.l()
            int r1 = r5.getChildCount()
            int r1 = r1 + (-2)
            int r2 = r5.getChildCount()
            int r7 = r7.f98241h
            int r2 = r2 - r7
            int r2 = r2 + (-1)
        L13:
            if (r1 <= r2) goto L4b
            android.view.View r7 = r5.getChildAt(r1)
            if (r7 == 0) goto L48
            int r3 = r7.getVisibility()
            r4 = 8
            if (r3 != r4) goto L24
            goto L48
        L24:
            boolean r3 = r5.f
            if (r3 == 0) goto L39
            if (r0 != 0) goto L39
            androidx.recyclerview.widget.OrientationHelper r3 = r5.f98215n
            int r3 = r3.getDecoratedStart(r6)
            androidx.recyclerview.widget.OrientationHelper r4 = r5.f98215n
            int r4 = r4.getDecoratedStart(r7)
            if (r3 <= r4) goto L48
            goto L47
        L39:
            androidx.recyclerview.widget.OrientationHelper r3 = r5.f98215n
            int r3 = r3.getDecoratedEnd(r6)
            androidx.recyclerview.widget.OrientationHelper r4 = r5.f98215n
            int r4 = r4.getDecoratedEnd(r7)
            if (r3 >= r4) goto L48
        L47:
            r6 = r7
        L48:
            int r1 = r1 + (-1)
            goto L13
        L4b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.flexbox.FlexboxLayoutManager.r(android.view.View, com.revolut.flexbox.a):android.view.View");
    }

    public final View s(int i, int i2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View childAt = getChildAt(i);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int decoratedLeft = getDecoratedLeft(childAt) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).leftMargin;
            int decoratedTop = getDecoratedTop(childAt) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).topMargin;
            int decoratedRight = getDecoratedRight(childAt) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
            int decoratedBottom = getDecoratedBottom(childAt) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            boolean z3 = decoratedLeft >= width || decoratedRight >= paddingLeft;
            boolean z4 = decoratedTop >= height || decoratedBottom >= paddingTop;
            if (z3 && z4) {
                return childAt;
            }
            i += i3;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!l() || this.f98208b == 0) {
            int iU = u(i, recycler, state);
            this.u.clear();
            return iU;
        }
        int iV = v(i);
        this.f98214m.d += iV;
        this.o.offsetChildren(-iV);
        return iV;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        this.f98217q = i;
        this.f98218r = Integer.MIN_VALUE;
        SavedState savedState = this.f98216p;
        if (savedState != null) {
            savedState.f98229a = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (l() || (this.f98208b == 0 && !l())) {
            int iU = u(i, recycler, state);
            this.u.clear();
            return iU;
        }
        int iV = v(i);
        this.f98214m.d += iV;
        this.o.offsetChildren(-iV);
        return iV;
    }

    @Override // ihi.a
    public final void setFlexLines(List list) {
        this.f98211h = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    public final View t(int i, int i2, int i3) {
        int position;
        m();
        if (this.f98213l == null) {
            this.f98213l = new a(0);
        }
        int startAfterPadding = this.f98215n.getStartAfterPadding();
        int endAfterPadding = this.f98215n.getEndAfterPadding();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.f98215n.getDecoratedStart(childAt) >= startAfterPadding && this.f98215n.getDecoratedEnd(childAt) <= endAfterPadding) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int u(int r20, androidx.recyclerview.widget.RecyclerView.Recycler r21, androidx.recyclerview.widget.RecyclerView.State r22) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.flexbox.FlexboxLayoutManager.u(int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):int");
    }

    public final int v(int i) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        m();
        boolean zL = l();
        View view = this.f98221w;
        int width = zL ? view.getWidth() : view.getHeight();
        int width2 = zL ? getWidth() : getHeight();
        int layoutDirection = getLayoutDirection();
        d dVar = this.f98214m;
        if (layoutDirection == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                return -Math.min((width2 + dVar.d) - width, iAbs);
            }
            int i2 = dVar.d;
            if (i2 + i > 0) {
                return -i2;
            }
        } else {
            if (i > 0) {
                return Math.min((width2 - dVar.d) - width, i);
            }
            int i3 = dVar.d;
            if (i3 + i < 0) {
                return -i3;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(androidx.recyclerview.widget.RecyclerView.Recycler r10, com.revolut.flexbox.FlexboxLayoutManager.a r11) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.flexbox.FlexboxLayoutManager.w(androidx.recyclerview.widget.RecyclerView$Recycler, com.revolut.flexbox.FlexboxLayoutManager$a):void");
    }

    public final void x() {
        int heightMode = l() ? getHeightMode() : getWidthMode();
        this.f98213l.f98232b = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    public final void y(int i) {
        int i2 = this.d;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                removeAllViews();
                this.f98211h.clear();
                d dVar = this.f98214m;
                d.b(dVar);
                dVar.d = 0;
            }
            this.d = i;
            requestLayout();
        }
    }

    public final void z(int i) {
        if (this.f98207a != i) {
            removeAllViews();
            this.f98207a = i;
            this.f98215n = null;
            this.o = null;
            this.f98211h.clear();
            d dVar = this.f98214m;
            d.b(dVar);
            dVar.d = 0;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2 = new LayoutParams(layoutParams);
        layoutParams2.f98224a = BitmapDescriptorFactory.HUE_RED;
        layoutParams2.f98225b = 1.0f;
        layoutParams2.f98226c = -1;
        layoutParams2.d = -1.0f;
        layoutParams2.f98227g = 16777215;
        layoutParams2.f98228h = 16777215;
        return layoutParams2;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f98231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f98232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f98233c;
        public int d;
        public int e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f98234g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f98235h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f98236j;

        private a() {
            this.f98235h = 1;
            this.i = 1;
        }

        public final String toString() {
            StringBuilder sb6 = new StringBuilder("LayoutState{mAvailable=");
            sb6.append(this.f98231a);
            sb6.append(", mFlexLinePosition=");
            sb6.append(this.f98233c);
            sb6.append(", mPosition=");
            sb6.append(this.d);
            sb6.append(", mOffset=");
            sb6.append(this.e);
            sb6.append(", mScrollingOffset=");
            sb6.append(this.f);
            sb6.append(", mLastScrollDelta=");
            sb6.append(this.f98234g);
            sb6.append(", mItemDirection=");
            sb6.append(this.f98235h);
            sb6.append(", mLayoutDirection=");
            return j6.a.t(sb6, this.i, CoreConstants.CURLY_RIGHT);
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        super.onItemsUpdated(recyclerView, i, i2);
        D(i);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f98224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f98225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f98226c;
        public float d;
        public int e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f98227g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f98228h;
        public boolean i;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.f98224a = BitmapDescriptorFactory.HUE_RED;
                layoutParams.f98225b = 1.0f;
                layoutParams.f98226c = -1;
                layoutParams.d = -1.0f;
                layoutParams.f98227g = 16777215;
                layoutParams.f98228h = 16777215;
                layoutParams.f98224a = parcel.readFloat();
                layoutParams.f98225b = parcel.readFloat();
                layoutParams.f98226c = parcel.readInt();
                layoutParams.d = parcel.readFloat();
                layoutParams.e = parcel.readInt();
                layoutParams.f = parcel.readInt();
                layoutParams.f98227g = parcel.readInt();
                layoutParams.f98228h = parcel.readInt();
                layoutParams.i = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).width = parcel.readInt();
                return layoutParams;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f98224a = BitmapDescriptorFactory.HUE_RED;
            this.f98225b = 1.0f;
            this.f98226c = -1;
            this.d = -1.0f;
            this.f98227g = 16777215;
            this.f98228h = 16777215;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final int A9() {
            return this.f;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final int I1() {
            return this.e;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final void L8(int i) {
            this.e = i;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final int L9() {
            return this.f98228h;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final void M6(int i) {
            this.f = i;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final int P8() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final float Q6() {
            return this.f98224a;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final int Q7() {
            return this.f98227g;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final int S5() {
            return this.f98226c;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final float W5() {
            return this.f98225b;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final float Y6() {
            return this.d;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final int Z3() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final int c2() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final int getOrder() {
            return 1;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final boolean v7() {
            return this.i;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final int w9() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f98224a);
            parcel.writeFloat(this.f98225b);
            parcel.writeInt(this.f98226c);
            parcel.writeFloat(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.f98227g);
            parcel.writeInt(this.f98228h);
            parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f98224a = BitmapDescriptorFactory.HUE_RED;
            this.f98225b = 1.0f;
            this.f98226c = -1;
            this.d = -1.0f;
            this.f98227g = 16777215;
            this.f98228h = 16777215;
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        int i3 = properties.orientation;
        if (i3 != 0) {
            if (i3 == 1) {
                if (properties.reverseLayout) {
                    z(3);
                } else {
                    z(2);
                }
            }
        } else if (properties.reverseLayout) {
            z(1);
        } else {
            z(0);
        }
        A(1);
        y(4);
        this.v = context;
    }
}

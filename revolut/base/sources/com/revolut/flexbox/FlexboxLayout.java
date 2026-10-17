package com.revolut.flexbox;

import a0.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ihi.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class FlexboxLayout extends ViewGroup implements ihi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f98190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f98191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f98192c;
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f98193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f98194h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f98195j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f98196l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f98197m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SparseIntArray f98198n;
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f98199p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ihi.b f98200q;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f98201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f98202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f98203c;
        public int d;
        public float e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f98204g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f98205h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f98206j;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                LayoutParams layoutParams = new LayoutParams(0, 0);
                layoutParams.f98201a = 1;
                layoutParams.f98202b = BitmapDescriptorFactory.HUE_RED;
                layoutParams.f98203c = 1.0f;
                layoutParams.d = -1;
                layoutParams.e = -1.0f;
                layoutParams.f = -1;
                layoutParams.f98204g = -1;
                layoutParams.f98205h = 16777215;
                layoutParams.i = 16777215;
                layoutParams.f98201a = parcel.readInt();
                layoutParams.f98202b = parcel.readFloat();
                layoutParams.f98203c = parcel.readFloat();
                layoutParams.d = parcel.readInt();
                layoutParams.e = parcel.readFloat();
                layoutParams.f = parcel.readInt();
                layoutParams.f98204g = parcel.readInt();
                layoutParams.f98205h = parcel.readInt();
                layoutParams.i = parcel.readInt();
                layoutParams.f98206j = parcel.readByte() != 0;
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
            this.f98201a = 1;
            this.f98202b = BitmapDescriptorFactory.HUE_RED;
            this.f98203c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.f = -1;
            this.f98204g = -1;
            this.f98205h = 16777215;
            this.i = 16777215;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FlexboxLayout_Layout);
            this.f98201a = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_Layout_layout_order, 1);
            this.f98202b = typedArrayObtainStyledAttributes.getFloat(R$styleable.FlexboxLayout_Layout_layout_flexGrow, BitmapDescriptorFactory.HUE_RED);
            this.f98203c = typedArrayObtainStyledAttributes.getFloat(R$styleable.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.d = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.e = typedArrayObtainStyledAttributes.getFraction(R$styleable.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.FlexboxLayout_Layout_layout_minWidth, -1);
            this.f98204g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.FlexboxLayout_Layout_layout_minHeight, -1);
            this.f98205h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.f98206j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.FlexboxLayout_Layout_layout_wrapBefore, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // com.revolut.flexbox.FlexItem
        public final int A9() {
            return this.f98204g;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final int I1() {
            return this.f;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final void L8(int i) {
            this.f = i;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final int L9() {
            return this.i;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final void M6(int i) {
            this.f98204g = i;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final int P8() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final float Q6() {
            return this.f98202b;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final int Q7() {
            return this.f98205h;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final int S5() {
            return this.d;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final float W5() {
            return this.f98203c;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final float Y6() {
            return this.e;
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
            return this.f98201a;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final boolean v7() {
            return this.f98206j;
        }

        @Override // com.revolut.flexbox.FlexItem
        public final int w9() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f98201a);
            parcel.writeFloat(this.f98202b);
            parcel.writeFloat(this.f98203c);
            parcel.writeInt(this.d);
            parcel.writeFloat(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.f98204g);
            parcel.writeInt(this.f98205h);
            parcel.writeInt(this.i);
            parcel.writeByte(this.f98206j ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, boolean z, boolean z3) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f98199p.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.f98199p.get(i);
            for (int i2 = 0; i2 < aVar.f98241h; i2++) {
                int i3 = aVar.o + i2;
                View viewP = p(i3);
                if (viewP != null && viewP.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewP.getLayoutParams();
                    if (q(i3, i2)) {
                        o(canvas, z ? viewP.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (viewP.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f98196l, aVar.f98238b, aVar.f98240g);
                    }
                    if (i2 == aVar.f98241h - 1 && (this.f98195j & 4) > 0) {
                        o(canvas, z ? (viewP.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f98196l : viewP.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, aVar.f98238b, aVar.f98240g);
                    }
                }
            }
            if (r(i)) {
                n(canvas, paddingLeft, z3 ? aVar.d : aVar.f98238b - this.k, iMax);
            }
            if (s(i) && (this.i & 4) > 0) {
                n(canvas, paddingLeft, z3 ? aVar.f98238b - this.k : aVar.d, iMax);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f98198n == null) {
            this.f98198n = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.f98198n;
        b bVar = this.o;
        ihi.a aVar = bVar.f98249a;
        int flexItemCount = aVar.getFlexItemCount();
        ArrayList arrayListF = bVar.f(flexItemCount);
        c cVar = new c();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            cVar.f161422b = 1;
        } else {
            cVar.f161422b = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount || i >= aVar.getFlexItemCount()) {
            cVar.f161421a = flexItemCount;
        } else {
            cVar.f161421a = i;
            for (int i2 = i; i2 < flexItemCount; i2++) {
                ((c) arrayListF.get(i2)).f161421a++;
            }
        }
        arrayListF.add(cVar);
        this.f98197m = b.r(flexItemCount + 1, arrayListF, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    @Override // ihi.a
    public final View b(int i) {
        return getChildAt(i);
    }

    @Override // ihi.a
    public final int c(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // ihi.a
    public final int d(View view) {
        return 0;
    }

    @Override // ihi.a
    public final View e(int i) {
        return p(i);
    }

    @Override // ihi.a
    public final void f(a aVar) {
        if (l()) {
            if ((this.f98195j & 4) > 0) {
                int i = aVar.e;
                int i2 = this.f98196l;
                aVar.e = i + i2;
                aVar.f += i2;
                return;
            }
            return;
        }
        if ((this.i & 4) > 0) {
            int i3 = aVar.e;
            int i5 = this.k;
            aVar.e = i3 + i5;
            aVar.f += i5;
        }
    }

    @Override // ihi.a
    public final int g(View view, int i, int i2) {
        int i3;
        int i5;
        if (l()) {
            i3 = q(i, i2) ? this.f98196l : 0;
            if ((this.f98195j & 4) <= 0) {
                return i3;
            }
            i5 = this.f98196l;
        } else {
            i3 = q(i, i2) ? this.k : 0;
            if ((this.i & 4) <= 0) {
                return i3;
            }
            i5 = this.k;
        }
        return i3 + i5;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // ihi.a
    public int getAlignContent() {
        return this.e;
    }

    @Override // ihi.a
    public int getAlignItems() {
        return this.d;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f98193g;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f98194h;
    }

    @Override // ihi.a
    public int getFlexDirection() {
        return this.f98190a;
    }

    @Override // ihi.a
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<a> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f98199p.size());
        for (a aVar : this.f98199p) {
            if (aVar.a() != 0) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    @Override // ihi.a
    public List<a> getFlexLinesInternal() {
        return this.f98199p;
    }

    @Override // ihi.a
    public int getFlexWrap() {
        return this.f98191b;
    }

    public int getJustifyContent() {
        return this.f98192c;
    }

    @Override // ihi.a
    public int getLargestMainSize() {
        Iterator it8 = this.f98199p.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it8.hasNext()) {
            iMax = Math.max(iMax, ((a) it8.next()).e);
        }
        return iMax;
    }

    @Override // ihi.a
    public int getMaxLine() {
        return this.f;
    }

    public int getShowDividerHorizontal() {
        return this.i;
    }

    public int getShowDividerVertical() {
        return this.f98195j;
    }

    @Override // ihi.a
    public int getSumOfCrossSize() {
        int size = this.f98199p.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = (a) this.f98199p.get(i2);
            if (r(i2)) {
                i += l() ? this.k : this.f98196l;
            }
            if (s(i2)) {
                i += l() ? this.k : this.f98196l;
            }
            i += aVar.f98240g;
        }
        return i;
    }

    @Override // ihi.a
    public final int h(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // ihi.a
    public final void i(View view) {
    }

    @Override // ihi.a
    public final void j(int i, View view) {
    }

    @Override // ihi.a
    public final void k(View view, int i, int i2, a aVar) {
        if (q(i, i2)) {
            if (l()) {
                int i3 = aVar.e;
                int i5 = this.f98196l;
                aVar.e = i3 + i5;
                aVar.f += i5;
                return;
            }
            int i6 = aVar.e;
            int i21 = this.k;
            aVar.e = i6 + i21;
            aVar.f += i21;
        }
    }

    @Override // ihi.a
    public final boolean l() {
        int i = this.f98190a;
        return i == 0 || i == 1;
    }

    public final void m(Canvas canvas, boolean z, boolean z3) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f98199p.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.f98199p.get(i);
            for (int i2 = 0; i2 < aVar.f98241h; i2++) {
                int i3 = aVar.o + i2;
                View viewP = p(i3);
                if (viewP != null && viewP.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewP.getLayoutParams();
                    if (q(i3, i2)) {
                        n(canvas, aVar.f98237a, z3 ? viewP.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (viewP.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.k, aVar.f98240g);
                    }
                    if (i2 == aVar.f98241h - 1 && (this.i & 4) > 0) {
                        n(canvas, aVar.f98237a, z3 ? (viewP.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.k : viewP.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, aVar.f98240g);
                    }
                }
            }
            if (r(i)) {
                o(canvas, z ? aVar.f98239c : aVar.f98237a - this.f98196l, paddingTop, iMax);
            }
            if (s(i) && (this.f98195j & 4) > 0) {
                o(canvas, z ? aVar.f98237a - this.f98196l : aVar.f98239c, paddingTop, iMax);
            }
        }
    }

    public final void n(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f98193g;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.k + i2);
        this.f98193g.draw(canvas);
    }

    public final void o(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f98194h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.f98196l + i, i3 + i2);
        this.f98194h.draw(canvas);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f98194h == null && this.f98193g == null) {
            return;
        }
        if (this.i == 0 && this.f98195j == 0) {
            return;
        }
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i = this.f98190a;
        if (i == 0) {
            a(canvas, layoutDirection == 1, this.f98191b == 2);
            return;
        }
        if (i == 1) {
            a(canvas, layoutDirection != 1, this.f98191b == 2);
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            if (this.f98191b == 2) {
                z = !z;
            }
            m(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z3 = layoutDirection == 1;
        if (this.f98191b == 2) {
            z3 = !z3;
        }
        m(canvas, z3, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i6 = this.f98190a;
        if (i6 == 0) {
            t(i, i2, i3, i5, layoutDirection == 1);
            return;
        }
        if (i6 == 1) {
            t(i, i2, i3, i5, layoutDirection != 1);
            return;
        }
        if (i6 == 2) {
            boolean z3 = false;
            if (layoutDirection == 1) {
                z3 = true;
            }
            if (this.f98191b == 2) {
                z3 = !z3;
            }
            u(i, i2, i3, i5, z3, false);
            return;
        }
        if (i6 != 3) {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f98190a);
        }
        boolean z4 = layoutDirection == 1;
        if (this.f98191b == 2) {
            z4 = !z4;
        }
        u(i, i2, i3, i5, z4, true);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f98198n == null) {
            this.f98198n = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.f98198n;
        b bVar = this.o;
        ihi.a aVar = bVar.f98249a;
        int flexItemCount = aVar.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            SparseIntArray sparseIntArray2 = this.f98198n;
            int flexItemCount2 = bVar.f98249a.getFlexItemCount();
            this.f98197m = b.r(flexItemCount2, bVar.f(flexItemCount2), sparseIntArray2);
            break;
        }
        for (int i3 = 0; i3 < flexItemCount; i3++) {
            View viewB = aVar.b(i3);
            if (viewB != null && ((FlexItem) viewB.getLayoutParams()).getOrder() != sparseIntArray.get(i3)) {
                SparseIntArray sparseIntArray22 = this.f98198n;
                int flexItemCount22 = bVar.f98249a.getFlexItemCount();
                this.f98197m = b.r(flexItemCount22, bVar.f(flexItemCount22), sparseIntArray22);
                break;
            }
        }
        int i5 = this.f98190a;
        ihi.b bVar2 = this.f98200q;
        if (i5 != 0 && i5 != 1) {
            if (i5 != 2 && i5 != 3) {
                throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f98190a);
            }
            this.f98199p.clear();
            bVar2.f161419a = null;
            bVar2.f161420b = 0;
            this.o.b(this.f98200q, i2, i, Integer.MAX_VALUE, 0, -1, null);
            this.f98199p = bVar2.f161419a;
            bVar.h(i, i2, 0);
            bVar.g(i, i2, getPaddingRight() + getPaddingLeft());
            bVar.u(0);
            v(this.f98190a, i, i2, bVar2.f161420b);
            return;
        }
        this.f98199p.clear();
        bVar2.f161419a = null;
        bVar2.f161420b = 0;
        this.o.b(this.f98200q, i, i2, Integer.MAX_VALUE, 0, -1, null);
        this.f98199p = bVar2.f161419a;
        bVar.h(i, i2, 0);
        if (this.d == 3) {
            for (a aVar2 : this.f98199p) {
                int iMax = Integer.MIN_VALUE;
                for (int i6 = 0; i6 < aVar2.f98241h; i6++) {
                    View viewP = p(aVar2.o + i6);
                    if (viewP != null && viewP.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) viewP.getLayoutParams();
                        iMax = this.f98191b != 2 ? Math.max(iMax, viewP.getMeasuredHeight() + Math.max(aVar2.f98243l - viewP.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, viewP.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(viewP.getBaseline() + (aVar2.f98243l - viewP.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                aVar2.f98240g = iMax;
            }
        }
        bVar.g(i, i2, getPaddingBottom() + getPaddingTop());
        bVar.u(0);
        v(this.f98190a, i, i2, bVar2.f161420b);
    }

    public final View p(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.f98197m;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    public final boolean q(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewP = p(i - i3);
            if (viewP != null && viewP.getVisibility() != 8) {
                return l() ? (this.f98195j & 2) != 0 : (this.i & 2) != 0;
            }
        }
        return l() ? (this.f98195j & 1) != 0 : (this.i & 1) != 0;
    }

    public final boolean r(int i) {
        if (i >= 0 && i < this.f98199p.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                if (((a) this.f98199p.get(i2)).a() > 0) {
                    return l() ? (this.i & 2) != 0 : (this.f98195j & 2) != 0;
                }
            }
            if (l()) {
                return (this.i & 1) != 0;
            }
            if ((this.f98195j & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean s(int i) {
        if (i >= 0 && i < this.f98199p.size()) {
            for (int i2 = i + 1; i2 < this.f98199p.size(); i2++) {
                if (((a) this.f98199p.get(i2)).a() > 0) {
                    return false;
                }
            }
            if (l()) {
                return (this.i & 4) != 0;
            }
            if ((this.f98195j & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    public void setAlignContent(int i) {
        if (this.e != i) {
            this.e = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.f98193g) {
            return;
        }
        this.f98193g = drawable;
        if (drawable != null) {
            this.k = drawable.getIntrinsicHeight();
        } else {
            this.k = 0;
        }
        if (this.f98193g == null && this.f98194h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.f98194h) {
            return;
        }
        this.f98194h = drawable;
        if (drawable != null) {
            this.f98196l = drawable.getIntrinsicWidth();
        } else {
            this.f98196l = 0;
        }
        if (this.f98193g == null && this.f98194h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.f98190a != i) {
            this.f98190a = i;
            requestLayout();
        }
    }

    @Override // ihi.a
    public void setFlexLines(List<a> list) {
        this.f98199p = list;
    }

    public void setFlexWrap(int i) {
        if (this.f98191b != i) {
            this.f98191b = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f98192c != i) {
            this.f98192c = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f != i) {
            this.f = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.i) {
            this.i = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f98195j) {
            this.f98195j = i;
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(int r25, int r26, int r27, int r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.flexbox.FlexboxLayout.t(int, int, int, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(int r25, int r26, int r27, int r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.flexbox.FlexboxLayout.u(int, int, int, int, boolean, boolean):void");
    }

    public final void v(int i, int i2, int i3, int i5) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(d.n("Invalid flex direction: ", i));
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i5 = View.combineMeasuredStates(i5, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i5);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i5);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException(d.n("Unknown width mode is set: ", mode));
            }
            if (size < largestMainSize) {
                i5 = View.combineMeasuredStates(i5, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i5);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i5 = View.combineMeasuredStates(i5, 256);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i5);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i3, i5);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException(d.n("Unknown height mode is set: ", mode2));
            }
            if (size2 < paddingBottom) {
                i5 = View.combineMeasuredStates(i5, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i5);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.f98201a = 1;
            layoutParams3.f98202b = BitmapDescriptorFactory.HUE_RED;
            layoutParams3.f98203c = 1.0f;
            layoutParams3.d = -1;
            layoutParams3.e = -1.0f;
            layoutParams3.f = -1;
            layoutParams3.f98204g = -1;
            layoutParams3.f98205h = 16777215;
            layoutParams3.i = 16777215;
            layoutParams3.f98201a = layoutParams2.f98201a;
            layoutParams3.f98202b = layoutParams2.f98202b;
            layoutParams3.f98203c = layoutParams2.f98203c;
            layoutParams3.d = layoutParams2.d;
            layoutParams3.e = layoutParams2.e;
            layoutParams3.f = layoutParams2.f;
            layoutParams3.f98204g = layoutParams2.f98204g;
            layoutParams3.f98205h = layoutParams2.f98205h;
            layoutParams3.i = layoutParams2.i;
            layoutParams3.f98206j = layoutParams2.f98206j;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams4.f98201a = 1;
            layoutParams4.f98202b = BitmapDescriptorFactory.HUE_RED;
            layoutParams4.f98203c = 1.0f;
            layoutParams4.d = -1;
            layoutParams4.e = -1.0f;
            layoutParams4.f = -1;
            layoutParams4.f98204g = -1;
            layoutParams4.f98205h = 16777215;
            layoutParams4.i = 16777215;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        layoutParams5.f98201a = 1;
        layoutParams5.f98202b = BitmapDescriptorFactory.HUE_RED;
        layoutParams5.f98203c = 1.0f;
        layoutParams5.d = -1;
        layoutParams5.e = -1.0f;
        layoutParams5.f = -1;
        layoutParams5.f98204g = -1;
        layoutParams5.f98205h = 16777215;
        layoutParams5.i = 16777215;
        return layoutParams5;
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -1;
        this.o = new b(this);
        this.f98199p = new ArrayList();
        this.f98200q = new ihi.b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FlexboxLayout, i, 0);
        this.f98190a = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_flexDirection, 0);
        this.f98191b = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_flexWrap, 0);
        this.f98192c = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_justifyContent, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_alignItems, 0);
        this.e = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_alignContent, 0);
        this.f = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_maxLine, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_showDivider, 0);
        if (i2 != 0) {
            this.f98195j = i2;
            this.i = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_showDividerVertical, 0);
        if (i3 != 0) {
            this.f98195j = i3;
        }
        int i5 = typedArrayObtainStyledAttributes.getInt(R$styleable.FlexboxLayout_showDividerHorizontal, 0);
        if (i5 != 0) {
            this.i = i5;
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}

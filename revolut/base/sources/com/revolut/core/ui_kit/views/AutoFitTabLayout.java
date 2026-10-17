package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import es0.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.y0;
import mx0.z0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u001e\u0017B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0016\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0010R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/revolut/core/ui_kit/views/AutoFitTabLayout;", "Les0/b0;", "Lny0/o;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "value", "", "setReadableAreaGuidelinesEnabled", "(Z)V", "T", "Z", "getSuppressLayout", "()Z", "setSuppressLayout", "suppressLayout", "Lmx0/z0;", "onFittingStateChangedListener", "Lmx0/z0;", "getOnFittingStateChangedListener", "()Lmx0/z0;", "setOnFittingStateChangedListener", "(Lmx0/z0;)V", "mx0/y0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AutoFitTabLayout extends b0 implements ny0.o {

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public boolean suppressLayout;
    public final ny0.q U;
    public y0 V;
    public boolean W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f58347a0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoFitTabLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ny0.h
    public /* bridge */ boolean getFitsReadableArea() {
        return false;
    }

    public final z0 getOnFittingStateChangedListener() {
        return null;
    }

    public boolean getSuppressLayout() {
        return this.suppressLayout;
    }

    @Override // es0.b0
    public final boolean l(int i) {
        if (i > 0) {
            int paddingEnd = getPaddingEnd();
            int i2 = this.U.f220609g;
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            if (getPaddingStart() + i + (paddingEnd - i2) > getWidth()) {
                return true;
            }
        }
        return false;
    }

    @Override // es0.b0, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.U.d(i);
        View childAt = getChildAt(0);
        Intrinsics.i(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) childAt;
        int size = View.MeasureSpec.getSize(i);
        this.f58347a0 = 0;
        int childCount = viewGroup.getChildCount();
        int i3 = 0;
        int i5 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt2 = viewGroup.getChildAt(i3);
            childAt2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredWidth = childAt2.getMeasuredWidth() + this.f58347a0;
            this.f58347a0 = measuredWidth;
            if (measuredWidth >= size && i5 == 0) {
                this.W = measuredWidth - (this.f128794j * 2) < size;
                i5 = measuredWidth;
            }
            i3++;
        }
        y0 y0Var = new y0(this.W, this.f58347a0 <= size);
        if (!Intrinsics.f(this.V, y0Var)) {
            this.V = y0Var;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i5) {
        super.onScrollChanged(i, i2, i3, i5);
        if (this.W) {
            y0 y0Var = new y0(true, this.f58347a0 == getWidth() + i);
            if (Intrinsics.f(this.V, y0Var)) {
                return;
            }
            this.V = y0Var;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (getSuppressLayout()) {
            return;
        }
        super.requestLayout();
    }

    public final void setOnFittingStateChangedListener(z0 z0Var) {
    }

    public void setReadableAreaGuidelinesEnabled(boolean value) {
        this.U.e(value);
    }

    @Override // ny0.o
    public void setSuppressLayout(boolean z) {
        this.suppressLayout = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoFitTabLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoFitTabLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ny0.q qVar = new ny0.q(this);
        this.U = qVar;
        this.W = true;
        qVar.e(true);
    }

    public /* synthetic */ AutoFitTabLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}

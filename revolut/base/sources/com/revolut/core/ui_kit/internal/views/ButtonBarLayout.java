package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/ButtonBarLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "stacked", "", "setStacked", "(Z)V", "allowStacking", "setAllowStacking", "", "margin", "setChildMargin", "(I)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f56104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f56105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56106c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonBarLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56106c = -1;
        setGravity(17);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.uikit_ButtonBarLayout);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        ViewCompat.saveAttributeDataForStyleable(this, context, R$styleable.uikit_ButtonBarLayout, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        setAllowStacking(typedArrayObtainStyledAttributes.getBoolean(R$styleable.uikit_ButtonBarLayout_uikit_allowStacking, true));
        setChildMargin(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.uikit_ButtonBarLayout_uikit_childMargin, -1));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void setStacked(boolean stacked) {
        int childCount;
        if (this.f56105b != stacked && (!stacked || this.f56104a)) {
            this.f56105b = stacked;
            setOrientation(stacked ? 1 : 0);
        }
        if (this.f56106c < 0 || getChildCount() - 1 < 0) {
            return;
        }
        int i = 0;
        while (true) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (stacked) {
                layoutParams2.setMargins(0, 0, 0, i == childCount ? 0 : this.f56106c);
            } else {
                layoutParams2.setMargins(0, 0, 0, 0);
                layoutParams2.setMarginEnd(i == childCount ? 0 : this.f56106c);
            }
            if (i == childCount) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (getChildCount() == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int i3 = 0;
        setStacked(false);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (size == 0 || mode == 0) {
            int childCount = getChildCount();
            while (i3 < childCount) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i3).getLayoutParams();
                Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                ((LinearLayout.LayoutParams) layoutParams).weight = BitmapDescriptorFactory.HUE_RED;
                i3++;
            }
            return;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE);
        int childCount2 = getChildCount();
        int marginEnd = 0;
        int marginEnd2 = 0;
        for (int i5 = 0; i5 < childCount2; i5++) {
            View childAt = getChildAt(i5);
            childAt.measure(iMakeMeasureSpec, i2);
            int measuredWidth = childAt.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            int marginStart = measuredWidth + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart() : 0);
            ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
            marginEnd += marginStart + (layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd() : 0);
            ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
            int marginStart2 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginStart() : 0;
            ViewGroup.LayoutParams layoutParams5 = childAt.getLayoutParams();
            marginEnd2 += marginStart2 + (layoutParams5 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginEnd() : 0);
        }
        boolean z = true;
        if (marginEnd > paddingLeft) {
            if (this.f56104a) {
                setStacked(true);
            } else {
                z = false;
            }
        }
        int childCount3 = (paddingLeft - marginEnd2) / getChildCount();
        int childCount4 = getChildCount();
        while (i3 < childCount4) {
            View childAt2 = getChildAt(i3);
            ViewGroup.LayoutParams layoutParams6 = childAt2.getLayoutParams();
            Intrinsics.i(layoutParams6, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams6).weight = (z || childAt2.getMeasuredWidth() <= childCount3) ? 0.0f : 1.0f;
            i3++;
        }
        super.onMeasure(i, i2);
    }

    public final void setAllowStacking(boolean allowStacking) {
        if (this.f56104a != allowStacking) {
            this.f56104a = allowStacking;
            requestLayout();
        }
    }

    public final void setChildMargin(int margin) {
        if (this.f56106c != margin) {
            if (margin < 0) {
                margin = 0;
            }
            this.f56106c = margin;
            requestLayout();
        }
    }
}

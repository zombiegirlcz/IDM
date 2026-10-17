package com.revolut.core.ui_kit.internal.views.modal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR*\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010RF\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00122\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/modal/ModalTopSpacerView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "a", "I", "getMinimalHeight", "()I", "setMinimalHeight", "(I)V", "minimalHeight", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "getOnLayoutExtraHeightProvider", "()Lkotlin/jvm/functions/Function1;", "setOnLayoutExtraHeightProvider", "(Lkotlin/jvm/functions/Function1;)V", "onLayoutExtraHeightProvider", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ModalTopSpacerView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int minimalHeight;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Function1 onLayoutExtraHeightProvider;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModalTopSpacerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final int getMinimalHeight() {
        return this.minimalHeight;
    }

    public final Function1<Integer, Integer> getOnLayoutExtraHeightProvider() {
        return this.onLayoutExtraHeightProvider;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iIntValue;
        if (View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        int i3 = size - this.minimalHeight;
        if (i3 < 0) {
            i3 = 0;
        }
        Function1 function1 = this.onLayoutExtraHeightProvider;
        if (function1 == null || (iIntValue = ((Number) function1.invoke(Integer.valueOf(i3))).intValue()) < 0) {
            iIntValue = 0;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), f.g(this.minimalHeight + iIntValue, 0, size));
    }

    public final void setMinimalHeight(int i) {
        if (this.minimalHeight == i) {
            return;
        }
        this.minimalHeight = i;
        requestLayout();
    }

    public final void setOnLayoutExtraHeightProvider(Function1<? super Integer, Integer> function1) {
        if (this.onLayoutExtraHeightProvider == function1) {
            return;
        }
        this.onLayoutExtraHeightProvider = function1;
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModalTopSpacerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalTopSpacerView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModalTopSpacerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}

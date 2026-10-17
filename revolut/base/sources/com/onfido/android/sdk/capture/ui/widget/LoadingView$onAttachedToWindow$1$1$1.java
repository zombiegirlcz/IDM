package com.onfido.android.sdk.capture.ui.widget;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/ViewGroup$LayoutParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class LoadingView$onAttachedToWindow$1$1$1 extends u implements Function1<ViewGroup.LayoutParams, Unit> {
    final /* synthetic */ ValueAnimator $valueAnimator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingView$onAttachedToWindow$1$1$1(ValueAnimator valueAnimator) {
        super(1);
        this.$valueAnimator = valueAnimator;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((ViewGroup.LayoutParams) obj2);
        return Unit.f186387a;
    }

    public final void invoke(@NotNull ViewGroup.LayoutParams it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        Object animatedValue = this.$valueAnimator.getAnimatedValue();
        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        it8.width = iIntValue;
        it8.height = iIntValue;
    }
}

package com.onfido.android.sdk.capture.audio;

import android.animation.ValueAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/animation/ValueAnimator;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class ExpandablePillView$volumePillWidthAnimator$2 extends u implements Function0<ValueAnimator> {
    final /* synthetic */ ExpandablePillView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandablePillView$volumePillWidthAnimator$2(ExpandablePillView expandablePillView) {
        super(0);
        this.this$0 = expandablePillView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1$lambda$0(ExpandablePillView this$0, ValueAnimator it8) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it8, "it");
        Intrinsics.i(it8.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
        ExpandablePillView.setWithOptionals$default(this$0, this$0.volumePillRect, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ((Integer) r9).intValue(), BitmapDescriptorFactory.HUE_RED, 11, null);
        this$0.invalidate();
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ValueAnimator invoke() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.addUpdateListener(new a(this.this$0, 1));
        valueAnimator.setDuration(300L);
        return valueAnimator;
    }
}

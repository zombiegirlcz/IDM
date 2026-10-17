package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class HeadTurnProgressView$rightProgressAnimator$2 extends u implements Function0<ValueAnimator> {
    final /* synthetic */ HeadTurnProgressView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadTurnProgressView$rightProgressAnimator$2(HeadTurnProgressView headTurnProgressView) {
        super(0);
        this.this$0 = headTurnProgressView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1$lambda$0(HeadTurnProgressView this$0, ValueAnimator it8) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it8, "it");
        Object animatedValue = it8.getAnimatedValue();
        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.currentRightProgress = ((Float) animatedValue).floatValue();
        this$0.setupRightProgressForDrawing(this$0.currentRightProgress);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ValueAnimator invoke() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(new float[0]);
        HeadTurnProgressView headTurnProgressView = this.this$0;
        valueAnimatorOfFloat.setDuration(HeadTurnProgressView.ANIMATION_DURATION);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new a(headTurnProgressView, 1));
        return valueAnimatorOfFloat;
    }
}

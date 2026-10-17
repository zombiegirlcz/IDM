package com.onfido.android.sdk.capture.audio;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import com.onfido.android.sdk.capture.utils.listeners.AnimatorListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/animation/ValueAnimator;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class VolumeWarningView$volumePillHeightAnimator$2 extends u implements Function0<ValueAnimator> {
    final /* synthetic */ VolumeWarningView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VolumeWarningView$volumePillHeightAnimator$2(VolumeWarningView volumeWarningView) {
        super(0);
        this.this$0 = volumeWarningView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1$lambda$0(VolumeWarningView this$0, ValueAnimator it8) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it8, "it");
        Object animatedValue = it8.getAnimatedValue();
        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        int minHeight = this$0.getMinHeight() - iIntValue;
        ViewGroup.LayoutParams layoutParams = this$0.binding.speaker.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(minHeight, minHeight, layoutParams2.rightMargin, layoutParams2.bottomMargin);
        ViewExtensionsKt.changeLayoutParams((ViewGroup) this$0, (Function1<? super ViewGroup.LayoutParams, Unit>) new VolumeWarningView$volumePillHeightAnimator$2$1$1$1(iIntValue));
        this$0.binding.speaker.setLayoutParams(layoutParams2);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ValueAnimator invoke() {
        final ValueAnimator valueAnimator = new ValueAnimator();
        final VolumeWarningView volumeWarningView = this.this$0;
        valueAnimator.setIntValues(volumeWarningView.getMinHeight());
        valueAnimator.addUpdateListener(new a(volumeWarningView, 2));
        valueAnimator.setDuration(200L);
        valueAnimator.addListener(new AnimatorListener() { // from class: com.onfido.android.sdk.capture.audio.VolumeWarningView$volumePillHeightAnimator$2$1$2
            @Override // com.onfido.android.sdk.capture.utils.listeners.AnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
                AnimatorListener.DefaultImpls.onAnimationCancel(this, animator);
            }

            @Override // com.onfido.android.sdk.capture.utils.listeners.AnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (volumeWarningView.hasFinishedForwardAnimation(valueAnimator.getAnimatedFraction())) {
                    ViewGroup.LayoutParams layoutParams = volumeWarningView.getLayoutParams();
                    Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    VolumeWarningView volumeWarningView2 = volumeWarningView;
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, volumeWarningView.getActualTextHeight());
                    layoutParams3.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin);
                    volumeWarningView2.setLayoutParams(layoutParams3);
                    volumeWarningView.binding.pillView.setInitialShape(volumeWarningView.getMinHeight(), volumeWarningView.getMinHeight(), volumeWarningView.binding.speaker.getWidth() / 2.0f, volumeWarningView.binding.speaker.getHeight() / 2.0f);
                    volumeWarningView.binding.pillView.grow(Math.min(volumeWarningView.getTextHorizontalMargin() + volumeWarningView.getSpeakerSize() + volumeWarningView.getTextWidth(), volumeWarningView.getMaxTextWidth()), volumeWarningView.getActualTextHeight(), new VolumeWarningView$volumePillHeightAnimator$2$1$2$onAnimationEnd$2(volumeWarningView));
                }
            }

            @Override // com.onfido.android.sdk.capture.utils.listeners.AnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
                AnimatorListener.DefaultImpls.onAnimationRepeat(this, animator);
            }

            @Override // com.onfido.android.sdk.capture.utils.listeners.AnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
                AnimatorListener.DefaultImpls.onAnimationStart(this, animator);
            }
        });
        return valueAnimator;
    }
}

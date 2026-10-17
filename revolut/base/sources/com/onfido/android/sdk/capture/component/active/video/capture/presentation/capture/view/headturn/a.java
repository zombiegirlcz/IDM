package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HeadTurnProgressView f49894b;

    public /* synthetic */ a(HeadTurnProgressView headTurnProgressView, int i) {
        this.f49893a = i;
        this.f49894b = headTurnProgressView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49893a) {
            case 0:
                HeadTurnProgressView$leftProgressAnimator$2.invoke$lambda$1$lambda$0(this.f49894b, valueAnimator);
                break;
            default:
                HeadTurnProgressView$rightProgressAnimator$2.invoke$lambda$1$lambda$0(this.f49894b, valueAnimator);
                break;
        }
    }
}

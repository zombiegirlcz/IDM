package com.onfido.android.sdk.capture.internal.ui.overlay;

import android.animation.ValueAnimator;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Paint f49966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OverlayViewAnimations f49967c;

    public /* synthetic */ a(Paint paint, OverlayViewAnimations overlayViewAnimations, int i) {
        this.f49965a = i;
        this.f49966b = paint;
        this.f49967c = overlayViewAnimations;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49965a) {
            case 0:
                OverlayViewAnimations.animateStrokeWidth$lambda$5$lambda$4(this.f49966b, this.f49967c, valueAnimator);
                break;
            default:
                OverlayViewAnimations.animatePaintColorChange$lambda$3$lambda$2(this.f49966b, this.f49967c, valueAnimator);
                break;
        }
    }
}

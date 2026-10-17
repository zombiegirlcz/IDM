package com.onfido.android.sdk.capture.audio;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f49867b;

    public /* synthetic */ a(View view, int i) {
        this.f49866a = i;
        this.f49867b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49866a) {
            case 0:
                ExpandablePillView$extraHeightAnimator$2.invoke$lambda$1$lambda$0((ExpandablePillView) this.f49867b, valueAnimator);
                break;
            case 1:
                ExpandablePillView$volumePillWidthAnimator$2.invoke$lambda$1$lambda$0((ExpandablePillView) this.f49867b, valueAnimator);
                break;
            default:
                VolumeWarningView$volumePillHeightAnimator$2.invoke$lambda$1$lambda$0((VolumeWarningView) this.f49867b, valueAnimator);
                break;
        }
    }
}

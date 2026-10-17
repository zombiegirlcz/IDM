package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.FadeThroughDrawable;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49109b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f49108a = i;
        this.f49109b = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49108a) {
            case 0:
                ((View) this.f49109b).setAlpha(BitmapDescriptorFactory.HUE_RED);
                break;
            case 1:
                SearchViewAnimationHelper.lambda$addDrawerArrowDrawableAnimatorIfNeeded$3((DrawerArrowDrawable) this.f49109b, valueAnimator);
                break;
            default:
                SearchViewAnimationHelper.lambda$addFadeThroughDrawableAnimatorIfNeeded$4((FadeThroughDrawable) this.f49109b, valueAnimator);
                break;
        }
    }
}

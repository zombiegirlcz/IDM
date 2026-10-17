package zl;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes17.dex */
public final class l implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yl.h f323148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f323149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f323150c;

    public l(m mVar, yl.h hVar, boolean z) {
        this.f323150c = mVar;
        this.f323148a = hVar;
        this.f323149b = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        m mVar = this.f323150c;
        boolean z = mVar.f323151g;
        yl.h hVar = this.f323148a;
        boolean z3 = this.f323149b;
        if (z) {
            if (z3) {
                hVar.f314648a = iIntValue;
            } else {
                hVar.f314649b = iIntValue;
            }
        } else if (z3) {
            hVar.f314649b = iIntValue;
        } else {
            hVar.f314648a = iIntValue;
        }
        uc.d dVar = mVar.f323136b;
        if (dVar != null) {
            dVar.m(hVar);
        }
    }
}

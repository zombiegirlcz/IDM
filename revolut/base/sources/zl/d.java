package zl;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes17.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f323139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f323140b;

    public d(g gVar, f fVar) {
        this.f323140b = gVar;
        this.f323139a = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        g gVar = this.f323140b;
        yl.b bVar = gVar.i;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = e.f323141a[this.f323139a.ordinal()];
        if (i == 1) {
            bVar.f314639a = iIntValue;
        } else if (i == 2) {
            bVar.f314640b = iIntValue;
        } else if (i == 3) {
            bVar.f314641c = iIntValue;
        }
        uc.d dVar = gVar.f323136b;
        if (dVar != null) {
            dVar.m(bVar);
        }
    }
}

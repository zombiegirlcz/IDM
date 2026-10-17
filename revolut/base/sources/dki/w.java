package dki;

import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f115559b;

    public /* synthetic */ w(Object obj2, int i) {
        this.f115558a = i;
        this.f115559b = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animator) {
        switch (this.f115558a) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                View view = ((x) this.f115559b).e;
                Object animatedValue = animator.getAnimatedValue();
                Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                view.setBackgroundColor(((Integer) animatedValue).intValue());
                break;
            case 1:
                ((es0.b0) this.f115559b).scrollTo(((Integer) animator.getAnimatedValue()).intValue(), 0);
                break;
            case 2:
                zl.c cVar = (zl.c) this.f115559b;
                cVar.getClass();
                int iIntValue = ((Integer) animator.getAnimatedValue("ANIMATION_COLOR")).intValue();
                int iIntValue2 = ((Integer) animator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
                yl.a aVar = (yl.a) cVar.f323138g;
                aVar.f314637a = iIntValue;
                aVar.f314638b = iIntValue2;
                uc.d dVar = cVar.f323136b;
                if (dVar != null) {
                    dVar.m(aVar);
                }
                break;
            case 3:
                zl.h hVar = (zl.h) this.f115559b;
                hVar.getClass();
                int iIntValue3 = ((Integer) animator.getAnimatedValue("ANIMATION_COLOR")).intValue();
                int iIntValue4 = ((Integer) animator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
                int iIntValue5 = ((Integer) animator.getAnimatedValue("ANIMATION_RADIUS")).intValue();
                int iIntValue6 = ((Integer) animator.getAnimatedValue("ANIMATION_RADIUS_REVERSE")).intValue();
                int iIntValue7 = ((Integer) animator.getAnimatedValue("ANIMATION_STROKE")).intValue();
                int iIntValue8 = ((Integer) animator.getAnimatedValue("ANIMATION_STROKE_REVERSE")).intValue();
                yl.c cVar2 = hVar.f323144h;
                cVar2.f314637a = iIntValue3;
                cVar2.f314638b = iIntValue4;
                cVar2.f314642c = iIntValue5;
                cVar2.d = iIntValue6;
                cVar2.e = iIntValue7;
                cVar2.f = iIntValue8;
                uc.d dVar2 = hVar.f323136b;
                if (dVar2 != null) {
                    dVar2.m(cVar2);
                }
                break;
            case 4:
                zl.i iVar = (zl.i) this.f115559b;
                iVar.getClass();
                int iIntValue9 = ((Integer) animator.getAnimatedValue("ANIMATION_COLOR")).intValue();
                int iIntValue10 = ((Integer) animator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
                int iIntValue11 = ((Integer) animator.getAnimatedValue("ANIMATION_SCALE")).intValue();
                int iIntValue12 = ((Integer) animator.getAnimatedValue("ANIMATION_SCALE_REVERSE")).intValue();
                yl.d dVar3 = iVar.f323147j;
                dVar3.f314637a = iIntValue9;
                dVar3.f314638b = iIntValue10;
                dVar3.f314643c = iIntValue11;
                dVar3.d = iIntValue12;
                uc.d dVar4 = iVar.f323136b;
                if (dVar4 != null) {
                    dVar4.m(dVar3);
                }
                break;
            case 5:
                zl.c cVar3 = (zl.c) this.f115559b;
                cVar3.getClass();
                int iIntValue13 = ((Integer) animator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
                yl.e eVar = (yl.e) cVar3.f323138g;
                eVar.f314644a = iIntValue13;
                uc.d dVar5 = cVar3.f323136b;
                if (dVar5 != null) {
                    dVar5.m(eVar);
                }
                break;
            case 6:
                zl.c cVar4 = (zl.c) this.f115559b;
                cVar4.getClass();
                int iIntValue14 = ((Integer) animator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
                int iIntValue15 = ((Integer) animator.getAnimatedValue("ANIMATION_COORDINATE_REVERSE")).intValue();
                yl.f fVar = (yl.f) cVar4.f323138g;
                fVar.f314645a = iIntValue14;
                fVar.f314646b = iIntValue15;
                uc.d dVar6 = cVar4.f323136b;
                if (dVar6 != null) {
                    dVar6.m(fVar);
                }
                break;
            default:
                zl.k kVar = (zl.k) this.f115559b;
                yl.g gVar = kVar.i;
                gVar.f314647c = ((Integer) animator.getAnimatedValue()).intValue();
                uc.d dVar7 = kVar.f323136b;
                if (dVar7 != null) {
                    dVar7.m(gVar);
                }
                break;
        }
    }
}

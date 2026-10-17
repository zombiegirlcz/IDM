package wl;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import dki.w;
import ip0.z50;
import java.util.Iterator;
import l5i.q;
import uc.d;
import yl.e;
import yl.h;
import zl.c;
import zl.f;
import zl.g;
import zl.i;
import zl.j;
import zl.k;
import zl.m;

/* JADX INFO: loaded from: classes17.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f298337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f298338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zl.b f298339c;
    public cm.a d;
    public float e;
    public boolean f;

    public final void a() {
        g gVar;
        q qVar = this.f298337a;
        cm.a aVar = this.d;
        switch (a.f298336a[aVar.a().ordinal()]) {
            case 1:
                this.f298338b.m(null);
                break;
            case 2:
                int i = aVar.f25092j;
                int i2 = aVar.i;
                long j2 = aVar.f25096p;
                if (((c) qVar.f192296a) == null) {
                    qVar.f192296a = new c((d) qVar.f192301j);
                }
                c cVar = (c) qVar.f192296a;
                if (cVar.f323137c != null && (cVar.e != i2 || cVar.f != i)) {
                    cVar.e = i2;
                    cVar.f = i;
                    ((ValueAnimator) cVar.f323137c).setValues(cVar.e(false), cVar.e(true));
                }
                cVar.b(j2);
                if (this.f) {
                    cVar.f(this.e);
                } else {
                    cVar.c();
                }
                this.f298339c = cVar;
                break;
            case 3:
                int i3 = aVar.f25092j;
                int i5 = aVar.i;
                int i6 = aVar.f25087a;
                float f = aVar.f25091h;
                long j3 = aVar.f25096p;
                if (((i) qVar.f192297b) == null) {
                    qVar.f192297b = new i((d) qVar.f192301j);
                }
                i iVar = (i) qVar.f192297b;
                iVar.h(f, i5, i3, i6);
                iVar.b(j3);
                if (this.f) {
                    iVar.f(this.e);
                } else {
                    iVar.c();
                }
                this.f298339c = iVar;
                break;
            case 4:
                boolean z = aVar.k;
                int i21 = z ? aVar.f25098r : aVar.f25100t;
                int i22 = z ? aVar.f25099s : aVar.f25098r;
                int iH = g4i.a.h(aVar, i21);
                int iH2 = g4i.a.h(aVar, i22);
                boolean z3 = i22 > i21;
                int i32 = aVar.f25087a;
                long j5 = aVar.f25096p;
                if (((m) qVar.f192298c) == null) {
                    qVar.f192298c = new m((d) qVar.f192301j);
                }
                m mVar = (m) qVar.f192298c;
                h hVar = mVar.f323152h;
                if (mVar.d != iH || mVar.e != iH2 || mVar.f != i32 || mVar.f323151g != z3) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                    mVar.f323137c = animatorSet;
                    mVar.d = iH;
                    mVar.e = iH2;
                    mVar.f = i32;
                    mVar.f323151g = z3;
                    hVar.f314648a = iH - i32;
                    hVar.f314649b = iH + i32;
                    z50 z50VarD = mVar.d(z3);
                    long j16 = mVar.f323135a / 2;
                    ((AnimatorSet) mVar.f323137c).playSequentially(mVar.e(z50VarD.f167398a, z50VarD.f167399b, j16, false, hVar), mVar.e(z50VarD.f167400c, z50VarD.d, j16, true, hVar));
                }
                mVar.b(j5);
                if (this.f) {
                    mVar.f(this.e);
                } else {
                    mVar.c();
                }
                this.f298339c = mVar;
                break;
            case 5:
                int i33 = aVar.f25092j;
                int i43 = aVar.i;
                int i59 = aVar.f25087a;
                int i66 = aVar.f25090g;
                long j22 = aVar.f25096p;
                if (((zl.h) qVar.e) == null) {
                    zl.h hVar2 = new zl.h((d) qVar.f192301j);
                    hVar2.f323144h = new yl.c();
                    qVar.e = hVar2;
                }
                zl.h hVar3 = (zl.h) qVar.e;
                if (hVar3.f323137c != null && (hVar3.e != i43 || hVar3.f != i33 || hVar3.i != i59 || hVar3.f323145j != i66)) {
                    hVar3.e = i43;
                    hVar3.f = i33;
                    hVar3.i = i59;
                    hVar3.f323145j = i66;
                    ((ValueAnimator) hVar3.f323137c).setValues(hVar3.e(false), hVar3.e(true), hVar3.g(false), hVar3.g(true), hVar3.h(false), hVar3.h(true));
                }
                hVar3.b(j22);
                if (this.f) {
                    hVar3.f(this.e);
                } else {
                    hVar3.c();
                }
                this.f298339c = hVar3;
                break;
            case 6:
                boolean z4 = aVar.k;
                int i74 = z4 ? aVar.f25098r : aVar.f25100t;
                int i92 = z4 ? aVar.f25099s : aVar.f25098r;
                int iH3 = g4i.a.h(aVar, i74);
                int iH4 = g4i.a.h(aVar, i92);
                long j42 = aVar.f25096p;
                if (((c) qVar.d) == null) {
                    c cVar2 = new c((d) qVar.f192301j, 1);
                    cVar2.e = -1;
                    cVar2.f = -1;
                    cVar2.f323138g = new e();
                    qVar.d = cVar2;
                }
                c cVar3 = (c) qVar.d;
                if (cVar3.f323137c != null && (cVar3.e != iH3 || cVar3.f != iH4)) {
                    cVar3.e = iH3;
                    cVar3.f = iH4;
                    PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", iH3, iH4);
                    propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
                    ((ValueAnimator) cVar3.f323137c).setValues(propertyValuesHolderOfInt);
                }
                cVar3.b(j42);
                if (this.f) {
                    float f4 = this.e;
                    Animator animator = cVar3.f323137c;
                    if (animator != null) {
                        long j46 = (long) (f4 * cVar3.f323135a);
                        if (((ValueAnimator) animator).getValues() != null && ((ValueAnimator) cVar3.f323137c).getValues().length > 0) {
                            ((ValueAnimator) cVar3.f323137c).setCurrentPlayTime(j46);
                        }
                    }
                } else {
                    cVar3.c();
                }
                this.f298339c = cVar3;
                break;
            case 7:
                boolean z6 = aVar.k;
                int i96 = z6 ? aVar.f25098r : aVar.f25100t;
                int i99 = z6 ? aVar.f25099s : aVar.f25098r;
                int iH5 = g4i.a.h(aVar, i96);
                int iH6 = g4i.a.h(aVar, i99);
                boolean z11 = i99 > i96;
                int i100 = aVar.f25087a;
                long j47 = aVar.f25096p;
                if (((k) qVar.f) == null) {
                    k kVar = new k((d) qVar.f192301j);
                    kVar.i = new yl.g();
                    qVar.f = kVar;
                }
                k kVar2 = (k) qVar.f;
                if (kVar2.d != iH5 || kVar2.e != iH6 || kVar2.f != i100 || kVar2.f323151g != z11) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
                    kVar2.f323137c = animatorSet2;
                    kVar2.d = iH5;
                    kVar2.e = iH6;
                    kVar2.f = i100;
                    kVar2.f323151g = z11;
                    int i101 = i100 * 2;
                    yl.g gVar2 = kVar2.i;
                    gVar2.f314648a = iH5 - i100;
                    gVar2.f314649b = iH5 + i100;
                    gVar2.f314647c = i101;
                    z50 z50VarD2 = kVar2.d(z11);
                    double d = kVar2.f323135a;
                    long j57 = (long) (0.8d * d);
                    long j58 = (long) (d * 0.2d);
                    long j65 = (long) (d * 0.5d);
                    ValueAnimator valueAnimatorE = kVar2.e(z50VarD2.f167398a, z50VarD2.f167399b, j57, false, kVar2.i);
                    ValueAnimator valueAnimatorE2 = kVar2.e(z50VarD2.f167400c, z50VarD2.d, j57, true, kVar2.i);
                    valueAnimatorE2.setStartDelay(j58);
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i101, i100);
                    valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
                    valueAnimatorOfInt.setDuration(j65);
                    valueAnimatorOfInt.addUpdateListener(new w(kVar2, 7));
                    ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i100, i101);
                    valueAnimatorOfInt2.setInterpolator(new AccelerateDecelerateInterpolator());
                    valueAnimatorOfInt2.setDuration(j65);
                    valueAnimatorOfInt2.addUpdateListener(new w(kVar2, 7));
                    valueAnimatorOfInt2.setStartDelay(j65);
                    ((AnimatorSet) kVar2.f323137c).playTogether(valueAnimatorE, valueAnimatorE2, valueAnimatorOfInt, valueAnimatorOfInt2);
                }
                kVar2.b(j47);
                if (this.f) {
                    kVar2.g(this.e);
                } else {
                    kVar2.c();
                }
                this.f298339c = kVar2;
                break;
            case 8:
                boolean z12 = aVar.k;
                int i102 = z12 ? aVar.f25098r : aVar.f25100t;
                int i103 = z12 ? aVar.f25099s : aVar.f25098r;
                int iH7 = g4i.a.h(aVar, i102);
                int iH8 = g4i.a.h(aVar, i103);
                int i104 = aVar.d;
                int i105 = aVar.f25089c;
                if (aVar.b() != cm.b.HORIZONTAL) {
                    i104 = i105;
                }
                int i106 = aVar.f25087a;
                int i107 = (i106 * 3) + i104;
                int i108 = i104 + i106;
                long j69 = aVar.f25096p;
                if (((g) qVar.f192299g) == null) {
                    g gVar3 = new g((d) qVar.f192301j);
                    gVar3.i = new yl.b();
                    qVar.f192299g = gVar3;
                }
                g gVar4 = (g) qVar.f192299g;
                gVar4.b(j69);
                if (gVar4.d == iH7 && gVar4.e == iH8 && gVar4.f == i107 && gVar4.f323142g == i108 && gVar4.f323143h == i106) {
                    gVar = gVar4;
                } else {
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.setInterpolator(new AccelerateDecelerateInterpolator());
                    gVar4.f323137c = animatorSet3;
                    gVar4.d = iH7;
                    gVar4.e = iH8;
                    gVar4.f = i107;
                    gVar4.f323142g = i108;
                    gVar4.f323143h = i106;
                    int i109 = (int) (((double) i106) / 1.5d);
                    long j76 = gVar4.f323135a;
                    long j85 = j76 / 2;
                    ValueAnimator valueAnimatorD = gVar4.d(iH7, iH8, j76, f.Width);
                    gVar = gVar4;
                    f fVar = f.Height;
                    ValueAnimator valueAnimatorD2 = gVar.d(i107, i108, j85, fVar);
                    f fVar2 = f.Radius;
                    ((AnimatorSet) gVar.f323137c).play(valueAnimatorD2).with(gVar.d(i106, i109, j85, fVar2)).with(valueAnimatorD).before(gVar.d(i108, i107, j85, fVar)).before(gVar.d(i109, i106, j85, fVar2));
                }
                if (this.f) {
                    float f5 = this.e;
                    Animator animator2 = gVar.f323137c;
                    if (animator2 != null) {
                        long j100 = (long) (f5 * gVar.f323135a);
                        Iterator<Animator> it8 = ((AnimatorSet) animator2).getChildAnimations().iterator();
                        boolean z29 = false;
                        while (it8.hasNext()) {
                            ValueAnimator valueAnimator = (ValueAnimator) it8.next();
                            long duration = valueAnimator.getDuration();
                            long j101 = z29 ? j100 - duration : j100;
                            if (j101 >= 0) {
                                if (j101 >= duration) {
                                    j101 = duration;
                                }
                                if (valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                                    valueAnimator.setCurrentPlayTime(j101);
                                }
                                if (!z29 && duration >= gVar.f323135a) {
                                    z29 = true;
                                }
                            }
                        }
                    }
                } else {
                    gVar.c();
                }
                this.f298339c = gVar;
                break;
            case 9:
                boolean z31 = aVar.k;
                int i110 = z31 ? aVar.f25098r : aVar.f25100t;
                int i111 = z31 ? aVar.f25099s : aVar.f25098r;
                int iH9 = g4i.a.h(aVar, i110);
                int iH10 = g4i.a.h(aVar, i111);
                long j102 = aVar.f25096p;
                if (((c) qVar.f192300h) == null) {
                    c cVar4 = new c((d) qVar.f192301j, 2);
                    cVar4.e = -1;
                    cVar4.f = -1;
                    cVar4.f323138g = new yl.f();
                    qVar.f192300h = cVar4;
                }
                c cVar5 = (c) qVar.f192300h;
                if (cVar5.f323137c != null && (cVar5.e != iH9 || cVar5.f != iH10)) {
                    cVar5.e = iH9;
                    cVar5.f = iH10;
                    PropertyValuesHolder propertyValuesHolderOfInt2 = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", iH9, iH10);
                    propertyValuesHolderOfInt2.setEvaluator(new IntEvaluator());
                    PropertyValuesHolder propertyValuesHolderOfInt3 = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE_REVERSE", iH10, iH9);
                    propertyValuesHolderOfInt3.setEvaluator(new IntEvaluator());
                    ((ValueAnimator) cVar5.f323137c).setValues(propertyValuesHolderOfInt2, propertyValuesHolderOfInt3);
                }
                cVar5.b(j102);
                if (this.f) {
                    float f6 = this.e;
                    Animator animator3 = cVar5.f323137c;
                    if (animator3 != null) {
                        long j103 = (long) (f6 * cVar5.f323135a);
                        if (((ValueAnimator) animator3).getValues() != null && ((ValueAnimator) cVar5.f323137c).getValues().length > 0) {
                            ((ValueAnimator) cVar5.f323137c).setCurrentPlayTime(j103);
                        }
                    }
                } else {
                    cVar5.c();
                }
                this.f298339c = cVar5;
                break;
            case 10:
                int i112 = aVar.f25092j;
                int i113 = aVar.i;
                int i114 = aVar.f25087a;
                float f32 = aVar.f25091h;
                long j104 = aVar.f25096p;
                if (((j) qVar.i) == null) {
                    qVar.i = new j((d) qVar.f192301j);
                }
                j jVar = (j) qVar.i;
                jVar.h(f32, i113, i112, i114);
                jVar.b(j104);
                if (this.f) {
                    jVar.f(this.e);
                } else {
                    jVar.c();
                }
                this.f298339c = jVar;
                break;
        }
    }
}

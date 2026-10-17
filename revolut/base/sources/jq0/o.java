package jq0;

import android.animation.TimeAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ix0.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends TimeAnimator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f177377b;

    public /* synthetic */ o(p pVar, int i) {
        this.f177376a = i;
        this.f177377b = pVar;
    }

    @Override // android.animation.TimeAnimator, android.animation.ValueAnimator, android.animation.Animator
    public final void start() {
        switch (this.f177376a) {
            case 0:
                final p pVar = this.f177377b;
                float f = pVar.d;
                View view = pVar.f177378a;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (a.a(context) && view.isEnabled() && view.isClickable()) {
                    pVar.f177385m = null;
                    pVar.f177382h = false;
                    pVar.f177383j = false;
                    pVar.f177386n.removeCallbacks(pVar.o);
                    final float fFloatValue = ((Number) pVar.f177379b.invoke()).floatValue();
                    pVar.f177384l = fFloatValue;
                    if (fFloatValue != f) {
                        if (fFloatValue <= f) {
                            pVar.f177382h = true;
                            view.animate().scaleX(fFloatValue).scaleY(fFloatValue).setDuration(pVar.e).setInterpolator(pVar.f).withStartAction(new Runnable() { // from class: jq0.m
                                @Override // java.lang.Runnable
                                public final void run() {
                                    p pVar2 = pVar;
                                    c cVar = pVar2.f177381g;
                                    if (pVar2.f177380c) {
                                        RectF rectF = cVar.i;
                                        View view2 = cVar.f177340a;
                                        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view2.getWidth(), view2.getHeight());
                                        cVar.u = !((view2 instanceof ViewGroup ? (ViewGroup) view2 : null) == null ? false : cVar.a(r3, r3, rectF));
                                    } else {
                                        float f4 = fFloatValue;
                                        cVar.g(f4, f4, null);
                                    }
                                    jb3.l.s(pVar2.f177378a).a(e1.SCALE_ANIMATION, cVar.u);
                                }
                            }).withEndAction(new j(pVar, 2)).start();
                        } else {
                            SpringAnimation springAnimation = pVar.f177389r;
                            springAnimation.cancel();
                            pVar.i = false;
                            m0 m0Var = new m0();
                            m0Var.f186427a = fFloatValue;
                            jnf.d dVar = new jnf.d(m0Var, 3);
                            c cVar = pVar.f177381g;
                            if (pVar.f177380c) {
                                RectF rectF = cVar.i;
                                View view2 = cVar.f177340a;
                                rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view2.getWidth(), view2.getHeight());
                                cVar.u = !((view2 instanceof ViewGroup ? (ViewGroup) view2 : null) != null ? cVar.a(r3, r3, rectF) : false);
                            } else {
                                cVar.g(fFloatValue, fFloatValue, dVar);
                            }
                            jb3.l.s(view).a(e1.SCALE_ANIMATION, cVar.u);
                            float f4 = m0Var.f186427a;
                            pVar.f177384l = f4;
                            if (f4 != f) {
                                SpringForce springForce = pVar.f177387p;
                                springForce.setFinalPosition(f4);
                                springAnimation.setSpring(springForce);
                                springAnimation.setStartValue(view.getScaleX());
                                springAnimation.start();
                            } else {
                                pVar.a();
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                p pVar2 = this.f177377b;
                View view3 = pVar2.f177378a;
                Context context2 = view3.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                if (!a.a(context2)) {
                    pVar2.a();
                } else {
                    float f5 = pVar2.f177384l;
                    float f6 = pVar2.d;
                    if (f5 > f6) {
                        float fA = j6.a.a(f5, f6, 0.1f, f6);
                        if (view3.getScaleX() < fA) {
                            pVar2.k = fA;
                            pVar2.f177383j = true;
                        } else {
                            pVar2.i = true;
                            SpringAnimation springAnimation2 = pVar2.f177389r;
                            springAnimation2.cancel();
                            springAnimation2.setSpring(pVar2.f177388q);
                            springAnimation2.setStartValue(view3.getScaleX());
                            springAnimation2.start();
                        }
                    } else if (pVar2.f177382h) {
                        pVar2.f177385m = new j(pVar2, 1);
                    } else if (view3.getScaleX() == f6 && view3.getScaleY() == f6) {
                        pVar2.a();
                    } else {
                        pVar2.b();
                    }
                }
                break;
        }
    }
}

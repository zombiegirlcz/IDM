package com.revolut.core.ui_kit.internal.views.floatingbottombar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.Interpolator;
import au0.s4;
import az0.o0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.drawables.FloatingBottomBarDrawable;
import com.revolut.core.ui_kit.internal.views.box.ShadowLayout;
import com.revolut.core.ui_kit.internal.views.floatingbottombar.FloatingBottomTabView;
import ix0.i1;
import java.util.ArrayList;
import java.util.Iterator;
import jq0.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ms0.q;
import mt0.p;
import mx0.n6;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    @NotNull
    private static final mt0.l Companion = new mt0.l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShadowLayout f57048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f57049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FloatingBottomBarExpandedView f57050c;
    public final FloatingBottomBarDrawable d;
    public final mm7.h e;
    public final Function0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n6 f57051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f57052h;
    public View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f57053j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f57054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f57055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ValueAnimator f57056n;
    public p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fu0.a f57057p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f57058q;

    public a(ShadowLayout container, View collapsedContent, FloatingBottomBarExpandedView expandedView, int i, FloatingBottomBarDrawable floatingBottomBarDrawable, mm7.h onExpandedStateChanged, mt0.h hVar, n6 tabViewsProvider) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(collapsedContent, "collapsedContent");
        Intrinsics.checkNotNullParameter(expandedView, "expandedView");
        Intrinsics.checkNotNullParameter(onExpandedStateChanged, "onExpandedStateChanged");
        Intrinsics.checkNotNullParameter(tabViewsProvider, "tabViewsProvider");
        this.f57048a = container;
        this.f57049b = collapsedContent;
        this.f57050c = expandedView;
        this.d = floatingBottomBarDrawable;
        this.e = onExpandedStateChanged;
        this.f = hVar;
        this.f57051g = tabViewsProvider;
        this.f57055m = new Object();
        this.o = new p(f0.f322471a, i - 1, null);
        this.f57057p = new fu0.a(3, this, false);
        this.f57058q = w.y0(new mt0.k(this, 3));
    }

    public final void a(View view, float f, long j2, Function0 function0, mt0.k kVar) {
        ValueAnimator valueAnimator = this.f57056n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object token = this.f57055m;
        Intrinsics.checkNotNullParameter(token, "token");
        ks0.l.Companion.getClass();
        ks0.l lVarA = ks0.j.a(view);
        Float fB = lVarA.b(token);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fB != null ? fB.floatValue() : 1.0f, f);
        valueAnimatorOfFloat.setDuration(j2);
        valueAnimatorOfFloat.setInterpolator(r.f177393b);
        valueAnimatorOfFloat.addUpdateListener(new jji.d(lVarA, 1, token, function0));
        if (kVar != null) {
            valueAnimatorOfFloat.addListener(new s4(kVar, 4));
        }
        valueAnimatorOfFloat.start();
        this.f57056n = valueAnimatorOfFloat;
    }

    public final void b(String str, boolean z) {
        Object obj2;
        Iterator it8 = this.f57051g.f209856b.f58579n.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            FloatingBottomTabView.DisplayedItemModel displayedItem = ((FloatingBottomTabView) next).getDisplayedItem();
            if (Intrinsics.f(displayedItem != null ? displayedItem.f57043a : null, str)) {
                obj2 = next;
                break;
            }
        }
        FloatingBottomTabView floatingBottomTabView = (FloatingBottomTabView) obj2;
        if (floatingBottomTabView != null) {
            floatingBottomTabView.f0(z);
        }
    }

    public final void c() {
        a(this.f57048a, 1.0f, 300L, new mt0.k(this, 4), null);
        ArrayList arrayList = this.f57051g.f209856b.f58579n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((FloatingBottomTabView) arrayList.get(i)).f0(false);
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(boolean z) {
        AnimatorSet animatorSet;
        Window window;
        if (this.f57052h == z) {
            return;
        }
        this.f57052h = z;
        this.e.invoke(Boolean.valueOf(z));
        this.f57057p.setEnabled(z);
        int i = 9;
        if (z) {
            this.f57050c.setModel(this.o);
            ShadowLayout shadowLayout = this.f57048a;
            Context context = shadowLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Activity activityI = z92.f.i(context);
            if (activityI != null && (window = activityI.getWindow()) != null) {
                View decorView = window.getDecorView();
                Intrinsics.i(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) decorView;
                View view = this.i;
                if (view == null) {
                    view = new View(shadowLayout.getContext());
                    view.setImportantForAccessibility(2);
                    view.setOnTouchListener(new gzl.b(this, i));
                }
                this.i = view;
                if (view.getParent() == null) {
                    viewGroup.addView(view, new ViewGroup.LayoutParams(-1, -1));
                }
            }
        } else {
            View view2 = this.i;
            if (view2 != null) {
                ViewParent parent = view2.getParent();
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(view2);
                }
            }
        }
        final mt0.g gVar = (mt0.g) this.f57058q.getValue();
        final int i2 = 1;
        f1.f onComplete = new f1.f(this, z, 1);
        mt0.k onUpdate = new mt0.k(this, 0);
        ShadowLayout shadowLayout2 = gVar.f208693a;
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
        gVar.f208698j = onUpdate;
        AnimatorSet animatorSet2 = gVar.f208696g;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        int height = gVar.f208694b.getHeight();
        Integer numValueOf = height > 0 ? Integer.valueOf(height) : null;
        gVar.f208697h = numValueOf != null ? numValueOf.intValue() : gVar.b(true);
        gVar.i = gVar.b(false);
        Context context2 = shadowLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (!jq0.a.a(context2)) {
            if (z) {
                gVar.d();
            } else {
                gVar.c();
            }
            onComplete.invoke();
            return;
        }
        if (z) {
            animatorSet = new AnimatorSet();
            Rect rect = new Rect(shadowLayout2.getLeft(), shadowLayout2.getTop(), shadowLayout2.getWidth() + shadowLayout2.getLeft(), shadowLayout2.getHeight() + shadowLayout2.getTop());
            Rect rect2 = new Rect(rect);
            rect2.bottom = rect2.top + gVar.i;
            Float fB = gVar.f.b(gVar.e);
            float fFloatValue = fB != null ? fB.floatValue() : 1.0f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat.setDuration(100L);
            Interpolator interpolator = r.f177392a;
            valueAnimatorOfFloat.setInterpolator(interpolator);
            float fHeight = rect.height() * 0.77f;
            float fCenterX = rect.centerX();
            float fWidth = (rect.width() * 0.77f) / 2;
            int i3 = rect.bottom;
            Rect rect3 = new Rect((int) (fCenterX - fWidth), (int) (i3 - fHeight), (int) (fCenterX + fWidth), i3);
            valueAnimatorOfFloat.addListener(new mt0.c(gVar, 4));
            gVar.a(valueAnimatorOfFloat, new q(fFloatValue, gVar));
            valueAnimatorOfFloat.addListener(new o0(gVar, rect3, 9));
            Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat2.setDuration(300L);
            valueAnimatorOfFloat2.setInterpolator(interpolator);
            valueAnimatorOfFloat2.addListener(new byl.i(gVar, 5, valueAnimatorOfFloat2, rect2));
            Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat2, "apply(...)");
            animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            animatorSet.addListener(new mt0.f(onComplete, gVar, 0));
            animatorSet.start();
        } else {
            animatorSet = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 1.02f);
            valueAnimatorOfFloat3.setDuration(200L);
            Interpolator interpolator2 = r.f177392a;
            valueAnimatorOfFloat3.setInterpolator(interpolator2);
            valueAnimatorOfFloat3.addListener(new mt0.c(gVar, 0));
            final int i5 = 2;
            gVar.a(valueAnimatorOfFloat3, new ValueAnimator.AnimatorUpdateListener() { // from class: mt0.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i5) {
                        case 0:
                            float fB2 = i1.b(0.96f, 1.0f, ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                            g gVar2 = gVar;
                            ks0.l.d(gVar2.f, gVar2.e, null, Float.valueOf(fB2), Float.valueOf(fB2), 6);
                            break;
                        case 1:
                            float fFloatValue2 = ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            float fB3 = i1.b(1.0f, 0.96f, fFloatValue2);
                            g gVar3 = gVar;
                            ks0.l.d(gVar3.f, gVar3.e, null, Float.valueOf(fB3), Float.valueOf(fB3), 6);
                            gVar3.f208694b.setAlpha(i1.b(BitmapDescriptorFactory.HUE_RED, 1.0f, fFloatValue2));
                            break;
                        default:
                            Float f = (Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float");
                            g gVar4 = gVar;
                            ks0.l.d(gVar4.f, gVar4.e, null, f, f, 6);
                            break;
                    }
                }
            });
            Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat3, "apply(...)");
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat4.setDuration(200L);
            valueAnimatorOfFloat4.setInterpolator(interpolator2);
            valueAnimatorOfFloat4.addListener(new o0(gVar, valueAnimatorOfFloat4, 8));
            valueAnimatorOfFloat4.addListener(new mt0.c(gVar, 3));
            Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat4, "apply(...)");
            ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat5.setDuration(200L);
            valueAnimatorOfFloat5.setInterpolator(interpolator2);
            valueAnimatorOfFloat5.addListener(new mt0.c(gVar, 2));
            gVar.a(valueAnimatorOfFloat5, new ValueAnimator.AnimatorUpdateListener() { // from class: mt0.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i2) {
                        case 0:
                            float fB2 = i1.b(0.96f, 1.0f, ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                            g gVar2 = gVar;
                            ks0.l.d(gVar2.f, gVar2.e, null, Float.valueOf(fB2), Float.valueOf(fB2), 6);
                            break;
                        case 1:
                            float fFloatValue2 = ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            float fB3 = i1.b(1.0f, 0.96f, fFloatValue2);
                            g gVar3 = gVar;
                            ks0.l.d(gVar3.f, gVar3.e, null, Float.valueOf(fB3), Float.valueOf(fB3), 6);
                            gVar3.f208694b.setAlpha(i1.b(BitmapDescriptorFactory.HUE_RED, 1.0f, fFloatValue2));
                            break;
                        default:
                            Float f = (Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float");
                            g gVar4 = gVar;
                            ks0.l.d(gVar4.f, gVar4.e, null, f, f, 6);
                            break;
                    }
                }
            });
            Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat5, "apply(...)");
            ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat6.setDuration(300L);
            valueAnimatorOfFloat6.setInterpolator(interpolator2);
            valueAnimatorOfFloat6.addListener(new mt0.c(gVar, 1));
            final int i6 = 0;
            gVar.a(valueAnimatorOfFloat6, new ValueAnimator.AnimatorUpdateListener() { // from class: mt0.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i6) {
                        case 0:
                            float fB2 = i1.b(0.96f, 1.0f, ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                            g gVar2 = gVar;
                            ks0.l.d(gVar2.f, gVar2.e, null, Float.valueOf(fB2), Float.valueOf(fB2), 6);
                            break;
                        case 1:
                            float fFloatValue2 = ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                            float fB3 = i1.b(1.0f, 0.96f, fFloatValue2);
                            g gVar3 = gVar;
                            ks0.l.d(gVar3.f, gVar3.e, null, Float.valueOf(fB3), Float.valueOf(fB3), 6);
                            gVar3.f208694b.setAlpha(i1.b(BitmapDescriptorFactory.HUE_RED, 1.0f, fFloatValue2));
                            break;
                        default:
                            Float f = (Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float");
                            g gVar4 = gVar;
                            ks0.l.d(gVar4.f, gVar4.e, null, f, f, 6);
                            break;
                    }
                }
            });
            Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat6, "apply(...)");
            animatorSet.playSequentially(valueAnimatorOfFloat3, valueAnimatorOfFloat4, valueAnimatorOfFloat5, valueAnimatorOfFloat6);
            animatorSet.addListener(new mt0.f(onComplete, gVar, 1));
            animatorSet.start();
        }
        gVar.f208696g = animatorSet;
    }
}

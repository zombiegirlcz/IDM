package jy0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.ViewCompat;
import androidx.transition.revolut.RevGhostViewFacade;
import au0.b5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig;
import iv0.s;
import ix0.i1;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx0.hd;
import mx0.wb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class m {

    @NotNull
    public static final h Companion = new h();
    public boolean A;
    public final Lazy B;
    public final Lazy C;
    public final Lazy D;
    public final boolean E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f179270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hd f179271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f179272c;
    public final wb d;
    public final Path e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HomeOverlayConfig f179273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Function0 f179274h;
    public final o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f179275j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f179276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f179277m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i f179278n;
    public Animator o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f179279p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f179280q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f179281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f179282s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f179283t;
    public gu0.a u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f179284w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public js0.f f179285x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RevGhostViewFacade f179286y;
    public j z;

    /* JADX WARN: Removed duplicated region for block: B:7:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(android.view.View r2, mx0.hd r3, android.view.View r4, mx0.wb r5, android.graphics.Path r6, boolean r7, com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig r8) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jy0.m.<init>(android.view.View, mx0.hd, android.view.View, mx0.wb, android.graphics.Path, boolean, com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig):void");
    }

    public static s i(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        s.Companion.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        ViewOutlineProvider outlineProvider = view.getOutlineProvider();
        s sVar = outlineProvider instanceof s ? (s) outlineProvider : new s(BitmapDescriptorFactory.HUE_RED, true);
        view.setOutlineProvider(sVar);
        if (!view.getClipToOutline()) {
            view.setClipToOutline(true);
        }
        return sVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(float f, s expandedViewOutlineProvider, float f4) {
        Intrinsics.checkNotNullParameter(expandedViewOutlineProvider, "expandedViewOutlineProvider");
        boolean zBooleanValue = ((Boolean) jo0.g.k.getValue()).booleanValue();
        o oVar = this.i;
        View view = this.f179272c;
        if (zBooleanValue) {
            oVar.f179295n = view.getHeight() + expandedViewOutlineProvider.e.bottom;
        }
        float f5 = oVar.f179294m;
        RectF rectF = oVar.o;
        float fB = i1.b(f5, oVar.f179295n, f);
        int width = view.getWidth();
        expandedViewOutlineProvider.f168698c = (int) fB;
        expandedViewOutlineProvider.d = width;
        float fB2 = f < f4 ? i1.b(oVar.f179296p, oVar.f179297q, f / f4) : i1.b(oVar.f179297q, oVar.f179298r, (f - f4) / (1 - f4));
        expandedViewOutlineProvider.f168696a = fB2 / view.getScaleY();
        if (view.getBackground() != null) {
            view.setElevation(this.f179275j * f);
        }
        view.invalidateOutline();
        RevGhostViewFacade revGhostViewFacade = this.f179286y;
        View view2 = this.f179270a;
        if (revGhostViewFacade != null && view2 != null && !(view2 instanceof n)) {
            i(view2).f168696a = fB2 / view2.getScaleY();
            view2.invalidateOutline();
        }
        wb wbVar = this.d;
        if (wbVar.f210088j == null || wbVar.i <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        if (!(wbVar.f210091n == 0 && wbVar.o == 0 && wbVar.f210092p == wbVar.f210089l && wbVar.f210093q == wbVar.f210090m) && (view2 instanceof n)) {
            return;
        }
        float f6 = wbVar.f210084b;
        rectF.left = f6;
        rectF.top = wbVar.f210083a;
        rectF.right = (wbVar.f210089l * wbVar.f210085c) + f6;
        rectF.bottom = (view.getScaleY() * fB) + view.getTranslationY();
        Path path = this.e;
        path.rewind();
        path.addRoundRect(rectF, fB2, fB2, Path.Direction.CW);
    }

    public final void b(float f) {
        wb wbVar = this.d;
        float f4 = 1 - f;
        float f5 = 2;
        wbVar.f210084b = wbVar.f + ((wbVar.f210089l * f4) / f5);
        wbVar.f210083a = wbVar.e + ((wbVar.f210090m * f4) / f5);
        wbVar.f210085c = f;
        this.f179271b.invalidate();
    }

    public final void c(float f, TimeInterpolator timeInterpolator, p pVar) {
        if (this.A) {
            l(false);
            pVar.a(f, timeInterpolator, this);
            wb snapshotProps = this.d;
            Intrinsics.checkNotNullParameter(snapshotProps, "snapshotProps");
            View view = this.f179272c;
            View view2 = this.f179270a;
            if (view2 != null) {
                float alpha = this.E ? 1.0f - view.getAlpha() : view.getAlpha() == 1.0f ? 0.0f : 1.0f;
                if (snapshotProps.f210088j != null && !this.v) {
                    view2.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    snapshotProps.d = alpha;
                } else if (this.f179286y != null) {
                    float f4 = snapshotProps.f210084b;
                    o oVar = this.i;
                    view2.setTranslationX(f4 - (oVar.f179288b - ((1.0f - oVar.f179287a) * snapshotProps.f210086g)));
                    view2.setTranslationY(snapshotProps.f210083a - (oVar.f179289c - ((1.0f - oVar.f179287a) * snapshotProps.f210087h)));
                    view2.setScaleX(snapshotProps.f210085c);
                    view2.setScaleY(snapshotProps.f210085c);
                    view2.setPivotX(BitmapDescriptorFactory.HUE_RED);
                    view2.setPivotY(BitmapDescriptorFactory.HUE_RED);
                    if (!this.v) {
                        view2.setAlpha(alpha);
                    }
                }
            }
            view.invalidate();
            this.f179271b.invalidate();
        }
    }

    public final void d() {
        wb wbVar = this.d;
        View view = this.f179272c;
        View view2 = this.f179270a;
        if (view2 != null) {
            wbVar.b(view2);
        } else {
            wbVar.a(view);
        }
        l(false);
        if (view2 != null && this.z == null) {
            this.z = new j(view2.getOutlineProvider(), view2.getClipToOutline(), wbVar.i);
        }
        hd hdVar = this.f179271b;
        int[] iArr = this.f179283t;
        hdVar.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationOnScreen(iArr);
        int translationX = iArr[0] - ((int) view.getTranslationX());
        int translationY = iArr[1] - ((int) view.getTranslationY());
        float scaleX = view.getScaleX() * view.getWidth();
        float f = wbVar.f210085c;
        o oVar = this.i;
        oVar.f179287a = f;
        oVar.f179288b = wbVar.f - i;
        oVar.f179289c = wbVar.e - i2;
        float f4 = wbVar.f210089l;
        float f5 = scaleX / f4;
        oVar.d = f5;
        oVar.e = (int) (((view.getWidth() - (f4 * f5)) / 2.0f) + (translationX - i));
        oVar.f = (int) (((view.getHeight() - (wbVar.f210090m * f5)) / 2.0f) + (translationY - i2));
        s sVarI = i(view);
        float f6 = wbVar.i;
        if (f6 <= BitmapDescriptorFactory.HUE_RED) {
            f6 = this.k;
        }
        oVar.f179296p = f6;
        oVar.f179297q = this.f179276l;
        oVar.f179298r = sVarI.f168696a;
        oVar.f179290g = (wbVar.f210089l * wbVar.f210085c) / view.getWidth();
        float width = view.getWidth() / (wbVar.f210089l / wbVar.f210090m);
        oVar.f179294m = width;
        float f32 = ((wbVar.f210090m * wbVar.f210085c) - (width * oVar.f179290g)) / 2.0f;
        oVar.f179291h = wbVar.f - translationX;
        oVar.i = (wbVar.e - translationY) + f32;
        oVar.f179292j = view.getScaleX();
        oVar.k = view.getTranslationX();
        oVar.f179293l = view.getTranslationY();
        oVar.f179295n = sVarI.a(view);
        view.setPivotX(BitmapDescriptorFactory.HUE_RED);
        view.setPivotY(BitmapDescriptorFactory.HUE_RED);
        if (view.getBackground() != null) {
            int i3 = this.f179277m;
            view.setOutlineAmbientShadowColor(i3);
            view.setOutlineSpotShadowColor(i3);
        }
    }

    public final void e() {
        View viewB;
        AppBarLayout appBarLayoutA;
        j jVar;
        boolean z = this.A;
        this.A = false;
        o oVar = this.i;
        oVar.f179287a = 1.0f;
        oVar.f179288b = 0;
        oVar.f179289c = 0;
        oVar.d = 1.0f;
        oVar.f179290g = BitmapDescriptorFactory.HUE_RED;
        oVar.f179291h = BitmapDescriptorFactory.HUE_RED;
        oVar.i = BitmapDescriptorFactory.HUE_RED;
        oVar.f179294m = BitmapDescriptorFactory.HUE_RED;
        oVar.f179295n = BitmapDescriptorFactory.HUE_RED;
        oVar.f179296p = BitmapDescriptorFactory.HUE_RED;
        oVar.f179298r = BitmapDescriptorFactory.HUE_RED;
        oVar.f179297q = BitmapDescriptorFactory.HUE_RED;
        wb wbVar = this.d;
        wbVar.f210083a = BitmapDescriptorFactory.HUE_RED;
        wbVar.f210084b = BitmapDescriptorFactory.HUE_RED;
        wbVar.f210085c = 1.0f;
        wbVar.d = 1.0f;
        wbVar.k = 0;
        View view = this.f179270a;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        View view2 = this.f179272c;
        view2.setAlpha(1.0f);
        view2.setElevation(BitmapDescriptorFactory.HUE_RED);
        view2.setPivotX(view2.getWidth() / 2.0f);
        view2.setPivotY(view2.getHeight() / 2.0f);
        view2.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        s sVarI = i(view2);
        sVarI.f168698c = -1;
        sVarI.d = -1;
        view2.invalidateOutline();
        if (view != null) {
            if (z && !(view instanceof n) && (jVar = this.z) != null) {
                ViewOutlineProvider viewOutlineProvider = jVar.f179264a;
                s sVar = viewOutlineProvider instanceof s ? (s) viewOutlineProvider : null;
                if (sVar != null) {
                    sVar.f168696a = jVar.f179266c;
                }
                view.setOutlineProvider(viewOutlineProvider);
                view.setClipToOutline(jVar.f179265b);
                view.invalidateOutline();
            }
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setPivotY(view.getHeight() / 2.0f);
            view.setPivotX(view.getWidth() / 2.0f);
            RevGhostViewFacade revGhostViewFacade = this.f179286y;
            if (revGhostViewFacade != null) {
                revGhostViewFacade.detach();
            }
            this.z = null;
        }
        Function0 function0 = this.f179274h;
        if (function0 != null) {
            function0.invoke();
        }
        this.f179278n = i.Default;
        Animator animator = this.o;
        if (animator != null) {
            animator.cancel();
        }
        this.o = null;
        this.v = false;
        js0.f fVar = this.f179285x;
        if (fVar != null && (appBarLayoutA = fVar.a()) != null) {
            appBarLayoutA.setLayerType(0, null);
        }
        js0.f fVar2 = this.f179285x;
        if (fVar2 != null && (viewB = fVar2.b()) != null) {
            viewB.setLayerType(0, null);
        }
        this.f179284w = false;
        this.f179285x = null;
        this.f179286y = null;
    }

    public final ValueAnimator f() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
        et0.c cVar = new et0.c(valueAnimator, this, new AccelerateDecelerateInterpolator(), 2);
        valueAnimator.addListener(cVar);
        valueAnimator.addUpdateListener(cVar);
        valueAnimator.setInterpolator(new LinearInterpolator());
        hd.Companion.getClass();
        valueAnimator.setDuration(hd.a.a(this.f179273g) ? 350L : 450L);
        return valueAnimator;
    }

    public final ValueAnimator g(float f, float f4, long j2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f4);
        valueAnimatorOfFloat.addUpdateListener(new b5(this, 21));
        valueAnimatorOfFloat.setDuration(j2);
        return valueAnimatorOfFloat;
    }

    public final void h() {
        View viewB;
        AppBarLayout appBarLayoutA;
        if (this.f179284w) {
            return;
        }
        View view = this.f179272c;
        if (view.isHardwareAccelerated()) {
            this.f179284w = true;
            js0.f fVarP = jb3.l.p(js0.f.Companion, view);
            this.f179285x = fVarP;
            if (fVarP != null && (appBarLayoutA = fVarP.a()) != null) {
                appBarLayoutA.setLayerType(2, null);
            }
            js0.f fVar = this.f179285x;
            if (fVar == null || (viewB = fVar.b()) == null) {
                return;
            }
            viewB.setLayerType(2, null);
        }
    }

    public final void j(float f, float f4, TimeInterpolator easing) {
        Intrinsics.checkNotNullParameter(easing, "easing");
        if (this.v) {
            if (this.f) {
                f4 = 1 - easing.getInterpolation(jq0.a.c(f, 0.2f));
            }
            wb wbVar = this.d;
            wbVar.d *= f4;
            o oVar = this.i;
            View view = this.f179270a;
            if (view != null) {
                view.setTranslationX(wbVar.f210084b - (oVar.f179288b - ((1.0f - oVar.f179287a) * wbVar.f210086g)));
            }
            if (view != null) {
                view.setTranslationY(wbVar.f210083a - (oVar.f179289c - ((1.0f - oVar.f179287a) * wbVar.f210087h)));
            }
            if (view != null) {
                view.setPivotY(BitmapDescriptorFactory.HUE_RED);
            }
            if (view != null) {
                view.setPivotX(BitmapDescriptorFactory.HUE_RED);
            }
            if (view != null) {
                view.setScaleX(wbVar.f210085c);
            }
            if (view != null) {
                view.setScaleY(wbVar.f210085c);
            }
            if (view != null) {
                view.setAlpha(1.0f);
            }
        }
    }

    public final void k() {
        gu0.a aVar;
        this.f179271b.setVisibility(0);
        h();
        gu0.a aVar2 = this.u;
        if (aVar2 != null) {
            aVar2.cancel();
        }
        Animator animator = this.o;
        if (animator != null) {
            animator.cancel();
        }
        View view = this.f179270a;
        if (view == null || (view.getWidth() > 0 && view.getHeight() > 0)) {
            d();
            this.A = true;
            return;
        }
        if (!ViewCompat.isLaidOut(view) || view.isLayoutRequested()) {
            aVar = new gu0.a(view, 2, this);
            view.addOnLayoutChangeListener(aVar);
        } else {
            d();
            this.A = true;
            aVar = null;
        }
        this.u = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x005c, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(boolean r15) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jy0.m.l(boolean):void");
    }
}

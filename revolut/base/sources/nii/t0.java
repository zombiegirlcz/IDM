package nii;

import android.R;
import android.app.Activity;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.OnBackPressedDispatcher;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusView;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.youTransactor.uCube.rpc.Constants;
import ix0.b2;
import kli.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class t0 extends tji.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f216222c;
    public final ViewGroup d;
    public rp0.s1 e;
    public y0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ifm.b f216223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f216224h;
    public boolean i;

    public t0(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.i(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup parentView = (ViewGroup) decorView;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        this.f216222c = activity;
        this.d = parentView;
        this.f216223g = new ifm.b();
        this.f216224h = v0.a.d("create(...)");
    }

    @Override // tji.i
    public final boolean a(tji.l dialogModel) {
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        return dialogModel instanceof y0;
    }

    @Override // tji.i
    public final void b() {
        j(true);
    }

    @Override // tji.i
    public final void c() {
        rp0.s1 s1Var = this.e;
        if (s1Var != null) {
            s1Var.f256166b.w();
        }
    }

    @Override // tji.i
    public final void d() {
    }

    @Override // tji.i
    public final void e() {
        super.e();
        j(true);
    }

    @Override // tji.i
    public final void f() {
        rp0.s1 s1Var = this.e;
        if (s1Var != null) {
            s1Var.f256166b.r();
        }
    }

    @Override // tji.i
    public final void i(tji.l lVar) {
        long integer;
        View decorView;
        Window window;
        OnBackPressedDispatcher onBackPressedDispatcher;
        Window window2;
        View decorView2;
        int i;
        rp0.s1 s1Var;
        y0 dialogModel = (y0) lVar;
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        m0 m0Var = dialogModel.f216244b;
        int i2 = 1;
        if (!m0Var.f()) {
            j(true);
        }
        y0 y0Var = this.f;
        AttributeSet attributeSet = null;
        m0 m0Var2 = y0Var != null ? y0Var.f216244b : null;
        boolean zC = s1.c(m0Var2, dialogModel.f216244b);
        if (m0Var.f() && zC) {
            y0 y0Var2 = this.f;
            m0 m0Var3 = y0Var2 != null ? y0Var2.f216244b : null;
            if (((m0Var3 instanceof c0) || (m0Var3 instanceof b0) || (m0Var3 instanceof t)) && (s1Var = this.e) != null) {
                s1Var.f256166b.l();
            }
        }
        this.f = dialogModel;
        ifm.b bVar = this.f216223g;
        bVar.d();
        rp0.s1 s1Var2 = this.e;
        int i3 = 6;
        int i5 = 0;
        if (s1Var2 == null) {
            s1Var2 = new rp0.s1(this.d, new StatusView(this.f216222c, attributeSet, i3, i5), m0Var.b());
            this.e = s1Var2;
        }
        StatusView statusView = s1Var2.f256166b;
        ihm.f f59715b = statusView.getF59715b();
        n0 n0Var = new n0(this, m0Var, i5);
        efm.r rVarOnErrorResumeNext = f59715b.onErrorResumeNext(new o0(0, new ne0.e(new BreadcrumbException(), 5)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new lhi.b(10, n0Var), new lhi.b(10, p0.f216204a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        te0.w.j0(bVar, cVarSubscribe);
        efm.r rVarN = statusView.n();
        n0 n0Var2 = new n0(this, m0Var, i2);
        efm.r rVarOnErrorResumeNext2 = rVarN.onErrorResumeNext(new o0(0, new ne0.e(new BreadcrumbException(), i3)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new lhi.b(10, n0Var2), new lhi.b(10, q0.f216207a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe2, "subscribe(...)");
        te0.w.j0(bVar, cVarSubscribe2);
        efm.r rVarP = statusView.p();
        n0 n0Var3 = new n0(m0Var, this);
        efm.r rVarOnErrorResumeNext3 = rVarP.onErrorResumeNext(new o0(0, new ne0.e(new BreadcrumbException(), 7)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new lhi.b(10, n0Var3), new lhi.b(10, r0.f216211a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe3, "subscribe(...)");
        te0.w.j0(bVar, cVarSubscribe3);
        efm.r rVarQ = statusView.q();
        n0 n0Var4 = new n0(this, m0Var, 3);
        efm.r rVarOnErrorResumeNext4 = rVarQ.onErrorResumeNext(new o0(0, new ne0.e(new BreadcrumbException(), 8)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new lhi.b(10, n0Var4), new lhi.b(10, s0.f216214a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe4, "subscribe(...)");
        te0.w.j0(bVar, cVarSubscribe4);
        s1.a(statusView, m0Var, m0Var2, bVar);
        s1Var2.i = m0Var.e();
        b2 b2Var = s1Var2.f256167c;
        ViewGroup viewGroup = s1Var2.f256165a;
        rp0.f0 f0Var = s1Var2.f;
        f0Var.b();
        rp0.o1 o1Var = s1Var2.f256169h;
        if (o1Var == rp0.o1.ANIMATING_HIDE || o1Var == rp0.o1.HIDDEN) {
            kotlin.jvm.internal.n0 n0Var5 = new kotlin.jvm.internal.n0();
            if (b2Var != null) {
                integer = 500;
            } else {
                boolean z = jo0.m.f176847a;
                integer = s1Var2.i().getResources().getInteger(R.integer.config_mediumAnimTime);
                jo0.k animationType = jo0.k.SHOW;
                Intrinsics.checkNotNullParameter(animationType, "animationType");
            }
            if (s1Var2.f256169h == rp0.o1.HIDDEN) {
                fu0.a aVar = s1Var2.f256168g;
                Activity activityG = s1Var2.g();
                if (activityG != null && (window2 = activityG.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
                    or0.u.b(decorView2, true, s1Var2.k);
                }
                f0Var.b();
                viewGroup.addView(s1Var2.j());
                aVar.remove();
                AppCompatActivity appCompatActivity = activityG instanceof AppCompatActivity ? (AppCompatActivity) activityG : null;
                if (appCompatActivity != null && (onBackPressedDispatcher = appCompatActivity.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher.addCallback(aVar);
                }
                b.a aVar2 = kli.b.Companion;
                ViewGroup viewGroupJ = s1Var2.j();
                aVar2.getClass();
                kli.b bVarA = b.a.a(viewGroupJ);
                if (bVarA != null) {
                    bVarA.a(s1Var2);
                }
                e0m.e.a(viewGroup);
                n0Var5.f186428a = 100L;
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = s1Var2.j().animate();
            viewPropertyAnimatorAnimate.alpha(1.0f);
            viewPropertyAnimatorAnimate.setListener(s1Var2.f256171l);
            viewPropertyAnimatorAnimate.setDuration(integer);
            long j2 = n0Var5.f186428a;
            if (j2 > 0) {
                viewPropertyAnimatorAnimate.setStartDelay(j2);
            }
            if (b2Var != null) {
                ViewGroup viewGroupJ2 = s1Var2.j();
                if (!viewGroupJ2.isLaidOut() || viewGroupJ2.isLayoutRequested()) {
                    viewGroupJ2.addOnLayoutChangeListener(new cli.u(s1Var2, 15));
                } else {
                    Activity activityG2 = s1Var2.g();
                    if (activityG2 == null || (window = activityG2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                        decorView = viewGroup;
                    }
                    View viewA = js0.d.a(b2Var, decorView);
                    int iC = viewA != null ? rim.d.c(knm.b.h(viewA, viewGroup)) : -1;
                    if (iC < 0 || !(s1Var2.f(iC) || s1Var2.e(iC))) {
                        statusView.setAllowSwipeToDismiss(false);
                        rp0.s1.a(s1Var2, 17);
                        s1Var2.b(0);
                    } else if (s1Var2.f(iC) && s1Var2.e(iC)) {
                        statusView.setAllowSwipeToDismiss(false);
                        s1Var2.b((iC - rim.d.c(knm.b.h(statusView.getTitleContainer(), statusView))) - (statusView.getTitleContainer().getMeasuredHeight() / 2));
                    } else if (!s1Var2.f(iC)) {
                        statusView.setAllowSwipeToDismiss(false);
                        rp0.s1.a(s1Var2, 48);
                        s1Var2.b(0);
                    } else if (!s1Var2.e(iC)) {
                        rp0.s1.a(s1Var2, 80);
                        s1Var2.b(0);
                    }
                }
            } else {
                ViewGroup viewGroupJ3 = s1Var2.j();
                if (!viewGroupJ3.isLaidOut() || viewGroupJ3.isLayoutRequested()) {
                    viewGroupJ3.addOnLayoutChangeListener(new rp0.r1(s1Var2, integer, n0Var5));
                } else {
                    float height = statusView.getHeight();
                    statusView.setTranslationY((height * 0.5f) + Math.abs(height - statusView.getTranslationY()));
                    statusView.animate().translationY(BitmapDescriptorFactory.HUE_RED).setInterpolator(new DecelerateInterpolator()).setDuration(integer).setStartDelay(n0Var5.f186428a).start();
                }
            }
            s1Var2.k(rp0.o1.ANIMATING_SHOW);
        }
        if (Intrinsics.f(s1Var2.f256170j, statusView.getF())) {
            i = 8;
        } else {
            i = 8;
            jh.d.f(s1Var2.i()).n0().d(statusView, new TextLocalisedClause(R$string.status_sheet_accessibility_label, null, null, 14), "status.sheet", statusView.getAnalyticsProduct(), statusView.getF());
            s1Var2.f256170j = statusView.getF();
        }
        if (zC) {
            if ((m0Var instanceof j0) && ((j0) m0Var).i() == h0.CONFETTI) {
                LottieImage lottieImage = dz0.a.b(LottieImage.INSTANCE);
                Intrinsics.checkNotNullParameter(lottieImage, "lottieImage");
                s1Var2.h().setVisibility(0);
                yy0.f.e(or0.u.k(s1Var2.h()).Q(), lottieImage, s1Var2.h(), null, null, 12);
                this.i = true;
            }
            if (!this.i) {
                LottieImage.Companion companion = LottieImage.INSTANCE;
                LottieImage lottieImage2 = dz0.a.b(companion);
                Intrinsics.checkNotNullParameter(lottieImage2, "lottieImage");
                s1Var2.h().setVisibility(i);
                yy0.f.e(or0.u.k(s1Var2.h()).Q(), LottieImage.Companion.a(companion, lottieImage2.f59955a, false, false, null, null, Constants.TAG_FC_SPEED_MODE), s1Var2.h(), null, null, 12);
                this.i = true;
            }
            s1.d(statusView, m0Var);
        }
    }

    public final void j(boolean z) {
        this.f216223g.d();
        rp0.s1 s1Var = this.e;
        if (s1Var != null) {
            s1Var.d(z);
        }
        this.e = null;
        this.f = null;
    }
}

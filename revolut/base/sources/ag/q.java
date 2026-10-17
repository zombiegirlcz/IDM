package ag;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import au0.x5;
import az0.o0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.common.base.Stopwatch;
import com.hcaptcha.sdk.HCaptchaError;
import com.hcaptcha.sdk.HCaptchaException;
import com.revolut.core.ui_kit.internal.views.navbar.HeaderWithBigTileLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.video.ZoomableFullScreenVideoView;
import com.revolut.feature.passcode.PasscodeScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealLoadingScreen;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import d9.e1;
import ecm.g1;
import ecm.m1;
import ecm.x0;
import gcm.b0;
import gcm.b3;
import gcm.c0;
import gcm.g2;
import gcm.h4;
import gcm.j4;
import gcm.k3;
import gcm.l5;
import gcm.m5;
import gcm.r0;
import gcm.r5;
import gcm.s3;
import gcm.x2;
import gcm.x4;
import gcm.z4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import kl.t1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n4d.a0;
import yp0.y;

/* JADX INFO: loaded from: classes17.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4720b;

    public /* synthetic */ q(ViewGroup viewGroup, int i, Object obj2) {
        this.f4719a = i;
        this.f4720b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean zA;
        View view;
        int i = 2;
        int i2 = 0;
        boolean z = true;
        char c2 = 1;
        switch (this.f4719a) {
            case 0:
                s sVar = (s) this.f4720b;
                synchronized (sVar) {
                    zA = sVar.a();
                    if (zA) {
                        synchronized (sVar) {
                            sVar.f4725b = true;
                        }
                    }
                }
                if (zA) {
                    if (new Date(sVar.f4733p.currentTimeMillis()).before(sVar.f4734q.i().f4738c)) {
                        sVar.h();
                        return;
                    }
                    df.d dVar = (df.d) sVar.k;
                    Task taskD = dVar.d();
                    Task taskC = dVar.c();
                    Task<TContinuationResult> taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskD, taskC}).continueWithTask(sVar.f4728h, new p(sVar, i2, taskD, taskC));
                    Tasks.whenAllComplete((Task<?>[]) new Task[]{taskContinueWithTask}).continueWith(sVar.f4728h, new abf.c(sVar, taskContinueWithTask, i));
                    return;
                }
                return;
            case 1:
                ap0.j jVar = (ap0.j) this.f4720b;
                if (jVar.F().isAttachedToWindow()) {
                    jVar.F().d();
                    return;
                }
                return;
            case 2:
                HeaderWithBigTileLayout headerWithBigTileLayout = (HeaderWithBigTileLayout) this.f4720b;
                ViewPager2 viewPager2 = headerWithBigTileLayout.F;
                if (headerWithBigTileLayout.f57270j.f169236c) {
                    int currentItem = viewPager2.getCurrentItem();
                    if (currentItem == headerWithBigTileLayout.k.f319395l.size() - 1) {
                        z = false;
                    } else {
                        i2 = currentItem + 1;
                    }
                    viewPager2.setCurrentItem(i2, z);
                    headerWithBigTileLayout.j0();
                    return;
                }
                return;
            case 3:
                PortfolioRevealLoadingScreen portfolioRevealLoadingScreen = (PortfolioRevealLoadingScreen) this.f4720b;
                View viewD2 = portfolioRevealLoadingScreen.D2();
                ScreenContentRecyclerView recyclerView = portfolioRevealLoadingScreen.d3().f174540c;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                koi.b bVarF = y.f(recyclerView, "portfolio_reveal_card");
                if (bVarF != null && (view = bVarF.itemView) != null) {
                    viewD2.getLocationOnScreen(new int[2]);
                    view.getLocationOnScreen(new int[2]);
                    view.setTranslationY(((((viewD2.getHeight() - view.getHeight()) / 2.0f) + r5[1]) - r1[1]) + view.getTranslationY());
                }
                View viewD22 = portfolioRevealLoadingScreen.D2();
                AnimatorSet animatorSetB = viewD22.isHardwareAccelerated() ? hx0.q.b(null, viewD22, "portfolio_reveal_card", hx0.o.REDUCED_SCALE) : null;
                if (animatorSetB == null) {
                    portfolioRevealLoadingScreen.d3().f174540c.setAlpha(1.0f);
                    b8f.n nVar = (b8f.n) portfolioRevealLoadingScreen.R.getValue();
                    nVar.H2(nVar.f13246t, new b73.h(26));
                    nVar.I2();
                    return;
                }
                portfolioRevealLoadingScreen.N = animatorSetB;
                animatorSetB.addListener(new o0(portfolioRevealLoadingScreen, animatorSetB, c2 == true ? 1 : 0));
                animatorSetB.start();
                portfolioRevealLoadingScreen.d3().f174540c.setAlpha(1.0f);
                return;
            case 4:
                io.a aVar = io.c.Companion;
                PasscodeScreen passcodeScreen = (PasscodeScreen) this.f4720b;
                Activity activityM2 = passcodeScreen.m2();
                aVar.getClass();
                io.a.b(activityM2);
                ((io.f) ((de9.x) passcodeScreen.T2()).u).d();
                return;
            case 5:
                ((Function0) this.f4720b).invoke();
                return;
            case 6:
                ((fk.a) this.f4720b).f135699b.setOnClickListener(null);
                return;
            case 7:
                ((gcm.o0) this.f4720b).f142789a.d();
                return;
            case 8:
                ((r0) this.f4720b).f142846c.f();
                return;
            case 9:
                g2 g2Var = (g2) this.f4720b;
                g2Var.f142652p = null;
                g2Var.i.a(ecm.f.INFO, "CONNECTING after backoff");
                g2.e(g2Var, ecm.r.CONNECTING);
                g2.f(g2Var);
                return;
            case 10:
                g2 g2Var2 = (g2) ((x5) this.f4720b).f9437c;
                s3 s3Var = g2Var2.f142654r;
                g2Var2.f142653q = null;
                g2Var2.f142654r = null;
                s3Var.c(ecm.g2.f124807m.g("InternalSubchannel closed transport due to address change"));
                return;
            case 11:
                k3 k3Var = ((b3) this.f4720b).f142589b;
                k3Var.f142719n.d();
                if (k3Var.f142726x) {
                    k3Var.f142725w.b();
                    return;
                }
                return;
            case 12:
                j4 j4Var = (j4) this.f4720b;
                j4Var.k = null;
                if (j4Var.f142696h.b()) {
                    j4Var.e();
                    return;
                }
                return;
            case 13:
                ((x0) ((h4) this.f4720b).f142674c).f();
                return;
            case 14:
                x4 x4Var = (x4) this.f4720b;
                if (!x4Var.f) {
                    x4Var.f142963g = null;
                    return;
                }
                Stopwatch stopwatch = x4Var.d;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long jElapsed = x4Var.e - stopwatch.elapsed(timeUnit);
                if (jElapsed > 0) {
                    x4Var.f142963g = x4Var.f142960a.schedule(new com.bumptech.glide.k(x4Var, 7), jElapsed, timeUnit);
                    return;
                }
                x4Var.f = false;
                x4Var.f142963g = null;
                x4Var.f142962c.run();
                return;
            case 15:
                x2 x2Var = ((z4) this.f4720b).f;
                x2Var.z = true;
                c0 c0Var = x2Var.u;
                gpk.c cVar = x2Var.f142952s;
                c0Var.c((ecm.g2) cVar.f145463a, (b0) cVar.f145464b, (m1) cVar.f145465c);
                return;
            case 16:
                et0.w wVar = (et0.w) this.f4720b;
                x2 x2Var2 = ((l5) wVar.d).f142763b;
                m5 m5Var = (m5) wVar.f129137c;
                g1 g1Var = x2.E;
                x2Var2.p(m5Var);
                return;
            case 17:
                x2 x2Var3 = ((l5) this.f4720b).f142763b;
                x2Var3.z = true;
                c0 c0Var2 = x2Var3.u;
                gpk.c cVar2 = x2Var3.f142952s;
                c0Var2.c((ecm.g2) cVar2.f145463a, (b0) cVar2.f145464b, (m1) cVar2.f145465c);
                return;
            case 18:
                ((r5) this.f4720b).b();
                return;
            case 19:
                et0.w wVar2 = (et0.w) this.f4720b;
                a0 a0Var = (a0) wVar2.f129136b;
                twg.c cVar3 = (twg.c) wVar2.f129137c;
                ihm.b bVar = (ihm.b) ((t1) a0Var.f212345b).f185240b;
                String manufacturer = (String) cVar3.f275017a;
                Intrinsics.checkNotNullExpressionValue(manufacturer, "manufacturer");
                String marketName = (String) cVar3.f275018b;
                Intrinsics.checkNotNullExpressionValue(marketName, "marketName");
                String model = (String) cVar3.d;
                Intrinsics.checkNotNullExpressionValue(model, "model");
                String codename = (String) cVar3.f275019c;
                Intrinsics.checkNotNullExpressionValue(codename, "codename");
                String strC = (String) cVar3.f275018b;
                if (TextUtils.isEmpty(strC)) {
                    strC = e1.c((String) cVar3.d);
                }
                Intrinsics.checkNotNullExpressionValue(strC, "getName(...)");
                bVar.onNext(new n80.a(manufacturer, marketName, model, codename, strC));
                return;
            case 20:
                iv0.d dVar2 = (iv0.d) this.f4720b;
                FrameLayout frameLayout = dVar2.f168667a;
                int size = dVar2.f168669c.size();
                if (size > 1) {
                    int i3 = (dVar2.d + 1) % size;
                    Clause clause = (Clause) dVar2.f168669c.get(i3);
                    dVar2.d = i3;
                    ty0.c.c(or0.u.k(frameLayout).b0(), clause, dVar2.f168668b);
                    frameLayout.postDelayed(this, 4000L);
                    return;
                }
                return;
            case 21:
                ZoomableFullScreenVideoView zoomableFullScreenVideoView = (ZoomableFullScreenVideoView) this.f4720b;
                zoomableFullScreenVideoView.f59758p = null;
                if (zoomableFullScreenVideoView.isAttachedToWindow()) {
                    zoomableFullScreenVideoView.d = false;
                    if (zoomableFullScreenVideoView.f59750b) {
                        zoomableFullScreenVideoView.f(false);
                    } else {
                        zoomableFullScreenVideoView.g(1);
                    }
                    zoomableFullScreenVideoView.invalidate();
                    return;
                }
                return;
            case 22:
                Iterator it8 = ((com.hcaptcha.sdk.a) this.f4720b).d.iterator();
                while (it8.hasNext()) {
                    ((ji.a) it8.next()).a(new HCaptchaException(HCaptchaError.TOKEN_TIMEOUT, null));
                }
                return;
            case 23:
                BaseScreen baseScreen = (BaseScreen) this.f4720b;
                if (baseScreen.o) {
                    View currentFocus = baseScreen.m2().getCurrentFocus();
                    if (currentFocus != null) {
                        com.bumptech.glide.c.A(currentFocus, 0L);
                        return;
                    }
                    return;
                }
                View currentFocus2 = baseScreen.m2().getCurrentFocus();
                if (currentFocus2 != null) {
                    currentFocus2.clearFocus();
                }
                com.bumptech.glide.c.A(baseScreen.D2(), 400L);
                return;
            case 24:
                joi.m mVar = (joi.m) this.f4720b;
                joi.j jVar2 = mVar.e;
                if (jVar2 == null || jVar2.f177101b != this) {
                    return;
                }
                mVar.e = null;
                joi.f fVarA = jVar2.a(mVar.f177109h);
                if (fVarA == null) {
                    return;
                }
                joi.f fVar = mVar.d;
                if ((fVar != null ? fVar.f177095b : null) != fVarA.f177095b) {
                    mVar.e();
                }
                mVar.d(jVar2.f177100a, fVarA, jVar2.f177102c, jVar2.d);
                return;
            case 25:
                throw ((Throwable) this.f4720b);
            case 26:
                a5h.g gVar = (a5h.g) this.f4720b;
                com.bumptech.glide.g gVar2 = (com.bumptech.glide.g) gVar.d;
                com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) gVar.e;
                ((Lock) tVar.f49544c).lock();
                try {
                    if (!Collections.unmodifiableSet(gVar2.f26094a.keySet()).containsAll(tVar.c())) {
                        String[] list = ((oj.a) tVar.f49543b).f225708a.list();
                        if (list == null) {
                            list = oj.a.f225707c;
                        }
                        ArrayList<qj.a> arrayList = new ArrayList(list.length);
                        int length = list.length;
                        while (i2 < length) {
                            arrayList.add(tVar.d(((lj.c) tVar.d).d(list[i2])));
                            i2++;
                        }
                        for (qj.a aVar2 : arrayList) {
                            String str = aVar2.f246753b;
                            gVar2.f26094a.put(str, ((ie.a) gVar.f).a(str, aVar2.f246754c));
                            ((Set) ((ecm.q) gVar.f1407c).f124861b).add(str);
                            break;
                        }
                    }
                    return;
                } finally {
                    tVar.m();
                }
            case 27:
                ViewController viewController = (ViewController) this.f4720b;
                if (viewController.o) {
                    View currentFocus3 = viewController.m2().getCurrentFocus();
                    if (currentFocus3 != null) {
                        com.bumptech.glide.c.A(currentFocus3, 0L);
                        return;
                    }
                    return;
                }
                View currentFocus4 = viewController.m2().getCurrentFocus();
                if (currentFocus4 != null) {
                    currentFocus4.clearFocus();
                }
                com.bumptech.glide.c.A(viewController.D2(), 400L);
                return;
            case 28:
                pgm.n nVar2 = (pgm.n) this.f4720b;
                try {
                    nVar2.f236110a.onComplete();
                    return;
                } finally {
                    nVar2.d.dispose();
                }
            default:
                rr0.g gVar3 = (rr0.g) this.f4720b;
                gVar3.f256624q = null;
                gVar3.e(false);
                return;
        }
    }

    public /* synthetic */ q(Object obj2, int i) {
        this.f4719a = i;
        this.f4720b = obj2;
    }

    public q(Function0 function) {
        this.f4719a = 5;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f4720b = function;
    }
}

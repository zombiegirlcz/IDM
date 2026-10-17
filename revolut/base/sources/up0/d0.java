package up0;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import au0.c4;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx0.g4;
import ux0.s0;

/* JADX INFO: loaded from: classes19.dex */
public final class d0 {

    @NotNull
    private static final c0 Companion = new c0();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f281688s = new b(400, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h01.g f281689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f281690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f281691c;
    public final o d;
    public s0 e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RectF f281692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RectF f281693h;
    public RectF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f281694j;
    public gu0.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c4 f281695l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ifm.c f281696m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h01.c f281697n;
    public b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f281698p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b0 f281699q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b0 f281700r;

    /* JADX WARN: Type inference failed for: r4v7, types: [up0.b0] */
    /* JADX WARN: Type inference failed for: r4v8, types: [up0.b0] */
    public d0(Context context) {
        ts0.t particlesViewFactory = new ts0.t(context, 1);
        h01.g sensitiveDataManager = jh.d.f(context).Z();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(particlesViewFactory, "particlesViewFactory");
        Intrinsics.checkNotNullParameter(sensitiveDataManager, "sensitiveDataManager");
        this.f281689a = sensitiveDataManager;
        this.f281690b = te0.w.y0(particlesViewFactory);
        this.f281691c = te0.w.y0(new tyl.a(this, 26));
        this.d = new o(new qr0.i(this, 26));
        final int i = 0;
        this.f281699q = new Runnable(this) { // from class: up0.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f281681b;

            {
                this.f281681b = this;
            }

            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                switch (i) {
                    case 0:
                        d0 d0Var = this.f281681b;
                        o oVar = d0Var.d;
                        s0 s0Var = d0Var.e;
                        if (s0Var != null && d0Var.f && oVar.c() && s0Var.getParticlesInteractionView().isAttachedToWindow() && s0Var.getParticlesParent().isAttachedToWindow()) {
                            gu0.a aVar = null;
                            c4 c4Var = null;
                            if (s0Var.getParticlesParent().isLaidOut() && !s0Var.getParticlesParent().isLayoutRequested()) {
                                if (d0Var.e().getView().getParent() != s0Var.getParticlesParent()) {
                                    d0Var.d();
                                    s0Var.getParticlesParent().addView(d0Var.e().getView(), new ViewGroup.LayoutParams(-1, -1));
                                }
                                s sVar = (s) d0Var.f281691c.getValue();
                                View interactionView = s0Var.getParticlesInteractionView();
                                sVar.getClass();
                                Intrinsics.checkNotNullParameter(interactionView, "interactionView");
                                sVar.f281759b = interactionView;
                                c4 c4Var2 = d0Var.f281695l;
                                if (c4Var2 != null) {
                                    c4Var2.cancel();
                                }
                                d0Var.f281695l = null;
                                View particlesSceneView = s0Var.getParticlesSceneView();
                                if (particlesSceneView != null) {
                                    if (!ViewCompat.isLaidOut(particlesSceneView) || particlesSceneView.isLayoutRequested()) {
                                        c4Var = new c4(particlesSceneView, d0Var, s0Var, particlesSceneView, 3);
                                        particlesSceneView.addOnLayoutChangeListener(c4Var);
                                    } else {
                                        d0Var.f281695l = null;
                                        d0.a(d0Var, s0Var, particlesSceneView);
                                    }
                                    d0Var.f281695l = c4Var;
                                } else {
                                    d0Var.e().setSceneCenter(null, null);
                                    n nVar = oVar.f281749b;
                                    k kVar = nVar instanceof k ? (k) nVar : null;
                                    if (kVar != null) {
                                        a0 a0Var = kVar.f281727a;
                                        if (a0Var == null) {
                                            oVar.f281749b = i.f281716a;
                                        } else {
                                            oVar.a(a0Var.f281676c, p0.ACCOUNT_SWITCH_IN);
                                            oVar.f281749b = new m(a0Var);
                                        }
                                    }
                                    d0Var.b(s0Var);
                                }
                            } else {
                                gu0.a aVar2 = d0Var.k;
                                if (aVar2 != null) {
                                    aVar2.cancel();
                                }
                                ViewGroup particlesParent = s0Var.getParticlesParent();
                                if (!ViewCompat.isLaidOut(particlesParent) || particlesParent.isLayoutRequested()) {
                                    aVar = new gu0.a(particlesParent, 7, d0Var);
                                    particlesParent.addOnLayoutChangeListener(aVar);
                                } else {
                                    d0Var.k = null;
                                    d0Var.h();
                                }
                                d0Var.k = aVar;
                            }
                        }
                        break;
                    default:
                        d0 d0Var2 = this.f281681b;
                        if (!d0Var2.d.c()) {
                            d0Var2.d();
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f281700r = new Runnable(this) { // from class: up0.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f281681b;

            {
                this.f281681b = this;
            }

            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                switch (i2) {
                    case 0:
                        d0 d0Var = this.f281681b;
                        o oVar = d0Var.d;
                        s0 s0Var = d0Var.e;
                        if (s0Var != null && d0Var.f && oVar.c() && s0Var.getParticlesInteractionView().isAttachedToWindow() && s0Var.getParticlesParent().isAttachedToWindow()) {
                            gu0.a aVar = null;
                            c4 c4Var = null;
                            if (s0Var.getParticlesParent().isLaidOut() && !s0Var.getParticlesParent().isLayoutRequested()) {
                                if (d0Var.e().getView().getParent() != s0Var.getParticlesParent()) {
                                    d0Var.d();
                                    s0Var.getParticlesParent().addView(d0Var.e().getView(), new ViewGroup.LayoutParams(-1, -1));
                                }
                                s sVar = (s) d0Var.f281691c.getValue();
                                View interactionView = s0Var.getParticlesInteractionView();
                                sVar.getClass();
                                Intrinsics.checkNotNullParameter(interactionView, "interactionView");
                                sVar.f281759b = interactionView;
                                c4 c4Var2 = d0Var.f281695l;
                                if (c4Var2 != null) {
                                    c4Var2.cancel();
                                }
                                d0Var.f281695l = null;
                                View particlesSceneView = s0Var.getParticlesSceneView();
                                if (particlesSceneView != null) {
                                    if (!ViewCompat.isLaidOut(particlesSceneView) || particlesSceneView.isLayoutRequested()) {
                                        c4Var = new c4(particlesSceneView, d0Var, s0Var, particlesSceneView, 3);
                                        particlesSceneView.addOnLayoutChangeListener(c4Var);
                                    } else {
                                        d0Var.f281695l = null;
                                        d0.a(d0Var, s0Var, particlesSceneView);
                                    }
                                    d0Var.f281695l = c4Var;
                                } else {
                                    d0Var.e().setSceneCenter(null, null);
                                    n nVar = oVar.f281749b;
                                    k kVar = nVar instanceof k ? (k) nVar : null;
                                    if (kVar != null) {
                                        a0 a0Var = kVar.f281727a;
                                        if (a0Var == null) {
                                            oVar.f281749b = i.f281716a;
                                        } else {
                                            oVar.a(a0Var.f281676c, p0.ACCOUNT_SWITCH_IN);
                                            oVar.f281749b = new m(a0Var);
                                        }
                                    }
                                    d0Var.b(s0Var);
                                }
                            } else {
                                gu0.a aVar2 = d0Var.k;
                                if (aVar2 != null) {
                                    aVar2.cancel();
                                }
                                ViewGroup particlesParent = s0Var.getParticlesParent();
                                if (!ViewCompat.isLaidOut(particlesParent) || particlesParent.isLayoutRequested()) {
                                    aVar = new gu0.a(particlesParent, 7, d0Var);
                                    particlesParent.addOnLayoutChangeListener(aVar);
                                } else {
                                    d0Var.k = null;
                                    d0Var.h();
                                }
                                d0Var.k = aVar;
                            }
                        }
                        break;
                    default:
                        d0 d0Var2 = this.f281681b;
                        if (!d0Var2.d.c()) {
                            d0Var2.d();
                        }
                        break;
                }
            }
        };
    }

    public static final void a(d0 d0Var, j0 j0Var, View view) throws Throwable {
        if (d0Var.e == j0Var && d0Var.e().getView().getParent() == j0Var.getParticlesParent()) {
            RectF rectF = d0Var.f281692g;
            if (rectF == null) {
                rectF = new RectF();
                d0Var.f281692g = rectF;
            }
            if (knm.b.t(view, j0Var.getParticlesParent(), rectF)) {
                d0Var.e().setSceneCenter(Float.valueOf(j0Var.getParticlesParent().getWidth() / 2.0f), Float.valueOf(rectF.centerY()));
            } else {
                d0Var.e().setSceneCenter(null, null);
            }
            o oVar = d0Var.d;
            n nVar = oVar.f281749b;
            k kVar = nVar instanceof k ? (k) nVar : null;
            if (kVar != null) {
                a0 a0Var = kVar.f281727a;
                if (a0Var == null) {
                    oVar.f281749b = i.f281716a;
                } else {
                    oVar.a(a0Var.f281676c, p0.ACCOUNT_SWITCH_IN);
                    oVar.f281749b = new m(a0Var);
                }
            }
            d0Var.b(j0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(j0 j0Var) throws Throwable {
        if (this.f281697n != h01.c.HIDDEN) {
            this.f281693h = null;
            if (this.f281690b.isInitialized()) {
                l0 l0Var = (l0) e();
                l0Var.f281737j = null;
                i0 i0Var = l0Var.f281736h;
                if (i0Var != null) {
                    i0.a(i0Var, 7, 0, 0, null, 14);
                }
                l0Var.b();
                return;
            }
            return;
        }
        View particlesBalanceCollapseView = j0Var.getParticlesBalanceCollapseView();
        if (particlesBalanceCollapseView == null) {
            return;
        }
        RectF rectF = this.i;
        if (rectF == null) {
            rectF = new RectF();
            this.i = rectF;
        }
        if (knm.b.t(particlesBalanceCollapseView, j0Var.getParticlesParent(), rectF)) {
            if (this.f281694j) {
                RectF rectF2 = this.f281693h;
                float fCenterX = rectF2 != null ? rectF2.centerX() : j0Var.getParticlesParent().getWidth() * 0.5f;
                float fWidth = rectF.width() * 0.5f;
                rectF.left = fCenterX - fWidth;
                rectF.right = fCenterX + fWidth;
            }
            if (rectF.isEmpty()) {
                return;
            }
            RectF rectF3 = this.f281693h;
            if (rectF3 == null || Math.abs(rectF3.left - rectF.left) > 0.5f || Math.abs(rectF3.top - rectF.top) > 0.5f || Math.abs(rectF3.right - rectF.right) > 0.5f || Math.abs(rectF3.bottom - rectF.bottom) > 0.5f) {
                RectF to6 = this.f281693h;
                if (to6 == null) {
                    to6 = new RectF();
                    this.f281693h = to6;
                }
                to6.set(rectF);
                l0 l0Var2 = (l0) e();
                l0Var2.getClass();
                Intrinsics.checkNotNullParameter(to6, "to");
                if (Math.abs(to6.left) > Float.MAX_VALUE || Math.abs(to6.top) > Float.MAX_VALUE || Math.abs(to6.right) > Float.MAX_VALUE || Math.abs(to6.bottom) > Float.MAX_VALUE || to6.width() <= BitmapDescriptorFactory.HUE_RED || to6.height() <= BitmapDescriptorFactory.HUE_RED) {
                    wp5.y.B("Collapse bounds must be finite and non-empty");
                } else {
                    RectF rectF4 = new RectF(to6);
                    l0Var2.f281737j = rectF4;
                    i0 i0Var2 = l0Var2.f281736h;
                    if (i0Var2 != null) {
                        RectF bounds = new RectF(rectF4);
                        Intrinsics.checkNotNullParameter(bounds, "bounds");
                        i0.a(i0Var2, 6, 0, 0, bounds, 6);
                    }
                    l0Var2.b();
                }
                b bVar = this.f281698p;
                b bVar2 = f281688s;
                if (Intrinsics.f(bVar, bVar2)) {
                    return;
                }
                p0 p0Var = p0.ACCOUNT_SWITCH_IN;
                this.f281698p = bVar2;
                e().setBalanceConfiguration(bVar2, p0Var);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(h01.c cVar) {
        if (this.f281697n == cVar) {
            return;
        }
        this.f281697n = cVar;
        s0 s0Var = this.e;
        o oVar = this.d;
        if (s0Var != null) {
            s0Var.setParticlesBalanceHidden(cVar == h01.c.HIDDEN && oVar.c());
        }
        if (this.f281697n == h01.c.HIDDEN) {
            if (oVar.c()) {
                h();
                return;
            }
            return;
        }
        b bVar = this.o;
        if (bVar != null) {
            if (bVar.equals(this.f281698p)) {
                bVar = null;
            }
            if (bVar != null) {
                p0 p0Var = p0.ACCOUNT_SWITCH_IN;
                this.f281698p = bVar;
                e().setBalanceConfiguration(bVar, p0Var);
            }
        }
        this.f281693h = null;
        if (this.f281690b.isInitialized()) {
            l0 l0Var = (l0) e();
            l0Var.f281737j = null;
            i0 i0Var = l0Var.f281736h;
            if (i0Var != null) {
                i0.a(i0Var, 7, 0, 0, null, 14);
            }
            l0Var.b();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    public final void d() {
        View particlesInteractionView;
        s0 s0Var = this.e;
        if (s0Var != null && (particlesInteractionView = s0Var.getParticlesInteractionView()) != null) {
            particlesInteractionView.removeCallbacks(this.f281699q);
        }
        this.f281693h = null;
        this.i = null;
        this.f281698p = null;
        gu0.a aVar = this.k;
        if (aVar != null) {
            aVar.cancel();
        }
        this.k = null;
        c4 c4Var = this.f281695l;
        if (c4Var != null) {
            c4Var.cancel();
        }
        this.f281695l = null;
        if (this.f281690b.isInitialized()) {
            e().getView().removeCallbacks(this.f281700r);
            o oVar = this.d;
            a0 a0VarA = oVar.f281749b.a();
            d0 d0Var = (d0) oVar.f281748a.f248595b;
            g action = oVar.f281750c;
            Intrinsics.checkNotNullParameter(action, "action");
            d0Var.e().getView().removeCallbacks(action);
            g action2 = oVar.d;
            Intrinsics.checkNotNullParameter(action2, "action");
            d0Var.e().getView().removeCallbacks(action2);
            oVar.f281749b = new k(a0VarA);
            s sVar = (s) this.f281691c.getValue();
            sVar.f281759b = null;
            ((l0) sVar.f281758a).a();
            ViewParent parent = e().getView().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(e().getView());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final q0 e() {
        return (q0) this.f281690b.getValue();
    }

    public final void f() {
        if (this.f && this.e != null && this.f281696m == null) {
            h01.g gVar = this.f281689a;
            c(gVar.a());
            this.f281696m = gVar.c().distinctUntilChanged().subscribe(new uoe.a(2, new g4(1, this, d0.class, "applySensitiveDataAppearance", "applySensitiveDataAppearance(Lcom/revolut/core/ui_kit_core/sensitivedata/SensitiveDataAppearance;)V", 0, 23)));
        }
    }

    public final void g() {
        if (this.f && this.d.c()) {
            h();
        }
    }

    public final void h() {
        s0 s0Var = this.e;
        if (s0Var == null) {
            return;
        }
        gu0.a aVar = this.k;
        if (aVar != null) {
            aVar.cancel();
        }
        this.k = null;
        c4 c4Var = this.f281695l;
        if (c4Var != null) {
            c4Var.cancel();
        }
        this.f281695l = null;
        View particlesInteractionView = s0Var.getParticlesInteractionView();
        b0 b0Var = this.f281699q;
        particlesInteractionView.removeCallbacks(b0Var);
        s0Var.getParticlesInteractionView().post(b0Var);
    }
}

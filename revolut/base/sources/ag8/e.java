package ag8;

import a9d.p;
import ffk.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tcg.a0;
import te8.c0;
import vkm.q;
import w4l.h;
import w4l.j;
import wkm.l;
import zf8.k;
import zf8.n;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements wf8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f4805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te8.e f4806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kbb.c f4807c;
    public final n d;
    public final c0 e;
    public final hy2.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f4808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gte.a f4809h;

    public e(k juniorAccountInfoProvider, te8.e juniorAccountInteractor, kbb.c juniorConfigInteractor, n juniorAccountStatesProvider, c0 juniorVirtualCardOrderInteractor, hy2.f cardDesignInteractor, t pricingPlanInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(juniorAccountInteractor, "juniorAccountInteractor");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountStatesProvider, "juniorAccountStatesProvider");
        Intrinsics.checkNotNullParameter(juniorVirtualCardOrderInteractor, "juniorVirtualCardOrderInteractor");
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f4805a = juniorAccountInfoProvider;
        this.f4806b = juniorAccountInteractor;
        this.f4807c = juniorConfigInteractor;
        this.d = juniorAccountStatesProvider;
        this.e = juniorVirtualCardOrderInteractor;
        this.f = cardDesignInteractor;
        this.f4808g = pricingPlanInteractor;
        this.f4809h = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final rp0.y a(ag8.e r53, java.lang.String r54, java.util.List r55, java.util.Map r56, lf8.c r57, kc8.a r58, java.util.Map r59, java.util.Map r60) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ag8.e.a(ag8.e, java.lang.String, java.util.List, java.util.Map, lf8.c, kc8.a, java.util.Map, java.util.Map):rp0.y");
    }

    public final jhi.k b(String str) {
        k kVar = this.f4805a;
        l lVarE = kVar.e();
        l lVarB = te8.e.b(this.f4806b, h.f294642c);
        vkm.d dVarB = rd0.e.b(this.f4807c.L());
        return nim.a.u(new b(null, this, str, 0), u0.m(u0.i(lVarE, lVarB, dVarB), q.Q(mo3.a.g(kVar.c(null, j.f294644c), null, new p(27), 1), new a32.b((Continuation) null, kc8.a.PHYSICAL, this, 3))));
    }

    public final jhi.k c(String str) {
        k kVar = this.f4805a;
        l lVarE = kVar.e();
        l lVarB = te8.e.b(this.f4806b, h.f294642c);
        vkm.d dVarB = rd0.e.b(this.f4807c.L());
        c0 c0Var = this.e;
        return nim.a.u(new b(null, this, str, 1), u0.m(u0.i(lVarE, lVarB, dVarB), u0.m(nim.a.v(rd0.e.b(c0Var.f270057a.a(null, false)), new a0(c0Var, 22)), q.Q(mo3.a.g(kVar.c(null, j.f294644c), null, new p(27), 1), new a32.b((Continuation) null, kc8.a.VIRTUAL, this, 3)))));
    }
}

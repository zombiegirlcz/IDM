package xrk;

import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.d0;
import efm.r;
import kl.b0;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import te0.s;
import te0.w;
import x94.q;
import xo8.i0;
import xo8.u;
import ybl.l;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends nri.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f308363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ybl.b f308364c;
    public final ifm.b d;
    public final ael.h e;
    public final l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sfk.a f308365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v60.i f308366h;

    public h(a state, b0 footerDisclosurePresentationModel, ybl.b instrumentTickerInteractor, ifm.b flowDisposable, ael.h instrumentStatsInteractor, l tradingConfigInteractor, sfk.a pricingPlanChangeObservable) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(footerDisclosurePresentationModel, "footerDisclosurePresentationModel");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(flowDisposable, "flowDisposable");
        Intrinsics.checkNotNullParameter(instrumentStatsInteractor, "instrumentStatsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanChangeObservable, "pricingPlanChangeObservable");
        this.f308363b = state;
        this.f308364c = instrumentTickerInteractor;
        this.d = flowDisposable;
        this.e = instrumentStatsInteractor;
        this.f = tradingConfigInteractor;
        this.f308365g = pricingPlanChangeObservable;
        this.f308366h = new v60.i();
    }

    @Override // nri.a
    public final void i3() {
        Object hVar;
        a aVar = this.f308363b;
        k kVar = (k) aVar;
        if (kVar.f308371c.getValue(kVar, k.i[1]).isInitialized()) {
            hVar = m.f235744a;
        } else {
            hVar = new pfm.h(new ufm.f(new ufm.i(((ael.k) this.f308364c).e((String) kVar.w0().get()), new u(20, new i0(27)), 1), new u(21, new b(this, 1)), 3), 4);
        }
        pfm.a aVar2 = new pfm.a(hVar, new wl3.e(4, new q(new BreadcrumbException(), 26)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        Intrinsics.checkNotNullExpressionValue(aVar2.w(new o9h.d(29, d.f308359a), c.f308358a), "subscribe(...)");
        d0 d0VarFirstOrError = ((k) aVar).w0().c(s.f270018a).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        u uVar = new u(22, new b(this, 0));
        d0VarFirstOrError.getClass();
        sfm.b bVar = new sfm.b(d0VarFirstOrError, uVar, 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        efm.b bVarIgnoreElements = bVar.filter(new u(24, new i0(26))).switchMap(new u(25, new b(this, 4))).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        wl3.e eVar = new wl3.e(4, new q(new BreadcrumbException(), 28));
        bVarIgnoreElements.getClass();
        pfm.a aVar3 = new pfm.a(bVarIgnoreElements, eVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar3.w(new o9h.d(29, g.f308362a), f.f308361a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar2 = this.d;
        w.j0(bVar2, hVarW);
        r rVarA = this.f308365g.a();
        b bVar3 = new b(this, 3);
        r rVarOnErrorResumeNext = rVarA.onErrorResumeNext(new wl3.e(4, new q(new BreadcrumbException(), 27)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o9h.d(29, bVar3), new o9h.d(29, e.f308360a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        w.j0(bVar2, cVarSubscribe);
    }
}

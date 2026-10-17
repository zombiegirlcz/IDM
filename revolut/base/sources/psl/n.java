package psl;

import com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$InputData;
import com.revolut.trading.orders.TradingOrdersApi$Toggles;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.t0;
import vrl.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends p {
    public final vki.a A;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InvestOrderDetailsContract$InputData f239531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vrl.g f239532m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u0 f239533n;
    public final ybl.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kgm.c f239534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.l f239535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ybl.k f239536r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jdf.e f239537s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final hsl.q f239538t;
    public final h1h.b u;
    public final ndf.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j60.a f239539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ang.f f239540x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final gte.a f239541y;
    public final ydf.b z;

    public n(InvestOrderDetailsContract$InputData inputData, vrl.g investOrdersInteractor, u0 tradingOrdersInteractor, ybl.b instrumentTickerInteractor, kgm.c orderQuoteFeeAndLimitsInteractor, ybl.l tradingConfigInteractor, ybl.k tradingAccountsInteractor, jdf.e investmentPlanProjectionsControllerModelExtension, hsl.q investmentPlanProjectionsProvider, h1h.b transactionsWidgetControllerModelExtension, ndf.f investSecuritiesOrderDetailsMapper, j60.a bottomExpandableDialogControllerExtension, ang.f userInteractor, gte.a featureToggleInteractor, ydf.b executionTimingInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(investOrdersInteractor, "investOrdersInteractor");
        Intrinsics.checkNotNullParameter(tradingOrdersInteractor, "tradingOrdersInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(orderQuoteFeeAndLimitsInteractor, "orderQuoteFeeAndLimitsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(investmentPlanProjectionsControllerModelExtension, "investmentPlanProjectionsControllerModelExtension");
        Intrinsics.checkNotNullParameter(investmentPlanProjectionsProvider, "investmentPlanProjectionsProvider");
        Intrinsics.checkNotNullParameter(transactionsWidgetControllerModelExtension, "transactionsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(investSecuritiesOrderDetailsMapper, "investSecuritiesOrderDetailsMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(executionTimingInteractor, "executionTimingInteractor");
        this.f239531l = inputData;
        this.f239532m = investOrdersInteractor;
        this.f239533n = tradingOrdersInteractor;
        this.o = instrumentTickerInteractor;
        this.f239534p = orderQuoteFeeAndLimitsInteractor;
        this.f239535q = tradingConfigInteractor;
        this.f239536r = tradingAccountsInteractor;
        this.f239537s = investmentPlanProjectionsControllerModelExtension;
        this.f239538t = investmentPlanProjectionsProvider;
        this.u = transactionsWidgetControllerModelExtension;
        this.v = investSecuritiesOrderDetailsMapper;
        this.f239539w = bottomExpandableDialogControllerExtension;
        this.f239540x = userInteractor;
        this.f239541y = featureToggleInteractor;
        this.z = executionTimingInteractor;
        this.A = pyd.c.a(this, new jsl.a0((jdf.f) ((j2) ((hsl.g) investmentPlanProjectionsControllerModelExtension).f155089l.f22677a).getValue(), null, null, null, null, jsl.m.f178223a, null, null, null, null, null, null));
    }

    @Override // yji.n
    public final void D2() {
        InvestOrderDetailsContract$InputData investOrderDetailsContract$InputData = this.f239531l;
        Continuation continuation = null;
        yji.n.j2(this, nim.a.v(a.a.k(((vrl.m) this.f239532m).d(investOrderDetailsContract$InputData.f91741a), new e(1)), new e(2)), null, new g(this, continuation, 6), 3);
        yji.n.j2(this, nim.a.y(nim.a.v(rd0.e.b(this.f239534p.e(investOrderDetailsContract$InputData.f91741a)), new e(14)), new pqg.v(29)), null, new g(this, continuation, 2), 3);
        t0 t0VarD3 = d3();
        ang.f fVar = this.f239540x;
        w4l.h hVar = w4l.h.f294642c;
        int i = 0;
        yji.n.j2(this, nim.a.y(boh.f.e(zh9.u0.m(t0VarD3, fVar.j(hVar)), new d(this, 1)), new e(i)), null, new g(this, continuation, i), 3);
        yji.n.j2(this, boh.f.e(d3(), new d(this, 2)), null, new g(this, continuation, 5), 3);
        yji.n.j2(this, boh.f.e(d3(), new d(this, 4)), null, new g(this, continuation, 3), 3);
        yji.n.j2(this, boh.f.e(zh9.u0.m(d3(), new t0(this.A.B(new e(9)), 1)), new d(this, 5)), null, new g(this, continuation, 7), 3);
        yji.n.j2(this, (j2) ((hsl.g) this.f239537s).f155089l.f22677a, null, new g(this, continuation, 9), 3);
        yji.n.j2(this, ybl.l.d(this.f239535q), null, new g(this, continuation, 12), 3);
        yji.n.j2(this, nim.a.A(nim.a.v(boh.f.e(d3(), new d(this, 0)), new e(4)), new e(10)), null, new g(this, continuation, 11), 3);
        yji.n.j2(this, fVar.j(hVar), null, new g(this, continuation, 1), 3);
    }

    @Override // yji.n
    public final void H2() {
        Continuation continuation = null;
        yji.n.l2(this, boh.f.e(vkm.q.q(nim.a.v(d3(), new e(11))), new d(this, 6)), null, new g(this, continuation, 4), 3);
        wkm.l lVarQ = vkm.q.Q(mo3.a.g(vkm.q.q(nim.a.v(d3(), new e(13))), null, new pof.e(26), 1), new pkf.x(continuation, this, 11));
        otd.a aVar = new otd.a(3, 12, continuation);
        h0 h0Var = h0.f322473a;
        yji.n.l2(this, rd0.e.e(lVarQ, h0Var, aVar), null, new g(this, continuation, 8), 3);
        boolean zC = ((jte.d) this.f239541y).c(TradingOrdersApi$Toggles.OrderReviewMarketTiming.f106793c);
        vki.a aVar2 = this.A;
        if (zC) {
            yji.n.l2(this, rd0.e.n(boh.f.e(zh9.u0.m(d3(), new t0(aVar2.B(new e(9)), 1)), new d(this, 3)), h0Var), null, new g(this, continuation, 10), 3);
        } else {
            X2(aVar2, new e(3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // jsl.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof psl.i
            if (r0 == 0) goto L13
            r0 = r6
            psl.i r0 = (psl.i) r0
            int r1 = r0.f239525w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f239525w = r1
            goto L18
        L13:
            psl.i r0 = new psl.i
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f239525w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L5e
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$InputData r6 = r5.f239531l
            java.lang.String r6 = r6.f91741a
            vrl.g r2 = r5.f239532m
            vrl.m r2 = (vrl.m) r2
            vkm.d r6 = r2.d(r6)
            psl.e r2 = new psl.e
            r4 = 12
            r2.<init>(r4)
            akg.n r6 = nim.a.v(r6, r2)
            pof.e r2 = new pof.e
            r4 = 25
            r2.<init>(r4)
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r2, r3)
            r0.f239525w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            tsl.f r6 = (tsl.f) r6
            boolean r6 = r6 instanceof tsl.j
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: psl.n.Z2(gim.c):java.lang.Object");
    }

    @Override // jsl.e0
    public final void b3() {
        jsl.u event = jsl.u.f178238a;
        Intrinsics.checkNotNullParameter(event, "event");
        V2(new k(this, null, 0), new yi5.b(29));
    }

    @Override // psl.p
    public final void c3(z event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Continuation continuation = null;
        if (event.equals(x.f239549a)) {
            V2(new k(this, continuation, 8), new yi5.b(29));
            return;
        }
        if (event.equals(y.f239550a)) {
            V2(new k(this, continuation, 9), new yi5.b(29));
            return;
        }
        if (event.equals(u.f239546a)) {
            V2(new k(this, continuation, 5), new yi5.b(29));
            return;
        }
        if (event.equals(w.f239548a)) {
            V2(new k(this, continuation, 7), new yi5.b(29));
            return;
        }
        if (event.equals(r.f239543a)) {
            V2(new k(this, continuation, 2), new yi5.b(29));
            return;
        }
        if (event.equals(s.f239544a)) {
            V2(new k(this, continuation, 3), new yi5.b(29));
            return;
        }
        if (event.equals(q.f239542a)) {
            V2(new k(this, continuation, 1), new yi5.b(29));
        } else if (event.equals(t.f239545a)) {
            V2(new k(this, continuation, 4), new yi5.b(29));
        } else {
            if (!event.equals(v.f239547a)) {
                throw new NoWhenBranchMatchedException();
            }
            V2(new k(this, continuation, 6), new yi5.b(29));
        }
    }

    public final t0 d3() {
        return new t0(this.A.B(new e(7)), 1);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.A;
    }
}

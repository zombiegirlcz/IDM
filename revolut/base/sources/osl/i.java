package osl;

import ael.q0;
import com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$InputData;
import jsl.u;
import jsl.x;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.t0;
import vrl.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InvestOrderDetailsContract$InputData f229368l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vrl.g f229369m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ybl.b f229370n;
    public final kgm.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u0 f229371p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.k f229372q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ybl.l f229373r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vki.a f229374s;

    public i(InvestOrderDetailsContract$InputData inputData, vrl.g investOrdersInteractor, ybl.b instrumentTickerInteractor, kgm.c orderQuoteFeeAndLimitsInteractor, u0 tradingOrdersInteractor, ybl.k tradingAccountsInteractor, ybl.l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(investOrdersInteractor, "investOrdersInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(orderQuoteFeeAndLimitsInteractor, "orderQuoteFeeAndLimitsInteractor");
        Intrinsics.checkNotNullParameter(tradingOrdersInteractor, "tradingOrdersInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f229368l = inputData;
        this.f229369m = investOrdersInteractor;
        this.f229370n = instrumentTickerInteractor;
        this.o = orderQuoteFeeAndLimitsInteractor;
        this.f229371p = tradingOrdersInteractor;
        this.f229372q = tradingAccountsInteractor;
        this.f229373r = tradingConfigInteractor;
        this.f229374s = pyd.c.a(this, new x(0));
    }

    @Override // yji.n
    public final void D2() {
        InvestOrderDetailsContract$InputData investOrderDetailsContract$InputData = this.f229368l;
        Continuation continuation = null;
        yji.n.j2(this, nim.a.v(nim.a.v(a.a.k(((vrl.m) this.f229369m).d(investOrderDetailsContract$InputData.f91741a), new os9.f(15)), new os9.f(8)), new os9.f(9)), null, new d(this, continuation, 2), 3);
        yji.n.j2(this, nim.a.y(nim.a.v(rd0.e.b(this.o.e(investOrderDetailsContract$InputData.f91741a)), new os9.f(7)), new os9.f(11)), null, new d(this, continuation, 0), 3);
        final int i = 2;
        yji.n.j2(this, boh.f.e(d3(), new Function1(this) { // from class: osl.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f229362b;

            {
                this.f229362b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                tsl.c investOrderWrapper = (tsl.c) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(investOrderWrapper, "investOrderWrapper");
                        return rd0.e.b(this.f229362b.f229371p.a(investOrderWrapper.f274173a.f104567a));
                    case 1:
                        Intrinsics.checkNotNullParameter(investOrderWrapper, "investOrderWrapper");
                        return ((q0) this.f229362b.f229372q).o(investOrderWrapper.f274173a.J, w4l.h.f294642c);
                    default:
                        Intrinsics.checkNotNullParameter(investOrderWrapper, "investOrderWrapper");
                        return rd0.e.b(((ael.k) this.f229362b.f229370n).f(com.revolut.retail.trading.core.domain.orders.a.i(investOrderWrapper.f274173a)));
                }
            }
        }), null, new d(this, continuation, 1), 3);
        final int i2 = 0;
        yji.n.j2(this, new olf.e(boh.f.e(d3(), new Function1(this) { // from class: osl.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f229362b;

            {
                this.f229362b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                tsl.c investOrderWrapper = (tsl.c) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(investOrderWrapper, "investOrderWrapper");
                        return rd0.e.b(this.f229362b.f229371p.a(investOrderWrapper.f274173a.f104567a));
                    case 1:
                        Intrinsics.checkNotNullParameter(investOrderWrapper, "investOrderWrapper");
                        return ((q0) this.f229362b.f229372q).o(investOrderWrapper.f274173a.J, w4l.h.f294642c);
                    default:
                        Intrinsics.checkNotNullParameter(investOrderWrapper, "investOrderWrapper");
                        return rd0.e.b(((ael.k) this.f229362b.f229370n).f(com.revolut.retail.trading.core.domain.orders.a.i(investOrderWrapper.f274173a)));
                }
            }
        }), 6), null, new jkh.g(this, continuation, 23), 3);
        final int i3 = 1;
        yji.n.j2(this, nim.a.A(nim.a.v(boh.f.e(d3(), new Function1(this) { // from class: osl.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f229362b;

            {
                this.f229362b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                tsl.c investOrderWrapper = (tsl.c) obj2;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(investOrderWrapper, "investOrderWrapper");
                        return rd0.e.b(this.f229362b.f229371p.a(investOrderWrapper.f274173a.f104567a));
                    case 1:
                        Intrinsics.checkNotNullParameter(investOrderWrapper, "investOrderWrapper");
                        return ((q0) this.f229362b.f229372q).o(investOrderWrapper.f274173a.J, w4l.h.f294642c);
                    default:
                        Intrinsics.checkNotNullParameter(investOrderWrapper, "investOrderWrapper");
                        return rd0.e.b(((ael.k) this.f229362b.f229370n).f(com.revolut.retail.trading.core.domain.orders.a.i(investOrderWrapper.f274173a)));
                }
            }
        }), new os9.f(12)), new os9.f(13)), null, new d(this, continuation, 3), 3);
        yji.n.j2(this, ybl.l.d(this.f229373r), null, new d(this, continuation, 4), 3);
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
            boolean r0 = r6 instanceof osl.f
            if (r0 == 0) goto L13
            r0 = r6
            osl.f r0 = (osl.f) r0
            int r1 = r0.f229365w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f229365w = r1
            goto L18
        L13:
            osl.f r0 = new osl.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f229365w
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
            com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$InputData r6 = r5.f229368l
            java.lang.String r6 = r6.f91741a
            vrl.g r2 = r5.f229369m
            vrl.m r2 = (vrl.m) r2
            vkm.d r6 = r2.d(r6)
            os9.f r2 = new os9.f
            r4 = 14
            r2.<init>(r4)
            akg.n r6 = nim.a.v(r6, r2)
            oq3.e r2 = new oq3.e
            r4 = 16
            r2.<init>(r4)
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r2, r3)
            r0.f229365w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            tsl.f r6 = (tsl.f) r6
            boolean r6 = r6 instanceof tsl.c
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: osl.i.Z2(gim.c):java.lang.Object");
    }

    @Override // jsl.e0
    public final void b3() {
        u event = u.f178238a;
        Intrinsics.checkNotNullParameter(event, "event");
        V2(new h(this, null, 0), new yi5.b(29));
    }

    @Override // osl.l
    public final void c3() {
        m event = m.f229375a;
        Intrinsics.checkNotNullParameter(event, "event");
        V2(new h(this, null, 1), new yi5.b(29));
    }

    public final t0 d3() {
        return new t0(this.f229374s.B(new os9.f(10)), 1);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f229374s;
    }
}

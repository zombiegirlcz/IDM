package nsl;

import ael.q0;
import com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import jsl.u;
import jsl.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lfg.d0;
import n68.x;
import vkm.t0;
import vrl.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InvestOrderDetailsContract$InputData f218915l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vrl.g f218916m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ybl.b f218917n;
    public final kgm.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u0 f218918p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.k f218919q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ybl.l f218920r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pfh.b f218921s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vki.a f218922t;

    public i(InvestOrderDetailsContract$InputData inputData, vrl.g investOrdersInteractor, ybl.b instrumentTickerInteractor, kgm.c orderQuoteFeeAndLimitsInteractor, u0 tradingOrdersInteractor, ybl.k tradingAccountsInteractor, ybl.l tradingConfigInteractor, pfh.b fundOrderInfoBottomSheetControllerProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(investOrdersInteractor, "investOrdersInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(orderQuoteFeeAndLimitsInteractor, "orderQuoteFeeAndLimitsInteractor");
        Intrinsics.checkNotNullParameter(tradingOrdersInteractor, "tradingOrdersInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(fundOrderInfoBottomSheetControllerProvider, "fundOrderInfoBottomSheetControllerProvider");
        this.f218915l = inputData;
        this.f218916m = investOrdersInteractor;
        this.f218917n = instrumentTickerInteractor;
        this.o = orderQuoteFeeAndLimitsInteractor;
        this.f218918p = tradingOrdersInteractor;
        this.f218919q = tradingAccountsInteractor;
        this.f218920r = tradingConfigInteractor;
        this.f218921s = fundOrderInfoBottomSheetControllerProvider;
        this.f218922t = pyd.c.a(this, new w(0));
    }

    @Override // yji.n
    public final void D2() {
        InvestOrderDetailsContract$InputData investOrderDetailsContract$InputData = this.f218915l;
        Continuation continuation = null;
        yji.n.j2(this, nim.a.v(nim.a.v(a.a.k(((vrl.m) this.f218916m).d(investOrderDetailsContract$InputData.f91741a), new nrb.c(11)), new nrb.c(12)), new nrb.c(13)), null, new e(this, continuation, 2), 3);
        yji.n.j2(this, nim.a.y(nim.a.v(rd0.e.b(this.o.e(investOrderDetailsContract$InputData.f91741a)), new nrb.c(18)), new nrb.c(19)), null, new e(this, continuation, 0), 3);
        final int i = 2;
        yji.n.j2(this, boh.f.e(d3(), new Function1(this) { // from class: nsl.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f218908b;

            {
                this.f218908b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        tsl.b investOrderWrapper = (tsl.b) obj2;
                        Intrinsics.checkNotNullParameter(investOrderWrapper, "investOrderWrapper");
                        return rd0.e.b(this.f218908b.f218918p.a(investOrderWrapper.f274172a.f104525a));
                    case 1:
                        String it8 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return ((ael.k) this.f218908b.f218917n).o(it8, w4l.h.f294642c);
                    case 2:
                        tsl.b investOrderWrapper2 = (tsl.b) obj2;
                        Intrinsics.checkNotNullParameter(investOrderWrapper2, "investOrderWrapper");
                        return rd0.e.b(((ael.k) this.f218908b.f218917n).f(com.revolut.retail.trading.core.domain.orders.a.g(investOrderWrapper2.f274172a)));
                    default:
                        tsl.b investOrderWrapper3 = (tsl.b) obj2;
                        Intrinsics.checkNotNullParameter(investOrderWrapper3, "investOrderWrapper");
                        return ((q0) this.f218908b.f218919q).o(investOrderWrapper3.f274172a.J, w4l.h.f294642c);
                }
            }
        }), null, new e(this, continuation, 1), 3);
        final int i2 = 1;
        yji.n.j2(this, boh.f.e(nim.a.v(d3(), new nrb.c(10)), new Function1(this) { // from class: nsl.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f218908b;

            {
                this.f218908b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        tsl.b investOrderWrapper = (tsl.b) obj2;
                        Intrinsics.checkNotNullParameter(investOrderWrapper, "investOrderWrapper");
                        return rd0.e.b(this.f218908b.f218918p.a(investOrderWrapper.f274172a.f104525a));
                    case 1:
                        String it8 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return ((ael.k) this.f218908b.f218917n).o(it8, w4l.h.f294642c);
                    case 2:
                        tsl.b investOrderWrapper2 = (tsl.b) obj2;
                        Intrinsics.checkNotNullParameter(investOrderWrapper2, "investOrderWrapper");
                        return rd0.e.b(((ael.k) this.f218908b.f218917n).f(com.revolut.retail.trading.core.domain.orders.a.g(investOrderWrapper2.f274172a)));
                    default:
                        tsl.b investOrderWrapper3 = (tsl.b) obj2;
                        Intrinsics.checkNotNullParameter(investOrderWrapper3, "investOrderWrapper");
                        return ((q0) this.f218908b.f218919q).o(investOrderWrapper3.f274172a.J, w4l.h.f294642c);
                }
            }
        }), null, new e(this, continuation, 5), 3);
        final int i3 = 0;
        yji.n.j2(this, new d0(boh.f.e(d3(), new Function1(this) { // from class: nsl.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f218908b;

            {
                this.f218908b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        tsl.b investOrderWrapper = (tsl.b) obj2;
                        Intrinsics.checkNotNullParameter(investOrderWrapper, "investOrderWrapper");
                        return rd0.e.b(this.f218908b.f218918p.a(investOrderWrapper.f274172a.f104525a));
                    case 1:
                        String it8 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return ((ael.k) this.f218908b.f218917n).o(it8, w4l.h.f294642c);
                    case 2:
                        tsl.b investOrderWrapper2 = (tsl.b) obj2;
                        Intrinsics.checkNotNullParameter(investOrderWrapper2, "investOrderWrapper");
                        return rd0.e.b(((ael.k) this.f218908b.f218917n).f(com.revolut.retail.trading.core.domain.orders.a.g(investOrderWrapper2.f274172a)));
                    default:
                        tsl.b investOrderWrapper3 = (tsl.b) obj2;
                        Intrinsics.checkNotNullParameter(investOrderWrapper3, "investOrderWrapper");
                        return ((q0) this.f218908b.f218919q).o(investOrderWrapper3.f274172a.J, w4l.h.f294642c);
                }
            }
        }), 22), null, new jkh.g(this, continuation, 14), 3);
        final int i5 = 3;
        yji.n.j2(this, nim.a.A(nim.a.v(boh.f.e(d3(), new Function1(this) { // from class: nsl.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f218908b;

            {
                this.f218908b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        tsl.b investOrderWrapper = (tsl.b) obj2;
                        Intrinsics.checkNotNullParameter(investOrderWrapper, "investOrderWrapper");
                        return rd0.e.b(this.f218908b.f218918p.a(investOrderWrapper.f274172a.f104525a));
                    case 1:
                        String it8 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return ((ael.k) this.f218908b.f218917n).o(it8, w4l.h.f294642c);
                    case 2:
                        tsl.b investOrderWrapper2 = (tsl.b) obj2;
                        Intrinsics.checkNotNullParameter(investOrderWrapper2, "investOrderWrapper");
                        return rd0.e.b(((ael.k) this.f218908b.f218917n).f(com.revolut.retail.trading.core.domain.orders.a.g(investOrderWrapper2.f274172a)));
                    default:
                        tsl.b investOrderWrapper3 = (tsl.b) obj2;
                        Intrinsics.checkNotNullParameter(investOrderWrapper3, "investOrderWrapper");
                        return ((q0) this.f218908b.f218919q).o(investOrderWrapper3.f274172a.J, w4l.h.f294642c);
                }
            }
        }), new nrb.c(15)), new nrb.c(16)), null, new e(this, continuation, 3), 3);
        yji.n.j2(this, ybl.l.d(this.f218920r), null, new e(this, continuation, 4), 3);
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
            boolean r0 = r6 instanceof nsl.h
            if (r0 == 0) goto L13
            r0 = r6
            nsl.h r0 = (nsl.h) r0
            int r1 = r0.f218914w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f218914w = r1
            goto L18
        L13:
            nsl.h r0 = new nsl.h
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f218914w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L5d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$InputData r6 = r5.f218915l
            java.lang.String r6 = r6.f91741a
            vrl.g r2 = r5.f218916m
            vrl.m r2 = (vrl.m) r2
            vkm.d r6 = r2.d(r6)
            nrb.c r2 = new nrb.c
            r4 = 17
            r2.<init>(r4)
            akg.n r6 = nim.a.v(r6, r2)
            nsl.d r2 = new nsl.d
            r4 = 0
            r2.<init>(r4)
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r2, r3)
            r0.f218914w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L5d
            return r1
        L5d:
            tsl.f r6 = (tsl.f) r6
            boolean r6 = r6 instanceof tsl.b
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nsl.i.Z2(gim.c):java.lang.Object");
    }

    @Override // jsl.e0
    public final void b3() {
        u event = u.f178238a;
        Intrinsics.checkNotNullParameter(event, "event");
        V2(new x(this, null, 29), new yi5.b(29));
    }

    @Override // nsl.p
    public final void c3(q event) {
        Intrinsics.checkNotNullParameter(event, "event");
        n nVar = event.f218926a;
        boolean z = nVar instanceof l;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        pfh.b bVar = this.f218921s;
        if (z) {
            yji.n.P2(this, bVar.a(((l) nVar).f218924a), bottom_dialog, null, 2);
        } else {
            if (!(nVar instanceof m)) {
                throw new NoWhenBranchMatchedException();
            }
            yji.n.P2(this, bVar.b(((m) nVar).f218925a), bottom_dialog, null, 2);
        }
    }

    public final t0 d3() {
        return new t0(this.f218922t.B(new nrb.c(14)), 1);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f218922t;
    }
}

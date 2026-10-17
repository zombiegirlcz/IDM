package rsl;

import ael.d0;
import ael.q0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.trading.orders.R$string;
import com.revolut.trading.orders.ui.invest.placement.screens.review.provider.NoteOrderPlacementDialogProvider;
import dfl.o0;
import jsl.u;
import jsl.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.t0;
import vrl.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InvestOrderDetailsContract$InputData f257128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vrl.g f257129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u0 f257130n;
    public final ybl.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kgm.c f257131p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.l f257132q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ybl.k f257133r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ang.f f257134s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d0 f257135t;
    public final NoteOrderPlacementDialogProvider u;
    public final pfh.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vki.a f257136w;

    public h(InvestOrderDetailsContract$InputData inputData, vrl.g investOrdersInteractor, u0 tradingOrdersInteractor, ybl.b instrumentTickerInteractor, kgm.c orderQuoteFeeAndLimitsInteractor, ybl.l tradingConfigInteractor, ybl.k tradingAccountsInteractor, ang.f userInteractor, d0 stocksInteractor, NoteOrderPlacementDialogProvider noteOrderPlacementDialogProvider, pfh.b fundOrderInfoControllerProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(investOrdersInteractor, "investOrdersInteractor");
        Intrinsics.checkNotNullParameter(tradingOrdersInteractor, "tradingOrdersInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(orderQuoteFeeAndLimitsInteractor, "orderQuoteFeeAndLimitsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(noteOrderPlacementDialogProvider, "noteOrderPlacementDialogProvider");
        Intrinsics.checkNotNullParameter(fundOrderInfoControllerProvider, "fundOrderInfoControllerProvider");
        this.f257128l = inputData;
        this.f257129m = investOrdersInteractor;
        this.f257130n = tradingOrdersInteractor;
        this.o = instrumentTickerInteractor;
        this.f257131p = orderQuoteFeeAndLimitsInteractor;
        this.f257132q = tradingConfigInteractor;
        this.f257133r = tradingAccountsInteractor;
        this.f257134s = userInteractor;
        this.f257135t = stocksInteractor;
        this.u = noteOrderPlacementDialogProvider;
        this.v = fundOrderInfoControllerProvider;
        this.f257136w = pyd.c.a(this, new y(0));
    }

    @Override // yji.n
    public final void D2() {
        InvestOrderDetailsContract$InputData investOrderDetailsContract$InputData = this.f257128l;
        Continuation continuation = null;
        yji.n.j2(this, nim.a.v(nim.a.v(a.a.k(((vrl.m) this.f257129m).d(investOrderDetailsContract$InputData.f91741a), new c(7)), new c(8)), new c(9)), null, new d(this, continuation, 3), 3);
        yji.n.j2(this, nim.a.y(nim.a.v(rd0.e.b(this.f257131p.e(investOrderDetailsContract$InputData.f91741a)), new c(11)), new c(12)), null, new d(this, continuation, 1), 3);
        final int i = 0;
        yji.n.j2(this, nim.a.y(boh.f.e(zh9.u0.m(d3(), this.f257134s.j(w4l.h.f294642c)), new Function1(this) { // from class: rsl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f257123b;

            {
                this.f257123b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        tsl.d dVar = (tsl.d) pair.f186385a;
                        do3.n nVar = (do3.n) pair.f186386b;
                        o0 f104636l = dVar.f274174a.getF104636l();
                        String str = f104636l != null ? f104636l.f114446a : null;
                        return (str == null || str.equals(nVar.f116408a)) ? nim.a.y(nim.a.v(rd0.e.b(this.f257123b.f257130n.a(dVar.f274174a.getF104630a())), new c(3)), new c(4)) : zi0.c.i(jsl.m.f178223a);
                    case 1:
                        tsl.d investOrderWrapper = (tsl.d) obj2;
                        Intrinsics.checkNotNullParameter(investOrderWrapper, "investOrderWrapper");
                        String h2 = investOrderWrapper.f274174a.getH();
                        if (h2 != null) {
                            return ((q0) this.f257123b.f257133r).o(h2, w4l.h.f294642c);
                        }
                        od0.i.Companion.getClass();
                        return zi0.c.i(od0.i.f224256b);
                    case 2:
                        tsl.d investOrderWrapper2 = (tsl.d) obj2;
                        Intrinsics.checkNotNullParameter(investOrderWrapper2, "investOrderWrapper");
                        return rd0.e.b(((ael.k) this.f257123b.o).f(com.revolut.retail.trading.core.domain.orders.a.j(investOrderWrapper2.f274174a)));
                    default:
                        String securityRef = (String) obj2;
                        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
                        return rd0.e.b(nim.a.w(this.f257123b.f257135t.a(securityRef, false), new c(1)));
                }
            }
        }), new c(5)), null, new d(this, continuation, 0), 3);
        final int i2 = 2;
        yji.n.j2(this, boh.f.e(d3(), new Function1(this) { // from class: rsl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f257123b;

            {
                this.f257123b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        tsl.d dVar = (tsl.d) pair.f186385a;
                        do3.n nVar = (do3.n) pair.f186386b;
                        o0 f104636l = dVar.f274174a.getF104636l();
                        String str = f104636l != null ? f104636l.f114446a : null;
                        return (str == null || str.equals(nVar.f116408a)) ? nim.a.y(nim.a.v(rd0.e.b(this.f257123b.f257130n.a(dVar.f274174a.getF104630a())), new c(3)), new c(4)) : zi0.c.i(jsl.m.f178223a);
                    case 1:
                        tsl.d investOrderWrapper = (tsl.d) obj2;
                        Intrinsics.checkNotNullParameter(investOrderWrapper, "investOrderWrapper");
                        String h2 = investOrderWrapper.f274174a.getH();
                        if (h2 != null) {
                            return ((q0) this.f257123b.f257133r).o(h2, w4l.h.f294642c);
                        }
                        od0.i.Companion.getClass();
                        return zi0.c.i(od0.i.f224256b);
                    case 2:
                        tsl.d investOrderWrapper2 = (tsl.d) obj2;
                        Intrinsics.checkNotNullParameter(investOrderWrapper2, "investOrderWrapper");
                        return rd0.e.b(((ael.k) this.f257123b.o).f(com.revolut.retail.trading.core.domain.orders.a.j(investOrderWrapper2.f274174a)));
                    default:
                        String securityRef = (String) obj2;
                        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
                        return rd0.e.b(nim.a.w(this.f257123b.f257135t.a(securityRef, false), new c(1)));
                }
            }
        }), null, new d(this, continuation, i2), 3);
        yji.n.j2(this, ybl.l.d(this.f257132q), null, new d(this, continuation, 6), 3);
        final int i3 = 1;
        yji.n.j2(this, nim.a.A(nim.a.v(boh.f.e(d3(), new Function1(this) { // from class: rsl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f257123b;

            {
                this.f257123b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        tsl.d dVar = (tsl.d) pair.f186385a;
                        do3.n nVar = (do3.n) pair.f186386b;
                        o0 f104636l = dVar.f274174a.getF104636l();
                        String str = f104636l != null ? f104636l.f114446a : null;
                        return (str == null || str.equals(nVar.f116408a)) ? nim.a.y(nim.a.v(rd0.e.b(this.f257123b.f257130n.a(dVar.f274174a.getF104630a())), new c(3)), new c(4)) : zi0.c.i(jsl.m.f178223a);
                    case 1:
                        tsl.d investOrderWrapper = (tsl.d) obj2;
                        Intrinsics.checkNotNullParameter(investOrderWrapper, "investOrderWrapper");
                        String h2 = investOrderWrapper.f274174a.getH();
                        if (h2 != null) {
                            return ((q0) this.f257123b.f257133r).o(h2, w4l.h.f294642c);
                        }
                        od0.i.Companion.getClass();
                        return zi0.c.i(od0.i.f224256b);
                    case 2:
                        tsl.d investOrderWrapper2 = (tsl.d) obj2;
                        Intrinsics.checkNotNullParameter(investOrderWrapper2, "investOrderWrapper");
                        return rd0.e.b(((ael.k) this.f257123b.o).f(com.revolut.retail.trading.core.domain.orders.a.j(investOrderWrapper2.f274174a)));
                    default:
                        String securityRef = (String) obj2;
                        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
                        return rd0.e.b(nim.a.w(this.f257123b.f257135t.a(securityRef, false), new c(1)));
                }
            }
        }), new rpi.e(29)), new c(0)), null, new d(this, continuation, 5), 3);
        final int i5 = 3;
        yji.n.j2(this, boh.f.e(vkm.q.q(nim.a.v(d3(), new c(10))), new Function1(this) { // from class: rsl.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f257123b;

            {
                this.f257123b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        tsl.d dVar = (tsl.d) pair.f186385a;
                        do3.n nVar = (do3.n) pair.f186386b;
                        o0 f104636l = dVar.f274174a.getF104636l();
                        String str = f104636l != null ? f104636l.f114446a : null;
                        return (str == null || str.equals(nVar.f116408a)) ? nim.a.y(nim.a.v(rd0.e.b(this.f257123b.f257130n.a(dVar.f274174a.getF104630a())), new c(3)), new c(4)) : zi0.c.i(jsl.m.f178223a);
                    case 1:
                        tsl.d investOrderWrapper = (tsl.d) obj2;
                        Intrinsics.checkNotNullParameter(investOrderWrapper, "investOrderWrapper");
                        String h2 = investOrderWrapper.f274174a.getH();
                        if (h2 != null) {
                            return ((q0) this.f257123b.f257133r).o(h2, w4l.h.f294642c);
                        }
                        od0.i.Companion.getClass();
                        return zi0.c.i(od0.i.f224256b);
                    case 2:
                        tsl.d investOrderWrapper2 = (tsl.d) obj2;
                        Intrinsics.checkNotNullParameter(investOrderWrapper2, "investOrderWrapper");
                        return rd0.e.b(((ael.k) this.f257123b.o).f(com.revolut.retail.trading.core.domain.orders.a.j(investOrderWrapper2.f274174a)));
                    default:
                        String securityRef = (String) obj2;
                        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
                        return rd0.e.b(nim.a.w(this.f257123b.f257135t.a(securityRef, false), new c(1)));
                }
            }
        }), null, new d(this, continuation, 4), 3);
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
            boolean r0 = r6 instanceof rsl.e
            if (r0 == 0) goto L13
            r0 = r6
            rsl.e r0 = (rsl.e) r0
            int r1 = r0.f257126w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257126w = r1
            goto L18
        L13:
            rsl.e r0 = new rsl.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f257126w
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
            com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$InputData r6 = r5.f257128l
            java.lang.String r6 = r6.f91741a
            vrl.g r2 = r5.f257129m
            vrl.m r2 = (vrl.m) r2
            vkm.d r6 = r2.d(r6)
            rpi.e r2 = new rpi.e
            r4 = 28
            r2.<init>(r4)
            akg.n r6 = nim.a.v(r6, r2)
            rnd.d0 r2 = new rnd.d0
            r4 = 22
            r2.<init>(r4)
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r2, r3)
            r0.f257126w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            tsl.f r6 = (tsl.f) r6
            boolean r6 = r6 instanceof tsl.d
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rsl.h.Z2(gim.c):java.lang.Object");
    }

    @Override // jsl.e0
    public final void b3() {
        u event = u.f178238a;
        Intrinsics.checkNotNullParameter(event, "event");
        V2(new f(this, null, 0), new yi5.b(29));
    }

    @Override // rsl.j
    public final void c3(o event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Continuation continuation = null;
        if (event.equals(l.f257138a)) {
            V2(new f(this, continuation, 1), new yi5.b(29));
            return;
        }
        boolean z = event instanceof k;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (z) {
            yji.n.P2(this, this.v.a(((k) event).f257137a), bottom_dialog, null, 2);
            return;
        }
        boolean zEquals = event.equals(m.f257139a);
        NoteOrderPlacementDialogProvider noteOrderPlacementDialogProvider = this.u;
        if (zEquals) {
            noteOrderPlacementDialogProvider.getClass();
            yji.n.P2(this, NoteOrderPlacementDialogProvider.a(new TextLocalisedClause(R$string.wealth_trading_orders_structured_note_item_issue_date, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_orders_structured_note_item_issue_date_info, null, null, 14)), bottom_dialog, null, 2);
            return;
        }
        if (!event.equals(n.f257140a)) {
            throw new NoWhenBranchMatchedException();
        }
        noteOrderPlacementDialogProvider.getClass();
        yji.n.P2(this, NoteOrderPlacementDialogProvider.a(new TextLocalisedClause(R$string.wealth_trading_orders_structured_note_item_note_trade_date, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_orders_structured_note_item_note_trade_date_info, null, null, 14)), bottom_dialog, null, 2);
    }

    public final t0 d3() {
        return new t0(this.f257136w.B(new c(6)), 1);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f257136w;
    }
}

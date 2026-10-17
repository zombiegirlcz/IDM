package lsl;

import com.revolut.data.model.Data;
import com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$InputData;
import jsl.u;
import jsl.v;
import klf.l1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.t0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InvestOrderDetailsContract$InputData f199700l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vrl.g f199701m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kgm.c f199702n;
    public final n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h1h.b f199703p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vki.a f199704q;

    public f(InvestOrderDetailsContract$InputData inputData, vrl.g investOrdersInteractor, kgm.c orderQuoteFeeAndLimitsInteractor, n orderAmountsCalculator, h1h.b transactionsWidgetControllerModelExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(investOrdersInteractor, "investOrdersInteractor");
        Intrinsics.checkNotNullParameter(orderQuoteFeeAndLimitsInteractor, "orderQuoteFeeAndLimitsInteractor");
        Intrinsics.checkNotNullParameter(orderAmountsCalculator, "orderAmountsCalculator");
        Intrinsics.checkNotNullParameter(transactionsWidgetControllerModelExtension, "transactionsWidgetControllerModelExtension");
        this.f199700l = inputData;
        this.f199701m = investOrdersInteractor;
        this.f199702n = orderQuoteFeeAndLimitsInteractor;
        this.o = orderAmountsCalculator;
        this.f199703p = transactionsWidgetControllerModelExtension;
        this.f199704q = pyd.c.a(this, new v(null, null, new Data(null, null, true, 3, null), null));
    }

    @Override // yji.n
    public final void D2() {
        InvestOrderDetailsContract$InputData investOrderDetailsContract$InputData = this.f199700l;
        Continuation continuation = null;
        yji.n.j2(this, nim.a.v(a.a.k(((vrl.m) this.f199701m).d(investOrderDetailsContract$InputData.f91741a), new loc.a(24)), new loc.a(25)), null, new c(this, continuation, 1), 3);
        yji.n.j2(this, nim.a.v(d3(), new lk4.g(this, 28)), null, new c(this, continuation, 3), 3);
        yji.n.j2(this, nim.a.y(nim.a.v(rd0.e.n(rd0.e.b(this.f199702n.e(investOrderDetailsContract$InputData.f91741a)), h0.f322473a), new loc.a(27)), new loc.a(28)), null, new c(this, continuation, 0), 3);
    }

    @Override // yji.n
    public final void H2() {
        Continuation continuation = null;
        yji.n.l2(this, rd0.e.e(vkm.q.Q(mo3.a.g(vkm.q.q(nim.a.v(d3(), new loc.a(26))), null, new lnk.o(8), 1), new li2.f(continuation, this, 10)), h0.f322473a, new l1(3, 18, continuation)), null, new c(this, continuation, 2), 3);
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
            boolean r0 = r6 instanceof lsl.e
            if (r0 == 0) goto L13
            r0 = r6
            lsl.e r0 = (lsl.e) r0
            int r1 = r0.f199699w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f199699w = r1
            goto L18
        L13:
            lsl.e r0 = new lsl.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f199699w
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
            com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$InputData r6 = r5.f199700l
            java.lang.String r6 = r6.f91741a
            vrl.g r2 = r5.f199701m
            vrl.m r2 = (vrl.m) r2
            vkm.d r6 = r2.d(r6)
            loc.a r2 = new loc.a
            r4 = 29
            r2.<init>(r4)
            akg.n r6 = nim.a.v(r6, r2)
            lnk.o r2 = new lnk.o
            r4 = 9
            r2.<init>(r4)
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r2, r3)
            r0.f199699w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            tsl.f r6 = (tsl.f) r6
            boolean r6 = r6 instanceof tsl.a
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lsl.f.Z2(gim.c):java.lang.Object");
    }

    @Override // jsl.e0
    public final void b3() {
        u event = u.f178238a;
        Intrinsics.checkNotNullParameter(event, "event");
        V2(new lo.c(this, (Continuation) null, 6), new yi5.b(29));
    }

    @Override // lsl.h
    public final void c3(j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        V2(new ll6.i(this, event.f199707a, null, 22), new yi5.b(29));
    }

    public final t0 d3() {
        return new t0(this.f199704q.B(new b(0)), 1);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f199704q;
    }
}

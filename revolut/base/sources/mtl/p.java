package mtl;

import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends oki.h implements d {
    public final InvestOrdersListFeatureContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vrl.g f208928p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.l f208929q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final aah.h f208930r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final dtl.b f208931s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ybl.q f208932t;
    public final ks0.n u;
    public final z5j.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d1h.e f208933w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final gte.a f208934x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ptl.a f208935y;
    public final Object z;

    public p(InvestOrdersListFeatureContract$InputData inputData, a initialState, r stateMapper, vrl.g investOrdersInteractor, ybl.l tradingConfigInteractor, aah.h disclaimersExtension, dtl.b investOrderCancellationControllerModelExtension, ybl.q wealthInstrumentStateDetailsInteractor, ks0.n investOrdersParamsProvider, z5j.d commodityAssetDetailsOrderFlowCommandProvider, d1h.e wealthRemoteDisclaimersControllerModelExtension, gte.a featureToggleInteractor, ptl.a disclaimerScopesProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(investOrdersInteractor, "investOrdersInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(disclaimersExtension, "disclaimersExtension");
        Intrinsics.checkNotNullParameter(investOrderCancellationControllerModelExtension, "investOrderCancellationControllerModelExtension");
        Intrinsics.checkNotNullParameter(wealthInstrumentStateDetailsInteractor, "wealthInstrumentStateDetailsInteractor");
        Intrinsics.checkNotNullParameter(investOrdersParamsProvider, "investOrdersParamsProvider");
        Intrinsics.checkNotNullParameter(commodityAssetDetailsOrderFlowCommandProvider, "commodityAssetDetailsOrderFlowCommandProvider");
        Intrinsics.checkNotNullParameter(wealthRemoteDisclaimersControllerModelExtension, "wealthRemoteDisclaimersControllerModelExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(disclaimerScopesProvider, "disclaimerScopesProvider");
        this.o = inputData;
        this.f208928p = investOrdersInteractor;
        this.f208929q = tradingConfigInteractor;
        this.f208930r = disclaimersExtension;
        this.f208931s = investOrderCancellationControllerModelExtension;
        this.f208932t = wealthInstrumentStateDetailsInteractor;
        this.u = investOrdersParamsProvider;
        this.v = commodityAssetDetailsOrderFlowCommandProvider;
        this.f208933w = wealthRemoteDisclaimersControllerModelExtension;
        this.f208934x = featureToggleInteractor;
        this.f208935y = disclaimerScopesProvider;
        this.z = w.y0(new ky4.f(this, 8, initialState, stateMapper));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(mtl.p r4, xi0.b r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof mtl.n
            if (r0 == 0) goto L13
            r0 = r6
            mtl.n r0 = (mtl.n) r0
            int r1 = r0.f208926x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f208926x = r1
            goto L18
        L13:
            mtl.n r0 = new mtl.n
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f208926x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            mtl.p r4 = r0.u
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            z5j.d r6 = r4.v
            r0.u = r4
            r0.f208926x = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            aii.u r6 = (aii.u) r6
            r4.C1(r6)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mtl.p.I2(mtl.p, xi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(mtl.p r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof mtl.o
            if (r0 == 0) goto L13
            r0 = r7
            mtl.o r0 = (mtl.o) r0
            int r1 = r0.f208927w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f208927w = r1
            goto L18
        L13:
            mtl.o r0 = new mtl.o
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f208927w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L62
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            cli.g r7 = r6.getState()
            msb.c r2 = new msb.c
            r4 = 12
            r2.<init>(r4)
            kotlinx.coroutines.flow.Flow r7 = r7.B(r2)
            vkm.t0 r2 = new vkm.t0
            r4 = 1
            r2.<init>(r7, r4)
            mig.a r7 = new mig.a
            r4 = 6
            r7.<init>(r4)
            mqg.a r4 = new mqg.a
            r5 = 18
            r4.<init>(r5)
            r5 = 2
            jhi.b r7 = mo3.a.h(r2, r7, r4, r5)
            r0.f208927w = r3
            java.lang.Object r7 = vkm.q.z(r7, r0)
            if (r7 != r1) goto L62
            return r1
        L62:
            nel.v0 r7 = (nel.v0) r7
            if (r7 == 0) goto L83
            com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$Destination r0 = new com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$Destination
            com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData$a r1 = com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData.INSTANCE
            nel.n r2 = r7.n()
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r7 = r7.getAccount()
            java.util.UUID r7 = r7.getF105262a()
            r3 = 0
            r4 = 28
            com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData r7 = com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData.Companion.e(r1, r2, r7, r3, r4)
            r0.<init>(r7)
            r6.C1(r0)
        L83:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mtl.p.J2(mtl.p, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    @Override // yji.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I1() {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mtl.p.I1():void");
    }

    @Override // yji.l
    public final void T1(long j2) {
        InvestOrdersParams investOrdersParamsF = this.u.f();
        Continuation continuation = null;
        yji.l.b1(this, vrl.g.a(this.f208928p, investOrdersParamsF, 6), null, new j(this, continuation, 6), 3);
        yji.l.b1(this, ((dtl.m) this.f208931s).f117483n, null, new mpd.p(this, investOrdersParamsF, continuation, 8), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.z
    public final cli.g getState() {
        return (cli.g) this.z.getValue();
    }
}

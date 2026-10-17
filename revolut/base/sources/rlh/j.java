package rlh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends oki.h implements m {
    public final gte.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nlh.b f255059p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.b f255060q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ybl.q f255061r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ugc.a f255062s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tlh.a f255063t;
    public final vii.c u;
    public final cli.y v;

    public j(n initialState, qee.s stateMapper, t saveStateDelegate, gte.a featureToggleInteractor, nlh.b wealthTradeCommandProvider, ybl.b instrumentTickerInteractor, ybl.q wealthInstrumentStateDetailsInteractor, ugc.a recurringBuyHubCollectionsInteractor, tlh.a availableRecurringBuyHubCollectionIdsProvider) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(wealthTradeCommandProvider, "wealthTradeCommandProvider");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(wealthInstrumentStateDetailsInteractor, "wealthInstrumentStateDetailsInteractor");
        Intrinsics.checkNotNullParameter(recurringBuyHubCollectionsInteractor, "recurringBuyHubCollectionsInteractor");
        Intrinsics.checkNotNullParameter(availableRecurringBuyHubCollectionIdsProvider, "availableRecurringBuyHubCollectionIdsProvider");
        this.o = featureToggleInteractor;
        this.f255059p = wealthTradeCommandProvider;
        this.f255060q = instrumentTickerInteractor;
        this.f255061r = wealthInstrumentStateDetailsInteractor;
        this.f255062s = recurringBuyHubCollectionsInteractor;
        this.f255063t = availableRecurringBuyHubCollectionIdsProvider;
        this.u = new vii.c();
        this.v = mra.d.b(this, initialState, stateMapper, saveStateDelegate, false, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(rlh.j r4, java.lang.String r5, rgf.m r6, rgf.b r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof rlh.i
            if (r0 == 0) goto L13
            r0 = r8
            rlh.i r0 = (rlh.i) r0
            int r1 = r0.f255058y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f255058y = r1
            goto L18
        L13:
            rlh.i r0 = new rlh.i
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f255056w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f255058y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            rgf.b r7 = r0.v
            rgf.m r6 = r0.u
            yhm.o.b(r8)
            goto L43
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            yhm.o.b(r8)
            r0.u = r6
            r0.v = r7
            r0.f255058y = r3
            java.lang.Object r8 = r4.J2(r5, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            nel.w0 r8 = (nel.w0) r8
            boolean r4 = r8 instanceof nel.s0
            if (r4 == 0) goto L54
            r4 = r8
            nel.s0 r4 = (nel.s0) r4
            boolean r4 = r4.f214618b
            if (r4 == 0) goto L54
            r6.invoke(r8)
            goto L57
        L54:
            r7.invoke()
        L57:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: rlh.j.I2(rlh.j, java.lang.String, rgf.m, rgf.b, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.u.a(Unit.f186387a, w4l.h.f294642c), new r3k.c(continuation, this, 8)), null, null, new rk9.d(this, continuation, 5), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof rlh.e
            if (r0 == 0) goto L13
            r0 = r8
            rlh.e r0 = (rlh.e) r0
            int r1 = r0.f255052w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f255052w = r1
            goto L18
        L13:
            rlh.e r0 = new rlh.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f255052w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            return r8
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            goto L5a
        L37:
            yhm.o.b(r8)
            ybl.b r8 = r6.f255060q
            ael.k r8 = (ael.k) r8
            efm.r r7 = r8.f(r7)
            vkm.d r7 = rd0.e.b(r7)
            rhj.m r8 = new rhj.m
            r2 = 17
            r8.<init>(r2)
            jhi.b r7 = mo3.a.g(r7, r5, r8, r4)
            r0.f255052w = r4
            java.lang.Object r8 = vkm.q.x(r7, r0)
            if (r8 != r1) goto L5a
            goto L77
        L5a:
            nel.n r8 = (nel.n) r8
            ybl.q r7 = r6.f255061r
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType$Gia r2 = com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType.Gia.f105270a
            akg.n r7 = ybl.q.a(r7, r8, r2)
            rhj.m r8 = new rhj.m
            r2 = 18
            r8.<init>(r2)
            jhi.b r7 = mo3.a.g(r7, r5, r8, r4)
            r0.f255052w = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L78
        L77:
            return r1
        L78:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rlh.j.J2(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}

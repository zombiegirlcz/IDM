package x8j;

import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.kompot.common.ModalDestination;
import e7l.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 extends n {
    public final kpj.f A;
    public BuyFundingCurrencyPrefill B;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wsg.n f303434l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xv5.c f303435m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final yud.g f303436n;
    public final mcj.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f303437p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final utd.a f303438q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f303439r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w0i.a f303440s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fk3.a f303441t;
    public final tul.b u;
    public final vh5.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t7j.d f303442w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final gte.a f303443x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final oh5.e f303444y;
    public final o8j.b z;

    public g0(wsg.n walletInteractor, xv5.c baseCurrencyInteractor, yud.g stakingInteractor, mcj.d stakingDialogProvider, j60.a bottomDialogExtension, utd.a unstakingLockedTransactionsInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, w0i.a exchangeProhibitedCurrenciesChecker, fk3.a configurationInteractor, tul.b mapper, vh5.a cryptoPermissionModelExtension, t7j.d cryptoNotAllowedCurrencyDialogProvider, gte.a featureToggleInteractor, oh5.e cryptoLockedGiftBalanceInteractor, o8j.b receiveConfigurationProvider, kpj.f sendConfigurationProvider) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(stakingDialogProvider, "stakingDialogProvider");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(unstakingLockedTransactionsInteractor, "unstakingLockedTransactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(exchangeProhibitedCurrenciesChecker, "exchangeProhibitedCurrenciesChecker");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(cryptoPermissionModelExtension, "cryptoPermissionModelExtension");
        Intrinsics.checkNotNullParameter(cryptoNotAllowedCurrencyDialogProvider, "cryptoNotAllowedCurrencyDialogProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cryptoLockedGiftBalanceInteractor, "cryptoLockedGiftBalanceInteractor");
        Intrinsics.checkNotNullParameter(receiveConfigurationProvider, "receiveConfigurationProvider");
        Intrinsics.checkNotNullParameter(sendConfigurationProvider, "sendConfigurationProvider");
        this.f303434l = walletInteractor;
        this.f303435m = baseCurrencyInteractor;
        this.f303436n = stakingInteractor;
        this.o = stakingDialogProvider;
        this.f303437p = bottomDialogExtension;
        this.f303438q = unstakingLockedTransactionsInteractor;
        this.f303439r = transactionsInteractor;
        this.f303440s = exchangeProhibitedCurrenciesChecker;
        this.f303441t = configurationInteractor;
        this.u = mapper;
        this.v = cryptoPermissionModelExtension;
        this.f303442w = cryptoNotAllowedCurrencyDialogProvider;
        this.f303443x = featureToggleInteractor;
        this.f303444y = cryptoLockedGiftBalanceInteractor;
        this.z = receiveConfigurationProvider;
        this.A = sendConfigurationProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r15 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r15.Z2((3 & 1) != 0, yh5.d.a.f313774a, r2, r0) != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l3(x8j.g0 r13, xi0.b r14, gim.c r15) {
        /*
            r13.getClass()
            boolean r0 = r15 instanceof x8j.x
            if (r0 == 0) goto L16
            r0 = r15
            x8j.x r0 = (x8j.x) r0
            int r1 = r0.f303478x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f303478x = r1
            goto L1b
        L16:
            x8j.x r0 = new x8j.x
            r0.<init>(r13, r15)
        L1b:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f303478x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            xi0.b r13 = r0.u
            com.revolut.feature_crypto_order_flow.api.navigation.CryptoExchangeDestination r13 = (com.revolut.feature_crypto_order_flow.api.navigation.CryptoExchangeDestination) r13
            yhm.o.b(r15)
            goto L82
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            xi0.b r14 = r0.u
            yhm.o.b(r15)
            goto L55
        L3f:
            yhm.o.b(r15)
            com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill r15 = r13.B
            xi0.b r15 = hx7.l.u(r15)
            if (r15 != 0) goto L57
            r0.u = r14
            r0.f303478x = r4
            java.io.Serializable r15 = r13.n3(r0)
            if (r15 != r1) goto L55
            goto L81
        L55:
            xi0.b r15 = (xi0.b) r15
        L57:
            r5 = r14
            r6 = r15
            wd6.e r7 = wd6.e.BUY
            wd6.h r8 = wd6.h.MARKET
            com.revolut.feature_crypto_order_flow.api.navigation.CryptoExchangeFlowInputData r4 = new com.revolut.feature_crypto_order_flow.api.navigation.CryptoExchangeFlowInputData
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 112(0x70, float:1.57E-43)
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            com.revolut.feature_crypto_order_flow.api.navigation.CryptoExchangeDestination r14 = new com.revolut.feature_crypto_order_flow.api.navigation.CryptoExchangeDestination
            r14.<init>(r4)
            vh5.a r15 = r13.v
            mcg.j r2 = new mcg.j
            r4 = 21
            r5 = 0
            r2.<init>(r13, r14, r5, r4)
            r0.u = r5
            r0.f303478x = r3
            r13 = 3
            java.lang.Object r13 = vh5.a.b3(r15, r2, r0, r13)
            if (r13 != r1) goto L82
        L81:
            return r1
        L82:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: x8j.g0.l3(x8j.g0, xi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r13 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3(x8j.g0 r11, java.lang.String r12, gim.c r13) {
        /*
            r11.getClass()
            boolean r0 = r13 instanceof x8j.f0
            if (r0 == 0) goto L16
            r0 = r13
            x8j.f0 r0 = (x8j.f0) r0
            int r1 = r0.f303432w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f303432w = r1
            goto L1b
        L16:
            x8j.f0 r0 = new x8j.f0
            r0.<init>(r11, r13)
        L1b:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f303432w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r13)
            goto L66
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            yhm.o.b(r13)
            goto L49
        L39:
            yhm.o.b(r13)
            utd.a r13 = r11.f303438q
            r0.f303432w = r4
            cvd.c r13 = (cvd.c) r13
            java.io.Serializable r13 = r13.a(r12, r0)
            if (r13 != r1) goto L49
            goto L65
        L49:
            r5 = r13
            tof.i7 r5 = (tof.i7) r5
            if (r5 != 0) goto L51
            zhm.f0 r11 = zhm.f0.f322471a
            return r11
        L51:
            com.revolut.domain.interactors.transactions.a r4 = r11.f303439r
            r9 = 0
            r10 = 30
            r6 = 0
            r7 = 0
            r8 = 0
            ufm.i r11 = com.revolut.domain.interactors.transactions.a.b(r4, r5, r6, r7, r8, r9, r10)
            r0.f303432w = r3
            java.lang.Object r13 = nim.a.b(r11, r0)
            if (r13 != r1) goto L66
        L65:
            return r1
        L66:
            java.lang.String r11 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: x8j.g0.m3(x8j.g0, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // x8j.n
    public final s Z2(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new s(o3(currency), this, 0);
    }

    @Override // x8j.n
    public final void b3(xi0.b from) {
        Intrinsics.checkNotNullParameter(from, "from");
        V2(new x64.b(this, from, null, 6), new yi5.b(29));
    }

    @Override // x8j.n
    public final void c3() {
        j60.a.v(this.f303437p, false, null, 3);
    }

    @Override // x8j.n
    public final void d3(xi0.b pocketCurrency) {
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        V2(new z(this, pocketCurrency, null), new yi5.b(29));
    }

    @Override // x8j.n
    public final void e3(xi0.b pocketCurrency) {
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        V2(new a0(this, pocketCurrency, null, 0), new yi5.b(29));
    }

    @Override // x8j.n
    public final void f3(long j2, StakingPocket stakingPocket, io3.d dVar, xi0.b pocketCurrency, boolean z) {
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        Continuation continuation = null;
        if ((dVar != null ? dVar.i : 0L) == 0 && j2 == 0) {
            if (pyd.c.M(stakingPocket != null ? stakingPocket.f88084g : null).f(dj0.d.e)) {
                if (stakingPocket != null) {
                    V2(new wih.c(stakingPocket.f88082b, stakingPocket, this, continuation, 25), new yi5.b(29));
                    return;
                }
                return;
            }
        }
        if (!z || r2().M0(new h0(pocketCurrency)) == null) {
            V2(new wh3.h(this, pocketCurrency, (Continuation) null, 8), new yi5.b(29));
        }
    }

    @Override // x8j.n
    public final void g3(xi0.b pocketCurrency, boolean z) {
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        if (!z || r2().M0(new i0(pocketCurrency)) == null) {
            V2(new a0(this, pocketCurrency, null, 1), new yi5.b(29));
        }
    }

    @Override // x8j.n
    public final void h3(String str, StakingProduct stakingProduct, StakingPocket stakingPocket) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        V2(new wh3.h(9, this, str, stakingProduct, stakingPocket, (Continuation) null), new yi5.b(29));
    }

    @Override // x8j.n
    public final void i3(StakingPocket stakingPocket) {
        Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
        N2(o2(new ytd.d(stakingPocket)), ModalDestination.Style.FULLSCREEN_FADE.f98307a, new p(this, 0));
    }

    @Override // x8j.n
    public final void j3(BuyFundingCurrencyPrefill buyFundingCurrencyPrefill) {
        this.B = buyFundingCurrencyPrefill;
    }

    @Override // x8j.n
    public final s k3(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new s(o3(currency), this, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable n3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof x8j.v
            if (r0 == 0) goto L13
            r0 = r6
            x8j.v r0 = (x8j.v) r0
            int r1 = r0.f303475w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f303475w = r1
            goto L18
        L13:
            x8j.v r0 = new x8j.v
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f303475w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L68
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L48
        L36:
            yhm.o.b(r6)
            w0i.a r6 = r5.f303440s
            ufm.i r6 = r6.a()
            r0.f303475w = r4
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L48
            goto L67
        L48:
            java.lang.String r2 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L6b
            r0.f303475w = r3
            xv5.c r6 = r5.f303435m
            efm.r r6 = xv5.c.b(r6)
            vkm.d r6 = rd0.e.b(r6)
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L68
        L67:
            return r1
        L68:
            xi0.b r6 = (xi0.b) r6
            return r6
        L6b:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x8j.g0.n3(gim.c):java.io.Serializable");
    }

    public final oji.f o3(xi0.b bVar) {
        io3.l lVar = io3.l.CURRENT;
        io3.i iVar = io3.i.INTERNAL;
        wsg.n nVar = this.f303434l;
        w4l.h hVar = w4l.h.f294642c;
        Continuation continuation = null;
        int i = 3;
        return ta6.a.d(new d6j.z(rd0.e.b(osg.b.g(nVar, hVar, lVar, null, iVar, null, null, null, 116)), bVar, 2), new dd5.e(this.f303436n.b(bVar, hVar), 1), new d6j.z(rd0.e.b(((ik3.c) this.f303441t).l(g.b.f123407a, hVar)), bVar, 1), new q87.q(oh5.e.a(this.f303444y, bVar), 17), new vkm.y(new v1(new c0(this, bVar, continuation, 0)), new x18.c(i, 4, continuation)), new vkm.y(new v1(new c0(this, bVar, continuation, 1)), new x18.c(i, 5, continuation)), new y(this, bVar, null));
    }
}

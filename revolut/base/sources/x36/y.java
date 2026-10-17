package x36;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.defi.asset_details.api.model.DefiCurrency;
import com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapQuoteParams;
import com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapSource;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.DeFiExchangeAmountContract$InputData;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model.DeFiExchangeOrderDraft;
import com.revolut.feature.transfer.core.models.DeFiBalanceSource;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.PocketSource;
import java.math.BigInteger;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends oki.h implements c {

    @NotNull
    private static final n Companion = new n();
    public final cli.y A;
    public final DeFiExchangeAmountContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kgm.i f302688p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k18.c f302689q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b46.c f302690r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g26.b f302691s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k18.c f302692t;
    public final w80.a u;
    public final z36.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final gte.a f302693w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final opf.z f302694x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final hlm.c f302695y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public y(bof.r stateMapper, DeFiExchangeAmountContract$InputData inputData, kgm.i swapInteractor, k18.c accountsInteractor, b46.c draftMutator, g26.b assetDetailsInteractor, k18.c fallbackCurrencyProvider, w80.a amountFormatter, z36.a balancesFilterInteractorFactory, gte.a featureToggleInteractor, opf.z transferFundingSourceInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(swapInteractor, "swapInteractor");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        Intrinsics.checkNotNullParameter(draftMutator, "draftMutator");
        Intrinsics.checkNotNullParameter(assetDetailsInteractor, "assetDetailsInteractor");
        Intrinsics.checkNotNullParameter(fallbackCurrencyProvider, "fallbackCurrencyProvider");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(balancesFilterInteractorFactory, "balancesFilterInteractorFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(transferFundingSourceInteractor, "transferFundingSourceInteractor");
        this.o = inputData;
        this.f302688p = swapInteractor;
        this.f302689q = accountsInteractor;
        this.f302690r = draftMutator;
        this.f302691s = assetDetailsInteractor;
        this.f302692t = fallbackCurrencyProvider;
        this.u = amountFormatter;
        this.v = balancesFilterInteractorFactory;
        this.f302693w = featureToggleInteractor;
        this.f302694x = transferFundingSourceInteractor;
        this.f302695y = hlm.d.a();
        h46.a aVar = inputData.d;
        h46.a aVar2 = h46.a.CEFI_TO_DEFI;
        if (aVar == aVar2 && inputData.f71758c != wd6.e.BUY) {
            throw new IllegalArgumentException("CeFi to DeFi exchange only supports BUY");
        }
        if (aVar == aVar2 && inputData.e == null) {
            throw new IllegalArgumentException("CeFi to DeFi exchange requires an initial balance");
        }
        this.z = hx7.e.a(this, new x2g.b(this, 2));
        this.A = mra.d.b(this, new a(null), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(x36.y r4, java.lang.String r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof x36.p
            if (r0 == 0) goto L13
            r0 = r6
            x36.p r0 = (x36.p) r0
            int r1 = r0.f302676x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f302676x = r1
            goto L18
        L13:
            x36.p r0 = new x36.p
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f302676x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L60
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            k18.c r4 = r4.f302689q
            wkm.l r4 = r4.F()
            q09.a r6 = new q09.a
            r2 = 15
            r6.<init>(r2)
            akg.n r4 = nim.a.v(r4, r6)
            kotlinx.coroutines.flow.Flow r4 = vkm.q.q(r4)
            wyg.s r6 = new wyg.s
            r2 = 23
            r6.<init>(r2)
            r2 = 0
            jhi.b r4 = mo3.a.g(r4, r2, r6, r3)
            r0.u = r5
            r0.f302676x = r3
            java.lang.Object r6 = vkm.q.x(r4, r0)
            if (r6 != r1) goto L60
            return r1
        L60:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r4 = r6.iterator()
        L66:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L7c
            java.lang.Object r6 = r4.next()
            r0 = r6
            com.revolut.feature.defi.accounts.api.model.DeFiBalance r0 = (com.revolut.feature.defi.accounts.api.model.DeFiBalance) r0
            java.lang.String r0 = r0.f71635a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r5)
            if (r0 == 0) goto L66
            return r6
        L7c:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Collection contains no element matching the predicate."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x36.y.I2(x36.y, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(x36.y r7, gim.c r8) {
        /*
            com.revolut.feature.defi.exchange.impl.ui.exchange_amount.DeFiExchangeAmountContract$InputData r0 = r7.o
            boolean r1 = r8 instanceof x36.q
            if (r1 == 0) goto L15
            r1 = r8
            x36.q r1 = (x36.q) r1
            int r2 = r1.f302677w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f302677w = r2
            goto L1a
        L15:
            x36.q r1 = new x36.q
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f302677w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r8)
            goto L9a
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            h46.a r8 = r0.d
            int[] r3 = x36.o.f302674c
            int r8 = r8.ordinal()
            r8 = r3[r8]
            if (r8 == r4) goto L56
            r7 = 2
            if (r8 != r7) goto L50
            com.revolut.feature.transfer.core.models.FundingSource r7 = r0.e
            if (r7 == 0) goto L48
            return r7
        L48:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Required value was null."
            r7.<init>(r8)
            throw r7
        L50:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L56:
            k18.c r7 = r7.f302692t
            xi0.b r8 = r0.f71756a
            java.lang.String r8 = r8.f306286a
            r7.getClass()
            java.lang.String r0 = "excludedAssetExternalId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.Object r0 = r7.f180141c
            k18.c r0 = (k18.c) r0
            wkm.l r0 = k18.c.G(r0)
            vkm.v1 r0 = c8g.a.D(r0)
            s1c.a r3 = new s1c.a
            r5 = 24
            r3.<init>(r5)
            akg.n r0 = nim.a.v(r0, r3)
            s36.i r3 = new s36.i
            r5 = 0
            r6 = 0
            r3.<init>(r7, r8, r6, r5)
            kotlinx.coroutines.flow.Flow r7 = xam.a.h(r3, r0)
            wyg.s r8 = new wyg.s
            r0 = 24
            r8.<init>(r0)
            jhi.b r7 = mo3.a.g(r7, r6, r8, r4)
            r1.f302677w = r4
            java.lang.Object r8 = vkm.q.x(r7, r1)
            if (r8 != r2) goto L9a
            return r2
        L9a:
            com.revolut.feature.defi.accounts.api.model.DeFiBalance r8 = (com.revolut.feature.defi.accounts.api.model.DeFiBalance) r8
            com.revolut.feature.transfer.core.models.DeFiBalanceSource r7 = d9.t0.q(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x36.y.J2(x36.y, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(x36.y r6, kotlin.jvm.functions.Function1 r7, gim.c r8) {
        /*
            cli.y r0 = r6.A
            boolean r1 = r8 instanceof x36.x
            if (r1 == 0) goto L15
            r1 = r8
            x36.x r1 = (x36.x) r1
            int r2 = r1.f302687y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f302687y = r2
            goto L1a
        L15:
            x36.x r1 = new x36.x
            r1.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r1.f302685w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f302687y
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            hlm.c r7 = r1.v
            kotlin.jvm.functions.Function1 r1 = r1.u
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            yhm.o.b(r8)
            r8 = r7
            r7 = r1
            goto L4f
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            yhm.o.b(r8)
            hlm.c r8 = r6.f302695y
            r3 = r7
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r1.u = r3
            r1.v = r8
            r1.f302687y = r4
            java.lang.Object r1 = r8.lock(r5, r1)
            if (r1 != r2) goto L4f
            return r2
        L4f:
            java.lang.Object r1 = r0.f22677a     // Catch: java.lang.Throwable -> L6a
            vkm.j2 r1 = (vkm.j2) r1     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L6a
            x36.a r1 = (x36.a) r1     // Catch: java.lang.Throwable -> L6a
            com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model.DeFiExchangeOrderDraft r1 = r1.f302659a     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L6c
            wwa.a r2 = new wwa.a     // Catch: java.lang.Throwable -> L6a
            r3 = 22
            r2.<init>(r7, r1, r3)     // Catch: java.lang.Throwable -> L6a
            r6.H2(r0, r2)     // Catch: java.lang.Throwable -> L6a
            kotlin.Unit r6 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L6a
            goto L6c
        L6a:
            r6 = move-exception
            goto L72
        L6c:
            r8.unlock(r5)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L72:
            r8.unlock(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x36.y.K2(x36.y, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        int i = o.f302672a[this.o.f71758c.ordinal()];
        Continuation continuation = null;
        if (i == 1) {
            l2(new r(this, continuation, 2), new yi5.b(26));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new r(this, continuation, 5), new yi5.b(26));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    public final DeFiSwapQuoteParams L2(DeFiExchangeOrderDraft deFiExchangeOrderDraft) {
        wd6.e eVar;
        DeFiSwapSource pocket;
        BigInteger bigInteger = deFiExchangeOrderDraft.d().f71769b;
        if (bigInteger != null) {
            BigInteger bigInteger2 = bigInteger.signum() > 0 ? bigInteger : null;
            if (bigInteger2 != null) {
                kyh.g gVar = deFiExchangeOrderDraft.f71765c;
                kyh.g gVar2 = kyh.g.TOP;
                DeFiExchangeAmountContract$InputData deFiExchangeAmountContract$InputData = this.o;
                if (gVar == gVar2) {
                    eVar = deFiExchangeAmountContract$InputData.f71758c;
                } else {
                    int i = o.f302672a[deFiExchangeAmountContract$InputData.f71758c.ordinal()];
                    if (i == 1) {
                        eVar = wd6.e.SELL;
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        eVar = wd6.e.BUY;
                    }
                }
                String str = deFiExchangeAmountContract$InputData.f71757b;
                FundingSource fundingSource = deFiExchangeOrderDraft.f;
                if (fundingSource instanceof DeFiBalanceSource) {
                    pocket = new DeFiSwapSource.DeFiAsset(fundingSource.f92240a, ((DeFiBalanceSource) fundingSource).f);
                } else if (fundingSource instanceof PocketSource) {
                    pocket = new DeFiSwapSource.Pocket(fundingSource.f92240a, fundingSource.f92241b.f306286a);
                } else {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "DeFiExchangeAmountScreenModel", "Unsupported DeFi exchange funding source for quote: ".concat(fundingSource.getClass().getSimpleName()), null, h0Var);
                }
                DeFiSwapSource deFiSwapSource = pocket;
                DeFiAssetDetails deFiAssetDetails = deFiExchangeOrderDraft.e;
                DefiCurrency defiCurrency = deFiAssetDetails.f71665a;
                return new DeFiSwapQuoteParams(str, deFiSwapSource, defiCurrency.f71671a, defiCurrency.f71673c, deFiAssetDetails.f71666b, bigInteger2, deFiExchangeOrderDraft.c(), eVar.name());
            }
        }
        return null;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(t1.g(vkm.q.q(this.A.B(new m(this, 0))), 300L), new x18.e(continuation, this, 1)), null, new wtj.f(this, continuation, 18), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.A;
    }
}

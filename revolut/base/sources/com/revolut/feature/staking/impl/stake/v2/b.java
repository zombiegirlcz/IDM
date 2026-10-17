package com.revolut.feature.staking.impl.stake.v2;

import ang.f;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.staking.api.model.StakingInfo;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import cxd.g;
import hsc.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qwd.j;
import qwd.k;
import qwd.l;
import qwd.m;
import qwd.o;
import qwd.p;
import qwd.q;
import qwd.t;
import qwd.v;
import uwd.i;
import vkm.t0;
import wsg.n;
import zhm.d0;
import zrc.d;
import zwd.e;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements j {

    @NotNull
    public static final q Companion = new q();
    public final sud.b A;
    public final f B;
    public final twd.a C;
    public final gud.b D;
    public final i E;
    public final d F;
    public final c G;
    public final ae5.a H;
    public final vo9.a I;
    public final ihm.b J;
    public final y K;
    public final com.revolut.kompot.navigable.vc.modal.a L;
    public final StakeControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f88149p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ppk.f f88150q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xv5.c f88151r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f88152s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zwd.b f88153t;
    public final j60.a u;
    public final fxd.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w0i.a f88154w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final w80.b f88155x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final gte.a f88156y;
    public final o7.b z;

    public b(cli.n stateMapper, i90.b uuidGenerator, StakeControllerContract$InputData inputData, n walletInteractor, ppk.f ratesInteractor, xv5.c cryptoBaseCurrencyInteractor, e stakeValidator, zwd.b amountErrorMapper, j60.a bottomDialogControllerExtension, fxd.a zeroBalanceBottomSheetProvider, w0i.a exchangeProhibitedCurrenciesChecker, w80.b amountFormatter, gte.a featureToggleInteractor, o7.b orderQuoteInteractor, sud.b earnRateBottomSheetResolver, f userInteractor, twd.a pickerFilterInteractor, gud.b buyDestinationProvider, i initialSourcePocketResolver, d cryptoScaInteractor, c cryptoScaPromptShotDialogProvider, ae5.a cryptoConvertDialogDisclaimerExtension, vo9.a paymentPocketMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(cryptoBaseCurrencyInteractor, "cryptoBaseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(stakeValidator, "stakeValidator");
        Intrinsics.checkNotNullParameter(amountErrorMapper, "amountErrorMapper");
        Intrinsics.checkNotNullParameter(bottomDialogControllerExtension, "bottomDialogControllerExtension");
        Intrinsics.checkNotNullParameter(zeroBalanceBottomSheetProvider, "zeroBalanceBottomSheetProvider");
        Intrinsics.checkNotNullParameter(exchangeProhibitedCurrenciesChecker, "exchangeProhibitedCurrenciesChecker");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(earnRateBottomSheetResolver, "earnRateBottomSheetResolver");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(pickerFilterInteractor, "pickerFilterInteractor");
        Intrinsics.checkNotNullParameter(buyDestinationProvider, "buyDestinationProvider");
        Intrinsics.checkNotNullParameter(initialSourcePocketResolver, "initialSourcePocketResolver");
        Intrinsics.checkNotNullParameter(cryptoScaInteractor, "cryptoScaInteractor");
        Intrinsics.checkNotNullParameter(cryptoScaPromptShotDialogProvider, "cryptoScaPromptShotDialogProvider");
        Intrinsics.checkNotNullParameter(cryptoConvertDialogDisclaimerExtension, "cryptoConvertDialogDisclaimerExtension");
        Intrinsics.checkNotNullParameter(paymentPocketMapper, "paymentPocketMapper");
        this.o = inputData;
        this.f88149p = walletInteractor;
        this.f88150q = ratesInteractor;
        this.f88151r = cryptoBaseCurrencyInteractor;
        this.f88152s = stakeValidator;
        this.f88153t = amountErrorMapper;
        this.u = bottomDialogControllerExtension;
        this.v = zeroBalanceBottomSheetProvider;
        this.f88154w = exchangeProhibitedCurrenciesChecker;
        this.f88155x = amountFormatter;
        this.f88156y = featureToggleInteractor;
        this.z = orderQuoteInteractor;
        this.A = earnRateBottomSheetResolver;
        this.B = userInteractor;
        this.C = pickerFilterInteractor;
        this.D = buyDestinationProvider;
        this.E = initialSourcePocketResolver;
        this.F = cryptoScaInteractor;
        this.G = cryptoScaPromptShotDialogProvider;
        this.H = cryptoConvertDialogDisclaimerExtension;
        this.I = paymentPocketMapper;
        StakingProduct stakingProduct = inputData.f88138a;
        ihm.b bVarE = ihm.b.e(new dj0.d(0L, stakingProduct.d));
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.J = bVarE;
        xi0.b bVar = stakingProduct.d;
        Data data = new Data(new k(null, new dj0.d(0L, stakingProduct.d)), null, false, 6, null);
        String strU = wp5.y.u(uuidGenerator, "toString(...)");
        StakingPocket stakingPocket = inputData.f88139b;
        this.K = mra.d.b(this, new m(0L, bVar, bVar, data, false, new l(strU, stakingProduct, stakingPocket, stakingPocket != null ? stakingPocket.f88081a : null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), null, null), stateMapper, null, false, 12);
        this.L = hx7.e.a(this, new qm2.c(this, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.staking.impl.stake.v2.b r5, gim.c r6) {
        /*
            cli.y r0 = r5.K
            boolean r1 = r6 instanceof qwd.u
            if (r1 == 0) goto L15
            r1 = r6
            qwd.u r1 = (qwd.u) r1
            int r2 = r1.f249880w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f249880w = r2
            goto L1a
        L15:
            qwd.u r1 = new qwd.u
            r1.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f249880w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            qwd.o r6 = new qwd.o
            r3 = 2
            r6.<init>(r3)
            r5.H2(r0, r6)
            uwd.i r6 = r5.E
            r1.f249880w = r4
            java.io.Serializable r6 = r6.g(r1)
            if (r6 != r2) goto L48
            return r2
        L48:
            io3.d r6 = (io3.d) r6
            afa.s r1 = new afa.s
            r2 = 14
            r1.<init>(r6, r2)
            r5.H2(r0, r1)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.staking.impl.stake.v2.b.I2(com.revolut.feature.staking.impl.stake.v2.b, gim.c):java.lang.Object");
    }

    public static final yqi.b J2(b bVar, dj0.d dVar, dj0.d dVar2, dj0.d dVar3) {
        if (dVar.k()) {
            return null;
        }
        StakeControllerContract$InputData stakeControllerContract$InputData = bVar.o;
        StakingInfo stakingInfo = stakeControllerContract$InputData.f88138a.f88087b;
        dj0.d dVar4 = stakingInfo.e;
        dj0.d dVar5 = stakingInfo.f;
        dj0.d dVar6 = stakingInfo.f88064h;
        StakingPocket stakingPocket = stakeControllerContract$InputData.f88139b;
        return (yqi.b) d0.d0(bVar.f88152s.validate(new g(dVar4, dVar5, dVar6, pyd.c.M(stakingPocket != null ? stakingPocket.f88083c : null), dVar, dVar2, dVar3)).f316033b);
    }

    @Override // yji.l
    public final void I1() {
        l2(new t(this, null, 0), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.L;
    }

    @Override // yji.l
    public final void T1(long j2) {
        o oVar = new o(1);
        y yVar = this.K;
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(new t0(yVar.B(oVar), 1), new q7b.j(continuation, this, 23)), null, new v(this, continuation, 0), 3);
        int i = 0;
        yji.l.b1(this, c6d.b.i(vkm.q.q(yVar.B(new o(i))), new p(this, i)), null, new v(this, continuation, 1), 3);
        n2(new t(this, continuation, 1), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.K;
    }
}

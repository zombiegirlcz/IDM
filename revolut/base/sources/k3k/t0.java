package k3k;

import aw0.f4;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.PocketSource;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreenContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class t0 extends jki.g implements b0 {

    @NotNull
    public static final f0 Companion = new f0();
    public final n5k.b A;
    public final s5k.a B;
    public final xdk.b C;
    public final gte.a D;
    public final j60.a E;
    public final n60.a F;
    public final l2j.a G;
    public final w80.b H;
    public final l80.e I;
    public final ldd.b J;
    public final h2k.k K;
    public final w L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RemittanceAmountScreenContract$InputData f180792p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o3k.g f180793q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f180794r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a4k.a f180795s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.feature.external_accounts.api.navigation.a f180796t;
    public final p3k.b u;
    public final e3k.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f2k.k f180797w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final zof.f f180798x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m3k.d f180799y;
    public final r3k.f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(RemittanceAmountScreenContract$InputData inputData, o3k.g interactor, i router, a4k.a transferDataObserver, com.revolut.feature.external_accounts.api.navigation.a externalPocketNavigationFactory, p3k.b footerMapper, e3k.e transferTypeMapper, f2k.k feeOptionsInfoDialogProvider, zof.f transferFeatureScreensProvider, m3k.d extraDataExtension, r3k.f validatorExtension, n5k.b paymentFeesDialogExtension, s5k.a transferWalletLimitsExtension, xdk.b pocketExtension, gte.a featureToggleInteractor, j60.a bottomDialogExtension, n60.a keyboardExtension, l2j.a currencyChooserFlowFactory, w80.b amountFormatter, l80.e dateProvider, ldd.b focusRequesterDelegate, h2k.k priceComparisonDelegate, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(transferDataObserver, "transferDataObserver");
        Intrinsics.checkNotNullParameter(externalPocketNavigationFactory, "externalPocketNavigationFactory");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        Intrinsics.checkNotNullParameter(transferTypeMapper, "transferTypeMapper");
        Intrinsics.checkNotNullParameter(feeOptionsInfoDialogProvider, "feeOptionsInfoDialogProvider");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(extraDataExtension, "extraDataExtension");
        Intrinsics.checkNotNullParameter(validatorExtension, "validatorExtension");
        Intrinsics.checkNotNullParameter(paymentFeesDialogExtension, "paymentFeesDialogExtension");
        Intrinsics.checkNotNullParameter(transferWalletLimitsExtension, "transferWalletLimitsExtension");
        Intrinsics.checkNotNullParameter(pocketExtension, "pocketExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(priceComparisonDelegate, "priceComparisonDelegate");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f180792p = inputData;
        this.f180793q = interactor;
        this.f180794r = router;
        this.f180795s = transferDataObserver;
        this.f180796t = externalPocketNavigationFactory;
        this.u = footerMapper;
        this.v = transferTypeMapper;
        this.f180797w = feeOptionsInfoDialogProvider;
        this.f180798x = transferFeatureScreensProvider;
        this.f180799y = extraDataExtension;
        this.z = validatorExtension;
        this.A = paymentFeesDialogExtension;
        this.B = transferWalletLimitsExtension;
        this.C = pocketExtension;
        this.D = featureToggleInteractor;
        this.E = bottomDialogExtension;
        this.F = keyboardExtension;
        this.G = currencyChooserFlowFactory;
        this.H = amountFormatter;
        this.I = dateProvider;
        this.J = focusRequesterDelegate;
        this.K = priceComparisonDelegate;
        this.L = new w(inputData.getF102028a(), inputData.getF102029b(), null, null, null, 0);
    }

    public static final kq2.o y2(t0 t0Var, FundingSource fundingSource) {
        io3.d dVar;
        PocketSource pocketSource = fundingSource instanceof PocketSource ? (PocketSource) fundingSource : null;
        if (((pocketSource == null || (dVar = pocketSource.d) == null) ? null : dVar.f163149h) == io3.i.EXTERNAL) {
            return kq2.o.DIRECT_DEBIT_TOPUP;
        }
        return null;
    }

    public final RemittanceTransferData A2() {
        RemittanceTransferData remittanceTransferData = ((w) t2()).f180805c;
        if (remittanceTransferData != null) {
            return remittanceTransferData;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void B2(Function1 function1) {
        x2(new k1.a(function1, this, 13));
    }

    @Override // yji.l
    public final void I1() {
        ldd.b bVar = this.J;
        bVar.f194072c = false;
        bVar.b(new f4("ITEM_AMOUNT_INPUT_ID", true));
        Continuation continuation = null;
        l2(new l0(this, continuation, 0), new yi5.b(26));
        yji.l.a1(this, vkm.q.Q(vkm.q.q(new iyg.b0(q2(), 13)), new gs.n(continuation, this, 2)), null, null, new m0(this, continuation, 0), 3);
        yji.l.a1(this, vkm.q.q(new iyg.b0(q2(), 14)), null, null, new m0(this, continuation, 1), 3);
    }

    @Override // yji.l
    public final void P1() {
        x2(new e0(this, 1));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.L;
    }

    public final x z2() {
        x xVar = ((w) t2()).d;
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}

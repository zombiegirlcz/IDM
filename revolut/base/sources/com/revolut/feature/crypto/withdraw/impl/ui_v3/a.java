package com.revolut.feature.crypto.withdraw.impl.ui_v3;

import agf.b;
import com.revolut.feature.crypto.withdraw.api.CryptoSendApi$Toggles;
import com.revolut.feature.crypto.withdraw.api.CryptoWithdrawApi$Toggles;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoSendInput;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.CryptoSendFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import cp5.d;
import eq5.i0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lo5.p;
import oki.h;
import zhm.f0;
import zp5.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements c {
    public final CryptoSendInput o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f71203p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i0 f71204q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gte.a f71205r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zp5.h f71206s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f71207t;
    public final zq5.c u;
    public final zp5.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f01.c f71208w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final yki.a f71209x;

    public a(CryptoSendInput inputData, p cryptoSendNaviCommandProvider, i0 cryptoSendAmountInputScreenFlowResultHolder, gte.a featureToggleInteractor, zp5.h supportedRecipientsMapper, b transactionWorkflowInteractor, zq5.c beneficiaryTransferMoneyPocketResolver, zp5.a bankTransferBalancesFilterInteractor, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoSendNaviCommandProvider, "cryptoSendNaviCommandProvider");
        Intrinsics.checkNotNullParameter(cryptoSendAmountInputScreenFlowResultHolder, "cryptoSendAmountInputScreenFlowResultHolder");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(supportedRecipientsMapper, "supportedRecipientsMapper");
        Intrinsics.checkNotNullParameter(transactionWorkflowInteractor, "transactionWorkflowInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryTransferMoneyPocketResolver, "beneficiaryTransferMoneyPocketResolver");
        Intrinsics.checkNotNullParameter(bankTransferBalancesFilterInteractor, "bankTransferBalancesFilterInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.o = inputData;
        this.f71203p = cryptoSendNaviCommandProvider;
        this.f71204q = cryptoSendAmountInputScreenFlowResultHolder;
        this.f71205r = featureToggleInteractor;
        this.f71206s = supportedRecipientsMapper;
        this.f71207t = transactionWorkflowInteractor;
        this.u = beneficiaryTransferMoneyPocketResolver;
        this.v = bankTransferBalancesFilterInteractor;
        this.f71208w = uiKitResources;
        this.f71209x = d.a(this, I2(), f0.f322471a, new zo2.h(this, 2));
    }

    public final CryptoSendFlowContract$Step I2() {
        CryptoSendInput cryptoSendInput = this.o;
        if (cryptoSendInput instanceof CryptoSendInput.SendCrypto) {
            return new CryptoSendFlowContract$Step.WalletsList(((CryptoSendInput.SendCrypto) cryptoSendInput).f71142a, ((CryptoSendInput.SendCrypto) cryptoSendInput).f71143b);
        }
        if (cryptoSendInput instanceof CryptoSendInput.BeneficiaryDetails) {
            return new CryptoSendFlowContract$Step.WalletDetails(((CryptoSendInput.BeneficiaryDetails) cryptoSendInput).f71140a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void J2(CryptoAddress cryptoAddress, xi0.b bVar, boolean z) {
        CryptoSendApi$Toggles.CryptoWithdrawFlowKompotMigration cryptoWithdrawFlowKompotMigration = CryptoSendApi$Toggles.CryptoWithdrawFlowKompotMigration.f71056c;
        jte.d dVar = (jte.d) this.f71205r;
        boolean zC = dVar.c(cryptoWithdrawFlowKompotMigration);
        yki.a aVar = this.f71209x;
        if (zC && dVar.c(CryptoWithdrawApi$Toggles.CryptoWithdrawFeesUsingToken.f71058c)) {
            h.t2(this, aVar, new CryptoSendFlowContract$Step.AmountInput(cryptoAddress, bVar, false), z, null, false, 12);
            return;
        }
        if (!z) {
            aVar.e(true);
        }
        n2(new z9m.a(this, cryptoAddress, bVar, (Continuation) null, 8), new whi.b(6));
    }

    public final void K2() {
        yki.a aVar = this.f71209x;
        h.r2(aVar);
        h.t2(this, aVar, I2(), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f71209x;
    }
}

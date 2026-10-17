package g4k;

import a41.j1;
import ahe.y0;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4k.g f140570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3k.d f140571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final opf.c0 f140572c;
    public final vo9.a d;
    public final k61.a e;
    public final u5k.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wsg.n f140573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ang.f f140574h;
    public final c5k.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l1l.s f140575j;
    public final e5k.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kak.a f140576l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wt9.e f140577m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l1l.h f140578n;
    public final l1l.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h2k.k f140579p;

    public p(p4k.g flowInteractor, g3k.d remittanceInteractor, opf.c0 transferSuggestedAmountsInteractor, vo9.a pocketMapper, k61.a transferInteractor, u5k.c transferWalletLimitsInteractor, wsg.n walletInteractor, ang.f userInteractor, c5k.a transferErrorStateMapper, l1l.s commonWalletLimitsValidator, l1l.m commonMaxTransferAmountValidator, l1l.q commonTransferNoteLengthValidator, l1l.k commonFundingSourceValidator, urf.f amountTransferLimitsValidator, e5k.b bankTransferAmountBalanceValidator, e5k.f bankTransferFeeOptionValidator, e5k.d bankTransferAvailabilityValidator, e5k.g bankTransferStructuredReferenceValidator, kak.a pdaInteractor, l1l.o commonPocketTransferLimitValidator, wt9.e transferAvailableBalanceInteractor, l1l.h dealingCurrenciesValidator, l1l.h commonTransferAvailabilityValidator, h2k.k priceComparisonDelegate) {
        Intrinsics.checkNotNullParameter(flowInteractor, "flowInteractor");
        Intrinsics.checkNotNullParameter(remittanceInteractor, "remittanceInteractor");
        Intrinsics.checkNotNullParameter(transferSuggestedAmountsInteractor, "transferSuggestedAmountsInteractor");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(transferWalletLimitsInteractor, "transferWalletLimitsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(transferErrorStateMapper, "transferErrorStateMapper");
        Intrinsics.checkNotNullParameter(commonWalletLimitsValidator, "commonWalletLimitsValidator");
        Intrinsics.checkNotNullParameter(commonMaxTransferAmountValidator, "commonMaxTransferAmountValidator");
        Intrinsics.checkNotNullParameter(commonTransferNoteLengthValidator, "commonTransferNoteLengthValidator");
        Intrinsics.checkNotNullParameter(commonFundingSourceValidator, "commonFundingSourceValidator");
        Intrinsics.checkNotNullParameter(amountTransferLimitsValidator, "amountTransferLimitsValidator");
        Intrinsics.checkNotNullParameter(bankTransferAmountBalanceValidator, "bankTransferAmountBalanceValidator");
        Intrinsics.checkNotNullParameter(bankTransferFeeOptionValidator, "bankTransferFeeOptionValidator");
        Intrinsics.checkNotNullParameter(bankTransferAvailabilityValidator, "bankTransferAvailabilityValidator");
        Intrinsics.checkNotNullParameter(bankTransferStructuredReferenceValidator, "bankTransferStructuredReferenceValidator");
        Intrinsics.checkNotNullParameter(pdaInteractor, "pdaInteractor");
        Intrinsics.checkNotNullParameter(commonPocketTransferLimitValidator, "commonPocketTransferLimitValidator");
        Intrinsics.checkNotNullParameter(transferAvailableBalanceInteractor, "transferAvailableBalanceInteractor");
        Intrinsics.checkNotNullParameter(dealingCurrenciesValidator, "dealingCurrenciesValidator");
        Intrinsics.checkNotNullParameter(commonTransferAvailabilityValidator, "commonTransferAvailabilityValidator");
        Intrinsics.checkNotNullParameter(priceComparisonDelegate, "priceComparisonDelegate");
        this.f140570a = flowInteractor;
        this.f140571b = remittanceInteractor;
        this.f140572c = transferSuggestedAmountsInteractor;
        this.d = pocketMapper;
        this.e = transferInteractor;
        this.f = transferWalletLimitsInteractor;
        this.f140573g = walletInteractor;
        this.f140574h = userInteractor;
        this.i = transferErrorStateMapper;
        this.f140575j = commonWalletLimitsValidator;
        this.k = bankTransferAmountBalanceValidator;
        this.f140576l = pdaInteractor;
        this.f140577m = transferAvailableBalanceInteractor;
        this.f140578n = dealingCurrenciesValidator;
        this.o = commonTransferAvailabilityValidator;
        this.f140579p = priceComparisonDelegate;
    }

    public final v0b.b a(BankTransferData bankTransferData, f5j.a aVar) {
        vkm.d dVarB = rd0.e.b(m70.a.g(this.f140573g.U(AccountId.Personal.f51414a, true), null, new g3e.s(23), 1));
        xi0.a aVar2 = xi0.b.Companion;
        String str = aVar.f132337n;
        if (str == null) {
            str = "";
        }
        aVar2.getClass();
        return ta6.a.g(dVarB, rd0.e.b(((k61.i) this.e).h(xi0.a.a(str))), rd0.e.b(ue0.e.E(this.f140576l.a(aVar.f132329a), new n61.o(false, false))), rd0.e.b(this.f140571b.a(f5j.c.e(aVar), bankTransferData.f101926c, bankTransferData.f101925b, f2k.f.a(aVar), aVar.f132329a, w4l.i.f294643c, bankTransferData.f101933p)), new l(5, null));
    }

    public final wkm.l b(BankTransferData transferData, f5j.a beneficiary, TransferFlowType flowType) {
        p4k.g gVar = this.f140570a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        return vkm.q.Q(new v1(new j1(gVar, transferData, beneficiary, flowType, (Continuation) null)), new y0(9, this, transferData, beneficiary, flowType, (Continuation) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025b  */
    /* JADX WARN: Type inference failed for: r7v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final et6.u1 c(com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r24, com.revolut.data.model.Data r25, kq2.f r26, long r27, java.util.List r29, java.lang.Integer r30, g4k.r r31, java.util.Set r32) {
        /*
            Method dump skipped, instruction units count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4k.p.c(com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData, com.revolut.data.model.Data, kq2.f, long, java.util.List, java.lang.Integer, g4k.r, java.util.Set):et6.u1");
    }
}

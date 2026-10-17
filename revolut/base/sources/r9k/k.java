package r9k;

import ard.c0;
import com.revolut.feature.transfer.core.models.CountryProfile;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.models.quotes.TransferQuoteRequest;
import com.revolut.feature.transfer.models.quotes.TransferQuoteSender;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import dfj.v;
import e7l.g;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l1l.m;
import l1l.q;
import l1l.s;
import org.jetbrains.annotations.NotNull;
import q97.g3;
import vkm.v1;
import wkm.l;
import wsg.n;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9k.d f252753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f252754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k61.a f252755c;
    public final u5k.c d;
    public final n e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t1j.b f252756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f252757h;
    public final e5k.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wt9.e f252758j;
    public final l1l.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l1l.h f252759l;

    public k(j9k.d p2pCurrencyInteractor, fk3.a configurationInteractor, k61.a transferInteractor, u5k.c transferWalletLimitsInteractor, n walletInteractor, a transferErrorStateMapper, t1j.b transferQuoteInteractor, l1l.a commonAmountDecimalValidator, l1l.d commonAmountMultipleValidator, l1l.f commonCurrencySupportedValidator, l1l.j commonExchangeRatesReadyValidator, m commonMaxTransferAmountValidator, s commonWalletLimitsValidator, q commonTransferNoteLengthValidator, l1l.k commonFundingSourceValidator, urf.f amountTransferLimitsValidator, e5k.b p2pAmountBalanceValidator, t9k.b p2pSpamValidator, t9k.e splitBillLinkAmountValidator, wt9.e availableBalanceInteractor, l1l.h dealingCurrenciesValidator, l1l.h commonTransferAvailabilityValidator) {
        Intrinsics.checkNotNullParameter(p2pCurrencyInteractor, "p2pCurrencyInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(transferWalletLimitsInteractor, "transferWalletLimitsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(transferErrorStateMapper, "transferErrorStateMapper");
        Intrinsics.checkNotNullParameter(transferQuoteInteractor, "transferQuoteInteractor");
        Intrinsics.checkNotNullParameter(commonAmountDecimalValidator, "commonAmountDecimalValidator");
        Intrinsics.checkNotNullParameter(commonAmountMultipleValidator, "commonAmountMultipleValidator");
        Intrinsics.checkNotNullParameter(commonCurrencySupportedValidator, "commonCurrencySupportedValidator");
        Intrinsics.checkNotNullParameter(commonExchangeRatesReadyValidator, "commonExchangeRatesReadyValidator");
        Intrinsics.checkNotNullParameter(commonMaxTransferAmountValidator, "commonMaxTransferAmountValidator");
        Intrinsics.checkNotNullParameter(commonWalletLimitsValidator, "commonWalletLimitsValidator");
        Intrinsics.checkNotNullParameter(commonTransferNoteLengthValidator, "commonTransferNoteLengthValidator");
        Intrinsics.checkNotNullParameter(commonFundingSourceValidator, "commonFundingSourceValidator");
        Intrinsics.checkNotNullParameter(amountTransferLimitsValidator, "amountTransferLimitsValidator");
        Intrinsics.checkNotNullParameter(p2pAmountBalanceValidator, "p2pAmountBalanceValidator");
        Intrinsics.checkNotNullParameter(p2pSpamValidator, "p2pSpamValidator");
        Intrinsics.checkNotNullParameter(splitBillLinkAmountValidator, "splitBillLinkAmountValidator");
        Intrinsics.checkNotNullParameter(availableBalanceInteractor, "availableBalanceInteractor");
        Intrinsics.checkNotNullParameter(dealingCurrenciesValidator, "dealingCurrenciesValidator");
        Intrinsics.checkNotNullParameter(commonTransferAvailabilityValidator, "commonTransferAvailabilityValidator");
        this.f252753a = p2pCurrencyInteractor;
        this.f252754b = configurationInteractor;
        this.f252755c = transferInteractor;
        this.d = transferWalletLimitsInteractor;
        this.e = walletInteractor;
        this.f = transferErrorStateMapper;
        this.f252756g = transferQuoteInteractor;
        this.f252757h = commonWalletLimitsValidator;
        this.i = p2pAmountBalanceValidator;
        this.f252758j = availableBalanceInteractor;
        this.k = dealingCurrenciesValidator;
        this.f252759l = commonTransferAvailabilityValidator;
    }

    public static v1 a(k kVar, dj0.d dVar, int i) {
        int i2 = i & 1;
        Continuation continuation = null;
        if (i2 != 0) {
            dVar = null;
        }
        return new v1(new r83.g(dVar, continuation, 6));
    }

    public final l b(PeerToPeerTransferData transferData, zm3.a contact, hrf.f direction, Set extraConfigs) {
        Object g3Var;
        TransferFlowType.Default flowType = TransferFlowType.Default.f92257b;
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(extraConfigs, "extraConfigs");
        long j2 = transferData.f102244a;
        FundingSource fundingSource = transferData.e;
        if (j2 == 0) {
            g3Var = new go.g(null, 2);
        } else {
            dj0.d dVar = transferData.f102256s;
            xi0.b bVar = transferData.f102246c;
            String strT = czi.c.t(fundingSource);
            CountryProfile f = fundingSource.getF92264h();
            g3Var = new g3(mo3.a.g(this.f252756g.l(new TransferQuoteRequest(dVar, new TransferQuoteSender(strT, f != null ? f.f92231a : null, bVar), transferData.f102253p, (String) null, 24)), null, null, 3), 8);
        }
        return vkm.q.Q(new t38.e(g3Var, 24, this.f252758j.a(fundingSource), new jv.d(3, 1, null)), new v((Continuation) null, this, transferData, contact, direction, extraConfigs));
    }

    public final qna.n c(PeerToPeerTransferData data, hrf.c cVar, long j2, PeerToPeerRecipient peerToPeerRecipient, TransferFlowType flowType, hrf.f direction, Set extraConfigs) {
        Intrinsics.checkNotNullParameter(data, "transferData");
        Intrinsics.checkNotNullParameter(peerToPeerRecipient, "peerToPeerRecipient");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(extraConfigs, "extraConfigs");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(peerToPeerRecipient, "peerToPeerRecipient");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(direction, "direction");
        xi0.b bVar = data.f102245b;
        return new qna.n(vkm.q.Q(new c0(ta6.a.g(rd0.e.b(((k61.i) this.f252755c).h(bVar)), peerToPeerRecipient.f102270a instanceof zm3.l ? a(this, null, 3) : a(this, new dj0.d(100L, bVar), 2), rd0.e.b(ue0.e.E(m70.a.g(this.e.U(flowType.getF92255a(), true), null, null, 3), f0.f322471a)), rd0.e.b(m70.a.g(((ik3.c) this.f252754b).k(g.b.f123407a), null, null, 3)), new f(this, peerToPeerRecipient, flowType, direction, null)), this, data, peerToPeerRecipient, 18), new h(null, this, data, cVar, j2, peerToPeerRecipient, direction, extraConfigs)), this, 9);
    }

    public final go.g d(PeerToPeerTransferData peerToPeerTransferData, hrf.c cVar, hrf.f fVar) {
        int i = e.f252741a[fVar.ordinal()];
        if (i == 1) {
            return new go.g(l1l.j.a(new l1l.i(peerToPeerTransferData.f102246c, peerToPeerTransferData.f102245b, cVar != null)).f316033b, 2);
        }
        if (i == 2) {
            return new go.g(f0.f322471a, 2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final v1 e(PeerToPeerTransferData peerToPeerTransferData, d dVar) {
        dj0.d dVar2 = peerToPeerTransferData.f102256s;
        dj0.d dVar3 = dVar.f252739b;
        return new v1(new p8k.h(m.a(new l1l.l(dVar2, dVar3 != null ? dVar3.f115082a : 0L)), null, 3));
    }
}

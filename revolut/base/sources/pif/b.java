package pif;

import gsf.m;
import io3.i;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import nif.b0;
import nif.c0;
import nif.c1;
import nif.d0;
import nif.e0;
import nif.f0;
import nif.h1;
import nif.l0;
import nif.n1;
import nif.o0;
import nif.o1;
import nif.p1;
import nif.s;
import nif.t1;
import nif.v;
import nif.w1;
import nif.y;
import nif.z1;
import org.jetbrains.annotations.NotNull;
import xhf.a0;
import xhf.d2;
import xhf.e2;
import xhf.h0;
import xhf.m1;
import xhf.n;
import xhf.n0;
import xhf.o;
import xhf.u0;
import xhf.v0;
import xhf.w;
import xhf.x;
import xhf.x1;
import xhf.y0;
import xhf.y1;
import yhf.h;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements pif.a {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static b0 b(h.b bVar) {
        return new b0(bVar.getCurrency(), bVar.getAmount());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d0 a(xhf.h dto) {
        e0 e0Var;
        c0 c0Var;
        h hVar;
        e0 e0Var2;
        e0 e0Var3;
        Object f0Var;
        Object obj2;
        Object f0Var2;
        Intrinsics.checkNotNullParameter(dto, "dto");
        h defiMetadata = dto.getDefiMetadata();
        if (defiMetadata == null) {
            return null;
        }
        String legId = dto.getLegId();
        String accountId = defiMetadata.getAccountId();
        String accountScopedAssetId = defiMetadata.getAccountScopedAssetId();
        b0 b0VarB = b(defiMetadata.getAmount());
        h.b fee2 = defiMetadata.getFee();
        b0 b0VarB2 = fee2 != null ? b(fee2) : null;
        h.b fiatAmount = defiMetadata.getFiatAmount();
        b0 b0VarB3 = fiatAmount != null ? b(fiatAmount) : null;
        h.b feeFiatAmount = defiMetadata.getFeeFiatAmount();
        b0 b0VarB4 = feeFiatAmount != null ? b(feeFiatAmount) : null;
        h.b counterpartFiatAmount = defiMetadata.getCounterpartFiatAmount();
        b0 b0VarB5 = counterpartFiatAmount != null ? b(counterpartFiatAmount) : null;
        h.b counterpart = defiMetadata.getCounterpart();
        b0 b0VarB6 = counterpart != null ? b(counterpart) : null;
        String counterpartAccountScopedAssetId = defiMetadata.getCounterpartAccountScopedAssetId();
        BigDecimal rate = defiMetadata.getRate();
        h.e bundle = defiMetadata.getBundle();
        if (bundle != null) {
            e0Var = null;
            c0Var = new c0(bundle.getId(), bundle.getLink());
        } else {
            e0Var = null;
            c0Var = null;
        }
        h.f onChainTx = defiMetadata.getOnChainTx();
        if (onChainTx != null) {
            hVar = defiMetadata;
            e0Var2 = new e0(onChainTx.getHash(), onChainTx.getLink());
        } else {
            hVar = defiMetadata;
            e0Var2 = e0Var;
        }
        h.d recipient = hVar.getRecipient();
        if (recipient != null) {
            e0Var3 = e0Var2;
            f0Var = new f0(recipient.getWalletAddress(), recipient.getLink());
        } else {
            e0Var3 = e0Var2;
            f0Var = e0Var;
        }
        h.d sender = hVar.getSender();
        if (sender != null) {
            obj2 = f0Var;
            f0Var2 = new f0(sender.getWalletAddress(), sender.getLink());
        } else {
            obj2 = f0Var;
            f0Var2 = e0Var;
        }
        return new d0(legId, accountId, accountScopedAssetId, b0VarB, b0VarB2, b0VarB3, b0VarB4, b0VarB5, b0VarB6, counterpartAccountScopedAssetId, rate, c0Var, e0Var3, obj2, f0Var2, hVar.getChain());
    }

    public final l0 c(xhf.h dto, i iVar) {
        String strK0;
        long j2;
        n1 n1Var;
        Boolean bool;
        String str;
        w1 w1Var;
        z1 z1Var;
        o1 o1Var;
        List listN0;
        v0 brand;
        Intrinsics.checkNotNullParameter(dto, "dto");
        if (iVar == null && dto.getExchangeFee() == 0 && dto.getTransferFee() == 0 && dto.getSurcharge() == null && dto.getFeeBreakdownId() == null && dto.getFeesBreakdown() == null) {
            Boolean cardVerification = dto.getCardVerification();
            Boolean bool2 = Boolean.TRUE;
            if (!Intrinsics.f(cardVerification, bool2) && dto.getLoungePassIds() == null && dto.getHotelBooking() == null && dto.getShops() == null && dto.getUserOfferId() == null && dto.getCashbackType() == null && dto.getComment() == null && !Intrinsics.f(dto.getSavingsVaultsBonus(), bool2) && dto.getCharity() == null && dto.getPosTime() == null && dto.getOffline() == null && dto.getRejectComment() == null && dto.getNote() == null && dto.getGif() == null && dto.getBillAccount() == null && dto.getStopOrder() == null && dto.o0() == null && dto.getRateMarkupAmount() == null && dto.getRateMarkupAmountCurrency() == null && dto.getMoneyRequest() == null && dto.getTransferType() == null && dto.getIsBusinessTransaction() == null && dto.getPayerName() == null && dto.getProvisionalRefund() == null && dto.getReferralInviteId() == null && dto.getCreditCardCashbackCollection() == null && dto.getStakingInfo() == null && ((dto.getTopupSource() == null || Intrinsics.f(dto.getTopupSource(), "UNSPECIFIED")) && dto.getPaymentScheme() == null && dto.getLocalInstrument() == null && dto.getStatementDeferralInstalment() == null && dto.getPrePurchaseInstalment() == null && dto.getInstalmentInfo() == null && dto.getLinkedExchangeDetails() == null && dto.getPaymentAuthorisation() == null && dto.getFundsTransferExpireTimeMillis() == null && dto.getFundingStatus() == null && dto.getP2pPersonalisationId() == null && dto.getPaymentLinkId() == null && dto.getUnblockDate() == null && dto.getLedgerOrigin() == null)) {
                m transferReasons = dto.getTransferReasons();
                if ((transferReasons != null ? transferReasons.getCatalogue() : null) == null) {
                    m1 merchant = dto.getMerchant();
                    if ((merchant != null ? merchant.getBlockEligibility() : null) == null && dto.getChargebackUpdatedDate() == null && dto.getGuardian() == null) {
                        return null;
                    }
                }
            }
        }
        String legId = dto.getLegId();
        String strG = iVar != null ? u1.g(iVar, r11.a.k()) : null;
        Boolean cardVerification2 = dto.getCardVerification();
        List loungePassIds = dto.getLoungePassIds();
        h1 h1Var = loungePassIds != null ? new h1(loungePassIds) : null;
        xhf.b0 hotelBooking = dto.getHotelBooking();
        String id10 = hotelBooking != null ? hotelBooking.getId() : null;
        xhf.w1 shops = dto.getShops();
        String id11 = (shops == null || (brand = shops.getBrand()) == null) ? null : brand.getId();
        String userOfferId = dto.getUserOfferId();
        String cashbackType = dto.getCashbackType();
        String comment = dto.getComment();
        if (comment == null || (listN0 = kotlin.text.d0.n0(comment, new String[]{"{::}"}, 0, 6)) == null) {
            strK0 = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listN0) {
                if (!kotlin.text.d0.W((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            strK0 = zhm.d0.k0(arrayList, ", ", null, null, 0, null, 62);
        }
        Boolean savingsVaultsBonus = dto.getSavingsVaultsBonus();
        y0 charity = dto.getCharity();
        String id12 = charity != null ? charity.getId() : null;
        e2 taxDetails = dto.getTaxDetails();
        String recipientId = taxDetails != null ? taxDetails.getRecipientId() : null;
        u0 billAccount = dto.getBillAccount();
        String id13 = billAccount != null ? billAccount.getId() : null;
        h0 linkedExchangeDetails = dto.getLinkedExchangeDetails();
        c1 c1Var = linkedExchangeDetails != null ? new c1(linkedExchangeDetails.getCounterpartyPocketId()) : null;
        String externalRegulator = dto.getExternalRegulator();
        Boolean acquiringTaxPayment = dto.getAcquiringTaxPayment();
        Boolean canBeMarkedAsSubscription = dto.getCanBeMarkedAsSubscription();
        n0 paymentAuthorisation = dto.getPaymentAuthorisation();
        t1 t1Var = paymentAuthorisation != null ? new t1(paymentAuthorisation.getId(), paymentAuthorisation.getType()) : null;
        x1 moneyRequest = dto.getMoneyRequest();
        if (moneyRequest != null) {
            String id14 = moneyRequest.getId();
            y1 requester = moneyRequest.getRequester();
            if (requester != null) {
                j2 = 0;
                o1Var = new o1(requester.getId(), requester.getName(), requester.getCode());
            } else {
                j2 = 0;
                o1Var = null;
            }
            n1Var = new n1(id14, o1Var);
        } else {
            j2 = 0;
            n1Var = null;
        }
        xhf.z1 stakingInfo = dto.getStakingInfo();
        Boolean reward = stakingInfo != null ? stakingInfo.getReward() : null;
        m1 merchant2 = dto.getMerchant();
        String blockEligibility = merchant2 != null ? merchant2.getBlockEligibility() : null;
        m transferReasons2 = dto.getTransferReasons();
        String catalogue = transferReasons2 != null ? transferReasons2.getCatalogue() : null;
        a0 guardian = dto.getGuardian();
        String id15 = guardian != null ? guardian.getId() : null;
        p1 p1Var = (dto.getFundingStatus() == null && dto.getFundsTransferExpireTimeMillis() == null) ? null : new p1(dto.getFundingStatus(), dto.getFundsTransferExpireTimeMillis());
        Long lValueOf = dto.getExchangeFee() != j2 ? Long.valueOf(dto.getExchangeFee()) : null;
        Long lValueOf2 = dto.getTransferFee() != j2 ? Long.valueOf(dto.getTransferFee()) : null;
        Long surcharge = dto.getSurcharge();
        String feeBreakdownId = dto.getFeeBreakdownId();
        x feesBreakdown = dto.getFeesBreakdown();
        if (feesBreakdown != null) {
            Long fxFee = feesBreakdown.getFxFee();
            Long atmFee = feesBreakdown.getAtmFee();
            Long transferFee = feesBreakdown.getTransferFee();
            Long cashAdvance = feesBreakdown.getCashAdvance();
            w fxRareCurrencyFee = feesBreakdown.getFxRareCurrencyFee();
            if (fxRareCurrencyFee != null) {
                bool = reward;
                str = blockEligibility;
                z1Var = new z1(fxRareCurrencyFee.getFee(), fxRareCurrencyFee.getPercent());
            } else {
                bool = reward;
                str = blockEligibility;
                z1Var = null;
            }
            w fxWeekend = feesBreakdown.getFxWeekend();
            z1 z1Var2 = fxWeekend != null ? new z1(fxWeekend.getFee(), fxWeekend.getPercent()) : null;
            w cryptoFee = feesBreakdown.getCryptoFee();
            w1Var = new w1(fxFee, atmFee, feesBreakdown.getAcquiring(), transferFee, cashAdvance, z1Var, z1Var2, cryptoFee != null ? new z1(cryptoFee.getFee(), cryptoFee.getPercent()) : null);
        } else {
            bool = reward;
            str = blockEligibility;
            w1Var = null;
        }
        Long posTime = dto.getPosTime();
        Boolean offline = dto.getOffline();
        String rejectComment = dto.getRejectComment();
        String note = dto.getNote();
        String gif2 = dto.getGif();
        d2 stopOrder = dto.getStopOrder();
        String id16 = stopOrder != null ? stopOrder.getId() : null;
        xhf.i iVarO0 = dto.o0();
        String policyId = iVarO0 != null ? iVarO0.getPolicyId() : null;
        Long rateMarkupAmount = dto.getRateMarkupAmount();
        String rateMarkupAmountCurrency = dto.getRateMarkupAmountCurrency();
        String transferType = dto.getTransferType();
        Boolean isBusinessTransaction = dto.getIsBusinessTransaction();
        String payerName = dto.getPayerName();
        Boolean provisionalRefund = dto.getProvisionalRefund();
        String referralInviteId = dto.getReferralInviteId();
        Boolean creditCardCashbackCollection = dto.getCreditCardCashbackCollection();
        String topupSource = dto.getTopupSource();
        String paymentScheme = dto.getPaymentScheme();
        String localInstrument = dto.getLocalInstrument();
        y0 charity2 = dto.getCharity();
        String requestId = charity2 != null ? charity2.getRequestId() : null;
        o statementDeferralInstalment = dto.getStatementDeferralInstalment();
        y yVar = statementDeferralInstalment != null ? new y(statementDeferralInstalment.getTerms(), statementDeferralInstalment.getPlanId()) : null;
        n prePurchaseInstalment = dto.getPrePurchaseInstalment();
        v vVar = prePurchaseInstalment != null ? new v(prePurchaseInstalment.getTotalNumber()) : null;
        xhf.m instalmentInfo = dto.getInstalmentInfo();
        return new l0(legId, strG, cardVerification2, h1Var, id10, userOfferId, cashbackType, savingsVaultsBonus, id11, id12, strK0, recipientId, id13, externalRegulator, acquiringTaxPayment, canBeMarkedAsSubscription, bool, str, catalogue, id15, t1Var, c1Var, n1Var, p1Var, new o0(surcharge, lValueOf, lValueOf2, feeBreakdownId, w1Var, posTime, offline, rejectComment, rateMarkupAmount, rateMarkupAmountCurrency, transferType, payerName, provisionalRefund, isBusinessTransaction, note, creditCardCashbackCollection, referralInviteId, gif2, id16, paymentScheme, localInstrument, topupSource, policyId, requestId, yVar, vVar, instalmentInfo != null ? new s(instalmentInfo.getPlanId()) : null, dto.getP2pPersonalisationId(), dto.getPaymentLinkId(), dto.getUnblockDate(), dto.getLedgerOrigin(), dto.getChargebackUpdatedDate()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
    
        if (r19.getIndividualType() == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final nif.a4 d(xhf.g2 r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pif.b.d(xhf.g2, java.lang.String):nif.a4");
    }
}

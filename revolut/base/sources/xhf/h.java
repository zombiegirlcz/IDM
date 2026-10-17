package xhf;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class h {
    /* JADX INFO: renamed from: A */
    public abstract y0 getCharity();

    /* JADX INFO: renamed from: A0 */
    public abstract o1 getMerchantPayment();

    /* JADX INFO: renamed from: A1 */
    public abstract String getUnblockDate();

    /* JADX INFO: renamed from: B */
    public abstract l getCollectionTrading();

    /* JADX INFO: renamed from: B0 */
    public abstract x1 getMoneyRequest();

    /* JADX INFO: renamed from: B1 */
    public abstract long getUpdatedDate();

    /* JADX INFO: renamed from: C */
    public abstract String getComment();

    /* JADX INFO: renamed from: C0 */
    public abstract String getNote();

    /* JADX INFO: renamed from: C1 */
    public abstract String getUserOfferId();

    /* JADX INFO: renamed from: D */
    public abstract Long getCompletedDate();

    /* JADX INFO: renamed from: D0 */
    public abstract Boolean getOffline();

    /* JADX INFO: renamed from: D1 */
    public abstract h2 getVault();

    /* JADX INFO: renamed from: E */
    public abstract z0 getCounterpart();

    /* JADX INFO: renamed from: E0 */
    public abstract Long getOriginalAmount();

    /* JADX INFO: renamed from: E1 */
    public abstract String getWarrantReason();

    /* JADX INFO: renamed from: F */
    public abstract String getCounterpartyDetailsGroup();

    /* JADX INFO: renamed from: F0 */
    public abstract String getOriginalCurrency();

    /* JADX INFO: renamed from: F1 */
    public abstract i2 getWealthPortfolio();

    /* JADX INFO: renamed from: G */
    public abstract String getCountryCode();

    /* JADX INFO: renamed from: G0 */
    public abstract String getP2pPersonalisationId();

    /* JADX INFO: renamed from: G1 */
    public abstract Boolean getIsBusinessTransaction();

    /* JADX INFO: renamed from: H */
    public abstract long getCreatedDate();

    /* JADX INFO: renamed from: H0 */
    public abstract m0 getPaidPlanTransactionInfo();

    /* JADX INFO: renamed from: I */
    public abstract Boolean getCreditCardCashbackCollection();

    /* JADX INFO: renamed from: I0 */
    public abstract String getPayerName();

    /* JADX INFO: renamed from: J */
    public abstract r getCryptoDepositDetails();

    /* JADX INFO: renamed from: J0 */
    public abstract n0 getPaymentAuthorisation();

    /* JADX INFO: renamed from: K */
    public abstract t getCryptoWithdrawDetails();

    /* JADX INFO: renamed from: K0 */
    public abstract o0 getPaymentCounterparty();

    /* JADX INFO: renamed from: L */
    public abstract String getCurrency();

    /* JADX INFO: renamed from: L0 */
    public abstract String getPaymentInitiationType();

    /* JADX INFO: renamed from: M */
    public abstract yhf.h getDefiMetadata();

    /* JADX INFO: renamed from: M0 */
    public abstract String getPaymentLinkId();

    /* JADX INFO: renamed from: N */
    public abstract String getDescription();

    /* JADX INFO: renamed from: N0 */
    public abstract String getPaymentMethod();

    /* JADX INFO: renamed from: O */
    public abstract a1 getDigitizedCard();

    /* JADX INFO: renamed from: O0 */
    public abstract String getPaymentScheme();

    /* JADX INFO: renamed from: P */
    public abstract String getDirection();

    /* JADX INFO: renamed from: P0 */
    public abstract Long getPosTime();

    /* JADX INFO: renamed from: Q */
    public abstract c1 getDoxgetyReward();

    /* JADX INFO: renamed from: Q0 */
    public abstract n getPrePurchaseInstalment();

    /* JADX INFO: renamed from: R */
    public abstract boolean getEcommerce();

    /* JADX INFO: renamed from: R0 */
    public abstract p1 getProfusion();

    /* JADX INFO: renamed from: S */
    public abstract String getEdt();

    /* JADX INFO: renamed from: S0 */
    public abstract Boolean getProvisionalRefund();

    /* JADX INFO: renamed from: T */
    public abstract String getEntryMode();

    /* JADX INFO: renamed from: T0 */
    public abstract Double getRate();

    /* JADX INFO: renamed from: U */
    public abstract v getEquivalent();

    /* JADX INFO: renamed from: U0 */
    public abstract Long getRateMarkupAmount();

    /* JADX INFO: renamed from: V */
    public abstract long getExchangeFee();

    /* JADX INFO: renamed from: V0 */
    public abstract String getRateMarkupAmountCurrency();

    /* JADX INFO: renamed from: W */
    public abstract String getExternalRegulator();

    /* JADX INFO: renamed from: W0 */
    public abstract String getReason();

    /* JADX INFO: renamed from: X */
    public abstract long getFee();

    /* JADX INFO: renamed from: X0 */
    public abstract g2 getRecipient();

    /* JADX INFO: renamed from: Y */
    public abstract String getFeeBreakdownId();

    /* JADX INFO: renamed from: Y0 */
    public abstract String getReferralInviteId();

    /* JADX INFO: renamed from: Z */
    public abstract x getFeesBreakdown();

    /* JADX INFO: renamed from: Z0 */
    public abstract s1 getReferralReward();

    /* JADX INFO: renamed from: a */
    public abstract p0 getAccount();

    /* JADX INFO: renamed from: a0 */
    public abstract String getFraudReason();

    /* JADX INFO: renamed from: a1 */
    public abstract String getRegisteredIdentityId();

    /* JADX INFO: renamed from: b */
    public abstract Double getAccruedLoyaltyPointsAmount();

    /* JADX INFO: renamed from: b0 */
    public abstract String getFraudState();

    /* JADX INFO: renamed from: b1 */
    public abstract String getRejectComment();

    /* JADX INFO: renamed from: c */
    public abstract yhf.a getAcquiringCashback();

    /* JADX INFO: renamed from: c0 */
    public abstract a getFromAccount();

    /* JADX INFO: renamed from: c1 */
    public abstract String getRelatedTransactionId();

    /* JADX INFO: renamed from: d */
    public abstract Boolean getAcquiringTaxPayment();

    /* JADX INFO: renamed from: d0 */
    public abstract String getFundingStatus();

    /* JADX INFO: renamed from: d1 */
    public abstract String getRewardReason();

    public abstract f e();

    /* JADX INFO: renamed from: e0 */
    public abstract Long getFundsTransferExpireTimeMillis();

    /* JADX INFO: renamed from: e1 */
    public abstract Boolean getSavingsVaultsBonus();

    /* JADX INFO: renamed from: f */
    public abstract long getAmount();

    /* JADX INFO: renamed from: f0 */
    public abstract String getGif();

    /* JADX INFO: renamed from: f1 */
    public abstract g2 getSender();

    /* JADX INFO: renamed from: g */
    public abstract c getAmountBreakdown();

    /* JADX INFO: renamed from: g0 */
    public abstract f1 getGift();

    /* JADX INFO: renamed from: g1 */
    public abstract w1 getShops();

    /* JADX INFO: renamed from: h */
    public abstract long getAmountWithCharges();

    /* JADX INFO: renamed from: h0 */
    public abstract String getGroupKey();

    /* JADX INFO: renamed from: h1 */
    public abstract Boolean getSplittable();

    /* JADX INFO: renamed from: i */
    public abstract d getApmContact();

    /* JADX INFO: renamed from: i0 */
    public abstract a0 getGuardian();

    /* JADX INFO: renamed from: i1 */
    public abstract z1 getStakingInfo();

    /* JADX INFO: renamed from: j */
    public abstract e getApmInfo();

    /* JADX INFO: renamed from: j0 */
    public abstract b0 getHotelBooking();

    /* JADX INFO: renamed from: j1 */
    public abstract a2 getStandingOrder();

    /* JADX INFO: renamed from: k */
    public abstract q0 getAutoInvest();

    /* JADX INFO: renamed from: k0 */
    public abstract String getId();

    /* JADX INFO: renamed from: k1 */
    public abstract long getStartedDate();

    /* JADX INFO: renamed from: l */
    public abstract Long getBalance();

    /* JADX INFO: renamed from: l0 */
    public abstract d0 getInitiatedBy();

    /* JADX INFO: renamed from: l1 */
    public abstract String getState();

    public abstract f m();

    /* JADX INFO: renamed from: m0 */
    public abstract m getInstalmentInfo();

    /* JADX INFO: renamed from: m1 */
    public abstract o getStatementDeferralInstalment();

    /* JADX INFO: renamed from: n */
    public abstract t0 getBeneficiaryFee();

    /* JADX INFO: renamed from: n0 */
    public abstract e0 getInstalmentPlan();

    /* JADX INFO: renamed from: n1 */
    public abstract d2 getStopOrder();

    /* JADX INFO: renamed from: o */
    public abstract u0 getBillAccount();

    public abstract i o0();

    /* JADX INFO: renamed from: o1 */
    public abstract Long getSurcharge();

    /* JADX INFO: renamed from: p */
    public abstract Boolean getCanBeMarkedAsSubscription();

    /* JADX INFO: renamed from: p0 */
    public abstract f0 getJoint();

    /* JADX INFO: renamed from: p1 */
    public abstract e2 getTaxDetails();

    public abstract g q();

    /* JADX INFO: renamed from: q0 */
    public abstract h1 getJunior();

    /* JADX INFO: renamed from: q1 */
    public abstract a getToAccount();

    /* JADX INFO: renamed from: r */
    public abstract k getCardOwner();

    /* JADX INFO: renamed from: r0 */
    public abstract String getLedgerOrigin();

    /* JADX INFO: renamed from: r1 */
    public abstract String getTopupMethod();

    /* JADX INFO: renamed from: s */
    public abstract Boolean getCardVerification();

    /* JADX INFO: renamed from: s0 */
    public abstract String getLegId();

    /* JADX INFO: renamed from: s1 */
    public abstract String getTopupSource();

    /* JADX INFO: renamed from: t */
    public abstract Boolean getCardholderPresent();

    /* JADX INFO: renamed from: t0 */
    public abstract h0 getLinkedExchangeDetails();

    /* JADX INFO: renamed from: t1 */
    public abstract x0 getTransactionCharges();

    /* JADX INFO: renamed from: u */
    public abstract String getCashbackBoxId();

    /* JADX INFO: renamed from: u0 */
    public abstract i0 getLoanRepayment();

    /* JADX INFO: renamed from: u1 */
    public abstract long getTransferFee();

    /* JADX INFO: renamed from: v */
    public abstract String getCashbackType();

    /* JADX INFO: renamed from: v0 */
    public abstract String getLocalInstrument();

    /* JADX INFO: renamed from: v1 */
    public abstract String getTransferLinkId();

    /* JADX INFO: renamed from: w */
    public abstract String getCategory();

    /* JADX INFO: renamed from: w0 */
    public abstract i1 getLocalisedDescription();

    /* JADX INFO: renamed from: w1 */
    public abstract gsf.m getTransferReasons();

    /* JADX INFO: renamed from: x */
    public abstract Boolean getChargebackEligible();

    /* JADX INFO: renamed from: x0 */
    public abstract String getLogo();

    /* JADX INFO: renamed from: x1 */
    public abstract String getTransferType();

    /* JADX INFO: renamed from: y */
    public abstract String getChargebackState();

    /* JADX INFO: renamed from: y0 */
    public abstract List getLoungePassIds();

    /* JADX INFO: renamed from: y1 */
    public abstract Boolean getTransparentPricing();

    /* JADX INFO: renamed from: z */
    public abstract Long getChargebackUpdatedDate();

    /* JADX INFO: renamed from: z0 */
    public abstract m1 getMerchant();

    /* JADX INFO: renamed from: z1 */
    public abstract String getType();
}

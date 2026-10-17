package bdl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b>\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001a\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010$\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\u0004R\u001a\u0010&\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010+\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b)\u0010\u0004R\u001a\u0010.\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b,\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b2\u0010\u0004R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b9\u0010\u0004R\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b'\u0010\u0004R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b7\u0010\u0004R\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b=\u0010\u0004¨\u0006@"}, d2 = {"Lbdl/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "j", "icons", "b", "s", "professional", "c", "C", "usPerson", "d", "u", "riskWarning", "e", "z", "tinDescription", "f", "p", "onboardingRiskWarning", "g", "v", "roboTermsAndConditions", "h", "y", "termsOfBusiness", "i", "q", "orderHandling", "agreementPrefix", "k", "r", "privacyPolicy", "l", "customerAccountAgreement", "m", "costsInformation", "n", "w", "stocksFaqs", "o", "mifid", "morningstarResearchDisclosure", "advisoryAgreement", "cfdTradingTerms", "exAnteCostsReport", "t", "isaTransferInSampleDocument", "jisaTransferInSampleDocument", "researchDisclosureFaq", "freeStocksTerms", "x", "freeStocksDisclosure", "A", "tradingFees", "assetDetailsTradeLimitsSheet", "marginTradingTerms", "B", "stocksTransferOutDisclaimer", "transferDocumentUrlTemplate", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("marginTradingTerms")
    private final String marginTradingTerms;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("stocks-transfer-out-disclaimer")
    private final String stocksTransferOutDisclaimer;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("stocks-transfer-out-document-template")
    private final String transferDocumentUrlTemplate;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("icons")
    @NotNull
    private final String icons;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("professional")
    @NotNull
    private final String professional;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("usPerson")
    @NotNull
    private final String usPerson;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("riskWarning")
    @NotNull
    private final String riskWarning;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("tinDescription")
    @NotNull
    private final String tinDescription;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("onboarding-risk-warning")
    @NotNull
    private final String onboardingRiskWarning;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("robo-terms-and-conditions")
    private final String roboTermsAndConditions;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("terms-of-business")
    @NotNull
    private final String termsOfBusiness;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("order-handling")
    @NotNull
    private final String orderHandling;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("agreement-prefix")
    @NotNull
    private final String agreementPrefix;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("privacy-policy")
    @NotNull
    private final String privacyPolicy;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("customer-account-agreement")
    @NotNull
    private final String customerAccountAgreement;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("costs-information")
    private final String costsInformation;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("stocks-faqs")
    @NotNull
    private final String stocksFaqs;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("mifid")
    private final String mifid;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("morningstar-research")
    @NotNull
    private final String morningstarResearchDisclosure;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("advisory-agreement")
    private final String advisoryAgreement;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("cfd-trading-terms")
    private final String cfdTradingTerms;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("ex-ante-costs-report")
    private final String exAnteCostsReport;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("isa-transfer-in-sample-document")
    private final String isaTransferInSampleDocument;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("jisa-transfer-in-sample-document")
    private final String jisaTransferInSampleDocument;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("research-disclosure-faq")
    private final String researchDisclosureFaq;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("freeStocksTerms")
    private final String freeStocksTerms;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("freeStocksDisclosure")
    private final String freeStocksDisclosure;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("tradingFees")
    private final String tradingFees;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("assetDetailsTradeLimitsSheet")
    private final String assetDetailsTradeLimitsSheet;

    /* JADX INFO: renamed from: A, reason: from getter */
    public final String getTradingFees() {
        return this.tradingFees;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final String getTransferDocumentUrlTemplate() {
        return this.transferDocumentUrlTemplate;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getUsPerson() {
        return this.usPerson;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAdvisoryAgreement() {
        return this.advisoryAgreement;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAgreementPrefix() {
        return this.agreementPrefix;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAssetDetailsTradeLimitsSheet() {
        return this.assetDetailsTradeLimitsSheet;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCfdTradingTerms() {
        return this.cfdTradingTerms;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCostsInformation() {
        return this.costsInformation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.icons, dVar.icons) && Intrinsics.f(this.professional, dVar.professional) && Intrinsics.f(this.usPerson, dVar.usPerson) && Intrinsics.f(this.riskWarning, dVar.riskWarning) && Intrinsics.f(this.tinDescription, dVar.tinDescription) && Intrinsics.f(this.onboardingRiskWarning, dVar.onboardingRiskWarning) && Intrinsics.f(this.roboTermsAndConditions, dVar.roboTermsAndConditions) && Intrinsics.f(this.termsOfBusiness, dVar.termsOfBusiness) && Intrinsics.f(this.orderHandling, dVar.orderHandling) && Intrinsics.f(this.agreementPrefix, dVar.agreementPrefix) && Intrinsics.f(this.privacyPolicy, dVar.privacyPolicy) && Intrinsics.f(this.customerAccountAgreement, dVar.customerAccountAgreement) && Intrinsics.f(this.costsInformation, dVar.costsInformation) && Intrinsics.f(this.stocksFaqs, dVar.stocksFaqs) && Intrinsics.f(this.mifid, dVar.mifid) && Intrinsics.f(this.morningstarResearchDisclosure, dVar.morningstarResearchDisclosure) && Intrinsics.f(this.advisoryAgreement, dVar.advisoryAgreement) && Intrinsics.f(this.cfdTradingTerms, dVar.cfdTradingTerms) && Intrinsics.f(this.exAnteCostsReport, dVar.exAnteCostsReport) && Intrinsics.f(this.isaTransferInSampleDocument, dVar.isaTransferInSampleDocument) && Intrinsics.f(this.jisaTransferInSampleDocument, dVar.jisaTransferInSampleDocument) && Intrinsics.f(this.researchDisclosureFaq, dVar.researchDisclosureFaq) && Intrinsics.f(this.freeStocksTerms, dVar.freeStocksTerms) && Intrinsics.f(this.freeStocksDisclosure, dVar.freeStocksDisclosure) && Intrinsics.f(this.tradingFees, dVar.tradingFees) && Intrinsics.f(this.assetDetailsTradeLimitsSheet, dVar.assetDetailsTradeLimitsSheet) && Intrinsics.f(this.marginTradingTerms, dVar.marginTradingTerms) && Intrinsics.f(this.stocksTransferOutDisclaimer, dVar.stocksTransferOutDisclaimer) && Intrinsics.f(this.transferDocumentUrlTemplate, dVar.transferDocumentUrlTemplate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCustomerAccountAgreement() {
        return this.customerAccountAgreement;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getExAnteCostsReport() {
        return this.exAnteCostsReport;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getFreeStocksDisclosure() {
        return this.freeStocksDisclosure;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.icons.hashCode() * 31, 31, this.professional), 31, this.usPerson), 31, this.riskWarning), 31, this.tinDescription), 31, this.onboardingRiskWarning);
        String str = this.roboTermsAndConditions;
        int iC2 = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.termsOfBusiness), 31, this.orderHandling), 31, this.agreementPrefix), 31, this.privacyPolicy), 31, this.customerAccountAgreement);
        String str2 = this.costsInformation;
        int iC3 = p.a.c((iC2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.stocksFaqs);
        String str3 = this.mifid;
        int iC4 = p.a.c((iC3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.morningstarResearchDisclosure);
        String str4 = this.advisoryAgreement;
        int iHashCode = (iC4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cfdTradingTerms;
        int iHashCode2 = (iHashCode + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.exAnteCostsReport;
        int iHashCode3 = (iHashCode2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.isaTransferInSampleDocument;
        int iHashCode4 = (iHashCode3 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.jisaTransferInSampleDocument;
        int iHashCode5 = (iHashCode4 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.researchDisclosureFaq;
        int iHashCode6 = (iHashCode5 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.freeStocksTerms;
        int iHashCode7 = (iHashCode6 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.freeStocksDisclosure;
        int iHashCode8 = (iHashCode7 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.tradingFees;
        int iHashCode9 = (iHashCode8 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.assetDetailsTradeLimitsSheet;
        int iHashCode10 = (iHashCode9 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.marginTradingTerms;
        int iHashCode11 = (iHashCode10 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.stocksTransferOutDisclaimer;
        int iHashCode12 = (iHashCode11 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.transferDocumentUrlTemplate;
        return iHashCode12 + (str16 != null ? str16.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getFreeStocksTerms() {
        return this.freeStocksTerms;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getIcons() {
        return this.icons;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getIsaTransferInSampleDocument() {
        return this.isaTransferInSampleDocument;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getJisaTransferInSampleDocument() {
        return this.jisaTransferInSampleDocument;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getMarginTradingTerms() {
        return this.marginTradingTerms;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getMifid() {
        return this.mifid;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getMorningstarResearchDisclosure() {
        return this.morningstarResearchDisclosure;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getOnboardingRiskWarning() {
        return this.onboardingRiskWarning;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getOrderHandling() {
        return this.orderHandling;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getPrivacyPolicy() {
        return this.privacyPolicy;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getProfessional() {
        return this.professional;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getResearchDisclosureFaq() {
        return this.researchDisclosureFaq;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getRiskWarning() {
        return this.riskWarning;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getRoboTermsAndConditions() {
        return this.roboTermsAndConditions;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getStocksFaqs() {
        return this.stocksFaqs;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getStocksTransferOutDisclaimer() {
        return this.stocksTransferOutDisclaimer;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getTermsOfBusiness() {
        return this.termsOfBusiness;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getTinDescription() {
        return this.tinDescription;
    }
}

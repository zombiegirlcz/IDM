package wdl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b>\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b \u0010\u0004R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010(\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b)\u0010\u0004R\u001a\u0010,\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b+\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b/\u0010\u0004R\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b$\u0010\u0004R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b2\u0010\u0004R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b9\u0010\u0004R\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b&\u0010\u0004R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b7\u0010\u0004R\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b=\u0010\u0004¨\u0006@"}, d2 = {"Lwdl/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "C", "usPerson", "b", "s", "professional", "c", "u", "riskWarning", "d", "j", "icons", "e", "p", "onboardingRiskWarning", "f", "y", "termsOfBusiness", "g", "z", "tinDescription", "h", "q", "orderHandling", "i", "agreementPrefix", "r", "privacyPolicy", "k", "customerAccountAgreement", "l", "costsInformation", "m", "w", "stocksFaqs", "n", "mifid", "o", "morningstarResearchDisclosure", "advisoryAgreement", "cfdTradingTerms", "v", "roboTermsAndConditions", "exAnteCostsReport", "t", "isaTransferInSampleDocument", "jisaTransferInSampleDocument", "researchDisclosureFaq", "freeStocksTerms", "x", "freeStocksDisclosure", "A", "tradingFees", "assetDetailsTradeLimitsSheet", "marginTradingTerms", "B", "stocksTransferOutDisclaimer", "transferDocumentUrlTemplate", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

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
    @lg.b("usPerson")
    @NotNull
    private final String usPerson;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("professional")
    @NotNull
    private final String professional;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("riskWarning")
    @NotNull
    private final String riskWarning;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("icons")
    @NotNull
    private final String icons;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("onboardingRiskWarning")
    @NotNull
    private final String onboardingRiskWarning;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("terms-of-business")
    @NotNull
    private final String termsOfBusiness;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("tinDescription")
    @NotNull
    private final String tinDescription;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("order-handling")
    @NotNull
    private final String orderHandling;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("agreement-prefix")
    @NotNull
    private final String agreementPrefix;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("privacy-policy")
    @NotNull
    private final String privacyPolicy;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("customer-account-agreement")
    @NotNull
    private final String customerAccountAgreement;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("costs-information")
    private final String costsInformation;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("stocks-faqs")
    @NotNull
    private final String stocksFaqs;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("mifid")
    private final String mifid;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("morningstar-research")
    @NotNull
    private final String morningstarResearchDisclosure;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("advisory-agreement")
    private final String advisoryAgreement;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("cfd-trading-terms")
    private final String cfdTradingTerms;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("robo-terms-and-conditions")
    private final String roboTermsAndConditions;

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

    public a(String usPerson, String professional, String riskWarning, String icons, String onboardingRiskWarning, String termsOfBusiness, String tinDescription, String orderHandling, String agreementPrefix, String privacyPolicy, String customerAccountAgreement, String str, String stocksFaqs, String str2, String morningstarResearchDisclosure, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        Intrinsics.checkNotNullParameter(usPerson, "usPerson");
        Intrinsics.checkNotNullParameter(professional, "professional");
        Intrinsics.checkNotNullParameter(riskWarning, "riskWarning");
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(onboardingRiskWarning, "onboardingRiskWarning");
        Intrinsics.checkNotNullParameter(termsOfBusiness, "termsOfBusiness");
        Intrinsics.checkNotNullParameter(tinDescription, "tinDescription");
        Intrinsics.checkNotNullParameter(orderHandling, "orderHandling");
        Intrinsics.checkNotNullParameter(agreementPrefix, "agreementPrefix");
        Intrinsics.checkNotNullParameter(privacyPolicy, "privacyPolicy");
        Intrinsics.checkNotNullParameter(customerAccountAgreement, "customerAccountAgreement");
        Intrinsics.checkNotNullParameter(stocksFaqs, "stocksFaqs");
        Intrinsics.checkNotNullParameter(morningstarResearchDisclosure, "morningstarResearchDisclosure");
        this.usPerson = usPerson;
        this.professional = professional;
        this.riskWarning = riskWarning;
        this.icons = icons;
        this.onboardingRiskWarning = onboardingRiskWarning;
        this.termsOfBusiness = termsOfBusiness;
        this.tinDescription = tinDescription;
        this.orderHandling = orderHandling;
        this.agreementPrefix = agreementPrefix;
        this.privacyPolicy = privacyPolicy;
        this.customerAccountAgreement = customerAccountAgreement;
        this.costsInformation = str;
        this.stocksFaqs = stocksFaqs;
        this.mifid = str2;
        this.morningstarResearchDisclosure = morningstarResearchDisclosure;
        this.advisoryAgreement = str3;
        this.cfdTradingTerms = str4;
        this.roboTermsAndConditions = str5;
        this.exAnteCostsReport = str6;
        this.isaTransferInSampleDocument = str7;
        this.jisaTransferInSampleDocument = str8;
        this.researchDisclosureFaq = str9;
        this.freeStocksTerms = str10;
        this.freeStocksDisclosure = str11;
        this.tradingFees = str12;
        this.assetDetailsTradeLimitsSheet = str13;
        this.marginTradingTerms = str14;
        this.stocksTransferOutDisclaimer = str15;
        this.transferDocumentUrlTemplate = str16;
    }

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
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.usPerson, aVar.usPerson) && Intrinsics.f(this.professional, aVar.professional) && Intrinsics.f(this.riskWarning, aVar.riskWarning) && Intrinsics.f(this.icons, aVar.icons) && Intrinsics.f(this.onboardingRiskWarning, aVar.onboardingRiskWarning) && Intrinsics.f(this.termsOfBusiness, aVar.termsOfBusiness) && Intrinsics.f(this.tinDescription, aVar.tinDescription) && Intrinsics.f(this.orderHandling, aVar.orderHandling) && Intrinsics.f(this.agreementPrefix, aVar.agreementPrefix) && Intrinsics.f(this.privacyPolicy, aVar.privacyPolicy) && Intrinsics.f(this.customerAccountAgreement, aVar.customerAccountAgreement) && Intrinsics.f(this.costsInformation, aVar.costsInformation) && Intrinsics.f(this.stocksFaqs, aVar.stocksFaqs) && Intrinsics.f(this.mifid, aVar.mifid) && Intrinsics.f(this.morningstarResearchDisclosure, aVar.morningstarResearchDisclosure) && Intrinsics.f(this.advisoryAgreement, aVar.advisoryAgreement) && Intrinsics.f(this.cfdTradingTerms, aVar.cfdTradingTerms) && Intrinsics.f(this.roboTermsAndConditions, aVar.roboTermsAndConditions) && Intrinsics.f(this.exAnteCostsReport, aVar.exAnteCostsReport) && Intrinsics.f(this.isaTransferInSampleDocument, aVar.isaTransferInSampleDocument) && Intrinsics.f(this.jisaTransferInSampleDocument, aVar.jisaTransferInSampleDocument) && Intrinsics.f(this.researchDisclosureFaq, aVar.researchDisclosureFaq) && Intrinsics.f(this.freeStocksTerms, aVar.freeStocksTerms) && Intrinsics.f(this.freeStocksDisclosure, aVar.freeStocksDisclosure) && Intrinsics.f(this.tradingFees, aVar.tradingFees) && Intrinsics.f(this.assetDetailsTradeLimitsSheet, aVar.assetDetailsTradeLimitsSheet) && Intrinsics.f(this.marginTradingTerms, aVar.marginTradingTerms) && Intrinsics.f(this.stocksTransferOutDisclaimer, aVar.stocksTransferOutDisclaimer) && Intrinsics.f(this.transferDocumentUrlTemplate, aVar.transferDocumentUrlTemplate);
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
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.usPerson.hashCode() * 31, 31, this.professional), 31, this.riskWarning), 31, this.icons), 31, this.onboardingRiskWarning), 31, this.termsOfBusiness), 31, this.tinDescription), 31, this.orderHandling), 31, this.agreementPrefix), 31, this.privacyPolicy), 31, this.customerAccountAgreement);
        String str = this.costsInformation;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.stocksFaqs);
        String str2 = this.mifid;
        int iC3 = p.a.c((iC2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.morningstarResearchDisclosure);
        String str3 = this.advisoryAgreement;
        int iHashCode = (iC3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cfdTradingTerms;
        int iHashCode2 = (iHashCode + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.roboTermsAndConditions;
        int iHashCode3 = (iHashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.exAnteCostsReport;
        int iHashCode4 = (iHashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.isaTransferInSampleDocument;
        int iHashCode5 = (iHashCode4 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.jisaTransferInSampleDocument;
        int iHashCode6 = (iHashCode5 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.researchDisclosureFaq;
        int iHashCode7 = (iHashCode6 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.freeStocksTerms;
        int iHashCode8 = (iHashCode7 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.freeStocksDisclosure;
        int iHashCode9 = (iHashCode8 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.tradingFees;
        int iHashCode10 = (iHashCode9 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.assetDetailsTradeLimitsSheet;
        int iHashCode11 = (iHashCode10 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.marginTradingTerms;
        int iHashCode12 = (iHashCode11 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.stocksTransferOutDisclaimer;
        int iHashCode13 = (iHashCode12 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.transferDocumentUrlTemplate;
        return iHashCode13 + (str16 != null ? str16.hashCode() : 0);
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

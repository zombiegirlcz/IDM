package ina;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import com.revolut.feature.crypto.documents.api.navigation.destinations.CryptoDocumentsDestination;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.feature.insurance_embedded.api.navigation.InsuranceEmbeddedDestinations;
import com.revolut.feature.profile.api.DocumentsPage;
import com.revolut.feature.profile.api.InsuranceDocumentItem;
import com.revolut.feature.profile.api.R$string;
import com.revolut.feature.profile.impl.ui.documents_redesigned.DocumentFlowInternalDestination;
import com.revolut.feature.profile.impl.ui.documents_redesigned.document_selector.extensions.DocumentScreenControllerModelExtension$GeneralInvestmentsParcel;
import com.revolut.feature.profile.impl.ui.documents_redesigned.document_selector.extensions.DocumentScreenControllerModelExtension$SavingsParcel;
import com.revolut.feature.statements.api.StatementsMode;
import com.revolut.feature.statements.api.navigation.ConsolidatedStatementDestination;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.ui.api.navigation.InvestDocumentsDetailsDestination;
import com.revolut.feature.wealth.ui.api.navigation.InvestDocumentsType;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import xzg.q0;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fna.h f162722l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fna.i f162723m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kpj.f f162724n;
    public final vyd.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i4b.f f162725p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zjh.j f162726q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mre.c f162727r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sla.h f162728s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gte.a f162729t;
    public final sr7.i u;

    public j(fna.h interactor, fna.i itemsFactory, kpj.f wealthAccountHeaderUiMapper, vyd.b statementsMapper, i4b.f legalEntityContextProvider, zjh.j legalEntityDisclaimerMapper, mre.c termsNavigationFactory, sla.h termsAndConditionsNavigationFactory, gte.a featureToggleInteractor, sr7.i insuranceImageBuilder) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(itemsFactory, "itemsFactory");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        Intrinsics.checkNotNullParameter(statementsMapper, "statementsMapper");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(termsAndConditionsNavigationFactory, "termsAndConditionsNavigationFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(insuranceImageBuilder, "insuranceImageBuilder");
        this.f162722l = interactor;
        this.f162723m = itemsFactory;
        this.f162724n = wealthAccountHeaderUiMapper;
        this.o = statementsMapper;
        this.f162725p = legalEntityContextProvider;
        this.f162726q = legalEntityDisclaimerMapper;
        this.f162727r = termsNavigationFactory;
        this.f162728s = termsAndConditionsNavigationFactory;
        this.f162729t = featureToggleInteractor;
        this.u = insuranceImageBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00d2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList i3(ina.j r12, xzg.r0 r13) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ina.j.i3(ina.j, xzg.r0):java.util.ArrayList");
    }

    public static final ArrayList j3(j jVar, List list) {
        List<InsuranceDocumentItem> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (InsuranceDocumentItem insuranceDocumentItem : list2) {
            Integer numC = jVar.u.c(insuranceDocumentItem.f81310b);
            arrayList.add(fna.i.d(jVar.f162723m, j6.a.q("INSURANCE_ID_", insuranceDocumentItem.f81311c), insuranceDocumentItem.f81309a, insuranceDocumentItem, numC != null ? new RowDelegate.Model.MainImage.Image24(new ResourceImage(numC.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6) : jVar.f162723m.f136587a, 4));
        }
        return arrayList;
    }

    public static RowDelegate.Model.MainImage.Image24 k3(int i) {
        return new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ina.k
    public final void Z2(RowDelegate.Model item) throws Throwable {
        DocumentsPage joint;
        UUID uuid;
        UUID uuid2;
        Intrinsics.checkNotNullParameter(item, "item");
        Object obj2 = item.u;
        String str = item.f53228a;
        if (obj2 instanceof StatementsMode) {
            A2(new ConsolidatedStatementDestination((StatementsMode) obj2));
            return;
        }
        investDocumentsDetailsDestination = null;
        investDocumentsDetailsDestination = null;
        investDocumentsDetailsDestination = null;
        investDocumentsDetailsDestination = null;
        investDocumentsDetailsDestination = null;
        InvestDocumentsDetailsDestination investDocumentsDetailsDestination = null;
        if (kotlin.text.a0.H(str, "INSURANCE_ID_", false)) {
            InsuranceDocumentItem insuranceDocumentItem = obj2 instanceof InsuranceDocumentItem ? (InsuranceDocumentItem) obj2 : null;
            if (insuranceDocumentItem == null) {
                hx7.e.n(new IllegalStateException(p.a.p("Expected ", InsuranceDocumentItem.class.getName(), " parcel type")));
                return;
            } else {
                A2(new InsuranceEmbeddedDestinations.DocumentsLayout(insuranceDocumentItem.f81311c));
                return;
            }
        }
        if (kotlin.text.a0.H(str, "TEEN_ACCOUNT_ID_", false)) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId");
            A2(new DocumentFlowInternalDestination(new DocumentsPage.Teen(((RegisteredIdentityId) obj2).f74764a)));
            return;
        }
        if (str.equals("GENERAL_INVESTMENTS_ID")) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.documents_redesigned.document_selector.extensions.DocumentScreenControllerModelExtension.GeneralInvestmentsParcel");
            DocumentScreenControllerModelExtension$GeneralInvestmentsParcel documentScreenControllerModelExtension$GeneralInvestmentsParcel = (DocumentScreenControllerModelExtension$GeneralInvestmentsParcel) obj2;
            UUID uuid3 = documentScreenControllerModelExtension$GeneralInvestmentsParcel.f81413a;
            UUID uuid4 = documentScreenControllerModelExtension$GeneralInvestmentsParcel.f81414b;
            if (uuid3 != null && uuid4 != null) {
                A2(new DocumentFlowInternalDestination(new DocumentsPage.GeneralInvestments(uuid3, uuid4, documentScreenControllerModelExtension$GeneralInvestmentsParcel.f81415c)));
                return;
            }
            if (uuid3 != null) {
                A2(new InvestDocumentsDetailsDestination(new InvestDocumentsType.Stocks(uuid3, q0.PERSONAL)));
                return;
            } else if (uuid4 != null) {
                A2(new InvestDocumentsDetailsDestination(new InvestDocumentsType.Stocks(uuid4, q0.PERSONAL_JOINT)));
                return;
            } else {
                r6.b.D("No portfolio ID in GeneralInvestmentsParcel");
                Unit unit = Unit.f186387a;
                return;
            }
        }
        if (kotlin.text.a0.H(str, "WEALTH_ID_", false)) {
            WealthAccount wealthAccount = obj2 instanceof WealthAccount ? (WealthAccount) obj2 : null;
            if (wealthAccount instanceof WealthAccount.Securities) {
                WealthAccount.Securities securities = (WealthAccount.Securities) wealthAccount;
                TradingAccount.Portfolio portfolio = securities.f95240c;
                if (portfolio != null && (uuid2 = portfolio.f105210a) != null) {
                    investDocumentsDetailsDestination = new InvestDocumentsDetailsDestination(new InvestDocumentsType.Stocks(uuid2, securities.f95239b));
                }
            } else if (wealthAccount instanceof WealthAccount.Robo) {
                investDocumentsDetailsDestination = new InvestDocumentsDetailsDestination(InvestDocumentsType.ROBO.f95912a);
            } else if (wealthAccount instanceof WealthAccount.Commodities) {
                investDocumentsDetailsDestination = new InvestDocumentsDetailsDestination(InvestDocumentsType.COMMODITY.f95910a);
            } else if (wealthAccount instanceof WealthAccount.Margin) {
                String str2 = ((WealthAccount.Margin) wealthAccount).f95234c;
                if (str2 != null) {
                    investDocumentsDetailsDestination = new InvestDocumentsDetailsDestination(new InvestDocumentsType.MarginTrading(str2));
                }
            } else if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount) {
                WealthAccount.TaxAdvantageWealthAccount taxAdvantageWealthAccount = (WealthAccount.TaxAdvantageWealthAccount) wealthAccount;
                TradingAccount.Portfolio d = taxAdvantageWealthAccount.getD();
                if (d != null && (uuid = d.f105210a) != null) {
                    investDocumentsDetailsDestination = new InvestDocumentsDetailsDestination(new InvestDocumentsType.TaxAdvantageDocument(taxAdvantageWealthAccount, uuid));
                }
            } else {
                if (wealthAccount != null) {
                    throw new NoWhenBranchMatchedException();
                }
                hx7.e.n(new IllegalStateException("Documents destination not found for ".concat(str)));
            }
            if (investDocumentsDetailsDestination != null) {
                A2(investDocumentsDetailsDestination);
            }
            Unit unit2 = Unit.f186387a;
            return;
        }
        if (str.equals("CRYPTO_ID")) {
            A2(CryptoDocumentsDestination.f70784a);
            return;
        }
        if (str.equals("PRIVACY_POLICY_ID")) {
            V2(new d(this, null), new yi5.b(29));
            return;
        }
        if (str.equals("CALIFORNIA_COLLECTION_NOTICE_ID")) {
            wi0.b bVar = obj2 instanceof wi0.b ? (wi0.b) obj2 : null;
            if (bVar == null) {
                hx7.e.n(new IllegalStateException(p.a.p("Expected ", wi0.b.class.getName(), " parcel type")));
                return;
            } else {
                V2(new f(this, bVar, null), new yi5.b(29));
                return;
            }
        }
        if (str.equals("LEGAL_DISCLAIMER_ID")) {
            Terms terms = obj2 instanceof Terms ? (Terms) obj2 : null;
            if (terms == null) {
                hx7.e.n(new IllegalStateException(p.a.p("Expected ", Terms.class.getName(), " parcel type")));
                return;
            } else {
                A2(new BridgeDestination(((rre.d) this.f162727r).b(terms)));
                return;
            }
        }
        if (str.equals("TERMS_AND_CONDITIONS_ID")) {
            V2(new g(this, null), new yi5.b(29));
            return;
        }
        switch (str.hashCode()) {
            case -1996491393:
                if (str.equals("PRO_ACCOUNT_ID")) {
                    joint = DocumentsPage.Pro.f81306a;
                    A2(new DocumentFlowInternalDestination(joint));
                }
                hx7.e.n(new IllegalStateException("Documents destination not found for ".concat(str)));
                break;
            case -1220837502:
                if (str.equals("JOINT_ACCOUNT_ID")) {
                    Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.core.model.domain.wallet.WalletId");
                    joint = new DocumentsPage.Joint(((WalletId) obj2).f66106a);
                    A2(new DocumentFlowInternalDestination(joint));
                }
                hx7.e.n(new IllegalStateException("Documents destination not found for ".concat(str)));
                break;
            case -881436692:
                if (str.equals("PERSONAL_ACCOUNT_ID")) {
                    joint = DocumentsPage.Personal.f81305a;
                    A2(new DocumentFlowInternalDestination(joint));
                }
                hx7.e.n(new IllegalStateException("Documents destination not found for ".concat(str)));
                break;
            case 650219909:
                if (str.equals("INCOME_TAX_STATEMENT")) {
                    joint = DocumentsPage.IncomeTaxStatement.f81303a;
                    A2(new DocumentFlowInternalDestination(joint));
                }
                hx7.e.n(new IllegalStateException("Documents destination not found for ".concat(str)));
                break;
            case 790578162:
                if (str.equals("GENERAL_ID")) {
                    joint = DocumentsPage.General.f81299a;
                    A2(new DocumentFlowInternalDestination(joint));
                }
                hx7.e.n(new IllegalStateException("Documents destination not found for ".concat(str)));
                break;
            case 1571127937:
                if (str.equals("SAVINGS_ID")) {
                    Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.documents_redesigned.document_selector.extensions.DocumentScreenControllerModelExtension.SavingsParcel");
                    joint = new DocumentsPage.Savings(((DocumentScreenControllerModelExtension$SavingsParcel) obj2).f81416a);
                    A2(new DocumentFlowInternalDestination(joint));
                }
                hx7.e.n(new IllegalStateException("Documents destination not found for ".concat(str)));
                break;
            default:
                hx7.e.n(new IllegalStateException("Documents destination not found for ".concat(str)));
                break;
        }
        Unit unit3 = Unit.f186387a;
    }

    @Override // ina.k
    public final Flow c3(DocumentsPage documentsPage) {
        DocumentsPage.DocumentList documentsPage2 = (DocumentsPage.DocumentList) documentsPage;
        Intrinsics.checkNotNullParameter(documentsPage2, "documentsPage");
        return new ie7.h(yh5.b.d(this.f162722l.b(), this.f162725p.j(null)), this, 2);
    }

    @Override // ina.k
    public final Object h3(DocumentsPage documentsPage, ge7.f fVar) {
        return new TextLocalisedClause(R$string.statement_documents_and_statements_title, null, null, 14);
    }
}

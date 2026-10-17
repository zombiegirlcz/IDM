package ma2;

import androidx.sqlite.SQLiteConnection;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.models.openbanking.OpenBankingConsent;
import com.revolut.domain.models.openbanking.OpenBankingConsentsFilter;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.AddEvidenceFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.SpousalConsentInitiatorFlowContract$Step;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.DonationSchedule;
import com.revolut.feature.full_screen_prompt.c;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.feature_retail_user_declarations.terms_review.flow.TermsReviewFlowContract$State;
import com.revolut.feature_retail_user_declarations.terms_review.flow.TermsReviewFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_phone_number_purchase.EsimMobilePlanPhoneNumberPurchaseFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.EsimMobilePlanSubscriptionFlowContract$Step;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import ip0.og;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import mf4.c0;
import mjf.b0;
import nif.d1;
import nif.m2;
import nif.w0;
import nii.z;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.joda.time.Period;
import te0.w;
import tof.a3;
import tof.hc;
import tof.i1;
import tof.i7;
import tof.q6;
import tof.r9;
import vkm.j2;
import yhm.m;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f203937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f203938c;

    public /* synthetic */ s(Object obj2, Object obj3, int i) {
        this.f203936a = i;
        this.f203937b = obj2;
        this.f203938c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v20, types: [grj.f] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.revolut.core.model.account.AccountId] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        dj0.d dVarB;
        dj0.d dVarO;
        int i;
        efm.b bVarA;
        efm.r rVarH;
        int i2;
        int i3 = this.f203936a;
        od0.i iVar = od0.i.f224256b;
        int i5 = 4;
        int i6 = 2;
        int i21 = 0;
        ?? A = 0;
        A = 0;
        A = 0;
        A = 0;
        A = 0;
        int i22 = 1;
        Object obj3 = this.f203938c;
        Object obj4 = this.f203937b;
        switch (i3) {
            case 0:
                List aliases = (List) obj4;
                Data currentAlias = new Data((Alias) obj3, null, false, 6, null);
                ((e) obj2).getClass();
                Intrinsics.checkNotNullParameter(aliases, "aliases");
                Intrinsics.checkNotNullParameter(currentAlias, "currentAlias");
                return new e(currentAlias, aliases);
            case 1:
                com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.a) obj4;
                AddEvidenceFlowContract$Step addEvidenceFlowContract$Step = (AddEvidenceFlowContract$Step) obj3;
                dii.g outputData = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof dii.e) {
                    aVar.I2(((AddEvidenceFlowContract$Step.MissingBank) addEvidenceFlowContract$Step).f67698b);
                } else if (outputData instanceof dii.f) {
                    int i32 = jli.h.f175850a;
                } else {
                    if (!(outputData instanceof dii.b) && !(outputData instanceof dii.c) && !(outputData instanceof dii.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.INFO, "AddEvidenceFlowModel", outputData + " is not supported.", null, null, 16);
                }
                return Unit.f186387a;
            case 2:
                OrderQuoteParams orderQuoteParams = (OrderQuoteParams) obj3;
                OrderQuote quote = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(quote, "quote");
                int i33 = mbh.c.f204215a[((n1h.a) obj4).ordinal()];
                if (i33 == 1) {
                    dVarB = l4i.a.b(quote.f104754c);
                } else {
                    if (i33 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVarB = l4i.a.b(quote.e);
                }
                xi0.b bVar = dVarB.f115083b;
                dj0.d dVarB2 = l4i.a.b(quote.f104755g.f104731a.f104722a);
                xi0.b bVar2 = dVarB2.f115083b;
                if (Intrinsics.f(bVar2, bVar)) {
                    dVarO = pyd.c.O(dVarB, dVarB2);
                } else {
                    hx7.e.n(new IllegalStateException(a0.d.s("Fee and From Money are different currencies. FeeCurrency=", bVar2.f306286a, " FromMoneyCurrency=", bVar.f306286a)));
                    dVarO = dVarB;
                }
                return new n1h.d(dVarB, dVarO, new n1h.c(dVarB2, orderQuoteParams));
            case 3:
                mc6.f updateState = (mc6.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                Data donationSchedule = new Data(DonationSchedule.a((DonationSchedule) obj4, null, jli.b.i((LocalDate) obj3), 1), null, false, 6, null);
                updateState.getClass();
                Intrinsics.checkNotNullParameter(donationSchedule, "donationSchedule");
                return new mc6.f(donationSchedule);
            case 4:
                mc6.f updateState2 = (mc6.f) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                Data donationSchedule2 = new Data(DonationSchedule.a((DonationSchedule) obj4, (Period) obj3, null, 2), null, false, 6, null);
                updateState2.getClass();
                Intrinsics.checkNotNullParameter(donationSchedule2, "donationSchedule");
                return new mc6.f(donationSchedule2);
            case 5:
                mc7.d dVar = (mc7.d) obj4;
                String str = (String) obj3;
                AnalyticsAccount analyticsAccount = (AnalyticsAccount) obj2;
                Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
                lmd.g gVar = (lmd.g) dVar.f204296b;
                Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
                eqj.g gVar2 = gVar.f196964h;
                djb.q qVar = gVar.i;
                boolean z = analyticsAccount instanceof AnalyticsAccount.Linked;
                if (z || (analyticsAccount instanceof AnalyticsAccount.Personal) || (analyticsAccount instanceof AnalyticsAccount.Pro) || (analyticsAccount instanceof AnalyticsAccount.Savings.PersonalIndividual) || (analyticsAccount instanceof AnalyticsAccount.Savings.PersonalAll)) {
                    i = 0;
                    bVarA = gVar2.a(i1.f272794a);
                } else if (analyticsAccount instanceof AnalyticsAccount.Savings.JointIndividual) {
                    efm.k kVarFirstElement = m70.a.g(rd0.e.c(((rnb.v) qVar).d(((AnalyticsAccount.Savings.JointIndividual) analyticsAccount).f99200b), kotlin.coroutines.g.f186406a), null, new lk7.m(19), 1).firstElement();
                    llh.g gVar3 = new llh.g(14, new lmd.f(gVar, i6));
                    kVarFirstElement.getClass();
                    bVarA = new pfm.a(kVarFirstElement, gVar3, 3);
                    Intrinsics.checkNotNullExpressionValue(bVarA, "flatMapCompletable(...)");
                    i = 0;
                } else if (analyticsAccount instanceof AnalyticsAccount.Savings.JointAll) {
                    efm.k kVarFirstElement2 = m70.a.g(rd0.e.c(((rnb.v) qVar).a(((AnalyticsAccount.Savings.JointAll) analyticsAccount).f99198a), kotlin.coroutines.g.f186406a), null, new lk7.m(20), 1).firstElement();
                    int i43 = 3;
                    i = 0;
                    llh.g gVar4 = new llh.g(15, new lmd.f(gVar, i43));
                    kVarFirstElement2.getClass();
                    pfm.a aVar2 = new pfm.a(kVarFirstElement2, gVar4, i43);
                    Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                    bVarA = aVar2;
                } else {
                    i = 0;
                    if (analyticsAccount instanceof AnalyticsAccount.Joint) {
                        bVarA = gVar2.a(new hc(((AnalyticsAccount.Joint) analyticsAccount).getF99182a().f51413b, null));
                    } else if (analyticsAccount instanceof AnalyticsAccount.Junior) {
                        bVarA = gVar.b(((AnalyticsAccount.Junior) analyticsAccount).getF99186a());
                    } else {
                        if (!(analyticsAccount instanceof AnalyticsAccount.Savings.JuniorSaving)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVarA = gVar.b(((AnalyticsAccount.Savings.JuniorSaving) analyticsAccount).f99202b);
                    }
                }
                vkm.d dVarD = eqj.d.d(gVar.f);
                kotlin.coroutines.g gVar5 = kotlin.coroutines.g.f186406a;
                efm.r map = m70.a.g(rd0.e.c(dVarD, gVar5), null, new lk7.m(21), 1).map(new llh.g(7, new lmd.f(gVar, i)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                sfm.b bVarG = bVarA.g(w.l(map, m70.a.g(rd0.e.c(((le3.f) gVar.f196962c).e(y0.b(analyticsAccount)), gVar5), null, new lk7.m(15), 1)).switchMap(new llh.g(13, new llh.j(gVar, analyticsAccount, 6))));
                Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
                if (!(analyticsAccount instanceof AnalyticsAccount.Personal.CreditCard) && !z && !(analyticsAccount instanceof AnalyticsAccount.Pro) && !(analyticsAccount instanceof AnalyticsAccount.Savings) && !(analyticsAccount instanceof AnalyticsAccount.Junior)) {
                    if (!(analyticsAccount instanceof AnalyticsAccount.Personal) && !(analyticsAccount instanceof AnalyticsAccount.Joint)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    A = com.revolut.retail.feature.api.a.a(analyticsAccount);
                }
                if (A != 0) {
                    rVarH = ((grj.f) dVar.f204297c).a(A);
                } else {
                    od0.i.Companion.getClass();
                    rVarH = w.h(iVar);
                }
                return w.l(bVarG, rVarH).map(new ma1.v(15, new li8.n(str, 25, dVar, analyticsAccount)));
            case 6:
                String str2 = (String) obj4;
                String pocketId = (String) obj2;
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                return u0.f(new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByAccounts(new ProductAccountDescriptor$Value.Main(com.revolut.feature.credit.models.a.b(str2), ProductId.CREDIT), (TransactionContext) null), (String) null, (AccountId) AccountId.Personal.f51414a, (rhf.h) null, rhf.g.CREDIT_CARD_HOME, (TransactionDestination) null, (q6) i1.f272794a, (Set) null, (RecurringPaymentAccount) RecurringPaymentAccount.Personal.f89320a, (RecurringPaymentFilter) ((mce.d) obj3).f.b(new h9e.a(str2, pocketId)), false, 51887)));
            case 7:
                com.revolut.feature_retail_user_declarations.terms_review.flow.a aVar3 = (com.revolut.feature_retail_user_declarations.terms_review.flow.a) obj4;
                yki.b bVar3 = (yki.b) obj3;
                nci.o result = (nci.o) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                qki.d dVar2 = aVar3.f97746q;
                int i59 = ((TermsReviewFlowContract$State) ((j2) dVar2.f22677a).getValue()).f97743a;
                if (Intrinsics.f(result, nci.n.f214208a)) {
                    i2 = i59 + 1;
                } else {
                    if (!Intrinsics.f(result, nci.m.f214207a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = i59 - 1;
                }
                if (i2 < 0) {
                    oki.h.D2(bVar3);
                } else {
                    String str3 = (String) d0.e0(i2, aVar3.o.f97742c);
                    if (str3 != null) {
                        aVar3.H2(dVar2, new l2c.l(i2, i22));
                        oki.h.t2(aVar3, bVar3, new TermsReviewFlowContract$Step.ReadTerms(str3), false, i2 > i59 ? TransitionAnimation.SLIDE_END_TO_START.f98395a : TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                    } else {
                        aVar3.l2(new mci.e(aVar3, A, i21), new yi5.b(26));
                    }
                }
                return Unit.f186387a;
            case 8:
                md5.a aVar4 = (md5.a) obj4;
                Set set = (Set) obj3;
                ed5.c availability = (ed5.c) obj2;
                Intrinsics.checkNotNullParameter(availability, "availability");
                if (!Intrinsics.f(availability, new ed5.a(ed5.d.EEA))) {
                    od0.i.Companion.getClass();
                    return efm.d0.m(iVar);
                }
                efm.d0 d0VarC = ((ji5.e) aVar4.f204480a).c();
                ma1.v vVar = new ma1.v(21, new imk.e(aVar4, set, 13));
                d0VarC.getClass();
                return new ufm.i(d0VarC, vVar, 1);
            case 9:
                mei.g gVar6 = (mei.g) obj4;
                Throwable closeTileThrowable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(closeTileThrowable, "closeTileThrowable");
                pfm.h hVar = new pfm.h(new mei.a(gVar6, y0.b((String) obj3), i22), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar.e(gVar6.d.g("TILES", false)).e(efm.b.n(closeTileThrowable));
            case 10:
                com.revolut.retail.feature.pod_nominees.impl.edit.d dVar3 = (com.revolut.retail.feature.pod_nominees.impl.edit.d) obj4;
                AddressFlowContract$OutputData addressResult = (AddressFlowContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(addressResult, "addressResult");
                dVar3.getClass();
                dVar3.T2(new lr.l(dVar3, (mek.g) obj3, addressResult, (Continuation) null, 16), new yi5.b(27));
                return Unit.f186387a;
            case 11:
                c0 c0Var = (c0) obj3;
                oki.h.w2(((com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g) obj4).v, new OfferV2FlowContract$Step.Document(c0Var.f204845a, c0Var.f204846b, c0Var.f204847c, (String) obj2), ModalDestination.Style.POPUP.f98311a);
                return Unit.f186387a;
            case 12:
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar7 = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g) obj4;
                cv3.c cVar = (cv3.c) obj3;
                yja.b result2 = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                int i66 = mf4.d0.f204849b[result2.ordinal()];
                if (i66 == 1 || i66 == 2) {
                    gVar7.Q2(cVar.d, false);
                } else if (i66 == 3) {
                    c84.t.J2(gVar7, false, null, null, 7);
                } else {
                    if (i66 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yji.l.b1(gVar7, gVar7.X1(new nii.y0(null, new z(new TextLocalisedClause(R$string.credit_error_subtitle, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, 7);
                }
                return Unit.f186387a;
            case 13:
                OpenBankingConsentsFilter openBankingConsentsFilter = (OpenBankingConsentsFilter) obj4;
                String str4 = (String) obj3;
                List consents = (List) obj2;
                Intrinsics.checkNotNullParameter(consents, "consents");
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : consents) {
                    OpenBankingConsent.Australia australia = (OpenBankingConsent.Australia) obj5;
                    int i74 = mg6.a.f205159a[openBankingConsentsFilter.ordinal()];
                    if (i74 != 1) {
                        if (i74 != 2) {
                            if (i74 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (australia.f != OpenBankingConsent.Australia.ConsentState.ACTIVE) {
                            }
                        } else if (australia.f == OpenBankingConsent.Australia.ConsentState.ACTIVE) {
                        }
                    }
                    if (Intrinsics.f(australia.e.f60404a, str4)) {
                        arrayList.add(obj5);
                    }
                }
                return arrayList;
            case 14:
                Data data = (Data) obj4;
                Data contentData = new Data((mg7.i) obj3, data.getError(), data.getLoading());
                ((mg7.j) obj2).getClass();
                Intrinsics.checkNotNullParameter(contentData, "contentData");
                return new mg7.j(contentData);
            case 15:
                com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar4 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b) obj4;
                EsimMobilePlanPhoneNumberPurchaseFlow esimMobilePlanPhoneNumberPurchaseFlow = (EsimMobilePlanPhoneNumberPurchaseFlow) obj3;
                lgj.d result3 = (lgj.d) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (!(result3 instanceof lgj.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.t2(bVar4, bVar4.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase(((lgj.c) result3).f195123a, lgj.e.MY_NUMBERS, esimMobilePlanPhoneNumberPurchaseFlow.K.f100816c), false, null, false, 12);
                return Unit.f186387a;
            case 16:
                mh4.k update = (mh4.k) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return mh4.k.a(update, null, null, null, null, null, new mh4.j((String) obj4, (mh4.i) obj3), CertificateBody.profileType);
            case 17:
                mh4.k kVar = (mh4.k) obj4;
                mh4.c0 c0Var2 = (mh4.c0) obj3;
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                mv3.a aVar5 = kVar.e;
                if (aVar5 != null) {
                    return c0Var2.a(kVar, aVar5);
                }
                m70.a.c(t0.f186434a);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.refinancing_offer_credit_to_selection_title, zhm.u.c(""), null, 12);
                f0 f0Var = f0.f322471a;
                int i92 = kVar.f205393b ? R$drawable.uikit_icn_24_cross : R$drawable.uikit_icn_24_back_button_arrow;
                IntRange intRange = new IntRange(1, 15, 1);
                ArrayList arrayList2 = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it9 = intRange.iterator();
                while (it9.f289625c) {
                    og ogVar = new og(a0.d.n("ID_LOADING_ITEM_", it9.nextInt() - 1));
                    yp0.b.l(ogVar, 0, 0, 0, 0, null, false, 63);
                    arrayList2.add(ogVar);
                }
                return new mh4.q(arrayList2, f0Var, textLocalisedClause, null, null, null, false, i92);
            case 18:
                return new zgh.c((Data) obj3);
            case 19:
                mi1.d dVar4 = (mi1.d) obj4;
                Function0 function0 = (Function0) obj3;
                r7a.i permissionFlowOutput = (r7a.i) obj2;
                Intrinsics.checkNotNullParameter(permissionFlowOutput, "permissionFlowOutput");
                if (permissionFlowOutput instanceof r7a.h) {
                    dVar4.f205595n.k(mi1.a.GRANTED);
                    function0.invoke();
                } else if ((permissionFlowOutput instanceof r7a.e) || (permissionFlowOutput instanceof r7a.f)) {
                    dVar4.f205595n.k(mi1.a.REJECTED);
                    Unit unit = Unit.f186387a;
                } else {
                    if (!(permissionFlowOutput instanceof r7a.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        throw new IllegalStateException("Unhandled secondary click");
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        Throwable thA = yhm.m.a(yhm.o.a(th10));
                        if (thA != null) {
                            hx7.e.n(thA);
                        }
                    }
                }
                return Unit.f186387a;
            case 20:
                com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b bVar5 = (com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b) obj4;
                SpousalConsentInitiatorIntroScreenConfig spousalConsentInitiatorIntroScreenConfig = (SpousalConsentInitiatorIntroScreenConfig) obj3;
                com.revolut.feature.full_screen_prompt.c result4 = (com.revolut.feature.full_screen_prompt.c) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (Intrinsics.f(result4, c.C0497c.f74506a)) {
                    if ((spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.ApplicationDecline) || (spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.ApplyForOtherProduct) || (spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.AwaitingResponse)) {
                        bVar5.l2(new mi4.e(bVar5, A, i21), new yi5.b(26));
                    } else {
                        if (!(spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.NeedPartnerConsent)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oki.h.u2(bVar5, bVar5.f68444s, SpousalConsentInitiatorFlowContract$Step.RequestConsent.f68439a, null, 6);
                    }
                } else if (Intrinsics.f(result4, c.d.f74507a)) {
                    if ((spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.ApplicationDecline) || (spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.AwaitingResponse)) {
                        bVar5.l2(new jkh.g(bVar5, false, (Continuation) null), new yi5.b(26));
                    } else if (spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.ApplyForOtherProduct) {
                        bVar5.l2(new mi4.e(bVar5, A, i22), new yi5.b(26));
                    } else {
                        if (!(spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.NeedPartnerConsent)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Unsupported action for ", com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b.P2(spousalConsentInitiatorIntroScreenConfig), ": FullScreenPromptScreenContract.OutputData.SecondaryAction, finishing flow"));
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        bVar5.K2(null);
                    }
                } else if (result4 instanceof c.a) {
                    if ((spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.ApplicationDecline) || (spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.AwaitingResponse)) {
                        bVar5.K2(null);
                    } else if (spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.NeedPartnerConsent) {
                        bVar5.l2(new jkh.g(bVar5, true, (Continuation) null), new yi5.b(26));
                    } else {
                        if (!(spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.ApplyForOtherProduct)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        IllegalStateException illegalStateException2 = new IllegalStateException(p.a.p("Unsupported action for ", com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b.P2(spousalConsentInitiatorIntroScreenConfig), ": FullScreenPromptScreenContract.OutputData.CloseAction, finishing flow"));
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                        bVar5.K2(null);
                    }
                }
                return Unit.f186387a;
            case 21:
                ((mif.d) obj4).f205792c.insert((SQLiteConnection) obj2, (Iterable) obj3);
                return null;
            case 22:
                ((mif.g) obj4).f205797b.insert((SQLiteConnection) obj2, (d1) obj3);
                return null;
            case 23:
                ((mif.h) obj4).f205800c.insert((SQLiteConnection) obj2, (m2) obj3);
                return null;
            case 24:
                ((mif.h) obj4).f205799b.insert((SQLiteConnection) obj2, (Iterable) obj3);
                return Unit.f186387a;
            case 25:
                ((mif.j) obj4).f205805b.insert((SQLiteConnection) obj2, (Iterable) obj3);
                return Unit.f186387a;
            case 26:
                return mif.s.B((mif.s) obj4, (i7) obj3);
            case 27:
                ((mif.s) obj4).f205834p.insert((SQLiteConnection) obj2, (w0) obj3);
                return null;
            case 28:
                return mif.s.C((mif.s) obj3, (List) obj4);
            default:
                BreadcrumbException timeoutBreadcrumb = (BreadcrumbException) obj3;
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                x71.e eVar = ((b0) obj4).f205982a;
                a3 transaction = (a3) d0.b0(transactions);
                xif.s sVar = (xif.s) eVar;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                Intrinsics.checkNotNullParameter(timeoutBreadcrumb, "timeoutBreadcrumb");
                String transferLinkId = transaction.I.f273161a;
                if (transferLinkId == null) {
                    pfm.n nVarN = efm.b.n(new IllegalArgumentException("Not a transfer link transaction"));
                    Intrinsics.checkNotNullExpressionValue(nVarN, "error(...)");
                    return nVarN;
                }
                i31.l lVar = (i31.l) sVar.f306378b;
                Intrinsics.checkNotNullParameter(transferLinkId, "transferLinkId");
                efm.b bVarCancelTransferLink = lVar.f158085b.cancelTransferLink(transferLinkId);
                pfm.h hVar2 = new pfm.h(new hc7.a(lVar, transferLinkId, i5), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                pfm.a aVarE = bVarCancelTransferLink.e(hVar2);
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                pfm.r rVarG0 = w.g0(aVarE);
                tif.d dVar5 = sVar.e;
                r9 filter = new r9(transaction.f272581b);
                tif.q qVar2 = (tif.q) dVar5;
                qVar2.getClass();
                Intrinsics.checkNotNullParameter(filter, "filter");
                pfm.a aVarE2 = rVarG0.e(qVar2.e.d(Priority.STANDARD.f60263b, new tif.k(qVar2, filter, timeoutBreadcrumb, i22)));
                Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                return w.g0(aVarE2);
        }
    }

    public /* synthetic */ s(mi1.d dVar, Function0 function0, mfl.b bVar) {
        this.f203936a = 19;
        this.f203937b = dVar;
        this.f203938c = function0;
    }

    public /* synthetic */ s(mif.s sVar, List list) {
        this.f203936a = 28;
        this.f203938c = sVar;
        this.f203937b = list;
    }

    public /* synthetic */ s(n1h.a aVar, mbh.d dVar, OrderQuoteParams orderQuoteParams) {
        this.f203936a = 2;
        this.f203937b = aVar;
        this.f203938c = orderQuoteParams;
    }
}

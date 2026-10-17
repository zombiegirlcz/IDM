package xf0;

import androidx.sqlite.SQLiteConnection;
import atg.m;
import atg.n;
import atg.v;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import com.revolut.feature.crypto.tfr.validation.api.navigation.TfrValidationFlowContract$Step;
import com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo;
import com.revolut.feature.external_accounts.impl.ui.japan.easy_bank_transfer.JapanEasyBankTransferFlowContract$Step;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.EditWatchlistsControllerContract$ModalStep;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.spaces.ProductContext;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import com.revolut.feature.tax_residency.impl.flows.collection.CollectTaxResidencyFlowContract$State;
import com.revolut.feature.tax_residency.impl.flows.collection.CollectTaxResidencyFlowContract$Step;
import com.revolut.feature.tax_residency.impl.flows.tin.TaxNumberInputFlow;
import com.revolut.feature.tax_residency.impl.flows.tin.TaxNumberInputFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.TaxResidencyFlowContract$Step;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlowContract$Page;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingContractType;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingScheduleOption;
import com.revolut.retail.feature.esim.impl.ui.flows.home.EsimHomeFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_phone_number_purchase.EsimMobilePlanPhoneNumberPurchaseFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.features.PlanFeatureResource;
import com.revolut.sso.api.models.ConsentChallenge;
import com.revolut.sso.impl.ui.consent.app.AppConsentFlowContract$Step;
import com.youTransactor.uCube.rpc.Constants;
import dej.d2;
import dej.t1;
import djb.t;
import hha.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jgk.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jmrtd.lds.LDSFile;
import pfm.r;
import te0.w;
import tif.q;
import tn6.h;
import tof.r9;
import tof.va;
import vge.t2;
import w21.o;
import xec.c0;
import xg6.l;
import xmd.k0;
import xmd.l0;
import xmd.m0;
import xnd.j0;
import xnd.o0;
import xnd.p0;
import xnd.q0;
import xnd.t0;
import xnd.y0;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f304757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f304758c;

    public /* synthetic */ j(Object obj2, Object obj3, int i) {
        this.f304756a = i;
        this.f304757b = obj2;
        this.f304758c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0628  */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 3418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xf0.j.a(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v159, types: [com.revolut.core.model.account.AccountId[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Set setKeySet;
        SubSpaceAccountItem subSpaceAccountItem;
        JapanEasyBankTransferFlowContract$Step.JapanEasyBankAuthorization japanEasyBankAuthorization;
        Flow flowI;
        p0 p0Var;
        q0 q0Var;
        q0 q0Var2;
        String str;
        Float f;
        int i = this.f304756a;
        w4l.h loadingStrategy = w4l.h.f294642c;
        AccountId.Personal accountId = AccountId.Personal.f51414a;
        int i2 = 2;
        final int iFloatValue = 0;
        Object obj3 = this.f304758c;
        Object obj4 = this.f304757b;
        switch (i) {
            case 0:
                ((k) obj4).f304761c.insert((SQLiteConnection) obj2, (zf0.g) obj3);
                return null;
            case 1:
                com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar = (com.revolut.retail.feature.esim.impl.ui.flows.home.c) obj4;
                EsimHomeFlowContract$Step esimHomeFlowContract$Step = (EsimHomeFlowContract$Step) obj3;
                pkj.h result = (pkj.h) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof pkj.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                EsimHomeFlowContract$Step.NumberTransferCreation numberTransferCreation = (EsimHomeFlowContract$Step.NumberTransferCreation) esimHomeFlowContract$Step;
                pkj.g gVar = (pkj.g) result;
                cVar.E2(new EsimHomeFlowContract$Step.NumberTransferConfirmation(numberTransferCreation.f100677a, gVar.f237201a, numberTransferCreation.f100679c, gVar.f237202b), true, null, false);
                return Unit.f186387a;
            case 2:
                com.revolut.retail.feature.esim.impl.ui.flows.home.c cVar2 = (com.revolut.retail.feature.esim.impl.ui.flows.home.c) obj4;
                EsimMobilePlanPhoneNumberPurchaseFlow esimMobilePlanPhoneNumberPurchaseFlow = (EsimMobilePlanPhoneNumberPurchaseFlow) obj3;
                lgj.d result2 = (lgj.d) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (!(result2 instanceof lgj.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar2.E2(new EsimHomeFlowContract$Step.NumberPurchase(((lgj.c) result2).f195123a, lgj.e.MY_NUMBERS, esimMobilePlanPhoneNumberPurchaseFlow.K.f100816c), false, null, false);
                return Unit.f186387a;
            case 3:
                xg1.a aVar = (xg1.a) obj4;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new ufm.i(w.i0(aVar.f305481b.getOpc((String) obj3, new yg1.e((String) pair.f186385a, (String) pair.f186386b))), new x9h.d(27, new xe7.a(aVar, 3)), 1);
            case 4:
                xg6.j jVar = (xg6.j) obj4;
                String institutionId = (String) obj3;
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : pockets) {
                    if (Intrinsics.f(((io3.d) obj5).o, institutionId)) {
                        arrayList.add(obj5);
                    }
                }
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((io3.d) it8.next()).f163145a);
                }
                va vaVar = new va(d0.i1(arrayList2));
                o oVar = (o) jVar.f305582a;
                Intrinsics.checkNotNullParameter(institutionId, "institutionId");
                pfm.a aVarE = w.g0(oVar.f293931a.revokeInstitution(institutionId)).e(pd.b.n(skm.p0.f264003c, new c0(jVar, vaVar, f99182a, 4)));
                v vVar = (v) jVar.f305583b;
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                pfm.a aVar2 = new pfm.a(vVar.c(accountId), new n(iFloatValue, new m(vVar, iFloatValue)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                return aVarE.e(aVar2);
            case 5:
                l lVar = (l) obj4;
                String str2 = (String) obj3;
                List pockets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets2, "pockets");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : pockets2) {
                    if (Intrinsics.f(((io3.d) obj6).o, str2)) {
                        arrayList3.add(obj6);
                    }
                }
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                Iterator it9 = arrayList3.iterator();
                while (it9.hasNext()) {
                    arrayList4.add(((io3.d) it9.next()).f163145a);
                }
                int i3 = 5;
                r rVarG0 = w.g0(pd.b.n(skm.p0.f264003c, new c0(lVar, new va(d0.i1(arrayList4)), f99182a, i3)));
                v vVar2 = (v) lVar.f305589b;
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                pfm.a aVar3 = new pfm.a(vVar2.c(accountId), new n(i3, new m(vVar2, i3)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                pfm.a aVarE2 = rVarG0.e(aVar3);
                Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                return aVarE2;
            case 6:
                com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a aVar4 = (com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a) obj4;
                EditWatchlistsControllerContract$ModalStep editWatchlistsControllerContract$ModalStep = (EditWatchlistsControllerContract$ModalStep) obj3;
                dii.g it10 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                if (it10 instanceof dii.f) {
                    aVar4.n2(new c0(aVar4, ((EditWatchlistsControllerContract$ModalStep.ConfirmWatchlistRemoval) editWatchlistsControllerContract$ModalStep).f86922a, f99182a, 7), new whi.b(6));
                } else if (!(it10 instanceof dii.e) && !(it10 instanceof dii.b) && !(it10 instanceof dii.c) && !(it10 instanceof dii.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 7:
                Data data = (Data) obj4;
                com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a aVar5 = (com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a) obj3;
                xgd.m mVar = (xgd.m) obj2;
                Map map = (Map) data.getContent();
                List listD1 = (map == null || (setKeySet = map.keySet()) == null) ? null : d0.d1(setKeySet);
                List list = mVar.f305684b;
                aVar5.f86925q.getClass();
                if (list != null) {
                    listD1 = listD1 != null ? d0.P0(listD1, new b83.a(list, 13)) : null;
                }
                return xgd.m.a(mVar, data, listD1, null, 4);
            case 8:
                ProductContext productContext = (ProductContext) obj4;
                xge.g gVar2 = (xge.g) obj3;
                List<ProductAccount> accountsList = (List) obj2;
                Intrinsics.checkNotNullParameter(accountsList, "accountsList");
                ArrayList arrayList5 = new ArrayList();
                for (ProductAccount productAccount : accountsList) {
                    if (productContext.f89553a == ProductId.FAVORITE) {
                        ProductId productId = ((t2) gVar2.f305712b).h(productAccount.getF89504c());
                        if (productId != null) {
                            ProductSpaceIdentifier spaceIdentifier = productContext.f89554b;
                            pie.v subSpaceIdentifier = productContext.f89555c;
                            Intrinsics.checkNotNullParameter(productId, "productId");
                            Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
                            Intrinsics.checkNotNullParameter(subSpaceIdentifier, "subSpaceIdentifier");
                            subSpaceAccountItem = new SubSpaceAccountItem(new ProductContext(productId, spaceIdentifier, subSpaceIdentifier), productAccount);
                        } else {
                            subSpaceAccountItem = null;
                        }
                    } else {
                        subSpaceAccountItem = new SubSpaceAccountItem(productContext, productAccount);
                    }
                    if (subSpaceAccountItem != null) {
                        arrayList5.add(subSpaceAccountItem);
                    }
                }
                return arrayList5;
            case 9:
                xhc.e eVar = (xhc.e) obj4;
                String str3 = (String) obj3;
                Boolean featureEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(featureEnabled, "featureEnabled");
                if (!Intrinsics.f(featureEnabled, Boolean.TRUE)) {
                    if (Intrinsics.f(featureEnabled, Boolean.FALSE)) {
                        return efm.r.just(new Data(f0.f322471a, null, false, 6, null));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                wgc.c cVar3 = eVar.f305853a;
                cVar3.getClass();
                w4l.j loadingStrategy2 = w4l.j.f294644c;
                Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                cVar3.e.init();
                return efm.r.combineLatest(rd0.e.c(boh.f.e(rd0.e.b(cVar3.f297305b.q()), new wg2.g(cVar3, loadingStrategy2, i2)), kotlin.coroutines.g.f186406a), ue0.e.E(eVar.f305854b.q(), new Data(null, null, false, 7, null)), eVar.e, new xg6.k(new wx6.k(eVar, str3, 12), 10));
            case 10:
                xif.o oVar2 = (xif.o) obj4;
                efm.d0 upstream = (efm.d0) obj2;
                Intrinsics.checkNotNullParameter(upstream, "upstream");
                efm.d0 d0VarFirst = ((q) oVar2.d).c(new r9(((wif.b) obj3).f297890a), TransactionsSort.NO_SORT, 2, new TransactionContext(null, TransactionContext.DataSet.AllExcluded.f60267a, 1), null).first(f0.f322471a);
                Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
                ufm.i iVar = new ufm.i(w.I0(upstream, d0VarFirst, oVar2.f306369b.f(false)), new xg6.k(new xif.j(oVar2, iFloatValue), 17), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return w.i0(iVar);
            case 11:
                t1 t1Var = (t1) obj3;
                d2 action = (d2) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                ((xjj.d) obj4).getClass();
                switch (xjj.c.f306531a[action.ordinal()]) {
                    case 1:
                        return new bnj.a("ID_MOBILE_PLAN_BILLING", null);
                    case 2:
                        return new bnj.a("ID_MOBILE_PLAN_INVOICES", null);
                    case 3:
                        return new bnj.a("ID_MOBILE_PLAN_ESIM_INSTALL", t1Var.e);
                    case 4:
                        return new bnj.a("ID_ESIM_SHARE", t1Var.e);
                    case 5:
                        return new bnj.a("ID_MOBILE_PLAN_RESTART", null);
                    case 6:
                        return new bnj.a("ID_MOBILE_PLAN_UNFREEZE", t1Var.e);
                    case 7:
                        return new bnj.a("ID_MOBILE_PLAN_TRANSFER_ESIM_TO_CURRENT_DEVICE", t1Var.e);
                    case 8:
                        return new bnj.a("ID_MOBILE_PLAN_PORTABILITY_CREATION", null);
                    case 9:
                        return new bnj.a("ID_ADD_PHONE_NUMBER", null);
                    case 10:
                        return new bnj.a("ID_MOBILE_PLAN_REQUEST_PAC", t1Var.f113657m);
                    case 11:
                        return new bnj.a("ID_MOBILE_PLAN_UPGRADE", t1Var);
                    case 12:
                        return new bnj.a("ID_MOBILE_PLAN_PORTABILITY_CONFIRMATION", null);
                    case 13:
                        return new bnj.a("ID_MOBILE_PLAN_WITHDRAWAL", null);
                    case 14:
                        return new bnj.a("ID_MOBILE_PLAN_CANCELLATION", null);
                    case 15:
                        return new bnj.a("ID_MOBILE_PLAN_ACTIVATE_PLAN", null);
                    case 16:
                        return new bnj.a("ID_MOBILE_PLAN_ACTIVATE_ESIM", null);
                    case 17:
                        return new bnj.a("ID_MOBILE_PLAN_INSTALLATION_TROUBLESHOOTER", null);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 12:
                tkj.e eVar2 = (tkj.e) obj4;
                xkj.g update = (xkj.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType = eVar2.f271964a;
                return xkj.g.a(update, null, esimPhoneNumberPortingContractType, (EsimPhoneNumberPortingScheduleOption) d0.M0(esimPhoneNumberPortingContractType.d), null, null, null, ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.b) obj3).I2(eVar2.f271964a.e), 49);
            case 13:
                return a(obj2);
            case 14:
                y featureState = (y) obj3;
                PlanFeatureResource resource = (PlanFeatureResource) obj2;
                Intrinsics.checkNotNullParameter(resource, "resource");
                xlk.h hVar = ((xlk.j) obj4).f307043c;
                Intrinsics.checkNotNullParameter(resource, "resource");
                Intrinsics.checkNotNullParameter(featureState, "featureState");
                b.c groupStyle = b.c.f174067a;
                Intrinsics.checkNotNullParameter(groupStyle, "groupStyle");
                return hVar.a(resource.f103382b, resource.f103383c, resource.d, xlk.h.b(resource), resource.e, featureState);
            case 15:
                ConsentChallenge.App app = (ConsentChallenge.App) obj4;
                com.revolut.sso.impl.ui.consent.app.b bVar = (com.revolut.sso.impl.ui.consent.app.b) obj3;
                aml.g result3 = (aml.g) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                Continuation continuation = null;
                if (result3 instanceof aml.d) {
                    if (app.e.f105902c.f105903a == com.revolut.sso.api.models.b.PENDING_VERIFICATION) {
                        oki.h.t2(bVar, bVar.v, new AppConsentFlowContract$Step.UnexpectedLocationCheck(app), true, null, false, 12);
                    } else {
                        bVar.l2(new com.revolut.sso.impl.ui.consent.app.a(bVar, "LOADING_TAG_BUTTON_CONTINUE", app, null), new yi5.b(26));
                    }
                } else if (result3 instanceof aml.e) {
                    bVar.l2(new xge.f(bVar, "LOADING_TAG_BUTTON_REJECT", app, continuation, 8), new xll.c(bVar, 1));
                } else {
                    if (!(result3 instanceof aml.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(bVar.v);
                }
                return Unit.f186387a;
            case 16:
                com.revolut.sso.impl.ui.consent.app.b bVar2 = (com.revolut.sso.impl.ui.consent.app.b) obj4;
                ConsentChallenge consentChallenge = (ConsentChallenge) obj3;
                fml.f result4 = (fml.f) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                Continuation continuation2 = null;
                if (result4 instanceof fml.d) {
                    bVar2.l2(new com.revolut.sso.impl.ui.consent.app.a(bVar2, "TAG_LOADING_TWIN_VERTICAL_BUTTON_PRIMARY", consentChallenge, null), new yi5.b(26));
                } else {
                    if (!(result4 instanceof fml.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar2.l2(new xge.f(bVar2, "TAG_LOADING_TWIN_VERTICAL_BUTTON_SECONDARY", consentChallenge, continuation2, 8), new xll.c(bVar2, 1));
                }
                return Unit.f186387a;
            case 17:
                vm5.f result5 = (vm5.f) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                oki.h.t2((xm5.d) obj4, (yki.l) obj3, new TfrValidationFlowContract$Step.PlaceOfBirth(result5.f290537a), true, null, false, 12);
                return Unit.f186387a;
            case 18:
                com.revolut.feature.external_accounts.impl.ui.japan.easy_bank_transfer.a aVar6 = (com.revolut.feature.external_accounts.impl.ui.japan.easy_bank_transfer.a) obj4;
                JapanEasyBankTransferFlowContract$Step japanEasyBankTransferFlowContract$Step = (JapanEasyBankTransferFlowContract$Step) obj3;
                tn6.h result6 = (tn6.h) obj2;
                Intrinsics.checkNotNullParameter(result6, "result");
                if (result6 instanceof h.a) {
                    yki.i iVar2 = aVar6.f72958q;
                    EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data data2 = ((JapanEasyBankTransferFlowContract$Step.Consent) japanEasyBankTransferFlowContract$Step).f72953a;
                    if (data2 instanceof EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data.Institution) {
                        EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data.Institution institution = (EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data.Institution) data2;
                        japanEasyBankAuthorization = new JapanEasyBankTransferFlowContract$Step.JapanEasyBankAuthorization(institution.f72267a, null, institution.f72268b);
                    } else {
                        if (!(data2 instanceof EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data.Branch)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data.Branch branch = (EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data.Branch) data2;
                        japanEasyBankAuthorization = new JapanEasyBankTransferFlowContract$Step.JapanEasyBankAuthorization(branch.e, branch.f72263a, branch.f);
                    }
                    oki.h.t2(aVar6, iVar2, japanEasyBankAuthorization, true, null, false, 12);
                } else {
                    if (!(result6 instanceof h.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar6.B2();
                }
                return Unit.f186387a;
            case 19:
                xmd.p0 p0Var2 = (xmd.p0) obj4;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                wmd.a aVar7 = (wmd.a) pair2.f186385a;
                lzi.q qVar = (lzi.q) pair2.f186386b;
                dj0.d dVar = new dj0.d(0L, aVar7.f298635c);
                xmd.o oVar3 = new xmd.o(dVar, xmd.j.f307177a);
                return new wyd.f(nim.a.v(boh.f.e(p0Var2.f307188a.a(aVar7.f298634b, (w4l.k) obj3), new wtl.f(p0Var2, 22, aVar7, qVar)), new j(dVar, oVar3, 20)), oVar3, 14);
            case 20:
                dj0.d dVar2 = (dj0.d) obj4;
                xmd.o oVar4 = (xmd.o) obj3;
                m0 suggestedBudget = (m0) obj2;
                Intrinsics.checkNotNullParameter(suggestedBudget, "suggestedBudget");
                if (suggestedBudget instanceof k0) {
                    xmd.b bVar3 = ((k0) suggestedBudget).f307181a;
                    return new xmd.o(bVar3.f307158a, new xmd.i(bVar3, xmd.a.AVERAGE_SPENDING, dVar2));
                }
                if (Intrinsics.f(suggestedBudget, l0.f307183a)) {
                    return oVar4;
                }
                throw new NoWhenBranchMatchedException();
            case 21:
                aim.e eVar3 = (aim.e) obj4;
                xnd.d dVar3 = (xnd.d) obj3;
                List availableAccounts = (List) obj2;
                Intrinsics.checkNotNullParameter(availableAccounts, "availableAccounts");
                ArrayList arrayList6 = new ArrayList();
                for (Object obj7 : availableAccounts) {
                    if (obj7 instanceof AnalyticsAccount.Joint) {
                        arrayList6.add(obj7);
                    }
                }
                AnalyticsAccount.Joint joint = (AnalyticsAccount.Joint) d0.d0(arrayList6);
                f99182a = joint != null ? joint.getF99182a() : 0;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj8 : eVar3) {
                    if (obj8 instanceof AccountId.Joint) {
                        arrayList7.add(obj8);
                    }
                }
                AccountId.Joint joint2 = (AccountId.Joint) d0.d0(arrayList7);
                ?? r62 = f99182a;
                if (f99182a == 0) {
                    r62 = joint2;
                }
                List listK = r62 != 0 ? zhm.v.k(new AccountId[]{accountId, r62}) : eVar3;
                List<AccountId> listU = d0.U(d0.E0(listK, eVar3));
                ArrayList arrayList8 = new ArrayList(zhm.w.t(listU, 10));
                for (AccountId accountId2 : listU) {
                    gmd.b bVar4 = dVar3.d;
                    Intrinsics.checkNotNullParameter(accountId2, "accountId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    if (Intrinsics.f(accountId2, accountId)) {
                        flowI = nim.a.v(bVar4.f144806a.e(loadingStrategy), gmd.a.f144805a);
                    } else {
                        if (!(accountId2 instanceof AccountId.Joint)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String id10 = ((AccountId.Joint) accountId2).f51413b;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        flowI = zi0.c.i(new WalletId(id10));
                    }
                    arrayList8.add(nim.a.A(boh.f.e(vkm.q.q(flowI), new xnd.c(dVar3, accountId2, iFloatValue)), new atg.q(accountId2, 6)));
                }
                return nim.a.A(nim.a.v(u0.k(arrayList8), new wtl.f(eVar3, 23, listK, r62)), new xlj.h(14));
            case 22:
                final AccountId accountId3 = (AccountId) obj4;
                xnd.d dVar4 = (xnd.d) obj3;
                od0.i budgetData = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(budgetData, "budgetData");
                final lzi.m mVar2 = (lzi.m) budgetData.f224257a;
                if (mVar2 == null) {
                    return new go.g(new Data(new xnd.l0(accountId3, null, null), null, false, 6, null), 2);
                }
                akg.n nVarV = nim.a.v(dVar4.f307385b.a(mVar2.f200987a, loadingStrategy), new Function1() { // from class: xnd.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        switch (iFloatValue) {
                            case 0:
                                lzi.h cycleData = (lzi.h) obj9;
                                Intrinsics.checkNotNullParameter(cycleData, "cycleData");
                                return new l0(accountId3, mVar2, cycleData);
                            default:
                                Throwable it11 = (Throwable) obj9;
                                Intrinsics.checkNotNullParameter(it11, "it");
                                return new l0(accountId3, mVar2, null);
                        }
                    }
                });
                final int i5 = 1;
                return nim.a.A(nVarV, new Function1() { // from class: xnd.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        switch (i5) {
                            case 0:
                                lzi.h cycleData = (lzi.h) obj9;
                                Intrinsics.checkNotNullParameter(cycleData, "cycleData");
                                return new l0(accountId3, mVar2, cycleData);
                            default:
                                Throwable it11 = (Throwable) obj9;
                                Intrinsics.checkNotNullParameter(it11, "it");
                                return new l0(accountId3, mVar2, null);
                        }
                    }
                });
            case 23:
                t0 t0Var = (t0) obj4;
                AnalyticsAccountsSelection.Savings savings = (AnalyticsAccountsSelection.Savings) obj3;
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                od0.i iVar3 = (od0.i) pair3.f186385a;
                od0.i iVar4 = (od0.i) pair3.f186386b;
                j0 j0Var = (j0) iVar4.f224257a;
                if (j0Var != null) {
                    djb.j jVar2 = j0Var.f307411b.f115272a;
                    djb.h hVar2 = jVar2 instanceof djb.h ? (djb.h) jVar2 : null;
                    p0Var = hVar2 != null ? new p0(j0Var.f307410a, kii.e.u(j0Var.f307412c, xi0.b.Companion), hVar2.f115279a) : null;
                } else {
                    p0Var = null;
                }
                j0 j0Var2 = (j0) iVar4.f224257a;
                if (j0Var2 != null) {
                    t tVar = j0Var2.f307411b.f115273b;
                    djb.r rVar = tVar instanceof djb.r ? (djb.r) tVar : null;
                    if (rVar != null) {
                        String str4 = j0Var2.f307410a;
                        rnd.g gVar3 = j0Var2.d.f315458a;
                        if ((gVar3 instanceof rnd.a) || (gVar3 instanceof rnd.b) || (gVar3 instanceof rnd.f) || (gVar3 instanceof rnd.c) || gVar3 == null) {
                            m70.a.c(kotlin.jvm.internal.t0.f186434a);
                            str = "";
                        } else if (gVar3 instanceof rnd.d) {
                            str = ((rnd.d) gVar3).f255599a;
                        } else {
                            if (!(gVar3 instanceof rnd.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = ((rnd.e) gVar3).f255604a;
                        }
                        yvh.b bVar5 = rVar.f115285a;
                        if (bVar5 != null && (f = bVar5.i) != null) {
                            iFloatValue = (int) f.floatValue();
                        }
                        q0Var2 = new q0(str4, str, iFloatValue);
                    } else {
                        q0Var2 = null;
                    }
                    q0Var = q0Var2;
                } else {
                    q0Var = null;
                }
                y0 y0Var = (y0) iVar3.f224257a;
                Set set = savings.f99206a;
                ArrayList arrayList9 = new ArrayList();
                for (Object obj9 : set) {
                    if (obj9 instanceof AnalyticsAccount.Savings.JuniorSaving) {
                        arrayList9.add(obj9);
                    }
                }
                AnalyticsAccount.Savings.JuniorSaving juniorSaving = (AnalyticsAccount.Savings.JuniorSaving) d0.M0(arrayList9);
                return t0.a(t0Var, y0Var, p0Var, null, null, q0Var, juniorSaving != null ? new o0(juniorSaving.f99201a) : null, null, null, t0Var.b(savings), Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2);
            case 24:
                com.revolut.feature.tax_residency.impl.flows.collection.a aVar8 = (com.revolut.feature.tax_residency.impl.flows.collection.a) obj4;
                TaxNumberInputFlow taxNumberInputFlow = (TaxNumberInputFlow) obj3;
                goe.b outputData = (goe.b) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                aVar8.L2(CollectTaxResidencyFlowContract$State.a((CollectTaxResidencyFlowContract$State) aVar8.A2().f98429a, outputData.f145152a, null, null, null, null, 30));
                zme.g gVar4 = i26.l.k(((CollectTaxResidencyFlowContract$State) aVar8.A2().f98429a).f90004b, ((CollectTaxResidencyFlowContract$State) aVar8.A2().f98429a).b()).d;
                Boolean boolValueOf = gVar4 != null ? Boolean.valueOf(gVar4.k) : null;
                wi0.b bVarB = ((CollectTaxResidencyFlowContract$State) aVar8.A2().f98429a).b();
                if (!Intrinsics.f(boolValueOf, Boolean.TRUE) || (com.bumptech.glide.d.n(bVarB) && ((TaxNumberInputFlowContract$InputData) taxNumberInputFlow.G).f90076j)) {
                    aVar8.O2(outputData.d, u.c(outputData.f145152a));
                } else {
                    aVar8.E2(CollectTaxResidencyFlowContract$Step.SolePrompt.f90009a, true, null, false);
                }
                return Unit.f186387a;
            case 25:
                return xo8.j.a((xo8.j) obj2, null, null, false, null, null, null, null, false, false, false, false, null, (Data) obj4, (ProductAccountId) obj3, 4095);
            case 26:
                xoh.j update2 = (xoh.j) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return xoh.j.a(update2, null, null, null, r0.q(update2.d, new Pair((ScreenerAllFiltersFlowContract$Page) obj4, ((qph.n) obj3).f248412b)), false, false, LDSFile.EF_SOD_TAG);
            case 27:
                xp8.e update3 = (xp8.e) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return xp8.e.a(update3, dj0.d.c(update3.f307903a, ((xp8.l) obj4).f307913r.b(((xp8.g) ((xp8.h) obj3)).f307906a.toString(), update3.f307903a.f115083b.f306286a), null, 2), null, 2);
            case 28:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                ((com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a) obj4).N2(throwable, (Function0) obj3);
                return Boolean.TRUE;
            default:
                com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a aVar9 = (com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a) obj4;
                TaxResidencyFlowContract$Step.Fatca fatca = (TaxResidencyFlowContract$Step.Fatca) obj3;
                tpe.f output = (tpe.f) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (Intrinsics.f(output, tpe.c.f273357a)) {
                    aVar9.L2(fatca.f90301b, false);
                } else if (Intrinsics.f(output, tpe.e.f273359a)) {
                    aVar9.O2(null, u.c(com.revolut.shared.feature.workflow.engine.api.models.a.PROHIBITED_RESIDENCY_CONFIRMED), null);
                } else {
                    if (!(output instanceof tpe.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar9.I2(((tpe.d) output).f273358a);
                }
                return Unit.f186387a;
        }
    }
}

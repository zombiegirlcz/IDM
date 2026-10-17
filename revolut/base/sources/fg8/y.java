package fg8;

import a41.j1;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.TransactionsPerformanceTracker$Scenario;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteRate;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputFlowContract$State;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputScreenContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.singleselectordetails.SingleSelectorInputDetailsScreenContract$SelectedValue;
import com.revolut.feature.crypto.withdraw.api.models.SupportedSendRecipientInput;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoSendDestination;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoSendInput;
import com.revolut.feature.external_accounts.impl.mandate.limit_input.MandateLimitConfig;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.OpenBankingBrPaymentsFlowContract$Step;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionFilterValue;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionKeyFilterValue;
import com.revolut.feature.junior_graduation.api.navigation.JuniorGraduationFeatureConfig;
import com.revolut.feature.junior_graduation.impl.R$string;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestination;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestinationParcel;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsLockedProductOffer;
import com.revolut.feature.shops.impl.ui.home.ShopsCombinedHomeScreenContract$UpgradePlanRequest;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import com.revolut.retail.feature.api.trips.models.Trip;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.api.model.EsimFeaturedPhoneNumberOption;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_selection.EsimMobilePlanNumberSelectionFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$DomainState;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.EsimMobilePlanBillingScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_choose_number.EsimMobilePlanChooseNumberScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_featured_number_selection.EsimMobilePlanFeaturedNumberSelectionScreen;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.youTransactor.uCube.rpc.Constants;
import dx4.p4;
import hha.w0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lk6.n;
import nii.y0;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import rjj.e;
import tof.a3;
import vkm.j2;
import y5i.b;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f135016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f135017c;

    public /* synthetic */ y(ApmQuote apmQuote, fo1.e0 e0Var, io3.d dVar) {
        this.f135015a = 23;
        this.f135016b = apmQuote;
        this.f135017c = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v124 */
    /* JADX WARN: Type inference failed for: r0v133, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.revolut.core.ui_kit.models.TextLocalisedClause] */
    /* JADX WARN: Type inference failed for: r7v28, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.d0 d0VarM;
        Data data;
        Map mapG;
        LinkedHashMap linkedHashMap;
        Data data2;
        ph7.c collectionKey;
        ?? arrayList;
        Object next;
        h0h.a aVar;
        vel.h hVar;
        int i = this.f135015a;
        int i2 = 5;
        int i3 = 3;
        int i5 = 2;
        Pair pair = null;
        Object obj3 = this.f135017c;
        Object obj4 = this.f135016b;
        switch (i) {
            case 0:
                c0 c0Var = (c0) obj4;
                String str = (String) obj3;
                Boolean paymentLinksProductAvailable = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(paymentLinksProductAvailable, "paymentLinksProductAvailable");
                if (!paymentLinksProductAvailable.booleanValue()) {
                    return efm.d0.l(new UnsupportedOperationException(j6.a.q("Payment links product feature not available for juniorId = ", kotlin.text.f0.U0(4, str))));
                }
                Continuation continuation = null;
                pfm.h hVarN = pd.b.n(skm.p0.f264003c, new b0(c0Var, continuation, 0));
                kd8.x xVar = c0Var.f134912b;
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                efm.d0 d0VarFirstOrError = m70.a.h(zi0.c.J(rd0.e.c(vkm.q.Q(new ae8.c(bla.b.b(xVar.f182860b, "YOUTH"), 13), new a67.c(continuation, xVar, loadingStrategy, xc8.d.PAYMENT_LINKS, 26)), kotlin.coroutines.g.f186406a)), new b9d.k(i2, str, c0Var), null, new fci.e0(27), 2).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                return hVarN.f(d0VarFirstOrError);
            case 1:
                l0 l0Var = (l0) obj4;
                jf0.c cVar = (jf0.c) obj3;
                HashMap map = cVar.d;
                od0.i juniorMigrationAsset = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(juniorMigrationAsset, "juniorMigrationAsset");
                if (!juniorMigrationAsset.d()) {
                    return l0.a(cVar);
                }
                String str2 = (String) map.get("action");
                boolean zF = Intrinsics.f(str2, "confirmMigration");
                JuniorGraduationFeatureConfig.MigrationAssetDetails.Action.RejectAssetMigrationConfirmation rejectAssetMigrationConfirmation = JuniorGraduationFeatureConfig.MigrationAssetDetails.Action.RejectAssetMigrationConfirmation.f76919a;
                JuniorGraduationFeatureConfig.MigrationAssetDetails.Action.ApproveAssetMigration approveAssetMigration = JuniorGraduationFeatureConfig.MigrationAssetDetails.Action.ApproveAssetMigration.f76918a;
                JuniorGraduationFeatureConfig.MigrationAssetDetails.Action action = zF ? approveAssetMigration : Intrinsics.f(str2, "rejectMigrationConfirmation") ? rejectAssetMigrationConfirmation : null;
                String str3 = (String) map.get("source");
                jg8.a aVar2 = jg8.a.MAIN_CONTAINER;
                if (!Intrinsics.f(str3, aVar2.a())) {
                    aVar2 = jg8.a.DETAILS;
                    if (!Intrinsics.f(str3, aVar2.a())) {
                        IllegalStateException illegalStateException = new IllegalStateException("Received empty source on graduation assets migration confirmation deeplink");
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.WARNING, null, null, illegalStateException, h0Var);
                    }
                }
                int i6 = k0.f134942a[aVar2.ordinal()];
                if (i6 == 1) {
                    yg8.d dVar = l0Var.f134947c;
                    Intrinsics.h(action);
                    Intrinsics.checkNotNullParameter(action, "action");
                    if (action.equals(approveAssetMigration)) {
                        ufm.i iVar = new ufm.i(te0.w.o0(kotlin.coroutines.g.f186406a, new y7i.h(dVar.f313575a, , 13)), new ya6.f(new yed.g0(dVar, 8), 19), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        d0VarM = iVar;
                    } else {
                        if (!action.equals(rejectAssetMigrationConfirmation)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0VarM = efm.d0.m(com.revolut.retail.operation_status.modal_screen.a.a(h3l.g.Companion, new StatusViewConfiguration.Error("DIALOG_ID_ASSET_MIGRATION_CONFIRMATION_REJECTED", new TextLocalisedClause(R$string.junior_graduation_migration_asset_details_transfer_approved_rejected_title, null, null, 14), new TextLocalisedClause(R$string.junior_graduation_migration_asset_details_transfer_approved_rejected_message, null, null, 14), null, null, null, null, 8184), null, null, null, null, 510));
                        Intrinsics.checkNotNullExpressionValue(d0VarM, "just(...)");
                    }
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d0VarM = efm.d0.m(new FeatureCommand(new JuniorGraduationFeatureConfig.MigrationAssetDetails(action)));
                    Intrinsics.checkNotNullExpressionValue(d0VarM, "just(...)");
                }
                pfm.a aVar3 = new pfm.a(new ufm.i(d0VarM, new e0(i5, new g(l0Var, i5)), 1), new e0(i3, new fca.d(l0Var, 16)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                return aVar3;
            case 2:
                com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_selection.a aVar4 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_selection.a) obj4;
                EsimMobilePlanFeaturedNumberSelectionScreen esimMobilePlanFeaturedNumberSelectionScreen = (EsimMobilePlanFeaturedNumberSelectionScreen) obj3;
                dkj.j result = (dkj.j) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof dkj.i)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar4.C2(new fgj.c(esimMobilePlanFeaturedNumberSelectionScreen.K.f101219a, ((dkj.i) result).f115574a));
                return Unit.f186387a;
            case 3:
                com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_selection.a aVar5 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_selection.a) obj4;
                String str4 = aVar5.f100728p;
                EsimMobilePlanChooseNumberScreen esimMobilePlanChooseNumberScreen = (EsimMobilePlanChooseNumberScreen) obj3;
                rjj.e result2 = (rjj.e) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (Intrinsics.f(result2, e.c.f254684a)) {
                    oki.h.t2(aVar5, aVar5.f100729q, EsimMobilePlanNumberSelectionFlowContract$Step.TransferNumberToRevolut.f100727a, true, null, false, 12);
                } else if (Intrinsics.f(result2, e.b.f254683a)) {
                    aVar5.C2(new fgj.e(str4));
                } else {
                    if (!Intrinsics.f(result2, e.a.f254682a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EsimFeaturedPhoneNumberOption esimFeaturedPhoneNumberOption = esimMobilePlanChooseNumberScreen.K.f101183a.f100408b.f100406c;
                    if (esimFeaturedPhoneNumberOption != null) {
                        oki.h.t2(aVar5, aVar5.f100729q, new EsimMobilePlanNumberSelectionFlowContract$Step.FeaturedNumberSelection(str4, esimFeaturedPhoneNumberOption), true, null, false, 12);
                    } else {
                        zhm.h0 h0Var2 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "EsimMobilePlanNumberSelectionFlowModel", "Can't launch FeaturedNumberSelection featured phone number option is null", null, h0Var2);
                    }
                }
                return Unit.f186387a;
            case 4:
                p4 p4Var = (p4) obj3;
                RefinancingAccountDetailsInputFlowContract$State update = (RefinancingAccountDetailsInputFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                List list = ((RefinancingAccountDetailsInputFlowContract$State) ((j2) ((com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.b) obj4).f68277s.f22677a).getValue()).f68263a;
                ArrayList screens = new ArrayList(zhm.w.t(list, 10));
                for (Object obj5 : list) {
                    if (Intrinsics.f(((p4) obj5).f120716a, p4Var.f120716a)) {
                        obj5 = p4Var;
                    }
                    screens.add(obj5);
                }
                update.getClass();
                Intrinsics.checkNotNullParameter(screens, "screens");
                return new RefinancingAccountDetailsInputFlowContract$State(screens);
            case 5:
                com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.c cVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.c) obj4;
                RefinancingAccountDetailsInputScreenContract$ModalStep refinancingAccountDetailsInputScreenContract$ModalStep = (RefinancingAccountDetailsInputScreenContract$ModalStep) obj3;
                ai4.h result3 = (ai4.h) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 instanceof ai4.f) {
                    int i21 = jli.h.f175850a;
                } else {
                    if (!(result3 instanceof ai4.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar2.U1(new y(refinancingAccountDetailsInputScreenContract$ModalStep, result3, 6));
                }
                return Unit.f186387a;
            case 6:
                ax4.b updateConstructorState = (ax4.b) obj2;
                Intrinsics.checkNotNullParameter(updateConstructorState, "$this$updateConstructorState");
                Map map2 = updateConstructorState.e;
                String str5 = ((RefinancingAccountDetailsInputScreenContract$ModalStep.SingleBankSelector) ((RefinancingAccountDetailsInputScreenContract$ModalStep) obj4)).f68271b.f120651a;
                SingleSelectorInputDetailsScreenContract$SelectedValue singleSelectorInputDetailsScreenContract$SelectedValue = ((ai4.g) ((ai4.h) obj3)).f5186a;
                return ax4.b.a(updateConstructorState, null, null, null, null, zhm.r0.q(map2, new Pair(str5, new ax4.k(singleSelectorInputDetailsScreenContract$SelectedValue.f68377a, singleSelectorInputDetailsScreenContract$SelectedValue.f68378b))), null, null, null, null, null, null, null, null, 8175);
            case 7:
                dj0.d amount = (dj0.d) obj4;
                fh6.c cVar3 = (fh6.c) obj3;
                fh6.h update2 = (fh6.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                fh6.a aVar6 = cVar3 instanceof fh6.a ? (fh6.a) cVar3 : null;
                 = aVar6 != null ? aVar6.f135152a : 0;
                MandateLimitConfig limitConfig = update2.f135157b;
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(limitConfig, "limitConfig");
                return new fh6.h(amount, limitConfig, , cVar3 instanceof fh6.b);
            case 8:
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) obj4;
                com.revolut.feature.instruments.trend.collections.impl.ui.collection.a aVar7 = (com.revolut.feature.instruments.trend.collections.impl.ui.collection.a) obj3;
                fi7.j update3 = (fi7.j) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                InstrumentsTrendCollectionFilterValue instrumentsTrendCollectionFilterValue = (InstrumentsTrendCollectionFilterValue) linkedHashMap2.get(ph7.b.COLLECTION_KEY_FILTER);
                ph7.c collectionKey2 = instrumentsTrendCollectionFilterValue instanceof InstrumentsTrendCollectionKeyFilterValue ? ((InstrumentsTrendCollectionKeyFilterValue) instrumentsTrendCollectionFilterValue).getCollectionKey() : null;
                if (collectionKey2 == null) {
                    collectionKey2 = ((fi7.j) ((j2) aVar7.f74919y.f22677a).getValue()).d;
                }
                return fi7.j.a(update3, null, linkedHashMap2, collectionKey2, null, null, null, null, Constants.TAG_F3_BUILD_CONFIGURATION);
            case 9:
                com.revolut.feature.instruments.trend.collections.impl.ui.collection.a aVar8 = (com.revolut.feature.instruments.trend.collections.impl.ui.collection.a) obj4;
                Data data3 = (Data) obj3;
                fi7.j jVar = (fi7.j) obj2;
                boolean z = aVar8.f226127l;
                cli.y yVar = aVar8.f74919y;
                if (!z) {
                    try {
                        Object content = data3.getContent();
                        if (content != null) {
                            Map map3 = (Map) content;
                            linkedHashMap = new LinkedHashMap(zhm.q0.b(map3.size()));
                            for (Object obj6 : map3.entrySet()) {
                                linkedHashMap.put(((ph7.a) ((Map.Entry) obj6).getKey()).f236231a, ((Map.Entry) obj6).getValue());
                            }
                        } else {
                            linkedHashMap = null;
                        }
                        data = new Data(linkedHashMap, data3.getError(), data3.getLoading());
                    } catch (Throwable th10) {
                        data = new Data(null, th10, data3.getLoading());
                    }
                    mapG = (Map) data.getContent();
                    if (mapG == null) {
                        mapG = zhm.r0.g();
                    }
                    break;
                } else {
                    mapG = ((fi7.j) ((j2) yVar.f22677a).getValue()).f135325c;
                }
                Map map4 = mapG;
                aVar8.z.setValue(map4);
                try {
                    Object content2 = data3.getContent();
                    data2 = new Data(content2 != null ? zhm.d0.d1(((Map) content2).keySet()) : null, data3.getError(), data3.getLoading());
                    break;
                } catch (Throwable th11) {
                    data2 = new Data(null, th11, data3.getLoading());
                }
                Data data4 = data2;
                ph7.c cVar4 = ((fi7.j) ((j2) yVar.f22677a).getValue()).d;
                if (cVar4 == null) {
                    InstrumentsTrendCollectionFilterValue instrumentsTrendCollectionFilterValue2 = (InstrumentsTrendCollectionFilterValue) map4.get(ph7.b.COLLECTION_KEY_FILTER);
                    collectionKey = instrumentsTrendCollectionFilterValue2 instanceof InstrumentsTrendCollectionKeyFilterValue ? ((InstrumentsTrendCollectionKeyFilterValue) instrumentsTrendCollectionFilterValue2).getCollectionKey() : null;
                } else {
                    collectionKey = cVar4;
                }
                return fi7.j.a(jVar, data4, map4, collectionKey, null, null, null, null, Constants.TAG_TRANSACTION_DATA);
            case 10:
                fif.m mVar = (fif.m) obj4;
                fif.a aVar9 = (fif.a) obj3;
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                efm.r rVarC = ((tif.q) mVar.f135410a).c(aVar9.f135388a, aVar9.f135389b, aVar9.a(), aVar9.d, aVar9.e);
                if (aVar9.a() == 6) {
                    TransactionsPerformanceTracker$Scenario transactionsPerformanceTracker$Scenario = TransactionsPerformanceTracker$Scenario.HOME_DB;
                    oi0.d.e0(rVarC, transactionsPerformanceTracker$Scenario.getTraceName());
                    rVarC = nz8.d.o(rVarC, transactionsPerformanceTracker$Scenario, mVar.f135413g);
                }
                return rVarC.toFlowable(efm.a.BUFFER);
            case 11:
                EsimGetPlanScreenContract$DomainState update4 = (EsimGetPlanScreenContract$DomainState) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return EsimGetPlanScreenContract$DomainState.a(update4, null, zhm.r0.q(update4.f100987b, new Pair((fij.o) obj4, (EsimDataPlan) obj3)), null, null, null, null, null, ISO781611.SMT_TAG);
            case 12:
                com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f fVar = (com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f) obj4;
                dii.g output = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                EsimDataPlan esimDataPlan = ((EsimGetPlanScreenContract$ModalStep.AbroadWarning) ((EsimGetPlanScreenContract$ModalStep) obj3)).f100996a;
                if (output instanceof dii.e) {
                    fVar.J2(esimDataPlan);
                } else {
                    fVar.getClass();
                    if (!(output instanceof dii.f) && !(output instanceof dii.b) && !(output instanceof dii.d) && !(output instanceof dii.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f186387a;
            case 13:
                Data data5 = (Data) obj3;
                EsimGetPlanScreenContract$DomainState esimGetPlanScreenContract$DomainState = (EsimGetPlanScreenContract$DomainState) obj2;
                return EsimGetPlanScreenContract$DomainState.a(esimGetPlanScreenContract$DomainState, com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f.S2((com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f) obj4, esimGetPlanScreenContract$DomainState, data5, null, 2), null, null, null, data5, null, null, LDSFile.EF_DG14_TAG);
            case 14:
                fjd.o update5 = (fjd.o) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                ShopsLockedProductOffer shopsLockedProductOffer = (ShopsLockedProductOffer) ((ShopsContext) obj4);
                return fjd.o.a(update5, null, null, null, null, null, null, null, null, null, false, new ShopsCombinedHomeScreenContract$UpgradePlanRequest(shopsLockedProductOffer.f87053a, shopsLockedProductOffer.f87054b, (w0) obj3), null, null, 0L, 15359);
            case 15:
                com.revolut.feature.shops.impl.ui.home.a aVar10 = (com.revolut.feature.shops.impl.ui.home.a) obj4;
                w0 w0Var = (w0) obj3;
                dii.g it9 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                List list2 = (List) ((fjd.o) ((j2) aVar10.Q.f22677a).getValue()).f135586l.getContent();
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj7 : list2) {
                        if (hha.s.f((hha.d) obj7).compareTo(w0Var) >= 0) {
                            arrayList2.add(obj7);
                        }
                    }
                    arrayList = new ArrayList(zhm.w.t(arrayList2, 10));
                    Iterator it10 = arrayList2.iterator();
                    while (it10.hasNext()) {
                        arrayList.add(((hha.d) it10.next()).f152287a);
                    }
                } else {
                    arrayList = zhm.f0.f322471a;
                }
                ?? r4 = arrayList;
                if (!((Collection) r4).isEmpty()) {
                    aVar10.C1(u0.c(new PricingPlanFeatureConfig.DashboardByPlans(null, r4, (String) zhm.d0.d0(r4), null, false, xfa.b.REV_POINTS, 185)));
                }
                return Unit.f186387a;
            case 16:
                String pocketId = (String) obj3;
                u6c.j0 wrappedMethods = (u6c.j0) obj2;
                Intrinsics.checkNotNullParameter(wrappedMethods, "methods");
                ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a) obj4).f101098p.getClass();
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                Intrinsics.checkNotNullParameter(wrappedMethods, "wrappedMethods");
                String str6 = wrappedMethods.f277566b;
                String str7 = wrappedMethods.f277567c;
                if (str6 == null) {
                    throw new IllegalStateException("Default payment method id is null");
                }
                Iterator it11 = wrappedMethods.f277565a.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        next = it11.next();
                        if (Intrinsics.f(((PaymentMethod) next).getF84393a(), str6)) {
                        }
                    } else {
                        next = null;
                    }
                }
                PaymentMethod.RevolutAccount revolutAccount = (PaymentMethod.RevolutAccount) (next instanceof PaymentMethod.RevolutAccount ? next : null);
                if (revolutAccount == null) {
                    throw new IllegalStateException("Default payment method is not a Revolut Account, payment method id: ".concat(str6).toString());
                }
                PaymentMethod.Pocket pocketA = hjj.e.a(revolutAccount, pocketId);
                if (pocketA != null || (pocketA = hjj.e.a(revolutAccount, str7)) != null) {
                    return pocketA;
                }
                throw new IllegalStateException(("Can not find selected and default pockets. Selected pocket id: " + pocketId + ", default pocket id: " + str7).toString());
            case 17:
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a aVar11 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a) obj4;
                EsimMobilePlanBillingScreenContract$ModalStep esimMobilePlanBillingScreenContract$ModalStep = (EsimMobilePlanBillingScreenContract$ModalStep) obj3;
                dii.g output2 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (Intrinsics.f(output2, dii.e.f115068a)) {
                    aVar11.J2(((EsimMobilePlanBillingScreenContract$ModalStep.CancellationConfirmation) esimMobilePlanBillingScreenContract$ModalStep).f101094a);
                }
                return Unit.f186387a;
            case 18:
                com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d dVar2 = (com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d) obj4;
                yki.l lVar = (yki.l) obj3;
                lk6.n result4 = (lk6.n) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                int i22 = 26;
                if (result4 instanceof lk6.m) {
                    lk6.m mVar2 = (lk6.m) result4;
                    dVar2.l2(new j1(dVar2, mVar2.f196252a, mVar2.f196254c, mVar2.d, mVar2.e, mVar2.f196253b, (Continuation) null, 4), new yi5.b(i22));
                } else {
                    Continuation continuation2 = null;
                    if (result4 instanceof lk6.o) {
                        lk6.o oVar = (lk6.o) result4;
                        dVar2.l2(new etj.l(dVar2, oVar.f196257a, oVar.f196258b, continuation2, 20), new yi5.b(i22));
                    } else if (Intrinsics.f(result4, n.b.f196256a)) {
                        yji.l.a1(dVar2, dVar2.X1(new y0(null, new nii.z(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.oba_authorize_accounts_general_error_title, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 5)), null, null, new ff4.z(dVar2, continuation2, 11), 3);
                    } else if (result4 instanceof lk6.p) {
                        lk6.p pVar = (lk6.p) result4;
                        yji.l.a1(dVar2, dVar2.X1(new y0(null, new nii.z(pVar.f196259a, pVar.f196260b, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5)), null, null, new fk6.d(result4, dVar2, lVar, null), 3);
                    } else if (Intrinsics.f(result4, n.a.f196255a)) {
                        oki.h.w2(lVar, OpenBankingBrPaymentsFlowContract$Step.PaymentNotificationsInfo.f72700a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    } else if (result4 instanceof lk6.l) {
                        lk6.l lVar2 = (lk6.l) result4;
                        oki.h.t2(dVar2, dVar2.f72712t, new OpenBankingBrPaymentsFlowContract$Step.LimitUpdate(lVar2.f196249a, lVar2.f196250b, lVar2.f196251c), true, null, false, 12);
                    } else {
                        if (!(result4 instanceof lk6.k)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lk6.k kVar = (lk6.k) result4;
                        oki.h.t2(dVar2, dVar2.f72712t, new OpenBankingBrPaymentsFlowContract$Step.ExpiryDateUpdate(kVar.f196247a, kVar.f196248b), true, null, false, 12);
                    }
                }
                return Unit.f186387a;
            case 19:
                flf.t tVar = (flf.t) obj4;
                a3 a3Var = (a3) obj3;
                y5i.b result5 = (y5i.b) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                if (result5 instanceof b.a) {
                    tVar.T2(new fjd.g0(tVar, a3Var, , i3), new yi5.b(27));
                }
                return Unit.f186387a;
            case 20:
                SavingsProductData savingsProductData = (SavingsProductData) obj4;
                List list3 = (List) obj3;
                List plans = (List) obj2;
                Intrinsics.checkNotNullParameter(plans, "plans");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj8 : plans) {
                    hha.d dVar3 = (hha.d) obj8;
                    if (!Intrinsics.f(savingsProductData.f86683a.i, dVar3.f152287a)) {
                        List list4 = list3;
                        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                            Iterator it12 = list4.iterator();
                            while (true) {
                                if (!it12.hasNext()) {
                                }
                                if (Intrinsics.f(((SavingsProductData) it12.next()).f86683a.i, dVar3.f152287a)) {
                                    arrayList3.add(obj8);
                                }
                                break;
                            }
                        }
                    }
                }
                Iterator it13 = zhm.d0.P0(arrayList3, new fmb.u0()).iterator();
                while (true) {
                    if (it13.hasNext()) {
                        hha.d dVar4 = (hha.d) it13.next();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj9 : list3) {
                            if (Intrinsics.f(((SavingsProductData) obj9).f86683a.i, dVar4.f152287a)) {
                                arrayList4.add(obj9);
                            }
                        }
                        SavingsProductData savingsProductDataC = opg.a.c(arrayList4);
                        Pair pair2 = savingsProductDataC != null ? new Pair(dVar4, savingsProductDataC) : null;
                        if (pair2 != null) {
                            pair = pair2;
                        }
                    }
                }
                if (pair == null) {
                    throw new IllegalStateException("Unexpected state productToUpsell is null");
                }
                hha.d dVar5 = (hha.d) pair.f186385a;
                SavingsProductData savingsProductData2 = (SavingsProductData) pair.f186386b;
                od0.h hVar2 = od0.i.Companion;
                fmb.h0 h0Var3 = new fmb.h0(savingsProductData2, dVar5, arrayList3);
                hVar2.getClass();
                return od0.h.a(h0Var3);
            case 21:
                fna.h hVar3 = (fna.h) obj4;
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                boolean zBooleanValue = ((Boolean) pair3.f186385a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) pair3.f186386b).booleanValue();
                boolean zA = hVar3.f136583n.a("STATEMENTS.statement_of_fees");
                y91.b bVar = hVar3.f136583n;
                return new fna.a((AccountId) obj3, bVar.a("STATEMENTS.rib_statement"), zA, zBooleanValue, zBooleanValue2, bVar.a("STATEMENTS.contract_summary"), bVar.a("STATEMENTS.account_confirmation"), bVar.a("STATEMENTS.account_statement"), bVar.a("STATEMENTS.annual_fee_statement"));
            case 22:
                fo1.e0 e0Var = (fo1.e0) obj4;
                fo1.g update6 = (fo1.g) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                w80.b bVar2 = e0Var.f136746t;
                cli.y yVar2 = e0Var.B;
                return fo1.g.a(update6, null, null, null, new dj0.d(bVar2.b((String) obj3, ((fo1.g) ((j2) yVar2.f22677a).getValue()).d.f115083b.f306286a), ((fo1.g) ((j2) yVar2.f22677a).getValue()).d.f115083b), null, null, null, 503);
            case 23:
                ApmQuote apmQuote = (ApmQuote) obj4;
                io3.d dVar6 = (io3.d) obj3;
                fo1.g gVar = (fo1.g) obj2;
                ApmQuoteRate apmQuoteRate = apmQuote.f62209a;
                double d = apmQuoteRate != null ? apmQuoteRate.f62228a : 1.0d;
                String str8 = dVar6.f163147c;
                xi0.b.Companion.getClass();
                return fo1.g.a(gVar, null, null, null, null, null, apmQuote, Intrinsics.f(str8, xi0.b.f306276m.f306286a) ? z92.f.j(dVar6) : new dj0.d((long) (z92.f.j(dVar6).f115082a * d), xi0.a.a(dVar6.f163147c)), CertificateBody.profileType);
            case 24:
                PaymentCounterpartyInfo paymentCounterpartyInfo = (PaymentCounterpartyInfo) obj4;
                com.revolut.feature.payment.counterparty.impl.screen.profile.a aVar12 = (com.revolut.feature.payment.counterparty.impl.screen.profile.a) obj3;
                gpf.a output3 = (gpf.a) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (!Intrinsics.f(output3.f145449a, paymentCounterpartyInfo.d)) {
                    aVar12.n2(new etj.l(aVar12, paymentCounterpartyInfo, output3, null, 24), new whi.b(6));
                }
                return Unit.f186387a;
            case 25:
                fod.k kVar2 = (fod.k) obj4;
                Trip trip = (Trip) obj3;
                fod.a dependencies = (fod.a) obj2;
                Intrinsics.checkNotNullParameter(dependencies, "dependencies");
                AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$IntervalC = kVar2.c(trip);
                return analyticsSpendingPeriod$IntervalC == null ? new go.g(new Data(null, new IllegalArgumentException("Trip has no start date"), false, 5, null), 2) : new ahe.m0(kVar2.d(null, dependencies, zhm.u.c(analyticsSpendingPeriod$IntervalC), zhm.u.c(analyticsSpendingPeriod$IntervalC), zhm.q0.c(new Pair(analyticsSpendingPeriod$IntervalC, kVar2.b(trip))), amd.i.CATEGORIES), i3);
            case 26:
                fod.k kVar3 = (fod.k) obj3;
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                do3.n nVar = (do3.n) rVar.f314201a;
                xi0.b bVar3 = (xi0.b) rVar.f314202b;
                boolean zBooleanValue3 = ((Boolean) rVar.f314203c).booleanValue();
                List list5 = (List) obj4;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
                Iterator it14 = list5.iterator();
                while (it14.hasNext()) {
                    arrayList5.add(new Pair(bVar3, ((Trip) it14.next()).getCurrency()));
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj10 : arrayList5) {
                    Pair pair4 = (Pair) obj10;
                    if (!Intrinsics.f(pair4.f186385a, pair4.f186386b)) {
                        arrayList6.add(obj10);
                    }
                }
                List listU = zhm.d0.U(arrayList6);
                return nim.a.v(c8g.a.D(rd0.e.b(kVar3.f.b(listU, false))), new ard.t(nVar, bVar3, zBooleanValue3, listU, 8));
            case 27:
                xzg.l0 l0Var2 = (xzg.l0) obj3;
                List entries = (List) obj2;
                Intrinsics.checkNotNullParameter(entries, "entries");
                e9h.d dVar7 = (e9h.d) ((twg.c) obj4).f275018b;
                List<xzg.k0> list6 = entries;
                ArrayList arrayList7 = new ArrayList(zhm.w.t(list6, 10));
                for (xzg.k0 k0Var : list6) {
                    String str9 = k0Var.f310003a;
                    int i32 = foh.b.f136958c[k0Var.f310004b.ordinal()];
                    if (i32 == 1) {
                        hVar = vel.h.STOCK;
                    } else {
                        if (i32 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hVar = vel.h.CURRENCY;
                    }
                    arrayList7.add(new vel.g(str9, hVar, k0Var.f310005c, k0Var.d));
                }
                int i33 = foh.b.f136957b[l0Var2.ordinal()];
                if (i33 == 1) {
                    aVar = h0h.a.ONE_DAY;
                } else if (i33 == 2) {
                    aVar = h0h.a.ONE_WEEK;
                } else if (i33 == 3) {
                    aVar = h0h.a.ONE_MONTH;
                } else if (i33 == 4) {
                    aVar = h0h.a.ONE_YEAR;
                } else {
                    if (i33 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = h0h.a.FIVE_YEARS;
                }
                return h0h.b.a(dVar7, arrayList7, aVar, null, false, 12);
            case 28:
                return foh.p.a((foh.p) obj2, null, (xzg.l0) obj4, (xzg.n0) obj3, null, null, 51);
            default:
                xi0.b bVar4 = (xi0.b) obj4;
                SupportedSendRecipientInput supportedSendRecipientInput = (SupportedSendRecipientInput) obj3;
                Pair pair5 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair5, "<destruct>");
                boolean z3 = ((Boolean) pair5.f186385a).booleanValue() && (bVar4 == null || ((List) pair5.f186386b).contains(bVar4));
                boolean z4 = (supportedSendRecipientInput instanceof SupportedSendRecipientInput.Custom) && ((SupportedSendRecipientInput.Custom) supportedSendRecipientInput).f71114a.contains(ko5.p.BANK_BENEFICIARY);
                if (z3 || z4) {
                    return new CryptoSendDestination(new CryptoSendInput.SendCrypto(bVar4, supportedSendRecipientInput));
                }
                return new TransferDestination.NewTransfer(zhm.y0.b(WhoToTransferFilter.Revolut.f80005a), bVar4 != null ? new TransferDestinationParcel(new TransferMoneyPocket(new dj0.d(0L, bVar4), null, 2)) : null, g3a.e.CRYPTO_SEND);
        }
    }

    public /* synthetic */ y(Object obj2, Object obj3, int i) {
        this.f135015a = i;
        this.f135016b = obj2;
        this.f135017c = obj3;
    }
}

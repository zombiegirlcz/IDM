package wdb;

import bij.e;
import com.revolut.data.model.Data;
import com.revolut.feature.esim.instructions.domain.EsimInstructionType;
import com.revolut.feature.external_accounts.api.model.consent.ConsentExpiration;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.pay_bills_taxes.impl.ui.errors.FormServerError;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlow;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$LaunchMode;
import com.revolut.feature.tab.crypto.impl.ui.settings.models.CryptoSpareChangeInfo;
import com.revolut.feature.transaction.recogniser.api.domain.models.Location;
import com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.esim.impl.ui.flows.help.EsimHelpFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.help.EsimHelpFlowContract$Step;
import com.revolut.retail.feature.limits.api.LimitsApi$Toggles$MexicoHideAtmLimits;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.e;
import com.youTransactor.uCube.rpc.Constants;
import hha.w0;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mhd.q;
import qc0.e1;
import skm.p0;
import wf0.m0;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f296512b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f296511a = i;
        this.f296512b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Flow flowB;
        int i = this.f296511a;
        int i2 = 11;
        int i3 = 6;
        char c2 = 1;
        int i5 = 0;
        Continuation continuation = null;
        int i6 = 2;
        Object obj3 = this.f296512b;
        switch (i) {
            case 0:
                LocalDateTime it8 = (LocalDateTime) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8.compareTo((ChronoLocalDateTime<?>) obj3) < 0);
            case 1:
                return new xdb.r((Reservation) obj3, (xdb.v) obj2);
            case 2:
                com.revolut.feature.support.impl.transfer_tracker.ui.a aVar = (com.revolut.feature.support.impl.transfer_tracker.ui.a) obj3;
                fee.g outputData = (fee.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (!(outputData instanceof fee.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.C1(new TransactionDetailsDestination(ofm.q.P(((fee.f) outputData).f134593a), (rhf.d) null, 6));
                return Unit.f186387a;
            case 3:
                wed.l updateState = (wed.l) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return wed.l.a(updateState, null, null, (mgd.d) obj3, null, null, null, false, null, 503);
            case 4:
                Intrinsics.checkNotNullParameter((wef.e) obj2, "$this$updateState");
                return ((wef.l) obj3).u;
            case 5:
                return wef.e.a((wef.e) obj2, null, (Location) obj3, 1);
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ((pag.b) ((weg.p) obj3).f296790b).a();
            case 7:
                wf0.c cVar = (wf0.c) obj2;
                Intrinsics.checkNotNullParameter(cVar, "<destruct>");
                String str = cVar.f296870a;
                String str2 = cVar.f296871b;
                return (jg0.a) ((wf0.f) obj3).f296881b.get(str + "_" + str2);
            case 8:
                List actions = (List) obj2;
                Intrinsics.checkNotNullParameter(actions, "actions");
                boolean zC = ((jte.d) ((m0) obj3).f296905b.f290872b).c(LimitsApi$Toggles$MexicoHideAtmLimits.f101774c);
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : actions) {
                    cj0.a aVar2 = (cj0.a) obj4;
                    if (!zC || !Intrinsics.f(aVar2.f24568b, "revolut://app/account-limits/atm")) {
                        arrayList.add(obj4);
                    }
                }
                return arrayList;
            case 9:
                NaviCommand naviCommand = (NaviCommand) obj2;
                sri.m mVar = ((wf6.j) obj3).f296991a;
                Intrinsics.h(naviCommand);
                mVar.c(naviCommand);
                return Unit.f186387a;
            case 10:
                ((wf6.s) obj3).f297009a.c(((MainContainerScreenDestination) obj2).getF83419c());
                return Unit.f186387a;
            case 11:
                com.revolut.feature.shared_separate_favourites.combined_watchlist.flow.a aVar3 = (com.revolut.feature.shared_separate_favourites.combined_watchlist.flow.a) obj3;
                mhd.q result = (mhd.q) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!Intrinsics.f(result, q.a.f205525a)) {
                    throw new NoWhenBranchMatchedException();
                }
                yji.l.j2(aVar3, new WatchlistAddAssetFlow(new WatchlistAddAssetFlowContract$InputData(aVar3.o.f86797a, (WatchlistAddAssetFlowContract$LaunchMode) null, 6)), ModalDestination.Style.FULLSCREEN_FADE.f98307a, null, 2);
                return Unit.f186387a;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ((wff.t) obj3).f297103a.f112219a.b();
            case 13:
                return wff.m.a((wff.m) obj2, (qv0.i) obj3, null, 11);
            case 14:
                wfh.l update = (wfh.l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return wfh.l.e(update, null, null, null, null, (wfh.j) obj3, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097119);
            case 15:
                com.revolut.retail.feature.esim.impl.ui.flows.help.a aVar4 = (com.revolut.retail.feature.esim.impl.ui.flows.help.a) obj3;
                yki.a aVar5 = aVar4.f100643q;
                EsimHelpFlowContract$InputData esimHelpFlowContract$InputData = aVar4.o;
                bij.e output = (bij.e) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z = output instanceof e.a;
                ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                if (z) {
                    EsimInstructionType.INSTANCE.getClass();
                    oki.h.w2(aVar5, new EsimHelpFlowContract$Step.Instructions("ACTIVATION", esimHelpFlowContract$InputData.f100636a), popup);
                } else if (output instanceof e.d) {
                    EsimInstructionType.INSTANCE.getClass();
                    oki.h.w2(aVar5, new EsimHelpFlowContract$Step.Instructions("INSTALLATION", esimHelpFlowContract$InputData.f100636a), popup);
                } else if (output instanceof e.b) {
                    oki.h.t2(aVar4, aVar4.f100643q, new EsimHelpFlowContract$Step.ConnectivityTroubleshooting(((e.b) output).f15512a), false, null, false, 14);
                } else if (output instanceof e.c) {
                    od0.a aVar6 = od0.a.f224253a;
                    aVar4.C1(u0.c(new FaqFeatureConfig.Starter(od0.a.g() ? "5ab4008f-fb81-47de-a2ee-1440b3c5006e" : "topic.esim-dataplans", 2)));
                } else if (output instanceof e.C0100e) {
                    aVar4.C2(wfj.c.f297153a);
                } else {
                    if (!(output instanceof e.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.t2(aVar4, aVar4.f100643q, EsimHelpFlowContract$Step.Terms.f100641a, false, null, false, 14);
                }
                return Unit.f186387a;
            case 16:
                Intrinsics.checkNotNullParameter((aii.q) obj2, "it");
                oki.h.D2(((com.revolut.feature.crypto.gift.asset.impl.ui.flow.a) obj3).o);
                return Unit.f186387a;
            case 17:
                wg9.k update2 = (wg9.k) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return wg9.k.a(update2, null, null, null, null, (FormServerError) obj3, 63);
            case 18:
                com.revolut.feature.retail.salary_account.impl.salary_promotion.b bVar = (com.revolut.feature.retail.salary_account.impl.salary_promotion.b) obj3;
                yja.b outputData2 = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                int i21 = wgb.p.f297290a[outputData2.ordinal()];
                if (i21 == 1) {
                    bVar.v.k(Boolean.TRUE);
                } else {
                    if (i21 != 2 && i21 != 3 && i21 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.C2(wgb.j.f297281a);
                }
                return Unit.f186387a;
            case 19:
                fha.a event = (fha.a) obj2;
                Intrinsics.checkNotNullParameter(event, "event");
                igc.a aVar7 = ((wgc.c) obj3).f297304a;
                String planId = event.f135191b.f152287a;
                Intrinsics.checkNotNullParameter(planId, "planId");
                return pd.b.n(p0.f264003c, new e1((qhc.b) aVar7, planId, continuation, i2));
            case 20:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.d dVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.d) obj3;
                if (((Throwable) obj2) != null) {
                    oki.h.D2(dVar.f103006t);
                }
                return Unit.f186387a;
            case 21:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.f fVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.f) obj3;
                lha.n it9 = (lha.n) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (it9.f195220a == lha.m.ELIGIBLE) {
                    return new go.g(zi0.c.P(e.a.f103007a, false, null, 3), 2);
                }
                w0 w0Var = it9.f195222c;
                if (w0Var != null) {
                    return nim.a.v(nim.a.v(rd0.e.b(fVar.f103009a.o()), new cjk.h(w0Var, c2 == true ? 1 : 0)), new wgk.f(i5));
                }
                fVar.getClass();
                return new go.g(zi0.c.P(e.b.f103008a, false, null, 3), 2);
            case 22:
                com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.a aVar8 = (com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.a) obj3;
                v35.b result2 = (v35.b) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar8.H2(aVar8.f68361q, new wh4.v(result2, i5));
                return Unit.f186387a;
            case 23:
                kf8.h details = (kf8.h) obj2;
                Intrinsics.checkNotNullParameter(details, "details");
                return te0.w.o0(p0.f264003c, new wgb.v((wh8.b) obj3, details, continuation, i6));
            case 24:
                return wi6.h.a((wi6.h) obj2, null, null, null, null, null, null, (ConsentExpiration) obj3, null, null, null, null, null, 4031);
            case 25:
                wik.e eVar = (wik.e) obj3;
                PricingPlanSubscription subscription = (PricingPlanSubscription) obj2;
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                gte.a aVar9 = eVar.f297913c;
                PricingPlansUiApi$Toggles.FamilyPlansRedesignBillingCycleExtras familyPlansRedesignBillingCycleExtras = PricingPlansUiApi$Toggles.FamilyPlansRedesignBillingCycleExtras.f102630c;
                jte.d dVar2 = (jte.d) aVar9;
                hha.i billingCode = dVar2.c(familyPlansRedesignBillingCycleExtras) ? subscription.f81144x : hha.i.MONTHLY;
                String planId2 = subscription.f81129a.f152287a;
                cha.b bVar2 = eVar.f297911a;
                boolean zC2 = dVar2.c(familyPlansRedesignBillingCycleExtras);
                w4l.h loadingStrategy = w4l.h.f294642c;
                if (!zC2) {
                    if (zC2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Intrinsics.checkNotNullParameter(planId2, "planId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    pfk.s sVar = (pfk.s) ((ffk.h) bVar2).f134833b;
                    sVar.getClass();
                    Intrinsics.checkNotNullParameter(planId2, "planId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    flowB = sVar.f235689h.b(planId2, loadingStrategy);
                } else if (billingCode == null) {
                    flowB = new go.g(new Data(null, new IllegalStateException("observeFamilyPlanSubscribeInfo - billing code is null"), false, 5, null), 2);
                } else {
                    Intrinsics.checkNotNullParameter(planId2, "planId");
                    Intrinsics.checkNotNullParameter(billingCode, "billingCode");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    pfk.s sVar2 = (pfk.s) ((ffk.h) bVar2).f134833b;
                    sVar2.getClass();
                    Intrinsics.checkNotNullParameter(planId2, "planId");
                    Intrinsics.checkNotNullParameter(billingCode, "billingCode");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    flowB = sVar2.i.b(new pfk.k(planId2, billingCode), loadingStrategy);
                }
                return nim.a.v(flowB, new wg2.g(subscription, billingCode, i3));
            case 26:
                List cardsToTerminate = (List) obj2;
                Intrinsics.checkNotNullParameter(cardsToTerminate, "cardsToTerminate");
                return nim.a.w(l93.f.d((l93.f) ((utk.f) obj3).f283123c, b93.d.RETAIL, false, 6), new v77.a(cardsToTerminate, i2));
            case 27:
                wjd.i update3 = (wjd.i) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return wjd.i.a(update3, false, null, new Data((rl0.d) obj3, null, false, 6, null), null, 11);
            case 28:
                wje.g update4 = (wje.g) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return wje.g.a(update4, null, (CryptoSpareChangeInfo) obj3, false, null, null, false, false, false, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
            default:
                wk2.k update5 = (wk2.k) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return wk2.k.a(update5, false, null, false, false, false, 0, 0, 0, false, null, null, ((wk2.q) ((wk2.v) obj3)).f298219a, null, null, 14335);
        }
    }
}

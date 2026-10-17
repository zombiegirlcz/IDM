package a07;

import a9j.u;
import ahe.i1;
import ahe.k1;
import akf.x;
import akj.c;
import akk.j;
import aw0.n6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.accessibility_settings.impl.ui.screen.accessibility_settings.AccessibilitySettingsController;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.receipt.ReceiptScreen;
import com.revolut.feature.add.new_product.impl.ui.add_new_product_group.AddNewProductGroupScreen;
import com.revolut.feature.card_screen.impl.kompot.cards_list.screen.CardListScreen;
import com.revolut.feature.credit.health.impl.ui.insights.InsightsScreen;
import com.revolut.feature.crypto.asset.details.impl.dialog.unstaking_period_disclaimer.UnstakingPeriodDisclaimerDialogController;
import com.revolut.feature.defi.accounts.impl.ui.portfolio.DeFiPortfolioScreen;
import com.revolut.feature.freelancer.impl.ui.profile.account.FreelancerAccountScreen;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplitSource;
import com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.screen.DepositAssetsScreen;
import com.revolut.feature.settings.preview.transactionsCount.TransactionsCountPreviewController;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.feature.transaction_list.impl.ui.scheduled_payments.ScheduledPaymentsScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.see_all.TravelMilesAirlineSeeAllScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fees_info.FundFeesInfoScreen;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.thresholds_breakdown.RevPointsPocketThresholdsBreakdownScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.EsimMobilePlanEsimMigrationScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.existing_preorder_warning.ExistingPreorderWarningFlow;
import ip0.um0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jz8.v0;
import jz8.w0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.SerializationException;
import nii.n1;
import u09.v;
import wim.z;
import zhm.h0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d((FreelancerAccountScreen) this.v, continuation, 0);
            case 1:
                return new d((a09.q) this.v, continuation, 1);
            case 2:
                return new d((InsightsScreen) this.v, continuation, 2);
            case 3:
                return new d((a1a.d) this.v, continuation, 3);
            case 4:
                return new d((DeFiPortfolioScreen) this.v, continuation, 4);
            case 5:
                return new d((a2g.r) this.v, continuation, 5);
            case 6:
                return new d((TransactionsCountPreviewController) this.v, continuation, 6);
            case 7:
                return new d((a5h.f) this.v, continuation, 7);
            case 8:
                return new d((a6e.s) this.v, continuation, 8);
            case 9:
                return new d((a72.m) this.v, continuation, 9);
            case 10:
                return new d((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c) this.v, continuation, 10);
            case 11:
                return new d((CardListScreen) this.v, continuation, 11);
            case 12:
                return new d((a84.e) this.v, continuation, 12);
            case 13:
                return new d((AccessibilitySettingsController) this.v, continuation, 13);
            case 14:
                return new d((u) this.v, continuation, 14);
            case 15:
                return new d((com.revolut.feature_retail_user_declarations.email.verification_screen.a) this.v, continuation, 15);
            case 16:
                return new d((com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b) this.v, continuation, 16);
            case 17:
                return new d((UnstakingPeriodDisclaimerDialogController) this.v, continuation, 17);
            case 18:
                return new d((DepositAssetsScreen) this.v, continuation, 18);
            case 19:
                return new d((RevPointsPocketThresholdsBreakdownScreen) this.v, continuation, 19);
            case 20:
                return new d((ReceiptScreen) this.v, continuation, 20);
            case 21:
                return new d((AddNewProductGroupScreen) this.v, continuation, 21);
            case 22:
                return new d((FundFeesInfoScreen) this.v, continuation, 22);
            case 23:
                return new d((k1) this.v, continuation, 23);
            case 24:
                return new d((ScheduledPaymentsScreen) this.v, continuation, 24);
            case 25:
                return new d((TravelMilesAirlineSeeAllScreen) this.v, continuation, 25);
            case 26:
                return new d((ajh.l) this.v, continuation, 26);
            case 27:
                return new d((x) this.v, continuation, 27);
            case 28:
                return new d((EsimMobilePlanEsimMigrationScreen) this.v, continuation, 28);
            default:
                return new d((ExistingPreorderWarningFlow) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((d) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((d) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return ((d) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((rp0.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v53, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v58, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v64, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v69, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v78, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v86, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v91, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 1;
        ArrayList arrayList = null;
        Object[] objArr = 0;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((r) ((j) ((FreelancerAccountScreen) obj3).P.getValue())).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w0 w0Var = (w0) ((a09.q) obj3).f279c.T2("KEY_DOMAIN_TABS", w0.class);
                if (w0Var != null) {
                    Intrinsics.checkNotNullParameter(w0Var, "<this>");
                    List productDomainTabs = w0Var.getProductDomainTabs();
                    arrayList = new ArrayList(w.t(productDomainTabs, 10));
                    Iterator it8 = productDomainTabs.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(new u09.w(v.valueOf(((v0) it8.next()).getDomainName())));
                    }
                }
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((InsightsScreen) obj3).d3().B2();
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List<c1a.a> listC = ((a1a.d) obj3).f578c.c();
                ArrayList arrayList2 = new ArrayList(w.t(listC, 10));
                for (c1a.a aVar5 : listC) {
                    Intrinsics.checkNotNullParameter(aVar5, "<this>");
                    String str = aVar5.f20427a;
                    c1a.b bVar = aVar5.f20428b;
                    arrayList2.add(new RecurringSplit(str, new RecurringSplitSource(a2a.g.valueOf(bVar.f20431a), bVar.f20432b), a2a.e.valueOf(aVar5.f20429c), aVar5.d, aVar5.e, aVar5.f, aVar5.f20430g));
                }
                break;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a26.k kVar = (a26.k) ((a26.d) ((DeFiPortfolioScreen) obj3).T.getValue());
                kVar.getClass();
                kVar.n2(new a26.h(kVar, objArr == true ? 1 : 0, i2), new whi.b(6));
                break;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a2g.r rVar = (a2g.r) obj3;
                rVar.x2(new a2g.p(((c1g.m) rVar.f854r).a(), i2));
                break;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((TransactionsCountPreviewController) obj3).m2().onBackPressed();
                break;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a5h.f fVar = (a5h.f) obj3;
                fVar.X2(fVar.f1404r, new a26.p(fVar, i2));
                break;
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j60.a.v(((a6e.s) obj3).f1646m, false, null, 3);
                break;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List listB = ((a72.m) obj3).f1763b.b();
                ArrayList arrayList3 = new ArrayList(w.t(listB, 10));
                Iterator it9 = listB.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(gc0.c.t((c72.a) it9.next()));
                }
                break;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.c) obj3).B2();
                break;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((CardListScreen) obj3).m2().onBackPressed();
                break;
            case 12:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((a84.e) obj3).f2108c.f1();
                break;
            case 13:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((AccessibilitySettingsController) obj3).m2().onBackPressed();
                break;
            case 14:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((a9j.g) ((u) obj3).f2711n).e();
                break;
            case 15:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature_retail_user_declarations.email.verification_screen.a) obj3).C2(abi.c.f2967a);
                break;
            case 16:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b) obj3).K2(false);
                break;
            case 17:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((UnstakingPeriodDisclaimerDialogController) obj3).c3(aii.q.f5292a);
                break;
            case 18:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((adb.n) ((adb.k) ((DepositAssetsScreen) obj3).O.getValue())).C2(adb.g.f3316a);
                break;
            case 19:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((aei.b) ((RevPointsPocketThresholdsBreakdownScreen) obj3).R.getValue()).B2();
                break;
            case 20:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ReceiptScreen) obj3).m2().onBackPressed();
                break;
            case 21:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ag1.o) ((ag1.c) ((AddNewProductGroupScreen) obj3).O.getValue())).B2();
                break;
            case 22:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((agh.j) ((agh.e) ((FundFeesInfoScreen) obj3).L.getValue())).B2();
                break;
            case 23:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = ((k1) obj3).f5010b;
                try {
                    KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                    KType kTypeB = o0.b(i1.class);
                    companion.getClass();
                    List list = (List) cVar.T2("snapshot_entries_key", z.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
                    if (list != null) {
                        List<i1> list2 = list;
                        int iB = q0.b(w.t(list2, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                        for (i1 i1Var : list2) {
                            linkedHashMap.put(i1Var.f5003a, i1Var.f5004b);
                            break;
                        }
                    }
                } catch (SerializationException e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    cVar.I0("snapshot_entries_key");
                    return null;
                } catch (Throwable th10) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var2);
                    return null;
                }
                break;
            case 24:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ScheduledPaymentsScreen) obj3).m2().onBackPressed();
                break;
            case 25:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ahg.n) ((ahg.k) ((TravelMilesAirlineSeeAllScreen) obj3).Q.getValue())).B2();
                break;
            case 26:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vii.c cVar2 = ((ajh.l) obj3).f5583t;
                Unit unit = Unit.f186387a;
                cVar2.b(unit);
                break;
            case 27:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((x) obj3).L2(new mii.k("MERCHANT_BLOCKED_SUCCESS_TOAST", new TextLocalisedClause(R$string.merchant_block_success_title_toast, null, null, 14), null, null, null, 28));
                break;
            case 28:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((akj.e) ((akj.d) ((EsimMobilePlanEsimMigrationScreen) obj3).U.getValue())).C2(c.a.f5968a);
                break;
            default:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((akk.p) ((akk.g) ((ExistingPreorderWarningFlow) obj3).N.getValue())).C2(j.c.f5980a);
                break;
        }
        return Unit.f186387a;
    }
}

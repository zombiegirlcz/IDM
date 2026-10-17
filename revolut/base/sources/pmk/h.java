package pmk;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetDescriptor;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$plurals;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.screen.PlanManagementScreen;
import java.time.Period;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pmk.l;
import rp0.y;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PlanManagementScreen f237613w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(PlanManagementScreen planManagementScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f237613w = planManagementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f237613w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f237613w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        hha.j jVar;
        Clause textLocalisedQuantityClause;
        Period period;
        Object next;
        int i = this.u;
        Continuation continuation = null;
        PlanManagementScreen planManagementScreen = this.f237613w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVar = (p) planManagementScreen.Y.getValue();
                String clauseId = aVar.f275445a;
                Object obj3 = aVar.d;
                v vVar = (v) pVar;
                vVar.getClass();
                Intrinsics.checkNotNullParameter(clauseId, "clauseId");
                int iHashCode = clauseId.hashCode();
                if (iHashCode != -1817275529) {
                    if (iHashCode != -1232009582) {
                        if (iHashCode == -1135204050 && clauseId.equals("ID_MINIMUM_BALANCE_ACTION")) {
                            String str = obj3 instanceof String ? (String) obj3 : null;
                            if (str != null) {
                                vVar.l2(new u(vVar, str, continuation, 1), new yi5.b(26));
                            }
                        }
                    } else if (clauseId.equals("ID_MINIMUM_BALANCE_AT_RISK_ACTION")) {
                        vVar.C1(u0.b(vhi.c.c(new KompotPricingPlanFeatureConfig.BottomSheetDestination(new PricingPlanBottomSheetDescriptor.BottomSheet("FREE_PREMIUM_BALANCE_REQUIRED", (String) null, 6)), yhi.b.BOTTOM_DIALOG, null, false, 12)));
                    }
                } else if (clauseId.equals("ID_CLAUSE_KEEP_PLAN")) {
                    vVar.v2(l.a.f237620a);
                }
                break;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String listId = (String) pair.f186385a;
                v vVar2 = (v) ((p) planManagementScreen.Y.getValue());
                vVar2.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                int iHashCode2 = listId.hashCode();
                if (iHashCode2 != -1841255401) {
                    if (iHashCode2 != -1116726988) {
                        if (iHashCode2 == 2001055612 && listId.equals("ID_SWITCH_TO_ANNUAL")) {
                            vVar2.l2(new p0l.d(vVar2, continuation, 29), new yi5.b(26));
                        }
                    } else if (listId.equals("ID_CHANGE_PLAN")) {
                        List list = (List) ((k) vVar2.t2()).f237618c.getContent();
                        if (list != null) {
                            Iterator it8 = list.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (zhm.v.k(hha.k.SALARY_ACTIVE, hha.k.PARTNER_SALARY_ACTIVE, hha.k.PARTNER_SALARY_GRACE, hha.k.SALARY_HUB_ACTIVE, hha.k.SALARY_HUB_GRACE).contains(((hha.j) next).f152316a)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            jVar = (hha.j) next;
                        } else {
                            jVar = null;
                        }
                        Integer numValueOf = (jVar == null || (period = jVar.e) == null) ? null : Integer.valueOf(period.getMonths());
                        PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) ((k) vVar2.t2()).f237616a.getContent();
                        hha.d currentPlan = pricingPlanSubscription != null ? pricingPlanSubscription.f81129a : null;
                        if (jVar == null || numValueOf == null || numValueOf.intValue() <= 0 || currentPlan == null) {
                            vVar2.v2(l.b.f237621a);
                        } else {
                            j60.a aVar4 = vVar2.f237636r;
                            d dVar = vVar2.f237637s;
                            boolean zContains = zhm.v.k(hha.k.PARTNER_SALARY_ACTIVE, hha.k.PARTNER_SALARY_GRACE).contains(jVar.f152316a);
                            dVar.getClass();
                            Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
                            Clause clauseD = dok.g.d(currentPlan, null);
                            boolean zJ = hha.s.j(currentPlan);
                            if (zJ && zContains) {
                                textLocalisedQuantityClause = new TextLocalisedClause(R$string.plan_change_salary_campaign_bottom_sheet_metal_subtitle_partner, null, null, 14);
                            } else {
                                textLocalisedQuantityClause = zJ ? new TextLocalisedQuantityClause(R$plurals.plan_change_salary_campaign_bottom_sheet_metal_subtitle_months, numValueOf, zhm.u.c(numValueOf), (Style) null, 24) : new TextLocalisedQuantityClause(R$plurals.plan_change_salary_campaign_bottom_sheet_subtitle_months, numValueOf, zhm.v.k(numValueOf, clauseD, clauseD), (Style) null, 24);
                            }
                            rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.plan_change_salary_campaign_bottom_sheet_title, zhm.u.c(clauseD), null, 12), textLocalisedQuantityClause, null, 28);
                            LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("KEEP_LIST_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.plan_change_salary_campaign_bottom_sheet_keep_plan, zhm.u.c(clauseD), null, 12), false, null, null, null, null, 1000);
                            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                            LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("CONTINUE_LIST_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.plan_change_salary_campaign_bottom_sheet_change, null, null, 14), false, null, null, null, null, 1000);
                            yp0.b.l(model2, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
                            aVar4.x(new y(zhm.v.k(model, model2), tVar, null, null, null, null, 1020));
                        }
                    }
                } else if (listId.equals("ID_REMOVE_MEMBER_PLAN")) {
                    vVar2.l2(new pe2.l(vVar2, continuation, 17), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}

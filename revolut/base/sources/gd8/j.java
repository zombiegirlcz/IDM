package gd8;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.checklist_challenges_ui.impl.R$string;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_step_details.ChecklistStepDetailsScreen;
import com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestData;
import com.revolut.feature.revolutpay.shared.ui.add_payment_method.AddPaymentMethodScreen;
import com.revolut.feature.wealth.api.ui.providers.composite_add_money.CompositeAddMoneyPortfolioInfoProviderContract$Limits;
import com.revolut.feature_travel_hotels_models.property.OverallPrice;
import com.revolut.feature_travel_hotels_models.property.Pricing;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlow;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import dej.t1;
import ip0.gu;
import ip0.nf0;
import ip0.of0;
import ip0.xk;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import l71.a;
import le.u1;
import tof.a3;
import yhm.m;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143088a;

    public /* synthetic */ j(int i) {
        this.f143088a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        Object objA;
        cd1.c cVar;
        TradingAccount.TaxAdvantage.Limit.TopUpLimit topUpLimit;
        switch (this.f143088a) {
            case 0:
                List<ad8.d> it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Intrinsics.checkNotNullParameter(it8, "<this>");
                ArrayList arrayList = new ArrayList();
                for (ad8.d dVar : it8) {
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        objA = hx7.i.V(dVar);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        objA = yhm.o.a(th10);
                    }
                    Throwable thA = yhm.m.a(objA);
                    if (thA != null) {
                        hx7.e.n(thA);
                    }
                    if (objA instanceof yhm.n) {
                        objA = null;
                    }
                    xc8.g gVar = (xc8.g) objA;
                    if (gVar != null) {
                        arrayList.add(gVar);
                    }
                    break;
                }
                return arrayList;
            case 1:
                InputTextDelegate.TextData it9 = (InputTextDelegate.TextData) obj2;
                AddPaymentMethodScreen.a aVar = AddPaymentMethodScreen.Companion;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f52598b.toString();
            case 2:
                Pricing pricing = (Pricing) obj2;
                Intrinsics.checkNotNullParameter(pricing, "pricing");
                OverallPrice overallPrice = pricing.d;
                return overallPrice != null ? overallPrice.d : f0.f322471a;
            case 3:
                Pricing pricing2 = (Pricing) obj2;
                Intrinsics.checkNotNullParameter(pricing2, "pricing");
                return h9g.m.c(pricing2);
            case 4:
                Pricing pricing3 = (Pricing) obj2;
                Intrinsics.checkNotNullParameter(pricing3, "pricing");
                return h9g.m.k(pricing3);
            case 5:
                Pricing pricing4 = (Pricing) obj2;
                Intrinsics.checkNotNullParameter(pricing4, "pricing");
                OverallPrice overallPrice2 = pricing4.d;
                return overallPrice2 != null ? overallPrice2.d : f0.f322471a;
            case 6:
                Pricing pricing5 = (Pricing) obj2;
                Intrinsics.checkNotNullParameter(pricing5, "pricing");
                return h9g.m.c(pricing5);
            case 7:
                Pricing pricing6 = (Pricing) obj2;
                Intrinsics.checkNotNullParameter(pricing6, "pricing");
                return h9g.m.k(pricing6);
            case 8:
                Data it10 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                try {
                    Object content = it10.getContent();
                    if (content != null) {
                        yhm.r rVar = (yhm.r) content;
                        cVar = new cd1.c((List) rVar.f314201a, (List) rVar.f314202b, (List) rVar.f314203c);
                    } else {
                        cVar = null;
                    }
                    return new Data(cVar, it10.getError(), it10.getLoading());
                } catch (Throwable th11) {
                    return new Data(null, th11, it10.getLoading());
                }
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gu guVar = new gu("CATALOGUE_SUBHEADER_LOADING_LIST_ID", 0, 0, 30);
                int i = R$attr.uikit_dp4;
                IntRange intRange = new IntRange(0, 2, 1);
                ArrayList arrayList2 = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it11 = intRange.iterator();
                while (it11.f289625c) {
                    nf0 nf0Var = new nf0(a0.d.n("CATEGORY_LOADING_LIST_ID", it11.nextInt()), of0.TEAL);
                    yp0.b.l(nf0Var, 0, 0, 0, 0, null, false, 63);
                    arrayList2.add(nf0Var);
                }
                xk xkVar = new xk("CATALOGUE_GRID_LOADING_BOX_ID", arrayList2, null, null, null, i, 0, 0, 0, 65404);
                gu guVar2 = new gu("PRODUCTS_SUBHEADER_LOADING_LIST_ID", 0, 0, 30);
                int i2 = R$attr.uikit_dp4;
                IntRange intRange2 = new IntRange(0, 2, 1);
                ArrayList arrayList3 = new ArrayList(zhm.w.t(intRange2, 10));
                vim.f it12 = intRange2.iterator();
                while (it12.f289625c) {
                    nf0 nf0Var2 = new nf0(a0.d.n("CATEGORY_LOADING_LIST_ID", it12.nextInt()), of0.TEAL);
                    yp0.b.l(nf0Var2, 0, 0, 0, 0, null, false, 63);
                    arrayList3.add(nf0Var2);
                }
                return new ge1.i(zhm.v.k(guVar, xkVar, guVar2, new xk("PRODUCTS_GRID_LOADING_BOX_ID", arrayList3, null, null, null, i2, 0, 0, 0, 65404)));
            case 10:
                ExtensionAuthRequestData it13 = (ExtensionAuthRequestData) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(it13.getF72185c() > 0);
            case 11:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return Boolean.valueOf(((ge6.x) pair.f186386b) == ge6.x.IDLE);
            case 12:
                n38.a it14 = (n38.a) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return u1.a(it14);
            case 13:
                l71.d userCompany = (l71.d) obj2;
                Intrinsics.checkNotNullParameter(userCompany, "userCompany");
                return Boolean.valueOf(userCompany.b().equals(a.g.f192475a));
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 15:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 16:
                pfj.k subscriptions = (pfj.k) obj2;
                Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
                List list = subscriptions.f235617a;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list) {
                    t1 t1Var = (t1) obj3;
                    if (gj7.b.B(t1Var) || gj7.b.y(t1Var) || gj7.b.E(t1Var)) {
                        arrayList4.add(obj3);
                    }
                }
                return arrayList4;
            case 17:
                pfj.k subscriptions2 = (pfj.k) obj2;
                Intrinsics.checkNotNullParameter(subscriptions2, "subscriptions");
                List list2 = subscriptions2.f235617a;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : list2) {
                    if (gj7.b.x((t1) obj4)) {
                        arrayList5.add(obj4);
                    }
                }
                return arrayList5;
            case 18:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 19:
                RowDelegate.Model it15 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = ChecklistStepDetailsScreen.R;
                Intrinsics.checkNotNullParameter(it15, "it");
                Object obj5 = it15.u;
                if (obj5 instanceof a3) {
                    return (a3) obj5;
                }
                return null;
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new gh3.i(new gh3.g(new TextLocalisedClause(R$string.checklist_step_details_header_title, zhm.u.c(new TextLocalisedClause(R$string.checklist_step_details_header_fallback_title, null, null, 14)), null, 12)), i2b.a.o(gh3.n.a(0, 1), gh3.n.a(1, 3)), null);
            case 21:
                ghg.g update = (ghg.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ghg.g.a(update, null, null, null, update.e, update.d, false, false, 103);
            case 22:
                ghg.g update2 = (ghg.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return ghg.g.a(update2, null, null, null, null, null, false, false, 95);
            case 23:
                ghg.g update3 = (ghg.g) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return ghg.g.a(update3, null, null, null, null, null, false, false, 31);
            case 24:
                ghg.g update4 = (ghg.g) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return ghg.g.a(update4, null, null, null, null, null, false, false, 63);
            case 25:
                ghg.g it16 = (ghg.g) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new Pair(it16.e, it16.d);
            case 26:
                ghg.g update5 = (ghg.g) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return ghg.g.a(update5, null, null, null, null, null, true, true, 31);
            case 27:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                m1h.h hVar = (m1h.h) pair2.f186385a;
                TradingAccount.TaxAdvantage taxAdvantage = (TradingAccount.TaxAdvantage) pair2.f186386b;
                dj0.d dVar2 = new dj0.d(1L, hVar.f201496a);
                TradingAccount.TaxAdvantage.Limit f105255l = taxAdvantage.getF105255l();
                return new CompositeAddMoneyPortfolioInfoProviderContract$Limits(dVar2, (f105255l == null || (topUpLimit = f105255l.f105246a) == null) ? null : topUpLimit.f105249c, null);
            case 28:
                TradingAccount.TaxAdvantage account = (TradingAccount.TaxAdvantage) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                return (xi0.b) d0.b0(account.e());
            default:
                String str = (String) obj2;
                KProperty[] kPropertyArr2 = PlanPagerFlow.U;
                return prk.o.m(str, "it", str, "ID_NAV_BAR_ITEM");
        }
    }

    public /* synthetic */ j(cli.n nVar, int i) {
        this.f143088a = i;
    }
}

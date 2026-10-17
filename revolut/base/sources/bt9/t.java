package bt9;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import btb.r;
import buf.c1;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.za;
import com.revolut.core.ui_kit.internal.views.switcher_button.SwitcherButtonView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.pro_merchant.toggles.api.model.FreelancerPluginType;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentDocument;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.ManualTransferScreen;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.workflow.engine.api.models.DataPoint;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.t1;
import ip0.xk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import mx0.f3;
import mx0.h3;
import mx0.w4;
import mx0.y4;
import x2h.b;
import xw6.a;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18476a;

    public /* synthetic */ t(int i) {
        this.f18476a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f18476a) {
            case 0:
                return j.a((j) obj2, null, false, 1);
            case 1:
                DataPoint it8 = (DataPoint) obj2;
                r.a aVar = btb.r.Companion;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(btb.r.f18554a.contains(it8.f105375a));
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 3:
                btk.c cVar = (btk.c) obj2;
                ArrayList arrayList = cVar.f18626c;
                dj0.d dVar = cVar.d;
                if (arrayList.isEmpty()) {
                    return f0.f322471a;
                }
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_investment_plan_banner_monthly_investment, zhm.u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(0, 3), false, false, 13), null, null, 12)), null, 12);
                tel.a aVar2 = (tel.a) d0.m0(cVar.f18626c);
                PlanTileDelegate.Model model = new PlanTileDelegate.Model("etf_investment_plan_tile_list_id", new za(textLocalisedClause, new TextLocalisedClause(R$string.wealth_trading_investment_plan_banner_forecast_amount, zhm.u.c(new MoneyClause(aVar2.e, new MoneyClause.Format.Shorts(false, 63), null, null, 12)), null, 12), new TextLocalisedClause(R$string.wealth_trading_investment_plan_banner_forecast_period, zhm.u.c(new TextClause(String.valueOf(aVar2.f270113a.getYear()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.wealth_trading_investment_plan_banner_see_details, null, null, 14), false, null), new TagViewData(new ResourceImage(R$drawable.uikit_icn_24_lightning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBlue), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.wealth_trading_investment_plan_banner_badge, null, new Custom(Integer.valueOf(R$attr.uikit_colorBlue), false, null, false, null, 254), 10), R$attr.uikit_colorBlue_10, null, R$attr.uikit_colorTransparent, null, 1000), null, false, true, new btk.f(cVar.f18624a, cVar.f18625b, dVar), null, 3992);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(model);
            case 4:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new btl.e(b.C1676b.f302573a);
            case 5:
                List it9 = (List) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(!it9.isEmpty());
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                bw0.h.Companion.getClass();
                CenteredAmountDelegate.Model model2 = new CenteredAmountDelegate.Model("id_boleto_repayment_amount", null, bw0.b.a(), new f3(null, null, null, false, h3.LOADING, true), new bw0.m(null, bw0.l.LOADING, null, false, null, 29), null, null, false, false, null, null, 1890);
                t1 t1Var = new t1("id_min_repayment_amount", null, 6);
                yp0.b.l(t1Var, 0, 0, 0, 0, null, false, 63);
                t1 t1Var2 = new t1("id_statement_amount", null, 6);
                yp0.b.l(t1Var2, 0, 0, 0, 0, null, false, 63);
                t1 t1Var3 = new t1("id_total_repayment_amount", null, 6);
                yp0.b.l(t1Var3, 0, 0, 0, 0, null, false, 63);
                List listK = zhm.v.k(model2, new xk("id_repayment_information", zhm.v.k(t1Var, t1Var2, t1Var3), 3, Float.valueOf(8.0f), null, 48));
                List listK2 = zhm.v.k(new s7("id_statement_due_date", 0, 0, 0, 0, false, null, 126), new s7("id_statement_closed_date", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                return new bu4.i(d0.E0(listK2, listK), bu4.g.f18677a);
            case 8:
                SelectableDelegate.Model it10 = (SelectableDelegate.Model) obj2;
                KProperty[] kPropertyArr = ManualTransferScreen.f92464k0;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(((RowDelegate.Model) it10.f53305b).u instanceof c1);
            case 9:
                List events = (List) obj2;
                Intrinsics.checkNotNullParameter(events, "events");
                List list = events;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                Iterator it11 = list.iterator();
                while (it11.hasNext()) {
                    arrayList2.add(((iel.p) it11.next()).f160803b);
                }
                return arrayList2;
            case 10:
                List events2 = (List) obj2;
                Intrinsics.checkNotNullParameter(events2, "events");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : events2) {
                    if (obj3 instanceof iel.p) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : arrayList3) {
                    if (((iel.p) obj4).e) {
                        arrayList4.add(obj4);
                    }
                }
                return arrayList4;
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 12:
                SwitcherButtonView.Companion companion = SwitcherButtonView.INSTANCE;
                Unit unit = Unit.f186387a;
                if (((y4) obj2) instanceof w4) {
                    return unit;
                }
                return null;
            case 13:
                IntRange intRangeU = t61.a.u((Function0) obj2, "it", 1, 2, 1);
                ArrayList arrayList5 = new ArrayList(zhm.w.t(intRangeU, 10));
                vim.f it12 = intRangeU.iterator();
                while (it12.f289625c) {
                    arrayList5.add(t61.a.o("id_credit_card_settings_loading_item_", it12.nextInt(), pb0.Companion, false, 6));
                }
                yp0.b.k(arrayList5, 0, 0, 0, 0, 31);
                return new bv4.g(arrayList5);
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                n6.Companion.getClass();
                return new aw0.e(false, null, null, m6.a(), null, null, 55);
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                n6.Companion.getClass();
                return new aw0.e(false, null, null, m6.a(), null, null, 55);
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return bvb.w.f();
            case 17:
                List documents = (List) obj2;
                Intrinsics.checkNotNullParameter(documents, "documents");
                ArrayList arrayList6 = new ArrayList();
                for (Object obj5 : documents) {
                    if (!((CreditCardInstalmentDocument) obj5).f68800b) {
                        arrayList6.add(obj5);
                    }
                }
                return arrayList6;
            case 18:
                bw6.g update = (bw6.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return bw6.g.a(update, null, !update.f19246b, null, 5);
            case 19:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new bw6.i((List) getDefaultLoadingItems.invoke());
            case 20:
                aii.q outputData = (aii.q) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                System.out.println((Object) ("[TRANSPORT][HUB][TICKETS] " + outputData));
                return Unit.f186387a;
            case 21:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
            case 22:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 2);
                for (int i = 0; i < 2; i++) {
                    arrayListP.add(new s7(a0.d.n("LOADING_CELL_ID_", i), 0, 0, 0, 0, false, null, 126));
                }
                return arrayListP;
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                m70.a.c(t0.f186434a);
                return "";
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 25:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new bx6.f(((Set) rVar.f314201a).contains(FreelancerPluginType.Shopify.f60846a), (List) rVar.f314202b, (l71.d) rVar.f314203c);
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new bx6.g(iii.c.c(5), a.C1718a.f309332a, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_shopify_tutorial_action_go_to_shopify, null, null, 14), null);
            case 27:
                Intrinsics.checkNotNullParameter((bxb.e) obj2, "$this$update");
                return new bxb.e(0);
            case 28:
                IntRange intRangeU2 = t61.a.u((Function0) obj2, "it", 0, 3, 1);
                ArrayList arrayList7 = new ArrayList(zhm.w.t(intRangeU2, 10));
                vim.f it13 = intRangeU2.iterator();
                while (it13.f289625c) {
                    arrayList7.add(nb0.b(pb0.Companion, a0.d.n("SECTION_LOADING_PREFIX", it13.nextInt()), false, 0, false, 30));
                }
                yp0.b.k(arrayList7, 0, 0, 0, 0, 31);
                return new bxb.i(arrayList7);
            default:
                bxg.h it14 = (bxg.h) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f19689b;
        }
    }

    public /* synthetic */ t(Object obj2, int i) {
        this.f18476a = i;
    }
}

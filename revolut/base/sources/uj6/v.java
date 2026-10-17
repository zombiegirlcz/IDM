package uj6;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$Page;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.insurance.api.models.details.CFACCancellationReason;
import com.revolut.feature.insurance.impl.ui.cfac.claim.exact_reason.CFACInsuranceExactReasonScreen;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.partner_offers.kompot.offers.PlanPartnersOffersScreen;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import com.youTransactor.uCube.rpc.Constants;
import ip0.co;
import ip0.nb0;
import ip0.p9;
import ip0.pb0;
import ip0.s7;
import ip0.xk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import mx0.t4;
import wp5.y;
import xzg.o0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280517a;

    public /* synthetic */ v(int i) {
        this.f280517a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f280517a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                pb0 pb0VarB = nb0.b(pb0.Companion, "LOADING_STATE_ID_row", false, 0, false, 20);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                eVarB.add(pb0VarB);
                ArrayList arrayList = new ArrayList(3);
                for (int i = 0; i < 3; i++) {
                    arrayList.add(new s7(a0.d.n("LOADING_STATE_ID_cell_", i), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList);
                return new r(zhm.u.a(eVarB), true, null, null, null, null, null);
            case 1:
                CellDetailsChevronDelegate.Model it8 = (CellDetailsChevronDelegate.Model) obj2;
                KProperty[] kPropertyArr = CFACInsuranceExactReasonScreen.c0;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj3 = it8.e;
                if (obj3 instanceof CFACCancellationReason) {
                    return (CFACCancellationReason) obj3;
                }
                return null;
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                nb0 nb0Var = pb0.Companion;
                List listK = zhm.v.k(nb0.b(nb0Var, "LOADING_1", false, 0, false, 30), nb0.b(nb0Var, "LOADING_2", false, 0, false, 30), nb0.b(nb0Var, "LOADING_3", false, 0, false, 30));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 3:
                return (uhf.i) obj2;
            case 4:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB2 = zhm.u.b();
                for (int i2 = 0; i2 < 6; i2++) {
                    eVarB2.add(t61.a.o("LOADING_ATM_", i2, pb0.Companion, false, 6));
                }
                aim.e eVarA = zhm.u.a(eVarB2);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                return eVarA;
            case 5:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                pd5.d dVar = (pd5.d) data.getContent();
                if (dVar == null) {
                    return f0.f322471a;
                }
                ArrayList arrayList2 = dVar.f235097c;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : arrayList2) {
                    if (!((pd5.g) obj4).d.isEmpty()) {
                        arrayList3.add(obj4);
                    }
                }
                return arrayList3;
            case 6:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new uk9.f(new TextLocalisedClause(R$string.credit_pay_later_account_purchases, null, null, 14), (List) getDefaultLoadingItems.invoke());
            case 7:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                boolean zBooleanValue = ((Boolean) rVar.f314201a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) rVar.f314202b).booleanValue();
                boolean zBooleanValue3 = ((Boolean) rVar.f314203c).booleanValue();
                return new ike.a(zBooleanValue || zBooleanValue2 || zBooleanValue3, (zBooleanValue || zBooleanValue3) ? false : true);
            case 8:
                List products = (List) obj2;
                Intrinsics.checkNotNullParameter(products, "products");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : products) {
                    WealthAccount wealthAccount = (WealthAccount) obj5;
                    if (wealthAccount.getF95255c() == o0.ACTIVE || wealthAccount.getF95255c() == o0.SUSPENDED) {
                        arrayList4.add(obj5);
                    }
                }
                return arrayList4;
            case 9:
                RowDelegate.Model it9 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = PlanPartnersOffersScreen.W;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(Intrinsics.f(it9.f53228a, "id_explore_subscriptions"));
            case 10:
                List rewardsPreviews = (List) obj2;
                Intrinsics.checkNotNullParameter(rewardsPreviews, "rewardsPreviews");
                return d0.P0(rewardsPreviews, new ukk.o());
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                IntRange intRangeO = kotlin.ranges.f.o(0, 9);
                ArrayList arrayList5 = new ArrayList(zhm.w.t(intRangeO, 10));
                vim.f it10 = intRangeO.iterator();
                while (it10.f289625c) {
                    String strN = a0.d.n("id_partner_loading_", it10.nextInt());
                    int i3 = R$attr.uikit_dp8;
                    arrayList5.add(new p9(strN, i3, R$attr.uikit_dp18, i3, i3));
                }
                return zhm.u.c(new xk("id_partner_grid", arrayList5, null, null, null, 60));
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return null;
            case 13:
                wl2.e it11 = (wl2.e) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                if (it11 instanceof wl2.b) {
                    return new xl2.g(((wl2.b) it11).f298366a);
                }
                if (it11 instanceof wl2.c) {
                    return new xl2.h(((wl2.c) it11).f298367a);
                }
                if (it11 instanceof wl2.d) {
                    return new xl2.i(((wl2.d) it11).f298368a);
                }
                throw new NoWhenBranchMatchedException();
            case 14:
                nl9.g settings = (nl9.g) obj2;
                Intrinsics.checkNotNullParameter(settings, "settings");
                od0.i.Companion.getClass();
                return od0.h.a(settings);
            case 15:
                yoj.a aVar = (yoj.a) obj2;
                return y.s(aVar, "it", aVar);
            case 16:
                yoj.a aVar2 = (yoj.a) obj2;
                return y.s(aVar2, "it", aVar2);
            case 17:
                hha.d dVar2 = (hha.d) ((Data) obj2).getContent();
                String str = dVar2 != null ? dVar2.f152287a : null;
                return str == null ? "" : str;
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return null;
            case 19:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return null;
            case 21:
                um2.a update = (um2.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return um2.a.a(update, null, null, ThemeCustomisationContract$Page.THEME, null, false, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
            case 22:
                um2.a update2 = (um2.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return um2.a.a(update2, null, null, null, null, false, null, new AnimationRequest(false), null, 187);
            case 23:
                um2.a update3 = (um2.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return um2.a.a(update3, null, null, ThemeCustomisationContract$Page.THEME, null, false, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
            case 24:
                return um2.a.a((um2.a) obj2, null, null, ThemeCustomisationContract$Page.THEME, null, false, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
            case 25:
                IntRange intRangeU = t61.a.u((Function0) obj2, "<unused var>", 0, 1, 1);
                ArrayList arrayList6 = new ArrayList(zhm.w.t(intRangeU, 10));
                vim.f it12 = intRangeU.iterator();
                while (it12.f289625c) {
                    arrayList6.add(new co(a0.d.n("home_screen_preview_item_", it12.nextInt())));
                }
                return new um2.i(arrayList6, -1);
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new um2.m(t4.f210012a, null);
            case 27:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                kq8.f fVar = (kq8.f) pair.f186385a;
                List list = (List) pair.f186386b;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj6 : list) {
                    if (((kq8.b) obj6).f) {
                        arrayList7.add(obj6);
                    }
                }
                return new Pair(fVar, d0.P0(arrayList7, new q2j.v(new um9.j(), 13)));
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                nb0 nb0Var2 = pb0.Companion;
                return yp0.b.g(zhm.v.k(nb0.b(nb0Var2, "PAYEES_LOADING_LIST_ID_0", false, 0, false, 30), nb0.b(nb0Var2, "PAYEES_LOADING_LIST_ID_1", false, 0, false, 30), nb0.b(nb0Var2, "PAYEES_LOADING_LIST_ID_2", false, 0, false, 30)), um9.l.a(null), null, 0, 0, 126);
            default:
                List<Pair> list2 = (List) obj2;
                ArrayList arrayList8 = new ArrayList(zhm.w.t(list2, 10));
                for (Pair pair2 : list2) {
                    RoboPortfolioInfo roboPortfolioInfo = (RoboPortfolioInfo) pair2.f186385a;
                    List list3 = (List) pair2.f186386b;
                    ArrayList arrayList9 = new ArrayList(zhm.w.t(list3, 10));
                    Iterator it13 = list3.iterator();
                    while (it13.hasNext()) {
                        arrayList9.add(new ilc.b((PortfolioRecurringOrder) it13.next(), roboPortfolioInfo));
                    }
                    arrayList8.add(arrayList9);
                }
                return arrayList8;
        }
    }

    public /* synthetic */ v(Object obj2, int i) {
        this.f280517a = i;
    }
}

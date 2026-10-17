package gzg;

import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.dg;
import com.revolut.core.ui_kit.delegates.eg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.invest_feed.impl.widgets.analytics.screen.AnalyticsMethodScreen;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint;
import com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import hha.w0;
import ip0.dm0;
import ip0.s7;
import ip0.um0;
import ip0.v7;
import ip0.xk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import rp0.p0;
import z0h.p1;
import z0h.t1;
import zhm.f0;
import zhm.h0;
import zhm.z0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148099a;

    public /* synthetic */ a0(int i) {
        this.f148099a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object aVar;
        Object bVar;
        Object next;
        Object next2;
        boolean z = true;
        switch (this.f148099a) {
            case 0:
                TotalValueChartPoint it8 = (TotalValueChartPoint) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f95007c;
            case 1:
                p0.a it9 = (p0.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj3 = it9.f256150a;
                if (obj3 instanceof mzj.d) {
                    return (mzj.d) obj3;
                }
                return null;
            case 2:
                p0.a it10 = (p0.a) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object obj4 = it10.f256150a;
                if (obj4 instanceof mzj.d) {
                    return (mzj.d) obj4;
                }
                return null;
            case 3:
                p0.a it11 = (p0.a) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                Object obj5 = it11.f256150a;
                if (obj5 instanceof mzj.c) {
                    return (mzj.c) obj5;
                }
                return null;
            case 4:
                PricingPlanSubscription it12 = (PricingPlanSubscription) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(it12.o);
            case 5:
                vf0.y yVar = (vf0.y) obj2;
                Intrinsics.checkNotNullParameter(yVar, "<destruct>");
                List list = (List) yVar.f288491a;
                ((Boolean) yVar.f288492b).getClass();
                return new gzj.g(list, (List) yVar.f288493c, ((Boolean) yVar.d).booleanValue(), true, (yt8.i) yVar.e, (l71.d) yVar.f);
            case 6:
                yt8.d addresses = (yt8.d) obj2;
                Intrinsics.checkNotNullParameter(addresses, "addresses");
                return new Data(addresses.f316665a, null, false, 6, null);
            case 7:
                RowDelegate.Model model = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj6 = model.u;
                if (!(obj6 instanceof h0d.h) && !(obj6 instanceof h0d.i)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                h0f.e it13 = (h0f.e) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f148387b;
            case 9:
                io3.d it14 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it14);
            case 10:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 11:
                NewsDelegate.Model it15 = (NewsDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                Object obj7 = it15.k;
                rzj.f fVar = obj7 instanceof rzj.f ? (rzj.f) obj7 : null;
                if (fVar != null) {
                    return fVar.a();
                }
                return null;
            case 12:
                NewsDelegate.Model it16 = (NewsDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                Object obj8 = it16.k;
                rzj.f fVar2 = obj8 instanceof rzj.f ? (rzj.f) obj8 : null;
                if (fVar2 != null) {
                    return fVar2.e();
                }
                return null;
            case 13:
                t1 disclaimersData = (t1) obj2;
                Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
                return new p1(zhm.u.c(new WealthDisclaimersContract$Disclaimer$Investment.News(disclaimersData.f318563a, disclaimersData.f318564b)), disclaimersData.f318564b);
            case 14:
                IntRange intRangeU = t61.a.u((Function0) obj2, "it", 0, 5, 1);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRangeU, 10));
                vim.f it17 = intRangeU.iterator();
                while (it17.f289625c) {
                    arrayList.add(new dm0(a0.d.n("TREND_PREVIEW_LOADING_ID_", it17.nextInt())));
                }
                eg egVar = new eg("TREND_PREVIEW_SCROLLER_LIST_ID", arrayList, new dg.b(), 16.0f, 0, 0, 1008);
                if (arrayList.isEmpty()) {
                    egVar = null;
                }
                List listC = egVar != null ? zhm.u.c(egVar) : null;
                return listC == null ? f0.f322471a : listC;
            case 15:
                RowDelegate.Model it18 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = AnalyticsMethodScreen.R;
                Intrinsics.checkNotNullParameter(it18, "it");
                Object obj9 = it18.u;
                if (obj9 instanceof h28.c) {
                    return (h28.c) obj9;
                }
                return null;
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                h2c.n.Companion.getClass();
                List list2 = h2c.g.f148772b;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it19 = list2.iterator();
                while (it19.hasNext()) {
                    ip0.t1 t1Var = new ip0.t1(a0.d.n("SPARE_CHANGE_FG_GRID_BOX_LOADING_ITEM_ID_", ((Number) it19.next()).intValue()), null, 6);
                    yp0.b.l(t1Var, 0, 0, 0, 0, null, false, 63);
                    arrayList2.add(t1Var);
                }
                eVarB.add(new xk("SPARE_CHANGE_FG_GRID_LOADING_ITEM_ID", arrayList2, null, null, null, 60));
                v7.C("SPARE_CHANGE_SUBHEADER_LOADING_ITEM_ID", 0, 0, 30, eVarB);
                IntRange intRangeO = kotlin.ranges.f.o(0, 3);
                ArrayList arrayList3 = new ArrayList(zhm.w.t(intRangeO, 10));
                vim.f it20 = intRangeO.iterator();
                while (it20.f289625c) {
                    arrayList3.add(new s7(a0.d.n("SPARE_CHANGE_CELL_DELEGATE_LOADING_ITEM_ID_", it20.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList3);
                return zhm.u.a(eVarB);
            case 17:
                LargeActionButtonDelegate.Model it21 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return Boolean.valueOf(Intrinsics.f(it21.f52613a, "LIMIT_EXCEEDED_DIALOG_BUTTON_ID"));
            case 18:
                h2j.i state = (h2j.i) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                h2j.h hVar = (h2j.h) state.f148830a.getContent();
                if (hVar != null) {
                    return hVar.f148827a;
                }
                return null;
            case 19:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new h2j.n((t1j.d) rVar.f314201a, (List) rVar.f314202b, (do3.n) rVar.f314203c);
            case 20:
                yhm.r rVar2 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                hha.d dVar = (hha.d) rVar2.f314201a;
                List list3 = (List) rVar2.f314202b;
                List list4 = (List) rVar2.f314203c;
                List<z1k.l> list5 = list3;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                for (z1k.l lVar : list5) {
                    String str = lVar.f318875g;
                    dj0.d dVar2 = lVar.e;
                    String str2 = lVar.f318873b;
                    String str3 = lVar.f318872a;
                    if (str != null) {
                        Iterator<E> it22 = w0.a().iterator();
                        while (true) {
                            if (it22.hasNext()) {
                                next = it22.next();
                                if (kotlin.text.a0.z(((w0) next).name(), str, true)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        w0 pricingPlanTier = (w0) next;
                        if (pricingPlanTier == null) {
                            pricingPlanTier = w0.UNKNOWN;
                        }
                        Iterator it23 = list4.iterator();
                        while (true) {
                            if (it23.hasNext()) {
                                next2 = it23.next();
                                if (hha.s.f((hha.d) next2) == pricingPlanTier) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        hha.d dVar3 = (hha.d) next2;
                        dj0.d dVarN = dVar3 != null ? cp5.c.n(dVar3, jli.e.f175845h) : null;
                        Intrinsics.checkNotNullParameter(pricingPlanTier, "pricingPlanTier");
                        TextLocalisedClause textLocalisedClauseE = dok.g.e(pricingPlanTier, null);
                        if (dVarN == null || textLocalisedClauseE == null) {
                            aVar = new z1k.a(dVar2, str3, str2);
                        } else {
                            bVar = new z1k.b(lVar.f318872a, lVar.f318873b, dVar2, textLocalisedClauseE, dVarN, pricingPlanTier == hha.s.f(dVar));
                            arrayList4.add(bVar);
                        }
                    } else {
                        aVar = new z1k.a(dVar2, str3, str2);
                    }
                    bVar = aVar;
                    arrayList4.add(bVar);
                }
                return arrayList4;
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new h32.e(iii.c.c(3), false);
            case 22:
                um0 it24 = (um0) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                Object obj10 = it24.d;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "TwinHorizontalButtonDelegate", "TwinHorizontalButtonDelegate primary button clicked but it isn't properly configured, use special parcel = TwinHorizontalButtonDelegateParcel, model: " + it24, null, null, 16);
                Unit unit = Unit.f186387a;
                return null;
            case 23:
                um0 it25 = (um0) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                Object obj11 = it25.d;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "TwinHorizontalButtonDelegate", "TwinHorizontalButtonDelegate secondary button clicked but it isn't properly configured, use special parcel = TwinHorizontalButtonDelegateParcel, model: " + it25, null, null, 16);
                Unit unit2 = Unit.f186387a;
                return null;
            case 24:
                od0.i cfdAccountOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(cfdAccountOptional, "cfdAccountOptional");
                TradingAccount tradingAccount = (TradingAccount) cfdAccountOptional.f224257a;
                if (tradingAccount == null) {
                    return h0.f322473a;
                }
                h3b.h hVar2 = h3b.h.ADD_MONEY;
                if (!com.revolut.shared.feature.wealth.models.trading_accounts.d.i(tradingAccount)) {
                    hVar2 = null;
                }
                return z0.i(hVar2, com.revolut.shared.feature.wealth.models.trading_accounts.d.k(tradingAccount) ? h3b.h.WITHDRAW : null);
            case 25:
                wel.e it26 = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                return new Pair(it26.f296818a, Boolean.valueOf(i2b.a.m(it26)));
            case 26:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 4);
                for (int i = 0; i < 4; i++) {
                    arrayListP.add(new s7(a0.d.n("account-info-loading-", i), 0, 0, 0, 0, false, null, 126));
                }
                return yp0.b.g(arrayListP, h3b.y.a(), null, 0, 0, 126);
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                n6.Companion.getClass();
                return new aw0.g(m6.a(), m6.a(), (Clause) null, (aw0.f) null, 24);
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return h3b.o.f149091a;
            default:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return data.getContent() == null ? data : (data.getLoading() || data.getError() != null) ? Data.copy$default(data, null, null, false, 1, null) : data;
        }
    }

    public /* synthetic */ a0(Object obj2, int i) {
        this.f148099a = i;
    }
}

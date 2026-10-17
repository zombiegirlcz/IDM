package llb;

import android.view.View;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.EsimRefundScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_switch.kompot.PlanSwitchToAnnualScreen;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import dej.t1;
import do3.n;
import hlb.m;
import hlb.o;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lw0.h;
import lw0.i;
import net.sf.scuba.smartcards.CardService;
import org.jmrtd.PassportService;
import yld.j;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196696a;

    public /* synthetic */ e(int i) {
        this.f196696a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f196696a) {
            case 0:
                Function0 getLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getLoadingItems, "getLoadingItems");
                return new o((List) getLoadingItems.invoke(), m.f153435a, null);
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new cii.b(null, iii.c.c(4), new h(i.CENTER_WITH_PROGRESS));
            case 2:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : it8) {
                    if (obj3 instanceof WealthAccount.Robo) {
                        arrayList.add(obj3);
                    }
                }
                return (WealthAccount.Robo) d0.d0(arrayList);
            case 3:
                lm1.e it9 = (lm1.e) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f196854b;
            case 4:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                ArrayList arrayListC = iii.c.c(5);
                yp0.b.k(arrayListC, 0, 0, 0, 0, 31);
                return arrayListC;
            case 5:
                lm3.a update = (lm3.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return lm3.a.a(update, null, null, null, null, null, true, 63);
            case 6:
                lm3.a update2 = (lm3.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return lm3.a.a(update2, null, null, null, null, null, !update2.f196867g, 63);
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 8:
                od0.i it10 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (TradingAccount) it10.g();
            case 9:
                n it11 = (n) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f116408a;
            case 10:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return (!data.getLoading() || data.getError() == null) ? data : Data.copy$default(data, null, null, false, 5, null);
            case 11:
                fo3.c it12 = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.d;
            case 12:
                xi0.b it13 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return zi0.c.P(it13, false, null, 3);
            case 13:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new j((Map) pair.f186385a, (Map) pair.f186386b);
            case 14:
                Data data2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                return (!data2.getLoading() || data2.getError() == null) ? data2 : Data.copy$default(data2, null, null, false, 5, null);
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 16:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.TRUE;
            case 17:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 10);
                for (int i = 0; i < 10; i++) {
                    arrayListP.add(t61.a.o("all-assets-screener-loading-item-", i, pb0.Companion, false, 6));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 18:
                CardService o = (CardService) obj2;
                Intrinsics.checkNotNullParameter(o, "o");
                o.close();
                return Unit.f186387a;
            case 19:
                PassportService o3 = (PassportService) obj2;
                Intrinsics.checkNotNullParameter(o3, "o");
                o3.close();
                return Unit.f186387a;
            case 20:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 21:
                List performanceAssets = (List) obj2;
                Intrinsics.checkNotNullParameter(performanceAssets, "performanceAssets");
                List list = performanceAssets;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                Iterator it14 = list.iterator();
                while (it14.hasNext()) {
                    arrayList2.add(new enh.a((vel.f) it14.next(), null));
                }
                return arrayList2;
            case 22:
                SelectableDelegate.Model it15 = (SelectableDelegate.Model) obj2;
                KProperty[] kPropertyArr = EsimRefundScreen.U;
                Intrinsics.checkNotNullParameter(it15, "it");
                Object obj4 = ((RowDelegate.Model) it15.f53305b).u;
                if (obj4 instanceof t1) {
                    return (t1) obj4;
                }
                return null;
            case 23:
                KProperty[] kPropertyArr2 = PlanSwitchToAnnualScreen.Q;
                Intrinsics.checkNotNullParameter((n6) obj2, "it");
                return Unit.f186387a;
            case 24:
                View view = (View) obj2;
                KProperty[] kPropertyArr3 = PlanSwitchToAnnualScreen.Q;
                Intrinsics.checkNotNullParameter(view, "view");
                jii.e eVarA = jii.e.a(view);
                Intrinsics.checkNotNullExpressionValue(eVarA, "bind(...)");
                return eVarA;
            case 25:
                lnk.e it16 = (lnk.e) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(it16.d);
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new lnk.j(v.k(new s7("loading_item_1", 0, 0, 0, 0, false, null, 126), new s7("loading_item_2", 0, 0, 0, 0, false, null, 126)), null, null, null);
            case 27:
                loa.d updateState = (loa.d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return loa.d.a(updateState, null, null, 3);
            case 28:
                pdh.b performanceChart = (pdh.b) obj2;
                Intrinsics.checkNotNullParameter(performanceChart, "performanceChart");
                return new koc.b(performanceChart, null, koc.a.TEMPLATE_PERFORMANCE);
            default:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return new koc.b((pdh.b) pair2.f186385a, mif.a.Q(((del.b) pair2.f186386b).f113708a), koc.a.PORTFOLIO_SIMULATED_PERFORMANCE);
        }
    }

    public /* synthetic */ e(Object obj2, int i) {
        this.f196696a = i;
    }
}

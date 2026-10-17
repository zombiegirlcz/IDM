package kjk;

import bjk.g0;
import bjk.g2;
import bjk.h0;
import bjk.r0;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.EsimMobilePlanMyNumbersScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanDashboardTile;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import le.u1;
import tof.a3;
import tof.gc;
import tof.t3;
import tof.v6;
import zh9.i0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184474a;

    public /* synthetic */ x(int i) {
        this.f184474a = i;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z = false;
        switch (this.f184474a) {
            case 0:
                g2 it8 = (g2) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return mjk.r.l(it8);
            case 1:
                bjk.f0 it9 = (bjk.f0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj3 = mjk.d.f206058a;
                Intrinsics.checkNotNullParameter(it9, "<this>");
                List<g0> planConfigs = it9.getPlanConfigs();
                ArrayList arrayList = new ArrayList(zhm.w.t(planConfigs, 10));
                for (g0 g0Var : planConfigs) {
                    String planId = g0Var.getPlanId();
                    boolean zJ = pd.b.j(g0Var.getHidden());
                    h0 tile = g0Var.getTile();
                    PlanDashboardTile image = PlanDashboardTile.Text.f102647a;
                    if (tile != null) {
                        int i = mjk.c.f206057a[((mjk.e) u1.t(tile.getType(), mjk.e.UNKNOWN, mjk.d.f206058a)).ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                String url2 = tile.getUrl();
                                image = new PlanDashboardTile.Image(url2 != null ? url2 : "");
                            } else if (i == 3) {
                                String url3 = tile.getUrl();
                                image = new PlanDashboardTile.Video(url3 != null ? url3 : "");
                            } else if (i == 4) {
                                String url4 = tile.getUrl();
                                image = new PlanDashboardTile.SmallVideo(url4 != null ? url4 : "");
                            } else {
                                if (i != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                zhm.h0 h0Var = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, "Plan dashboard tile mapping", p.a.p("type ", tile.getType(), " not supported"), null, h0Var);
                            }
                        } else {
                            continue;
                        }
                    }
                    arrayList.add(new ggk.m(planId, zJ, image));
                }
                return new ggk.l(arrayList);
            case 2:
                r0 it10 = (r0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return mjk.f.a(it10);
            case 3:
                od0.i it11 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (i0) it11.f224257a;
            case 4:
                List repaymentsWithPlan = (List) obj2;
                Intrinsics.checkNotNullParameter(repaymentsWithPlan, "repaymentsWithPlan");
                return d8l.d.j(repaymentsWithPlan);
            case 5:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new kk9.g((i0) rVar.f314201a, (List) rVar.f314202b, (dj0.d) rVar.f314203c);
            case 6:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new kk9.k(null, (List) getDefaultLoadingItems.invoke(), null, null);
            case 7:
                Intrinsics.checkNotNullParameter((a3) obj2, "it");
                return Boolean.TRUE;
            case 8:
                a3 observeTransactionProperty = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty, "$this$observeTransactionProperty");
                Set set = k71.k.f181789a;
                Intrinsics.checkNotNullParameter(observeTransactionProperty, "<this>");
                return Boolean.valueOf(cp5.d.z(observeTransactionProperty.k.f115083b));
            case 9:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (n71.b) zhm.d0.d0(it12);
            case 10:
                t3 observeTransactionDetailsProperty = (t3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionDetailsProperty, "$this$observeTransactionDetailsProperty");
                return observeTransactionDetailsProperty.G0;
            case 11:
                a3 observeTransactionProperty2 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty2, "$this$observeTransactionProperty");
                if (k71.k.h(observeTransactionProperty2) && Intrinsics.f(observeTransactionProperty2.f272611s, "kyc_not_passed")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                a3 observeTransactionProperty3 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty3, "$this$observeTransactionProperty");
                Set set2 = k71.k.f181789a;
                Intrinsics.checkNotNullParameter(observeTransactionProperty3, "<this>");
                String str = observeTransactionProperty3.f272611s;
                if ((Intrinsics.f(str, "sg_daily_ob_wallet_limit_exceeded") || Intrinsics.f(str, "standing_order_sg_daily_outbound_limit_exceeded") || Intrinsics.f(str, "daily_ob_wallet_limit_exceeded") || Intrinsics.f(str, "standing_order_daily_outbound_limit_exceeded")) && observeTransactionProperty3.f == v6.DECLINED) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                a3 observeTransactionProperty4 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty4, "$this$observeTransactionProperty");
                return observeTransactionProperty4.f272612s0;
            case 14:
                a3 observeTransactionProperty5 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty5, "$this$observeTransactionProperty");
                return observeTransactionProperty5.q0;
            case 15:
                Intrinsics.checkNotNullParameter((a3) obj2, "it");
                return Boolean.TRUE;
            case 16:
                a3 observeTransactionProperty6 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty6, "$this$observeTransactionProperty");
                String str2 = observeTransactionProperty6.f272581b;
                Set set3 = k71.k.f181789a;
                Intrinsics.checkNotNullParameter(observeTransactionProperty6, "<this>");
                if (observeTransactionProperty6.f272624y.f273144b == io3.l.INSTALMENT) {
                    return str2;
                }
                return null;
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 18:
                a3 observeTransactionProperty7 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty7, "$this$observeTransactionProperty");
                dj0.d dVar = observeTransactionProperty7.k;
                if (observeTransactionProperty7.f != v6.DECLINED || k71.k.C(observeTransactionProperty7)) {
                    return null;
                }
                return dVar;
            case 19:
                Intrinsics.checkNotNullParameter((a3) obj2, "it");
                return Boolean.TRUE;
            case 20:
                a3 observeTransactionProperty8 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty8, "$this$observeTransactionProperty");
                return observeTransactionProperty8.f272611s;
            case 21:
                t3 observeTransactionDetailsProperty2 = (t3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionDetailsProperty2, "$this$observeTransactionDetailsProperty");
                return observeTransactionDetailsProperty2.f273070n0;
            case 22:
                t3 observeTransactionDetailsProperty3 = (t3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionDetailsProperty3, "$this$observeTransactionDetailsProperty");
                gc gcVar = observeTransactionDetailsProperty3.z0;
                if (gcVar != null) {
                    return gcVar.f272773a;
                }
                return null;
            case 23:
                t3 observeTransactionDetailsProperty4 = (t3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionDetailsProperty4, "$this$observeTransactionDetailsProperty");
                return observeTransactionDetailsProperty4.D0;
            case 24:
                t3 observeTransactionDetailsProperty5 = (t3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionDetailsProperty5, "$this$observeTransactionDetailsProperty");
                return observeTransactionDetailsProperty5.D0;
            case 25:
                a3 observeTransactionProperty9 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty9, "$this$observeTransactionProperty");
                if (observeTransactionProperty9.A != null) {
                    Set set4 = k71.k.f181789a;
                    Intrinsics.checkNotNullParameter(observeTransactionProperty9, "<this>");
                    if (Intrinsics.f(observeTransactionProperty9.f272611s, "sca")) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return zhm.f0.f322471a;
            case 27:
                RowDelegate.Model model = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = EsimMobilePlanMyNumbersScreen.T;
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj4 = model.u;
                if (obj4 instanceof EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory) {
                    return (EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory) obj4;
                }
                return null;
            case 28:
                List data = (List) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return u1.a(zhm.d0.d0(data));
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return new ggk.k(null);
        }
    }
}

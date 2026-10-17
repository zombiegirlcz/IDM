package vgk;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.AddressFieldSuggestion;
import com.revolut.feature.junior_onboarding.api.provider.OnboardingConfiguration;
import com.revolut.feature.shops.impl.ui.bid_flow.ShopsBidFlowContract$FlowState;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanPerk;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.FamilyPlanFlowContract$Step;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.t1;
import ip0.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jmrtd.lds.LDSFile;
import te0.w;
import tof.va;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289198a;

    public /* synthetic */ g(int i) {
        this.f289198a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f289198a) {
            case 0:
                hha.d it8 = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f152296p ? FamilyPlanFlowContract$Step.SelectFamilyPlan.f102988a : FamilyPlanFlowContract$Step.Intro.f102984a;
            case 1:
                vh2.c update = (vh2.c) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return vh2.c.a(update, Data.copy$default(update.f289270a, null, null, true, 3, null), false, 2);
            case 2:
                return vh2.c.a((vh2.c) obj2, null, false, 1);
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gu guVar = new gu("ID_LOADING_HEADER", 0, 0, 30);
                pb0 pb0VarB = nb0.b(pb0.Companion, "ID_LOADING_ITEM", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                return v.k(guVar, pb0VarB);
            case 4:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                wi0.b.Companion.getClass();
                return new OnboardingConfiguration(w.S(user, wi0.b.Y1) ? new OnboardingConfiguration.PersonalDataFormat.FirstNameAndSurnames(false) : w.S(user, wi0.b.O) ? new OnboardingConfiguration.PersonalDataFormat.FirstNameAndSurnames(true) : OnboardingConfiguration.PersonalDataFormat.FirstNameAndLastName.f76970a);
            case 5:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                List list = pockets;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList.add(((io3.d) it9.next()).f163145a);
                }
                return new va(d0.i1(arrayList));
            case 6:
                yt8.c it10 = (yt8.c) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f316662a;
            case 7:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return (fo3.c) pair.f186385a;
            case 8:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 9:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                for (int i = 0; i < 3; i++) {
                    arrayListP.add(new pb0(a0.d.n("RECOMMENDED_AIRLINES_ITEM_ID_PREFIX", i)));
                }
                return yp0.b.g(arrayListP, vhg.a.a(false), null, 0, 0, 126);
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return vhg.h.a();
            case 11:
                ArrayList arrayListP2 = kii.e.p((Function0) obj2, "it", 3);
                for (int i2 = 0; i2 < 3; i2++) {
                    t1 t1Var = new t1(String.valueOf(i2), null, 6);
                    yp0.b.l(t1Var, 0, 0, 0, 0, null, false, 63);
                    arrayListP2.add(t1Var);
                }
                return vhg.k.a(arrayListP2);
            case 12:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 13:
                List result = (List) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                List list2 = result;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it11 = list2.iterator();
                while (it11.hasNext()) {
                    arrayList2.add(new vi1.m(((AddressFieldSuggestion) it11.next()).getValue()));
                }
                return arrayList2;
            case 14:
                ShopsBidFlowContract$FlowState update2 = (ShopsBidFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return ShopsBidFlowContract$FlowState.a(update2, true);
            case 15:
                ShopsBidFlowContract$FlowState update3 = (ShopsBidFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return ShopsBidFlowContract$FlowState.a(update3, true);
            case 16:
                ShopsBidFlowContract$FlowState update4 = (ShopsBidFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                update4.getClass();
                return new ShopsBidFlowContract$FlowState(null, false);
            case 17:
                ShopsBidFlowContract$FlowState update5 = (ShopsBidFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return ShopsBidFlowContract$FlowState.a(update5, true);
            case 18:
                ShopsBidFlowContract$FlowState update6 = (ShopsBidFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return ShopsBidFlowContract$FlowState.a(update6, true);
            case 19:
                ShopsBidFlowContract$FlowState update7 = (ShopsBidFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return ShopsBidFlowContract$FlowState.a(update7, true);
            case 20:
                return ShopsBidFlowContract$FlowState.a((ShopsBidFlowContract$FlowState) obj2, false);
            case 21:
                return ShopsBidFlowContract$FlowState.a((ShopsBidFlowContract$FlowState) obj2, false);
            case 22:
                xi0.b displayCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
                od0.h hVar = od0.i.Companion;
                String str = displayCurrency.f306286a;
                hVar.getClass();
                return od0.h.a(str);
            case 23:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 24:
                y it12 = (y) obj2;
                KProperty[] kPropertyArr = EsimMobilePlanDetailsScreen.V;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(Intrinsics.f(it12.f167225a, "ID_MOBILE_PLAN_ACTIONS"));
            case 25:
                ListSubheaderDelegate.Model it13 = (ListSubheaderDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = EsimMobilePlanDetailsScreen.V;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(Intrinsics.f(it13.f52708a, "ID_MOBILE_PLAN_INTERNATIONAL_ALLOWANCE_HEADER"));
            case 26:
                CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = EsimMobilePlanDetailsScreen.V;
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = model.o;
                if (obj3 instanceof EsimMobilePlanPerk) {
                    return (EsimMobilePlanPerk) obj3;
                }
                return null;
            case 27:
                String str2 = (String) obj2;
                KProperty[] kPropertyArr4 = EsimMobilePlanDetailsScreen.V;
                return prk.o.m(str2, "it", str2, "MENU_HELP");
            case 28:
                vjj.j update8 = (vjj.j) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return vjj.j.a(update8, null, null, null, null, new Data(Optional.empty(), null, false, 6, null), null, LDSFile.EF_DG15_TAG);
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listC = u.c(nb0.b(pb0.Companion, "ID_LOADING_MOBILE_PLAN_PHONE_NUMBER", false, 0, false, 30));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                List listK = v.k(new s7("ID_LOADING_MOBILE_PLAN_DATA", 0, 0, 0, 0, false, null, 126), new s7("ID_LOADING_MOBILE_PLAN_CALLS", 0, 0, 0, 0, false, null, 126), new s7("ID_LOADING_MOBILE_PLAN_SMS", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                ArrayList arrayListE0 = d0.E0(listK, listC);
                List listK2 = v.k(new s7("ID_LOADING_MOBILE_PLAN_ROAMING_DATA", 0, 0, 0, 0, false, null, 126), new s7("ID_LOADING_MOBILE_PLAN_ROAMING_CALLS", 0, 0, 0, 0, false, null, 126), new s7("ID_LOADING_MOBILE_PLAN_ROAMING_SMS", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                ArrayList arrayListE02 = d0.E0(listK2, arrayListE0);
                List listC2 = u.c(new s7("ID_LOADING_MOBILE_PLAN_EXCLUSIVE_BENEFITS", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listC2, 0, 0, 0, 0, 31);
                return new vjj.w(d0.E0(listC2, arrayListE02), null, null);
        }
    }

    public /* synthetic */ g(Object obj2, int i) {
        this.f289198a = i;
    }
}

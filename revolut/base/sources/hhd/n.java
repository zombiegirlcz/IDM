package hhd;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.alipay_plus.mpm.support.APMPMLogFormatter;
import com.revolut.feature.shops.impl.flow.checkout.ModalCheckoutFlowContract$FlowState;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_invoices.EsimMobilePlanInvoicesScreen;
import dej.t1;
import ekd.q0;
import ip0.ca;
import ip0.da;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.xk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152401a;

    public /* synthetic */ n(int i) {
        this.f152401a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f152401a) {
            case 0:
                h it8 = (h) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.d;
            case 1:
                h it9 = (h) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.e;
            case 2:
                h domainState = (h) obj2;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                ArrayList<ogd.e> arrayListU = w.u(domainState.f152394c.values());
                ArrayList arrayList = new ArrayList(w.t(arrayListU, 10));
                for (ogd.e eVar : arrayListU) {
                    eVar.getClass();
                    ogd.i.Companion.getClass();
                    arrayList.add(ogd.h.a(eVar).a());
                }
                return d0.i1(arrayList);
            case 3:
                hi2.e it10 = (hi2.e) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f152452a;
            case 4:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                return new BridgeDestination(command);
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 6:
                ModalCheckoutFlowContract$FlowState update = (ModalCheckoutFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                return new ModalCheckoutFlowContract$FlowState(true);
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 8:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
            case 9:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
            case 10:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
            case 11:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 13:
                WealthAccount it11 = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new hjh.g(it11);
            case 14:
                hk9.j updateState = (hk9.j) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return hk9.j.a(updateState, null, null, null, true, 15);
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                lw0.h hVar = new lw0.h(lw0.i.TITLE_SUBTITLE);
                ArrayList arrayList2 = new ArrayList(2);
                for (int i = 0; i < 2; i++) {
                    arrayList2.add(new da(a0.d.n("savings_challenge_tracker_reward_loading_", i), ca.PROGRESS));
                }
                return new cii.b(null, u.c(new xk("savings_challenge_tracker_rewards_grid", arrayList2, Integer.valueOf(arrayList2.size()), Float.valueOf(12.0f), Float.valueOf(BitmapDescriptorFactory.HUE_RED), 32)), hVar);
            case 16:
                RowDelegate.Model model = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = EsimMobilePlanInvoicesScreen.S;
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = model.u;
                if (obj3 instanceof String) {
                    return (String) obj3;
                }
                return null;
            case 17:
                t1 subscription = (t1) obj2;
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                return subscription.J;
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listC = u.c(new gu("ID_INVOICES_GROUP_SUBHEADER_0", 0, 0, 30));
                int i2 = R$attr.uikit_dp8;
                int i3 = R$attr.uikit_dp0;
                yp0.b.o(i2, i3, i3, i3, listC);
                nb0 nb0Var = pb0.Companion;
                List listK = v.k(nb0.b(nb0Var, "ID_INVOICE_ITEM_0_0", false, 0, false, 30), nb0.b(nb0Var, "ID_INVOICE_ITEM_0_1", false, 0, false, 30), nb0.b(nb0Var, "ID_INVOICE_ITEM_0_2", false, 0, false, 30));
                yp0.b.k(listK, R$attr.uikit_dp4, 0, 0, 0, 30);
                return d0.E0(listK, listC);
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                List listK2 = v.k(new s7("loading_1", 0, 0, 0, 0, false, null, 126), new s7("loading_2", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                List listC2 = u.c(new pb0("loading_3"));
                yp0.b.k(listC2, 0, 0, 0, 0, 31);
                return new hkk.i(d0.E0(listC2, listK2), null);
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return null;
            case 21:
                return APMPMLogFormatter.render$lambda$1((Map.Entry) obj2);
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 23:
                q0 it12 = (q0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.H().b();
            case 24:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                od0.h hVar2 = od0.i.Companion;
                String str = user.f116408a;
                hVar2.getClass();
                return od0.h.a(str);
            case 25:
                kbk.i it13 = (kbk.i) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new hm3.k(it13);
            case 26:
                do3.n user2 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user2, "user");
                return Boolean.valueOf(user2.u == do3.b.FULL);
            case 27:
                hha.d plan = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(plan, "plan");
                if (!hha.s.m(plan) && !hha.s.n(plan) && !hha.s.j(plan) && !hha.s.p(plan) && !hha.s.o(plan)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                RowDelegate.Model it14 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                Clause clause = it14.f53230c;
                Intrinsics.i(clause, "null cannot be cast to non-null type com.revolut.core.ui_kit.models.TextClause");
                return ((TextClause) clause).f57936a;
            default:
                RowDelegate.Model it15 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                Object obj4 = it15.u;
                if (obj4 instanceof hmc.s) {
                    return (hmc.s) obj4;
                }
                return null;
        }
    }

    public /* synthetic */ n(Object obj2, int i) {
        this.f152401a = i;
    }
}

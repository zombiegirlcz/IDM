package aik;

import aj6.k;
import aj6.r;
import ajd.j;
import ajd.m;
import akb.p;
import akf.d0;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.crypto.impl.ui.v2.accounts.crypto.CryptoAccountsState;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.PlanOfferFlowContract$DomainState;
import d9.t0;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mif.e0;
import rp0.p0;
import tof.a3;
import tof.q1;
import tof.v6;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5300a;

    public /* synthetic */ d(int i) {
        this.f5300a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f5300a) {
            case 0:
                PlanOfferFlowContract$DomainState update = (PlanOfferFlowContract$DomainState) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                return new PlanOfferFlowContract$DomainState(false);
            case 1:
                PlanOfferFlowContract$DomainState update2 = (PlanOfferFlowContract$DomainState) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                update2.getClass();
                return new PlanOfferFlowContract$DomainState(true);
            case 2:
                aj6.i update3 = (aj6.i) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                if (!update3.c()) {
                    return aj6.i.a(update3, null, null, update3.i, update3.f5411j, null, null, null, false, null, null, 1011);
                }
                h0 h0Var = h0.f322473a;
                return aj6.i.a(update3, null, null, h0Var, h0Var, null, null, null, false, null, null, 1011);
            case 3:
                aj6.i it8 = (aj6.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f;
            case 4:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new r((List) getDefaultLoadingItems.invoke(), k.a.f5413a);
            case 5:
                List it9 = (List) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new m(it9);
            case 6:
                ajd.h updateState = (ajd.h) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return ajd.h.a(updateState, null, null, null, false, null, 29);
            case 7:
                ajd.h updateState2 = (ajd.h) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return ajd.h.a(updateState2, null, null, null, false, new Data(j.a.f5546a, null, false, 6, null), 15);
            case 8:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new m(it10);
            case 9:
                return new Data(null, null, true, 3, null);
            case 10:
                WealthAccount account = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                return new ajh.e(account);
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "getDefaultLoadingItems");
                aim.e eVarB = u.b();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                qv0.k kVar = null;
                int i5 = 126;
                List listK = v.k(new s7("ID_ROW_DATE_1", 0, i, i2, i3, false, null, 126), new s7("ID_ROW_DATE_2", i, i2, i3, 0 == true ? 1 : 0, false, null, 126), new s7("ID_ROW_DATE_3", i2, i3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, kVar, i5));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                int i6 = 0;
                s7 s7Var = new s7("ID_ROW_PAYMENT_FROM", i2, i3, i6, 0 == true ? 1 : 0, 0 == true ? 1 : 0, kVar, i5);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                eVarB.add(s7Var);
                s7 s7Var2 = new s7("ID_ROW_GET_HELP", i3, i6, 0, 0 == true ? 1 : 0, false, null, 126);
                yp0.b.l(s7Var2, 0, 0, 0, 0, null, false, 63);
                eVarB.add(s7Var2);
                return new akb.r(p.f5780a, u.a(eVarB));
            case 12:
                CryptoAccountsState it11 = (CryptoAccountsState) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f89817a;
            case 13:
                a3 observeTransactionProperty = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty, "$this$observeTransactionProperty");
                return observeTransactionProperty.e;
            case 14:
                a3 observeTransactionProperty2 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty2, "$this$observeTransactionProperty");
                return observeTransactionProperty2.e;
            case 15:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return d0.f5825a;
            case 16:
                a3 observeTransactionProperty3 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty3, "$this$observeTransactionProperty");
                q1 q1Var = observeTransactionProperty3.M0;
                if (q1Var != null) {
                    return q1Var.f273003a;
                }
                return null;
            case 17:
                a3 observeTransactionProperty4 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty4, "$this$observeTransactionProperty");
                Set set = k71.k.f181789a;
                Intrinsics.checkNotNullParameter(observeTransactionProperty4, "<this>");
                return Boolean.valueOf(observeTransactionProperty4.f == v6.DECLINED && Intrinsics.f(observeTransactionProperty4.f272611s, "card_expired"));
            case 18:
                return ((a3) obj2).A;
            case 19:
                p0.a clickData = (p0.a) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.f256150a;
                if (obj3 instanceof yk2.b) {
                    return (yk2.b) obj3;
                }
                return null;
            case 20:
                p0.a clickData2 = (p0.a) obj2;
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                return Boolean.valueOf(clickData2.f256150a instanceof yk2.b);
            case 21:
                List pricingPlanLimits = (List) obj2;
                Intrinsics.checkNotNullParameter(pricingPlanLimits, "pricingPlanLimits");
                return e0.k(pricingPlanLimits);
            case 22:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                List list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it12 = list2.iterator();
                while (it12.hasNext()) {
                    arrayList.add(cp5.c.L((zk3.a) it12.next()));
                }
                return arrayList;
            case 23:
                List list3 = (List) obj2;
                Intrinsics.checkNotNullParameter(list3, "list");
                List list4 = list3;
                ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                Iterator it13 = list4.iterator();
                while (it13.hasNext()) {
                    arrayList2.add(cp5.c.L((zk3.a) it13.next()));
                }
                return arrayList2;
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                CounterTextDelegate.Model modelB = CounterTextDelegate.Model.Companion.b(CounterTextDelegate.Model.INSTANCE, "CALCULATOR_COUNTER_TEXT_DELEGATE_ID", null, 0, 0, 0, 0, 122);
                yp0.b.r(modelB, R$attr.uikit_dp24, R$attr.uikit_dp0, 0, 0, 12);
                return new alb.g(u.c(modelB), alb.m.a(null));
            case 25:
                a0.d.B(obj2);
                throw null;
            case 26:
                String it14 = (String) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                byte[] bytes = it14.getBytes(am0.b.f6282c);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                return zhm.p.m(bytes, 0, 32);
            case 27:
                byte[] encryptedBase64Value = (byte[]) obj2;
                Intrinsics.checkNotNullParameter(encryptedBase64Value, "encryptedBase64Value");
                return kotlin.text.d0.F0(new String(encryptedBase64Value, am0.b.f6282c)).toString();
            case 28:
                zm3.b groups = (zm3.b) obj2;
                Intrinsics.checkNotNullParameter(groups, "groups");
                List list5 = groups.d;
                Intrinsics.checkNotNullParameter(list5, "<this>");
                ArrayList arrayList3 = new ArrayList();
                Iterator it15 = list5.iterator();
                while (it15.hasNext()) {
                    zm3.f fVarR = t0.r((zm3.a) it15.next());
                    if (fVarR != null) {
                        arrayList3.add(fVarR);
                    }
                }
                return arrayList3;
            default:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 5);
                for (int i21 = 0; i21 < 5; i21++) {
                    arrayListP.add(t61.a.o("LIFESTYLE_DOCUMENTS_LOADING_ROW_", i21, pb0.Companion, false, 6));
                }
                return arrayListP;
        }
    }
}

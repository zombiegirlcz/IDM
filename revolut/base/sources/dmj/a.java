package dmj;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.CreditCardInstalmentHubScreen;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.vaults.common.SavingsDocumentToAccept;
import com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.documents.DocumentsToAcceptScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.EsimMobilePlanPhoneNumberCheckoutScreen;
import ip0.e8;
import ip0.ek;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.qi;
import ip0.s7;
import ip0.vj0;
import ip0.x10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import z0h.p1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116133a;

    public /* synthetic */ a(int i) {
        this.f116133a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f116133a) {
            case 0:
                e8 item = (e8) obj2;
                KProperty[] kPropertyArr = EsimMobilePlanPhoneNumberCheckoutScreen.X;
                Intrinsics.checkNotNullParameter(item, "item");
                return Boolean.valueOf(Intrinsics.f(item.f164031a, "ID_PAY_NOW_ITEM"));
            case 1:
                a0 currentState = (a0) obj2;
                Intrinsics.checkNotNullParameter(currentState, "currentState");
                return t1.t(currentState.e, zi0.c.P(Boolean.valueOf(currentState.f116137g), false, null, 3));
            case 2:
                od0.i optionalPaymentMethod = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalPaymentMethod, "optionalPaymentMethod");
                PaymentMethod paymentMethod = (PaymentMethod) optionalPaymentMethod.g();
                if (paymentMethod != null) {
                    PaymentMethod.Pocket pocket = (PaymentMethod.Pocket) (!(paymentMethod instanceof PaymentMethod.Pocket) ? null : paymentMethod);
                    if (pocket != null) {
                        return pocket;
                    }
                }
                throw new IllegalStateException(j6.a.q("Unable to get default pocket. Default payment method type is: ", paymentMethod != null ? paymentMethod.getClass().getName() : null).toString());
            case 3:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ArrayList arrayListH = yp0.b.h(zhm.v.k(new s7("ID_PHONE_NUMBER", 0, 0, 0, 0, false, null, 126), new s7("ID_PHONE_NUMBER_MONTHLY_FEE", 0, 0, 0, 0, false, null, 126), new s7("ID_NEXT_PAYMENT_DATE", 0, 0, 0, 0, false, null, 126), new s7("ID_MOBILE_PLAN_CHECKOUT_CONTRACT_SUMMARY", 0, 0, 0, 0, false, null, 126)), new gu("ID_PLAN_SUMMARY", 0, 0, 30), null, 0, 126);
                nb0 nb0Var = pb0.Companion;
                List listO = i2b.a.o(arrayListH, yp0.b.h(zhm.u.c(nb0.b(nb0Var, "ID_PAY_WITH", false, 0, false, 30)), new gu("ID_PAY_WITH_SUBHEADER", 0, 0, 30), null, 0, 126));
                List listC = zhm.u.c(nb0.b(nb0Var, "ID_PAY_WITH_REV_POINTS_ITEM", false, 0, false, 30));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                List listO2 = i2b.a.o(i2b.a.o(listO, listC), yp0.b.h(zhm.u.c(new s7("ID_PAY_NOW_ITEM", 0, 0, 0, 0, false, null, 126)), new gu("paymentSummarySubheaderId", 0, 0, 30), null, 0, 126));
                z.Companion.getClass();
                return new c0(null, listO2, z.f116188c);
            case 4:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return nb0.b(pb0.Companion, "PAYMENT_METHOD_PAYMENT_METHODS_LIST_ID", false, 0, false, 30);
            case 5:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return null;
            case 6:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                aim.e eVarB = zhm.u.b();
                ek ekVar = new ek("HEADER_LOADING_ITEM", 0, 0, 0, 0, false, 122, false);
                yp0.b.l(ekVar, 0, 0, 0, 0, null, false, 63);
                eVarB.add(ekVar);
                nb0 nb0Var2 = pb0.Companion;
                List listK = zhm.v.k(nb0.a(nb0Var2, "LOADING_ITEM_1", false, 6), nb0.a(nb0Var2, "LOADING_ITEM_2", false, 6), nb0.a(nb0Var2, "LOADING_ITEM_3", false, 6));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                return new dn8.d(zhm.u.a(eVarB), false);
            case 7:
                do2.g update = (do2.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return do2.g.a(update, new Data(null, null, true, 3, null), null, null, 6);
            case 8:
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                aim.e eVarB2 = zhm.u.b();
                eVarB2.add(new qi("ID_FORM_TABS_LOADING", 2));
                ArrayList arrayList = new ArrayList(6);
                for (int i = 0; i < 6; i++) {
                    InputTextDelegate.Model model = new InputTextDelegate.Model(a0.d.n("ID_FORM_FIELD_LOADING_", i), null, null, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, true, null, null, null, null, 0, 0, 0, 0, -2, 65471);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(model);
                }
                eVarB2.addAll(arrayList);
                return new do2.j(zhm.u.a(eVarB2), false, false);
            case 9:
                String str = (String) obj2;
                return Boolean.valueOf(str == null || kotlin.text.d0.W(str));
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                int i2 = R$attr.uikit_dp72;
                int i3 = R$attr.uikit_dp24;
                int i5 = R$attr.uikit_dp16;
                ek ekVar2 = new ek("FULL_SCREEN_LOADING", i2, i3, i5, i5, false, 4, false);
                yp0.b.l(ekVar2, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(ekVar2);
            case 11:
                Function0 it13 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return null;
            case 12:
                Function0 it14 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new do8.l(do8.v.a());
            case 13:
                Function0 it15 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return zhm.f0.f322471a;
            case 14:
                FixedTabsDelegate.Model it16 = (FixedTabsDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                Object obj3 = it16.f52345g;
                doc.e0 e0Var = obj3 instanceof doc.e0 ? (doc.e0) obj3 : null;
                if (e0Var != null) {
                    return e0Var.f116496a;
                }
                return null;
            case 15:
                SelectableDelegate.Model it17 = (SelectableDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                Object obj4 = ((RowDelegate.Model) it17.f53305b).u;
                if (obj4 instanceof eoc.d) {
                    return (eoc.d) obj4;
                }
                return null;
            case 16:
                vj0 it18 = (vj0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                Object obj5 = it18.e;
                if (obj5 instanceof eoc.c) {
                    return (eoc.c) obj5;
                }
                return null;
            case 17:
                hoc.h it19 = (hoc.h) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return null;
            case 18:
                z0h.t1 wealthDisclaimersData = (z0h.t1) obj2;
                Intrinsics.checkNotNullParameter(wealthDisclaimersData, "wealthDisclaimersData");
                return new p1(zhm.u.c(new z0h.i(wealthDisclaimersData.f318563a, wealthDisclaimersData.f318564b)), wealthDisclaimersData.f318564b);
            case 19:
                Function0 it20 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return (List) it20.invoke();
            case 20:
                Throwable it21 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return Boolean.FALSE;
            case 21:
                Object[] items = (Object[]) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                ArrayList arrayList2 = new ArrayList(items.length);
                for (Object obj6 : items) {
                    arrayList2.add(obj6);
                }
                return arrayList2;
            case 22:
                List it22 = (List) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                List list = it22;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list, 10));
                Iterator it23 = list.iterator();
                while (it23.hasNext()) {
                    arrayList3.add(zpg.c.a((bqg.b) it23.next()));
                }
                return arrayList3;
            case 23:
                List it24 = (List) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                List list2 = it24;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it25 = list2.iterator();
                while (it25.hasNext()) {
                    arrayList4.add(zpg.c.a((bqg.b) it25.next()));
                }
                return arrayList4;
            case 24:
                return h30.l.q("it", (od0.i) obj2);
            case 25:
                od0.i it26 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                return dqi.g.O(((Number) it26.c()).intValue());
            case 26:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return dr7.k.c((List) getDefaultLoadingItems.invoke());
            case 27:
                RowDelegate.Model model2 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = DocumentsToAcceptScreen.j0;
                Intrinsics.checkNotNullParameter(model2, "model");
                Object obj7 = model2.u;
                if (obj7 instanceof SavingsDocumentToAccept) {
                    return (SavingsDocumentToAccept) obj7;
                }
                return null;
            case 28:
                Function0 it27 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                return new drg.g(drg.m.c());
            default:
                x10 it28 = (x10) obj2;
                KProperty[] kPropertyArr3 = CreditCardInstalmentHubScreen.f69386a0;
                Intrinsics.checkNotNullParameter(it28, "it");
                return it28.f167082b;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f116133a = i;
    }
}

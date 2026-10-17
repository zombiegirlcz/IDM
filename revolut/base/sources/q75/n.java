package q75;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.multibanco.impl.via_verde.data.ViaVerdeEnrollment;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.EnrollmentListScreen;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfo;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import com.revolut.shared.feature.wealth.models.config.Links;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.v7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import o7j.u;
import s77.q;
import u6c.j0;
import u6c.w;
import u6c.x;
import u6c.y;
import z0h.n0;
import z0h.p1;
import z0h.t1;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242755a;

    public /* synthetic */ n(int i) {
        this.f242755a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        int i = 4;
        Object obj3 = null;
        switch (this.f242755a) {
            case 0:
                f it8 = (f) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f242747c;
            case 1:
                return f.a((f) obj2, null, new Data(null, null, true, 3, null), null, 5);
            case 2:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new m((List) getDefaultLoadingItems.invoke(), g.f242748a, null);
            case 3:
                rlm.f Json = (rlm.f) obj2;
                Lazy lazy = q77.a.f242766a;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255100b = false;
                Json.f255101c = true;
                Json.f255099a = true;
                Json.e = true;
                tlm.e eVar = Json.f255103h;
                tlm.f fVar = new tlm.f();
                fVar.h(o0.f186429a.b(s77.q.class), new n(i));
                Unit unit = Unit.f186387a;
                tlm.d dVarA = tlm.h.a(eVar, fVar.a());
                Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
                Json.f255103h = dVarA;
                return Unit.f186387a;
            case 4:
                Lazy lazy2 = q77.a.f242766a;
                return q.e.INSTANCE.serializer();
            case 5:
                fo3.c it9 = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.d;
            case 6:
                CobrandedCardsPlanHubInfo planHubInfo = (CobrandedCardsPlanHubInfo) obj2;
                Intrinsics.checkNotNullParameter(planHubInfo, "planHubInfo");
                return planHubInfo.e.f82411c;
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                List listK = zhm.v.k(new s7("list_id_transactions_summary_1", 0, 0, 0, 0, false, null, 126), new s7("list_id_transactions_summary_2", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                v7.C("list_id_header_transactions", 0, 0, 30, eVarB);
                nb0 nb0Var = pb0.Companion;
                List listK2 = zhm.v.k(nb0.a(nb0Var, "list_id_transaction_0", false, 6), nb0.a(nb0Var, "list_id_transaction_1", false, 6), nb0.a(nb0Var, "list_id_transaction_2", false, 6));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                eVarB.addAll(listK2);
                return zhm.u.a(eVarB);
            case 8:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                v7c.b bVar = (v7c.b) pair.f186385a;
                return new j0(bVar.f286584a, bVar.f286585b, bVar.f286586c, (y) pair.f186386b);
            case 9:
                uib.a it10 = (uib.a) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                int i2 = q7c.e.f242810a[it10.f280366a.ordinal()];
                if (i2 == 1) {
                    return x.f277581a;
                }
                if (i2 == 2) {
                    return w.f277580a;
                }
                if (i2 == 3 || i2 == 4 || i2 == 5) {
                    return u6c.v.f277579a;
                }
                throw new NoWhenBranchMatchedException();
            case 10:
                v7c.b wrappedPaymentMethods = (v7c.b) obj2;
                Intrinsics.checkNotNullParameter(wrappedPaymentMethods, "wrappedPaymentMethods");
                List list = wrappedPaymentMethods.f286584a;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (!(((PaymentMethod) obj4) instanceof PaymentMethod.BankAccount)) {
                        arrayList.add(obj4);
                    }
                }
                return v7c.b.a(wrappedPaymentMethods, arrayList, null, null, 6);
            case 11:
                v7c.b wrappedPaymentMethodsResponse = (v7c.b) obj2;
                Intrinsics.checkNotNullParameter(wrappedPaymentMethodsResponse, "wrappedPaymentMethodsResponse");
                Iterator it11 = wrappedPaymentMethodsResponse.f286584a.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        Object next = it11.next();
                        if (Intrinsics.f(((PaymentMethod) next).getF84393a(), wrappedPaymentMethodsResponse.f286585b)) {
                            obj3 = next;
                        }
                    }
                }
                Object objC = (PaymentMethod) obj3;
                od0.h hVar = od0.i.Companion;
                if ((objC instanceof PaymentMethod.RevolutAccount) && (str = wrappedPaymentMethodsResponse.f286586c) != null) {
                    objC = com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.k.c((PaymentMethod.RevolutAccount) objC, str);
                }
                hVar.getClass();
                return od0.h.a(objC);
            case 12:
                do3.n it12 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.k;
            case 13:
                nec.c wrappedShippingContacts = (nec.c) obj2;
                Intrinsics.checkNotNullParameter(wrappedShippingContacts, "wrappedShippingContacts");
                ShippingContact shippingContact = wrappedShippingContacts.f214430c;
                od0.i.Companion.getClass();
                return od0.h.a(shippingContact);
            case 14:
                l71.d it13 = (l71.d) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return hb9.b.C(it13.a());
            case 15:
                pcd.x it14 = (pcd.x) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return q8e.b.b(it14);
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return Boolean.FALSE;
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return u.a.f222878a;
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                bw0.h hVar2 = new bw0.h("", null, null, false, null, Boolean.FALSE, false, false, bw0.e.None, null, null, null, 31190);
                bw0.m.Companion.getClass();
                return zhm.u.c(new CenteredAmountDelegate.Model("LOADING_INPUT", textClause, hVar2, null, bw0.k.a(), null, null, true, false, null, null, 1384));
            case 19:
                IllegalStateException illegalStateException = new IllegalStateException("SkywalkerRepository fetchAndActivate should not be called without authorization");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "SkywalkerRepositoryImpl", null, illegalStateException, h0Var);
                return Unit.f186387a;
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                nb0 nb0Var2 = pb0.Companion;
                List listK3 = zhm.v.k(nb0.a(nb0Var2, "ONLINE_PAYMENT_LIST_ID_loading", false, 6), nb0.a(nb0Var2, "OWNERSHIP_LIST_ID_loading", false, 6));
                yp0.b.k(listK3, 0, 0, 0, 0, 31);
                return listK3;
            case 21:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 22:
                List indexes = (List) obj2;
                Intrinsics.checkNotNullParameter(indexes, "indexes");
                List<lel.b> list2 = indexes;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                for (lel.b bVar2 : list2) {
                    arrayList2.add(new k77.k(bVar2.f194590b, bVar2.f194589a));
                }
                return arrayList2;
            case 23:
                q87.j it15 = (q87.j) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f;
            case 24:
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                if (it16.isEmpty()) {
                    return new go.g(f0.f322471a, 2);
                }
                Flow[] flowArr = (Flow[]) it16.toArray(new Flow[0]);
                return new j23.b((Flow[]) Arrays.copyOf(flowArr, flowArr.length), 14);
            case 25:
                t1 disclaimersData = (t1) obj2;
                Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
                Links links = disclaimersData.f318563a;
                hel.b bVar3 = disclaimersData.f318564b;
                return new p1(zhm.u.c(new n0(links, bVar3)), bVar3);
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 27:
                RowDelegate.Model it17 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = EnrollmentListScreen.S;
                Intrinsics.checkNotNullParameter(it17, "it");
                Object obj5 = it17.u;
                if (obj5 instanceof ViaVerdeEnrollment) {
                    return (ViaVerdeEnrollment) obj5;
                }
                return null;
            case 28:
                q92.a update = (q92.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data enrollments = Data.copy$default(update.f243634a, null, null, true, 3, null);
                Intrinsics.checkNotNullParameter(enrollments, "enrollments");
                return new q92.a(enrollments);
            default:
                Function0 getDefaultLoadingItems3 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems3, "getDefaultLoadingItems");
                return new q92.b((List) getDefaultLoadingItems3.invoke());
        }
    }

    public /* synthetic */ n(Object obj2, int i) {
        this.f242755a = i;
    }
}

package a09;

import androidx.compose.ui.text.input.TextFieldValue;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.credit.CreditRecurringPaymentsDto;
import com.revolut.data.network.models.credit.PayLaterUpcomingPaymentsDto;
import com.revolut.data.network.models.recurringpayment.AffectedSubscriptionDto;
import com.revolut.data.network.models.recurringpayment.AffectedSubscriptionsDto;
import com.revolut.feature.retail.savings.api.domain.interactors.SavingsDisclaimersClickAction;
import com.revolut.feature.trade_rev_points.api.R$string;
import com.revolut.feature_exchange.impl.ui.exchange.order_summary.cryptocommodity.OrderSummaryCryptoCommodityContract$AutoStakingDialogParcel;
import com.revolut.feature_exchange.impl.ui.exchange.order_summary.cryptocommodity.OrderSummaryCryptoCommodityContract$AutoStakingWarmupParcel;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.disclaimer.SavingsDisclaimerScreen;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241a;

    public /* synthetic */ a(int i) {
        this.f241a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        u09.j jVar;
        switch (this.f241a) {
            case 0:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "params");
                throw null;
            case 1:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "params");
                throw null;
            case 2:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "params");
                throw null;
            case 3:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "params");
                throw null;
            case 4:
                rz8.f fVar = (rz8.f) obj2;
                Intrinsics.checkNotNullParameter(fVar, "<destruct>");
                List<rz8.c> list = fVar.f258527a;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (rz8.c cVar : list) {
                    Object obj3 = nz8.b.f220991a;
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    String str = cVar.f258523b;
                    String str2 = cVar.f258522a;
                    rz8.h hVar = cVar.e;
                    Intrinsics.checkNotNullParameter(hVar, "<this>");
                    int i = nz8.a.f220990a[hVar.ordinal()];
                    if (i == 1) {
                        jVar = u09.j.LIST_SMALL;
                    } else if (i == 2) {
                        jVar = u09.j.LIST_LARGE;
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jVar = u09.j.GRID;
                    }
                    u09.j jVar2 = jVar;
                    List list2 = cVar.f258524c;
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(nz8.d.A((qz8.i) it8.next()));
                    }
                    List list3 = cVar.d;
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                    Iterator it9 = list3.iterator();
                    while (it9.hasNext()) {
                        arrayList3.add(cp5.d.W((pz8.g) it9.next()));
                    }
                    arrayList.add(new u09.i(str, str2, jVar2, arrayList2, arrayList3));
                }
                return arrayList;
            case 5:
                qz8.l lVar = (qz8.l) obj2;
                Intrinsics.checkNotNullParameter(lVar, "<destruct>");
                List list4 = lVar.f250397a;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                Iterator it10 = list4.iterator();
                while (it10.hasNext()) {
                    arrayList4.add(nz8.d.A((qz8.i) it10.next()));
                }
                return arrayList4;
            case 6:
                sz8.f fVar2 = (sz8.f) obj2;
                Intrinsics.h(fVar2);
                Intrinsics.checkNotNullParameter(fVar2, "<this>");
                List list5 = fVar2.f266780a;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
                Iterator it11 = list5.iterator();
                while (it11.hasNext()) {
                    arrayList5.add(new u09.w(cp5.d.W(((sz8.c) it11.next()).f266777a)));
                }
                return arrayList5;
            case 7:
                tz8.f fVar3 = (tz8.f) obj2;
                Intrinsics.checkNotNullParameter(fVar3, "<destruct>");
                List<tz8.c> list6 = fVar3.f275897a;
                ArrayList arrayList6 = new ArrayList(zhm.w.t(list6, 10));
                for (tz8.c cVar2 : list6) {
                    Intrinsics.checkNotNullParameter(cVar2, "<this>");
                    arrayList6.add(new u09.p(cVar2.f275893b, cVar2.e, cVar2.f275892a, cp5.d.W(cVar2.d), cVar2.f275894c));
                }
                return arrayList6;
            case 8:
                IntRange intRangeU = t61.a.u((Function0) obj2, "it", 1, 5, 1);
                ArrayList arrayList7 = new ArrayList(zhm.w.t(intRangeU, 10));
                vim.f it12 = intRangeU.iterator();
                while (it12.f289625c) {
                    arrayList7.add(new s7(a0.d.n("LOADING_CRYPTO_DETAILS_", it12.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList7, 0, 0, 0, 0, 31);
                return arrayList7;
            case 9:
                MatchResult matchResult = (MatchResult) obj2;
                List list7 = a10.e.f448a;
                return a10.e.a(kotlin.text.z.m((String) a10.b.n(matchResult, "match", 1)), kotlin.text.z.m((String) matchResult.c().get(2)), kotlin.text.z.m((String) matchResult.c().get(3)));
            case 10:
                rlm.f Json = (rlm.f) obj2;
                Lazy lazy = a19.g.f567a;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                Json.f255100b = false;
                return Unit.f186387a;
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                InputTextDelegate.Model model = new InputTextDelegate.Model("MEMBERSHIP_NUMBER_INPUT_ITEM_ID", null, new TextLocalisedClause(R$string.miles_account_registration_section_membership_title, null, null, 14), null, false, null, null, null, null, null, null, false, null, null, false, false, 2, 6, null, false, true, null, true, zhm.u.c(new mp0.d(20)), false, false, true, null, null, 0, -1684013062, 65471);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return new a2f.i(zhm.u.c(model), null, null, null, false, null);
            case 12:
                Throwable it13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it13, h0Var);
                return Boolean.TRUE;
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 14:
                LargeActionButtonDelegate.Model it14 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(it14.i instanceof OrderSummaryCryptoCommodityContract$AutoStakingDialogParcel);
            case 15:
                CellDetailsActionDelegate.Model it15 = (CellDetailsActionDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f51787l;
            case 16:
                CellDetailsDelegate.Model it16 = (CellDetailsDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                Object obj4 = it16.o;
                if (obj4 instanceof OrderSummaryCryptoCommodityContract$AutoStakingWarmupParcel) {
                    return (OrderSummaryCryptoCommodityContract$AutoStakingWarmupParcel) obj4;
                }
                return null;
            case 17:
                ty0.a it17 = (ty0.a) obj2;
                int i2 = SavingsDisclaimerScreen.V;
                Intrinsics.checkNotNullParameter(it17, "it");
                Object obj5 = it17.d;
                if (obj5 instanceof SavingsDisclaimersClickAction) {
                    return (SavingsDisclaimersClickAction) obj5;
                }
                return null;
            case 18:
                return TextFieldValue.Saver$lambda$1(obj2);
            case 19:
                vf0.h hVar2 = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar2, "<destruct>");
                List list8 = (List) hVar2.f288433a;
                List list9 = (List) hVar2.f288434b;
                List list10 = list9;
                return zhm.d0.E0((List) hVar2.d, zhm.d0.E0((List) hVar2.f288435c, zhm.d0.E0(list10, list8)));
            case 20:
                CreditRecurringPaymentsDto it18 = (CreditRecurringPaymentsDto) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.getRecurringPayments();
            case 21:
                AffectedSubscriptionsDto dto = (AffectedSubscriptionsDto) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                List<AffectedSubscriptionDto> affectedSubscriptions = dto.getAffectedSubscriptions();
                ArrayList arrayList8 = new ArrayList(zhm.w.t(affectedSubscriptions, 10));
                Iterator<T> it19 = affectedSubscriptions.iterator();
                while (it19.hasNext()) {
                    arrayList8.add(((AffectedSubscriptionDto) it19.next()).getId());
                }
                return arrayList8;
            case 22:
                CreditRecurringPaymentsDto it20 = (CreditRecurringPaymentsDto) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.getRecurringPayments();
            case 23:
                PayLaterUpcomingPaymentsDto it21 = (PayLaterUpcomingPaymentsDto) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.getUpcomingPayments();
            case 24:
                List payments = (List) obj2;
                Intrinsics.checkNotNullParameter(payments, "payments");
                ArrayList arrayList9 = new ArrayList();
                for (Object obj6 : payments) {
                    if (!qua.u.E((qua.p) obj6)) {
                        arrayList9.add(obj6);
                    }
                }
                return arrayList9;
            case 25:
                List payments2 = (List) obj2;
                Intrinsics.checkNotNullParameter(payments2, "payments");
                ArrayList arrayList10 = new ArrayList();
                for (Object obj7 : payments2) {
                    qua.p pVar = (qua.p) obj7;
                    if (qua.u.E(pVar) && !qua.u.k(pVar)) {
                        arrayList10.add(obj7);
                    }
                }
                return arrayList10;
            case 26:
                Object[] array = (Object[]) obj2;
                Intrinsics.checkNotNullParameter(array, "array");
                ArrayList arrayList11 = new ArrayList(array.length);
                for (Object obj8 : array) {
                    Intrinsics.i(obj8, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.feature.recurring_payments.api.data.models.RecurringPayment>");
                    arrayList11.add((List) obj8);
                }
                return zhm.w.u(arrayList11);
            case 27:
                a32.m update = (a32.m) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return a32.m.a(update, Data.copy$default(update.f1029b, null, null, true, 3, null), null, null, 29);
            case 28:
                a32.m it22 = (a32.m) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.d;
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new a32.q(iii.c.c(1), false);
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f241a = i;
    }
}

package ej6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance.api.models.CFACClaimExpense;
import com.revolut.feature.insurance.impl.ui.cfac.claim.review_claim.CFACInsuranceReviewClaimScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.shared.CFACInsuranceAddExpensesItemMapper;
import com.revolut.feature.wallets.api.module.WalletLimit;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import ej9.d;
import ip0.x10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zh9.r0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126760a;

    public /* synthetic */ x(int i) {
        this.f126760a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z = true;
        switch (this.f126760a) {
            case 0:
                l it8 = (l) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f126745c;
            case 1:
                l it9 = (l) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new Pair(it9.f126745c, it9.d);
            case 2:
                l it10 = (l) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.e;
            case 3:
                List plans = (List) obj2;
                Intrinsics.checkNotNullParameter(plans, "plans");
                List list = plans;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it11 = list.iterator();
                while (it11.hasNext()) {
                    arrayList.add(ii9.a.a((ki9.a) it11.next()));
                }
                return zi0.c.P(arrayList, false, null, 3);
            case 4:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return new Data(null, error, false, 5, null);
            case 5:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Data data = (Data) pair.f186385a;
                Data data2 = (Data) pair.f186386b;
                List list2 = (List) data.getContent();
                if (list2 == null) {
                    list2 = (List) data2.getContent();
                }
                Throwable thA = ej9.p.a(data.getError(), data2.getError());
                if (!data.getLoading() && !data2.getLoading()) {
                    z = false;
                }
                return new Data(list2, thA, z);
            case 6:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                ki9.a aVar = (ki9.a) zhm.d0.d0(it12);
                return zi0.c.P(aVar != null ? ii9.a.a(aVar) : null, false, null, 3);
            case 7:
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                return new Data(null, error2, false, 5, null);
            case 8:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                od0.h hVar = od0.i.Companion;
                ki9.a aVar2 = (ki9.a) zhm.d0.d0(it13);
                r0 r0VarA = aVar2 != null ? ii9.a.a(aVar2) : null;
                hVar.getClass();
                return od0.h.a(r0VarA);
            case 9:
                List plans2 = (List) obj2;
                Intrinsics.checkNotNullParameter(plans2, "plans");
                List list3 = plans2;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it14 = list3.iterator();
                while (it14.hasNext()) {
                    arrayList2.add(ii9.a.a((ki9.a) it14.next()));
                }
                return arrayList2;
            case 10:
                d.a it15 = (d.a) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                it15.getClass();
                return "PAY_LATER_ACCOUNT_CONFIG";
            case 11:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return "SWITCH_OPTIONS";
            case 12:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return "PAYMENT_INSTALMENT_TYPES";
            case 13:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return "PAYMENT_OPTIONS";
            case 14:
                Intrinsics.checkNotNullParameter((dj9.u) obj2, "it");
                return Unit.f186387a;
            case 15:
                ej9.h it16 = (ej9.h) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f126812b;
            case 16:
                ej9.i it17 = (ej9.i) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f126814b;
            case 17:
                List limits = (List) obj2;
                Intrinsics.checkNotNullParameter(limits, "limits");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : limits) {
                    if (obj3 instanceof WalletLimit.CounterLimit) {
                        arrayList3.add(obj3);
                    }
                }
                return arrayList3;
            case 18:
                RowDelegate.Model it18 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = CFACInsuranceReviewClaimScreen.f75097h0;
                Intrinsics.checkNotNullParameter(it18, "it");
                Object obj4 = it18.u;
                if (obj4 instanceof CFACInsuranceAddExpensesItemMapper.AddExpenses) {
                    return (CFACInsuranceAddExpensesItemMapper.AddExpenses) obj4;
                }
                return null;
            case 19:
                x10 it19 = (x10) obj2;
                KProperty[] kPropertyArr2 = CFACInsuranceReviewClaimScreen.f75097h0;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Boolean.valueOf(Intrinsics.f(it19.f167082b.f58316a, "ID_SUPPORTING_DOCUMENTS_ACTION"));
            case 20:
                RowDelegate.Model it20 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = CFACInsuranceReviewClaimScreen.f75097h0;
                Intrinsics.checkNotNullParameter(it20, "it");
                Object obj5 = it20.u;
                CFACClaimExpense cFACClaimExpense = obj5 instanceof CFACClaimExpense ? (CFACClaimExpense) obj5 : null;
                if (cFACClaimExpense != null) {
                    return cFACClaimExpense.f74926a;
                }
                return null;
            case 21:
                ek7.i updateState = (ek7.i) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return ek7.i.a(updateState, null, null, null, null, true ^ updateState.f126966j, false, false, 3583);
            case 22:
                ek7.i updateState2 = (ek7.i) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return ek7.i.a(updateState2, null, null, null, null, false, !updateState2.k, false, 3071);
            case 23:
                ek7.i updateState3 = (ek7.i) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return ek7.i.a(updateState3, null, null, null, null, false, false, !updateState3.f126967l, 2047);
            case 24:
                ek7.i updateState4 = (ek7.i) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                dj0.d.Companion.getClass();
                dj0.d dVar = dj0.d.e;
                return ek7.i.a(updateState4, null, null, zi0.c.P(new ui7.b(new ui7.a(dVar, dVar), zhm.f0.f322471a), false, null, 3), null, false, false, false, 3967);
            case 25:
                zm3.j it21 = (zm3.j) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.f323363h;
            case 26:
                zm3.j it22 = (zm3.j) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.f323363h;
            case 27:
                od0.i it23 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return (TradingAccount) it23.f224257a;
            case 28:
                Intrinsics.checkNotNullParameter((aii.r) obj2, "it");
                return Unit.f186387a;
            default:
                Intrinsics.checkNotNullParameter((hha.d) obj2, "<unused var>");
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ x(ej9.p pVar) {
        this.f126760a = 5;
    }
}

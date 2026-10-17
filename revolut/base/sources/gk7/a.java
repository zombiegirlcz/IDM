package gk7;

import android.database.Cursor;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.OpenBankingConsentsFlowContract$FlowType;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.OpenBankingConsentsFlowContract$Step;
import com.revolut.feature.insurance.impl.ui.cfac.claim.select_expenses.CFACInsuranceSelectExpensesScreen;
import com.revolut.feature.spending_analytics.api.models.AnalyticsParticipant;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.explanation.CashHoldingFundsExplanationScreen;
import efm.r;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import n38.y;
import org.joda.time.LocalDate;
import tof.a3;
import zh9.i0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144328a;

    public /* synthetic */ a(int i) {
        this.f144328a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f144328a) {
            case 0:
                SelectableDelegate.Model it8 = (SelectableDelegate.Model) obj2;
                KProperty[] kPropertyArr = CFACInsuranceSelectExpensesScreen.c0;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj3 = ((RowDelegate.Model) it8.f53305b).u;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.transactions.models.Transaction");
                return (a3) obj3;
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return n.b();
            case 2:
                od0.i it9 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (i0) it9.f224257a;
            case 3:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new gk9.g(((i0) pair.f186385a).f322286b, (List) pair.f186386b);
            case 4:
                IntRange intRangeU = t61.a.u((Function0) obj2, "<unused var>", 1, 3, 1);
                ArrayList arrayList = new ArrayList(w.t(intRangeU, 10));
                vim.f it10 = intRangeU.iterator();
                while (it10.f289625c) {
                    arrayList.add(t61.a.o("loading_id_", it10.nextInt(), pb0.Companion, false, 6));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                List listC = u.c(CounterTextDelegate.Model.Companion.b(CounterTextDelegate.Model.INSTANCE, "price_loading_id", CounterTextDelegate.d.b.C0401b.f52175a, 0, 0, 0, 0, 124));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return d0.E0(arrayList, listC);
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return null;
            case 6:
                Cursor cursor = (Cursor) obj2;
                Intrinsics.checkNotNullParameter(cursor, "cursor");
                return r.fromIterable(a.a.d(cursor));
            case 7:
                a.a.z((Cursor) obj2);
                return Unit.f186387a;
            case 8:
                Cursor cursor2 = (Cursor) obj2;
                Intrinsics.checkNotNullParameter(cursor2, "cursor");
                return r.fromIterable(a.a.d(cursor2));
            case 9:
                a.a.z((Cursor) obj2);
                return Unit.f186387a;
            case 10:
                Boolean permissionProvided = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(permissionProvided, "permissionProvided");
                permissionProvided.booleanValue();
                return permissionProvided;
            case 11:
                Cursor cursor3 = (Cursor) obj2;
                Intrinsics.checkNotNullParameter(cursor3, "cursor");
                return r.fromIterable(a.a.d(cursor3));
            case 12:
                Boolean permissionProvided2 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(permissionProvided2, "permissionProvided");
                permissionProvided2.booleanValue();
                return permissionProvided2;
            case 13:
                Cursor cursor4 = (Cursor) obj2;
                Intrinsics.checkNotNullParameter(cursor4, "cursor");
                return r.fromIterable(a.a.d(cursor4));
            case 14:
                a.a.z((Cursor) obj2);
                return Unit.f186387a;
            case 15:
                Cursor cursor5 = (Cursor) obj2;
                Intrinsics.checkNotNullParameter(cursor5, "cursor");
                return r.fromIterable(a.a.d(cursor5));
            case 16:
                a.a.z((Cursor) obj2);
                return Unit.f186387a;
            case 17:
                a.a.z((Cursor) obj2);
                return Unit.f186387a;
            case 18:
                ((Long) obj2).getClass();
                return "?";
            case 19:
                do3.n nVar = (do3.n) obj2;
                Intrinsics.h(nVar);
                wi0.b.Companion.getClass();
                return te0.w.S(nVar, wi0.b.f297756l) ? new OpenBankingConsentsFlowContract$Step.ClientsList(OpenBankingConsentsFlowContract$FlowType.Australia.f72741a) : new OpenBankingConsentsFlowContract$Step.ClientsList(OpenBankingConsentsFlowContract$FlowType.Default.f72742a);
            case 20:
                koi.j it11 = (koi.j) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.getF55254b();
            case 21:
                CellDetailsDelegate.Model it12 = (CellDetailsDelegate.Model) obj2;
                int i = CashHoldingFundsExplanationScreen.U;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f51832a;
            case 22:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                n38.a aVar = (n38.a) pair2.f186385a;
                String str = (String) pair2.f186386b;
                ArrayList arrayList2 = aVar.d;
                Iterable iterable = arrayList2.size() >= 2 ? arrayList2 : null;
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                Iterable<y> iterable2 = iterable;
                ArrayList arrayList3 = new ArrayList(w.t(iterable2, 10));
                for (y yVar : iterable2) {
                    String str2 = yVar.f211967a;
                    arrayList3.add(new AnalyticsParticipant(str2, yVar.f211969c, yVar.d, yVar.e, Intrinsics.f(str2, str)));
                }
                return arrayList3;
            case 23:
                do3.n it13 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f116408a;
            case 24:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                LocalDate localDate = (LocalDate) pair3.f186385a;
                return Boolean.valueOf(localDate.getDayOfMonth() != localDate.dayOfMonth().getMaximumValue());
            case 25:
                List commodities = (List) obj2;
                Intrinsics.checkNotNullParameter(commodities, "commodities");
                List list = commodities;
                ArrayList arrayList4 = new ArrayList(w.t(list, 10));
                Iterator it14 = list.iterator();
                while (it14.hasNext()) {
                    arrayList4.add(new p5d.b(((jih.a) it14.next()).f174489a.f306286a, "commodity", null));
                }
                return arrayList4;
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return klh.c.b();
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listK = v.k(new ip0.a3("loading_1"), new ip0.a3("loading_2"), new ip0.a3("loading_3"));
                yp0.b.k(listK, R$attr.uikit_dp24, 0, 0, 0, 30);
                return listK;
            case 28:
                lpi.c result = (lpi.c) obj2;
                Intrinsics.checkNotNullParameter(result, "it");
                Intrinsics.checkNotNullParameter(result, "result");
                return new sm.c();
            default:
                od0.i it15 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new sm.b((String) it15.g());
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f144328a = i;
    }
}

package rxb;

import ce9.p;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.cryptocommodity_invest.impl.ui.standalone_symbol.screen.StandaloneSymbolCustomisationScreen;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.statements.api.models.ProductItemStatementPeriod;
import com.revolut.feature.statements.api.models.ProductStatementPeriod;
import com.revolut.feature.statements.api.models.ProductStatementPeriods;
import com.revolut.feature.statements.api.models.StatementProductType;
import com.revolut.feature.statements.api.models.StatementUrlState;
import hxb.f0;
import ip0.pb0;
import java.net.ConnectException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import m1c.q1;
import ryd.m;
import vxb.d0;
import vxb.y;
import zhm.h0;
import zhm.r0;
import zhm.u;
import zhm.w;
import zw7.h1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258112a;

    public /* synthetic */ b(int i) {
        this.f258112a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f258112a) {
            case 0:
                Intrinsics.checkNotNullParameter((al0.a) obj2, "it");
                return new ConnectException("ConnectionRepository check for internet connection failed");
            case 1:
                Throwable th10 = (Throwable) obj2;
                Intrinsics.h(th10);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                return Unit.f186387a;
            case 2:
                d0 it8 = (d0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8.f292934b);
            case 3:
                Object[] result = (Object[]) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                ArrayList arrayList = new ArrayList(result.length);
                for (Object obj3 : result) {
                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.rev_points.models.RevPointsTransaction");
                    arrayList.add((RevPointsTransaction) obj3);
                }
                return arrayList;
            case 4:
                List cachedTransactions = (List) obj2;
                Intrinsics.checkNotNullParameter(cachedTransactions, "cachedTransactions");
                return new q1(cachedTransactions, false);
            case 5:
                List it9 = (List) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                List list = it9;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                Iterator it10 = list.iterator();
                while (it10.hasNext()) {
                    arrayList2.add(gxb.d.d((y) it10.next()));
                }
                return arrayList2;
            case 6:
                List cachedTransactions2 = (List) obj2;
                Intrinsics.checkNotNullParameter(cachedTransactions2, "cachedTransactions");
                return new q1(cachedTransactions2, false);
            case 7:
                efm.i observable = (efm.i) obj2;
                Intrinsics.checkNotNullParameter(observable, "observable");
                return observable.b(100L, TimeUnit.MILLISECONDS);
            case 8:
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11.isEmpty());
            case 9:
                efm.i observable2 = (efm.i) obj2;
                Intrinsics.checkNotNullParameter(observable2, "observable");
                return observable2.b(100L, TimeUnit.MILLISECONDS);
            case 10:
                al0.a networkState = (al0.a) obj2;
                Intrinsics.checkNotNullParameter(networkState, "networkState");
                return Boolean.valueOf(networkState == al0.a.ONLINE);
            case 11:
                Intrinsics.checkNotNullParameter((al0.a) obj2, "it");
                return new ConnectException("ConnectionRepository check for internet connection failed");
            case 12:
                f0 it12 = (f0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return gxb.d.c(it12);
            case 13:
                f0 it13 = (f0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return gxb.d.c(it13);
            case 14:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(it14.isEmpty());
            case 15:
                List it15 = (List) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(it15.isEmpty());
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 17:
                RowDelegate.Model it16 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = StandaloneSymbolCustomisationScreen.S;
                Intrinsics.checkNotNullParameter(it16, "it");
                Object obj4 = it16.u;
                if (obj4 instanceof Pair) {
                    return (Pair) obj4;
                }
                return null;
            case 18:
                ry5.f update = (ry5.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                p pagingState = new p(null, null, 61);
                String query = update.f258228b;
                Intrinsics.checkNotNullParameter(pagingState, "pagingState");
                Intrinsics.checkNotNullParameter(query, "query");
                return new ry5.f(pagingState, query);
            case 19:
                h1 quote = (h1) obj2;
                Intrinsics.checkNotNullParameter(quote, "quote");
                return quote.d;
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                CounterTextDelegate.Model model = new CounterTextDelegate.Model("COUNTER_TEXT_LOADING_LIST_ID", null, CounterTextDelegate.c.a.f52173a, null, false, null, null, 0, 0, 0, 0, 2024);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                IntRange intRange = new IntRange(0, 2, 1);
                ArrayList arrayList3 = new ArrayList(w.t(intRange, 10));
                vim.f it17 = intRange.iterator();
                while (it17.f289625c) {
                    arrayList3.add(new pb0(a0.d.n("loading_item_", it17.nextInt())));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                return new rya.k(null, null, ue0.e.J(model, arrayList3));
            case 21:
                io3.d it18 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Integer.valueOf(it18.f.ordinal());
            case 22:
                io3.d it19 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.d;
            case 23:
                StatementUrlState it20 = (StatementUrlState) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return (StatementUrlState.Ready) it20;
            case 24:
                c71.b info = (c71.b) obj2;
                Intrinsics.checkNotNullParameter(info, "info");
                return info.f21829c;
            case 25:
                io3.d pocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                return new ProductStatementPeriods(ryd.w.i, u.c(new ProductStatementPeriod("PERSONAL_CURRENT_ANNUAL_FEE", pocket.f163150j, null, null)));
            case 26:
                io3.d pocket2 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket2, "pocket");
                return new ProductStatementPeriods(ryd.w.i, u.c(new ProductStatementPeriod("JOINT_CURRENT_ANNUAL_FEE", pocket2.f163150j, null, null)));
            case 27:
                Data it21 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                if (it21.getContent() instanceof StatementUrlState.InPreparation) {
                    throw new m();
                }
                return it21;
            case 28:
                List sourcePairs = (List) obj2;
                Intrinsics.checkNotNullParameter(sourcePairs, "sourcePairs");
                return r0.t(sourcePairs);
            default:
                List juniorWalletsWithPockets = (List) obj2;
                Intrinsics.checkNotNullParameter(juniorWalletsWithPockets, "juniorWalletsWithPockets");
                StatementProductType statementProductType = StatementProductType.JUNIOR;
                List<Pair> list2 = juniorWalletsWithPockets;
                ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                for (Pair pair : list2) {
                    fo3.c cVar = (fo3.c) pair.f186385a;
                    Iterator it22 = ((List) pair.f186386b).iterator();
                    if (!it22.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    LocalDate localDate = ((io3.d) it22.next()).f163150j;
                    while (it22.hasNext()) {
                        LocalDate localDate2 = ((io3.d) it22.next()).f163150j;
                        if (localDate.compareTo((Object) localDate2) > 0) {
                            localDate = localDate2;
                        }
                    }
                    String str = cVar.f136805h;
                    if (str == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    arrayList4.add(new ProductItemStatementPeriod(str, localDate, null));
                }
                return new Pair(statementProductType, zhm.d0.i1(arrayList4));
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f258112a = i;
    }
}

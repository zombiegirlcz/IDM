package loc;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.q;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChart;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint;
import com.revolut.retail.trading.core.domain.orders.InvestCommodityOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import cr9.l;
import he3.m;
import he3.n;
import he3.p;
import he3.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import jp8.d;
import kii.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lol.f;
import ls4.k;
import org.jmrtd.lds.LDSFile;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import tsl.g;
import vf0.h;
import yhm.r;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f197445a;

    public /* synthetic */ a(int i) {
        this.f197445a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        SQLiteStatement sQLiteStatementPrepare;
        p mVar;
        InvestTransactionsFilter.InvestTransactionsFilterImpl investTransactionsFilterImpl;
        switch (this.f197445a) {
            case 0:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new koc.c((TotalValueChart) rVar.f314201a, (del.b) rVar.f314202b, (List) rVar.f314203c);
            case 1:
                return f0.f322471a;
            case 2:
                TotalValueChart totalValueChart = (TotalValueChart) obj2;
                Intrinsics.checkNotNullParameter(totalValueChart, "totalValueChart");
                DateTime dateTime = totalValueChart.f95002a;
                DateTime dateTime2 = totalValueChart.f95003b;
                List<TotalValueChartPoint> list = totalValueChart.f95004c;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (TotalValueChartPoint totalValueChartPoint : list) {
                    arrayList.add(new TotalValueChartPoint(totalValueChartPoint.f95006b, totalValueChartPoint.f95007c, totalValueChartPoint.f95005a));
                }
                return new TotalValueChart(totalValueChart.d, totalValueChart.e, arrayList, dateTime, dateTime2);
            case 3:
                f updateState = (f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return f.a(updateState, null, !updateState.f197468b, false, 5);
            case 4:
                f updateState2 = (f) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return f.a(updateState2, null, false, false, 3);
            case 5:
                f updateState3 = (f) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return f.a(updateState3, null, false, false, 3);
            case 6:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Intrinsics.checkNotNullParameter(it8, "<this>");
                List<d> list2 = it8;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                for (d dVar : list2) {
                    Intrinsics.checkNotNullParameter(dVar, "<this>");
                    long amount = dVar.getAmount();
                    xi0.a aVar = xi0.b.Companion;
                    String currency = dVar.getCurrency();
                    aVar.getClass();
                    arrayList2.add(new dp8.f(new dj0.d(amount, xi0.a.a(currency))));
                }
                return arrayList2;
            case 7:
                ArrayList arrayListP = e.p((Function0) obj2, "<unused var>", 3);
                for (int i = 0; i < 3; i++) {
                    arrayListP.add(new q(a0.d.n("id_screener_collections_loading_", i), Tabs.c.a.f58897a, 50));
                }
                return new lph.b(null, arrayListP);
            case 8:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 9:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT MAX(date) FROM balance_history");
                try {
                    Long lValueOf = null;
                    if (sQLiteStatementPrepare.step() && !sQLiteStatementPrepare.isNull(0)) {
                        lValueOf = Long.valueOf(sQLiteStatementPrepare.getLong(0));
                        break;
                    }
                    return lValueOf;
                } finally {
                }
            case 10:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM balance_history");
                try {
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                }
            case 11:
                List billDtos = (List) obj2;
                Intrinsics.checkNotNullParameter(billDtos, "billDtos");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : billDtos) {
                    if (!(((l) obj3) instanceof l.c)) {
                        arrayList3.add(obj3);
                    }
                }
                return arrayList3;
            case 12:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return zi0.c.P((mq9.e) pair.f186385a, false, null, 3);
            case 13:
                List messages = (List) obj2;
                Intrinsics.checkNotNullParameter(messages, "messages");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : messages) {
                    if (((MessageItem) obj4).getF79534g()) {
                        arrayList4.add(obj4);
                    }
                }
                return arrayList4;
            case 14:
                Intrinsics.checkNotNullParameter((PaymentGroup) obj2, "it");
                return Unit.f186387a;
            case 15:
                mq9.e network = (mq9.e) obj2;
                Intrinsics.checkNotNullParameter(network, "network");
                return zi0.c.P(network, false, null, 2);
            case 16:
                h hVar = (h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                return new mq9.e((List) hVar.f288433a, (List) hVar.f288434b, (List) hVar.f288435c, (List) hVar.d);
            case 17:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                mq9.e.Companion.getClass();
                return zi0.c.P(mq9.e.e, false, it9, 1);
            case 18:
                Intrinsics.checkNotNullParameter((PaymentGroup) obj2, "it");
                return Unit.f186387a;
            case 19:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return zi0.c.P((mq9.c) pair2.f186385a, false, null, 3);
            case 20:
                r rVar2 = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                return new mq9.c((PaymentGroup) rVar2.f314201a, (List) rVar2.f314202b, (List) rVar2.f314203c);
            case 21:
                Function0 defaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultLoadingItems, "defaultLoadingItems");
                return new ls4.l((List) defaultLoadingItems.invoke(), new k(null, false));
            case 22:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                throw it10;
            case 23:
                uzi.b it11 = (uzi.b) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                Intrinsics.checkNotNullParameter(it11, "<this>");
                uzi.c cVar = it11.f284679a;
                int i2 = it11.f284680b;
                int i3 = jsj.a.f178182a[cVar.ordinal()];
                if (i3 == 1) {
                    mVar = new m(i2, t.SAME_DAY);
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVar = new n(i2);
                }
                LocalDate localDateNow = LocalDate.now();
                Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
                return new lsj.b(new uzi.d(ee3.a.b(mVar, localDateNow)), mVar);
            case 24:
                InvestOrder it12 = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(com.revolut.retail.trading.core.domain.orders.a.l(it12) && (it12 instanceof InvestCommodityOrder));
            case 25:
                InvestOrder it13 = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new tsl.a((InvestCommodityOrder) it13);
            case 26:
                tsl.a investOrderWrapper = (tsl.a) obj2;
                Intrinsics.checkNotNullParameter(investOrderWrapper, "investOrderWrapper");
                InvestCommodityOrder investCommodityOrder = investOrderWrapper.f274171a;
                if (oi0.d.B(investCommodityOrder.f104512j)) {
                    InvestTransactionsFilter.Companion companion = InvestTransactionsFilter.INSTANCE;
                    String standingOrderId = investCommodityOrder.f104507a;
                    companion.getClass();
                    Intrinsics.checkNotNullParameter(standingOrderId, "standingOrderId");
                    investTransactionsFilterImpl = new InvestTransactionsFilter.InvestTransactionsFilterImpl(null, null, null, null, standingOrderId, null, null, LDSFile.EF_DG15_TAG);
                } else {
                    investTransactionsFilterImpl = null;
                }
                return Optional.ofNullable(investTransactionsFilterImpl);
            case 27:
                ChargeBreakdown it14 = (ChargeBreakdown) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Optional.of(it14);
            case 28:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Optional.empty();
            default:
                InvestOrder it15 = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return g.b(it15);
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f197445a = i;
    }
}

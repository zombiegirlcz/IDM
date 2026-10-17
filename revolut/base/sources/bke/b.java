package bke;

import aw0.y6;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.data.model.Data;
import com.revolut.feature.derivatives.models.BalanceWithPnl;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.SimpleTotalValueChart;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.SimpleTotalValueChartPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.joda.time.DateTime;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f16358b;

    public /* synthetic */ b(x xVar, int i) {
        this.f16357a = i;
        this.f16358b = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Flow eVar;
        switch (this.f16357a) {
            case 0:
                xi0.b resultingCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(resultingCurrency, "currency");
                x xVar = this.f16358b;
                efm.r rVarC = xVar.L.c(resultingCurrency, n9l.b.SEC_3);
                k18.c cVar = xVar.M;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(resultingCurrency, "resultingCurrency");
                BalanceWithPnl balanceWithPnl = new BalanceWithPnl(new dj0.d(0L, resultingCurrency), new dj0.d(0L, resultingCurrency), new dj0.d(0L, resultingCurrency));
                if (((o76.d) cVar.d).a()) {
                    s76.b bVar = (s76.b) cVar.f180140b;
                    bVar.getClass();
                    w4l.i loadingStrategy = w4l.i.f294643c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    eVar = new pkg.e(boh.f.e(qe0.o.a(bVar.f, Unit.f186387a, 3L, loadingStrategy, false, null, 24), new pza.d(resultingCurrency, 3, cVar, balanceWithPnl)), balanceWithPnl, 11);
                } else {
                    eVar = new go.g(new Data(balanceWithPnl, null, false, 6, null), 2);
                }
                return nim.a.w(mif.a.d(rVarC, rd0.e.c(eVar, kotlin.coroutines.g.f186406a)), new bjg.c(17));
            case 1:
                til.r it8 = (til.r) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                x xVar2 = this.f16358b;
                xVar2.V2(new d(xVar2, null, 4), new yi5.b(29));
                return Unit.f186387a;
            default:
                SimpleTotalValueChart simpleTotalValueChart = (SimpleTotalValueChart) obj2;
                x xVar3 = this.f16358b;
                int i = xVar3.T;
                int iC = xVar3.H.c();
                Intrinsics.checkNotNullParameter(simpleTotalValueChart, "<this>");
                List points = simpleTotalValueChart.f94999c;
                Intrinsics.checkNotNullParameter(points, "<this>");
                if (!points.isEmpty() && i > 0) {
                    float f = iC / i;
                    if (f < 30.0f) {
                        f = 30.0f;
                    }
                    if (f < points.size()) {
                        if (f <= 1.0f) {
                            points = zhm.u.c(d0.b0(points));
                        } else {
                            ArrayList arrayList = new ArrayList();
                            int iC2 = rim.d.c(points.size() / f);
                            List list = points;
                            Iterator it9 = list.iterator();
                            if (!it9.hasNext()) {
                                throw new NoSuchElementException();
                            }
                            Object next = it9.next();
                            if (it9.hasNext()) {
                                long j2 = ((SimpleTotalValueChartPoint) next).f95001b.f115082a;
                                do {
                                    Object next2 = it9.next();
                                    long j3 = ((SimpleTotalValueChartPoint) next2).f95001b.f115082a;
                                    if (j2 < j3) {
                                        next = next2;
                                        j2 = j3;
                                    }
                                } while (it9.hasNext());
                            }
                            SimpleTotalValueChartPoint simpleTotalValueChartPoint = (SimpleTotalValueChartPoint) next;
                            Iterator it10 = list.iterator();
                            if (!it10.hasNext()) {
                                throw new NoSuchElementException();
                            }
                            Object next3 = it10.next();
                            if (it10.hasNext()) {
                                long j5 = ((SimpleTotalValueChartPoint) next3).f95001b.f115082a;
                                do {
                                    Object next4 = it10.next();
                                    long j16 = ((SimpleTotalValueChartPoint) next4).f95001b.f115082a;
                                    if (j5 > j16) {
                                        next3 = next4;
                                        j5 = j16;
                                    }
                                } while (it10.hasNext());
                            }
                            SimpleTotalValueChartPoint simpleTotalValueChartPoint2 = (SimpleTotalValueChartPoint) next3;
                            int i2 = 0;
                            for (Object obj3 : list) {
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    zhm.v.s();
                                    throw null;
                                }
                                SimpleTotalValueChartPoint simpleTotalValueChartPoint3 = (SimpleTotalValueChartPoint) obj3;
                                if (i2 % iC2 == 0 || i2 == points.size() - 1 || Intrinsics.f(simpleTotalValueChartPoint3, simpleTotalValueChartPoint) || Intrinsics.f(simpleTotalValueChartPoint3, simpleTotalValueChartPoint2)) {
                                    arrayList.add(simpleTotalValueChartPoint3);
                                }
                                i2 = i3;
                            }
                            points = arrayList;
                        }
                    }
                }
                DateTime start = simpleTotalValueChart.f94997a;
                DateTime end2 = simpleTotalValueChart.f94998b;
                Intrinsics.checkNotNullParameter(start, "start");
                Intrinsics.checkNotNullParameter(end2, "end");
                Intrinsics.checkNotNullParameter(points, "points");
                SimpleTotalValueChart simpleTotalValueChart2 = new SimpleTotalValueChart(start, end2, points);
                xVar3.f16373l.c(new bhl.g(simpleTotalValueChart2, 3));
                Intrinsics.checkNotNullParameter(simpleTotalValueChart2, "<this>");
                long millis = end2.getMillis() - start.getMillis();
                List<SimpleTotalValueChartPoint> list2 = points;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                for (SimpleTotalValueChartPoint simpleTotalValueChartPoint4 : list2) {
                    arrayList2.add(new y6(millis != 0 ? (simpleTotalValueChartPoint4.f95000a.getMillis() - start.getMillis()) / millis : BitmapDescriptorFactory.HUE_RED, simpleTotalValueChartPoint4.f95001b.f115082a));
                }
                return arrayList2;
        }
    }
}

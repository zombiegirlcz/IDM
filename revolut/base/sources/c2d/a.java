package c2d;

import com.revolut.feature.shared_separate_favourites.domain.chart.ChartRate;
import com.revolut.feature.shared_separate_favourites.domain.chart.ChartRatePoint;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pair f20674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ngd.b f20675c;

    public /* synthetic */ a(Pair pair, ngd.b bVar, int i) {
        this.f20673a = i;
        this.f20674b = pair;
        this.f20675c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        BigDecimal bigDecimalB;
        eel.h hVar;
        switch (this.f20673a) {
            case 0:
                qta.d data = (qta.d) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                BigDecimal bigDecimal = new BigDecimal(String.valueOf(data.f249051a));
                List<Pair> list = data.e;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (Pair pair : list) {
                    arrayList.add(new ChartRatePoint.Line(new DateTime(((Number) pair.f186385a).longValue()), new BigDecimal(String.valueOf(((Number) pair.f186386b).doubleValue()))));
                }
                return new ChartRate(this.f20674b, bigDecimal, arrayList, this.f20675c);
            case 1:
                eel.k historicalChart = (eel.k) obj2;
                Intrinsics.checkNotNullParameter(historicalChart, "historicalChart");
                return b2d.b.a(historicalChart, this.f20674b, this.f20675c);
            case 2:
                eel.k historicalChart2 = (eel.k) obj2;
                Intrinsics.checkNotNullParameter(historicalChart2, "historicalChart");
                return b2d.b.a(historicalChart2, this.f20674b, this.f20675c);
            case 3:
                eel.e it8 = (eel.e) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Intrinsics.checkNotNullParameter(it8, "<this>");
                Pair favouritesAssetIdPair = this.f20674b;
                Intrinsics.checkNotNullParameter(favouritesAssetIdPair, "favouritesAssetIdPair");
                ngd.b type = this.f20675c;
                Intrinsics.checkNotNullParameter(type, "type");
                eel.l lVar = (eel.l) zhm.d0.d0(it8.f125227a);
                if (lVar == null || (hVar = lVar.f125239c) == null || (bigDecimalB = hVar.b()) == null) {
                    bigDecimalB = BigDecimal.ZERO;
                }
                Intrinsics.h(bigDecimalB);
                List<eel.l> list2 = it8.f125227a;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                for (eel.l lVar2 : list2) {
                    arrayList2.add(new ChartRatePoint.Line(new DateTime(lVar2.f125238b), lVar2.f125239c.b()));
                }
                return new ChartRate(favouritesAssetIdPair, bigDecimalB, arrayList2, type);
            case 4:
                eel.k historicalChart3 = (eel.k) obj2;
                Intrinsics.checkNotNullParameter(historicalChart3, "historicalChart");
                return b2d.b.a(historicalChart3, this.f20674b, this.f20675c);
            default:
                eel.k historicalChart4 = (eel.k) obj2;
                Intrinsics.checkNotNullParameter(historicalChart4, "historicalChart");
                return b2d.b.a(historicalChart4, this.f20674b, this.f20675c);
        }
    }
}

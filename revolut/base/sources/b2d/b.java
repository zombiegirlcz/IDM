package b2d;

import com.revolut.feature.shared_separate_favourites.domain.chart.ChartRate;
import com.revolut.feature.shared_separate_favourites.domain.chart.ChartRatePoint;
import eel.h;
import eel.k;
import eel.l;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    public static final ChartRate a(k kVar, Pair favouritesAssetIdPair, ngd.b type) {
        BigDecimal bigDecimalB;
        h hVar;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(favouritesAssetIdPair, "favouritesAssetIdPair");
        Intrinsics.checkNotNullParameter(type, "type");
        l lVar = (l) d0.d0(kVar.f125232a);
        if (lVar == null || (hVar = lVar.f125239c) == null || (bigDecimalB = hVar.b()) == null) {
            bigDecimalB = BigDecimal.ZERO;
        }
        Intrinsics.h(bigDecimalB);
        List<l> list = kVar.f125232a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (l lVar2 : list) {
            arrayList.add(new ChartRatePoint.Line(new DateTime(lVar2.f125238b), lVar2.f125239c.b()));
        }
        return new ChartRate(favouritesAssetIdPair, bigDecimalB, arrayList, type);
    }
}

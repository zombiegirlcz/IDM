package rqh;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerStatsGroup;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerStatsGroup f256541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f256542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f256543c;

    public h(ScreenerStatsGroup statsGroup, Data availableMetricFilters, Map selectedFilters) {
        Intrinsics.checkNotNullParameter(statsGroup, "statsGroup");
        Intrinsics.checkNotNullParameter(availableMetricFilters, "availableMetricFilters");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        this.f256541a = statsGroup;
        this.f256542b = availableMetricFilters;
        this.f256543c = selectedFilters;
    }

    public static h a(h hVar, Data availableMetricFilters, Map selectedFilters, int i) {
        ScreenerStatsGroup statsGroup = hVar.f256541a;
        if ((i & 2) != 0) {
            availableMetricFilters = hVar.f256542b;
        }
        if ((i & 4) != 0) {
            selectedFilters = hVar.f256543c;
        }
        hVar.getClass();
        hVar.getClass();
        Intrinsics.checkNotNullParameter(statsGroup, "statsGroup");
        Intrinsics.checkNotNullParameter(availableMetricFilters, "availableMetricFilters");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        return new h(statsGroup, availableMetricFilters, selectedFilters);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f256541a, hVar.f256541a) && Intrinsics.f(this.f256542b, hVar.f256542b) && Intrinsics.f(this.f256543c, hVar.f256543c);
    }

    public final int hashCode() {
        return p.a.e(kii.e.c(this.f256542b, this.f256541a.hashCode() * 31, 31), 31, this.f256543c);
    }
}

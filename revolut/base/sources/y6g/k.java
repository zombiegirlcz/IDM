package y6g;

import com.revolut.feature.travel.flights.models.domain.search.FlightSearchFilterOptions;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlightSearchFilterOptions f311273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r7g.i f311274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f311275c;
    public final int d;
    public final List e;

    public k(FlightSearchFilterOptions filterOptions, r7g.i selectedStopOption, dj0.d selectedMaximumPrice, int i, List list) {
        Intrinsics.checkNotNullParameter(filterOptions, "filterOptions");
        Intrinsics.checkNotNullParameter(selectedStopOption, "selectedStopOption");
        Intrinsics.checkNotNullParameter(selectedMaximumPrice, "selectedMaximumPrice");
        this.f311273a = filterOptions;
        this.f311274b = selectedStopOption;
        this.f311275c = selectedMaximumPrice;
        this.d = i;
        this.e = list;
    }

    public static k a(k kVar, r7g.i iVar, dj0.d selectedMaximumPrice, int i, List list, int i2) {
        r7g.i selectedStopOption = iVar;
        FlightSearchFilterOptions filterOptions = kVar.f311273a;
        if ((i2 & 2) != 0) {
            selectedStopOption = kVar.f311274b;
        }
        if ((i2 & 4) != 0) {
            selectedMaximumPrice = kVar.f311275c;
        }
        if ((i2 & 8) != 0) {
            i = kVar.d;
        }
        if ((i2 & 16) != 0) {
            list = kVar.e;
        }
        List list2 = list;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(filterOptions, "filterOptions");
        Intrinsics.checkNotNullParameter(selectedStopOption, "selectedStopOption");
        Intrinsics.checkNotNullParameter(selectedMaximumPrice, "selectedMaximumPrice");
        int i3 = i;
        return new k(filterOptions, selectedStopOption, selectedMaximumPrice, i3, list2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f311273a, kVar.f311273a) && this.f311274b == kVar.f311274b && Intrinsics.f(this.f311275c, kVar.f311275c) && this.d == kVar.d && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.d, v7.c((this.f311274b.hashCode() + (this.f311273a.hashCode() * 31)) * 31, 31, this.f311275c), 31);
        List list = this.e;
        return iB + (list == null ? 0 : list.hashCode());
    }
}

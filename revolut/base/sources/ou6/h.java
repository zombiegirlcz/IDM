package ou6;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f229827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f229828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f229829c;
    public final AcquiringOrderFilter d;
    public final AcquiringOrderFilter e;
    public final AcquiringOrderFilter.Query f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f229830g;

    public h(a mode, Data availabilityData, Data ordersData, AcquiringOrderFilter acquiringOrderFilter, AcquiringOrderFilter acquiringOrderFilter2, AcquiringOrderFilter.Query query, boolean z) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(availabilityData, "availabilityData");
        Intrinsics.checkNotNullParameter(ordersData, "ordersData");
        this.f229827a = mode;
        this.f229828b = availabilityData;
        this.f229829c = ordersData;
        this.d = acquiringOrderFilter;
        this.e = acquiringOrderFilter2;
        this.f = query;
        this.f229830g = z;
    }

    public static h a(h hVar, Data data, Data data2, AcquiringOrderFilter acquiringOrderFilter, AcquiringOrderFilter.Query query, boolean z, int i) {
        a mode = hVar.f229827a;
        if ((i & 2) != 0) {
            data = hVar.f229828b;
        }
        Data availabilityData = data;
        if ((i & 4) != 0) {
            data2 = hVar.f229829c;
        }
        Data ordersData = data2;
        if ((i & 8) != 0) {
            acquiringOrderFilter = hVar.d;
        }
        AcquiringOrderFilter acquiringOrderFilter2 = acquiringOrderFilter;
        AcquiringOrderFilter acquiringOrderFilter3 = hVar.e;
        if ((i & 32) != 0) {
            query = hVar.f;
        }
        AcquiringOrderFilter.Query query2 = query;
        if ((i & 64) != 0) {
            z = hVar.f229830g;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(availabilityData, "availabilityData");
        Intrinsics.checkNotNullParameter(ordersData, "ordersData");
        return new h(mode, availabilityData, ordersData, acquiringOrderFilter2, acquiringOrderFilter3, query2, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f229827a == hVar.f229827a && Intrinsics.f(this.f229828b, hVar.f229828b) && Intrinsics.f(this.f229829c, hVar.f229829c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && this.f229830g == hVar.f229830g;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f229829c, kii.e.c(this.f229828b, this.f229827a.hashCode() * 31, 31), 31);
        AcquiringOrderFilter acquiringOrderFilter = this.d;
        int iHashCode = (iC + (acquiringOrderFilter == null ? 0 : acquiringOrderFilter.hashCode())) * 31;
        AcquiringOrderFilter acquiringOrderFilter2 = this.e;
        int iHashCode2 = (iHashCode + (acquiringOrderFilter2 == null ? 0 : acquiringOrderFilter2.hashCode())) * 31;
        AcquiringOrderFilter.Query query = this.f;
        return Boolean.hashCode(this.f229830g) + ((iHashCode2 + (query != null ? query.f73353a.hashCode() : 0)) * 31);
    }
}

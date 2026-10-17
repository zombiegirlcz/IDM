package lu6;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f200047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AcquiringOrderFilter f200048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f200049c;

    public l(Data filterInfoData, AcquiringOrderFilter acquiringOrderFilter, boolean z) {
        Intrinsics.checkNotNullParameter(filterInfoData, "filterInfoData");
        this.f200047a = filterInfoData;
        this.f200048b = acquiringOrderFilter;
        this.f200049c = z;
    }

    public static l a(l lVar, Data filterInfoData, AcquiringOrderFilter acquiringOrderFilter, int i) {
        if ((i & 1) != 0) {
            filterInfoData = lVar.f200047a;
        }
        if ((i & 2) != 0) {
            acquiringOrderFilter = lVar.f200048b;
        }
        boolean z = (i & 4) != 0 ? lVar.f200049c : true;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(filterInfoData, "filterInfoData");
        return new l(filterInfoData, acquiringOrderFilter, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f200047a, lVar.f200047a) && Intrinsics.f(this.f200048b, lVar.f200048b) && this.f200049c == lVar.f200049c;
    }

    public final int hashCode() {
        int iHashCode = this.f200047a.hashCode() * 31;
        AcquiringOrderFilter acquiringOrderFilter = this.f200048b;
        return Boolean.hashCode(this.f200049c) + ((iHashCode + (acquiringOrderFilter == null ? 0 : acquiringOrderFilter.hashCode())) * 31);
    }
}

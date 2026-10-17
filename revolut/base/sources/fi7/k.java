package fi7;

import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionFilterValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ph7.b f135328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstrumentsTrendCollectionFilterValue f135329b;

    public k(ph7.b filterId, InstrumentsTrendCollectionFilterValue filterValue) {
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        Intrinsics.checkNotNullParameter(filterValue, "filterValue");
        this.f135328a = filterId;
        this.f135329b = filterValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f135328a == kVar.f135328a && Intrinsics.f(this.f135329b, kVar.f135329b);
    }

    public final int hashCode() {
        return this.f135329b.hashCode() + (this.f135328a.hashCode() * 31);
    }
}

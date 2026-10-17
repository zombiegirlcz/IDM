package knh;

import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentsTrendCollectionId f186164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f186165b;

    public b(InstrumentsTrendCollectionId collectionId, a assetType) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        this.f186164a = collectionId;
        this.f186165b = assetType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f186164a, bVar.f186164a) && this.f186165b == bVar.f186165b;
    }

    public final int hashCode() {
        return this.f186165b.hashCode() + (this.f186164a.hashCode() * 31);
    }
}

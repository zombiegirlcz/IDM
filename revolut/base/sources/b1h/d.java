package b1h;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f11803a;

    public d(Data data) {
        InstrumentsCollectionType.RecommendedBuy collectionType = InstrumentsCollectionType.RecommendedBuy.f95285a;
        Intrinsics.checkNotNullParameter(collectionType, "collectionType");
        this.f11803a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        Object obj3 = InstrumentsCollectionType.RecommendedBuy.f95285a;
        return obj3.equals(obj3) && Intrinsics.f(this.f11803a, dVar.f11803a);
    }

    public final int hashCode() {
        int iHashCode = InstrumentsCollectionType.RecommendedBuy.f95285a.hashCode() * 31;
        Data data = this.f11803a;
        return iHashCode + (data == null ? 0 : data.hashCode());
    }
}

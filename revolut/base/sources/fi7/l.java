package fi7;

import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentsTrendCollectionId f135330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ph7.c f135331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f135332c;

    public l(InstrumentsTrendCollectionId collectionId, Map map, ph7.c cVar) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        this.f135330a = collectionId;
        this.f135331b = cVar;
        this.f135332c = map;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f135330a, lVar.f135330a) && this.f135331b == lVar.f135331b && Intrinsics.f(this.f135332c, lVar.f135332c);
    }

    public final int hashCode() {
        int iHashCode = this.f135330a.hashCode() * 31;
        ph7.c cVar = this.f135331b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Map map = this.f135332c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }
}

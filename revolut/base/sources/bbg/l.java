package bbg;

import com.revolut.feature_travel_hotels_models.property.room.CancellationPolicy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellationPolicy f14289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgi.a f14290b;

    public l(CancellationPolicy cancellationPolicy, fgi.a aVar) {
        Intrinsics.checkNotNullParameter(cancellationPolicy, "cancellationPolicy");
        this.f14289a = cancellationPolicy;
        this.f14290b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f14289a, lVar.f14289a) && this.f14290b == lVar.f14290b;
    }

    public final int hashCode() {
        int iHashCode = this.f14289a.hashCode() * 31;
        fgi.a aVar = this.f14290b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}

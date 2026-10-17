package sag;

import com.revolut.feature_travel_hotels_models.property.room.CancellationPolicy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellationPolicy f261397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgi.a f261398b;

    public c(CancellationPolicy cancellationPolicy, fgi.a aVar) {
        Intrinsics.checkNotNullParameter(cancellationPolicy, "cancellationPolicy");
        this.f261397a = cancellationPolicy;
        this.f261398b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f261397a, cVar.f261397a) && this.f261398b == cVar.f261398b;
    }

    public final int hashCode() {
        int iHashCode = this.f261397a.hashCode() * 31;
        fgi.a aVar = this.f261398b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}

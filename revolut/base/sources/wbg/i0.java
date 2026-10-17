package wbg;

import com.revolut.feature_travel_hotels_models.property.room.CancellationPolicy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 extends m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellationPolicy f296179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgi.a f296180b;

    public i0(CancellationPolicy cancellationPolicy, fgi.a aVar) {
        Intrinsics.checkNotNullParameter(cancellationPolicy, "cancellationPolicy");
        this.f296179a = cancellationPolicy;
        this.f296180b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f296179a, i0Var.f296179a) && this.f296180b == i0Var.f296180b;
    }

    public final int hashCode() {
        int iHashCode = this.f296179a.hashCode() * 31;
        fgi.a aVar = this.f296180b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}

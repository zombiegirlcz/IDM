package hwi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156253a;

    public s0(String airportId) {
        Intrinsics.checkNotNullParameter(airportId, "airportId");
        this.f156253a = airportId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s0) && Intrinsics.f(this.f156253a, ((s0) obj2).f156253a);
    }

    public final int hashCode() {
        return this.f156253a.hashCode();
    }
}

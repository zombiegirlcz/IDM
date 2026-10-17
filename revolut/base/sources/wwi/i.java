package wwi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300679a;

    public i(String airportId) {
        Intrinsics.checkNotNullParameter(airportId, "airportId");
        this.f300679a = airportId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f300679a, ((i) obj2).f300679a);
    }

    public final int hashCode() {
        return this.f300679a.hashCode();
    }
}

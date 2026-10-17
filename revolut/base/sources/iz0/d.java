package iz0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f169811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f169812b;

    public d(c primary, c secondary) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(secondary, "secondary");
        this.f169811a = primary;
        this.f169812b = secondary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f169811a.equals(dVar.f169811a) && this.f169812b.equals(dVar.f169812b);
    }

    public final int hashCode() {
        return Integer.hashCode(2) + ((this.f169812b.hashCode() + (this.f169811a.hashCode() * 31)) * 31);
    }
}

package m9l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n9l.a f203839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f203840b;

    public g(n9l.a current, Double d) {
        Intrinsics.checkNotNullParameter(current, "current");
        this.f203839a = current;
        this.f203840b = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f203839a, gVar.f203839a) && Intrinsics.f(this.f203840b, gVar.f203840b);
    }

    public final int hashCode() {
        int iHashCode = this.f203839a.hashCode() * 31;
        Double d = this.f203840b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }
}

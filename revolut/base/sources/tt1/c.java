package tt1;

import hrf.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f274190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f274191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e7l.c f274192c;

    public c(long j2, f direction, e7l.c cVar) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f274190a = j2;
        this.f274191b = direction;
        this.f274192c = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f274190a == cVar.f274190a && this.f274191b == cVar.f274191b && Intrinsics.f(this.f274192c, cVar.f274192c);
    }

    public final int hashCode() {
        int iHashCode = (this.f274191b.hashCode() + (Long.hashCode(this.f274190a) * 31)) * 31;
        e7l.c cVar = this.f274192c;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}

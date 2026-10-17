package il4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f162069a;

    public d(c cVar) {
        this.f162069a = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f162069a, ((d) obj2).f162069a);
    }

    public final int hashCode() {
        c cVar = this.f162069a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }
}

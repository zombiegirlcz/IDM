package vel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f288347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f288348b;

    public b(a performance, g entry) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f288347a = performance;
        this.f288348b = entry;
    }

    @Override // vel.f
    public final g b() {
        return this.f288348b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f288347a, bVar.f288347a) && Intrinsics.f(this.f288348b, bVar.f288348b);
    }

    public final int hashCode() {
        return this.f288348b.hashCode() + (this.f288347a.hashCode() * 31);
    }
}

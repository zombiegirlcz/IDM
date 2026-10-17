package n35;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f211870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final py4.a f211871b;

    public b() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f211870a, bVar.f211870a) && Intrinsics.f(this.f211871b, bVar.f211871b);
    }

    public final int hashCode() {
        io3.d dVar = this.f211870a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        py4.a aVar = this.f211871b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public b(io3.d dVar, py4.a aVar) {
        this.f211870a = dVar;
        this.f211871b = aVar;
    }
}

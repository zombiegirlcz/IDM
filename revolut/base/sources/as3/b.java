package as3;

import ft3.j1;
import gt3.f;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f8788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f8789b;

    public b(j1 productType, f fVar) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.f8788a = productType;
        this.f8789b = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f8788a == bVar.f8788a && Intrinsics.f(this.f8789b, bVar.f8789b);
    }

    public final int hashCode() {
        int iHashCode = this.f8788a.hashCode() * 31;
        f fVar = this.f8789b;
        return iHashCode + (fVar == null ? 0 : fVar.hashCode());
    }
}

package q4a;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f242101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f242102b;

    public g() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f242101a, gVar.f242101a) && Intrinsics.f(this.f242102b, gVar.f242102b);
    }

    public final int hashCode() {
        int iHashCode = this.f242101a.hashCode() * 31;
        wi0.b bVar = this.f242102b;
        return iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode());
    }

    public g(int i) {
        this(h0.f322473a, null);
    }

    public g(Set availableTransferMethods, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(availableTransferMethods, "availableTransferMethods");
        this.f242101a = availableTransferMethods;
        this.f242102b = bVar;
    }
}

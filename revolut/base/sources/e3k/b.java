package e3k;

import kotlin.jvm.internal.Intrinsics;
import z1k.o;
import z1k.p;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f122336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f122337b;

    public b(p routes, o transferRoute) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        Intrinsics.checkNotNullParameter(transferRoute, "transferRoute");
        this.f122336a = routes;
        this.f122337b = transferRoute;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f122336a, bVar.f122336a) && Intrinsics.f(this.f122337b, bVar.f122337b);
    }

    public final int hashCode() {
        return this.f122337b.hashCode() + (this.f122336a.hashCode() * 31);
    }
}

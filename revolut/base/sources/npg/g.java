package npg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f218212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f218213b;

    public g(f status, List checks) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(checks, "checks");
        this.f218212a = status;
        this.f218213b = checks;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f218212a == gVar.f218212a && Intrinsics.f(this.f218213b, gVar.f218213b);
    }

    public final int hashCode() {
        return this.f218213b.hashCode() + (this.f218212a.hashCode() * 31);
    }
}

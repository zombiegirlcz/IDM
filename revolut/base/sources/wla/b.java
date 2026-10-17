package wla;

import do3.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f298463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f298464b;

    public b(n user, List taxResidencies) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
        this.f298463a = user;
        this.f298464b = taxResidencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f298463a, bVar.f298463a) && Intrinsics.f(this.f298464b, bVar.f298464b);
    }

    public final int hashCode() {
        return this.f298464b.hashCode() + (this.f298463a.hashCode() * 31);
    }
}

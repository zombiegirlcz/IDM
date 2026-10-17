package o22;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f221419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f221420b;

    public b(wi0.b country, String prefix) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.f221419a = country;
        this.f221420b = prefix;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f221419a, bVar.f221419a) && Intrinsics.f(this.f221420b, bVar.f221420b);
    }

    public final int hashCode() {
        return this.f221420b.hashCode() + (this.f221419a.f297794a.hashCode() * 31);
    }
}

package rol;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f256036a;

    public d(wi0.b country) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.f256036a = country;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f256036a, ((d) obj2).f256036a);
    }

    public final int hashCode() {
        return this.f256036a.f297794a.hashCode();
    }
}

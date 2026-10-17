package a64;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f1539a;

    public g(wi0.b currentCountryCode) {
        Intrinsics.checkNotNullParameter(currentCountryCode, "currentCountryCode");
        this.f1539a = currentCountryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f1539a, ((g) obj2).f1539a);
    }

    public final int hashCode() {
        return this.f1539a.f297794a.hashCode();
    }
}

package joe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f176936a;

    public g(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f176936a = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f176936a, ((g) obj2).f176936a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f176936a.f297794a.hashCode() * 31);
    }
}

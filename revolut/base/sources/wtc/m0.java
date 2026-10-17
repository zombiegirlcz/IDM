package wtc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f299886a;

    public m0(wi0.b currentCountryCode) {
        Intrinsics.checkNotNullParameter(currentCountryCode, "currentCountryCode");
        this.f299886a = currentCountryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m0) && Intrinsics.f(this.f299886a, ((m0) obj2).f299886a);
    }

    public final int hashCode() {
        return this.f299886a.f297794a.hashCode();
    }
}

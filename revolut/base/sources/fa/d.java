package fa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133004a;

    public d(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f133004a = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f133004a, ((d) obj2).f133004a);
    }

    public final int hashCode() {
        return this.f133004a.hashCode();
    }

    public final String toString() {
        return p.a.p("Country(countryCode=", this.f133004a, ")");
    }
}

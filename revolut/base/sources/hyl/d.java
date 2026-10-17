package hyl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156909a;

    public d(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f156909a = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f156909a, ((d) obj2).f156909a);
    }

    public final int hashCode() {
        return this.f156909a.hashCode();
    }
}

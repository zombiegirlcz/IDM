package kxj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f190581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f190582b;

    public a(String detectedCountry, String str) {
        Intrinsics.checkNotNullParameter(detectedCountry, "detectedCountry");
        this.f190581a = detectedCountry;
        this.f190582b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f190581a, aVar.f190581a) && Intrinsics.f(this.f190582b, aVar.f190582b);
    }

    public final int hashCode() {
        int iHashCode = this.f190581a.hashCode() * 31;
        String str = this.f190582b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}

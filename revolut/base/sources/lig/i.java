package lig;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f195512b;

    public i(String city, String iataCode) {
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(iataCode, "iataCode");
        this.f195511a = city;
        this.f195512b = iataCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f195511a, iVar.f195511a) && Intrinsics.f(this.f195512b, iVar.f195512b);
    }

    public final int hashCode() {
        return this.f195512b.hashCode() + (this.f195511a.hashCode() * 31);
    }
}

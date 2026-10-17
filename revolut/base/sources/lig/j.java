package lig;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f195514b;

    public j(String city, String countryCode) {
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f195513a = city;
        this.f195514b = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f195513a, jVar.f195513a) && Intrinsics.f(this.f195514b, jVar.f195514b);
    }

    public final int hashCode() {
        return this.f195514b.hashCode() + (this.f195513a.hashCode() * 31);
    }
}

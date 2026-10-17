package hfg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151867b;

    public m0(String cityName, String countryCode) {
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f151866a = cityName;
        this.f151867b = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f151866a, m0Var.f151866a) && Intrinsics.f(this.f151867b, m0Var.f151867b);
    }

    public final int hashCode() {
        return this.f151867b.hashCode() + (this.f151866a.hashCode() * 31);
    }
}

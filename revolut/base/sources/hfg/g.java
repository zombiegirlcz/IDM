package hfg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151838c;

    public g(String airlineName, String providerDescription, String iconUrl) {
        Intrinsics.checkNotNullParameter(airlineName, "airlineName");
        Intrinsics.checkNotNullParameter(providerDescription, "providerDescription");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        this.f151836a = airlineName;
        this.f151837b = providerDescription;
        this.f151838c = iconUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f151836a, gVar.f151836a) && Intrinsics.f(this.f151837b, gVar.f151837b) && Intrinsics.f(this.f151838c, gVar.f151838c);
    }

    public final int hashCode() {
        return this.f151838c.hashCode() + p.a.c(this.f151836a.hashCode() * 31, 31, this.f151837b);
    }
}

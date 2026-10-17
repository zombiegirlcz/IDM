package cj1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24587b;

    public g(String country, String query) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f24586a = country;
        this.f24587b = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f24586a, gVar.f24586a) && Intrinsics.f(this.f24587b, gVar.f24587b);
    }

    public final int hashCode() {
        return this.f24587b.hashCode() + (this.f24586a.hashCode() * 31);
    }
}

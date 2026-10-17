package at;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8962b;

    public h(String expiryYear, String securityCode) {
        Intrinsics.checkNotNullParameter(expiryYear, "expiryYear");
        Intrinsics.checkNotNullParameter(securityCode, "securityCode");
        this.f8961a = expiryYear;
        this.f8962b = securityCode;
    }

    public static h a(h hVar, String expiryYear, String securityCode, int i) {
        if ((i & 1) != 0) {
            expiryYear = hVar.f8961a;
        }
        if ((i & 2) != 0) {
            securityCode = hVar.f8962b;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(expiryYear, "expiryYear");
        Intrinsics.checkNotNullParameter(securityCode, "securityCode");
        return new h(expiryYear, securityCode);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f8961a, hVar.f8961a) && Intrinsics.f(this.f8962b, hVar.f8962b);
    }

    public final int hashCode() {
        return this.f8962b.hashCode() + (this.f8961a.hashCode() * 31);
    }
}

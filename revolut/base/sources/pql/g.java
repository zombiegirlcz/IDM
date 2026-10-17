package pql;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f238817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f238818b;

    public g(String authorizationCode, String codeVerifier) {
        Intrinsics.checkNotNullParameter(authorizationCode, "authorizationCode");
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        this.f238817a = authorizationCode;
        this.f238818b = codeVerifier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f238817a, gVar.f238817a) && Intrinsics.f(this.f238818b, gVar.f238818b);
    }

    public final int hashCode() {
        return this.f238818b.hashCode() + (this.f238817a.hashCode() * 31);
    }
}

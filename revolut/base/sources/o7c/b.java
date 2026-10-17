package o7c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f222750c;
    public final String d;
    public final String e;

    public b(String clientId, String redirectUri, String scope, String state, String authorizationDetails) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(authorizationDetails, "authorizationDetails");
        this.f222748a = clientId;
        this.f222749b = redirectUri;
        this.f222750c = scope;
        this.d = state;
        this.e = authorizationDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f222748a, bVar.f222748a) && Intrinsics.f(this.f222749b, bVar.f222749b) && Intrinsics.f(this.f222750c, bVar.f222750c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f222748a.hashCode() * 31, 31, this.f222749b), 31, this.f222750c), 31, this.d);
    }
}

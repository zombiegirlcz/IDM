package q9c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f243855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f243856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f243857c;
    public final String d;
    public final String e;

    public b(String clientId, String redirectUri, String scope, String state, String authorizationDetails) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(authorizationDetails, "authorizationDetails");
        this.f243855a = clientId;
        this.f243856b = redirectUri;
        this.f243857c = scope;
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
        return Intrinsics.f(this.f243855a, bVar.f243855a) && Intrinsics.f(this.f243856b, bVar.f243856b) && Intrinsics.f(this.f243857c, bVar.f243857c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f243855a.hashCode() * 31, 31, this.f243856b), 31, this.f243857c), 31, this.d);
    }
}

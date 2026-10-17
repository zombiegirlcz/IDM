package u7c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f277727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f277728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f277729c;
    public final String d;
    public final String e;

    public a(String clientId, String redirectUri, String scope, String str, String authorizationDetails) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(authorizationDetails, "authorizationDetails");
        this.f277727a = clientId;
        this.f277728b = redirectUri;
        this.f277729c = scope;
        this.d = str;
        this.e = authorizationDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f277727a, aVar.f277727a) && Intrinsics.f(this.f277728b, aVar.f277728b) && Intrinsics.f(this.f277729c, aVar.f277729c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f277727a.hashCode() * 31, 31, this.f277728b), 31, this.f277729c);
        String str = this.d;
        return this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}

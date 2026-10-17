package ni6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215658c;
    public final String d;
    public final String e;
    public final String f;

    public c(String str, String str2, String request, String clientId, String redirectUri, String str3) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        this.f215656a = str;
        this.f215657b = str2;
        this.f215658c = request;
        this.d = clientId;
        this.e = redirectUri;
        this.f = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f215656a, cVar.f215656a) && Intrinsics.f(this.f215657b, cVar.f215657b) && Intrinsics.f(this.f215658c, cVar.f215658c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        String str = this.f215656a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f215657b;
        int iC = p.a.c(p.a.c(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f215658c), 31, this.d), 31, this.e);
        String str3 = this.f;
        return iC + (str3 != null ? str3.hashCode() : 0);
    }
}

package pi6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f236446c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f236447g;

    public k(String str, String str2, String request, String clientId, String redirectUri, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        this.f236444a = str;
        this.f236445b = str2;
        this.f236446c = request;
        this.d = clientId;
        this.e = redirectUri;
        this.f = str3;
        this.f236447g = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f236444a, kVar.f236444a) && Intrinsics.f(this.f236445b, kVar.f236445b) && Intrinsics.f(this.f236446c, kVar.f236446c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && this.f236447g == kVar.f236447g;
    }

    public final int hashCode() {
        String str = this.f236444a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f236445b;
        int iC = p.a.c(p.a.c(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f236446c), 31, this.d), 31, this.e);
        String str3 = this.f;
        return Boolean.hashCode(this.f236447g) + ((iC + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}

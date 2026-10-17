package x61;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f303022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f303023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f303024c;
    public final String d;
    public final List e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f303025g;

    public h(String redirectUri, String clientId, String str, String str2, String request, List consentedPockets, String str3) {
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(consentedPockets, "consentedPockets");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f303022a = redirectUri;
        this.f303023b = clientId;
        this.f303024c = str;
        this.d = str2;
        this.e = consentedPockets;
        this.f = request;
        this.f303025g = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f303022a, hVar.f303022a) && Intrinsics.f(this.f303023b, hVar.f303023b) && Intrinsics.f(this.f303024c, hVar.f303024c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f303025g, hVar.f303025g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f303022a.hashCode() * 31, 31, this.f303023b);
        String str = this.f303024c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iC2 = p.a.c(p.a.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f);
        String str3 = this.f303025g;
        return iC2 + (str3 != null ? str3.hashCode() : 0);
    }
}

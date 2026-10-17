package x61;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f303019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f303020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f303021c;
    public final Set d;

    public g(String clientId, String requestUri, Set consentedPockets, Set consentedLoans) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(requestUri, "requestUri");
        Intrinsics.checkNotNullParameter(consentedPockets, "consentedPockets");
        Intrinsics.checkNotNullParameter(consentedLoans, "consentedLoans");
        this.f303019a = clientId;
        this.f303020b = requestUri;
        this.f303021c = consentedPockets;
        this.d = consentedLoans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f303019a, gVar.f303019a) && Intrinsics.f(this.f303020b, gVar.f303020b) && Intrinsics.f(this.f303021c, gVar.f303021c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.f(p.a.c(this.f303019a.hashCode() * 31, 31, this.f303020b), 31, this.f303021c);
    }
}

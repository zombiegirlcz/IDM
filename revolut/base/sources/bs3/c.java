package bs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18034c;

    public c(String countryCode, String accountId, String clientAppId) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(clientAppId, "clientAppId");
        this.f18032a = countryCode;
        this.f18033b = accountId;
        this.f18034c = clientAppId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f18032a, cVar.f18032a) && Intrinsics.f(this.f18033b, cVar.f18033b) && Intrinsics.f(this.f18034c, cVar.f18034c);
    }

    public final int hashCode() {
        return this.f18034c.hashCode() + p.a.c(this.f18032a.hashCode() * 31, 31, this.f18033b);
    }
}

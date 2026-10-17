package sq3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f264993c;

    public a(String uploadToken, String token, String referenceNumber) {
        Intrinsics.checkNotNullParameter(uploadToken, "uploadToken");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(referenceNumber, "referenceNumber");
        this.f264991a = uploadToken;
        this.f264992b = token;
        this.f264993c = referenceNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f264991a, aVar.f264991a) && Intrinsics.f(this.f264992b, aVar.f264992b) && Intrinsics.f(this.f264993c, aVar.f264993c);
    }

    public final int hashCode() {
        return this.f264993c.hashCode() + p.a.c(this.f264991a.hashCode() * 31, 31, this.f264992b);
    }
}

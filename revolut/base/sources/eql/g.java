package eql;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128505b;

    public g(String email, String serverAuthCode) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(serverAuthCode, "serverAuthCode");
        this.f128504a = email;
        this.f128505b = serverAuthCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f128504a, gVar.f128504a) && Intrinsics.f(this.f128505b, gVar.f128505b);
    }

    public final int hashCode() {
        return this.f128505b.hashCode() + (this.f128504a.hashCode() * 31);
    }
}

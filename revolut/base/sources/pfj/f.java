package pfj;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f235609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f235610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f235611c;

    public f(i authorizationResponse, long j2, long j3) {
        Intrinsics.checkNotNullParameter(authorizationResponse, "authorizationResponse");
        this.f235609a = authorizationResponse;
        this.f235610b = j2;
        this.f235611c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f235609a, fVar.f235609a) && kotlin.time.b.d(this.f235610b, fVar.f235610b) && kotlin.time.b.d(this.f235611c, fVar.f235611c);
    }

    public final int hashCode() {
        int iHashCode = this.f235609a.hashCode() * 31;
        b.Companion companion = kotlin.time.b.INSTANCE;
        return Long.hashCode(this.f235611c) + a0.d.c(iHashCode, 31, this.f235610b);
    }
}

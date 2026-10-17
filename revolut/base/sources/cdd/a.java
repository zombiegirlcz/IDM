package cdd;

import a0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23233c;
    public final String d;

    public a(long j2, String accessCode, String refreshCode, String ownerId) {
        Intrinsics.checkNotNullParameter(accessCode, "accessCode");
        Intrinsics.checkNotNullParameter(refreshCode, "refreshCode");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        this.f23231a = accessCode;
        this.f23232b = refreshCode;
        this.f23233c = j2;
        this.d = ownerId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f23231a, aVar.f23231a) && Intrinsics.f(this.f23232b, aVar.f23232b) && this.f23233c == aVar.f23233c && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + d.c(p.a.c(this.f23231a.hashCode() * 31, 31, this.f23232b), 31, this.f23233c);
    }
}

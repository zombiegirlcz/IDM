package dej;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f113534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f113535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f113536c;

    public g(a aVar, long j2, long j3) {
        this.f113534a = aVar;
        this.f113535b = j2;
        this.f113536c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f113534a, gVar.f113534a) && kotlin.time.b.d(this.f113535b, gVar.f113535b) && kotlin.time.b.d(this.f113536c, gVar.f113536c);
    }

    public final int hashCode() {
        a aVar = this.f113534a;
        int iHashCode = aVar == null ? 0 : aVar.hashCode();
        b.Companion companion = kotlin.time.b.INSTANCE;
        return Long.hashCode(this.f113536c) + a0.d.c(iHashCode * 31, 31, this.f113535b);
    }
}

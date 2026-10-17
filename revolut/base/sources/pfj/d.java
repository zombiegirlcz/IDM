package pfj;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f235605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f235606c;
    public final Instant d;
    public final int e;
    public final g f;

    public d(String authorizationId, j jVar, Instant instant, Instant instant2, int i, g gVar) {
        Intrinsics.checkNotNullParameter(authorizationId, "authorizationId");
        this.f235604a = authorizationId;
        this.f235605b = jVar;
        this.f235606c = instant;
        this.d = instant2;
        this.e = i;
        this.f = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f235604a, dVar.f235604a) && this.f235605b == dVar.f235605b && Intrinsics.f(this.f235606c, dVar.f235606c) && Intrinsics.f(this.d, dVar.d) && this.e == dVar.e && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f235604a.hashCode() * 31;
        j jVar = this.f235605b;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Instant instant = this.f235606c;
        int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.d;
        int iB = j6.a.b(this.e, (iHashCode3 + (instant2 == null ? 0 : instant2.hashCode())) * 31, 31);
        g gVar = this.f;
        return iB + (gVar != null ? gVar.hashCode() : 0);
    }
}

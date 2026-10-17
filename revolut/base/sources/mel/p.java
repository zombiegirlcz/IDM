package mel;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f204769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f204770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f204771c;
    public final g d;
    public final e0 e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f204772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Instant f204773h;

    public p(j0 overallConsensus, j0 j0Var, String referenceIndex, g gVar, e0 e0Var, dj0.d dVar, dj0.d dVar2, Instant instant) {
        Intrinsics.checkNotNullParameter(overallConsensus, "overallConsensus");
        Intrinsics.checkNotNullParameter(referenceIndex, "referenceIndex");
        this.f204769a = overallConsensus;
        this.f204770b = j0Var;
        this.f204771c = referenceIndex;
        this.d = gVar;
        this.e = e0Var;
        this.f = dVar;
        this.f204772g = dVar2;
        this.f204773h = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f204769a == pVar.f204769a && this.f204770b == pVar.f204770b && Intrinsics.f(this.f204771c, pVar.f204771c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f) && Intrinsics.f(this.f204772g, pVar.f204772g) && Intrinsics.f(this.f204773h, pVar.f204773h);
    }

    public final int hashCode() {
        int iHashCode = this.f204769a.hashCode() * 31;
        j0 j0Var = this.f204770b;
        int iC = p.a.c((iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31, 31, this.f204771c);
        g gVar = this.d;
        int iHashCode2 = (iC + (gVar == null ? 0 : gVar.hashCode())) * 31;
        e0 e0Var = this.e;
        int iHashCode3 = (iHashCode2 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        dj0.d dVar = this.f;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f204772g;
        int iHashCode5 = (iHashCode4 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        Instant instant = this.f204773h;
        return iHashCode5 + (instant != null ? instant.hashCode() : 0);
    }
}

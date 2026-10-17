package k77;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f181846c;
    public final d d;
    public final f e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f181847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f181848h;
    public final b i;

    public p(String name, String region, String countryCode, d dVar, f fVar, f fVar2, f fVar3, f fVar4, b bVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f181844a = name;
        this.f181845b = region;
        this.f181846c = countryCode;
        this.d = dVar;
        this.e = fVar;
        this.f = fVar2;
        this.f181847g = fVar3;
        this.f181848h = fVar4;
        this.i = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f181844a, pVar.f181844a) && Intrinsics.f(this.f181845b, pVar.f181845b) && Intrinsics.f(this.f181846c, pVar.f181846c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f) && Intrinsics.f(this.f181847g, pVar.f181847g) && Intrinsics.f(this.f181848h, pVar.f181848h) && Intrinsics.f(this.i, pVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f181844a.hashCode() * 31, 31, this.f181845b), 31, this.f181846c);
        d dVar = this.d;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        f fVar = this.e;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        f fVar2 = this.f;
        int iHashCode3 = (iHashCode2 + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        f fVar3 = this.f181847g;
        int iHashCode4 = (iHashCode3 + (fVar3 == null ? 0 : fVar3.hashCode())) * 31;
        f fVar4 = this.f181848h;
        int iHashCode5 = (iHashCode4 + (fVar4 == null ? 0 : fVar4.hashCode())) * 31;
        b bVar = this.i;
        return iHashCode5 + (bVar != null ? bVar.hashCode() : 0);
    }
}

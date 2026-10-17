package sgl;

import h30.l;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f262683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f262684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f262685c;
    public final f d;
    public final a e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f262686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f262687h;

    public g(String id10, ZonedDateTime completedDate, ZonedDateTime updatedDate, f fVar, a aVar, c cVar, d dVar, b bVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(completedDate, "completedDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        this.f262683a = id10;
        this.f262684b = completedDate;
        this.f262685c = updatedDate;
        this.d = fVar;
        this.e = aVar;
        this.f = cVar;
        this.f262686g = dVar;
        this.f262687h = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f262683a, gVar.f262683a) && Intrinsics.f(this.f262684b, gVar.f262684b) && Intrinsics.f(this.f262685c, gVar.f262685c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f262686g, gVar.f262686g) && Intrinsics.f(this.f262687h, gVar.f262687h);
    }

    public final int hashCode() {
        int iH = l.h(this.f262685c, l.h(this.f262684b, this.f262683a.hashCode() * 31, 31), 31);
        f fVar = this.d;
        int iHashCode = (iH + (fVar == null ? 0 : fVar.hashCode())) * 31;
        a aVar = this.e;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        c cVar = this.f;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.f262686g;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        b bVar = this.f262687h;
        return iHashCode4 + (bVar != null ? bVar.f262669a.hashCode() : 0);
    }
}

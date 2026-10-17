package ehl;

import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f126298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f126299c;
    public final v d;
    public final d e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f126300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f126301h;

    public w(String id10, ZonedDateTime completedDate, ZonedDateTime updatedDate, v vVar, d dVar, g gVar, h hVar, f fVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(completedDate, "completedDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        this.f126297a = id10;
        this.f126298b = completedDate;
        this.f126299c = updatedDate;
        this.d = vVar;
        this.e = dVar;
        this.f = gVar;
        this.f126300g = hVar;
        this.f126301h = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f126297a, wVar.f126297a) && Intrinsics.f(this.f126298b, wVar.f126298b) && Intrinsics.f(this.f126299c, wVar.f126299c) && Intrinsics.f(this.d, wVar.d) && Intrinsics.f(this.e, wVar.e) && Intrinsics.f(this.f, wVar.f) && Intrinsics.f(this.f126300g, wVar.f126300g) && Intrinsics.f(this.f126301h, wVar.f126301h);
    }

    public final int hashCode() {
        int iH = h30.l.h(this.f126299c, h30.l.h(this.f126298b, this.f126297a.hashCode() * 31, 31), 31);
        v vVar = this.d;
        int iHashCode = (iH + (vVar == null ? 0 : vVar.hashCode())) * 31;
        d dVar = this.e;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        g gVar = this.f;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        h hVar = this.f126300g;
        int iHashCode4 = (iHashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        f fVar = this.f126301h;
        return iHashCode4 + (fVar != null ? fVar.f126245a.hashCode() : 0);
    }

    public /* synthetic */ w(String str, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, v vVar, d dVar, g gVar, h hVar, f fVar, int i) {
        this(str, zonedDateTime, zonedDateTime2, (i & 8) != 0 ? null : vVar, (i & 16) != 0 ? null : dVar, (i & 32) != 0 ? null : gVar, (i & 64) != 0 ? null : hVar, (i & 128) != 0 ? null : fVar);
    }
}

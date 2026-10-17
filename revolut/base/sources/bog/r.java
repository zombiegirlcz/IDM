package bog;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f17450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f17451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f17452c;
    public final b d;

    public r(d firstName, j jVar, h lastName, b bVar) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f17450a = firstName;
        this.f17451b = jVar;
        this.f17452c = lastName;
        this.d = bVar;
    }

    public static r a(r rVar, d firstName, j jVar, h lastName, b bVar, int i) {
        if ((i & 1) != 0) {
            firstName = rVar.f17450a;
        }
        if ((i & 2) != 0) {
            jVar = rVar.f17451b;
        }
        if ((i & 4) != 0) {
            lastName = rVar.f17452c;
        }
        if ((i & 8) != 0) {
            bVar = rVar.d;
        }
        rVar.getClass();
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        return new r(firstName, jVar, lastName, bVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f17450a, rVar.f17450a) && Intrinsics.f(this.f17451b, rVar.f17451b) && Intrinsics.f(this.f17452c, rVar.f17452c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f17450a.hashCode() * 31;
        j jVar = this.f17451b;
        int iHashCode2 = (this.f17452c.hashCode() + ((iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31)) * 31;
        b bVar = this.d;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}

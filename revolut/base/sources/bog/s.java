package bog;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f17453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f17454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f17455c;
    public final d d;
    public final b e;

    public s(n nativeLastName, l nativeFirstName, h lastName, d firstName, b bVar) {
        Intrinsics.checkNotNullParameter(nativeLastName, "nativeLastName");
        Intrinsics.checkNotNullParameter(nativeFirstName, "nativeFirstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        this.f17453a = nativeLastName;
        this.f17454b = nativeFirstName;
        this.f17455c = lastName;
        this.d = firstName;
        this.e = bVar;
    }

    public static s a(s sVar, n nVar, l lVar, h hVar, d dVar, b bVar, int i) {
        if ((i & 1) != 0) {
            nVar = sVar.f17453a;
        }
        n nativeLastName = nVar;
        if ((i & 2) != 0) {
            lVar = sVar.f17454b;
        }
        l nativeFirstName = lVar;
        if ((i & 4) != 0) {
            hVar = sVar.f17455c;
        }
        h lastName = hVar;
        if ((i & 8) != 0) {
            dVar = sVar.d;
        }
        d firstName = dVar;
        if ((i & 16) != 0) {
            bVar = sVar.e;
        }
        sVar.getClass();
        Intrinsics.checkNotNullParameter(nativeLastName, "nativeLastName");
        Intrinsics.checkNotNullParameter(nativeFirstName, "nativeFirstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        return new s(nativeLastName, nativeFirstName, lastName, firstName, bVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f17453a, sVar.f17453a) && Intrinsics.f(this.f17454b, sVar.f17454b) && Intrinsics.f(this.f17455c, sVar.f17455c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f17455c.hashCode() + ((this.f17454b.hashCode() + (this.f17453a.hashCode() * 31)) * 31)) * 31)) * 31;
        b bVar = this.e;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}

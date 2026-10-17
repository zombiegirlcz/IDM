package mk5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f206186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f206187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f206188c;
    public final dj0.d d;
    public final pd5.j e;
    public final cw5.b f;

    public l(String displayName, xi0.b currency, dj0.d dVar, dj0.d dVar2, pd5.j jVar, cw5.b bVar) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f206186a = displayName;
        this.f206187b = currency;
        this.f206188c = dVar;
        this.d = dVar2;
        this.e = jVar;
        this.f = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f206186a, lVar.f206186a) && Intrinsics.f(this.f206187b, lVar.f206187b) && Intrinsics.f(this.f206188c, lVar.f206188c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f);
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.f206187b, this.f206186a.hashCode() * 31, 31);
        dj0.d dVar = this.f206188c;
        int iHashCode = (iJ + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.d;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        pd5.j jVar = this.e;
        int iHashCode3 = (iHashCode2 + (jVar == null ? 0 : jVar.f235111a.hashCode())) * 31;
        cw5.b bVar = this.f;
        return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }
}

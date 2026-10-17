package lcd;

import ip0.v7;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f193849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f193850c;
    public final String d;
    public final d e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f193851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ZonedDateTime f193852h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ZonedDateTime f193853j;
    public final dj0.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f193854l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f193855m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ncd.j f193856n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f193857p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f193858q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final dj0.d f193859r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h f193860s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r f193861t;

    public i(String id10, String str, String str2, String name, d state, f fVar, String productId, ZonedDateTime createdDate, dj0.d dVar, ZonedDateTime zonedDateTime, dj0.d balance, String ownerId, a ownerAccountType, ncd.j displayRate, String str3, b bVar, String str4, dj0.d dVar2, h hVar, r rVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(ownerAccountType, "ownerAccountType");
        Intrinsics.checkNotNullParameter(displayRate, "displayRate");
        this.f193848a = id10;
        this.f193849b = str;
        this.f193850c = str2;
        this.d = name;
        this.e = state;
        this.f = fVar;
        this.f193851g = productId;
        this.f193852h = createdDate;
        this.i = dVar;
        this.f193853j = zonedDateTime;
        this.k = balance;
        this.f193854l = ownerId;
        this.f193855m = ownerAccountType;
        this.f193856n = displayRate;
        this.o = str3;
        this.f193857p = bVar;
        this.f193858q = str4;
        this.f193859r = dVar2;
        this.f193860s = hVar;
        this.f193861t = rVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f193848a, iVar.f193848a) && Intrinsics.f(this.f193849b, iVar.f193849b) && Intrinsics.f(this.f193850c, iVar.f193850c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f193851g, iVar.f193851g) && Intrinsics.f(this.f193852h, iVar.f193852h) && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f193853j, iVar.f193853j) && Intrinsics.f(this.k, iVar.k) && Intrinsics.f(this.f193854l, iVar.f193854l) && this.f193855m == iVar.f193855m && Intrinsics.f(this.f193856n, iVar.f193856n) && Intrinsics.f(this.o, iVar.o) && this.f193857p == iVar.f193857p && Intrinsics.f(this.f193858q, iVar.f193858q) && Intrinsics.f(this.f193859r, iVar.f193859r) && Intrinsics.f(this.f193860s, iVar.f193860s) && Intrinsics.f(this.f193861t, iVar.f193861t);
    }

    public final int hashCode() {
        int iHashCode = this.f193848a.hashCode() * 31;
        String str = this.f193849b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f193850c;
        int iHashCode3 = (this.e.hashCode() + p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d)) * 31;
        f fVar = this.f;
        int iH = h30.l.h(this.f193852h, p.a.c((iHashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.f193851g), 31);
        dj0.d dVar = this.i;
        int iHashCode4 = (iH + (dVar == null ? 0 : dVar.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.f193853j;
        int iHashCode5 = (this.f193856n.hashCode() + ((this.f193855m.hashCode() + p.a.c(v7.c((iHashCode4 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31, 31, this.k), 31, this.f193854l)) * 31)) * 31;
        String str3 = this.o;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        b bVar = this.f193857p;
        int iHashCode7 = (iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str4 = this.f193858q;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        dj0.d dVar2 = this.f193859r;
        int iHashCode9 = (iHashCode8 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        h hVar = this.f193860s;
        int iHashCode10 = (iHashCode9 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        r rVar = this.f193861t;
        return iHashCode10 + (rVar != null ? rVar.hashCode() : 0);
    }
}

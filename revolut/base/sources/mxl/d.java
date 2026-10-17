package mxl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f210262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f210263c;
    public final n d;
    public final n e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f210264g;

    public d(String designId, n nVar, n nVar2, n nVar3, n nVar4, b bVar, g lightType) {
        Intrinsics.checkNotNullParameter(designId, "designId");
        Intrinsics.checkNotNullParameter(lightType, "lightType");
        this.f210261a = designId;
        this.f210262b = nVar;
        this.f210263c = nVar2;
        this.d = nVar3;
        this.e = nVar4;
        this.f = bVar;
        this.f210264g = lightType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f210261a, dVar.f210261a) && Intrinsics.f(this.f210262b, dVar.f210262b) && Intrinsics.f(this.f210263c, dVar.f210263c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && this.f210264g == dVar.f210264g;
    }

    public final int hashCode() {
        int iHashCode = this.f210261a.hashCode() * 31;
        n nVar = this.f210262b;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        n nVar2 = this.f210263c;
        int iHashCode3 = (iHashCode2 + (nVar2 == null ? 0 : nVar2.hashCode())) * 31;
        n nVar3 = this.d;
        int iHashCode4 = (iHashCode3 + (nVar3 == null ? 0 : nVar3.hashCode())) * 31;
        n nVar4 = this.e;
        int iHashCode5 = (iHashCode4 + (nVar4 == null ? 0 : nVar4.hashCode())) * 31;
        b bVar = this.f;
        return this.f210264g.hashCode() + ((iHashCode5 + (bVar != null ? bVar.f210260a.hashCode() : 0)) * 31);
    }
}

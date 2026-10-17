package kq2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f188291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f188292c;
    public final dj0.d d;
    public final boolean e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f188293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f188294h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nrf.e f188295j;

    public a(String str, l type, dj0.d dVar, dj0.d dVar2, boolean z, List supportedStraightThroughMethods, n nVar, i iVar, String str2, nrf.e eVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(supportedStraightThroughMethods, "supportedStraightThroughMethods");
        this.f188290a = str;
        this.f188291b = type;
        this.f188292c = dVar;
        this.d = dVar2;
        this.e = z;
        this.f = supportedStraightThroughMethods;
        this.f188293g = nVar;
        this.f188294h = iVar;
        this.i = str2;
        this.f188295j = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f188290a, aVar.f188290a) && this.f188291b == aVar.f188291b && Intrinsics.f(this.f188292c, aVar.f188292c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f188293g, aVar.f188293g) && this.f188294h == aVar.f188294h && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f188295j, aVar.f188295j);
    }

    public final int hashCode() {
        String str = this.f188290a;
        int iHashCode = (this.f188291b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        dj0.d dVar = this.f188292c;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.d;
        int iD = p.a.d(j6.a.c((iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31, 31, this.e), 31, this.f);
        n nVar = this.f188293g;
        int iHashCode3 = (iD + (nVar == null ? 0 : Boolean.hashCode(nVar.f188321a))) * 31;
        i iVar = this.f188294h;
        int iHashCode4 = (iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        nrf.e eVar = this.f188295j;
        return iHashCode5 + (eVar != null ? eVar.hashCode() : 0);
    }
}

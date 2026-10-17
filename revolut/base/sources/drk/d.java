package drk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f117161c;
    public final c d;
    public final a e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f117162g;

    public d(String ref2, int i, Integer num, c cVar, a aVar, b bVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f117159a = ref2;
        this.f117160b = i;
        this.f117161c = num;
        this.d = cVar;
        this.e = aVar;
        this.f = bVar;
        this.f117162g = ref2 + "|" + i + "|" + num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f117159a, dVar.f117159a) && this.f117160b == dVar.f117160b && Intrinsics.f(this.f117161c, dVar.f117161c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f117160b, this.f117159a.hashCode() * 31, 31);
        Integer num = this.f117161c;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        c cVar = this.d;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        a aVar = this.e;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.f;
        return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }
}

package uqk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f282207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f282208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f282209c;
    public final c d;
    public final a e;
    public final b f;

    public d(String ref2, int i, Integer num, c cVar, a aVar, b bVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f282207a = ref2;
        this.f282208b = i;
        this.f282209c = num;
        this.d = cVar;
        this.e = aVar;
        this.f = bVar;
    }

    public static d a(d dVar, int i, Integer num, int i2) {
        String ref2 = dVar.f282207a;
        if ((i2 & 4) != 0) {
            num = dVar.f282209c;
        }
        Intrinsics.checkNotNullParameter(ref2, "ref");
        return new d(ref2, i, num, null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f282207a, dVar.f282207a) && this.f282208b == dVar.f282208b && Intrinsics.f(this.f282209c, dVar.f282209c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f282208b, this.f282207a.hashCode() * 31, 31);
        Integer num = this.f282209c;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        c cVar = this.d;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        a aVar = this.e;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.f;
        return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }
}

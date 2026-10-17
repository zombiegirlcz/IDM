package os7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ss7.d;
import vs7.f;
import xs7.g;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ws7.b f229255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f229256c;
    public final ts7.c d;
    public final rs7.b e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f229257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f229258h;
    public final List i;

    public a(String product, ws7.b header, f fVar, ts7.c cVar, rs7.a aVar, d dVar, g gVar, ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f229254a = product;
        this.f229255b = header;
        this.f229256c = fVar;
        this.d = cVar;
        this.e = aVar;
        this.f = dVar;
        this.f229257g = gVar;
        this.f229258h = arrayList;
        this.i = arrayList2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f229254a, aVar.f229254a) && Intrinsics.f(this.f229255b, aVar.f229255b) && Intrinsics.f(this.f229256c, aVar.f229256c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f229257g, aVar.f229257g) && Intrinsics.f(this.f229258h, aVar.f229258h) && Intrinsics.f(this.i, aVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f229255b.hashCode() + (this.f229254a.hashCode() * 31)) * 31;
        f fVar = this.f229256c;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        ts7.c cVar = this.d;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        rs7.b bVar = this.e;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        d dVar = this.f;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.f265354a.hashCode())) * 31;
        g gVar = this.f229257g;
        int iHashCode6 = (iHashCode5 + (gVar == null ? 0 : gVar.f308435a.hashCode())) * 31;
        List list = this.f229258h;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.i;
        return iHashCode7 + (list2 != null ? list2.hashCode() : 0);
    }
}

package zr7;

import cs7.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class t {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Lazy[] f324655j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hs7.f f324657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gs7.p f324658c;
    public final es7.f d;
    public final cs7.b e;
    public final ds7.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final is7.a f324659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f324660h;
    public final List i;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f324655j = new Lazy[]{null, null, null, null, yhm.j.c(kVar, new zr4.b(15)), null, null, yhm.j.c(kVar, new zr4.b(16)), yhm.j.c(kVar, new zr4.b(17))};
    }

    public /* synthetic */ t(int i, String str, hs7.f fVar, gs7.p pVar, es7.f fVar2, cs7.b bVar, ds7.b bVar2, is7.a aVar, List list, List list2) {
        if (511 != (i & 511)) {
            j1.f(r.f324654a.getDescriptor(), i, 511);
            throw null;
        }
        this.f324656a = str;
        this.f324657b = fVar;
        this.f324658c = pVar;
        this.d = fVar2;
        this.e = bVar;
        this.f = bVar2;
        this.f324659g = aVar;
        this.f324660h = list;
        this.i = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f324656a, tVar.f324656a) && Intrinsics.f(this.f324657b, tVar.f324657b) && Intrinsics.f(this.f324658c, tVar.f324658c) && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e) && Intrinsics.f(this.f, tVar.f) && Intrinsics.f(this.f324659g, tVar.f324659g) && Intrinsics.f(this.f324660h, tVar.f324660h) && Intrinsics.f(this.i, tVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f324657b.hashCode() + (this.f324656a.hashCode() * 31)) * 31;
        gs7.p pVar = this.f324658c;
        int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        es7.f fVar = this.d;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        cs7.b bVar = this.e;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ds7.b bVar2 = this.f;
        int iHashCode5 = (iHashCode4 + (bVar2 == null ? 0 : bVar2.f117260a.hashCode())) * 31;
        is7.a aVar = this.f324659g;
        int iHashCode6 = (iHashCode5 + (aVar == null ? 0 : aVar.f168152a.hashCode())) * 31;
        List list = this.f324660h;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.i;
        return iHashCode7 + (list2 != null ? list2.hashCode() : 0);
    }

    public t(String product, hs7.f header, gs7.p pVar, es7.f fVar, b.a aVar, ds7.b bVar, is7.a aVar2, ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f324656a = product;
        this.f324657b = header;
        this.f324658c = pVar;
        this.d = fVar;
        this.e = aVar;
        this.f = bVar;
        this.f324659g = aVar2;
        this.f324660h = arrayList;
        this.i = arrayList2;
    }
}

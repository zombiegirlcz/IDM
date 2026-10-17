package jla;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f175665g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f175666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f175667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f175668c;
    public final Map d;
    public final Map e;
    public final Map f;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f175665g = new Lazy[]{yhm.j.c(kVar, new jj9.b(17)), yhm.j.c(kVar, new jj9.b(18)), yhm.j.c(kVar, new jj9.b(19)), yhm.j.c(kVar, new jj9.b(20)), yhm.j.c(kVar, new jj9.b(21)), yhm.j.c(kVar, new jj9.b(22))};
    }

    public /* synthetic */ k(int i, Map map, Map map2, Map map3, Map map4, Map map5, Map map6) {
        if (63 != (i & 63)) {
            j1.f(i.f175664a.getDescriptor(), i, 63);
            throw null;
        }
        this.f175666a = map;
        this.f175667b = map2;
        this.f175668c = map3;
        this.d = map4;
        this.e = map5;
        this.f = map6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f175666a, kVar.f175666a) && Intrinsics.f(this.f175667b, kVar.f175667b) && Intrinsics.f(this.f175668c, kVar.f175668c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f);
    }

    public final int hashCode() {
        Map map = this.f175666a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.f175667b;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.f175668c;
        int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map map4 = this.d;
        int iHashCode4 = (iHashCode3 + (map4 == null ? 0 : map4.hashCode())) * 31;
        Map map5 = this.e;
        int iHashCode5 = (iHashCode4 + (map5 == null ? 0 : map5.hashCode())) * 31;
        Map map6 = this.f;
        return iHashCode5 + (map6 != null ? map6.hashCode() : 0);
    }

    public k(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, LinkedHashMap linkedHashMap5, LinkedHashMap linkedHashMap6) {
        this.f175666a = linkedHashMap;
        this.f175667b = linkedHashMap2;
        this.f175668c = linkedHashMap3;
        this.d = linkedHashMap4;
        this.e = linkedHashMap5;
        this.f = linkedHashMap6;
    }
}

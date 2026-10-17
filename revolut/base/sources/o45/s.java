package o45;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Lazy[] f222097l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f222098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f222099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f222100c;
    public final List d;
    public final List e;
    public final Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f222101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f222102h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f222103j;
    public final List k;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f222097l = new Lazy[]{null, null, null, yhm.j.c(kVar, new o23.b(8)), yhm.j.c(kVar, new o23.b(9)), null, null, null, null, yhm.j.c(kVar, new o23.b(10)), yhm.j.c(kVar, new o23.b(11))};
    }

    public /* synthetic */ s(int i, Long l2, long j2, long j3, List list, List list2, Boolean bool, Boolean bool2, Long l3, Long l4, List list3, List list4) {
        if (2047 != (i & 2047)) {
            qlm.j1.f(q.f222093a.getDescriptor(), i, 2047);
            throw null;
        }
        this.f222098a = l2;
        this.f222099b = j2;
        this.f222100c = j3;
        this.d = list;
        this.e = list2;
        this.f = bool;
        this.f222101g = bool2;
        this.f222102h = l3;
        this.i = l4;
        this.f222103j = list3;
        this.k = list4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f222098a, sVar.f222098a) && this.f222099b == sVar.f222099b && this.f222100c == sVar.f222100c && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e) && Intrinsics.f(this.f, sVar.f) && Intrinsics.f(this.f222101g, sVar.f222101g) && Intrinsics.f(this.f222102h, sVar.f222102h) && Intrinsics.f(this.i, sVar.i) && Intrinsics.f(this.f222103j, sVar.f222103j) && Intrinsics.f(this.k, sVar.k);
    }

    public final int hashCode() {
        Long l2 = this.f222098a;
        int iC = a0.d.c(a0.d.c((l2 == null ? 0 : l2.hashCode()) * 31, 31, this.f222099b), 31, this.f222100c);
        List list = this.d;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f222101g;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l3 = this.f222102h;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.i;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        List list3 = this.f222103j;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.k;
        return iHashCode7 + (list4 != null ? list4.hashCode() : 0);
    }

    public s(Long l2, long j2, long j3, ArrayList arrayList, ArrayList arrayList2, Boolean bool, Boolean bool2, Long l3, Long l4, ArrayList arrayList3, ArrayList arrayList4) {
        this.f222098a = l2;
        this.f222099b = j2;
        this.f222100c = j3;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = bool;
        this.f222101g = bool2;
        this.f222102h = l3;
        this.i = l4;
        this.f222103j = arrayList3;
        this.k = arrayList4;
    }
}

package qz8;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Lazy[] f250384q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f250385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f250386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f250387c;
    public final String d;
    public final boolean e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f250388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final pz8.b f250389h;
    public final pz8.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zz8.c f250390j;
    public final n k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f250391l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f250392m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f250393n;
    public final q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Boolean f250394p;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f250384q = new Lazy[]{yhm.j.c(kVar, new qu1.d(28)), null, null, null, null, null, yhm.j.c(kVar, new qu1.d(29)), yhm.j.c(kVar, new f(0)), yhm.j.c(kVar, new f(1)), yhm.j.c(kVar, new f(2)), yhm.j.c(kVar, new f(3)), yhm.j.c(kVar, new f(4)), null, null, null, null};
    }

    public /* synthetic */ i(int i, List list, String str, String str2, String str3, boolean z, int i2, List list2, pz8.b bVar, pz8.g gVar, zz8.c cVar, n nVar, List list3, String str4, String str5, q qVar, Boolean bool) {
        if (14204 != (i & 14204)) {
            j1.f(g.f250383a.getDescriptor(), i, 14204);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f250385a = null;
        } else {
            this.f250385a = list;
        }
        if ((i & 2) == 0) {
            this.f250386b = null;
        } else {
            this.f250386b = str;
        }
        this.f250387c = str2;
        this.d = str3;
        this.e = z;
        this.f = i2;
        this.f250388g = list2;
        if ((i & 128) == 0) {
            this.f250389h = null;
        } else {
            this.f250389h = bVar;
        }
        this.i = gVar;
        this.f250390j = cVar;
        this.k = nVar;
        if ((i & 2048) == 0) {
            this.f250391l = null;
        } else {
            this.f250391l = list3;
        }
        this.f250392m = str4;
        this.f250393n = str5;
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = qVar;
        }
        if ((i & 32768) == 0) {
            this.f250394p = null;
        } else {
            this.f250394p = bool;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f250385a, iVar.f250385a) && Intrinsics.f(this.f250386b, iVar.f250386b) && Intrinsics.f(this.f250387c, iVar.f250387c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e && this.f == iVar.f && Intrinsics.f(this.f250388g, iVar.f250388g) && this.f250389h == iVar.f250389h && this.i == iVar.i && Intrinsics.f(this.f250390j, iVar.f250390j) && this.k == iVar.k && Intrinsics.f(this.f250391l, iVar.f250391l) && Intrinsics.f(this.f250392m, iVar.f250392m) && Intrinsics.f(this.f250393n, iVar.f250393n) && Intrinsics.f(this.o, iVar.o) && Intrinsics.f(this.f250394p, iVar.f250394p);
    }

    public final int hashCode() {
        List list = this.f250385a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f250386b;
        int iD = p.a.d(j6.a.b(this.f, j6.a.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f250387c), 31, this.d), 31, this.e), 31), 31, this.f250388g);
        pz8.b bVar = this.f250389h;
        int iHashCode2 = (this.k.hashCode() + ((this.f250390j.hashCode() + ((this.i.hashCode() + ((iD + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31)) * 31)) * 31;
        List list2 = this.f250391l;
        int iC = p.a.c(p.a.c((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.f250392m), 31, this.f250393n);
        q qVar = this.o;
        int iHashCode3 = (iC + (qVar == null ? 0 : qVar.f250400a.hashCode())) * 31;
        Boolean bool = this.f250394p;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }
}

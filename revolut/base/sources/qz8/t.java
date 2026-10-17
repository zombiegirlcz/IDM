package qz8;

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

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Lazy[] f250402r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f250403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f250404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f250405c;
    public final String d;
    public final boolean e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f250406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f250407h;
    public final pz8.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pz8.g f250408j;
    public final zz8.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f250409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f250410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f250411n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f250412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Boolean f250413q;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f250402r = new Lazy[]{yhm.j.c(kVar, new f(8)), null, null, null, null, null, yhm.j.c(kVar, new f(9)), yhm.j.c(kVar, new f(10)), yhm.j.c(kVar, new f(11)), yhm.j.c(kVar, new f(12)), yhm.j.c(kVar, new f(13)), yhm.j.c(kVar, new f(14)), yhm.j.c(kVar, new f(15)), null, null, null, null};
    }

    public /* synthetic */ t(int i, List list, String str, String str2, String str3, boolean z, int i2, List list2, List list3, pz8.b bVar, pz8.g gVar, zz8.c cVar, n nVar, List list4, String str4, String str5, q qVar, Boolean bool) {
        if (28412 != (i & 28412)) {
            j1.f(r.f250401a.getDescriptor(), i, 28412);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f250403a = null;
        } else {
            this.f250403a = list;
        }
        if ((i & 2) == 0) {
            this.f250404b = null;
        } else {
            this.f250404b = str;
        }
        this.f250405c = str2;
        this.d = str3;
        this.e = z;
        this.f = i2;
        this.f250406g = list2;
        this.f250407h = list3;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bVar;
        }
        this.f250408j = gVar;
        this.k = cVar;
        this.f250409l = nVar;
        if ((i & 4096) == 0) {
            this.f250410m = null;
        } else {
            this.f250410m = list4;
        }
        this.f250411n = str4;
        this.o = str5;
        if ((32768 & i) == 0) {
            this.f250412p = null;
        } else {
            this.f250412p = qVar;
        }
        if ((i & 65536) == 0) {
            this.f250413q = null;
        } else {
            this.f250413q = bool;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f250403a, tVar.f250403a) && Intrinsics.f(this.f250404b, tVar.f250404b) && Intrinsics.f(this.f250405c, tVar.f250405c) && Intrinsics.f(this.d, tVar.d) && this.e == tVar.e && this.f == tVar.f && Intrinsics.f(this.f250406g, tVar.f250406g) && Intrinsics.f(this.f250407h, tVar.f250407h) && this.i == tVar.i && this.f250408j == tVar.f250408j && Intrinsics.f(this.k, tVar.k) && this.f250409l == tVar.f250409l && Intrinsics.f(this.f250410m, tVar.f250410m) && Intrinsics.f(this.f250411n, tVar.f250411n) && Intrinsics.f(this.o, tVar.o) && Intrinsics.f(this.f250412p, tVar.f250412p) && Intrinsics.f(this.f250413q, tVar.f250413q);
    }

    public final int hashCode() {
        List list = this.f250403a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f250404b;
        int iD = p.a.d(p.a.d(j6.a.b(this.f, j6.a.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f250405c), 31, this.d), 31, this.e), 31), 31, this.f250406g), 31, this.f250407h);
        pz8.b bVar = this.i;
        int iHashCode2 = (this.f250409l.hashCode() + ((this.k.hashCode() + ((this.f250408j.hashCode() + ((iD + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31)) * 31)) * 31;
        List list2 = this.f250410m;
        int iC = p.a.c(p.a.c((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.f250411n), 31, this.o);
        q qVar = this.f250412p;
        int iHashCode3 = (iC + (qVar == null ? 0 : qVar.f250400a.hashCode())) * 31;
        Boolean bool = this.f250413q;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }
}

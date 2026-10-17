package j1f;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();
    public static final Lazy[] u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170405c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f170406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f170407h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f170408j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f170409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x f170410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f170411n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f170412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f170413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f170414r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f170415s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f170416t;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        u = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, null, yhm.j.c(kVar, new j18.j(25)), null, null, yhm.j.c(kVar, new j18.j(26)), yhm.j.c(kVar, new j18.j(27)), null, null};
    }

    public n(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, x xVar, List list, String str12, String str13, List list2, List list3, k kVar, i iVar) {
        if (15855 != (i & 15855)) {
            j1.f(l.f170399a.getDescriptor(), i, 15855);
            throw null;
        }
        this.f170403a = str;
        this.f170404b = str2;
        this.f170405c = str3;
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        this.f = str6;
        this.f170406g = str7;
        this.f170407h = str8;
        this.i = str9;
        if ((i & 512) == 0) {
            this.f170408j = null;
        } else {
            this.f170408j = str10;
        }
        this.k = z;
        this.f170409l = str11;
        this.f170410m = xVar;
        this.f170411n = list;
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str12;
        }
        if ((32768 & i) == 0) {
            this.f170412p = null;
        } else {
            this.f170412p = str13;
        }
        this.f170413q = (65536 & i) == 0 ? zhm.f0.f322471a : list2;
        this.f170414r = (131072 & i) == 0 ? zhm.f0.f322471a : list3;
        if ((262144 & i) == 0) {
            this.f170415s = null;
        } else {
            this.f170415s = kVar;
        }
        if ((i & 524288) == 0) {
            this.f170416t = null;
        } else {
            this.f170416t = iVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f170403a, nVar.f170403a) && Intrinsics.f(this.f170404b, nVar.f170404b) && Intrinsics.f(this.f170405c, nVar.f170405c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f170406g, nVar.f170406g) && Intrinsics.f(this.f170407h, nVar.f170407h) && Intrinsics.f(this.i, nVar.i) && Intrinsics.f(this.f170408j, nVar.f170408j) && this.k == nVar.k && Intrinsics.f(this.f170409l, nVar.f170409l) && Intrinsics.f(this.f170410m, nVar.f170410m) && Intrinsics.f(this.f170411n, nVar.f170411n) && Intrinsics.f(this.o, nVar.o) && Intrinsics.f(this.f170412p, nVar.f170412p) && Intrinsics.f(this.f170413q, nVar.f170413q) && Intrinsics.f(this.f170414r, nVar.f170414r) && Intrinsics.f(this.f170415s, nVar.f170415s) && Intrinsics.f(this.f170416t, nVar.f170416t);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f170403a.hashCode() * 31, 31, this.f170404b), 31, this.f170405c), 31, this.d);
        String str = this.e;
        int iC2 = p.a.c(p.a.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.f170406g), 31, this.f170407h), 31, this.i);
        String str2 = this.f170408j;
        int iD = p.a.d((this.f170410m.hashCode() + p.a.c(j6.a.c((iC2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.k), 31, this.f170409l)) * 31, 31, this.f170411n);
        String str3 = this.o;
        int iHashCode = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f170412p;
        int iHashCode2 = (iHashCode + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f170413q;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f170414r;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        k kVar = this.f170415s;
        int iHashCode5 = (iHashCode4 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        i iVar = this.f170416t;
        return iHashCode5 + (iVar != null ? iVar.hashCode() : 0);
    }
}

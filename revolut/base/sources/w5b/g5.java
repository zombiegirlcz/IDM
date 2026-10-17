package w5b;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class g5 {

    @NotNull
    public static final f5 Companion = new f5();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Lazy[] f294847q = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new w56.a(24)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f294849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f294850c;
    public final jo3.a d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f294851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f294852h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f294853j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f294854l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f294855m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d5 f294856n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n5 f294857p;

    public /* synthetic */ g5(int i, String str, long j2, int i2, jo3.a aVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, d5 d5Var, List list, n5 n5Var) {
        if (1823 != (i & 1823)) {
            qlm.j1.f(e5.f294825a.getDescriptor(), i, 1823);
            throw null;
        }
        this.f294848a = str;
        this.f294849b = j2;
        this.f294850c = i2;
        this.d = aVar;
        this.e = str2;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.f294851g = null;
        } else {
            this.f294851g = str4;
        }
        if ((i & 128) == 0) {
            this.f294852h = null;
        } else {
            this.f294852h = str5;
        }
        this.i = str6;
        this.f294853j = str7;
        this.k = str8;
        if ((i & 2048) == 0) {
            this.f294854l = null;
        } else {
            this.f294854l = str9;
        }
        if ((i & 4096) == 0) {
            this.f294855m = null;
        } else {
            this.f294855m = str10;
        }
        if ((i & 8192) == 0) {
            this.f294856n = null;
        } else {
            this.f294856n = d5Var;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = list;
        }
        if ((i & 32768) == 0) {
            this.f294857p = null;
        } else {
            this.f294857p = n5Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj2;
        return Intrinsics.f(this.f294848a, g5Var.f294848a) && this.f294849b == g5Var.f294849b && this.f294850c == g5Var.f294850c && Intrinsics.f(this.d, g5Var.d) && Intrinsics.f(this.e, g5Var.e) && Intrinsics.f(this.f, g5Var.f) && Intrinsics.f(this.f294851g, g5Var.f294851g) && Intrinsics.f(this.f294852h, g5Var.f294852h) && Intrinsics.f(this.i, g5Var.i) && Intrinsics.f(this.f294853j, g5Var.f294853j) && Intrinsics.f(this.k, g5Var.k) && Intrinsics.f(this.f294854l, g5Var.f294854l) && Intrinsics.f(this.f294855m, g5Var.f294855m) && Intrinsics.f(this.f294856n, g5Var.f294856n) && Intrinsics.f(this.o, g5Var.o) && Intrinsics.f(this.f294857p, g5Var.f294857p);
    }

    public final int hashCode() {
        int iC = p.a.c(ip0.v7.j(this.d, j6.a.b(this.f294850c, a0.d.c(this.f294848a.hashCode() * 31, 31, this.f294849b), 31), 31), 31, this.e);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f294851g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f294852h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f294853j;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f294854l;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f294855m;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        d5 d5Var = this.f294856n;
        int iHashCode9 = (iHashCode8 + (d5Var == null ? 0 : d5Var.hashCode())) * 31;
        List list = this.o;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        n5 n5Var = this.f294857p;
        return iHashCode10 + (n5Var != null ? n5Var.hashCode() : 0);
    }

    public g5(String id10, long j2, int i, jo3.a amount, String description, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, d5 d5Var, ArrayList arrayList, n5 n5Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f294848a = id10;
        this.f294849b = j2;
        this.f294850c = i;
        this.d = amount;
        this.e = description;
        this.f = str;
        this.f294851g = str2;
        this.f294852h = str3;
        this.i = str4;
        this.f294853j = str5;
        this.k = str6;
        this.f294854l = str7;
        this.f294855m = str8;
        this.f294856n = d5Var;
        this.o = arrayList;
        this.f294857p = n5Var;
    }
}

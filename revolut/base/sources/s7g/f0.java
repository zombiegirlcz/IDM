package s7g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class f0 {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Lazy[] f260711p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f260714c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f260715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f260716h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c0 f260717j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f260718l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r0 f260719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f260720n;
    public final List o;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f260711p = new Lazy[]{null, null, null, null, null, null, null, null, null, null, yhm.j.c(kVar, new s77.x(3)), yhm.j.c(kVar, new s77.x(4)), null, yhm.j.c(kVar, new s77.x(5)), yhm.j.c(kVar, new s77.x(6))};
    }

    public /* synthetic */ f0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, c0 c0Var, List list, List list2, r0 r0Var, List list3, List list4) {
        if (11647 != (i & 11647)) {
            qlm.j1.f(d0.f260696a.getDescriptor(), i, 11647);
            throw null;
        }
        this.f260712a = str;
        this.f260713b = str2;
        this.f260714c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f260715g = str7;
        if ((i & 128) == 0) {
            this.f260716h = null;
        } else {
            this.f260716h = str8;
        }
        this.i = str9;
        if ((i & 512) == 0) {
            this.f260717j = null;
        } else {
            this.f260717j = c0Var;
        }
        this.k = list;
        this.f260718l = list2;
        if ((i & 4096) == 0) {
            this.f260719m = null;
        } else {
            this.f260719m = r0Var;
        }
        this.f260720n = list3;
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = list4;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f260712a, f0Var.f260712a) && Intrinsics.f(this.f260713b, f0Var.f260713b) && Intrinsics.f(this.f260714c, f0Var.f260714c) && Intrinsics.f(this.d, f0Var.d) && Intrinsics.f(this.e, f0Var.e) && Intrinsics.f(this.f, f0Var.f) && Intrinsics.f(this.f260715g, f0Var.f260715g) && Intrinsics.f(this.f260716h, f0Var.f260716h) && Intrinsics.f(this.i, f0Var.i) && Intrinsics.f(this.f260717j, f0Var.f260717j) && Intrinsics.f(this.k, f0Var.k) && Intrinsics.f(this.f260718l, f0Var.f260718l) && Intrinsics.f(this.f260719m, f0Var.f260719m) && Intrinsics.f(this.f260720n, f0Var.f260720n) && Intrinsics.f(this.o, f0Var.o);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f260712a.hashCode() * 31, 31, this.f260713b), 31, this.f260714c), 31, this.d), 31, this.e), 31, this.f), 31, this.f260715g);
        String str = this.f260716h;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.i);
        c0 c0Var = this.f260717j;
        int iD = p.a.d(p.a.d((iC2 + (c0Var == null ? 0 : c0Var.hashCode())) * 31, 31, this.k), 31, this.f260718l);
        r0 r0Var = this.f260719m;
        int iD2 = p.a.d((iD + (r0Var == null ? 0 : r0Var.hashCode())) * 31, 31, this.f260720n);
        List list = this.o;
        return iD2 + (list != null ? list.hashCode() : 0);
    }
}

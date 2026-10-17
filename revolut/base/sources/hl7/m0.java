package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153202c;
    public final int d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f153203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f153204h;
    public final Boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f153205j;
    public final d5 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f153206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f153207m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f153208n;
    public final String o;

    public /* synthetic */ m0(int i, String str, String str2, String str3, int i2, String str4, String str5, String str6, Integer num, Boolean bool, Boolean bool2, d5 d5Var, Boolean bool3, String str7, String str8, String str9) {
        if (32767 != (i & 32767)) {
            qlm.j1.f(k0.f153166a.getDescriptor(), i, 32767);
            throw null;
        }
        this.f153200a = str;
        this.f153201b = str2;
        this.f153202c = str3;
        this.d = i2;
        this.e = str4;
        this.f = str5;
        this.f153203g = str6;
        this.f153204h = num;
        this.i = bool;
        this.f153205j = bool2;
        this.k = d5Var;
        this.f153206l = bool3;
        this.f153207m = str7;
        this.f153208n = str8;
        this.o = str9;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f153200a, m0Var.f153200a) && Intrinsics.f(this.f153201b, m0Var.f153201b) && Intrinsics.f(this.f153202c, m0Var.f153202c) && this.d == m0Var.d && Intrinsics.f(this.e, m0Var.e) && Intrinsics.f(this.f, m0Var.f) && Intrinsics.f(this.f153203g, m0Var.f153203g) && Intrinsics.f(this.f153204h, m0Var.f153204h) && Intrinsics.f(this.i, m0Var.i) && Intrinsics.f(this.f153205j, m0Var.f153205j) && Intrinsics.f(this.k, m0Var.k) && Intrinsics.f(this.f153206l, m0Var.f153206l) && Intrinsics.f(this.f153207m, m0Var.f153207m) && Intrinsics.f(this.f153208n, m0Var.f153208n) && Intrinsics.f(this.o, m0Var.o);
    }

    public final int hashCode() {
        String str = this.f153200a;
        int iB = j6.a.b(this.d, p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f153201b), 31, this.f153202c), 31);
        String str2 = this.e;
        int iHashCode = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f153203g;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f153204h;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f153205j;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        d5 d5Var = this.k;
        int iHashCode7 = (iHashCode6 + (d5Var == null ? 0 : d5Var.hashCode())) * 31;
        Boolean bool3 = this.f153206l;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str5 = this.f153207m;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f153208n;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.o;
        return iHashCode10 + (str7 != null ? str7.hashCode() : 0);
    }

    public m0(String str, String make, String model, int i, String str2, String str3, String str4, Integer num, Boolean bool, Boolean bool2, d5 d5Var, Boolean bool3, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f153200a = str;
        this.f153201b = make;
        this.f153202c = model;
        this.d = i;
        this.e = str2;
        this.f = str3;
        this.f153203g = str4;
        this.f153204h = num;
        this.i = bool;
        this.f153205j = bool2;
        this.k = d5Var;
        this.f153206l = bool3;
        this.f153207m = str5;
        this.f153208n = str6;
        this.o = str7;
    }
}

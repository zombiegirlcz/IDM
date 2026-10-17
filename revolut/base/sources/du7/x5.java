package du7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class x5 {

    @NotNull
    public static final w5 Companion = new w5();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Lazy[] f117901q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117904c;
    public final String d;
    public final String e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f117905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f117906h;
    public final p6 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f117907j;
    public final a6 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f117908l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l5 f117909m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Boolean f117910n;
    public final h0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g3 f117911p;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f117901q = new Lazy[]{null, null, null, null, null, yhm.j.c(kVar, new e2(20)), yhm.j.c(kVar, new e2(21)), yhm.j.c(kVar, new e2(22)), null, yhm.j.c(kVar, new e2(23)), null, yhm.j.c(kVar, new e2(24)), null, null, null, null};
    }

    public /* synthetic */ x5(int i, String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, p6 p6Var, List list4, a6 a6Var, List list5, l5 l5Var, Boolean bool, h0 h0Var, g3 g3Var) {
        if (65535 != (i & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH)) {
            qlm.j1.f(v5.f117879a.getDescriptor(), i, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            throw null;
        }
        this.f117902a = str;
        this.f117903b = str2;
        this.f117904c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
        this.f117905g = list2;
        this.f117906h = list3;
        this.i = p6Var;
        this.f117907j = list4;
        this.k = a6Var;
        this.f117908l = list5;
        this.f117909m = l5Var;
        this.f117910n = bool;
        this.o = h0Var;
        this.f117911p = g3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x5)) {
            return false;
        }
        x5 x5Var = (x5) obj2;
        return Intrinsics.f(this.f117902a, x5Var.f117902a) && Intrinsics.f(this.f117903b, x5Var.f117903b) && Intrinsics.f(this.f117904c, x5Var.f117904c) && Intrinsics.f(this.d, x5Var.d) && Intrinsics.f(this.e, x5Var.e) && Intrinsics.f(this.f, x5Var.f) && Intrinsics.f(this.f117905g, x5Var.f117905g) && Intrinsics.f(this.f117906h, x5Var.f117906h) && Intrinsics.f(this.i, x5Var.i) && Intrinsics.f(this.f117907j, x5Var.f117907j) && Intrinsics.f(this.k, x5Var.k) && Intrinsics.f(this.f117908l, x5Var.f117908l) && Intrinsics.f(this.f117909m, x5Var.f117909m) && Intrinsics.f(this.f117910n, x5Var.f117910n) && Intrinsics.f(this.o, x5Var.o) && Intrinsics.f(this.f117911p, x5Var.f117911p);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f117902a.hashCode() * 31, 31, this.f117903b);
        String str = this.f117904c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (this.k.hashCode() + p.a.d((this.i.hashCode() + p.a.d(p.a.d(p.a.d((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f), 31, this.f117905g), 31, this.f117906h)) * 31, 31, this.f117907j)) * 31;
        List list = this.f117908l;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        l5 l5Var = this.f117909m;
        int iHashCode5 = (iHashCode4 + (l5Var == null ? 0 : l5Var.hashCode())) * 31;
        Boolean bool = this.f117910n;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        h0 h0Var = this.o;
        int iHashCode7 = (iHashCode6 + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        g3 g3Var = this.f117911p;
        return iHashCode7 + (g3Var != null ? g3Var.hashCode() : 0);
    }
}

package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class a1 {

    @NotNull
    public static final w0 Companion = new w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f124482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f124483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f124484c;
    public final z0 d;
    public final z0 e;
    public final v0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f124485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f124486h;
    public final s0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f124487j;
    public final String k;

    public /* synthetic */ a1(int i, z0 z0Var, z0 z0Var2, z0 z0Var3, z0 z0Var4, z0 z0Var5, v0 v0Var, String str, String str2, s0 s0Var, String str3, String str4) {
        if (2047 != (i & 2047)) {
            qlm.j1.f(p0.f124641a.getDescriptor(), i, 2047);
            throw null;
        }
        this.f124482a = z0Var;
        this.f124483b = z0Var2;
        this.f124484c = z0Var3;
        this.d = z0Var4;
        this.e = z0Var5;
        this.f = v0Var;
        this.f124485g = str;
        this.f124486h = str2;
        this.i = s0Var;
        this.f124487j = str3;
        this.k = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return Intrinsics.f(this.f124482a, a1Var.f124482a) && Intrinsics.f(this.f124483b, a1Var.f124483b) && Intrinsics.f(this.f124484c, a1Var.f124484c) && Intrinsics.f(this.d, a1Var.d) && Intrinsics.f(this.e, a1Var.e) && Intrinsics.f(this.f, a1Var.f) && Intrinsics.f(this.f124485g, a1Var.f124485g) && Intrinsics.f(this.f124486h, a1Var.f124486h) && Intrinsics.f(this.i, a1Var.i) && Intrinsics.f(this.f124487j, a1Var.f124487j) && Intrinsics.f(this.k, a1Var.k);
    }

    public final int hashCode() {
        z0 z0Var = this.f124482a;
        int iHashCode = (z0Var == null ? 0 : z0Var.hashCode()) * 31;
        z0 z0Var2 = this.f124483b;
        int iHashCode2 = (iHashCode + (z0Var2 == null ? 0 : z0Var2.hashCode())) * 31;
        z0 z0Var3 = this.f124484c;
        int iHashCode3 = (iHashCode2 + (z0Var3 == null ? 0 : z0Var3.hashCode())) * 31;
        z0 z0Var4 = this.d;
        int iHashCode4 = (iHashCode3 + (z0Var4 == null ? 0 : z0Var4.hashCode())) * 31;
        z0 z0Var5 = this.e;
        int iHashCode5 = (iHashCode4 + (z0Var5 == null ? 0 : z0Var5.hashCode())) * 31;
        v0 v0Var = this.f;
        int iHashCode6 = (iHashCode5 + (v0Var == null ? 0 : v0Var.hashCode())) * 31;
        String str = this.f124485g;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f124486h;
        int iHashCode8 = (this.i.hashCode() + ((iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f124487j;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        return iHashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    public a1(z0 z0Var, z0 z0Var2, z0 z0Var3, z0 z0Var4, z0 z0Var5, v0 v0Var, String str, String str2, s0 breakdownConfig, String str3, String str4) {
        Intrinsics.checkNotNullParameter(breakdownConfig, "breakdownConfig");
        this.f124482a = z0Var;
        this.f124483b = z0Var2;
        this.f124484c = z0Var3;
        this.d = z0Var4;
        this.e = z0Var5;
        this.f = v0Var;
        this.f124485g = str;
        this.f124486h = str2;
        this.i = breakdownConfig;
        this.f124487j = str3;
        this.k = str4;
    }
}

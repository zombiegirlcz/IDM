package tof;

import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f272897c;
    public final h0 d;
    public final h0 e;
    public final h0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h0 f272898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h0 f272899h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BigDecimal f272900j;
    public final j0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k0 f272901l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i0 f272902m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i0 f272903n;
    public final wk5.a o;

    public l0(String accountId, String accountScopedAssetId, h0 amount, h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, h0 h0Var5, String str, BigDecimal bigDecimal, j0 j0Var, k0 k0Var, i0 i0Var, i0 i0Var2, wk5.a aVar) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(accountScopedAssetId, "accountScopedAssetId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f272895a = accountId;
        this.f272896b = accountScopedAssetId;
        this.f272897c = amount;
        this.d = h0Var;
        this.e = h0Var2;
        this.f = h0Var3;
        this.f272898g = h0Var4;
        this.f272899h = h0Var5;
        this.i = str;
        this.f272900j = bigDecimal;
        this.k = j0Var;
        this.f272901l = k0Var;
        this.f272902m = i0Var;
        this.f272903n = i0Var2;
        this.o = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f272895a, l0Var.f272895a) && Intrinsics.f(this.f272896b, l0Var.f272896b) && Intrinsics.f(this.f272897c, l0Var.f272897c) && Intrinsics.f(this.d, l0Var.d) && Intrinsics.f(this.e, l0Var.e) && Intrinsics.f(this.f, l0Var.f) && Intrinsics.f(this.f272898g, l0Var.f272898g) && Intrinsics.f(this.f272899h, l0Var.f272899h) && Intrinsics.f(this.i, l0Var.i) && Intrinsics.f(this.f272900j, l0Var.f272900j) && Intrinsics.f(this.k, l0Var.k) && Intrinsics.f(this.f272901l, l0Var.f272901l) && Intrinsics.f(this.f272902m, l0Var.f272902m) && Intrinsics.f(this.f272903n, l0Var.f272903n) && this.o == l0Var.o;
    }

    public final int hashCode() {
        int iHashCode = (this.f272897c.hashCode() + p.a.c(this.f272895a.hashCode() * 31, 31, this.f272896b)) * 31;
        h0 h0Var = this.d;
        int iHashCode2 = (iHashCode + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        h0 h0Var2 = this.e;
        int iHashCode3 = (iHashCode2 + (h0Var2 == null ? 0 : h0Var2.hashCode())) * 31;
        h0 h0Var3 = this.f;
        int iHashCode4 = (iHashCode3 + (h0Var3 == null ? 0 : h0Var3.hashCode())) * 31;
        h0 h0Var4 = this.f272898g;
        int iHashCode5 = (iHashCode4 + (h0Var4 == null ? 0 : h0Var4.hashCode())) * 31;
        h0 h0Var5 = this.f272899h;
        int iHashCode6 = (iHashCode5 + (h0Var5 == null ? 0 : h0Var5.hashCode())) * 31;
        String str = this.i;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.f272900j;
        int iHashCode8 = (iHashCode7 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        j0 j0Var = this.k;
        int iHashCode9 = (iHashCode8 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        k0 k0Var = this.f272901l;
        int iHashCode10 = (iHashCode9 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        i0 i0Var = this.f272902m;
        int iHashCode11 = (iHashCode10 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        i0 i0Var2 = this.f272903n;
        int iHashCode12 = (iHashCode11 + (i0Var2 == null ? 0 : i0Var2.hashCode())) * 31;
        wk5.a aVar = this.o;
        return iHashCode12 + (aVar != null ? aVar.hashCode() : 0);
    }
}

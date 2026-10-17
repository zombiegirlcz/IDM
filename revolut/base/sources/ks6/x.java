package ks6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x {
    public final f0 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f189278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f189279c;
    public final String d;
    public final String e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f189280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f189281h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f189282j;
    public final jo3.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jo3.b f189283l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jo3.b f189284m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f189285n;
    public final w o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a0 f189286p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z f189287q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f189288r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f189289s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f189290t;
    public final List u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f189291w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f189292x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n0 f189293y;
    public final String z;

    public x(String id10, String str, String number, String numberFormatted, String numberPrefix, Long l2, Long l3, Long l4, String currency, String status, jo3.b total, jo3.b subtotal, jo3.b totalTax, String str2, w wVar, a0 a0Var, z zVar, List enabledPaymentMethods, List enabledReminders, List taxes, List items, String str3, String str4, String str5, n0 n0Var, String str6, f0 f0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(numberFormatted, "numberFormatted");
        Intrinsics.checkNotNullParameter(numberPrefix, "numberPrefix");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(subtotal, "subtotal");
        Intrinsics.checkNotNullParameter(totalTax, "totalTax");
        Intrinsics.checkNotNullParameter(enabledPaymentMethods, "enabledPaymentMethods");
        Intrinsics.checkNotNullParameter(enabledReminders, "enabledReminders");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f189277a = id10;
        this.f189278b = str;
        this.f189279c = number;
        this.d = numberFormatted;
        this.e = numberPrefix;
        this.f = l2;
        this.f189280g = l3;
        this.f189281h = l4;
        this.i = currency;
        this.f189282j = status;
        this.k = total;
        this.f189283l = subtotal;
        this.f189284m = totalTax;
        this.f189285n = str2;
        this.o = wVar;
        this.f189286p = a0Var;
        this.f189287q = zVar;
        this.f189288r = enabledPaymentMethods;
        this.f189289s = enabledReminders;
        this.f189290t = taxes;
        this.u = items;
        this.v = str3;
        this.f189291w = str4;
        this.f189292x = str5;
        this.f189293y = n0Var;
        this.z = str6;
        this.A = f0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f189277a, xVar.f189277a) && Intrinsics.f(this.f189278b, xVar.f189278b) && Intrinsics.f(this.f189279c, xVar.f189279c) && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e) && Intrinsics.f(this.f, xVar.f) && Intrinsics.f(this.f189280g, xVar.f189280g) && Intrinsics.f(this.f189281h, xVar.f189281h) && Intrinsics.f(this.i, xVar.i) && Intrinsics.f(this.f189282j, xVar.f189282j) && Intrinsics.f(this.k, xVar.k) && Intrinsics.f(this.f189283l, xVar.f189283l) && Intrinsics.f(this.f189284m, xVar.f189284m) && Intrinsics.f(this.f189285n, xVar.f189285n) && Intrinsics.f(this.o, xVar.o) && Intrinsics.f(this.f189286p, xVar.f189286p) && Intrinsics.f(this.f189287q, xVar.f189287q) && Intrinsics.f(this.f189288r, xVar.f189288r) && Intrinsics.f(this.f189289s, xVar.f189289s) && Intrinsics.f(this.f189290t, xVar.f189290t) && Intrinsics.f(this.u, xVar.u) && Intrinsics.f(this.v, xVar.v) && Intrinsics.f(this.f189291w, xVar.f189291w) && Intrinsics.f(this.f189292x, xVar.f189292x) && Intrinsics.f(this.f189293y, xVar.f189293y) && Intrinsics.f(this.z, xVar.z) && Intrinsics.f(this.A, xVar.A);
    }

    public final int hashCode() {
        int iHashCode = this.f189277a.hashCode() * 31;
        String str = this.f189278b;
        int iC = p.a.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f189279c), 31, this.d), 31, this.e);
        Long l2 = this.f;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f189280g;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f189281h;
        int iE = wp5.y.e(this.f189284m, wp5.y.e(this.f189283l, wp5.y.e(this.k, p.a.c(p.a.c((iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.i), 31, this.f189282j), 31), 31), 31);
        String str2 = this.f189285n;
        int iHashCode4 = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        w wVar = this.o;
        int iHashCode5 = (iHashCode4 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        a0 a0Var = this.f189286p;
        int iHashCode6 = (iHashCode5 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        z zVar = this.f189287q;
        int iD = p.a.d(p.a.d(p.a.d(p.a.d((iHashCode6 + (zVar == null ? 0 : zVar.hashCode())) * 31, 31, this.f189288r), 31, this.f189289s), 31, this.f189290t), 31, this.u);
        String str3 = this.v;
        int iHashCode7 = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f189291w;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f189292x;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        n0 n0Var = this.f189293y;
        int iHashCode10 = (iHashCode9 + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
        String str6 = this.z;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        f0 f0Var = this.A;
        return iHashCode11 + (f0Var != null ? f0Var.hashCode() : 0);
    }
}

package ggc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143633c;
    public final String d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f143634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f143635h;
    public final w i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final cgc.o f143636j;

    public h0(String perkId, String planId, String str, String str2, String str3, boolean z, boolean z3, String str4, w form, cgc.o oVar) {
        Intrinsics.checkNotNullParameter(perkId, "perkId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(form, "form");
        this.f143631a = perkId;
        this.f143632b = planId;
        this.f143633c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.f143634g = z3;
        this.f143635h = str4;
        this.i = form;
        this.f143636j = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f143631a, h0Var.f143631a) && Intrinsics.f(this.f143632b, h0Var.f143632b) && Intrinsics.f(this.f143633c, h0Var.f143633c) && Intrinsics.f(this.d, h0Var.d) && Intrinsics.f(this.e, h0Var.e) && this.f == h0Var.f && this.f143634g == h0Var.f143634g && Intrinsics.f(this.f143635h, h0Var.f143635h) && this.i == h0Var.i && this.f143636j == h0Var.f143636j;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f143631a.hashCode() * 31, 31, this.f143632b);
        String str = this.f143633c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iC2 = j6.a.c(j6.a.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f), 31, this.f143634g);
        String str4 = this.f143635h;
        int iHashCode3 = (this.i.hashCode() + ((iC2 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        cgc.o oVar = this.f143636j;
        return iHashCode3 + (oVar != null ? oVar.hashCode() : 0);
    }
}

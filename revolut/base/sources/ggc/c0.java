package ggc;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDateTime;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f143612c;
    public final LocalDateTime d;
    public final LocalDateTime e;
    public final y f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f143613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f143614h;
    public final cgc.m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f143615j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f143616l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f143617m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f143618n;

    public c0(String id10, String perkId, d0 type, LocalDateTime startDate, LocalDateTime endDate, y merchant, t description, String primaryCategory, cgc.m mVar, m mVar2, boolean z, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(perkId, "perkId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryCategory, "primaryCategory");
        this.f143610a = id10;
        this.f143611b = perkId;
        this.f143612c = type;
        this.d = startDate;
        this.e = endDate;
        this.f = merchant;
        this.f143613g = description;
        this.f143614h = primaryCategory;
        this.i = mVar;
        this.f143615j = mVar2;
        this.k = z;
        this.f143616l = z3;
        this.f143617m = z4;
        this.f143618n = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f143610a, c0Var.f143610a) && Intrinsics.f(this.f143611b, c0Var.f143611b) && this.f143612c == c0Var.f143612c && Intrinsics.f(this.d, c0Var.d) && Intrinsics.f(this.e, c0Var.e) && Intrinsics.f(this.f, c0Var.f) && Intrinsics.f(this.f143613g, c0Var.f143613g) && Intrinsics.f(this.f143614h, c0Var.f143614h) && Intrinsics.f(this.i, c0Var.i) && this.f143615j == c0Var.f143615j && this.k == c0Var.k && this.f143616l == c0Var.f143616l && this.f143617m == c0Var.f143617m && this.f143618n == c0Var.f143618n;
    }

    public final int hashCode() {
        int iC = p.a.c((this.f143613g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f143612c.hashCode() + p.a.c(this.f143610a.hashCode() * 31, 31, this.f143611b)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f143614h);
        cgc.m mVar = this.i;
        int iHashCode = (iC + (mVar == null ? 0 : Integer.hashCode(mVar.f23921a))) * 31;
        m mVar2 = this.f143615j;
        return Boolean.hashCode(this.f143618n) + j6.a.c(j6.a.c(j6.a.c((iHashCode + (mVar2 != null ? mVar2.hashCode() : 0)) * 31, 31, this.k), 31, this.f143616l), 31, this.f143617m);
    }
}

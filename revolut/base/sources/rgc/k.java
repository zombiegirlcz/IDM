package rgc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f254102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f254103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f254104c;
    public final Long d;
    public final Long e;
    public final sgc.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f254105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f254106h;
    public final l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f254107j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f254108l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f254109m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f254110n;
    public final boolean o;

    public k(String id10, String perkId, String type, Long l2, Long l3, sgc.a merchant, e description, String primaryCategory, l lVar, String str, String str2, boolean z, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(perkId, "perkId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryCategory, "primaryCategory");
        this.f254102a = id10;
        this.f254103b = perkId;
        this.f254104c = type;
        this.d = l2;
        this.e = l3;
        this.f = merchant;
        this.f254105g = description;
        this.f254106h = primaryCategory;
        this.i = lVar;
        this.f254107j = str;
        this.k = str2;
        this.f254108l = z;
        this.f254109m = z3;
        this.f254110n = z4;
        this.o = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f254102a, kVar.f254102a) && Intrinsics.f(this.f254103b, kVar.f254103b) && Intrinsics.f(this.f254104c, kVar.f254104c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f254105g, kVar.f254105g) && Intrinsics.f(this.f254106h, kVar.f254106h) && Intrinsics.f(this.i, kVar.i) && Intrinsics.f(this.f254107j, kVar.f254107j) && Intrinsics.f(this.k, kVar.k) && this.f254108l == kVar.f254108l && this.f254109m == kVar.f254109m && this.f254110n == kVar.f254110n && this.o == kVar.o;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f254102a.hashCode() * 31, 31, this.f254103b), 31, this.f254104c);
        Long l2 = this.d;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        int iC2 = p.a.c((this.f254105g.hashCode() + ((this.f.hashCode() + ((iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31)) * 31)) * 31, 31, this.f254106h);
        l lVar = this.i;
        int iHashCode2 = (iC2 + (lVar == null ? 0 : Integer.hashCode(lVar.f254111a))) * 31;
        String str = this.f254107j;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        return Boolean.hashCode(this.o) + j6.a.c(j6.a.c(j6.a.c((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f254108l), 31, this.f254109m), 31, this.f254110n);
    }
}

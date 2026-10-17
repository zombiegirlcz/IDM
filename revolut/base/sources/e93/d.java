package e93;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends f {
    public final List A;
    public final dj0.d B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f123826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b93.b f123827c;
    public final String d;
    public final c93.j e;
    public final b0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f123828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f123829h;
    public final n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x f123830j;
    public final c93.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c93.j f123831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u f123832m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f123833n;
    public final l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f123834p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f123835q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f123836r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f123837s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f123838t;
    public final h93.j0 u;
    public final h93.l0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w f123839w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m f123840x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f123841y;
    public final String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b brandDesign, b93.b cardCode, String groupId, c93.j pricing, b0 cardMaterial, ArrayList features, j assets, n nVar, x xVar, c93.d dVar, c93.j jVar, u uVar, List cardLimits, l availabilityStatus, t tVar, String str, String title, String description, String str2, h93.j0 j0Var, h93.l0 l0Var, w wVar, m mVar, String str3, String str4, List deliveryCountries, dj0.d dVar2) {
        super(features, cardLimits);
        Intrinsics.checkNotNullParameter(brandDesign, "brandDesign");
        Intrinsics.checkNotNullParameter(cardCode, "cardCode");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        Intrinsics.checkNotNullParameter(cardMaterial, "cardMaterial");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(cardLimits, "cardLimits");
        Intrinsics.checkNotNullParameter(availabilityStatus, "availabilityStatus");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(deliveryCountries, "deliveryCountries");
        this.f123826b = brandDesign;
        this.f123827c = cardCode;
        this.d = groupId;
        this.e = pricing;
        this.f = cardMaterial;
        this.f123828g = features;
        this.f123829h = assets;
        this.i = nVar;
        this.f123830j = xVar;
        this.k = dVar;
        this.f123831l = jVar;
        this.f123832m = uVar;
        this.f123833n = cardLimits;
        this.o = availabilityStatus;
        this.f123834p = tVar;
        this.f123835q = str;
        this.f123836r = title;
        this.f123837s = description;
        this.f123838t = str2;
        this.u = j0Var;
        this.v = l0Var;
        this.f123839w = wVar;
        this.f123840x = mVar;
        this.f123841y = str3;
        this.z = str4;
        this.A = deliveryCountries;
        this.B = dVar2;
    }

    @Override // e93.f
    public final l a() {
        return this.o;
    }

    @Override // e93.f
    public final b b() {
        return this.f123826b;
    }

    @Override // e93.f
    public final b93.b c() {
        return this.f123827c;
    }

    @Override // e93.f
    public final m d() {
        return this.f123840x;
    }

    @Override // e93.f
    public final w e() {
        return this.f123839w;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f123826b == dVar.f123826b && this.f123827c.equals(dVar.f123827c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && this.f == dVar.f && this.f123828g.equals(dVar.f123828g) && this.f123829h.equals(dVar.f123829h) && Intrinsics.f(this.i, dVar.i) && Intrinsics.f(this.f123830j, dVar.f123830j) && Intrinsics.f(this.k, dVar.k) && Intrinsics.f(this.f123831l, dVar.f123831l) && Intrinsics.f(this.f123832m, dVar.f123832m) && Intrinsics.f(this.f123833n, dVar.f123833n) && this.o == dVar.o && this.f123834p == dVar.f123834p && Intrinsics.f(this.f123835q, dVar.f123835q) && Intrinsics.f(this.f123836r, dVar.f123836r) && Intrinsics.f(this.f123837s, dVar.f123837s) && Intrinsics.f(this.f123838t, dVar.f123838t) && this.u == dVar.u && this.v == dVar.v && Intrinsics.f(this.f123839w, dVar.f123839w) && Intrinsics.f(this.f123840x, dVar.f123840x) && Intrinsics.f(this.f123841y, dVar.f123841y) && Intrinsics.f(this.z, dVar.z) && Intrinsics.f(this.A, dVar.A) && Intrinsics.f(this.B, dVar.B);
    }

    @Override // e93.f
    public final List f() {
        return this.f123833n;
    }

    @Override // e93.f
    public final String getTitle() {
        return this.f123836r;
    }

    @Override // e93.f
    public final String h() {
        return this.z;
    }

    public final int hashCode() {
        int iHashCode = (this.f123829h.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f123828g, (this.f.hashCode() + ((this.e.hashCode() + p.a.c((this.f123827c.hashCode() + (this.f123826b.hashCode() * 31)) * 31, 31, this.d)) * 31)) * 31, 31)) * 31;
        n nVar = this.i;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        x xVar = this.f123830j;
        int iHashCode3 = (iHashCode2 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        c93.d dVar = this.k;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        c93.j jVar = this.f123831l;
        int iHashCode5 = (iHashCode4 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        u uVar = this.f123832m;
        int iHashCode6 = (this.o.hashCode() + p.a.d((iHashCode5 + (uVar == null ? 0 : uVar.hashCode())) * 31, 31, this.f123833n)) * 31;
        t tVar = this.f123834p;
        int iHashCode7 = (iHashCode6 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        String str = this.f123835q;
        int iC = p.a.c(p.a.c((iHashCode7 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f123836r), 31, this.f123837s);
        String str2 = this.f123838t;
        int iHashCode8 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        h93.j0 j0Var = this.u;
        int iHashCode9 = (iHashCode8 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        h93.l0 l0Var = this.v;
        int iHashCode10 = (iHashCode9 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        w wVar = this.f123839w;
        int iHashCode11 = (iHashCode10 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        m mVar = this.f123840x;
        int iHashCode12 = (iHashCode11 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        String str3 = this.f123841y;
        int iHashCode13 = (iHashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.z;
        int iD = p.a.d((iHashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.A);
        dj0.d dVar2 = this.B;
        return iD + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    @Override // e93.f
    public final String i() {
        return this.f123837s;
    }

    @Override // e93.f
    public final List k() {
        return this.f123828g;
    }

    @Override // e93.f
    public final String l() {
        return this.d;
    }

    @Override // e93.f
    public final String m() {
        return this.f123838t;
    }

    @Override // e93.f
    public final t n() {
        return this.f123834p;
    }

    @Override // e93.f
    public final dj0.d o() {
        return this.B;
    }

    @Override // e93.f
    public final c93.j p() {
        return this.e;
    }

    @Override // e93.f
    public final h93.j0 q() {
        return this.u;
    }

    @Override // e93.f
    public final h93.l0 r() {
        return this.v;
    }

    @Override // e93.f
    public final String s() {
        return this.f123835q;
    }

    @Override // e93.f
    public final String t() {
        return this.f123841y;
    }
}

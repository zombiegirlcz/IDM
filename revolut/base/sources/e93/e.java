package e93;

import com.revolut.feature.cards.models.design.CardDesignUnlockRequirement;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f123842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b93.b f123843c;
    public final String d;
    public final c93.j e;
    public final m0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k0 f123844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f123845h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f123846j;
    public final t k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f123847l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f123848m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f123849n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h93.j0 f123850p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h93.l0 f123851q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e0 f123852r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w f123853s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m f123854t;
    public final String u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final dj0.d f123855w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CardDesignUnlockRequirement f123856x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b brandDesign, b93.b cardCode, String groupId, c93.j pricing, m0 virtualType, k0 texturesUrls, List cardLimits, ArrayList features, l availabilityStatus, t tVar, String str, String title, String description, String str2, h93.j0 j0Var, h93.l0 l0Var, e0 e0Var, w wVar, m mVar, String str3, String str4, dj0.d dVar, CardDesignUnlockRequirement cardDesignUnlockRequirement) {
        super(features, cardLimits);
        Intrinsics.checkNotNullParameter(brandDesign, "brandDesign");
        Intrinsics.checkNotNullParameter(cardCode, "cardCode");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        Intrinsics.checkNotNullParameter(virtualType, "virtualType");
        Intrinsics.checkNotNullParameter(texturesUrls, "texturesUrls");
        Intrinsics.checkNotNullParameter(cardLimits, "cardLimits");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(availabilityStatus, "availabilityStatus");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f123842b = brandDesign;
        this.f123843c = cardCode;
        this.d = groupId;
        this.e = pricing;
        this.f = virtualType;
        this.f123844g = texturesUrls;
        this.f123845h = cardLimits;
        this.i = features;
        this.f123846j = availabilityStatus;
        this.k = tVar;
        this.f123847l = str;
        this.f123848m = title;
        this.f123849n = description;
        this.o = str2;
        this.f123850p = j0Var;
        this.f123851q = l0Var;
        this.f123852r = e0Var;
        this.f123853s = wVar;
        this.f123854t = mVar;
        this.u = str3;
        this.v = str4;
        this.f123855w = dVar;
        this.f123856x = cardDesignUnlockRequirement;
    }

    @Override // e93.f
    public final l a() {
        return this.f123846j;
    }

    @Override // e93.f
    public final b b() {
        return this.f123842b;
    }

    @Override // e93.f
    public final b93.b c() {
        return this.f123843c;
    }

    @Override // e93.f
    public final m d() {
        return this.f123854t;
    }

    @Override // e93.f
    public final w e() {
        return this.f123853s;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f123842b == eVar.f123842b && this.f123843c.equals(eVar.f123843c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && this.f == eVar.f && this.f123844g.equals(eVar.f123844g) && Intrinsics.f(this.f123845h, eVar.f123845h) && this.i.equals(eVar.i) && this.f123846j == eVar.f123846j && this.k == eVar.k && Intrinsics.f(this.f123847l, eVar.f123847l) && Intrinsics.f(this.f123848m, eVar.f123848m) && Intrinsics.f(this.f123849n, eVar.f123849n) && Intrinsics.f(this.o, eVar.o) && this.f123850p == eVar.f123850p && this.f123851q == eVar.f123851q && Intrinsics.f(this.f123852r, eVar.f123852r) && Intrinsics.f(this.f123853s, eVar.f123853s) && Intrinsics.f(this.f123854t, eVar.f123854t) && Intrinsics.f(this.u, eVar.u) && Intrinsics.f(this.v, eVar.v) && Intrinsics.f(this.f123855w, eVar.f123855w) && Intrinsics.f(this.f123856x, eVar.f123856x);
    }

    @Override // e93.f
    public final List f() {
        return this.f123845h;
    }

    @Override // e93.f
    public final String getTitle() {
        return this.f123848m;
    }

    @Override // e93.f
    public final String h() {
        return this.v;
    }

    public final int hashCode() {
        int iHashCode = (this.f123846j.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.i, p.a.d(p.a.d((this.f.hashCode() + ((this.e.hashCode() + p.a.c((this.f123843c.hashCode() + (this.f123842b.hashCode() * 31)) * 31, 31, this.d)) * 31)) * 31, 31, this.f123844g.f123879a), 31, this.f123845h), 31)) * 31;
        t tVar = this.k;
        int iHashCode2 = (iHashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        String str = this.f123847l;
        int iC = p.a.c(p.a.c((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f123848m), 31, this.f123849n);
        String str2 = this.o;
        int iHashCode3 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        h93.j0 j0Var = this.f123850p;
        int iHashCode4 = (iHashCode3 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        h93.l0 l0Var = this.f123851q;
        int iHashCode5 = (iHashCode4 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        e0 e0Var = this.f123852r;
        int iHashCode6 = (iHashCode5 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        w wVar = this.f123853s;
        int iHashCode7 = (iHashCode6 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        m mVar = this.f123854t;
        int iHashCode8 = (iHashCode7 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        String str3 = this.u;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.v;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        dj0.d dVar = this.f123855w;
        int iHashCode11 = (iHashCode10 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        CardDesignUnlockRequirement cardDesignUnlockRequirement = this.f123856x;
        return iHashCode11 + (cardDesignUnlockRequirement != null ? cardDesignUnlockRequirement.hashCode() : 0);
    }

    @Override // e93.f
    public final String i() {
        return this.f123849n;
    }

    @Override // e93.f
    public final List k() {
        return this.i;
    }

    @Override // e93.f
    public final String l() {
        return this.d;
    }

    @Override // e93.f
    public final String m() {
        return this.o;
    }

    @Override // e93.f
    public final t n() {
        return this.k;
    }

    @Override // e93.f
    public final dj0.d o() {
        return this.f123855w;
    }

    @Override // e93.f
    public final c93.j p() {
        return this.e;
    }

    @Override // e93.f
    public final h93.j0 q() {
        return this.f123850p;
    }

    @Override // e93.f
    public final h93.l0 r() {
        return this.f123851q;
    }

    @Override // e93.f
    public final String s() {
        return this.f123847l;
    }

    @Override // e93.f
    public final String t() {
        return this.u;
    }
}

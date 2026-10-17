package rgc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f254086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f254087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f254088c;
    public final e d;
    public final e e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sgc.a f254089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f254090h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f254091j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f254092l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f254093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f254094n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f254095p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f254096q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f254097r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f254098s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f254099t;
    public final String u;

    public i(String id10, String type, String primaryCategoryId, e description, e eVar, g details, sgc.a merchant, Long l2, Long l3, l lVar, List steps, List list, j jVar, String str, String str2, Integer num, boolean z, boolean z3, boolean z4, boolean z6, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(primaryCategoryId, "primaryCategoryId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f254086a = id10;
        this.f254087b = type;
        this.f254088c = primaryCategoryId;
        this.d = description;
        this.e = eVar;
        this.f = details;
        this.f254089g = merchant;
        this.f254090h = l2;
        this.i = l3;
        this.f254091j = lVar;
        this.k = steps;
        this.f254092l = list;
        this.f254093m = jVar;
        this.f254094n = str;
        this.o = str2;
        this.f254095p = num;
        this.f254096q = z;
        this.f254097r = z3;
        this.f254098s = z4;
        this.f254099t = z6;
        this.u = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f254086a, iVar.f254086a) && Intrinsics.f(this.f254087b, iVar.f254087b) && Intrinsics.f(this.f254088c, iVar.f254088c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f254089g, iVar.f254089g) && Intrinsics.f(this.f254090h, iVar.f254090h) && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f254091j, iVar.f254091j) && Intrinsics.f(this.k, iVar.k) && Intrinsics.f(this.f254092l, iVar.f254092l) && Intrinsics.f(this.f254093m, iVar.f254093m) && Intrinsics.f(this.f254094n, iVar.f254094n) && Intrinsics.f(this.o, iVar.o) && Intrinsics.f(this.f254095p, iVar.f254095p) && this.f254096q == iVar.f254096q && this.f254097r == iVar.f254097r && this.f254098s == iVar.f254098s && this.f254099t == iVar.f254099t && Intrinsics.f(this.u, iVar.u);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f254086a.hashCode() * 31, 31, this.f254087b), 31, this.f254088c)) * 31;
        e eVar = this.e;
        int iHashCode2 = (this.f254089g.hashCode() + ((this.f.hashCode() + ((iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31)) * 31)) * 31;
        Long l2 = this.f254090h;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.i;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        l lVar = this.f254091j;
        int iD = p.a.d((iHashCode4 + (lVar == null ? 0 : Integer.hashCode(lVar.f254111a))) * 31, 31, this.k);
        List list = this.f254092l;
        int iHashCode5 = (iD + (list == null ? 0 : list.hashCode())) * 31;
        j jVar = this.f254093m;
        int iHashCode6 = (iHashCode5 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        String str = this.f254094n;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.o;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f254095p;
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c((iHashCode8 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f254096q), 31, this.f254097r), 31, this.f254098s), 31, this.f254099t);
        String str3 = this.u;
        return iC + (str3 != null ? str3.hashCode() : 0);
    }
}

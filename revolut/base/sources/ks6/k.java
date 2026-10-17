package ks6;

import ip0.v7;
import java.time.LocalDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    @NotNull
    public static final b Companion = new b();
    public final jo3.b A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f189187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f189188c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f189189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f189190h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f189191j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f189192l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f189193m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h f189194n;
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f189195p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f189196q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f189197r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jo3.b f189198s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final jo3.b f189199t;
    public final jo3.b u;
    public final jo3.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final jo3.b f189200w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final jo3.b f189201x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final jo3.b f189202y;
    public final jo3.b z;

    public k(String id10, LocalDateTime createdAt, LocalDateTime updatedAt, String str, String str2, String str3, String str4, String str5, String readableIdentifier, String str6, List list, List list2, i iVar, h hVar, j jVar, f fVar, e eVar, g gVar, jo3.b amount, jo3.b bVar, jo3.b bVar2, jo3.b bVar3, jo3.b bVar4, jo3.b bVar5, jo3.b bVar6, jo3.b bVar7, jo3.b bVar8) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(readableIdentifier, "readableIdentifier");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f189186a = id10;
        this.f189187b = createdAt;
        this.f189188c = updatedAt;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.f189189g = str4;
        this.f189190h = str5;
        this.i = readableIdentifier;
        this.f189191j = str6;
        this.k = list;
        this.f189192l = list2;
        this.f189193m = iVar;
        this.f189194n = hVar;
        this.o = jVar;
        this.f189195p = fVar;
        this.f189196q = eVar;
        this.f189197r = gVar;
        this.f189198s = amount;
        this.f189199t = bVar;
        this.u = bVar2;
        this.v = bVar3;
        this.f189200w = bVar4;
        this.f189201x = bVar5;
        this.f189202y = bVar6;
        this.z = bVar7;
        this.A = bVar8;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f189186a, kVar.f189186a) && Intrinsics.f(this.f189187b, kVar.f189187b) && Intrinsics.f(this.f189188c, kVar.f189188c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f189189g, kVar.f189189g) && Intrinsics.f(this.f189190h, kVar.f189190h) && Intrinsics.f(this.i, kVar.i) && Intrinsics.f(this.f189191j, kVar.f189191j) && Intrinsics.f(this.k, kVar.k) && Intrinsics.f(this.f189192l, kVar.f189192l) && Intrinsics.f(this.f189193m, kVar.f189193m) && Intrinsics.f(this.f189194n, kVar.f189194n) && Intrinsics.f(this.o, kVar.o) && Intrinsics.f(this.f189195p, kVar.f189195p) && Intrinsics.f(this.f189196q, kVar.f189196q) && Intrinsics.f(this.f189197r, kVar.f189197r) && Intrinsics.f(this.f189198s, kVar.f189198s) && Intrinsics.f(this.f189199t, kVar.f189199t) && Intrinsics.f(this.u, kVar.u) && Intrinsics.f(this.v, kVar.v) && Intrinsics.f(this.f189200w, kVar.f189200w) && Intrinsics.f(this.f189201x, kVar.f189201x) && Intrinsics.f(this.f189202y, kVar.f189202y) && Intrinsics.f(this.z, kVar.z) && Intrinsics.f(this.A, kVar.A);
    }

    public final int hashCode() {
        int i = v7.i(this.f189188c, v7.i(this.f189187b, this.f189186a.hashCode() * 31, 31), 31);
        String str = this.d;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f189189g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f189190h;
        int iC = p.a.c((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.i);
        String str6 = this.f189191j;
        int iHashCode5 = (iC + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list = this.k;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f189192l;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        i iVar = this.f189193m;
        int iHashCode8 = (iHashCode7 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        h hVar = this.f189194n;
        int iHashCode9 = (iHashCode8 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        j jVar = this.o;
        int iHashCode10 = (iHashCode9 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        f fVar = this.f189195p;
        int iHashCode11 = (iHashCode10 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        e eVar = this.f189196q;
        int iHashCode12 = (iHashCode11 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        g gVar = this.f189197r;
        int iE = wp5.y.e(this.f189198s, (iHashCode12 + (gVar == null ? 0 : gVar.hashCode())) * 31, 31);
        jo3.b bVar = this.f189199t;
        int iHashCode13 = (iE + (bVar == null ? 0 : bVar.hashCode())) * 31;
        jo3.b bVar2 = this.u;
        int iHashCode14 = (iHashCode13 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        jo3.b bVar3 = this.v;
        int iHashCode15 = (iHashCode14 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        jo3.b bVar4 = this.f189200w;
        int iHashCode16 = (iHashCode15 + (bVar4 == null ? 0 : bVar4.hashCode())) * 31;
        jo3.b bVar5 = this.f189201x;
        int iHashCode17 = (iHashCode16 + (bVar5 == null ? 0 : bVar5.hashCode())) * 31;
        jo3.b bVar6 = this.f189202y;
        int iHashCode18 = (iHashCode17 + (bVar6 == null ? 0 : bVar6.hashCode())) * 31;
        jo3.b bVar7 = this.z;
        int iHashCode19 = (iHashCode18 + (bVar7 == null ? 0 : bVar7.hashCode())) * 31;
        jo3.b bVar8 = this.A;
        return iHashCode19 + (bVar8 != null ? bVar8.hashCode() : 0);
    }
}

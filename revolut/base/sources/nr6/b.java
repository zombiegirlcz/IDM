package nr6;

import ip0.v7;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();
    public final dj0.d A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f218538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f218539c;
    public final c0 d;
    public final e e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f218540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f218541h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f218542j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f218543l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y f218544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u f218545n;
    public final e0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f218546p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f218547q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f218548r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final dj0.d f218549s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final dj0.d f218550t;
    public final dj0.d u;
    public final dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final dj0.d f218551w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final dj0.d f218552x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final dj0.d f218553y;
    public final dj0.d z;

    public b(String id10, LocalDateTime createdAt, LocalDateTime updatedAt, c0 c0Var, e eVar, c cVar, String str, String str2, String readableIdentifier, String str3, ArrayList arrayList, ArrayList arrayList2, y yVar, u uVar, e0 e0Var, o oVar, m mVar, q qVar, dj0.d amount, dj0.d dVar, dj0.d dVar2, dj0.d dVar3, dj0.d dVar4, dj0.d dVar5, dj0.d dVar6, dj0.d dVar7, dj0.d dVar8) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(readableIdentifier, "readableIdentifier");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f218537a = id10;
        this.f218538b = createdAt;
        this.f218539c = updatedAt;
        this.d = c0Var;
        this.e = eVar;
        this.f = cVar;
        this.f218540g = str;
        this.f218541h = str2;
        this.i = readableIdentifier;
        this.f218542j = str3;
        this.k = arrayList;
        this.f218543l = arrayList2;
        this.f218544m = yVar;
        this.f218545n = uVar;
        this.o = e0Var;
        this.f218546p = oVar;
        this.f218547q = mVar;
        this.f218548r = qVar;
        this.f218549s = amount;
        this.f218550t = dVar;
        this.u = dVar2;
        this.v = dVar3;
        this.f218551w = dVar4;
        this.f218552x = dVar5;
        this.f218553y = dVar6;
        this.z = dVar7;
        this.A = dVar8;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f218537a, bVar.f218537a) && Intrinsics.f(this.f218538b, bVar.f218538b) && Intrinsics.f(this.f218539c, bVar.f218539c) && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && Intrinsics.f(this.f218540g, bVar.f218540g) && Intrinsics.f(this.f218541h, bVar.f218541h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f218542j, bVar.f218542j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f218543l, bVar.f218543l) && Intrinsics.f(this.f218544m, bVar.f218544m) && Intrinsics.f(this.f218545n, bVar.f218545n) && Intrinsics.f(this.o, bVar.o) && Intrinsics.f(this.f218546p, bVar.f218546p) && Intrinsics.f(this.f218547q, bVar.f218547q) && Intrinsics.f(this.f218548r, bVar.f218548r) && Intrinsics.f(this.f218549s, bVar.f218549s) && Intrinsics.f(this.f218550t, bVar.f218550t) && Intrinsics.f(this.u, bVar.u) && Intrinsics.f(this.v, bVar.v) && Intrinsics.f(this.f218551w, bVar.f218551w) && Intrinsics.f(this.f218552x, bVar.f218552x) && Intrinsics.f(this.f218553y, bVar.f218553y) && Intrinsics.f(this.z, bVar.z) && Intrinsics.f(this.A, bVar.A);
    }

    public final int hashCode() {
        int i = v7.i(this.f218539c, v7.i(this.f218538b, this.f218537a.hashCode() * 31, 31), 31);
        c0 c0Var = this.d;
        int iHashCode = (i + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        e eVar = this.e;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        c cVar = this.f;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str = this.f218540g;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f218541h;
        int iC = p.a.c((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i);
        String str3 = this.f218542j;
        int iHashCode5 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.k;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f218543l;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        y yVar = this.f218544m;
        int iHashCode8 = (iHashCode7 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        u uVar = this.f218545n;
        int iHashCode9 = (iHashCode8 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        e0 e0Var = this.o;
        int iHashCode10 = (iHashCode9 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        o oVar = this.f218546p;
        int iHashCode11 = (iHashCode10 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        m mVar = this.f218547q;
        int iHashCode12 = (iHashCode11 + (mVar == null ? 0 : mVar.f218575a.hashCode())) * 31;
        q qVar = this.f218548r;
        int iC2 = v7.c((iHashCode12 + (qVar == null ? 0 : qVar.hashCode())) * 31, 31, this.f218549s);
        dj0.d dVar = this.f218550t;
        int iHashCode13 = (iC2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.u;
        int iHashCode14 = (iHashCode13 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.v;
        int iHashCode15 = (iHashCode14 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        dj0.d dVar4 = this.f218551w;
        int iHashCode16 = (iHashCode15 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
        dj0.d dVar5 = this.f218552x;
        int iHashCode17 = (iHashCode16 + (dVar5 == null ? 0 : dVar5.hashCode())) * 31;
        dj0.d dVar6 = this.f218553y;
        int iHashCode18 = (iHashCode17 + (dVar6 == null ? 0 : dVar6.hashCode())) * 31;
        dj0.d dVar7 = this.z;
        int iHashCode19 = (iHashCode18 + (dVar7 == null ? 0 : dVar7.hashCode())) * 31;
        dj0.d dVar8 = this.A;
        return iHashCode19 + (dVar8 != null ? dVar8.hashCode() : 0);
    }
}

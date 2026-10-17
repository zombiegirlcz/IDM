package ht3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f155270c;
    public final String d;
    public final g0 e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f155271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f155272h;
    public final k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f155273j;
    public final c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f155274l;

    public g(String title, String str, i iVar, String str2, g0 g0Var, String str3, ArrayList arrayList, ArrayList arrayList2, k kVar, c cVar, c cVar2, ArrayList arrayList3, int i) {
        iVar = (i & 4) != 0 ? null : iVar;
        arrayList3 = (i & 4096) != 0 ? null : arrayList3;
        Intrinsics.checkNotNullParameter(title, "title");
        this.f155268a = title;
        this.f155269b = str;
        this.f155270c = iVar;
        this.d = str2;
        this.e = g0Var;
        this.f = str3;
        this.f155271g = arrayList;
        this.f155272h = arrayList2;
        this.i = kVar;
        this.f155273j = cVar;
        this.k = cVar2;
        this.f155274l = arrayList3;
    }

    @Override // ht3.l0
    public final c T() {
        return this.k;
    }

    @Override // ht3.l0
    public final c W() {
        return this.f155273j;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f155268a, gVar.f155268a) && Intrinsics.f(this.f155269b, gVar.f155269b) && Intrinsics.f(this.f155270c, gVar.f155270c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f155271g, gVar.f155271g) && Intrinsics.f(this.f155272h, gVar.f155272h) && Intrinsics.f(this.i, gVar.i) && Intrinsics.f(this.f155273j, gVar.f155273j) && Intrinsics.f(this.k, gVar.k) && Intrinsics.f(this.f155274l, gVar.f155274l);
    }

    public final int hashCode() {
        int iHashCode = this.f155268a.hashCode() * 31;
        String str = this.f155269b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        i iVar = this.f155270c;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        g0 g0Var = this.e;
        int iHashCode5 = (iHashCode4 + (g0Var == null ? 0 : g0Var.f155275a.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f155271g;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f155272h;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        k kVar = this.i;
        int iHashCode9 = (iHashCode8 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        c cVar = this.f155273j;
        int iHashCode10 = (iHashCode9 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.k;
        int iC = j6.a.c((iHashCode10 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31, 31, false);
        List list3 = this.f155274l;
        return iC + (list3 != null ? list3.hashCode() : 0);
    }
}

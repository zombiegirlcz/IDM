package jvc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wtc.o0;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f178824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f178825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qtc.t f178826c;
    public final List d;
    public final boolean e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f178827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f178828h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o0 f178829j;
    public final Boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f178830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f178831m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f178832n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l71.d f178833p;

    public i(boolean z, boolean z3, qtc.t wealthProtectionState, List cards, boolean z4, List list, List list2, List list3, boolean z6, o0 globalAccountsState, Boolean bool, boolean z11, boolean z12, boolean z29, boolean z31, l71.d dVar) {
        Intrinsics.checkNotNullParameter(wealthProtectionState, "wealthProtectionState");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(globalAccountsState, "globalAccountsState");
        this.f178824a = z;
        this.f178825b = z3;
        this.f178826c = wealthProtectionState;
        this.d = cards;
        this.e = z4;
        this.f = list;
        this.f178827g = list2;
        this.f178828h = list3;
        this.i = z6;
        this.f178829j = globalAccountsState;
        this.k = bool;
        this.f178830l = z11;
        this.f178831m = z12;
        this.f178832n = z29;
        this.o = z31;
        this.f178833p = dVar;
    }

    public static i a(i iVar, boolean z, qtc.t tVar, List list, List list2, List list3, List list4, boolean z3, o0 o0Var, Boolean bool, boolean z4, l71.d dVar, int i) {
        boolean z6 = (i & 1) != 0 ? iVar.f178824a : true;
        boolean z11 = (i & 2) != 0 ? iVar.f178825b : z;
        qtc.t wealthProtectionState = (i & 4) != 0 ? iVar.f178826c : tVar;
        List cards = (i & 8) != 0 ? iVar.d : list;
        boolean z12 = (i & 16) != 0 ? iVar.e : true;
        List list5 = (i & 32) != 0 ? iVar.f : list2;
        List list6 = (i & 64) != 0 ? iVar.f178827g : list3;
        List list7 = (i & 128) != 0 ? iVar.f178828h : list4;
        boolean z29 = (i & 256) != 0 ? iVar.i : z3;
        o0 globalAccountsState = (i & 512) != 0 ? iVar.f178829j : o0Var;
        Boolean bool2 = (i & 1024) != 0 ? iVar.k : bool;
        boolean z31 = (i & 2048) != 0 ? iVar.f178830l : z4;
        boolean z41 = iVar.f178831m;
        boolean z49 = iVar.f178832n;
        boolean z54 = iVar.o;
        l71.d dVar2 = (i & 32768) != 0 ? iVar.f178833p : dVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(wealthProtectionState, "wealthProtectionState");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(globalAccountsState, "globalAccountsState");
        return new i(z6, z11, wealthProtectionState, cards, z12, list5, list6, list7, z29, globalAccountsState, bool2, z31, z41, z49, z54, dVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f178824a == iVar.f178824a && this.f178825b == iVar.f178825b && Intrinsics.f(this.f178826c, iVar.f178826c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f178827g, iVar.f178827g) && Intrinsics.f(this.f178828h, iVar.f178828h) && this.i == iVar.i && Intrinsics.f(this.f178829j, iVar.f178829j) && Intrinsics.f(this.k, iVar.k) && this.f178830l == iVar.f178830l && this.f178831m == iVar.f178831m && this.f178832n == iVar.f178832n && this.o == iVar.o && Intrinsics.f(this.f178833p, iVar.f178833p);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.d((this.f178826c.hashCode() + j6.a.c(Boolean.hashCode(this.f178824a) * 31, 31, this.f178825b)) * 31, 31, this.d), 31, this.e);
        List list = this.f;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f178827g;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f178828h;
        int iHashCode3 = (this.f178829j.hashCode() + j6.a.c((iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.i)) * 31;
        Boolean bool = this.k;
        int iC2 = j6.a.c(j6.a.c(j6.a.c(j6.a.c((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f178830l), 31, this.f178831m), 31, this.f178832n), 31, this.o);
        l71.d dVar = this.f178833p;
        return iC2 + (dVar != null ? dVar.hashCode() : 0);
    }
}

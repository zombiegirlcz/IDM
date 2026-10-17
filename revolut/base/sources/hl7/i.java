package hl7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();
    public static final Lazy[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f153136c;
    public final a5 d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f153137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f153138h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f153139j;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        k = new Lazy[]{null, null, null, null, yhm.j.c(kVar, new hf7.d(18)), yhm.j.c(kVar, new hf7.d(19)), yhm.j.c(kVar, new hf7.d(20)), yhm.j.c(kVar, new hf7.d(21)), yhm.j.c(kVar, new hf7.d(22)), null};
    }

    public /* synthetic */ i(int i, String str, String str2, m0 m0Var, a5 a5Var, List list, List list2, List list3, List list4, List list5, Boolean bool) {
        if (1023 != (i & 1023)) {
            qlm.j1.f(g.f153109a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f153134a = str;
        this.f153135b = str2;
        this.f153136c = m0Var;
        this.d = a5Var;
        this.e = list;
        this.f = list2;
        this.f153137g = list3;
        this.f153138h = list4;
        this.i = list5;
        this.f153139j = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f153134a, iVar.f153134a) && Intrinsics.f(this.f153135b, iVar.f153135b) && Intrinsics.f(this.f153136c, iVar.f153136c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f153137g, iVar.f153137g) && Intrinsics.f(this.f153138h, iVar.f153138h) && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f153139j, iVar.f153139j);
    }

    public final int hashCode() {
        int iHashCode = this.f153134a.hashCode() * 31;
        String str = this.f153135b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        m0 m0Var = this.f153136c;
        int iHashCode3 = (iHashCode2 + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        a5 a5Var = this.d;
        int iHashCode4 = (iHashCode3 + (a5Var == null ? 0 : a5Var.f153020a.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f153137g;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f153138h;
        int iHashCode8 = (iHashCode7 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.i;
        int iHashCode9 = (iHashCode8 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Boolean bool = this.f153139j;
        return iHashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    public i(String id10, String str, m0 m0Var, a5 a5Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, Boolean bool) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f153134a = id10;
        this.f153135b = str;
        this.f153136c = m0Var;
        this.d = a5Var;
        this.e = arrayList;
        this.f = arrayList2;
        this.f153137g = arrayList3;
        this.f153138h = arrayList4;
        this.i = arrayList5;
        this.f153139j = bool;
    }
}

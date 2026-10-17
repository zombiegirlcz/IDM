package xda;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Lazy[] f304336n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f304339c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f304340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f304341h;
    public final g1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f304342j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l0 f304343l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f304344m;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f304336n = new Lazy[]{null, null, null, null, null, null, null, null, null, null, yhm.j.c(kVar, new x5a.d(25)), null, yhm.j.c(kVar, new x5a.d(26))};
    }

    public /* synthetic */ l(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, o oVar, g1 g1Var, i iVar, List list, l0 l0Var, List list2) {
        if (4095 != (i & 4095)) {
            j1.f(j.f304334a.getDescriptor(), i, 4095);
            throw null;
        }
        this.f304337a = str;
        this.f304338b = str2;
        this.f304339c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f304340g = str7;
        this.f304341h = oVar;
        this.i = g1Var;
        this.f304342j = iVar;
        this.k = list;
        this.f304343l = l0Var;
        if ((i & 4096) == 0) {
            this.f304344m = null;
        } else {
            this.f304344m = list2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f304337a, lVar.f304337a) && Intrinsics.f(this.f304338b, lVar.f304338b) && Intrinsics.f(this.f304339c, lVar.f304339c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f304340g, lVar.f304340g) && Intrinsics.f(this.f304341h, lVar.f304341h) && Intrinsics.f(this.i, lVar.i) && Intrinsics.f(this.f304342j, lVar.f304342j) && Intrinsics.f(this.k, lVar.k) && Intrinsics.f(this.f304343l, lVar.f304343l) && Intrinsics.f(this.f304344m, lVar.f304344m);
    }

    public final int hashCode() {
        String str = this.f304337a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f304338b;
        int iC = p.a.c(p.a.c(p.a.c(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f304339c), 31, this.d), 31, this.e), 31, this.f);
        String str3 = this.f304340g;
        int iHashCode2 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        o oVar = this.f304341h;
        int iHashCode3 = (iHashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        g1 g1Var = this.i;
        int iHashCode4 = (iHashCode3 + (g1Var == null ? 0 : g1Var.hashCode())) * 31;
        i iVar = this.f304342j;
        int iHashCode5 = (iHashCode4 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        List list = this.k;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        l0 l0Var = this.f304343l;
        int iHashCode7 = (iHashCode6 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        List list2 = this.f304344m;
        return iHashCode7 + (list2 != null ? list2.hashCode() : 0);
    }
}

package ht3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f155285c;
    public final List d;
    public final k e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f155286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f155287h;

    public j0(String title, String str, i0 i0Var, ArrayList arrayList, k kVar, c cVar, c cVar2, ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f155283a = title;
        this.f155284b = str;
        this.f155285c = i0Var;
        this.d = arrayList;
        this.e = kVar;
        this.f = cVar;
        this.f155286g = cVar2;
        this.f155287h = arrayList2;
    }

    @Override // ht3.l0
    public final c T() {
        return this.f155286g;
    }

    @Override // ht3.l0
    public final c W() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f155283a, j0Var.f155283a) && Intrinsics.f(this.f155284b, j0Var.f155284b) && Intrinsics.f(this.f155285c, j0Var.f155285c) && Intrinsics.f(this.d, j0Var.d) && Intrinsics.f(this.e, j0Var.e) && Intrinsics.f(this.f, j0Var.f) && Intrinsics.f(this.f155286g, j0Var.f155286g) && Intrinsics.f(this.f155287h, j0Var.f155287h);
    }

    public final int hashCode() {
        int iHashCode = this.f155283a.hashCode() * 31;
        String str = this.f155284b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        i0 i0Var = this.f155285c;
        int iHashCode3 = (iHashCode2 + (i0Var == null ? 0 : i0Var.f155282a.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        k kVar = this.e;
        int iHashCode5 = (iHashCode4 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        c cVar = this.f;
        int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.f155286g;
        int iC = j6.a.c((iHashCode6 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31, 31, false);
        ArrayList arrayList = this.f155287h;
        return iC + (arrayList != null ? arrayList.hashCode() : 0);
    }
}

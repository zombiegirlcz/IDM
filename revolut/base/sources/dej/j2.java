package dej;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2 f113571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l2 f113572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f113573c;
    public final List d;
    public final l2 e;
    public final l2 f;

    public j2(l2 l2Var, l2 l2Var2, ArrayList arrayList, ArrayList arrayList2, l2 l2Var3, l2 l2Var4) {
        this.f113571a = l2Var;
        this.f113572b = l2Var2;
        this.f113573c = arrayList;
        this.d = arrayList2;
        this.e = l2Var3;
        this.f = l2Var4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj2;
        return Intrinsics.f(this.f113571a, j2Var.f113571a) && Intrinsics.f(this.f113572b, j2Var.f113572b) && Intrinsics.f(this.f113573c, j2Var.f113573c) && Intrinsics.f(this.d, j2Var.d) && Intrinsics.f(this.e, j2Var.e) && Intrinsics.f(this.f, j2Var.f);
    }

    public final int hashCode() {
        l2 l2Var = this.f113571a;
        int iHashCode = (l2Var == null ? 0 : l2Var.hashCode()) * 31;
        l2 l2Var2 = this.f113572b;
        int iHashCode2 = (iHashCode + (l2Var2 == null ? 0 : l2Var2.hashCode())) * 31;
        List list = this.f113573c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        l2 l2Var3 = this.e;
        int iHashCode5 = (iHashCode4 + (l2Var3 == null ? 0 : l2Var3.hashCode())) * 31;
        l2 l2Var4 = this.f;
        return iHashCode5 + (l2Var4 != null ? l2Var4.hashCode() : 0);
    }
}

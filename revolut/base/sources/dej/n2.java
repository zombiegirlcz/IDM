package dej;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f113599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f113600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f113601c;
    public final Long d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f113602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f113603h;

    public n2(Long l2, Long l3, Long l4, Long l5, ArrayList arrayList, ArrayList arrayList2, Boolean bool, Boolean bool2) {
        this.f113599a = l2;
        this.f113600b = l3;
        this.f113601c = l4;
        this.d = l5;
        this.e = arrayList;
        this.f = arrayList2;
        this.f113602g = bool;
        this.f113603h = bool2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj2;
        return Intrinsics.f(this.f113599a, n2Var.f113599a) && Intrinsics.f(this.f113600b, n2Var.f113600b) && Intrinsics.f(this.f113601c, n2Var.f113601c) && Intrinsics.f(this.d, n2Var.d) && Intrinsics.f(this.e, n2Var.e) && Intrinsics.f(this.f, n2Var.f) && Intrinsics.f(this.f113602g, n2Var.f113602g) && Intrinsics.f(this.f113603h, n2Var.f113603h);
    }

    public final int hashCode() {
        Long l2 = this.f113599a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.f113600b;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f113601c;
        int iHashCode3 = (iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.d;
        int iHashCode4 = (iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.f113602g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f113603h;
        return iHashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }
}

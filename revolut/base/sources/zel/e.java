package zel;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f321798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f321799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f321800c;
    public final List d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f321801g;

    public e(ArrayList arrayList, ArrayList arrayList2, List list, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.f321798a = arrayList;
        this.f321799b = arrayList2;
        this.f321800c = list;
        this.d = arrayList3;
        this.e = arrayList4;
        this.f = arrayList5;
        this.f321801g = arrayList6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f321798a, eVar.f321798a) && Intrinsics.f(this.f321799b, eVar.f321799b) && Intrinsics.f(this.f321800c, eVar.f321800c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f321801g, eVar.f321801g);
    }

    public final int hashCode() {
        List list = this.f321798a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f321799b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f321800c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.d;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.e;
        int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.f;
        int iHashCode6 = (iHashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List list7 = this.f321801g;
        return iHashCode6 + (list7 != null ? list7.hashCode() : 0);
    }
}

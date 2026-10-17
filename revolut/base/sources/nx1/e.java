package nx1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f220056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f220057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f220058c;
    public final List d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final iy1.g f220059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f220060h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f220061j;

    public e(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, iy1.g gVar, ArrayList arrayList7, ArrayList arrayList8, ArrayList arrayList9) {
        this.f220056a = arrayList;
        this.f220057b = arrayList2;
        this.f220058c = arrayList3;
        this.d = arrayList4;
        this.e = arrayList5;
        this.f = arrayList6;
        this.f220059g = gVar;
        this.f220060h = arrayList7;
        this.i = arrayList8;
        this.f220061j = arrayList9;
    }

    public final List a() {
        return this.f220056a;
    }

    public final List b() {
        return this.f220057b;
    }

    public final List c() {
        return this.f220058c;
    }

    public final List d() {
        return this.d;
    }

    public final List e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f220056a, eVar.f220056a) && Intrinsics.f(this.f220057b, eVar.f220057b) && Intrinsics.f(this.f220058c, eVar.f220058c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f220059g, eVar.f220059g) && Intrinsics.f(this.f220060h, eVar.f220060h) && Intrinsics.f(this.i, eVar.i) && Intrinsics.f(this.f220061j, eVar.f220061j);
    }

    public final List f() {
        return this.f;
    }

    public final iy1.g g() {
        return this.f220059g;
    }

    public final List h() {
        return this.f220060h;
    }

    public final int hashCode() {
        List list = this.f220056a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f220057b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f220058c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.d;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.e;
        int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.f;
        int iHashCode6 = (iHashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        iy1.g gVar = this.f220059g;
        int iHashCode7 = (iHashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        List list7 = this.f220060h;
        int iHashCode8 = (iHashCode7 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List list8 = this.i;
        int iHashCode9 = (iHashCode8 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List list9 = this.f220061j;
        return iHashCode9 + (list9 != null ? list9.hashCode() : 0);
    }

    public final List i() {
        return this.i;
    }

    public final List j() {
        return this.f220061j;
    }
}

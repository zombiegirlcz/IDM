package o7h;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f222834c;
    public final List d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f222835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f222836h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f222837j;
    public final List k;

    public q(String str, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, String str4, ArrayList arrayList3, Integer num, Integer num2, ArrayList arrayList4, ArrayList arrayList5) {
        zzg.j collectionKey = zzg.j.f326741a;
        Intrinsics.checkNotNullParameter(collectionKey, "collectionKey");
        this.f222832a = str;
        this.f222833b = str2;
        this.f222834c = arrayList;
        this.d = arrayList2;
        this.e = str3;
        this.f = str4;
        this.f222835g = arrayList3;
        this.f222836h = num;
        this.i = num2;
        this.f222837j = arrayList4;
        this.k = arrayList5;
    }

    @Override // o7h.x
    public final zzg.q M0() {
        return zzg.j.f326741a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        Object obj3 = zzg.j.f326741a;
        return obj3.equals(obj3) && this.f222832a.equals(qVar.f222832a) && Intrinsics.f(this.f222833b, qVar.f222833b) && Intrinsics.f(this.f222834c, qVar.f222834c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f222835g, qVar.f222835g) && Intrinsics.f(this.f222836h, qVar.f222836h) && Intrinsics.f(this.i, qVar.i) && Intrinsics.f(this.f222837j, qVar.f222837j) && Intrinsics.f(this.k, qVar.k);
    }

    @Override // o7h.x
    public final String getCacheKey() {
        Object[] elements = {zzg.j.f326741a, this.f222832a, this.f222833b, this.f222834c, this.d, this.e, this.f, this.f222835g, this.f222836h, this.i, this.f222837j, this.k};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0.k0(kotlin.collections.d.L(elements), "_", null, null, 0, null, 62);
    }

    public final int hashCode() {
        int iC = p.a.c(zzg.j.f326741a.hashCode() * 31, 31, this.f222832a);
        String str = this.f222833b;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f222834c;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list3 = this.f222835g;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.f222836h;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.i;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list4 = this.f222837j;
        int iHashCode9 = (iHashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.k;
        return iHashCode9 + (list5 != null ? list5.hashCode() : 0);
    }
}

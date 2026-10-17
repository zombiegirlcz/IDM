package imh;

import com.revolut.data.model.Data;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vmh.g f162457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f162458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lmh.e f162459c;
    public final mmh.c d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f162460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f162461h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f162462j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f162463l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f162464m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Data f162465n;
    public final Data o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Data f162466p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f162467q;

    public d(vmh.g filterState, Map widgetStates, lmh.e eVar, mmh.c cVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, Data data7, Data data8, Data data9, Data data10, Data data11, Data data12, List list) {
        Intrinsics.checkNotNullParameter(filterState, "filterState");
        Intrinsics.checkNotNullParameter(widgetStates, "widgetStates");
        this.f162457a = filterState;
        this.f162458b = widgetStates;
        this.f162459c = eVar;
        this.d = cVar;
        this.e = data;
        this.f = data2;
        this.f162460g = data3;
        this.f162461h = data4;
        this.i = data5;
        this.f162462j = data6;
        this.k = data7;
        this.f162463l = data8;
        this.f162464m = data9;
        this.f162465n = data10;
        this.o = data11;
        this.f162466p = data12;
        this.f162467q = list;
    }

    public static d a(d dVar, vmh.g gVar, Map map, lmh.e eVar, mmh.c cVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, Data data7, Data data8, Data data9, Data data10, Data data11, Data data12, List list, int i) {
        vmh.g filterState = (i & 1) != 0 ? dVar.f162457a : gVar;
        Map widgetStates = (i & 2) != 0 ? dVar.f162458b : map;
        lmh.e eVar2 = (i & 4) != 0 ? dVar.f162459c : eVar;
        mmh.c cVar2 = (i & 8) != 0 ? dVar.d : cVar;
        Data data13 = (i & 16) != 0 ? dVar.e : data;
        Data data14 = (i & 32) != 0 ? dVar.f : data2;
        Data data15 = (i & 64) != 0 ? dVar.f162460g : data3;
        Data data16 = (i & 128) != 0 ? dVar.f162461h : data4;
        Data data17 = (i & 256) != 0 ? dVar.i : data5;
        Data data18 = (i & 512) != 0 ? dVar.f162462j : data6;
        Data data19 = (i & 1024) != 0 ? dVar.k : data7;
        Data data20 = (i & 2048) != 0 ? dVar.f162463l : data8;
        Data data21 = (i & 4096) != 0 ? dVar.f162464m : data9;
        Data data22 = (i & 8192) != 0 ? dVar.f162465n : data10;
        lmh.e eVar3 = eVar2;
        Data data23 = (i & 16384) != 0 ? dVar.o : data11;
        Data data24 = (i & 32768) != 0 ? dVar.f162466p : data12;
        List list2 = (i & 65536) != 0 ? dVar.f162467q : list;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(filterState, "filterState");
        Intrinsics.checkNotNullParameter(widgetStates, "widgetStates");
        return new d(filterState, widgetStates, eVar3, cVar2, data13, data14, data15, data16, data17, data18, data19, data20, data21, data22, data23, data24, list2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f162457a, dVar.f162457a) && Intrinsics.f(this.f162458b, dVar.f162458b) && Intrinsics.f(this.f162459c, dVar.f162459c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f162460g, dVar.f162460g) && Intrinsics.f(this.f162461h, dVar.f162461h) && Intrinsics.f(this.i, dVar.i) && Intrinsics.f(this.f162462j, dVar.f162462j) && Intrinsics.f(this.k, dVar.k) && Intrinsics.f(this.f162463l, dVar.f162463l) && Intrinsics.f(this.f162464m, dVar.f162464m) && Intrinsics.f(this.f162465n, dVar.f162465n) && Intrinsics.f(this.o, dVar.o) && Intrinsics.f(this.f162466p, dVar.f162466p) && Intrinsics.f(this.f162467q, dVar.f162467q);
    }

    public final int hashCode() {
        int iE = p.a.e(this.f162457a.hashCode() * 31, 31, this.f162458b);
        lmh.e eVar = this.f162459c;
        int iHashCode = (iE + (eVar == null ? 0 : eVar.hashCode())) * 31;
        mmh.c cVar = this.d;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Data data = this.e;
        int iHashCode3 = (iHashCode2 + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f;
        int iHashCode4 = (iHashCode3 + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f162460g;
        int iHashCode5 = (iHashCode4 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.f162461h;
        int iHashCode6 = (iHashCode5 + (data4 == null ? 0 : data4.hashCode())) * 31;
        Data data5 = this.i;
        int iHashCode7 = (iHashCode6 + (data5 == null ? 0 : data5.hashCode())) * 31;
        Data data6 = this.f162462j;
        int iHashCode8 = (iHashCode7 + (data6 == null ? 0 : data6.hashCode())) * 31;
        Data data7 = this.k;
        int iHashCode9 = (iHashCode8 + (data7 == null ? 0 : data7.hashCode())) * 31;
        Data data8 = this.f162463l;
        int iHashCode10 = (iHashCode9 + (data8 == null ? 0 : data8.hashCode())) * 31;
        Data data9 = this.f162464m;
        int iHashCode11 = (iHashCode10 + (data9 == null ? 0 : data9.hashCode())) * 31;
        Data data10 = this.f162465n;
        int iHashCode12 = (iHashCode11 + (data10 == null ? 0 : data10.hashCode())) * 31;
        Data data11 = this.o;
        int iHashCode13 = (iHashCode12 + (data11 == null ? 0 : data11.hashCode())) * 31;
        Data data12 = this.f162466p;
        int iHashCode14 = (iHashCode13 + (data12 == null ? 0 : data12.hashCode())) * 31;
        List list = this.f162467q;
        return iHashCode14 + (list != null ? list.hashCode() : 0);
    }
}

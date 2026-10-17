package zjh;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements cli.j, fsl.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f322844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f322845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f322846c;
    public final Data d;
    public final d1h.g e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f322847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f322848h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f322849j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f322850l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f322851m;

    public q() {
        this(0);
    }

    public static q c(q qVar, Data data, Data data2, Data data3, Data data4, d1h.g gVar, List list, List list2, Data data5, Data data6, Data data7, Data data8, Data data9, Data data10, int i) {
        if ((i & 1) != 0) {
            data = qVar.f322844a;
        }
        Data data11 = data;
        Data data12 = (i & 2) != 0 ? qVar.f322845b : data2;
        Data data13 = (i & 4) != 0 ? qVar.f322846c : data3;
        Data data14 = (i & 8) != 0 ? qVar.d : data4;
        d1h.g gVar2 = (i & 16) != 0 ? qVar.e : gVar;
        List list3 = (i & 32) != 0 ? qVar.f : list;
        List list4 = (i & 64) != 0 ? qVar.f322847g : list2;
        Data data15 = (i & 128) != 0 ? qVar.f322848h : data5;
        Data data16 = (i & 256) != 0 ? qVar.i : data6;
        Data data17 = (i & 512) != 0 ? qVar.f322849j : data7;
        Data data18 = (i & 1024) != 0 ? qVar.k : data8;
        Data data19 = (i & 2048) != 0 ? qVar.f322850l : data9;
        Data data20 = (i & 4096) != 0 ? qVar.f322851m : data10;
        qVar.getClass();
        return new q(data11, data12, data13, data14, gVar2, list3, list4, data15, data16, data17, data18, data19, data20);
    }

    @Override // fsl.n
    public final Data J0() {
        return this.i;
    }

    @Override // fsl.n
    public final Data a() {
        return this.f322848h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f322844a, qVar.f322844a) && Intrinsics.f(this.f322845b, qVar.f322845b) && Intrinsics.f(this.f322846c, qVar.f322846c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f322847g, qVar.f322847g) && Intrinsics.f(this.f322848h, qVar.f322848h) && Intrinsics.f(this.i, qVar.i) && Intrinsics.f(this.f322849j, qVar.f322849j) && Intrinsics.f(this.k, qVar.k) && Intrinsics.f(this.f322850l, qVar.f322850l) && Intrinsics.f(this.f322851m, qVar.f322851m);
    }

    public final int hashCode() {
        Data data = this.f322844a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f322845b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f322846c;
        int iHashCode3 = (iHashCode2 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.d;
        int iHashCode4 = (iHashCode3 + (data4 == null ? 0 : data4.hashCode())) * 31;
        d1h.g gVar = this.e;
        int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        List list = this.f;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f322847g;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Data data5 = this.f322848h;
        int iHashCode8 = (iHashCode7 + (data5 == null ? 0 : data5.hashCode())) * 31;
        Data data6 = this.i;
        int iHashCode9 = (iHashCode8 + (data6 == null ? 0 : data6.hashCode())) * 31;
        Data data7 = this.f322849j;
        int iHashCode10 = (iHashCode9 + (data7 == null ? 0 : data7.hashCode())) * 31;
        Data data8 = this.k;
        int iHashCode11 = (iHashCode10 + (data8 == null ? 0 : data8.hashCode())) * 31;
        Data data9 = this.f322850l;
        int iHashCode12 = (iHashCode11 + (data9 == null ? 0 : data9.hashCode())) * 31;
        Data data10 = this.f322851m;
        return iHashCode12 + (data10 != null ? data10.hashCode() : 0);
    }

    public /* synthetic */ q(int i) {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public q(Data data, Data data2, Data data3, Data data4, d1h.g gVar, List list, List list2, Data data5, Data data6, Data data7, Data data8, Data data9, Data data10) {
        this.f322844a = data;
        this.f322845b = data2;
        this.f322846c = data3;
        this.d = data4;
        this.e = gVar;
        this.f = list;
        this.f322847g = list2;
        this.f322848h = data5;
        this.i = data6;
        this.f322849j = data7;
        this.k = data8;
        this.f322850l = data9;
        this.f322851m = data10;
    }
}

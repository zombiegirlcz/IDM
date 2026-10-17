package fnc;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f136640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f136641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final doc.j f136642c;
    public final Data d;
    public final Data e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f136643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f136644h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jlc.r f136645j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e7f.c f136646l;

    public m() {
        this(0);
    }

    public static m a(m mVar, Data data, boolean z, doc.j jVar, Data data2, Data data3, List list, Data data4, Data data5, Data data6, jlc.r rVar, Data data7, e7f.c cVar, int i) {
        if ((i & 1) != 0) {
            data = mVar.f136640a;
        }
        Data data8 = data;
        if ((i & 2) != 0) {
            z = mVar.f136641b;
        }
        boolean z3 = z;
        doc.j jVar2 = (i & 4) != 0 ? mVar.f136642c : jVar;
        Data data9 = (i & 8) != 0 ? mVar.d : data2;
        Data data10 = (i & 16) != 0 ? mVar.e : data3;
        List list2 = (i & 32) != 0 ? mVar.f : list;
        Data data11 = (i & 64) != 0 ? mVar.f136643g : data4;
        Data data12 = (i & 128) != 0 ? mVar.f136644h : data5;
        Data data13 = (i & 256) != 0 ? mVar.i : data6;
        jlc.r rVar2 = (i & 512) != 0 ? mVar.f136645j : rVar;
        Data data14 = (i & 1024) != 0 ? mVar.k : data7;
        e7f.c cVar2 = (i & 2048) != 0 ? mVar.f136646l : cVar;
        mVar.getClass();
        return new m(data8, z3, jVar2, data9, data10, list2, data11, data12, data13, rVar2, data14, cVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f136640a, mVar.f136640a) && this.f136641b == mVar.f136641b && Intrinsics.f(this.f136642c, mVar.f136642c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f136643g, mVar.f136643g) && Intrinsics.f(this.f136644h, mVar.f136644h) && Intrinsics.f(this.i, mVar.i) && Intrinsics.f(this.f136645j, mVar.f136645j) && Intrinsics.f(this.k, mVar.k) && Intrinsics.f(this.f136646l, mVar.f136646l);
    }

    public final int hashCode() {
        Data data = this.f136640a;
        int iC = j6.a.c((data == null ? 0 : data.hashCode()) * 31, 31, this.f136641b);
        doc.j jVar = this.f136642c;
        int iHashCode = (iC + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Data data2 = this.d;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.e;
        int iHashCode3 = (iHashCode2 + (data3 == null ? 0 : data3.hashCode())) * 31;
        List list = this.f;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Data data4 = this.f136643g;
        int iHashCode5 = (iHashCode4 + (data4 == null ? 0 : data4.hashCode())) * 31;
        Data data5 = this.f136644h;
        int iHashCode6 = (iHashCode5 + (data5 == null ? 0 : data5.hashCode())) * 31;
        Data data6 = this.i;
        int iHashCode7 = (iHashCode6 + (data6 == null ? 0 : data6.hashCode())) * 31;
        jlc.r rVar = this.f136645j;
        int iHashCode8 = (iHashCode7 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        Data data7 = this.k;
        int iHashCode9 = (iHashCode8 + (data7 == null ? 0 : data7.hashCode())) * 31;
        e7f.c cVar = this.f136646l;
        return iHashCode9 + (cVar != null ? cVar.hashCode() : 0);
    }

    public /* synthetic */ m(int i) {
        this(null, false, null, null, null, null, null, null, null, null, null, null);
    }

    public m(Data data, boolean z, doc.j jVar, Data data2, Data data3, List list, Data data4, Data data5, Data data6, jlc.r rVar, Data data7, e7f.c cVar) {
        this.f136640a = data;
        this.f136641b = z;
        this.f136642c = jVar;
        this.d = data2;
        this.e = data3;
        this.f = list;
        this.f136643g = data4;
        this.f136644h = data5;
        this.i = data6;
        this.f136645j = rVar;
        this.k = data7;
        this.f136646l = cVar;
    }
}

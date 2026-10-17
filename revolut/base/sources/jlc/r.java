package jlc;

import com.revolut.data.model.Data;
import ip0.mj;
import java.time.LocalDate;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f175697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f175698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f175699c;
    public final dj0.d d;
    public final dj0.d e;
    public final p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f175700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f175701h;
    public final LocalDate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LocalDate f175702j;
    public final Map k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q f175703l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mj f175704m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Data f175705n;
    public final Data o;

    public r(n nVar, Data data, dj0.d dVar, dj0.d dVar2, dj0.d dVar3, p pVar, Data data2, Boolean bool, LocalDate currentDate, LocalDate localDate, Map projectionsPerMonth, q qVar, mj mjVar, Data data3, Data data4) {
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(projectionsPerMonth, "projectionsPerMonth");
        this.f175697a = nVar;
        this.f175698b = data;
        this.f175699c = dVar;
        this.d = dVar2;
        this.e = dVar3;
        this.f = pVar;
        this.f175700g = data2;
        this.f175701h = bool;
        this.i = currentDate;
        this.f175702j = localDate;
        this.k = projectionsPerMonth;
        this.f175703l = qVar;
        this.f175704m = mjVar;
        this.f175705n = data3;
        this.o = data4;
    }

    public static r a(r rVar, n nVar, Data data, dj0.d dVar, dj0.d dVar2, dj0.d dVar3, p pVar, Data data2, Boolean bool, LocalDate localDate, Map map, q qVar, mj mjVar, Data data3, Data data4, int i) {
        n nVar2 = (i & 1) != 0 ? rVar.f175697a : nVar;
        Data data5 = (i & 2) != 0 ? rVar.f175698b : data;
        dj0.d dVar4 = (i & 4) != 0 ? rVar.f175699c : dVar;
        dj0.d dVar5 = (i & 8) != 0 ? rVar.d : dVar2;
        dj0.d dVar6 = (i & 16) != 0 ? rVar.e : dVar3;
        p pVar2 = (i & 32) != 0 ? rVar.f : pVar;
        Data data6 = (i & 64) != 0 ? rVar.f175700g : data2;
        Boolean bool2 = (i & 128) != 0 ? rVar.f175701h : bool;
        LocalDate currentDate = rVar.i;
        LocalDate localDate2 = (i & 512) != 0 ? rVar.f175702j : localDate;
        Map projectionsPerMonth = (i & 1024) != 0 ? rVar.k : map;
        q qVar2 = (i & 2048) != 0 ? rVar.f175703l : qVar;
        mj mjVar2 = (i & 4096) != 0 ? rVar.f175704m : mjVar;
        Data data7 = (i & 8192) != 0 ? rVar.f175705n : data3;
        Data data8 = (i & 16384) != 0 ? rVar.o : data4;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(projectionsPerMonth, "projectionsPerMonth");
        return new r(nVar2, data5, dVar4, dVar5, dVar6, pVar2, data6, bool2, currentDate, localDate2, projectionsPerMonth, qVar2, mjVar2, data7, data8);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f175697a, rVar.f175697a) && Intrinsics.f(this.f175698b, rVar.f175698b) && Intrinsics.f(this.f175699c, rVar.f175699c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && this.f == rVar.f && Intrinsics.f(this.f175700g, rVar.f175700g) && Intrinsics.f(this.f175701h, rVar.f175701h) && Intrinsics.f(this.i, rVar.i) && Intrinsics.f(this.f175702j, rVar.f175702j) && Intrinsics.f(this.k, rVar.k) && Intrinsics.f(this.f175703l, rVar.f175703l) && Intrinsics.f(this.f175704m, rVar.f175704m) && Intrinsics.f(this.f175705n, rVar.f175705n) && Intrinsics.f(this.o, rVar.o);
    }

    public final int hashCode() {
        n nVar = this.f175697a;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        Data data = this.f175698b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        dj0.d dVar = this.f175699c;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.d;
        int iHashCode4 = (iHashCode3 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.e;
        int iHashCode5 = (iHashCode4 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        p pVar = this.f;
        int iHashCode6 = (iHashCode5 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        Data data2 = this.f175700g;
        int iHashCode7 = (iHashCode6 + (data2 == null ? 0 : data2.hashCode())) * 31;
        Boolean bool = this.f175701h;
        int iA = wp5.y.a((iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.i);
        LocalDate localDate = this.f175702j;
        int iE = p.a.e((iA + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.k);
        q qVar = this.f175703l;
        int iHashCode8 = (iE + (qVar == null ? 0 : qVar.hashCode())) * 31;
        mj mjVar = this.f175704m;
        int iHashCode9 = (iHashCode8 + (mjVar == null ? 0 : mjVar.hashCode())) * 31;
        Data data3 = this.f175705n;
        int iHashCode10 = (iHashCode9 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.o;
        return iHashCode10 + (data4 != null ? data4.hashCode() : 0);
    }
}

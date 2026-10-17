package ybh;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.api.navigation.models.RecurringDepositSchedule;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f312323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f312324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f312325c;
    public final Data d;
    public final Boolean e;
    public final Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RecurringDepositSchedule f312326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m1h.h f312327h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f312328j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f312329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f312330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f312331n;
    public final Data o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f312332p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f312333q;

    public n() {
        this(0);
    }

    public static n a(n nVar, dj0.d dVar, Data data, Data data2, Data data3, Boolean bool, Boolean bool2, RecurringDepositSchedule recurringDepositSchedule, m1h.h hVar, Data data4, Data data5, Data data6, boolean z, boolean z3, boolean z4, Data data7, List list, boolean z6, int i) {
        dj0.d dVar2 = (i & 1) != 0 ? nVar.f312323a : dVar;
        Data data8 = (i & 2) != 0 ? nVar.f312324b : data;
        Data data9 = (i & 4) != 0 ? nVar.f312325c : data2;
        Data data10 = (i & 8) != 0 ? nVar.d : data3;
        Boolean bool3 = (i & 16) != 0 ? nVar.e : bool;
        Boolean bool4 = (i & 32) != 0 ? nVar.f : bool2;
        RecurringDepositSchedule recurringDepositSchedule2 = (i & 64) != 0 ? nVar.f312326g : recurringDepositSchedule;
        m1h.h hVar2 = (i & 128) != 0 ? nVar.f312327h : hVar;
        Data data11 = (i & 256) != 0 ? nVar.i : data4;
        Data data12 = (i & 512) != 0 ? nVar.f312328j : data5;
        Data data13 = (i & 1024) != 0 ? nVar.k : data6;
        boolean z11 = (i & 2048) != 0 ? nVar.f312329l : z;
        boolean z12 = (i & 4096) != 0 ? nVar.f312330m : z3;
        boolean z29 = (i & 8192) != 0 ? nVar.f312331n : z4;
        dj0.d dVar3 = dVar2;
        Data data14 = (i & 16384) != 0 ? nVar.o : data7;
        List inputSuggestions = (i & 32768) != 0 ? nVar.f312332p : list;
        Data data15 = data14;
        boolean z31 = (i & 65536) != 0 ? nVar.f312333q : z6;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(inputSuggestions, "inputSuggestions");
        return new n(dVar3, data8, data9, data10, bool3, bool4, recurringDepositSchedule2, hVar2, data11, data12, data13, z11, z12, z29, data15, inputSuggestions, z31);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f312323a, nVar.f312323a) && Intrinsics.f(this.f312324b, nVar.f312324b) && Intrinsics.f(this.f312325c, nVar.f312325c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f312326g, nVar.f312326g) && Intrinsics.f(this.f312327h, nVar.f312327h) && Intrinsics.f(this.i, nVar.i) && Intrinsics.f(this.f312328j, nVar.f312328j) && Intrinsics.f(this.k, nVar.k) && this.f312329l == nVar.f312329l && this.f312330m == nVar.f312330m && this.f312331n == nVar.f312331n && Intrinsics.f(this.o, nVar.o) && Intrinsics.f(this.f312332p, nVar.f312332p) && this.f312333q == nVar.f312333q;
    }

    public final int hashCode() {
        dj0.d dVar = this.f312323a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        Data data = this.f312324b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f312325c;
        int iHashCode3 = (iHashCode2 + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.d;
        int iHashCode4 = (iHashCode3 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        RecurringDepositSchedule recurringDepositSchedule = this.f312326g;
        int iHashCode7 = (iHashCode6 + (recurringDepositSchedule == null ? 0 : recurringDepositSchedule.hashCode())) * 31;
        m1h.h hVar = this.f312327h;
        int iHashCode8 = (iHashCode7 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        Data data4 = this.i;
        int iHashCode9 = (iHashCode8 + (data4 == null ? 0 : data4.hashCode())) * 31;
        Data data5 = this.f312328j;
        int iHashCode10 = (iHashCode9 + (data5 == null ? 0 : data5.hashCode())) * 31;
        Data data6 = this.k;
        int iC = j6.a.c(j6.a.c(j6.a.c((iHashCode10 + (data6 == null ? 0 : data6.hashCode())) * 31, 31, this.f312329l), 31, this.f312330m), 31, this.f312331n);
        Data data7 = this.o;
        return Boolean.hashCode(this.f312333q) + p.a.d((iC + (data7 != null ? data7.hashCode() : 0)) * 31, 31, this.f312332p);
    }

    public n(dj0.d dVar, Data data, Data data2, Data data3, Boolean bool, Boolean bool2, RecurringDepositSchedule recurringDepositSchedule, m1h.h hVar, Data data4, Data data5, Data data6, boolean z, boolean z3, boolean z4, Data data7, List inputSuggestions, boolean z6) {
        Intrinsics.checkNotNullParameter(inputSuggestions, "inputSuggestions");
        this.f312323a = dVar;
        this.f312324b = data;
        this.f312325c = data2;
        this.d = data3;
        this.e = bool;
        this.f = bool2;
        this.f312326g = recurringDepositSchedule;
        this.f312327h = hVar;
        this.i = data4;
        this.f312328j = data5;
        this.k = data6;
        this.f312329l = z;
        this.f312330m = z3;
        this.f312331n = z4;
        this.o = data7;
        this.f312332p = inputSuggestions;
        this.f312333q = z6;
    }

    public n(int i) {
        this(null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, zhm.f0.f322471a, false);
    }
}

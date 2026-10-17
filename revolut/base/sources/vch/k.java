package vch;

import com.revolut.data.model.Data;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0h.a f287708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f287709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f287710c;
    public final Data d;
    public final tsb.f e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f287711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f287712h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f287713j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f287714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f287715m;

    public k(f0h.a withdrawTarget, y0 withdrawTransferData, dj0.d amount, Data data, tsb.f fVar, Data data2, Data data3, Data data4, Data data5, boolean z, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(withdrawTarget, "withdrawTarget");
        Intrinsics.checkNotNullParameter(withdrawTransferData, "withdrawTransferData");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f287708a = withdrawTarget;
        this.f287709b = withdrawTransferData;
        this.f287710c = amount;
        this.d = data;
        this.e = fVar;
        this.f = data2;
        this.f287711g = data3;
        this.f287712h = data4;
        this.i = data5;
        this.f287713j = z;
        this.k = z3;
        this.f287714l = z4;
        this.f287715m = z6;
    }

    public static k a(k kVar, f0h.a aVar, y0 y0Var, dj0.d dVar, Data data, tsb.f fVar, Data data2, Data data3, Data data4, Data data5, boolean z, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            aVar = kVar.f287708a;
        }
        f0h.a withdrawTarget = aVar;
        y0 withdrawTransferData = (i & 2) != 0 ? kVar.f287709b : y0Var;
        dj0.d amount = (i & 4) != 0 ? kVar.f287710c : dVar;
        Data data6 = (i & 8) != 0 ? kVar.d : data;
        tsb.f fVar2 = (i & 16) != 0 ? kVar.e : fVar;
        Data data7 = (i & 32) != 0 ? kVar.f : data2;
        Data data8 = (i & 64) != 0 ? kVar.f287711g : data3;
        Data data9 = (i & 128) != 0 ? kVar.f287712h : data4;
        Data data10 = (i & 256) != 0 ? kVar.i : data5;
        kVar.getClass();
        boolean z6 = (i & 1024) != 0 ? kVar.f287713j : z;
        boolean z11 = (i & 2048) != 0 ? kVar.k : z3;
        boolean z12 = (i & 4096) != 0 ? kVar.f287714l : false;
        boolean z29 = (i & 8192) != 0 ? kVar.f287715m : z4;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(withdrawTarget, "withdrawTarget");
        Intrinsics.checkNotNullParameter(withdrawTransferData, "withdrawTransferData");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new k(withdrawTarget, withdrawTransferData, amount, data6, fVar2, data7, data8, data9, data10, z6, z11, z12, z29);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f287708a, kVar.f287708a) && Intrinsics.f(this.f287709b, kVar.f287709b) && Intrinsics.f(this.f287710c, kVar.f287710c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f287711g, kVar.f287711g) && Intrinsics.f(this.f287712h, kVar.f287712h) && Intrinsics.f(this.i, kVar.i) && this.f287713j == kVar.f287713j && this.k == kVar.k && this.f287714l == kVar.f287714l && this.f287715m == kVar.f287715m;
    }

    public final int hashCode() {
        int iC = v7.c((this.f287709b.hashCode() + (this.f287708a.f131122a.hashCode() * 31)) * 31, 31, this.f287710c);
        Data data = this.d;
        int iHashCode = (iC + (data == null ? 0 : data.hashCode())) * 31;
        tsb.f fVar = this.e;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Data data2 = this.f;
        int iHashCode3 = (iHashCode2 + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f287711g;
        int iHashCode4 = (iHashCode3 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.f287712h;
        int iHashCode5 = (iHashCode4 + (data4 == null ? 0 : data4.hashCode())) * 31;
        Data data5 = this.i;
        return Boolean.hashCode(this.f287715m) + j6.a.c(j6.a.c(j6.a.c((iHashCode5 + (data5 != null ? data5.hashCode() : 0)) * 961, 31, this.f287713j), 31, this.k), 31, this.f287714l);
    }
}

package jsl;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jdf.f f178196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f178197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f178198c;
    public final Data d;
    public final Data e;
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f178199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f178200h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f178201j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f178202l;

    public a0(jdf.f investmentPlanProjectionsDomainState, Data data, Data data2, Data data3, Data data4, o cancelActionState, Data data5, List list, Data data6, Data data7, Data data8, Data data9) {
        Intrinsics.checkNotNullParameter(investmentPlanProjectionsDomainState, "investmentPlanProjectionsDomainState");
        Intrinsics.checkNotNullParameter(cancelActionState, "cancelActionState");
        this.f178196a = investmentPlanProjectionsDomainState;
        this.f178197b = data;
        this.f178198c = data2;
        this.d = data3;
        this.e = data4;
        this.f = cancelActionState;
        this.f178199g = data5;
        this.f178200h = list;
        this.i = data6;
        this.f178201j = data7;
        this.k = data8;
        this.f178202l = data9;
    }

    public static a0 a(a0 a0Var, jdf.f fVar, Data data, Data data2, Data data3, Data data4, o oVar, Data data5, List list, Data data6, Data data7, Data data8, Data data9, int i) {
        if ((i & 1) != 0) {
            fVar = a0Var.f178196a;
        }
        jdf.f investmentPlanProjectionsDomainState = fVar;
        if ((i & 2) != 0) {
            data = a0Var.f178197b;
        }
        Data data10 = data;
        Data data11 = (i & 4) != 0 ? a0Var.f178198c : data2;
        Data data12 = (i & 8) != 0 ? a0Var.d : data3;
        Data data13 = (i & 16) != 0 ? a0Var.e : data4;
        o cancelActionState = (i & 32) != 0 ? a0Var.f : oVar;
        Data data14 = (i & 64) != 0 ? a0Var.f178199g : data5;
        List list2 = (i & 128) != 0 ? a0Var.f178200h : list;
        Data data15 = (i & 256) != 0 ? a0Var.i : data6;
        Data data16 = (i & 512) != 0 ? a0Var.f178201j : data7;
        Data data17 = (i & 1024) != 0 ? a0Var.k : data8;
        Data data18 = (i & 2048) != 0 ? a0Var.f178202l : data9;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(investmentPlanProjectionsDomainState, "investmentPlanProjectionsDomainState");
        Intrinsics.checkNotNullParameter(cancelActionState, "cancelActionState");
        return new a0(investmentPlanProjectionsDomainState, data10, data11, data12, data13, cancelActionState, data14, list2, data15, data16, data17, data18);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f178196a, a0Var.f178196a) && Intrinsics.f(this.f178197b, a0Var.f178197b) && Intrinsics.f(this.f178198c, a0Var.f178198c) && Intrinsics.f(this.d, a0Var.d) && Intrinsics.f(this.e, a0Var.e) && Intrinsics.f(this.f, a0Var.f) && Intrinsics.f(this.f178199g, a0Var.f178199g) && Intrinsics.f(this.f178200h, a0Var.f178200h) && Intrinsics.f(this.i, a0Var.i) && Intrinsics.f(this.f178201j, a0Var.f178201j) && Intrinsics.f(this.k, a0Var.k) && Intrinsics.f(this.f178202l, a0Var.f178202l);
    }

    public final int hashCode() {
        int iHashCode = this.f178196a.hashCode() * 31;
        Data data = this.f178197b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f178198c;
        int iHashCode3 = (iHashCode2 + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.d;
        int iHashCode4 = (iHashCode3 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.e;
        int iHashCode5 = (this.f.hashCode() + ((iHashCode4 + (data4 == null ? 0 : data4.hashCode())) * 31)) * 31;
        Data data5 = this.f178199g;
        int iHashCode6 = (iHashCode5 + (data5 == null ? 0 : data5.hashCode())) * 31;
        List list = this.f178200h;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Data data6 = this.i;
        int iHashCode8 = (iHashCode7 + (data6 == null ? 0 : data6.hashCode())) * 31;
        Data data7 = this.f178201j;
        int iHashCode9 = (iHashCode8 + (data7 == null ? 0 : data7.hashCode())) * 31;
        Data data8 = this.k;
        int iHashCode10 = (iHashCode9 + (data8 == null ? 0 : data8.hashCode())) * 31;
        Data data9 = this.f178202l;
        return iHashCode10 + (data9 != null ? data9.hashCode() : 0);
    }
}

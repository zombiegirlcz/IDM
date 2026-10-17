package uu6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f283142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f283143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f283144c;
    public final boolean d;
    public final Data e;

    public h() {
        this(0);
    }

    public static h a(h hVar, Data data, boolean z, Data data2, boolean z3, Data data3, int i) {
        if ((i & 1) != 0) {
            data = hVar.f283142a;
        }
        Data paymentDetailsData = data;
        if ((i & 2) != 0) {
            z = hVar.f283143b;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            data2 = hVar.f283144c;
        }
        Data timelineData = data2;
        if ((i & 8) != 0) {
            z3 = hVar.d;
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            data3 = hVar.e;
        }
        Data settlementTransactionsData = data3;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(paymentDetailsData, "paymentDetailsData");
        Intrinsics.checkNotNullParameter(timelineData, "timelineData");
        Intrinsics.checkNotNullParameter(settlementTransactionsData, "settlementTransactionsData");
        return new h(paymentDetailsData, timelineData, settlementTransactionsData, z4, z6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f283142a, hVar.f283142a) && this.f283143b == hVar.f283143b && Intrinsics.f(this.f283144c, hVar.f283144c) && this.d == hVar.d && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(kii.e.c(this.f283144c, j6.a.c(this.f283142a.hashCode() * 31, 31, this.f283143b), 31), 31, this.d);
    }

    public h(Data paymentDetailsData, Data timelineData, Data settlementTransactionsData, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(paymentDetailsData, "paymentDetailsData");
        Intrinsics.checkNotNullParameter(timelineData, "timelineData");
        Intrinsics.checkNotNullParameter(settlementTransactionsData, "settlementTransactionsData");
        this.f283142a = paymentDetailsData;
        this.f283143b = z;
        this.f283144c = timelineData;
        this.d = z3;
        this.e = settlementTransactionsData;
    }

    public /* synthetic */ h(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), false, false);
    }
}

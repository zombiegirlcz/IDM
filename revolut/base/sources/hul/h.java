package hul;

import com.revolut.data.model.Data;
import com.revolut.feature.trading_orders.common.models.AutoTopUpStatus;
import com.revolut.feature.trading_orders.common.models.FrequencySettings;
import com.revolut.trading.orders.ui.invest.placement.models.InvestOrderDraft;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrderDraft f155719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrequencySettings f155720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AutoTopUpStatus f155721c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f155722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f155723h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f155724j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f155725l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f155726m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d1h.g f155727n;
    public final Data o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Data f155728p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f155729q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Data f155730r;

    public h(InvestOrderDraft orderDraft, FrequencySettings frequencySettings, AutoTopUpStatus autoTopUpStatus, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, Data data7, Data data8, Data data9, Data data10, d1h.g gVar, Data data11, Data data12, boolean z, Data data13) {
        Intrinsics.checkNotNullParameter(orderDraft, "orderDraft");
        Intrinsics.checkNotNullParameter(autoTopUpStatus, "autoTopUpStatus");
        this.f155719a = orderDraft;
        this.f155720b = frequencySettings;
        this.f155721c = autoTopUpStatus;
        this.d = data;
        this.e = data2;
        this.f = data3;
        this.f155722g = data4;
        this.f155723h = data5;
        this.i = data6;
        this.f155724j = data7;
        this.k = data8;
        this.f155725l = data9;
        this.f155726m = data10;
        this.f155727n = gVar;
        this.o = data11;
        this.f155728p = data12;
        this.f155729q = z;
        this.f155730r = data13;
    }

    public static h a(h hVar, FrequencySettings frequencySettings, AutoTopUpStatus autoTopUpStatus, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, Data data7, Data data8, Data data9, Data data10, d1h.g gVar, Data data11, Data data12, Data data13, int i) {
        boolean z;
        Data data14;
        InvestOrderDraft orderDraft = hVar.f155719a;
        FrequencySettings frequencySettings2 = (i & 2) != 0 ? hVar.f155720b : frequencySettings;
        AutoTopUpStatus autoTopUpStatus2 = (i & 4) != 0 ? hVar.f155721c : autoTopUpStatus;
        Data data15 = (i & 8) != 0 ? hVar.d : data;
        Data data16 = (i & 16) != 0 ? hVar.e : data2;
        Data data17 = (i & 32) != 0 ? hVar.f : data3;
        Data data18 = (i & 64) != 0 ? hVar.f155722g : data4;
        Data data19 = (i & 128) != 0 ? hVar.f155723h : data5;
        Data data20 = (i & 256) != 0 ? hVar.i : data6;
        hVar.getClass();
        Data data21 = (i & 1024) != 0 ? hVar.f155724j : data7;
        Data data22 = (i & 2048) != 0 ? hVar.k : data8;
        Data data23 = (i & 4096) != 0 ? hVar.f155725l : data9;
        Data data24 = (i & 8192) != 0 ? hVar.f155726m : data10;
        d1h.g gVar2 = (i & 16384) != 0 ? hVar.f155727n : gVar;
        Data data25 = (i & 32768) != 0 ? hVar.o : data11;
        Data data26 = (i & 65536) != 0 ? hVar.f155728p : data12;
        boolean z3 = hVar.f155729q;
        if ((i & 262144) != 0) {
            z = z3;
            data14 = hVar.f155730r;
        } else {
            z = z3;
            data14 = data13;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(orderDraft, "orderDraft");
        Intrinsics.checkNotNullParameter(autoTopUpStatus2, "autoTopUpStatus");
        return new h(orderDraft, frequencySettings2, autoTopUpStatus2, data15, data16, data17, data18, data19, data20, data21, data22, data23, data24, gVar2, data25, data26, z, data14);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f155719a, hVar.f155719a) && Intrinsics.f(this.f155720b, hVar.f155720b) && Intrinsics.f(this.f155721c, hVar.f155721c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f155722g, hVar.f155722g) && Intrinsics.f(this.f155723h, hVar.f155723h) && Intrinsics.f(this.i, hVar.i) && Intrinsics.f(this.f155724j, hVar.f155724j) && Intrinsics.f(this.k, hVar.k) && Intrinsics.f(this.f155725l, hVar.f155725l) && Intrinsics.f(this.f155726m, hVar.f155726m) && Intrinsics.f(this.f155727n, hVar.f155727n) && Intrinsics.f(this.o, hVar.o) && Intrinsics.f(this.f155728p, hVar.f155728p) && this.f155729q == hVar.f155729q && Intrinsics.f(this.f155730r, hVar.f155730r);
    }

    public final int hashCode() {
        int iHashCode = this.f155719a.hashCode() * 31;
        FrequencySettings frequencySettings = this.f155720b;
        int iHashCode2 = (this.f155721c.hashCode() + ((iHashCode + (frequencySettings == null ? 0 : frequencySettings.hashCode())) * 31)) * 31;
        Data data = this.d;
        int iHashCode3 = (iHashCode2 + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.e;
        int iHashCode4 = (iHashCode3 + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f;
        int iHashCode5 = (iHashCode4 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.f155722g;
        int iHashCode6 = (iHashCode5 + (data4 == null ? 0 : data4.hashCode())) * 31;
        Data data5 = this.f155723h;
        int iHashCode7 = (iHashCode6 + (data5 == null ? 0 : data5.hashCode())) * 31;
        Data data6 = this.i;
        int iHashCode8 = (iHashCode7 + (data6 == null ? 0 : data6.hashCode())) * 961;
        Data data7 = this.f155724j;
        int iHashCode9 = (iHashCode8 + (data7 == null ? 0 : data7.hashCode())) * 31;
        Data data8 = this.k;
        int iHashCode10 = (iHashCode9 + (data8 == null ? 0 : data8.hashCode())) * 31;
        Data data9 = this.f155725l;
        int iHashCode11 = (iHashCode10 + (data9 == null ? 0 : data9.hashCode())) * 31;
        Data data10 = this.f155726m;
        int iHashCode12 = (iHashCode11 + (data10 == null ? 0 : data10.hashCode())) * 31;
        d1h.g gVar = this.f155727n;
        int iHashCode13 = (iHashCode12 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Data data11 = this.o;
        int iHashCode14 = (iHashCode13 + (data11 == null ? 0 : data11.hashCode())) * 31;
        Data data12 = this.f155728p;
        int iC = j6.a.c((iHashCode14 + (data12 == null ? 0 : data12.hashCode())) * 31, 31, this.f155729q);
        Data data13 = this.f155730r;
        return iC + (data13 != null ? data13.hashCode() : 0);
    }
}

package tb6;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f269480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f269481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f269482c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f269483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f269484h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f269485j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f269486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f269487m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ba6.r f269488n;

    public m() {
        this(0);
    }

    public static m a(m mVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, Data data7, Data data8, Data data9, List list, boolean z, boolean z3, boolean z4, ba6.r rVar, int i) {
        Data charity = (i & 1) != 0 ? mVar.f269480a : data;
        Data recurringPayments = (i & 2) != 0 ? mVar.f269481b : data2;
        Data spareChange = (i & 4) != 0 ? mVar.f269482c : data3;
        Data averageSpareChange = (i & 8) != 0 ? mVar.d : data4;
        Data donationCurrency = (i & 16) != 0 ? mVar.e : data5;
        Data otherCharities = (i & 32) != 0 ? mVar.f : data6;
        Data donationWithRevPointsAllowed = (i & 64) != 0 ? mVar.f269483g : data7;
        Data spareChangeAvailable = (i & 128) != 0 ? mVar.f269484h : data8;
        Data recurringDonationsAvailable = (i & 256) != 0 ? mVar.i : data9;
        List transactions = (i & 512) != 0 ? mVar.f269485j : list;
        boolean z6 = (i & 1024) != 0 ? mVar.k : z;
        boolean z11 = (i & 2048) != 0 ? mVar.f269486l : z3;
        boolean z12 = (i & 4096) != 0 ? mVar.f269487m : z4;
        ba6.r rVar2 = (i & 8192) != 0 ? mVar.f269488n : rVar;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(charity, "charity");
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        Intrinsics.checkNotNullParameter(spareChange, "spareChange");
        Intrinsics.checkNotNullParameter(averageSpareChange, "averageSpareChange");
        Intrinsics.checkNotNullParameter(donationCurrency, "donationCurrency");
        Intrinsics.checkNotNullParameter(otherCharities, "otherCharities");
        Intrinsics.checkNotNullParameter(donationWithRevPointsAllowed, "donationWithRevPointsAllowed");
        Intrinsics.checkNotNullParameter(spareChangeAvailable, "spareChangeAvailable");
        Intrinsics.checkNotNullParameter(recurringDonationsAvailable, "recurringDonationsAvailable");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        return new m(charity, recurringPayments, spareChange, averageSpareChange, donationCurrency, otherCharities, donationWithRevPointsAllowed, spareChangeAvailable, recurringDonationsAvailable, transactions, z6, z11, z12, rVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f269480a, mVar.f269480a) && Intrinsics.f(this.f269481b, mVar.f269481b) && Intrinsics.f(this.f269482c, mVar.f269482c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f269483g, mVar.f269483g) && Intrinsics.f(this.f269484h, mVar.f269484h) && Intrinsics.f(this.i, mVar.i) && Intrinsics.f(this.f269485j, mVar.f269485j) && this.k == mVar.k && this.f269486l == mVar.f269486l && this.f269487m == mVar.f269487m && Intrinsics.f(this.f269488n, mVar.f269488n);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(p.a.d(kii.e.c(this.i, kii.e.c(this.f269484h, kii.e.c(this.f269483g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f269482c, kii.e.c(this.f269481b, this.f269480a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31, this.f269485j), 31, this.k), 31, this.f269486l), 31, this.f269487m);
        ba6.r rVar = this.f269488n;
        return iC + (rVar == null ? 0 : rVar.hashCode());
    }

    public m(Data charity, Data recurringPayments, Data spareChange, Data averageSpareChange, Data donationCurrency, Data otherCharities, Data donationWithRevPointsAllowed, Data spareChangeAvailable, Data recurringDonationsAvailable, List transactions, boolean z, boolean z3, boolean z4, ba6.r rVar) {
        Intrinsics.checkNotNullParameter(charity, "charity");
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        Intrinsics.checkNotNullParameter(spareChange, "spareChange");
        Intrinsics.checkNotNullParameter(averageSpareChange, "averageSpareChange");
        Intrinsics.checkNotNullParameter(donationCurrency, "donationCurrency");
        Intrinsics.checkNotNullParameter(otherCharities, "otherCharities");
        Intrinsics.checkNotNullParameter(donationWithRevPointsAllowed, "donationWithRevPointsAllowed");
        Intrinsics.checkNotNullParameter(spareChangeAvailable, "spareChangeAvailable");
        Intrinsics.checkNotNullParameter(recurringDonationsAvailable, "recurringDonationsAvailable");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f269480a = charity;
        this.f269481b = recurringPayments;
        this.f269482c = spareChange;
        this.d = averageSpareChange;
        this.e = donationCurrency;
        this.f = otherCharities;
        this.f269483g = donationWithRevPointsAllowed;
        this.f269484h = spareChangeAvailable;
        this.i = recurringDonationsAvailable;
        this.f269485j = transactions;
        this.k = z;
        this.f269486l = z3;
        this.f269487m = z4;
        this.f269488n = rVar;
    }

    public m(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), f0.f322471a, false, false, false, null);
    }
}

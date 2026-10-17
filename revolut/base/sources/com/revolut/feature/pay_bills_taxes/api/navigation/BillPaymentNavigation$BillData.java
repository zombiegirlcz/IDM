package com.revolut.feature.pay_bills_taxes.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.BillWarning;
import com.revolut.feature.apm.bills.core.api.model.search.service_provider.ServiceProvider;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pay_bills_taxes/api/navigation/BillPaymentNavigation$BillData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillPaymentNavigation$BillData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BillPaymentNavigation$BillData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f78666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f78667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f78668c;
    public final boolean d;
    public final BillWarning e;
    public final ServiceProvider f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f78669g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BillPaymentNavigation$BillData((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() != 0, (BillWarning) parcel.readParcelable(BillPaymentNavigation$BillData.class.getClassLoader()), (ServiceProvider) parcel.readParcelable(BillPaymentNavigation$BillData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillPaymentNavigation$BillData[i];
        }
    }

    public BillPaymentNavigation$BillData(d amount, d dVar, d dVar2, boolean z, BillWarning billWarning, ServiceProvider serviceProvider, String str) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f78666a = amount;
        this.f78667b = dVar;
        this.f78668c = dVar2;
        this.d = z;
        this.e = billWarning;
        this.f = serviceProvider;
        this.f78669g = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillPaymentNavigation$BillData)) {
            return false;
        }
        BillPaymentNavigation$BillData billPaymentNavigation$BillData = (BillPaymentNavigation$BillData) obj2;
        return Intrinsics.f(this.f78666a, billPaymentNavigation$BillData.f78666a) && Intrinsics.f(this.f78667b, billPaymentNavigation$BillData.f78667b) && Intrinsics.f(this.f78668c, billPaymentNavigation$BillData.f78668c) && this.d == billPaymentNavigation$BillData.d && Intrinsics.f(this.e, billPaymentNavigation$BillData.e) && Intrinsics.f(this.f, billPaymentNavigation$BillData.f) && Intrinsics.f(this.f78669g, billPaymentNavigation$BillData.f78669g);
    }

    public final int hashCode() {
        int iHashCode = this.f78666a.hashCode() * 31;
        d dVar = this.f78667b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f78668c;
        int iC = j6.a.c((iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31, 31, this.d);
        BillWarning billWarning = this.e;
        int iHashCode3 = (iC + (billWarning == null ? 0 : billWarning.hashCode())) * 31;
        ServiceProvider serviceProvider = this.f;
        int iHashCode4 = (iHashCode3 + (serviceProvider == null ? 0 : serviceProvider.hashCode())) * 31;
        String str = this.f78669g;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f78666a);
        dest.writeSerializable(this.f78667b);
        dest.writeSerializable(this.f78668c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f78669g);
    }
}

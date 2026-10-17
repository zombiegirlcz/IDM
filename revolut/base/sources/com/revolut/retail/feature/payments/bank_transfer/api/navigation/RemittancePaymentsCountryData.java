package com.revolut.retail.feature.payments.bank_transfer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/RemittancePaymentsCountryData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RemittancePaymentsCountryData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RemittancePaymentsCountryData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f101977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f101979c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RemittancePaymentsCountryData((wi0.b) parcel.readSerializable(), parcel.readString(), (xi0.b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RemittancePaymentsCountryData[i];
        }
    }

    public RemittancePaymentsCountryData(wi0.b countryCode, String countryName, xi0.b defaultCurrency) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(defaultCurrency, "defaultCurrency");
        this.f101977a = countryCode;
        this.f101978b = countryName;
        this.f101979c = defaultCurrency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RemittancePaymentsCountryData)) {
            return false;
        }
        RemittancePaymentsCountryData remittancePaymentsCountryData = (RemittancePaymentsCountryData) obj2;
        return Intrinsics.f(this.f101977a, remittancePaymentsCountryData.f101977a) && Intrinsics.f(this.f101978b, remittancePaymentsCountryData.f101978b) && Intrinsics.f(this.f101979c, remittancePaymentsCountryData.f101979c);
    }

    public final int hashCode() {
        return this.f101979c.hashCode() + p.a.c(this.f101977a.f297794a.hashCode() * 31, 31, this.f101978b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f101977a);
        dest.writeString(this.f101978b);
        dest.writeSerializable(this.f101979c);
    }
}

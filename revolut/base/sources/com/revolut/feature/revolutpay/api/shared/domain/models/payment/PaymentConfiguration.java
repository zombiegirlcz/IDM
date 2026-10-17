package com.revolut.feature.revolutpay.api.shared.domain.models.payment;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/payment/PaymentConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SplitBillPaymentParams f84343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84344c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentConfiguration(parcel.readString(), parcel.readInt() == 0 ? null : SplitBillPaymentParams.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentConfiguration[i];
        }
    }

    public PaymentConfiguration(String str, SplitBillPaymentParams splitBillPaymentParams, String str2) {
        this.f84342a = str;
        this.f84343b = splitBillPaymentParams;
        this.f84344c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentConfiguration)) {
            return false;
        }
        PaymentConfiguration paymentConfiguration = (PaymentConfiguration) obj2;
        return Intrinsics.f(this.f84342a, paymentConfiguration.f84342a) && Intrinsics.f(this.f84343b, paymentConfiguration.f84343b) && Intrinsics.f(this.f84344c, paymentConfiguration.f84344c);
    }

    public final int hashCode() {
        String str = this.f84342a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        SplitBillPaymentParams splitBillPaymentParams = this.f84343b;
        int iHashCode2 = (iHashCode + (splitBillPaymentParams == null ? 0 : splitBillPaymentParams.hashCode())) * 31;
        String str2 = this.f84344c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84342a);
        SplitBillPaymentParams splitBillPaymentParams = this.f84343b;
        if (splitBillPaymentParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            splitBillPaymentParams.writeToParcel(dest, i);
        }
        dest.writeString(this.f84344c);
    }
}

package com.revolut.feature.revolutpay.api.shared.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/AcceptPaymentParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AcceptPaymentParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AcceptPaymentParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PaymentOptionsDiscount f84325c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AcceptPaymentParams(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentOptionsDiscount.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AcceptPaymentParams[i];
        }
    }

    public AcceptPaymentParams(String paymentId, String str, PaymentOptionsDiscount paymentOptionsDiscount, String str2) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        this.f84323a = paymentId;
        this.f84324b = str;
        this.f84325c = paymentOptionsDiscount;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AcceptPaymentParams)) {
            return false;
        }
        AcceptPaymentParams acceptPaymentParams = (AcceptPaymentParams) obj2;
        return Intrinsics.f(this.f84323a, acceptPaymentParams.f84323a) && Intrinsics.f(this.f84324b, acceptPaymentParams.f84324b) && Intrinsics.f(this.f84325c, acceptPaymentParams.f84325c) && Intrinsics.f(this.d, acceptPaymentParams.d);
    }

    public final int hashCode() {
        int iHashCode = this.f84323a.hashCode() * 31;
        String str = this.f84324b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PaymentOptionsDiscount paymentOptionsDiscount = this.f84325c;
        int iHashCode3 = (iHashCode2 + (paymentOptionsDiscount == null ? 0 : paymentOptionsDiscount.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84323a);
        dest.writeString(this.f84324b);
        PaymentOptionsDiscount paymentOptionsDiscount = this.f84325c;
        if (paymentOptionsDiscount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            paymentOptionsDiscount.writeToParcel(dest, i);
        }
        dest.writeString(this.d);
    }
}

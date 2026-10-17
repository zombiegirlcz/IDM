package com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/BillingAddress;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillingAddress implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BillingAddress> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84361c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BillingAddress(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillingAddress[i];
        }
    }

    public BillingAddress(String str, String country, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.f84359a = str;
        this.f84360b = country;
        this.f84361c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillingAddress)) {
            return false;
        }
        BillingAddress billingAddress = (BillingAddress) obj2;
        return Intrinsics.f(this.f84359a, billingAddress.f84359a) && Intrinsics.f(this.f84360b, billingAddress.f84360b) && Intrinsics.f(this.f84361c, billingAddress.f84361c) && Intrinsics.f(this.d, billingAddress.d) && Intrinsics.f(this.e, billingAddress.e);
    }

    public final int hashCode() {
        String str = this.f84359a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f84360b);
        String str2 = this.f84361c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84359a);
        dest.writeString(this.f84360b);
        dest.writeString(this.f84361c);
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}

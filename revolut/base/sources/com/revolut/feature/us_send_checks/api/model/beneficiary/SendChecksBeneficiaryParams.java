package com.revolut.feature.us_send_checks.api.model.beneficiary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/us_send_checks/api/model/beneficiary/SendChecksBeneficiaryParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_us_send_checks_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SendChecksBeneficiaryParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SendChecksBeneficiaryParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94586c;
    public final Address d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SendChecksBeneficiaryParams(parcel.readString(), parcel.readString(), parcel.readString(), (Address) parcel.readParcelable(SendChecksBeneficiaryParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SendChecksBeneficiaryParams[i];
        }
    }

    public SendChecksBeneficiaryParams(String str, String str2, String str3, Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f94584a = str;
        this.f94585b = str2;
        this.f94586c = str3;
        this.d = address;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SendChecksBeneficiaryParams)) {
            return false;
        }
        SendChecksBeneficiaryParams sendChecksBeneficiaryParams = (SendChecksBeneficiaryParams) obj2;
        return Intrinsics.f(this.f94584a, sendChecksBeneficiaryParams.f94584a) && Intrinsics.f(this.f94585b, sendChecksBeneficiaryParams.f94585b) && Intrinsics.f(this.f94586c, sendChecksBeneficiaryParams.f94586c) && Intrinsics.f(this.d, sendChecksBeneficiaryParams.d);
    }

    public final int hashCode() {
        String str = this.f94584a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f94585b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f94586c;
        return this.d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94584a);
        dest.writeString(this.f94585b);
        dest.writeString(this.f94586c);
        dest.writeParcelable(this.d, i);
    }
}

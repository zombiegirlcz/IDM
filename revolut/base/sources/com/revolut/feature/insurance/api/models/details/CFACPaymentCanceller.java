package com.revolut.feature.insurance.api.models.details;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/models/details/CFACPaymentCanceller;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACPaymentCanceller implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CFACPaymentCanceller> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f74995c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CFACPaymentCanceller(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACPaymentCanceller[i];
        }
    }

    public CFACPaymentCanceller(String code, String str, String str2) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f74993a = code;
        this.f74994b = str;
        this.f74995c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACPaymentCanceller)) {
            return false;
        }
        CFACPaymentCanceller cFACPaymentCanceller = (CFACPaymentCanceller) obj2;
        return Intrinsics.f(this.f74993a, cFACPaymentCanceller.f74993a) && Intrinsics.f(this.f74994b, cFACPaymentCanceller.f74994b) && Intrinsics.f(this.f74995c, cFACPaymentCanceller.f74995c);
    }

    public final int hashCode() {
        int iHashCode = this.f74993a.hashCode() * 31;
        String str = this.f74994b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f74995c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74993a);
        dest.writeString(this.f74994b);
        dest.writeString(this.f74995c);
    }
}

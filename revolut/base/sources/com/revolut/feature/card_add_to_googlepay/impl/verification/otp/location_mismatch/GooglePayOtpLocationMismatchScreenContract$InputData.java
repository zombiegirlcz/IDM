package com.revolut.feature.card_add_to_googlepay.impl.verification.otp.location_mismatch;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.cards.models.revolutcard.LocationMismatch;
import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_add_to_googlepay/impl/verification/otp/location_mismatch/GooglePayOtpLocationMismatchScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GooglePayOtpLocationMismatchScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<GooglePayOtpLocationMismatchScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutCardOtp f64500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationMismatch f64501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f64502c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GooglePayOtpLocationMismatchScreenContract$InputData((RevolutCardOtp) parcel.readParcelable(GooglePayOtpLocationMismatchScreenContract$InputData.class.getClassLoader()), (LocationMismatch) parcel.readParcelable(GooglePayOtpLocationMismatchScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GooglePayOtpLocationMismatchScreenContract$InputData[i];
        }
    }

    public GooglePayOtpLocationMismatchScreenContract$InputData(RevolutCardOtp cardOtp, LocationMismatch locationMismatch, boolean z) {
        Intrinsics.checkNotNullParameter(cardOtp, "cardOtp");
        Intrinsics.checkNotNullParameter(locationMismatch, "locationMismatch");
        this.f64500a = cardOtp;
        this.f64501b = locationMismatch;
        this.f64502c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GooglePayOtpLocationMismatchScreenContract$InputData)) {
            return false;
        }
        GooglePayOtpLocationMismatchScreenContract$InputData googlePayOtpLocationMismatchScreenContract$InputData = (GooglePayOtpLocationMismatchScreenContract$InputData) obj2;
        return Intrinsics.f(this.f64500a, googlePayOtpLocationMismatchScreenContract$InputData.f64500a) && Intrinsics.f(this.f64501b, googlePayOtpLocationMismatchScreenContract$InputData.f64501b) && this.f64502c == googlePayOtpLocationMismatchScreenContract$InputData.f64502c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64502c) + ((this.f64501b.hashCode() + (this.f64500a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f64500a, i);
        dest.writeParcelable(this.f64501b, i);
        dest.writeInt(this.f64502c ? 1 : 0);
    }
}

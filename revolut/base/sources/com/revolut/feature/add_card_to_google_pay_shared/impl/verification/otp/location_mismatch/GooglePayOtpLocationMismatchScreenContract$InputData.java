package com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.cards.models.revolutcard.LocationMismatch;
import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/add_card_to_google_pay_shared/impl/verification/otp/location_mismatch/GooglePayOtpLocationMismatchScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GooglePayOtpLocationMismatchScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<GooglePayOtpLocationMismatchScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutCardOtp f60902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationMismatch f60903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f60904c;

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
        this.f60902a = cardOtp;
        this.f60903b = locationMismatch;
        this.f60904c = z;
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
        return Intrinsics.f(this.f60902a, googlePayOtpLocationMismatchScreenContract$InputData.f60902a) && Intrinsics.f(this.f60903b, googlePayOtpLocationMismatchScreenContract$InputData.f60903b) && this.f60904c == googlePayOtpLocationMismatchScreenContract$InputData.f60904c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60904c) + ((this.f60903b.hashCode() + (this.f60902a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f60902a, i);
        dest.writeParcelable(this.f60903b, i);
        dest.writeInt(this.f60904c ? 1 : 0);
    }
}

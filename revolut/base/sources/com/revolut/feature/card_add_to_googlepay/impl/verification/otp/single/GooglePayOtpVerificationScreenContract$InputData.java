package com.revolut.feature.card_add_to_googlepay.impl.verification.otp.single;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_add_to_googlepay/impl/verification/otp/single/GooglePayOtpVerificationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GooglePayOtpVerificationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<GooglePayOtpVerificationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutCardOtp f64504a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GooglePayOtpVerificationScreenContract$InputData((RevolutCardOtp) parcel.readParcelable(GooglePayOtpVerificationScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GooglePayOtpVerificationScreenContract$InputData[i];
        }
    }

    public GooglePayOtpVerificationScreenContract$InputData(RevolutCardOtp cardOtp) {
        Intrinsics.checkNotNullParameter(cardOtp, "cardOtp");
        this.f64504a = cardOtp;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof GooglePayOtpVerificationScreenContract$InputData) && Intrinsics.f(this.f64504a, ((GooglePayOtpVerificationScreenContract$InputData) obj2).f64504a);
    }

    public final int hashCode() {
        return this.f64504a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f64504a, i);
    }
}

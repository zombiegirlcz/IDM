package com.revolut.feature_retail_user_declarations.email_verification.otp_bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_retail_user_declarations/email_verification/otp_bottomsheet/EmailVerificationOtpBottomSheetContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmailVerificationOtpBottomSheetContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EmailVerificationOtpBottomSheetContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97616b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EmailVerificationOtpBottomSheetContract$InputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EmailVerificationOtpBottomSheetContract$InputData[i];
        }
    }

    public EmailVerificationOtpBottomSheetContract$InputData(String email, String str) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f97615a = email;
        this.f97616b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EmailVerificationOtpBottomSheetContract$InputData)) {
            return false;
        }
        EmailVerificationOtpBottomSheetContract$InputData emailVerificationOtpBottomSheetContract$InputData = (EmailVerificationOtpBottomSheetContract$InputData) obj2;
        return Intrinsics.f(this.f97615a, emailVerificationOtpBottomSheetContract$InputData.f97615a) && Intrinsics.f(this.f97616b, emailVerificationOtpBottomSheetContract$InputData.f97616b);
    }

    public final int hashCode() {
        int iHashCode = this.f97615a.hashCode() * 31;
        String str = this.f97616b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97615a);
        dest.writeString(this.f97616b);
    }
}

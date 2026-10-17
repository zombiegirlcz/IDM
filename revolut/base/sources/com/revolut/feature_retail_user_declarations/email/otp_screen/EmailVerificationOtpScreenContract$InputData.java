package com.revolut.feature_retail_user_declarations.email.otp_screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_retail_user_declarations/email/otp_screen/EmailVerificationOtpScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmailVerificationOtpScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EmailVerificationOtpScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97577b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EmailVerificationOtpScreenContract$InputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EmailVerificationOtpScreenContract$InputData[i];
        }
    }

    public EmailVerificationOtpScreenContract$InputData(String email, String str) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f97576a = email;
        this.f97577b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EmailVerificationOtpScreenContract$InputData)) {
            return false;
        }
        EmailVerificationOtpScreenContract$InputData emailVerificationOtpScreenContract$InputData = (EmailVerificationOtpScreenContract$InputData) obj2;
        return Intrinsics.f(this.f97576a, emailVerificationOtpScreenContract$InputData.f97576a) && Intrinsics.f(this.f97577b, emailVerificationOtpScreenContract$InputData.f97577b);
    }

    public final int hashCode() {
        int iHashCode = this.f97576a.hashCode() * 31;
        String str = this.f97577b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97576a);
        dest.writeString(this.f97577b);
    }
}

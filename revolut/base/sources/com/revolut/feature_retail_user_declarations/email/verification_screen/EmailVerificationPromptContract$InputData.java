package com.revolut.feature_retail_user_declarations.email.verification_screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_retail_user_declarations/email/verification_screen/EmailVerificationPromptContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmailVerificationPromptContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EmailVerificationPromptContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EmailVerificationUseCase f97598c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EmailVerificationPromptContract$InputData(parcel.readString(), parcel.readString(), EmailVerificationUseCase.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EmailVerificationPromptContract$InputData[i];
        }
    }

    public EmailVerificationPromptContract$InputData(String email, String str, EmailVerificationUseCase useCase, String str2) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        this.f97596a = email;
        this.f97597b = str;
        this.f97598c = useCase;
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
        if (!(obj2 instanceof EmailVerificationPromptContract$InputData)) {
            return false;
        }
        EmailVerificationPromptContract$InputData emailVerificationPromptContract$InputData = (EmailVerificationPromptContract$InputData) obj2;
        return Intrinsics.f(this.f97596a, emailVerificationPromptContract$InputData.f97596a) && Intrinsics.f(this.f97597b, emailVerificationPromptContract$InputData.f97597b) && this.f97598c == emailVerificationPromptContract$InputData.f97598c && Intrinsics.f(this.d, emailVerificationPromptContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f97596a.hashCode() * 31;
        String str = this.f97597b;
        int iHashCode2 = (this.f97598c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97596a);
        dest.writeString(this.f97597b);
        this.f97598c.writeToParcel(dest, i);
        dest.writeString(this.d);
    }
}

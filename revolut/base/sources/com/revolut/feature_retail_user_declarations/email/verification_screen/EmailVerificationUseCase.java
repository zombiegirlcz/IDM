package com.revolut.feature_retail_user_declarations.email.verification_screen;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email/verification_screen/EmailVerificationUseCase;", "Landroid/os/Parcelable;", "", "Onboarding", "PostOnboarding", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmailVerificationUseCase implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EmailVerificationUseCase[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<EmailVerificationUseCase> CREATOR;
    public static final EmailVerificationUseCase Onboarding;
    public static final EmailVerificationUseCase PostOnboarding;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return EmailVerificationUseCase.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EmailVerificationUseCase[i];
        }
    }

    static {
        EmailVerificationUseCase emailVerificationUseCase = new EmailVerificationUseCase("Onboarding", 0);
        Onboarding = emailVerificationUseCase;
        EmailVerificationUseCase emailVerificationUseCase2 = new EmailVerificationUseCase("PostOnboarding", 1);
        PostOnboarding = emailVerificationUseCase2;
        EmailVerificationUseCase[] emailVerificationUseCaseArr = {emailVerificationUseCase, emailVerificationUseCase2};
        $VALUES = emailVerificationUseCaseArr;
        $ENTRIES = s.n(emailVerificationUseCaseArr);
        CREATOR = new a();
    }

    public static EmailVerificationUseCase valueOf(String str) {
        return (EmailVerificationUseCase) Enum.valueOf(EmailVerificationUseCase.class, str);
    }

    public static EmailVerificationUseCase[] values() {
        return (EmailVerificationUseCase[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}

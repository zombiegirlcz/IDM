package com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature_retail_user_declarations/email/pending_verification/cooldown_bottomsheet/EmailVerificationCooldownBottomSheetContract$InvocationSource", "Landroid/os/Parcelable;", "Email", "EmailVerification", "Lcom/revolut/feature_retail_user_declarations/email/pending_verification/cooldown_bottomsheet/EmailVerificationCooldownBottomSheetContract$InvocationSource$Email;", "Lcom/revolut/feature_retail_user_declarations/email/pending_verification/cooldown_bottomsheet/EmailVerificationCooldownBottomSheetContract$InvocationSource$EmailVerification;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EmailVerificationCooldownBottomSheetContract$InvocationSource extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email/pending_verification/cooldown_bottomsheet/EmailVerificationCooldownBottomSheetContract$InvocationSource$Email;", "Lcom/revolut/feature_retail_user_declarations/email/pending_verification/cooldown_bottomsheet/EmailVerificationCooldownBottomSheetContract$InvocationSource;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Email implements EmailVerificationCooldownBottomSheetContract$InvocationSource {

        @NotNull
        public static final Parcelable.Creator<Email> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f97579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f97580b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Email(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Email[i];
            }
        }

        public Email(String email, boolean z) {
            Intrinsics.checkNotNullParameter(email, "email");
            this.f97579a = email;
            this.f97580b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Email)) {
                return false;
            }
            Email email = (Email) obj2;
            return Intrinsics.f(this.f97579a, email.f97579a) && this.f97580b == email.f97580b;
        }

        @Override // com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet.EmailVerificationCooldownBottomSheetContract$InvocationSource
        /* JADX INFO: renamed from: getEmail, reason: from getter */
        public final String getF97581a() {
            return this.f97579a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f97580b) + (this.f97579a.hashCode() * 31);
        }

        @Override // com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet.EmailVerificationCooldownBottomSheetContract$InvocationSource
        /* JADX INFO: renamed from: w8, reason: from getter */
        public final boolean getF97582b() {
            return this.f97580b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97579a);
            dest.writeInt(this.f97580b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email/pending_verification/cooldown_bottomsheet/EmailVerificationCooldownBottomSheetContract$InvocationSource$EmailVerification;", "Lcom/revolut/feature_retail_user_declarations/email/pending_verification/cooldown_bottomsheet/EmailVerificationCooldownBottomSheetContract$InvocationSource;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmailVerification implements EmailVerificationCooldownBottomSheetContract$InvocationSource {

        @NotNull
        public static final Parcelable.Creator<EmailVerification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f97581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f97582b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EmailVerification(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmailVerification[i];
            }
        }

        public EmailVerification(String email, boolean z) {
            Intrinsics.checkNotNullParameter(email, "email");
            this.f97581a = email;
            this.f97582b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EmailVerification)) {
                return false;
            }
            EmailVerification emailVerification = (EmailVerification) obj2;
            return Intrinsics.f(this.f97581a, emailVerification.f97581a) && this.f97582b == emailVerification.f97582b;
        }

        @Override // com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet.EmailVerificationCooldownBottomSheetContract$InvocationSource
        /* JADX INFO: renamed from: getEmail, reason: from getter */
        public final String getF97581a() {
            return this.f97581a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f97582b) + (this.f97581a.hashCode() * 31);
        }

        @Override // com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet.EmailVerificationCooldownBottomSheetContract$InvocationSource
        /* JADX INFO: renamed from: w8, reason: from getter */
        public final boolean getF97582b() {
            return this.f97582b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97581a);
            dest.writeInt(this.f97582b ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: getEmail */
    String getF97581a();

    /* JADX INFO: renamed from: w8 */
    boolean getF97582b();
}

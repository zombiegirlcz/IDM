package com.revolut.feature_retail_user_declarations.email.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet.EmailVerificationCooldownBottomSheetContract$InvocationSource;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature_retail_user_declarations/email/flow/EmailFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Email", "EmailVerificationCooldown", "EmailVerificationScreen", "EmailVerificationOtp", "Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowContract$Step$Email;", "Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowContract$Step$EmailVerificationCooldown;", "Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowContract$Step$EmailVerificationOtp;", "Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowContract$Step$EmailVerificationScreen;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EmailFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowContract$Step$Email;", "Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Email implements EmailFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Email> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f97549a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Email(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Email[i];
            }
        }

        public Email(boolean z) {
            this.f97549a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Email) && this.f97549a == ((Email) obj2).f97549a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f97549a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f97549a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowContract$Step$EmailVerificationCooldown;", "Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmailVerificationCooldown implements EmailFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EmailVerificationCooldown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EmailVerificationCooldownBottomSheetContract$InvocationSource f97550a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EmailVerificationCooldown((EmailVerificationCooldownBottomSheetContract$InvocationSource) parcel.readParcelable(EmailVerificationCooldown.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmailVerificationCooldown[i];
            }
        }

        public EmailVerificationCooldown(EmailVerificationCooldownBottomSheetContract$InvocationSource invocationSource) {
            Intrinsics.checkNotNullParameter(invocationSource, "invocationSource");
            this.f97550a = invocationSource;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EmailVerificationCooldown) && Intrinsics.f(this.f97550a, ((EmailVerificationCooldown) obj2).f97550a);
        }

        public final int hashCode() {
            return this.f97550a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97550a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowContract$Step$EmailVerificationOtp;", "Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmailVerificationOtp implements EmailFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EmailVerificationOtp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f97551a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EmailVerificationOtp(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmailVerificationOtp[i];
            }
        }

        public EmailVerificationOtp(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            this.f97551a = email;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EmailVerificationOtp) && Intrinsics.f(this.f97551a, ((EmailVerificationOtp) obj2).f97551a);
        }

        public final int hashCode() {
            return this.f97551a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97551a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowContract$Step$EmailVerificationScreen;", "Lcom/revolut/feature_retail_user_declarations/email/flow/EmailFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmailVerificationScreen implements EmailFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EmailVerificationScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f97552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f97553b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EmailVerificationScreen(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmailVerificationScreen[i];
            }
        }

        public EmailVerificationScreen(String email, String str) {
            Intrinsics.checkNotNullParameter(email, "email");
            this.f97552a = email;
            this.f97553b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EmailVerificationScreen)) {
                return false;
            }
            EmailVerificationScreen emailVerificationScreen = (EmailVerificationScreen) obj2;
            return Intrinsics.f(this.f97552a, emailVerificationScreen.f97552a) && Intrinsics.f(this.f97553b, emailVerificationScreen.f97553b);
        }

        public final int hashCode() {
            int iHashCode = this.f97552a.hashCode() * 31;
            String str = this.f97553b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97552a);
            dest.writeString(this.f97553b);
        }
    }
}

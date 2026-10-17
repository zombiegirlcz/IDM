package com.revolut.feature_retail_user_declarations.email_verification.otp_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Onboarding", "PostOnboarding", "ChangeEmail", "Cooldown", "Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowContract$Step$ChangeEmail;", "Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowContract$Step$Cooldown;", "Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowContract$Step$Onboarding;", "Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowContract$Step$PostOnboarding;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EmailVerificationOtpFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowContract$Step$ChangeEmail;", "Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowContract$Step;", "<init>", "()V", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChangeEmail implements EmailVerificationOtpFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChangeEmail f97617a = new ChangeEmail();

        @NotNull
        public static final Parcelable.Creator<ChangeEmail> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChangeEmail.f97617a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeEmail[i];
            }
        }

        private ChangeEmail() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowContract$Step$Cooldown;", "Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cooldown implements EmailVerificationOtpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Cooldown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f97618a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cooldown(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cooldown[i];
            }
        }

        public Cooldown(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            this.f97618a = email;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Cooldown) && Intrinsics.f(this.f97618a, ((Cooldown) obj2).f97618a);
        }

        public final int hashCode() {
            return this.f97618a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97618a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowContract$Step$Onboarding;", "Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Onboarding implements EmailVerificationOtpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Onboarding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f97619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f97620b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Onboarding(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Onboarding[i];
            }
        }

        public Onboarding(String email, String str) {
            Intrinsics.checkNotNullParameter(email, "email");
            this.f97619a = email;
            this.f97620b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Onboarding)) {
                return false;
            }
            Onboarding onboarding = (Onboarding) obj2;
            return Intrinsics.f(this.f97619a, onboarding.f97619a) && Intrinsics.f(this.f97620b, onboarding.f97620b);
        }

        public final int hashCode() {
            int iHashCode = this.f97619a.hashCode() * 31;
            String str = this.f97620b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97619a);
            dest.writeString(this.f97620b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowContract$Step$PostOnboarding;", "Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PostOnboarding implements EmailVerificationOtpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PostOnboarding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f97621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f97622b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PostOnboarding(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PostOnboarding[i];
            }
        }

        public PostOnboarding(String email, String str) {
            Intrinsics.checkNotNullParameter(email, "email");
            this.f97621a = email;
            this.f97622b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PostOnboarding)) {
                return false;
            }
            PostOnboarding postOnboarding = (PostOnboarding) obj2;
            return Intrinsics.f(this.f97621a, postOnboarding.f97621a) && Intrinsics.f(this.f97622b, postOnboarding.f97622b);
        }

        public final int hashCode() {
            int iHashCode = this.f97621a.hashCode() * 31;
            String str = this.f97622b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97621a);
            dest.writeString(this.f97622b);
        }
    }
}

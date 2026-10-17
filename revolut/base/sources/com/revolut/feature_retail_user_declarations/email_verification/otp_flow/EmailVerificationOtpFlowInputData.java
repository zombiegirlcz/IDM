package com.revolut.feature_retail_user_declarations.email_verification.otp_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Origin", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmailVerificationOtpFlowInputData implements IOData$Input, Parcelable {

    @NotNull
    public static final Parcelable.Creator<EmailVerificationOtpFlowInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Origin f97624a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowInputData$Origin;", "Landroid/os/Parcelable;", "Onboarding", "PostOnboarding", "Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowInputData$Origin$Onboarding;", "Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowInputData$Origin$PostOnboarding;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Origin extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowInputData$Origin$Onboarding;", "Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowInputData$Origin;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Onboarding implements Origin {

            @NotNull
            public static final Parcelable.Creator<Onboarding> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f97625a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Onboarding(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Onboarding[i];
                }
            }

            public Onboarding(String email) {
                Intrinsics.checkNotNullParameter(email, "email");
                this.f97625a = email;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Onboarding) && Intrinsics.f(this.f97625a, ((Onboarding) obj2).f97625a);
            }

            public final int hashCode() {
                return this.f97625a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f97625a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowInputData$Origin$PostOnboarding;", "Lcom/revolut/feature_retail_user_declarations/email_verification/otp_flow/EmailVerificationOtpFlowInputData$Origin;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PostOnboarding implements Origin {

            @NotNull
            public static final Parcelable.Creator<PostOnboarding> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f97626a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PostOnboarding(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PostOnboarding[i];
                }
            }

            public PostOnboarding(String str) {
                this.f97626a = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof PostOnboarding) && Intrinsics.f(this.f97626a, ((PostOnboarding) obj2).f97626a);
            }

            public final int hashCode() {
                String str = this.f97626a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f97626a);
            }

            public PostOnboarding() {
                this(null);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EmailVerificationOtpFlowInputData((Origin) parcel.readParcelable(EmailVerificationOtpFlowInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EmailVerificationOtpFlowInputData[i];
        }
    }

    public EmailVerificationOtpFlowInputData(Origin origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f97624a = origin;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof EmailVerificationOtpFlowInputData) && Intrinsics.f(this.f97624a, ((EmailVerificationOtpFlowInputData) obj2).f97624a);
    }

    public final int hashCode() {
        return this.f97624a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f97624a, i);
    }
}

package com.revolut.feature.profile.impl.ui.details.email;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"com/revolut/feature/profile/impl/ui/details/email/VerifyEmailFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Email", "CheckEmail", "ConfirmationInProgress", "sma/c", "Lcom/revolut/feature/profile/impl/ui/details/email/VerifyEmailFlowContract$Step$CheckEmail;", "Lcom/revolut/feature/profile/impl/ui/details/email/VerifyEmailFlowContract$Step$ConfirmationInProgress;", "Lcom/revolut/feature/profile/impl/ui/details/email/VerifyEmailFlowContract$Step$Email;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class VerifyEmailFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/details/email/VerifyEmailFlowContract$Step$CheckEmail;", "Lcom/revolut/feature/profile/impl/ui/details/email/VerifyEmailFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CheckEmail extends VerifyEmailFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CheckEmail> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81379a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CheckEmail(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CheckEmail[i];
            }
        }

        public CheckEmail(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            this.f81379a = email;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CheckEmail) && Intrinsics.f(this.f81379a, ((CheckEmail) obj2).f81379a);
        }

        public final int hashCode() {
            return this.f81379a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81379a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/details/email/VerifyEmailFlowContract$Step$ConfirmationInProgress;", "Lcom/revolut/feature/profile/impl/ui/details/email/VerifyEmailFlowContract$Step;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ConfirmationInProgress extends VerifyEmailFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmationInProgress f81380a = new ConfirmationInProgress();

        @NotNull
        public static final Parcelable.Creator<ConfirmationInProgress> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ConfirmationInProgress.f81380a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmationInProgress[i];
            }
        }

        private ConfirmationInProgress() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/details/email/VerifyEmailFlowContract$Step$Email;", "Lcom/revolut/feature/profile/impl/ui/details/email/VerifyEmailFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Email extends VerifyEmailFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Email> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f81381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final sma.c f81383c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Email((wi0.b) parcel.readSerializable(), parcel.readString(), sma.c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Email[i];
            }
        }

        public Email(wi0.b country, String initialEmail, sma.c emailVerificationType) {
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(initialEmail, "initialEmail");
            Intrinsics.checkNotNullParameter(emailVerificationType, "emailVerificationType");
            this.f81381a = country;
            this.f81382b = initialEmail;
            this.f81383c = emailVerificationType;
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
            return Intrinsics.f(this.f81381a, email.f81381a) && Intrinsics.f(this.f81382b, email.f81382b) && this.f81383c == email.f81383c;
        }

        public final int hashCode() {
            return this.f81383c.hashCode() + p.a.c(this.f81381a.f297794a.hashCode() * 31, 31, this.f81382b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f81381a);
            dest.writeString(this.f81382b);
            dest.writeString(this.f81383c.name());
        }
    }

    private VerifyEmailFlowContract$Step() {
    }
}

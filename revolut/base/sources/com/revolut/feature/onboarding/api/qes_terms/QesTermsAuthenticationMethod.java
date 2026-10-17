package com.revolut.feature.onboarding.api.qes_terms;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.onboarding.api.qes_terms.QesTermsOtpChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/onboarding/api/qes_terms/QesTermsAuthenticationMethod;", "Landroid/os/Parcelable;", "<init>", "()V", "Otp", "Passcode", "Sso", "Lcom/revolut/feature/onboarding/api/qes_terms/QesTermsAuthenticationMethod$Otp;", "Lcom/revolut/feature/onboarding/api/qes_terms/QesTermsAuthenticationMethod$Passcode;", "Lcom/revolut/feature/onboarding/api/qes_terms/QesTermsAuthenticationMethod$Sso;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class QesTermsAuthenticationMethod implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/api/qes_terms/QesTermsAuthenticationMethod$Otp;", "Lcom/revolut/feature/onboarding/api/qes_terms/QesTermsAuthenticationMethod;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Otp extends QesTermsAuthenticationMethod {

        @NotNull
        public static final Parcelable.Creator<Otp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final QesTermsOtpChannel f78195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final QesTermsOtpChannel f78196b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Otp((QesTermsOtpChannel) parcel.readParcelable(Otp.class.getClassLoader()), (QesTermsOtpChannel) parcel.readParcelable(Otp.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Otp[i];
            }
        }

        public Otp() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Otp)) {
                return false;
            }
            Otp otp = (Otp) obj2;
            return Intrinsics.f(this.f78195a, otp.f78195a) && Intrinsics.f(this.f78196b, otp.f78196b);
        }

        public final int hashCode() {
            int iHashCode = this.f78195a.hashCode() * 31;
            QesTermsOtpChannel qesTermsOtpChannel = this.f78196b;
            return iHashCode + (qesTermsOtpChannel == null ? 0 : qesTermsOtpChannel.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f78195a, i);
            dest.writeParcelable(this.f78196b, i);
        }

        public Otp(QesTermsOtpChannel channel, QesTermsOtpChannel qesTermsOtpChannel) {
            Intrinsics.checkNotNullParameter(channel, "channel");
            this.f78195a = channel;
            this.f78196b = qesTermsOtpChannel;
        }

        public /* synthetic */ Otp(int i) {
            this(QesTermsOtpChannel.Sms.f78206a, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/api/qes_terms/QesTermsAuthenticationMethod$Passcode;", "Lcom/revolut/feature/onboarding/api/qes_terms/QesTermsAuthenticationMethod;", "<init>", "()V", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Passcode extends QesTermsAuthenticationMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Passcode f78197a = new Passcode();

        @NotNull
        public static final Parcelable.Creator<Passcode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Passcode.f78197a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Passcode[i];
            }
        }

        private Passcode() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/api/qes_terms/QesTermsAuthenticationMethod$Sso;", "Lcom/revolut/feature/onboarding/api/qes_terms/QesTermsAuthenticationMethod;", "<init>", "()V", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Sso extends QesTermsAuthenticationMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Sso f78198a = new Sso();

        @NotNull
        public static final Parcelable.Creator<Sso> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Sso.f78198a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Sso[i];
            }
        }

        private Sso() {
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

    private QesTermsAuthenticationMethod() {
    }
}

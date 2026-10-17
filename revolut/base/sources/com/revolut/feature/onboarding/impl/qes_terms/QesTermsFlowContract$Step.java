package com.revolut.feature.onboarding.impl.qes_terms;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreenContract$OtpChannelConfig;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureDetails;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/onboarding/impl/qes_terms/QesTermsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "QesTerms", "QesOtp", "Passcode", "AccountRecovery", "Lcom/revolut/feature/onboarding/impl/qes_terms/QesTermsFlowContract$Step$AccountRecovery;", "Lcom/revolut/feature/onboarding/impl/qes_terms/QesTermsFlowContract$Step$Passcode;", "Lcom/revolut/feature/onboarding/impl/qes_terms/QesTermsFlowContract$Step$QesOtp;", "Lcom/revolut/feature/onboarding/impl/qes_terms/QesTermsFlowContract$Step$QesTerms;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface QesTermsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/qes_terms/QesTermsFlowContract$Step$AccountRecovery;", "Lcom/revolut/feature/onboarding/impl/qes_terms/QesTermsFlowContract$Step;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AccountRecovery implements QesTermsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AccountRecovery f78541a = new AccountRecovery();

        @NotNull
        public static final Parcelable.Creator<AccountRecovery> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AccountRecovery.f78541a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountRecovery[i];
            }
        }

        private AccountRecovery() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/qes_terms/QesTermsFlowContract$Step$Passcode;", "Lcom/revolut/feature/onboarding/impl/qes_terms/QesTermsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Passcode implements QesTermsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Passcode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f78542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f78543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final rl0.d f78544c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Passcode(parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), rl0.d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Passcode[i];
            }
        }

        public Passcode(List termsToSignIds, Integer num, rl0.d authenticationType) {
            Intrinsics.checkNotNullParameter(termsToSignIds, "termsToSignIds");
            Intrinsics.checkNotNullParameter(authenticationType, "authenticationType");
            this.f78542a = termsToSignIds;
            this.f78543b = num;
            this.f78544c = authenticationType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Passcode)) {
                return false;
            }
            Passcode passcode = (Passcode) obj2;
            return Intrinsics.f(this.f78542a, passcode.f78542a) && Intrinsics.f(this.f78543b, passcode.f78543b) && this.f78544c == passcode.f78544c;
        }

        public final int hashCode() {
            int iHashCode = this.f78542a.hashCode() * 31;
            Integer num = this.f78543b;
            return this.f78544c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.f78542a);
            Integer num = this.f78543b;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            dest.writeString(this.f78544c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/qes_terms/QesTermsFlowContract$Step$QesOtp;", "Lcom/revolut/feature/onboarding/impl/qes_terms/QesTermsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QesOtp implements QesTermsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<QesOtp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ESignatureDetails f78546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ESignOtpScreenContract$OtpChannelConfig f78547c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QesOtp(parcel.readString(), (ESignatureDetails) parcel.readParcelable(QesOtp.class.getClassLoader()), (ESignOtpScreenContract$OtpChannelConfig) parcel.readParcelable(QesOtp.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QesOtp[i];
            }
        }

        public QesOtp(String phoneNumber, ESignatureDetails eSignatureDetails, ESignOtpScreenContract$OtpChannelConfig otpChannelConfig) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(eSignatureDetails, "eSignatureDetails");
            Intrinsics.checkNotNullParameter(otpChannelConfig, "otpChannelConfig");
            this.f78545a = phoneNumber;
            this.f78546b = eSignatureDetails;
            this.f78547c = otpChannelConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof QesOtp)) {
                return false;
            }
            QesOtp qesOtp = (QesOtp) obj2;
            return Intrinsics.f(this.f78545a, qesOtp.f78545a) && Intrinsics.f(this.f78546b, qesOtp.f78546b) && Intrinsics.f(this.f78547c, qesOtp.f78547c);
        }

        public final int hashCode() {
            return this.f78547c.hashCode() + ((this.f78546b.hashCode() + (this.f78545a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78545a);
            dest.writeParcelable(this.f78546b, i);
            dest.writeParcelable(this.f78547c, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/qes_terms/QesTermsFlowContract$Step$QesTerms;", "Lcom/revolut/feature/onboarding/impl/qes_terms/QesTermsFlowContract$Step;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class QesTerms implements QesTermsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final QesTerms f78548a = new QesTerms();

        @NotNull
        public static final Parcelable.Creator<QesTerms> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return QesTerms.f78548a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QesTerms[i];
            }
        }

        private QesTerms() {
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
}

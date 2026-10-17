package com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import po8.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/junior_settings/impl/ui_kompot/security_and_privacy/JuniorSecurityAndPrivacyControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "LogoutConfirmation", "PaymentsSettingsExplanatory", "PaymentLinksConsent", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/security_and_privacy/JuniorSecurityAndPrivacyControllerContract$ModalStep$LogoutConfirmation;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/security_and_privacy/JuniorSecurityAndPrivacyControllerContract$ModalStep$PaymentLinksConsent;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/security_and_privacy/JuniorSecurityAndPrivacyControllerContract$ModalStep$PaymentsSettingsExplanatory;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorSecurityAndPrivacyControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/security_and_privacy/JuniorSecurityAndPrivacyControllerContract$ModalStep$LogoutConfirmation;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/security_and_privacy/JuniorSecurityAndPrivacyControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LogoutConfirmation implements JuniorSecurityAndPrivacyControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LogoutConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JuniorBankingProfile f77326a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LogoutConfirmation((JuniorBankingProfile) parcel.readParcelable(LogoutConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LogoutConfirmation[i];
            }
        }

        public LogoutConfirmation(JuniorBankingProfile juniorProfile) {
            Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
            this.f77326a = juniorProfile;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LogoutConfirmation) && Intrinsics.f(this.f77326a, ((LogoutConfirmation) obj2).f77326a);
        }

        public final int hashCode() {
            return this.f77326a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77326a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/security_and_privacy/JuniorSecurityAndPrivacyControllerContract$ModalStep$PaymentLinksConsent;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/security_and_privacy/JuniorSecurityAndPrivacyControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentLinksConsent implements JuniorSecurityAndPrivacyControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PaymentLinksConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77328b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentLinksConsent(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentLinksConsent[i];
            }
        }

        public PaymentLinksConsent(String firstName, String username) {
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            Intrinsics.checkNotNullParameter(username, "username");
            this.f77327a = firstName;
            this.f77328b = username;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PaymentLinksConsent)) {
                return false;
            }
            PaymentLinksConsent paymentLinksConsent = (PaymentLinksConsent) obj2;
            return Intrinsics.f(this.f77327a, paymentLinksConsent.f77327a) && Intrinsics.f(this.f77328b, paymentLinksConsent.f77328b);
        }

        public final int hashCode() {
            return this.f77328b.hashCode() + (this.f77327a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77327a);
            dest.writeString(this.f77328b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/security_and_privacy/JuniorSecurityAndPrivacyControllerContract$ModalStep$PaymentsSettingsExplanatory;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/security_and_privacy/JuniorSecurityAndPrivacyControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentsSettingsExplanatory implements JuniorSecurityAndPrivacyControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PaymentsSettingsExplanatory> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f77329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f77331c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentsSettingsExplanatory(f.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentsSettingsExplanatory[i];
            }
        }

        public PaymentsSettingsExplanatory(f setting, String firstName, String username) {
            Intrinsics.checkNotNullParameter(setting, "setting");
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            Intrinsics.checkNotNullParameter(username, "username");
            this.f77329a = setting;
            this.f77330b = firstName;
            this.f77331c = username;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PaymentsSettingsExplanatory)) {
                return false;
            }
            PaymentsSettingsExplanatory paymentsSettingsExplanatory = (PaymentsSettingsExplanatory) obj2;
            return this.f77329a == paymentsSettingsExplanatory.f77329a && Intrinsics.f(this.f77330b, paymentsSettingsExplanatory.f77330b) && Intrinsics.f(this.f77331c, paymentsSettingsExplanatory.f77331c);
        }

        public final int hashCode() {
            return this.f77331c.hashCode() + p.a.c(this.f77329a.hashCode() * 31, 31, this.f77330b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77329a.name());
            dest.writeString(this.f77330b);
            dest.writeString(this.f77331c);
        }
    }
}

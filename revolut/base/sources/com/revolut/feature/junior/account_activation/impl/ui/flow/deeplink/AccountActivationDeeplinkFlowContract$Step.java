package com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/junior/account_activation/impl/ui/flow/deeplink/AccountActivationDeeplinkFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AccountApprovedAlready", "CompanyMismatch", "CountryMismatch", "Activation", "Lcom/revolut/feature/junior/account_activation/impl/ui/flow/deeplink/AccountActivationDeeplinkFlowContract$Step$AccountApprovedAlready;", "Lcom/revolut/feature/junior/account_activation/impl/ui/flow/deeplink/AccountActivationDeeplinkFlowContract$Step$Activation;", "Lcom/revolut/feature/junior/account_activation/impl/ui/flow/deeplink/AccountActivationDeeplinkFlowContract$Step$CompanyMismatch;", "Lcom/revolut/feature/junior/account_activation/impl/ui/flow/deeplink/AccountActivationDeeplinkFlowContract$Step$CountryMismatch;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AccountActivationDeeplinkFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/flow/deeplink/AccountActivationDeeplinkFlowContract$Step$AccountApprovedAlready;", "Lcom/revolut/feature/junior/account_activation/impl/ui/flow/deeplink/AccountActivationDeeplinkFlowContract$Step;", "<init>", "()V", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AccountApprovedAlready implements AccountActivationDeeplinkFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AccountApprovedAlready f76655a = new AccountApprovedAlready();

        @NotNull
        public static final Parcelable.Creator<AccountApprovedAlready> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AccountApprovedAlready.f76655a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountApprovedAlready[i];
            }
        }

        private AccountApprovedAlready() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/flow/deeplink/AccountActivationDeeplinkFlowContract$Step$Activation;", "Lcom/revolut/feature/junior/account_activation/impl/ui/flow/deeplink/AccountActivationDeeplinkFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Activation implements AccountActivationDeeplinkFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Activation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JuniorBankingProfile f76656a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Activation((JuniorBankingProfile) parcel.readParcelable(Activation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Activation[i];
            }
        }

        public Activation(JuniorBankingProfile juniorProfile) {
            Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
            this.f76656a = juniorProfile;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Activation) && Intrinsics.f(this.f76656a, ((Activation) obj2).f76656a);
        }

        public final int hashCode() {
            return this.f76656a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76656a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/flow/deeplink/AccountActivationDeeplinkFlowContract$Step$CompanyMismatch;", "Lcom/revolut/feature/junior/account_activation/impl/ui/flow/deeplink/AccountActivationDeeplinkFlowContract$Step;", "<init>", "()V", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CompanyMismatch implements AccountActivationDeeplinkFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CompanyMismatch f76657a = new CompanyMismatch();

        @NotNull
        public static final Parcelable.Creator<CompanyMismatch> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CompanyMismatch.f76657a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CompanyMismatch[i];
            }
        }

        private CompanyMismatch() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/flow/deeplink/AccountActivationDeeplinkFlowContract$Step$CountryMismatch;", "Lcom/revolut/feature/junior/account_activation/impl/ui/flow/deeplink/AccountActivationDeeplinkFlowContract$Step;", "<init>", "()V", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CountryMismatch implements AccountActivationDeeplinkFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CountryMismatch f76658a = new CountryMismatch();

        @NotNull
        public static final Parcelable.Creator<CountryMismatch> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CountryMismatch.f76658a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountryMismatch[i];
            }
        }

        private CountryMismatch() {
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

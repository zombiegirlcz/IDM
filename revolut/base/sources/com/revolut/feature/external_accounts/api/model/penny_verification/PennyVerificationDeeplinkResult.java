package com.revolut.feature.external_accounts.api.model.penny_verification;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/api/model/penny_verification/PennyVerificationDeeplinkResult;", "Landroid/os/Parcelable;", "PaymentInitiationServiceCompleted", "AccountInformationServiceCompleted", "PaymentInitiationServiceFailed", "AccountInformationServiceFailed", "Lcom/revolut/feature/external_accounts/api/model/penny_verification/PennyVerificationDeeplinkResult$AccountInformationServiceCompleted;", "Lcom/revolut/feature/external_accounts/api/model/penny_verification/PennyVerificationDeeplinkResult$AccountInformationServiceFailed;", "Lcom/revolut/feature/external_accounts/api/model/penny_verification/PennyVerificationDeeplinkResult$PaymentInitiationServiceCompleted;", "Lcom/revolut/feature/external_accounts/api/model/penny_verification/PennyVerificationDeeplinkResult$PaymentInitiationServiceFailed;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PennyVerificationDeeplinkResult extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/model/penny_verification/PennyVerificationDeeplinkResult$AccountInformationServiceCompleted;", "Lcom/revolut/feature/external_accounts/api/model/penny_verification/PennyVerificationDeeplinkResult;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountInformationServiceCompleted implements PennyVerificationDeeplinkResult {

        @NotNull
        public static final Parcelable.Creator<AccountInformationServiceCompleted> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72240b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountInformationServiceCompleted(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountInformationServiceCompleted[i];
            }
        }

        public AccountInformationServiceCompleted(String institutionId, String consentId) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            this.f72239a = institutionId;
            this.f72240b = consentId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccountInformationServiceCompleted)) {
                return false;
            }
            AccountInformationServiceCompleted accountInformationServiceCompleted = (AccountInformationServiceCompleted) obj2;
            return Intrinsics.f(this.f72239a, accountInformationServiceCompleted.f72239a) && Intrinsics.f(this.f72240b, accountInformationServiceCompleted.f72240b);
        }

        public final int hashCode() {
            return this.f72240b.hashCode() + (this.f72239a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72239a);
            dest.writeString(this.f72240b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/model/penny_verification/PennyVerificationDeeplinkResult$AccountInformationServiceFailed;", "Lcom/revolut/feature/external_accounts/api/model/penny_verification/PennyVerificationDeeplinkResult;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountInformationServiceFailed implements PennyVerificationDeeplinkResult {

        @NotNull
        public static final Parcelable.Creator<AccountInformationServiceFailed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72241a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountInformationServiceFailed(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountInformationServiceFailed[i];
            }
        }

        public AccountInformationServiceFailed(String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f72241a = deeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountInformationServiceFailed) && Intrinsics.f(this.f72241a, ((AccountInformationServiceFailed) obj2).f72241a);
        }

        public final int hashCode() {
            return this.f72241a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72241a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/model/penny_verification/PennyVerificationDeeplinkResult$PaymentInitiationServiceCompleted;", "Lcom/revolut/feature/external_accounts/api/model/penny_verification/PennyVerificationDeeplinkResult;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentInitiationServiceCompleted implements PennyVerificationDeeplinkResult {

        @NotNull
        public static final Parcelable.Creator<PaymentInitiationServiceCompleted> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72243b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentInitiationServiceCompleted(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentInitiationServiceCompleted[i];
            }
        }

        public PaymentInitiationServiceCompleted(String institutionId, String paymentId) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            this.f72242a = institutionId;
            this.f72243b = paymentId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PaymentInitiationServiceCompleted)) {
                return false;
            }
            PaymentInitiationServiceCompleted paymentInitiationServiceCompleted = (PaymentInitiationServiceCompleted) obj2;
            return Intrinsics.f(this.f72242a, paymentInitiationServiceCompleted.f72242a) && Intrinsics.f(this.f72243b, paymentInitiationServiceCompleted.f72243b);
        }

        public final int hashCode() {
            return this.f72243b.hashCode() + (this.f72242a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72242a);
            dest.writeString(this.f72243b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/api/model/penny_verification/PennyVerificationDeeplinkResult$PaymentInitiationServiceFailed;", "Lcom/revolut/feature/external_accounts/api/model/penny_verification/PennyVerificationDeeplinkResult;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentInitiationServiceFailed implements PennyVerificationDeeplinkResult {

        @NotNull
        public static final Parcelable.Creator<PaymentInitiationServiceFailed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72244a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentInitiationServiceFailed(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentInitiationServiceFailed[i];
            }
        }

        public PaymentInitiationServiceFailed(String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f72244a = deeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PaymentInitiationServiceFailed) && Intrinsics.f(this.f72244a, ((PaymentInitiationServiceFailed) obj2).f72244a);
        }

        public final int hashCode() {
            return this.f72244a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72244a);
        }
    }
}

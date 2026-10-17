package com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.tracking.ConsentLimitInputTrackableContext;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/brazil/payment_confirmation/OpenBankingBrPaymentsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PaymentAuthorization", "PaymentNotificationsInfo", "ManualReturnToClient", "LimitUpdate", "ExpiryDateUpdate", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/payment_confirmation/OpenBankingBrPaymentsFlowContract$Step$ExpiryDateUpdate;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/payment_confirmation/OpenBankingBrPaymentsFlowContract$Step$LimitUpdate;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/payment_confirmation/OpenBankingBrPaymentsFlowContract$Step$ManualReturnToClient;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/payment_confirmation/OpenBankingBrPaymentsFlowContract$Step$PaymentAuthorization;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/payment_confirmation/OpenBankingBrPaymentsFlowContract$Step$PaymentNotificationsInfo;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OpenBankingBrPaymentsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/payment_confirmation/OpenBankingBrPaymentsFlowContract$Step$ExpiryDateUpdate;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/payment_confirmation/OpenBankingBrPaymentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExpiryDateUpdate extends OpenBankingBrPaymentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ExpiryDateUpdate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f72694b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExpiryDateUpdate(parcel.readString(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExpiryDateUpdate[i];
            }
        }

        public ExpiryDateUpdate(String fieldId, LocalDate localDate) {
            Intrinsics.checkNotNullParameter(fieldId, "fieldId");
            this.f72693a = fieldId;
            this.f72694b = localDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExpiryDateUpdate)) {
                return false;
            }
            ExpiryDateUpdate expiryDateUpdate = (ExpiryDateUpdate) obj2;
            return Intrinsics.f(this.f72693a, expiryDateUpdate.f72693a) && Intrinsics.f(this.f72694b, expiryDateUpdate.f72694b);
        }

        public final int hashCode() {
            int iHashCode = this.f72693a.hashCode() * 31;
            LocalDate localDate = this.f72694b;
            return iHashCode + (localDate == null ? 0 : localDate.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72693a);
            dest.writeSerializable(this.f72694b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/payment_confirmation/OpenBankingBrPaymentsFlowContract$Step$LimitUpdate;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/payment_confirmation/OpenBankingBrPaymentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitUpdate extends OpenBankingBrPaymentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LimitUpdate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LimitConfig f72696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ConsentLimitInputTrackableContext f72697c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LimitUpdate(parcel.readString(), (LimitConfig) parcel.readParcelable(LimitUpdate.class.getClassLoader()), (ConsentLimitInputTrackableContext) parcel.readParcelable(LimitUpdate.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitUpdate[i];
            }
        }

        public LimitUpdate(String fieldId, LimitConfig limitConfig, ConsentLimitInputTrackableContext trackableContext) {
            Intrinsics.checkNotNullParameter(fieldId, "fieldId");
            Intrinsics.checkNotNullParameter(limitConfig, "limitConfig");
            Intrinsics.checkNotNullParameter(trackableContext, "trackableContext");
            this.f72695a = fieldId;
            this.f72696b = limitConfig;
            this.f72697c = trackableContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LimitUpdate)) {
                return false;
            }
            LimitUpdate limitUpdate = (LimitUpdate) obj2;
            return Intrinsics.f(this.f72695a, limitUpdate.f72695a) && Intrinsics.f(this.f72696b, limitUpdate.f72696b) && Intrinsics.f(this.f72697c, limitUpdate.f72697c);
        }

        public final int hashCode() {
            return this.f72697c.hashCode() + ((this.f72696b.hashCode() + (this.f72695a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72695a);
            dest.writeParcelable(this.f72696b, i);
            dest.writeParcelable(this.f72697c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/payment_confirmation/OpenBankingBrPaymentsFlowContract$Step$ManualReturnToClient;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/payment_confirmation/OpenBankingBrPaymentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ManualReturnToClient extends OpenBankingBrPaymentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ManualReturnToClient> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72698a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ManualReturnToClient(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManualReturnToClient[i];
            }
        }

        public ManualReturnToClient(String clientName) {
            Intrinsics.checkNotNullParameter(clientName, "clientName");
            this.f72698a = clientName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ManualReturnToClient) && Intrinsics.f(this.f72698a, ((ManualReturnToClient) obj2).f72698a);
        }

        public final int hashCode() {
            return this.f72698a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72698a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/payment_confirmation/OpenBankingBrPaymentsFlowContract$Step$PaymentAuthorization;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/payment_confirmation/OpenBankingBrPaymentsFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaymentAuthorization extends OpenBankingBrPaymentsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PaymentAuthorization f72699a = new PaymentAuthorization();

        @NotNull
        public static final Parcelable.Creator<PaymentAuthorization> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PaymentAuthorization.f72699a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentAuthorization[i];
            }
        }

        private PaymentAuthorization() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/payment_confirmation/OpenBankingBrPaymentsFlowContract$Step$PaymentNotificationsInfo;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/payment_confirmation/OpenBankingBrPaymentsFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaymentNotificationsInfo extends OpenBankingBrPaymentsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PaymentNotificationsInfo f72700a = new PaymentNotificationsInfo();

        @NotNull
        public static final Parcelable.Creator<PaymentNotificationsInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PaymentNotificationsInfo.f72700a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentNotificationsInfo[i];
            }
        }

        private PaymentNotificationsInfo() {
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

    private OpenBankingBrPaymentsFlowContract$Step() {
    }
}

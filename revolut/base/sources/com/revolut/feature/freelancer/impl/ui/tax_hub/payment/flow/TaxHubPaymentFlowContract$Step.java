package com.revolut.feature.freelancer.impl.ui.tax_hub.payment.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import ds6.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/tax_hub/payment/flow/TaxHubPaymentFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AccountDetails", "Assessment", "BankTransfer", "BeneficiaryCreation", "TaxTypePicker", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/flow/TaxHubPaymentFlowContract$Step$AccountDetails;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/flow/TaxHubPaymentFlowContract$Step$Assessment;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/flow/TaxHubPaymentFlowContract$Step$BankTransfer;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/flow/TaxHubPaymentFlowContract$Step$BeneficiaryCreation;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/flow/TaxHubPaymentFlowContract$Step$TaxTypePicker;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TaxHubPaymentFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/flow/TaxHubPaymentFlowContract$Step$AccountDetails;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/flow/TaxHubPaymentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountDetails implements TaxHubPaymentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AccountDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io3.d f74316a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountDetails((io3.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountDetails[i];
            }
        }

        public AccountDetails(io3.d pocket) {
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            this.f74316a = pocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountDetails) && Intrinsics.f(this.f74316a, ((AccountDetails) obj2).f74316a);
        }

        public final int hashCode() {
            return this.f74316a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f74316a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/flow/TaxHubPaymentFlowContract$Step$Assessment;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/flow/TaxHubPaymentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Assessment implements TaxHubPaymentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Assessment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f74317a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Assessment(j.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Assessment[i];
            }
        }

        public Assessment(j taxType) {
            Intrinsics.checkNotNullParameter(taxType, "taxType");
            this.f74317a = taxType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Assessment) && this.f74317a == ((Assessment) obj2).f74317a;
        }

        public final int hashCode() {
            return this.f74317a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f74317a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/flow/TaxHubPaymentFlowContract$Step$BankTransfer;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/flow/TaxHubPaymentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BankTransfer implements TaxHubPaymentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BankTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5j.a f74318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TaxHubPaymentFlowContract$PocketInfo f74319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f74320c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BankTransfer((f5j.a) parcel.readSerializable(), TaxHubPaymentFlowContract$PocketInfo.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankTransfer[i];
            }
        }

        public BankTransfer(f5j.a beneficiary, TaxHubPaymentFlowContract$PocketInfo pocketInfo, String str) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            Intrinsics.checkNotNullParameter(pocketInfo, "pocketInfo");
            this.f74318a = beneficiary;
            this.f74319b = pocketInfo;
            this.f74320c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BankTransfer)) {
                return false;
            }
            BankTransfer bankTransfer = (BankTransfer) obj2;
            return Intrinsics.f(this.f74318a, bankTransfer.f74318a) && Intrinsics.f(this.f74319b, bankTransfer.f74319b) && Intrinsics.f(this.f74320c, bankTransfer.f74320c);
        }

        public final int hashCode() {
            int iHashCode = (this.f74319b.hashCode() + (this.f74318a.hashCode() * 31)) * 31;
            String str = this.f74320c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f74318a);
            this.f74319b.writeToParcel(dest, i);
            dest.writeString(this.f74320c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/flow/TaxHubPaymentFlowContract$Step$BeneficiaryCreation;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/flow/TaxHubPaymentFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BeneficiaryCreation implements TaxHubPaymentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BeneficiaryCreation f74321a = new BeneficiaryCreation();

        @NotNull
        public static final Parcelable.Creator<BeneficiaryCreation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BeneficiaryCreation.f74321a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BeneficiaryCreation[i];
            }
        }

        private BeneficiaryCreation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/flow/TaxHubPaymentFlowContract$Step$TaxTypePicker;", "Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/flow/TaxHubPaymentFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TaxTypePicker implements TaxHubPaymentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TaxTypePicker f74322a = new TaxTypePicker();

        @NotNull
        public static final Parcelable.Creator<TaxTypePicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TaxTypePicker.f74322a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxTypePicker[i];
            }
        }

        private TaxTypePicker() {
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

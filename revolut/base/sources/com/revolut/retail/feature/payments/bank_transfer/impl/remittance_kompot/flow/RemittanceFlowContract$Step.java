package com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreenContract$InputData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerReviewScreenInputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Destination", "Amount", "Recipient", "New", "AdditionalInfo", "ReviewBank", "ReviewCard", "ReviewInternal", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step$AdditionalInfo;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step$Amount;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step$Destination;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step$New;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step$Recipient;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step$ReviewBank;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step$ReviewCard;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step$ReviewInternal;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RemittanceFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step$AdditionalInfo;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalInfo implements RemittanceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AdditionalInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final krf.b f102034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f5j.a f102035b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdditionalInfo((krf.b) parcel.readSerializable(), (f5j.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalInfo[i];
            }
        }

        public AdditionalInfo(krf.b inputConfig, f5j.a recipient) {
            Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            this.f102034a = inputConfig;
            this.f102035b = recipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AdditionalInfo)) {
                return false;
            }
            AdditionalInfo additionalInfo = (AdditionalInfo) obj2;
            return Intrinsics.f(this.f102034a, additionalInfo.f102034a) && Intrinsics.f(this.f102035b, additionalInfo.f102035b);
        }

        public final int hashCode() {
            return this.f102035b.hashCode() + (this.f102034a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f102034a);
            dest.writeSerializable(this.f102035b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step$Amount;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Amount implements RemittanceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Amount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RemittanceAmountScreenContract$InputData f102036a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Amount((RemittanceAmountScreenContract$InputData) parcel.readParcelable(Amount.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Amount[i];
            }
        }

        public Amount(RemittanceAmountScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f102036a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Amount) && Intrinsics.f(this.f102036a, ((Amount) obj2).f102036a);
        }

        public final int hashCode() {
            return this.f102036a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102036a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step$Destination;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step;", "<init>", "()V", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Destination implements RemittanceFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Destination f102037a = new Destination();

        @NotNull
        public static final Parcelable.Creator<Destination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Destination.f102037a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Destination[i];
            }
        }

        private Destination() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step$New;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step;", "<init>", "()V", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class New implements RemittanceFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final New f102038a = new New();

        @NotNull
        public static final Parcelable.Creator<New> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return New.f102038a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new New[i];
            }
        }

        private New() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step$Recipient;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step;", "<init>", "()V", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Recipient implements RemittanceFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Recipient f102039a = new Recipient();

        @NotNull
        public static final Parcelable.Creator<Recipient> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Recipient.f102039a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Recipient[i];
            }
        }

        private Recipient() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step$ReviewBank;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewBank implements RemittanceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReviewBank> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5j.a f102040a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReviewBank((f5j.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewBank[i];
            }
        }

        public ReviewBank(f5j.a recipient) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            this.f102040a = recipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReviewBank) && Intrinsics.f(this.f102040a, ((ReviewBank) obj2).f102040a);
        }

        public final int hashCode() {
            return this.f102040a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f102040a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step$ReviewCard;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewCard implements RemittanceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReviewCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardOwner f102041a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReviewCard((CardOwner) parcel.readParcelable(ReviewCard.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewCard[i];
            }
        }

        public ReviewCard(CardOwner recipient) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            this.f102041a = recipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReviewCard) && Intrinsics.f(this.f102041a, ((ReviewCard) obj2).f102041a);
        }

        public final int hashCode() {
            return this.f102041a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102041a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step$ReviewInternal;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewInternal implements RemittanceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReviewInternal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PeerToPeerReviewScreenInputData f102042a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReviewInternal((PeerToPeerReviewScreenInputData) parcel.readParcelable(ReviewInternal.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewInternal[i];
            }
        }

        public ReviewInternal(PeerToPeerReviewScreenInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f102042a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReviewInternal) && Intrinsics.f(this.f102042a, ((ReviewInternal) obj2).f102042a);
        }

        public final int hashCode() {
            return this.f102042a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102042a, i);
        }
    }
}

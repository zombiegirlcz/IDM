package com.revolut.feature.revolutpay.shared.ui.pay_with_any;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.CardPaymentAvailability;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PayWithAnyFundingOptions;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/revolutpay/shared/ui/pay_with_any/PayWithAnyContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AddCard", "ConfirmDeleteCard", "CardOptions", "InsufficientFundsOptions", "PayWithAnyFullList", "Lcom/revolut/feature/revolutpay/shared/ui/pay_with_any/PayWithAnyContract$ModalStep$AddCard;", "Lcom/revolut/feature/revolutpay/shared/ui/pay_with_any/PayWithAnyContract$ModalStep$CardOptions;", "Lcom/revolut/feature/revolutpay/shared/ui/pay_with_any/PayWithAnyContract$ModalStep$ConfirmDeleteCard;", "Lcom/revolut/feature/revolutpay/shared/ui/pay_with_any/PayWithAnyContract$ModalStep$InsufficientFundsOptions;", "Lcom/revolut/feature/revolutpay/shared/ui/pay_with_any/PayWithAnyContract$ModalStep$PayWithAnyFullList;", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PayWithAnyContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/shared/ui/pay_with_any/PayWithAnyContract$ModalStep$AddCard;", "Lcom/revolut/feature/revolutpay/shared/ui/pay_with_any/PayWithAnyContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddCard implements PayWithAnyContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AddCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CardPaymentAvailability f84719b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddCard(parcel.readString(), (CardPaymentAvailability) parcel.readParcelable(AddCard.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddCard[i];
            }
        }

        public AddCard(String str, CardPaymentAvailability cardPaymentAvailability) {
            Intrinsics.checkNotNullParameter(cardPaymentAvailability, "cardPaymentAvailability");
            this.f84718a = str;
            this.f84719b = cardPaymentAvailability;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddCard)) {
                return false;
            }
            AddCard addCard = (AddCard) obj2;
            return Intrinsics.f(this.f84718a, addCard.f84718a) && Intrinsics.f(this.f84719b, addCard.f84719b);
        }

        public final int hashCode() {
            String str = this.f84718a;
            return this.f84719b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84718a);
            dest.writeParcelable(this.f84719b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/shared/ui/pay_with_any/PayWithAnyContract$ModalStep$CardOptions;", "Lcom/revolut/feature/revolutpay/shared/ui/pay_with_any/PayWithAnyContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardOptions implements PayWithAnyContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CardOptions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84720a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardOptions(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardOptions[i];
            }
        }

        public CardOptions(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f84720a = cardId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CardOptions) && Intrinsics.f(this.f84720a, ((CardOptions) obj2).f84720a);
        }

        public final int hashCode() {
            return this.f84720a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84720a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/shared/ui/pay_with_any/PayWithAnyContract$ModalStep$ConfirmDeleteCard;", "Lcom/revolut/feature/revolutpay/shared/ui/pay_with_any/PayWithAnyContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmDeleteCard implements PayWithAnyContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ConfirmDeleteCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84721a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfirmDeleteCard(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmDeleteCard[i];
            }
        }

        public ConfirmDeleteCard(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f84721a = cardId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConfirmDeleteCard) && Intrinsics.f(this.f84721a, ((ConfirmDeleteCard) obj2).f84721a);
        }

        public final int hashCode() {
            return this.f84721a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84721a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/shared/ui/pay_with_any/PayWithAnyContract$ModalStep$InsufficientFundsOptions;", "Lcom/revolut/feature/revolutpay/shared/ui/pay_with_any/PayWithAnyContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InsufficientFundsOptions implements PayWithAnyContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<InsufficientFundsOptions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PayWithAnyFundingOptions f84722a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InsufficientFundsOptions((PayWithAnyFundingOptions) parcel.readParcelable(InsufficientFundsOptions.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InsufficientFundsOptions[i];
            }
        }

        public InsufficientFundsOptions(PayWithAnyFundingOptions fundingOptions) {
            Intrinsics.checkNotNullParameter(fundingOptions, "fundingOptions");
            this.f84722a = fundingOptions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InsufficientFundsOptions) && Intrinsics.f(this.f84722a, ((InsufficientFundsOptions) obj2).f84722a);
        }

        public final int hashCode() {
            return this.f84722a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84722a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/shared/ui/pay_with_any/PayWithAnyContract$ModalStep$PayWithAnyFullList;", "Lcom/revolut/feature/revolutpay/shared/ui/pay_with_any/PayWithAnyContract$ModalStep;", "<init>", "()V", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PayWithAnyFullList implements PayWithAnyContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PayWithAnyFullList f84723a = new PayWithAnyFullList();

        @NotNull
        public static final Parcelable.Creator<PayWithAnyFullList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PayWithAnyFullList.f84723a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayWithAnyFullList[i];
            }
        }

        private PayWithAnyFullList() {
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

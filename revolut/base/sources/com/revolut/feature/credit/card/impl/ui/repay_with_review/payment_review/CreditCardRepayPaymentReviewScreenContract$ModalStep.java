package com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/card/impl/ui/repay_with_review/payment_review/CreditCardRepayPaymentReviewScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "BalancePicker", "ExchangedAmount", "Lcom/revolut/feature/credit/card/impl/ui/repay_with_review/payment_review/CreditCardRepayPaymentReviewScreenContract$ModalStep$BalancePicker;", "Lcom/revolut/feature/credit/card/impl/ui/repay_with_review/payment_review/CreditCardRepayPaymentReviewScreenContract$ModalStep$ExchangedAmount;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardRepayPaymentReviewScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay_with_review/payment_review/CreditCardRepayPaymentReviewScreenContract$ModalStep$BalancePicker;", "Lcom/revolut/feature/credit/card/impl/ui/repay_with_review/payment_review/CreditCardRepayPaymentReviewScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BalancePicker extends CreditCardRepayPaymentReviewScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BalancePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BalanceSelector$InputData f69616a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BalancePicker((BalanceSelector$InputData) parcel.readParcelable(BalancePicker.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BalancePicker[i];
            }
        }

        public BalancePicker(BalanceSelector$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f69616a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BalancePicker) && Intrinsics.f(this.f69616a, ((BalancePicker) obj2).f69616a);
        }

        public final int hashCode() {
            return this.f69616a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69616a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay_with_review/payment_review/CreditCardRepayPaymentReviewScreenContract$ModalStep$ExchangedAmount;", "Lcom/revolut/feature/credit/card/impl/ui/repay_with_review/payment_review/CreditCardRepayPaymentReviewScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExchangedAmount extends CreditCardRepayPaymentReviewScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ExchangedAmount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData f69617a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExchangedAmount(CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExchangedAmount[i];
            }
        }

        public ExchangedAmount(CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData exchangeQuote) {
            Intrinsics.checkNotNullParameter(exchangeQuote, "exchangeQuote");
            this.f69617a = exchangeQuote;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExchangedAmount) && Intrinsics.f(this.f69617a, ((ExchangedAmount) obj2).f69617a);
        }

        public final int hashCode() {
            return this.f69617a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f69617a.writeToParcel(dest, i);
        }
    }

    private CreditCardRepayPaymentReviewScreenContract$ModalStep() {
    }
}

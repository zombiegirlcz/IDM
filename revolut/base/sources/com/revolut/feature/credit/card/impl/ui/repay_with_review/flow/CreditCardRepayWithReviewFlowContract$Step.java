package com.revolut.feature.credit.card.impl.ui.repay_with_review.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/card/impl/ui/repay_with_review/flow/CreditCardRepayWithReviewFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PaymentAmount", "PaymentReview", "Lcom/revolut/feature/credit/card/impl/ui/repay_with_review/flow/CreditCardRepayWithReviewFlowContract$Step$PaymentAmount;", "Lcom/revolut/feature/credit/card/impl/ui/repay_with_review/flow/CreditCardRepayWithReviewFlowContract$Step$PaymentReview;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardRepayWithReviewFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay_with_review/flow/CreditCardRepayWithReviewFlowContract$Step$PaymentAmount;", "Lcom/revolut/feature/credit/card/impl/ui/repay_with_review/flow/CreditCardRepayWithReviewFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaymentAmount extends CreditCardRepayWithReviewFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PaymentAmount f69605a = new PaymentAmount();

        @NotNull
        public static final Parcelable.Creator<PaymentAmount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PaymentAmount.f69605a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentAmount[i];
            }
        }

        private PaymentAmount() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay_with_review/flow/CreditCardRepayWithReviewFlowContract$Step$PaymentReview;", "Lcom/revolut/feature/credit/card/impl/ui/repay_with_review/flow/CreditCardRepayWithReviewFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentReview extends CreditCardRepayWithReviewFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PaymentReview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f69606a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentReview((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentReview[i];
            }
        }

        public PaymentReview(d amount) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.f69606a = amount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PaymentReview) && Intrinsics.f(this.f69606a, ((PaymentReview) obj2).f69606a);
        }

        public final int hashCode() {
            return this.f69606a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69606a);
        }
    }

    private CreditCardRepayWithReviewFlowContract$Step() {
    }
}

package com.revolut.feature.credit.card.impl.ui.instalment.repay.future_instalments;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardFutureInstalmentQuote;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/repay/future_instalments/CreditCardRepayFutureInstalmentsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ChooseFutureInstalments", "PaymentDetails", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/future_instalments/CreditCardRepayFutureInstalmentsFlowContract$Step$ChooseFutureInstalments;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/future_instalments/CreditCardRepayFutureInstalmentsFlowContract$Step$PaymentDetails;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardRepayFutureInstalmentsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/future_instalments/CreditCardRepayFutureInstalmentsFlowContract$Step$ChooseFutureInstalments;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/future_instalments/CreditCardRepayFutureInstalmentsFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChooseFutureInstalments extends CreditCardRepayFutureInstalmentsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChooseFutureInstalments f69506a = new ChooseFutureInstalments();

        @NotNull
        public static final Parcelable.Creator<ChooseFutureInstalments> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChooseFutureInstalments.f69506a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChooseFutureInstalments[i];
            }
        }

        private ChooseFutureInstalments() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/future_instalments/CreditCardRepayFutureInstalmentsFlowContract$Step$PaymentDetails;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/future_instalments/CreditCardRepayFutureInstalmentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentDetails extends CreditCardRepayFutureInstalmentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PaymentDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardFutureInstalmentQuote f69507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f69508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f69509c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentDetails((CreditCardFutureInstalmentQuote) parcel.readParcelable(PaymentDetails.class.getClassLoader()), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentDetails[i];
            }
        }

        public PaymentDetails(CreditCardFutureInstalmentQuote quote, LocalDate nextMaturingDate, LocalDate previousLastMaturingDate) {
            Intrinsics.checkNotNullParameter(quote, "quote");
            Intrinsics.checkNotNullParameter(nextMaturingDate, "nextMaturingDate");
            Intrinsics.checkNotNullParameter(previousLastMaturingDate, "previousLastMaturingDate");
            this.f69507a = quote;
            this.f69508b = nextMaturingDate;
            this.f69509c = previousLastMaturingDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PaymentDetails)) {
                return false;
            }
            PaymentDetails paymentDetails = (PaymentDetails) obj2;
            return Intrinsics.f(this.f69507a, paymentDetails.f69507a) && Intrinsics.f(this.f69508b, paymentDetails.f69508b) && Intrinsics.f(this.f69509c, paymentDetails.f69509c);
        }

        public final int hashCode() {
            return this.f69509c.hashCode() + y.a(this.f69507a.hashCode() * 31, 31, this.f69508b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69507a, i);
            dest.writeSerializable(this.f69508b);
            dest.writeSerializable(this.f69509c);
        }
    }

    private CreditCardRepayFutureInstalmentsFlowContract$Step() {
    }
}

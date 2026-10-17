package com.revolut.feature.apm.bills.bpay.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.bpay.impl.screen.amount.AmountScreenContract$InputData;
import com.revolut.feature.apm.bills.bpay.impl.screen.review.review.BPayReviewScreenContract$InputData;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/apm/bills/bpay/impl/flow/BPayFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Input", "Amount", "Review", "TransferBreakdown", "Lcom/revolut/feature/apm/bills/bpay/impl/flow/BPayFlowContract$Step$Amount;", "Lcom/revolut/feature/apm/bills/bpay/impl/flow/BPayFlowContract$Step$Input;", "Lcom/revolut/feature/apm/bills/bpay/impl/flow/BPayFlowContract$Step$Review;", "Lcom/revolut/feature/apm/bills/bpay/impl/flow/BPayFlowContract$Step$TransferBreakdown;", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BPayFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/bpay/impl/flow/BPayFlowContract$Step$Amount;", "Lcom/revolut/feature/apm/bills/bpay/impl/flow/BPayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Amount extends BPayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Amount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AmountScreenContract$InputData f61195a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Amount(AmountScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Amount[i];
            }
        }

        public Amount(AmountScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f61195a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Amount) && Intrinsics.f(this.f61195a, ((Amount) obj2).f61195a);
        }

        public final int hashCode() {
            return this.f61195a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f61195a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/bills/bpay/impl/flow/BPayFlowContract$Step$Input;", "Lcom/revolut/feature/apm/bills/bpay/impl/flow/BPayFlowContract$Step;", "<init>", "()V", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Input extends BPayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Input f61196a = new Input();

        @NotNull
        public static final Parcelable.Creator<Input> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Input.f61196a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Input[i];
            }
        }

        private Input() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/bpay/impl/flow/BPayFlowContract$Step$Review;", "Lcom/revolut/feature/apm/bills/bpay/impl/flow/BPayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review extends BPayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BPayReviewScreenContract$InputData f61197a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Review(BPayReviewScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(BPayReviewScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f61197a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Review) && Intrinsics.f(this.f61197a, ((Review) obj2).f61197a);
        }

        public final int hashCode() {
            return this.f61197a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f61197a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/bpay/impl/flow/BPayFlowContract$Step$TransferBreakdown;", "Lcom/revolut/feature/apm/bills/bpay/impl/flow/BPayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransferBreakdown extends BPayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TransferBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n9l.a f61198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ApmQuote f61199b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransferBreakdown((ApmQuote) parcel.readParcelable(TransferBreakdown.class.getClassLoader()), (n9l.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransferBreakdown[i];
            }
        }

        public TransferBreakdown(ApmQuote apmQuote, n9l.a exchangeRate) {
            Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
            this.f61198a = exchangeRate;
            this.f61199b = apmQuote;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransferBreakdown)) {
                return false;
            }
            TransferBreakdown transferBreakdown = (TransferBreakdown) obj2;
            return Intrinsics.f(this.f61198a, transferBreakdown.f61198a) && Intrinsics.f(this.f61199b, transferBreakdown.f61199b);
        }

        public final int hashCode() {
            int iHashCode = this.f61198a.hashCode() * 31;
            ApmQuote apmQuote = this.f61199b;
            return iHashCode + (apmQuote == null ? 0 : apmQuote.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f61198a);
            dest.writeParcelable(this.f61199b, i);
        }
    }

    private BPayFlowContract$Step() {
    }
}

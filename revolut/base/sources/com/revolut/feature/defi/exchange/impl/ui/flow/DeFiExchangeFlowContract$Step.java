package com.revolut.feature.defi.exchange.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.defi.exchange.impl.ui.exchange_summary.DeFiExchangeSummaryContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import k71.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/defi/exchange/impl/ui/flow/DeFiExchangeFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "EnterAmount", "Review", "TransactionDetails", "Lcom/revolut/feature/defi/exchange/impl/ui/flow/DeFiExchangeFlowContract$Step$EnterAmount;", "Lcom/revolut/feature/defi/exchange/impl/ui/flow/DeFiExchangeFlowContract$Step$Review;", "Lcom/revolut/feature/defi/exchange/impl/ui/flow/DeFiExchangeFlowContract$Step$TransactionDetails;", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DeFiExchangeFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/defi/exchange/impl/ui/flow/DeFiExchangeFlowContract$Step$EnterAmount;", "Lcom/revolut/feature/defi/exchange/impl/ui/flow/DeFiExchangeFlowContract$Step;", "<init>", "()V", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EnterAmount implements DeFiExchangeFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnterAmount f71787a = new EnterAmount();

        @NotNull
        public static final Parcelable.Creator<EnterAmount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EnterAmount.f71787a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EnterAmount[i];
            }
        }

        private EnterAmount() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/exchange/impl/ui/flow/DeFiExchangeFlowContract$Step$Review;", "Lcom/revolut/feature/defi/exchange/impl/ui/flow/DeFiExchangeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review implements DeFiExchangeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DeFiExchangeSummaryContract$InputData f71788a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Review(DeFiExchangeSummaryContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(DeFiExchangeSummaryContract$InputData input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f71788a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Review) && Intrinsics.f(this.f71788a, ((Review) obj2).f71788a);
        }

        public final int hashCode() {
            return this.f71788a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f71788a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/exchange/impl/ui/flow/DeFiExchangeFlowContract$Step$TransactionDetails;", "Lcom/revolut/feature/defi/exchange/impl/ui/flow/DeFiExchangeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionDetails implements DeFiExchangeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TransactionDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f71789a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionDetails((i) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionDetails[i];
            }
        }

        public TransactionDetails(i descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.f71789a = descriptor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TransactionDetails) && Intrinsics.f(this.f71789a, ((TransactionDetails) obj2).f71789a);
        }

        public final int hashCode() {
            return this.f71789a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f71789a);
        }
    }
}

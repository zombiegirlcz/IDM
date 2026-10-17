package com.revolut.feature.subscriptions.impl.block_future_payments;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/subscriptions/impl/block_future_payments/BlockFuturePaymentsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "BlockFuturePayments", "BlockSubscription", "Lcom/revolut/feature/subscriptions/impl/block_future_payments/BlockFuturePaymentsFlowContract$Step$BlockFuturePayments;", "Lcom/revolut/feature/subscriptions/impl/block_future_payments/BlockFuturePaymentsFlowContract$Step$BlockSubscription;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BlockFuturePaymentsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/block_future_payments/BlockFuturePaymentsFlowContract$Step$BlockFuturePayments;", "Lcom/revolut/feature/subscriptions/impl/block_future_payments/BlockFuturePaymentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BlockFuturePayments extends BlockFuturePaymentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BlockFuturePayments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f89175b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BlockFuturePayments(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlockFuturePayments[i];
            }
        }

        public BlockFuturePayments(String paymentId, boolean z) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            this.f89174a = paymentId;
            this.f89175b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BlockFuturePayments)) {
                return false;
            }
            BlockFuturePayments blockFuturePayments = (BlockFuturePayments) obj2;
            return Intrinsics.f(this.f89174a, blockFuturePayments.f89174a) && this.f89175b == blockFuturePayments.f89175b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f89175b) + (this.f89174a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89174a);
            dest.writeInt(this.f89175b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/block_future_payments/BlockFuturePaymentsFlowContract$Step$BlockSubscription;", "Lcom/revolut/feature/subscriptions/impl/block_future_payments/BlockFuturePaymentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BlockSubscription extends BlockFuturePaymentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BlockSubscription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f89176a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BlockSubscription((p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlockSubscription[i];
            }
        }

        public BlockSubscription(p recurringPayment) {
            Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
            this.f89176a = recurringPayment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BlockSubscription) && Intrinsics.f(this.f89176a, ((BlockSubscription) obj2).f89176a);
        }

        public final int hashCode() {
            return this.f89176a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89176a);
        }
    }

    private BlockFuturePaymentsFlowContract$Step() {
    }
}

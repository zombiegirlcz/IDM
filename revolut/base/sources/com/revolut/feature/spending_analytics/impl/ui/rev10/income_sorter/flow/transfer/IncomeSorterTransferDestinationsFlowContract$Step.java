package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zm3.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/transfer/IncomeSorterTransferDestinationsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SelectRecipient", "PeerToPeer", "BankTransfer", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/transfer/IncomeSorterTransferDestinationsFlowContract$Step$BankTransfer;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/transfer/IncomeSorterTransferDestinationsFlowContract$Step$PeerToPeer;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/transfer/IncomeSorterTransferDestinationsFlowContract$Step$SelectRecipient;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IncomeSorterTransferDestinationsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/transfer/IncomeSorterTransferDestinationsFlowContract$Step$BankTransfer;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/transfer/IncomeSorterTransferDestinationsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BankTransfer implements IncomeSorterTransferDestinationsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BankTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5j.a f87772a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BankTransfer((f5j.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankTransfer[i];
            }
        }

        public BankTransfer(f5j.a beneficiary) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f87772a = beneficiary;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BankTransfer) && Intrinsics.f(this.f87772a, ((BankTransfer) obj2).f87772a);
        }

        public final int hashCode() {
            return this.f87772a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f87772a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/transfer/IncomeSorterTransferDestinationsFlowContract$Step$PeerToPeer;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/transfer/IncomeSorterTransferDestinationsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PeerToPeer implements IncomeSorterTransferDestinationsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PeerToPeer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f87773a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PeerToPeer((l) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PeerToPeer[i];
            }
        }

        public PeerToPeer(l recipient) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            this.f87773a = recipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PeerToPeer) && Intrinsics.f(this.f87773a, ((PeerToPeer) obj2).f87773a);
        }

        public final int hashCode() {
            return this.f87773a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f87773a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/transfer/IncomeSorterTransferDestinationsFlowContract$Step$SelectRecipient;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/income_sorter/flow/transfer/IncomeSorterTransferDestinationsFlowContract$Step;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectRecipient implements IncomeSorterTransferDestinationsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectRecipient f87774a = new SelectRecipient();

        @NotNull
        public static final Parcelable.Creator<SelectRecipient> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectRecipient.f87774a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectRecipient[i];
            }
        }

        private SelectRecipient() {
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

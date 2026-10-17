package com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/entry_flow/BankTransferEntryFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "BankTransfer", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/entry_flow/BankTransferEntryFlowContract$Step$BankTransfer;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BankTransferEntryFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/entry_flow/BankTransferEntryFlowContract$Step$BankTransfer;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/entry_flow/BankTransferEntryFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BankTransfer extends BankTransferEntryFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BankTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BankTransferFlowInputData f102092a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BankTransfer((BankTransferFlowInputData) parcel.readParcelable(BankTransfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankTransfer[i];
            }
        }

        public BankTransfer(BankTransferFlowInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f102092a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BankTransfer) && Intrinsics.f(this.f102092a, ((BankTransfer) obj2).f102092a);
        }

        public final int hashCode() {
            return this.f102092a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102092a, i);
        }
    }

    private BankTransferEntryFlowContract$Step() {
    }
}

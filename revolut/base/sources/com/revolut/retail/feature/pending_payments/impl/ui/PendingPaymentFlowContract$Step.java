package com.revolut.retail.feature.pending_payments.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$OutputData;
import com.revolut.retail.feature.pending_payments.impl.common.PendingPaymentBottomSheetInputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/pending_payments/impl/ui/PendingPaymentFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Confirmation", "BottomDialog", "Lcom/revolut/retail/feature/pending_payments/impl/ui/PendingPaymentFlowContract$Step$BottomDialog;", "Lcom/revolut/retail/feature/pending_payments/impl/ui/PendingPaymentFlowContract$Step$Confirmation;", "feature_retail_pending_payments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PendingPaymentFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pending_payments/impl/ui/PendingPaymentFlowContract$Step$BottomDialog;", "Lcom/revolut/retail/feature/pending_payments/impl/ui/PendingPaymentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pending_payments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BottomDialog implements PendingPaymentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BottomDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PendingPaymentBottomSheetInputData f102422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PendingPaymentContract$OutputData f102423b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BottomDialog(PendingPaymentBottomSheetInputData.CREATOR.createFromParcel(parcel), (PendingPaymentContract$OutputData) parcel.readParcelable(BottomDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BottomDialog[i];
            }
        }

        public BottomDialog(PendingPaymentBottomSheetInputData inputData, PendingPaymentContract$OutputData outputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            Intrinsics.checkNotNullParameter(outputData, "outputData");
            this.f102422a = inputData;
            this.f102423b = outputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BottomDialog)) {
                return false;
            }
            BottomDialog bottomDialog = (BottomDialog) obj2;
            return Intrinsics.f(this.f102422a, bottomDialog.f102422a) && Intrinsics.f(this.f102423b, bottomDialog.f102423b);
        }

        public final int hashCode() {
            return this.f102423b.hashCode() + (this.f102422a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f102422a.writeToParcel(dest, i);
            dest.writeParcelable(this.f102423b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pending_payments/impl/ui/PendingPaymentFlowContract$Step$Confirmation;", "Lcom/revolut/retail/feature/pending_payments/impl/ui/PendingPaymentFlowContract$Step;", "<init>", "()V", "feature_retail_pending_payments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Confirmation implements PendingPaymentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Confirmation f102424a = new Confirmation();

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Confirmation.f102424a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        private Confirmation() {
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

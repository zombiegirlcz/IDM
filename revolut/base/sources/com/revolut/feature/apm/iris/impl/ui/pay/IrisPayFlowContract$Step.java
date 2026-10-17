package com.revolut.feature.apm.iris.impl.ui.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/apm/iris/impl/ui/pay/IrisPayFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Scanner", "Transfer", "PendingPayment", "Lcom/revolut/feature/apm/iris/impl/ui/pay/IrisPayFlowContract$Step$PendingPayment;", "Lcom/revolut/feature/apm/iris/impl/ui/pay/IrisPayFlowContract$Step$Scanner;", "Lcom/revolut/feature/apm/iris/impl/ui/pay/IrisPayFlowContract$Step$Transfer;", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IrisPayFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/iris/impl/ui/pay/IrisPayFlowContract$Step$PendingPayment;", "Lcom/revolut/feature/apm/iris/impl/ui/pay/IrisPayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PendingPayment implements IrisPayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PendingPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PendingPaymentContract$InputData.Apm f62514a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PendingPayment((PendingPaymentContract$InputData.Apm) parcel.readParcelable(PendingPayment.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PendingPayment[i];
            }
        }

        public PendingPayment(PendingPaymentContract$InputData.Apm inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f62514a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PendingPayment) && Intrinsics.f(this.f62514a, ((PendingPayment) obj2).f62514a);
        }

        public final int hashCode() {
            return this.f62514a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62514a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/iris/impl/ui/pay/IrisPayFlowContract$Step$Scanner;", "Lcom/revolut/feature/apm/iris/impl/ui/pay/IrisPayFlowContract$Step;", "<init>", "()V", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Scanner implements IrisPayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Scanner f62515a = new Scanner();

        @NotNull
        public static final Parcelable.Creator<Scanner> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Scanner.f62515a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Scanner[i];
            }
        }

        private Scanner() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/iris/impl/ui/pay/IrisPayFlowContract$Step$Transfer;", "Lcom/revolut/feature/apm/iris/impl/ui/pay/IrisPayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transfer implements IrisPayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmTransferContract$InputData f62516a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transfer((ApmTransferContract$InputData) parcel.readParcelable(Transfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transfer[i];
            }
        }

        public Transfer(ApmTransferContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f62516a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Transfer) && Intrinsics.f(this.f62516a, ((Transfer) obj2).f62516a);
        }

        public final int hashCode() {
            return this.f62516a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62516a, i);
        }
    }
}

package com.revolut.feature.apm.bills.pagopa.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.pagopa.impl.ui.bill_input.PagoPABillInputScreenContract$InputData;
import com.revolut.feature.apm.bills.pagopa.impl.ui.confirmation.PagoPABillConfirmationScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/apm/bills/pagopa/impl/ui/flow/PagoPAFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "BillConfirmation", "BillManualInput", "Lcom/revolut/feature/apm/bills/pagopa/impl/ui/flow/PagoPAFlowContract$Step$BillConfirmation;", "Lcom/revolut/feature/apm/bills/pagopa/impl/ui/flow/PagoPAFlowContract$Step$BillManualInput;", "feature_apm_bills_pagopa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PagoPAFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/pagopa/impl/ui/flow/PagoPAFlowContract$Step$BillConfirmation;", "Lcom/revolut/feature/apm/bills/pagopa/impl/ui/flow/PagoPAFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_pagopa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillConfirmation extends PagoPAFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BillConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PagoPABillConfirmationScreenContract$InputData f61493a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillConfirmation(PagoPABillConfirmationScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillConfirmation[i];
            }
        }

        public BillConfirmation(PagoPABillConfirmationScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f61493a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BillConfirmation) && Intrinsics.f(this.f61493a, ((BillConfirmation) obj2).f61493a);
        }

        public final int hashCode() {
            return this.f61493a.f61492a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f61493a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/pagopa/impl/ui/flow/PagoPAFlowContract$Step$BillManualInput;", "Lcom/revolut/feature/apm/bills/pagopa/impl/ui/flow/PagoPAFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_pagopa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillManualInput extends PagoPAFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BillManualInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PagoPABillInputScreenContract$InputData f61494a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillManualInput(PagoPABillInputScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillManualInput[i];
            }
        }

        public BillManualInput(PagoPABillInputScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f61494a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BillManualInput) && Intrinsics.f(this.f61494a, ((BillManualInput) obj2).f61494a);
        }

        public final int hashCode() {
            return this.f61494a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f61494a.writeToParcel(dest, i);
        }
    }

    private PagoPAFlowContract$Step() {
    }
}

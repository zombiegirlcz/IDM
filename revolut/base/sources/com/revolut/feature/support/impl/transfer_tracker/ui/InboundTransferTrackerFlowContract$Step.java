package com.revolut.feature.support.impl.transfer_tracker.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalContent;
import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq2.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"com/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SwiftTransactionReferenceInput", "InputForm", "InboundTransactionList", "EstimationResult", "TransactionReferenceInfo", "DelayedTransferLearnMore", "InboundSwiftTransferStatus", "Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step$DelayedTransferLearnMore;", "Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step$EstimationResult;", "Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step$InboundSwiftTransferStatus;", "Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step$InboundTransactionList;", "Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step$InputForm;", "Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step$SwiftTransactionReferenceInput;", "Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step$TransactionReferenceInfo;", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class InboundTransferTrackerFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step$DelayedTransferLearnMore;", "Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step;", "<init>", "()V", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DelayedTransferLearnMore extends InboundTransferTrackerFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DelayedTransferLearnMore f89386a = new DelayedTransferLearnMore();

        @NotNull
        public static final Parcelable.Creator<DelayedTransferLearnMore> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DelayedTransferLearnMore.f89386a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DelayedTransferLearnMore[i];
            }
        }

        private DelayedTransferLearnMore() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step$EstimationResult;", "Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EstimationResult extends InboundTransferTrackerFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EstimationResult> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferArrivalRequest f89387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferArrivalContent f89388b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EstimationResult(TransferArrivalRequest.CREATOR.createFromParcel(parcel), TransferArrivalContent.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EstimationResult[i];
            }
        }

        public EstimationResult(TransferArrivalRequest request, TransferArrivalContent transferArrivalContent) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(transferArrivalContent, "transferArrivalContent");
            this.f89387a = request;
            this.f89388b = transferArrivalContent;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EstimationResult)) {
                return false;
            }
            EstimationResult estimationResult = (EstimationResult) obj2;
            return Intrinsics.f(this.f89387a, estimationResult.f89387a) && Intrinsics.f(this.f89388b, estimationResult.f89388b);
        }

        public final int hashCode() {
            return this.f89388b.hashCode() + (this.f89387a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f89387a.writeToParcel(dest, i);
            this.f89388b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step$InboundSwiftTransferStatus;", "Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InboundSwiftTransferStatus extends InboundTransferTrackerFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InboundSwiftTransferStatus> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferArrivalRequest f89390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l f89391c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InboundSwiftTransferStatus(parcel.readString(), TransferArrivalRequest.CREATOR.createFromParcel(parcel), l.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InboundSwiftTransferStatus[i];
            }
        }

        public InboundSwiftTransferStatus(String uetr, TransferArrivalRequest request, l transferType) {
            Intrinsics.checkNotNullParameter(uetr, "uetr");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(transferType, "transferType");
            this.f89389a = uetr;
            this.f89390b = request;
            this.f89391c = transferType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InboundSwiftTransferStatus)) {
                return false;
            }
            InboundSwiftTransferStatus inboundSwiftTransferStatus = (InboundSwiftTransferStatus) obj2;
            return Intrinsics.f(this.f89389a, inboundSwiftTransferStatus.f89389a) && Intrinsics.f(this.f89390b, inboundSwiftTransferStatus.f89390b) && this.f89391c == inboundSwiftTransferStatus.f89391c;
        }

        public final int hashCode() {
            return this.f89391c.hashCode() + ((this.f89390b.hashCode() + (this.f89389a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89389a);
            this.f89390b.writeToParcel(dest, i);
            dest.writeString(this.f89391c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step$InboundTransactionList;", "Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InboundTransactionList extends InboundTransferTrackerFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InboundTransactionList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f89392a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InboundTransactionList(parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InboundTransactionList[i];
            }
        }

        public InboundTransactionList(List transactionIds) {
            Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
            this.f89392a = transactionIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InboundTransactionList) && Intrinsics.f(this.f89392a, ((InboundTransactionList) obj2).f89392a);
        }

        public final int hashCode() {
            return this.f89392a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.f89392a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step$InputForm;", "Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step;", "<init>", "()V", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InputForm extends InboundTransferTrackerFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InputForm f89393a = new InputForm();

        @NotNull
        public static final Parcelable.Creator<InputForm> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InputForm.f89393a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputForm[i];
            }
        }

        private InputForm() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step$SwiftTransactionReferenceInput;", "Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SwiftTransactionReferenceInput extends InboundTransferTrackerFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SwiftTransactionReferenceInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferArrivalRequest f89394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferArrivalContent f89395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l f89396c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SwiftTransactionReferenceInput(TransferArrivalRequest.CREATOR.createFromParcel(parcel), TransferArrivalContent.CREATOR.createFromParcel(parcel), l.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SwiftTransactionReferenceInput[i];
            }
        }

        public SwiftTransactionReferenceInput(TransferArrivalRequest request, TransferArrivalContent transferArrivalContent, l transferType) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(transferArrivalContent, "transferArrivalContent");
            Intrinsics.checkNotNullParameter(transferType, "transferType");
            this.f89394a = request;
            this.f89395b = transferArrivalContent;
            this.f89396c = transferType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SwiftTransactionReferenceInput)) {
                return false;
            }
            SwiftTransactionReferenceInput swiftTransactionReferenceInput = (SwiftTransactionReferenceInput) obj2;
            return Intrinsics.f(this.f89394a, swiftTransactionReferenceInput.f89394a) && Intrinsics.f(this.f89395b, swiftTransactionReferenceInput.f89395b) && this.f89396c == swiftTransactionReferenceInput.f89396c;
        }

        public final int hashCode() {
            return this.f89396c.hashCode() + ((this.f89395b.hashCode() + (this.f89394a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f89394a.writeToParcel(dest, i);
            this.f89395b.writeToParcel(dest, i);
            dest.writeString(this.f89396c.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step$TransactionReferenceInfo;", "Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlowContract$Step;", "<init>", "()V", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TransactionReferenceInfo extends InboundTransferTrackerFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TransactionReferenceInfo f89397a = new TransactionReferenceInfo();

        @NotNull
        public static final Parcelable.Creator<TransactionReferenceInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TransactionReferenceInfo.f89397a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionReferenceInfo[i];
            }
        }

        private TransactionReferenceInfo() {
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

    private InboundTransferTrackerFlowContract$Step() {
    }
}

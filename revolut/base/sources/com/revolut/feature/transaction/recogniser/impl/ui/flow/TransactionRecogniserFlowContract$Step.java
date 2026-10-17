package com.revolut.feature.transaction.recogniser.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transaction.recogniser.api.domain.models.TransactionRecogniserDetails;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/transaction/recogniser/impl/ui/flow/TransactionRecogniserFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "RecogniserTransactionDetails", "MerchantHistory", "TransactionsBeforeAfter", "FinalChecks", "AddNote", "Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/TransactionRecogniserFlowContract$Step$AddNote;", "Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/TransactionRecogniserFlowContract$Step$FinalChecks;", "Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/TransactionRecogniserFlowContract$Step$MerchantHistory;", "Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/TransactionRecogniserFlowContract$Step$RecogniserTransactionDetails;", "Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/TransactionRecogniserFlowContract$Step$TransactionsBeforeAfter;", "feature_transaction_recogniser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransactionRecogniserFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/TransactionRecogniserFlowContract$Step$AddNote;", "Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/TransactionRecogniserFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transaction_recogniser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddNote extends TransactionRecogniserFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddNote> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91812a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddNote(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddNote[i];
            }
        }

        public AddNote(String transactionId) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            this.f91812a = transactionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddNote) && Intrinsics.f(this.f91812a, ((AddNote) obj2).f91812a);
        }

        public final int hashCode() {
            return this.f91812a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91812a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/TransactionRecogniserFlowContract$Step$FinalChecks;", "Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/TransactionRecogniserFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transaction_recogniser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FinalChecks extends TransactionRecogniserFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FinalChecks> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransactionRecogniserDetails f91813a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FinalChecks((TransactionRecogniserDetails) parcel.readParcelable(FinalChecks.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FinalChecks[i];
            }
        }

        public FinalChecks(TransactionRecogniserDetails recogniserDetails) {
            Intrinsics.checkNotNullParameter(recogniserDetails, "recogniserDetails");
            this.f91813a = recogniserDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FinalChecks) && Intrinsics.f(this.f91813a, ((FinalChecks) obj2).f91813a);
        }

        public final int hashCode() {
            return this.f91813a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91813a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/TransactionRecogniserFlowContract$Step$MerchantHistory;", "Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/TransactionRecogniserFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transaction_recogniser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MerchantHistory extends TransactionRecogniserFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MerchantHistory> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransactionRecogniserDetails f91814a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MerchantHistory((TransactionRecogniserDetails) parcel.readParcelable(MerchantHistory.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MerchantHistory[i];
            }
        }

        public MerchantHistory(TransactionRecogniserDetails recogniserDetails) {
            Intrinsics.checkNotNullParameter(recogniserDetails, "recogniserDetails");
            this.f91814a = recogniserDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MerchantHistory) && Intrinsics.f(this.f91814a, ((MerchantHistory) obj2).f91814a);
        }

        public final int hashCode() {
            return this.f91814a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91814a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/TransactionRecogniserFlowContract$Step$RecogniserTransactionDetails;", "Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/TransactionRecogniserFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transaction_recogniser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecogniserTransactionDetails extends TransactionRecogniserFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RecogniserTransactionDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91815a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecogniserTransactionDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecogniserTransactionDetails[i];
            }
        }

        public RecogniserTransactionDetails(String transactionId) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            this.f91815a = transactionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RecogniserTransactionDetails) && Intrinsics.f(this.f91815a, ((RecogniserTransactionDetails) obj2).f91815a);
        }

        public final int hashCode() {
            return this.f91815a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91815a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/TransactionRecogniserFlowContract$Step$TransactionsBeforeAfter;", "Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/TransactionRecogniserFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transaction_recogniser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionsBeforeAfter extends TransactionRecogniserFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TransactionsBeforeAfter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransactionRecogniserDetails f91816a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionsBeforeAfter((TransactionRecogniserDetails) parcel.readParcelable(TransactionsBeforeAfter.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionsBeforeAfter[i];
            }
        }

        public TransactionsBeforeAfter(TransactionRecogniserDetails recogniserDetails) {
            Intrinsics.checkNotNullParameter(recogniserDetails, "recogniserDetails");
            this.f91816a = recogniserDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TransactionsBeforeAfter) && Intrinsics.f(this.f91816a, ((TransactionsBeforeAfter) obj2).f91816a);
        }

        public final int hashCode() {
            return this.f91816a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91816a, i);
        }
    }

    private TransactionRecogniserFlowContract$Step() {
    }
}

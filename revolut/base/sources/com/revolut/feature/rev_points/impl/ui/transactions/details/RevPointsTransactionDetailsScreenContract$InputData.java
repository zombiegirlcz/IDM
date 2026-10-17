package com.revolut.feature.rev_points.impl.ui.transactions.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/rev_points/impl/ui/transactions/details/RevPointsTransactionDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "TransactionInput", "TransactionIdInput", "Lcom/revolut/feature/rev_points/impl/ui/transactions/details/RevPointsTransactionDetailsScreenContract$InputData$TransactionIdInput;", "Lcom/revolut/feature/rev_points/impl/ui/transactions/details/RevPointsTransactionDetailsScreenContract$InputData$TransactionInput;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsTransactionDetailsScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/transactions/details/RevPointsTransactionDetailsScreenContract$InputData$TransactionIdInput;", "Lcom/revolut/feature/rev_points/impl/ui/transactions/details/RevPointsTransactionDetailsScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionIdInput extends RevPointsTransactionDetailsScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<TransactionIdInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83851a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionIdInput(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionIdInput[i];
            }
        }

        public TransactionIdInput(String revPointsTransactionId) {
            Intrinsics.checkNotNullParameter(revPointsTransactionId, "revPointsTransactionId");
            this.f83851a = revPointsTransactionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TransactionIdInput) && Intrinsics.f(this.f83851a, ((TransactionIdInput) obj2).f83851a);
        }

        public final int hashCode() {
            return this.f83851a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83851a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/transactions/details/RevPointsTransactionDetailsScreenContract$InputData$TransactionInput;", "Lcom/revolut/feature/rev_points/impl/ui/transactions/details/RevPointsTransactionDetailsScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionInput extends RevPointsTransactionDetailsScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<TransactionInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPointsTransaction f83852a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionInput((RevPointsTransaction) parcel.readParcelable(TransactionInput.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionInput[i];
            }
        }

        public TransactionInput(RevPointsTransaction revPointsTransaction) {
            Intrinsics.checkNotNullParameter(revPointsTransaction, "revPointsTransaction");
            this.f83852a = revPointsTransaction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TransactionInput) && Intrinsics.f(this.f83852a, ((TransactionInput) obj2).f83852a);
        }

        public final int hashCode() {
            return this.f83852a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83852a, i);
        }
    }

    private RevPointsTransactionDetailsScreenContract$InputData() {
    }
}

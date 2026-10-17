package com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import tof.i7;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/recurringbuys/impl/ui/kompot/payment_history/PaymentHistoryContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "TransactionsPager", "Lcom/revolut/feature/recurringbuys/impl/ui/kompot/payment_history/PaymentHistoryContract$ModalStep$TransactionsPager;", "feature_recurring_buys_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PaymentHistoryContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/recurringbuys/impl/ui/kompot/payment_history/PaymentHistoryContract$ModalStep$TransactionsPager;", "Lcom/revolut/feature/recurringbuys/impl/ui/kompot/payment_history/PaymentHistoryContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_recurring_buys_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionsPager implements PaymentHistoryContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TransactionsPager> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i7 f81665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a3 f81666b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionsPager((a3) parcel.readSerializable(), (i7) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionsPager[i];
            }
        }

        public TransactionsPager(a3 transaction, i7 filter) {
            Intrinsics.checkNotNullParameter(filter, "filter");
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            this.f81665a = filter;
            this.f81666b = transaction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransactionsPager)) {
                return false;
            }
            TransactionsPager transactionsPager = (TransactionsPager) obj2;
            return Intrinsics.f(this.f81665a, transactionsPager.f81665a) && Intrinsics.f(this.f81666b, transactionsPager.f81666b);
        }

        public final int hashCode() {
            return this.f81666b.hashCode() + (this.f81665a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f81665a);
            dest.writeSerializable(this.f81666b);
        }
    }
}

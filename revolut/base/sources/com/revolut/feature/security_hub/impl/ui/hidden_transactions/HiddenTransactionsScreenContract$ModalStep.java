package com.revolut.feature.security_hub.impl.ui.hidden_transactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import tof.i7;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/security_hub/impl/ui/hidden_transactions/HiddenTransactionsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "TransactionDetailsPager", "HideTransactionsConfirmation", "Lcom/revolut/feature/security_hub/impl/ui/hidden_transactions/HiddenTransactionsScreenContract$ModalStep$HideTransactionsConfirmation;", "Lcom/revolut/feature/security_hub/impl/ui/hidden_transactions/HiddenTransactionsScreenContract$ModalStep$TransactionDetailsPager;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface HiddenTransactionsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/hidden_transactions/HiddenTransactionsScreenContract$ModalStep$HideTransactionsConfirmation;", "Lcom/revolut/feature/security_hub/impl/ui/hidden_transactions/HiddenTransactionsScreenContract$ModalStep;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HideTransactionsConfirmation implements HiddenTransactionsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HideTransactionsConfirmation f85580a = new HideTransactionsConfirmation();

        @NotNull
        public static final Parcelable.Creator<HideTransactionsConfirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HideTransactionsConfirmation.f85580a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HideTransactionsConfirmation[i];
            }
        }

        private HideTransactionsConfirmation() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/hidden_transactions/HiddenTransactionsScreenContract$ModalStep$TransactionDetailsPager;", "Lcom/revolut/feature/security_hub/impl/ui/hidden_transactions/HiddenTransactionsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionDetailsPager implements HiddenTransactionsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TransactionDetailsPager> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a3 f85581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i7 f85582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f85583c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionDetailsPager((a3) parcel.readSerializable(), (i7) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionDetailsPager[i];
            }
        }

        public TransactionDetailsPager(a3 selectedTransaction, i7 i7Var, String searchQuery) {
            Intrinsics.checkNotNullParameter(selectedTransaction, "selectedTransaction");
            Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
            this.f85581a = selectedTransaction;
            this.f85582b = i7Var;
            this.f85583c = searchQuery;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransactionDetailsPager)) {
                return false;
            }
            TransactionDetailsPager transactionDetailsPager = (TransactionDetailsPager) obj2;
            return Intrinsics.f(this.f85581a, transactionDetailsPager.f85581a) && Intrinsics.f(this.f85582b, transactionDetailsPager.f85582b) && Intrinsics.f(this.f85583c, transactionDetailsPager.f85583c);
        }

        public final int hashCode() {
            int iHashCode = this.f85581a.hashCode() * 31;
            i7 i7Var = this.f85582b;
            return this.f85583c.hashCode() + ((iHashCode + (i7Var == null ? 0 : i7Var.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f85581a);
            dest.writeSerializable(this.f85582b);
            dest.writeString(this.f85583c);
        }
    }
}

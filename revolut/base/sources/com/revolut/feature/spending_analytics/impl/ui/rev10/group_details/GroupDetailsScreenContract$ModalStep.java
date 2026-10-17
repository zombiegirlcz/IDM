package com.revolut.feature.spending_analytics.impl.ui.rev10.group_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import tof.i7;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "TransactionDetailsPager", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$ModalStep$TransactionDetailsPager;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface GroupDetailsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$ModalStep$TransactionDetailsPager;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/group_details/GroupDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionDetailsPager implements GroupDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TransactionDetailsPager> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a3 f87704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i7 f87705b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionDetailsPager((a3) parcel.readSerializable(), (i7) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionDetailsPager[i];
            }
        }

        public TransactionDetailsPager(a3 selectedTransaction, i7 i7Var) {
            Intrinsics.checkNotNullParameter(selectedTransaction, "selectedTransaction");
            this.f87704a = selectedTransaction;
            this.f87705b = i7Var;
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
            return Intrinsics.f(this.f87704a, transactionDetailsPager.f87704a) && Intrinsics.f(this.f87705b, transactionDetailsPager.f87705b);
        }

        public final int hashCode() {
            int iHashCode = this.f87704a.hashCode() * 31;
            i7 i7Var = this.f87705b;
            return iHashCode + (i7Var == null ? 0 : i7Var.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f87704a);
            dest.writeSerializable(this.f87705b);
        }
    }
}

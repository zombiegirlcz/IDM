package com.revolut.feature.payments.groups.impl.ui_chat.group_transactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oq9.c0;
import oq9.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/payments/groups/impl/ui_chat/group_transactions/GroupTransactionsScreenContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "BillDetailsScreen", "SettlementDetailsScreen", "Lcom/revolut/feature/payments/groups/impl/ui_chat/group_transactions/GroupTransactionsScreenContract$Step$BillDetailsScreen;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/group_transactions/GroupTransactionsScreenContract$Step$SettlementDetailsScreen;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface GroupTransactionsScreenContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_chat/group_transactions/GroupTransactionsScreenContract$Step$BillDetailsScreen;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/group_transactions/GroupTransactionsScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillDetailsScreen implements GroupTransactionsScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<BillDetailsScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f79363a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillDetailsScreen((i) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillDetailsScreen[i];
            }
        }

        public BillDetailsScreen(i bill) {
            Intrinsics.checkNotNullParameter(bill, "bill");
            this.f79363a = bill;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BillDetailsScreen) && Intrinsics.f(this.f79363a, ((BillDetailsScreen) obj2).f79363a);
        }

        public final int hashCode() {
            return this.f79363a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79363a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_chat/group_transactions/GroupTransactionsScreenContract$Step$SettlementDetailsScreen;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/group_transactions/GroupTransactionsScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SettlementDetailsScreen implements GroupTransactionsScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<SettlementDetailsScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0 f79364a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SettlementDetailsScreen((c0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SettlementDetailsScreen[i];
            }
        }

        public SettlementDetailsScreen(c0 settlement) {
            Intrinsics.checkNotNullParameter(settlement, "settlement");
            this.f79364a = settlement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SettlementDetailsScreen) && Intrinsics.f(this.f79364a, ((SettlementDetailsScreen) obj2).f79364a);
        }

        public final int hashCode() {
            return this.f79364a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79364a);
        }
    }
}

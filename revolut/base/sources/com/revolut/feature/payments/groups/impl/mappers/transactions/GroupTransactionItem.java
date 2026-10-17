package com.revolut.feature.payments.groups.impl.mappers.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oq9.c0;
import oq9.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/mappers/transactions/GroupTransactionItem;", "Landroid/os/Parcelable;", "<init>", "()V", "Bill", "Settlement", "Lcom/revolut/feature/payments/groups/impl/mappers/transactions/GroupTransactionItem$Bill;", "Lcom/revolut/feature/payments/groups/impl/mappers/transactions/GroupTransactionItem$Settlement;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GroupTransactionItem implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/mappers/transactions/GroupTransactionItem$Bill;", "Lcom/revolut/feature/payments/groups/impl/mappers/transactions/GroupTransactionItem;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Bill extends GroupTransactionItem {

        @NotNull
        public static final Parcelable.Creator<Bill> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f79326a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Bill((i) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Bill[i];
            }
        }

        public Bill(i bill) {
            Intrinsics.checkNotNullParameter(bill, "bill");
            this.f79326a = bill;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Bill) && Intrinsics.f(this.f79326a, ((Bill) obj2).f79326a);
        }

        public final int hashCode() {
            return this.f79326a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79326a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/mappers/transactions/GroupTransactionItem$Settlement;", "Lcom/revolut/feature/payments/groups/impl/mappers/transactions/GroupTransactionItem;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Settlement extends GroupTransactionItem {

        @NotNull
        public static final Parcelable.Creator<Settlement> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0 f79327a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Settlement((c0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Settlement[i];
            }
        }

        public Settlement(c0 settlement) {
            Intrinsics.checkNotNullParameter(settlement, "settlement");
            this.f79327a = settlement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Settlement) && Intrinsics.f(this.f79327a, ((Settlement) obj2).f79327a);
        }

        public final int hashCode() {
            return this.f79327a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79327a);
        }
    }

    private GroupTransactionItem() {
    }
}

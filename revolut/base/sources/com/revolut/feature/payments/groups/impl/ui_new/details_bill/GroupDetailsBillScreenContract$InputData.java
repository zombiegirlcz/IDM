package com.revolut.feature.payments.groups.impl.ui_new.details_bill;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.kompot.common.IOData$Input;
import do3.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oq9.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/payments/groups/impl/ui_new/details_bill/GroupDetailsBillScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "WithBill", "WithId", "Lcom/revolut/feature/payments/groups/impl/ui_new/details_bill/GroupDetailsBillScreenContract$InputData$WithBill;", "Lcom/revolut/feature/payments/groups/impl/ui_new/details_bill/GroupDetailsBillScreenContract$InputData$WithId;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GroupDetailsBillScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/details_bill/GroupDetailsBillScreenContract$InputData$WithBill;", "Lcom/revolut/feature/payments/groups/impl/ui_new/details_bill/GroupDetailsBillScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithBill extends GroupDetailsBillScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<WithBill> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentGroup f79410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f79411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n f79412c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithBill((PaymentGroup) parcel.readParcelable(WithBill.class.getClassLoader()), (i) parcel.readSerializable(), (n) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithBill[i];
            }
        }

        public WithBill(PaymentGroup group, i bill, n user) {
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(bill, "bill");
            Intrinsics.checkNotNullParameter(user, "user");
            this.f79410a = group;
            this.f79411b = bill;
            this.f79412c = user;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithBill)) {
                return false;
            }
            WithBill withBill = (WithBill) obj2;
            return Intrinsics.f(this.f79410a, withBill.f79410a) && Intrinsics.f(this.f79411b, withBill.f79411b) && Intrinsics.f(this.f79412c, withBill.f79412c);
        }

        public final int hashCode() {
            return this.f79412c.hashCode() + ((this.f79411b.hashCode() + (this.f79410a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79410a, i);
            dest.writeSerializable(this.f79411b);
            dest.writeSerializable(this.f79412c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/details_bill/GroupDetailsBillScreenContract$InputData$WithId;", "Lcom/revolut/feature/payments/groups/impl/ui_new/details_bill/GroupDetailsBillScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithId extends GroupDetailsBillScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<WithId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentGroup f79413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79414b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithId((PaymentGroup) parcel.readParcelable(WithId.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithId[i];
            }
        }

        public WithId(PaymentGroup group, String billId) {
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(billId, "billId");
            this.f79413a = group;
            this.f79414b = billId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithId)) {
                return false;
            }
            WithId withId = (WithId) obj2;
            return Intrinsics.f(this.f79413a, withId.f79413a) && Intrinsics.f(this.f79414b, withId.f79414b);
        }

        public final int hashCode() {
            return this.f79414b.hashCode() + (this.f79413a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79413a, i);
            dest.writeString(this.f79414b);
        }
    }

    private GroupDetailsBillScreenContract$InputData() {
    }
}

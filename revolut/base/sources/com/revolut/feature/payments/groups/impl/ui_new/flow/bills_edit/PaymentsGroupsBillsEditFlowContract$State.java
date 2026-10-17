package com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oq9.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/groups/impl/ui_new/flow/bills_edit/PaymentsGroupsBillsEditFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentsGroupsBillsEditFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<PaymentsGroupsBillsEditFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentGroup f79427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f79428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BillType f79429c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentsGroupsBillsEditFlowContract$State((PaymentGroup) parcel.readParcelable(PaymentsGroupsBillsEditFlowContract$State.class.getClassLoader()), (i) parcel.readSerializable(), (BillType) parcel.readParcelable(PaymentsGroupsBillsEditFlowContract$State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentsGroupsBillsEditFlowContract$State[i];
        }
    }

    public PaymentsGroupsBillsEditFlowContract$State(PaymentGroup group, i groupBill, BillType bill) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(groupBill, "groupBill");
        Intrinsics.checkNotNullParameter(bill, "bill");
        this.f79427a = group;
        this.f79428b = groupBill;
        this.f79429c = bill;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentsGroupsBillsEditFlowContract$State)) {
            return false;
        }
        PaymentsGroupsBillsEditFlowContract$State paymentsGroupsBillsEditFlowContract$State = (PaymentsGroupsBillsEditFlowContract$State) obj2;
        return Intrinsics.f(this.f79427a, paymentsGroupsBillsEditFlowContract$State.f79427a) && Intrinsics.f(this.f79428b, paymentsGroupsBillsEditFlowContract$State.f79428b) && Intrinsics.f(this.f79429c, paymentsGroupsBillsEditFlowContract$State.f79429c);
    }

    public final int hashCode() {
        return this.f79429c.hashCode() + ((this.f79428b.hashCode() + (this.f79427a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79427a, i);
        dest.writeSerializable(this.f79428b);
        dest.writeParcelable(this.f79429c, i);
    }
}

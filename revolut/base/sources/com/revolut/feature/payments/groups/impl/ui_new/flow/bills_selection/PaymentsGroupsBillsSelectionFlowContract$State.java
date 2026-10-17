package com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.kompot.navigable.flow.FlowState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/groups/impl/ui_new/flow/bills_selection/PaymentsGroupsBillsSelectionFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentsGroupsBillsSelectionFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<PaymentsGroupsBillsSelectionFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentGroup f79439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f79440b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            PaymentGroup paymentGroup = (PaymentGroup) j6.a.f(parcel, "parcel", PaymentsGroupsBillsSelectionFlowContract$State.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(PaymentsGroupsBillsSelectionFlowContract$State.class, parcel, arrayList, iE, 1);
            }
            return new PaymentsGroupsBillsSelectionFlowContract$State(paymentGroup, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentsGroupsBillsSelectionFlowContract$State[i];
        }
    }

    public PaymentsGroupsBillsSelectionFlowContract$State(PaymentGroup group, List preselectedBills) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(preselectedBills, "preselectedBills");
        this.f79439a = group;
        this.f79440b = preselectedBills;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentsGroupsBillsSelectionFlowContract$State)) {
            return false;
        }
        PaymentsGroupsBillsSelectionFlowContract$State paymentsGroupsBillsSelectionFlowContract$State = (PaymentsGroupsBillsSelectionFlowContract$State) obj2;
        return Intrinsics.f(this.f79439a, paymentsGroupsBillsSelectionFlowContract$State.f79439a) && Intrinsics.f(this.f79440b, paymentsGroupsBillsSelectionFlowContract$State.f79440b);
    }

    public final int hashCode() {
        return this.f79440b.hashCode() + (this.f79439a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79439a, i);
        Iterator itV = p.a.v(this.f79440b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}

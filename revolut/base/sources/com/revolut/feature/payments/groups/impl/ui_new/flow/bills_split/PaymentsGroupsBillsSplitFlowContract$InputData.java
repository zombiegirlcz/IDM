package com.revolut.feature.payments.groups.impl.ui_new.flow.bills_split;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okl.m;
import oq9.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/groups/impl/ui_new/flow/bills_split/PaymentsGroupsBillsSplitFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentsGroupsBillsSplitFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PaymentsGroupsBillsSplitFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentGroup f79449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f79450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f79451c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            PaymentGroup paymentGroup = (PaymentGroup) j6.a.f(parcel, "parcel", PaymentsGroupsBillsSplitFlowContract$InputData.class);
            o oVar = (o) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(PaymentsGroupsBillsSplitFlowContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new PaymentsGroupsBillsSplitFlowContract$InputData(paymentGroup, oVar, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentsGroupsBillsSplitFlowContract$InputData[i];
        }
    }

    public PaymentsGroupsBillsSplitFlowContract$InputData(PaymentGroup group, o owner, List bills) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(bills, "bills");
        this.f79449a = group;
        this.f79450b = owner;
        this.f79451c = bills;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentsGroupsBillsSplitFlowContract$InputData)) {
            return false;
        }
        PaymentsGroupsBillsSplitFlowContract$InputData paymentsGroupsBillsSplitFlowContract$InputData = (PaymentsGroupsBillsSplitFlowContract$InputData) obj2;
        return Intrinsics.f(this.f79449a, paymentsGroupsBillsSplitFlowContract$InputData.f79449a) && Intrinsics.f(this.f79450b, paymentsGroupsBillsSplitFlowContract$InputData.f79450b) && Intrinsics.f(this.f79451c, paymentsGroupsBillsSplitFlowContract$InputData.f79451c);
    }

    public final int hashCode() {
        return this.f79451c.hashCode() + m.d(this.f79450b, this.f79449a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79449a, i);
        dest.writeSerializable(this.f79450b);
        Iterator itV = p.a.v(this.f79451c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}

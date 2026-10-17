package com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oq9.g;
import oq9.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/payments/groups/impl/ui_new/flow/bills_edit/PaymentsGroupsBillsEditFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "EditCustomBill", "SplitSummary", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_edit/PaymentsGroupsBillsEditFlowContract$Step$EditCustomBill;", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_edit/PaymentsGroupsBillsEditFlowContract$Step$SplitSummary;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PaymentsGroupsBillsEditFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_edit/PaymentsGroupsBillsEditFlowContract$Step$EditCustomBill;", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_edit/PaymentsGroupsBillsEditFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditCustomBill extends PaymentsGroupsBillsEditFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EditCustomBill> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f79430a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditCustomBill((g) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditCustomBill[i];
            }
        }

        public EditCustomBill(g groupBill) {
            Intrinsics.checkNotNullParameter(groupBill, "groupBill");
            this.f79430a = groupBill;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditCustomBill) && Intrinsics.f(this.f79430a, ((EditCustomBill) obj2).f79430a);
        }

        public final int hashCode() {
            return this.f79430a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79430a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_edit/PaymentsGroupsBillsEditFlowContract$Step$SplitSummary;", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_edit/PaymentsGroupsBillsEditFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SplitSummary extends PaymentsGroupsBillsEditFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SplitSummary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentGroup f79431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f79432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BillType f79433c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SplitSummary((PaymentGroup) parcel.readParcelable(SplitSummary.class.getClassLoader()), (i) parcel.readSerializable(), (BillType) parcel.readParcelable(SplitSummary.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SplitSummary[i];
            }
        }

        public SplitSummary(PaymentGroup group, i groupBill, BillType bill) {
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(groupBill, "groupBill");
            Intrinsics.checkNotNullParameter(bill, "bill");
            this.f79431a = group;
            this.f79432b = groupBill;
            this.f79433c = bill;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SplitSummary)) {
                return false;
            }
            SplitSummary splitSummary = (SplitSummary) obj2;
            return Intrinsics.f(this.f79431a, splitSummary.f79431a) && Intrinsics.f(this.f79432b, splitSummary.f79432b) && Intrinsics.f(this.f79433c, splitSummary.f79433c);
        }

        public final int hashCode() {
            return this.f79433c.hashCode() + ((this.f79432b.hashCode() + (this.f79431a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79431a, i);
            dest.writeSerializable(this.f79432b);
            dest.writeParcelable(this.f79433c, i);
        }
    }

    private PaymentsGroupsBillsEditFlowContract$Step() {
    }
}

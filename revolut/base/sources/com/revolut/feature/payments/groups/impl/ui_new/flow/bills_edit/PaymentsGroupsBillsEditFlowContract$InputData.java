package com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oq9.g;
import oq9.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/payments/groups/impl/ui_new/flow/bills_edit/PaymentsGroupsBillsEditFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "EditBill", "EditSplits", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_edit/PaymentsGroupsBillsEditFlowContract$InputData$EditBill;", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_edit/PaymentsGroupsBillsEditFlowContract$InputData$EditSplits;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PaymentsGroupsBillsEditFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_edit/PaymentsGroupsBillsEditFlowContract$InputData$EditBill;", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_edit/PaymentsGroupsBillsEditFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditBill extends PaymentsGroupsBillsEditFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<EditBill> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentGroup f79421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f79422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BillType.CustomBill f79423c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditBill((PaymentGroup) parcel.readParcelable(EditBill.class.getClassLoader()), (g) parcel.readSerializable(), (BillType.CustomBill) parcel.readParcelable(EditBill.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditBill[i];
            }
        }

        public EditBill(PaymentGroup group, g groupBill, BillType.CustomBill bill) {
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(groupBill, "groupBill");
            Intrinsics.checkNotNullParameter(bill, "bill");
            this.f79421a = group;
            this.f79422b = groupBill;
            this.f79423c = bill;
        }

        @Override // com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.PaymentsGroupsBillsEditFlowContract$InputData
        /* JADX INFO: renamed from: a */
        public final BillType getF79426c() {
            return this.f79423c;
        }

        @Override // com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.PaymentsGroupsBillsEditFlowContract$InputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final PaymentGroup getF79424a() {
            return this.f79421a;
        }

        @Override // com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.PaymentsGroupsBillsEditFlowContract$InputData
        /* JADX INFO: renamed from: c */
        public final i getF79425b() {
            return this.f79422b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditBill)) {
                return false;
            }
            EditBill editBill = (EditBill) obj2;
            return Intrinsics.f(this.f79421a, editBill.f79421a) && Intrinsics.f(this.f79422b, editBill.f79422b) && Intrinsics.f(this.f79423c, editBill.f79423c);
        }

        public final int hashCode() {
            return this.f79423c.hashCode() + ((this.f79422b.hashCode() + (this.f79421a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79421a, i);
            dest.writeSerializable(this.f79422b);
            dest.writeParcelable(this.f79423c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_edit/PaymentsGroupsBillsEditFlowContract$InputData$EditSplits;", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_edit/PaymentsGroupsBillsEditFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditSplits extends PaymentsGroupsBillsEditFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<EditSplits> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentGroup f79424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f79425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BillType f79426c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditSplits((PaymentGroup) parcel.readParcelable(EditSplits.class.getClassLoader()), (i) parcel.readSerializable(), (BillType) parcel.readParcelable(EditSplits.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditSplits[i];
            }
        }

        public EditSplits(PaymentGroup group, i groupBill, BillType bill) {
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(groupBill, "groupBill");
            Intrinsics.checkNotNullParameter(bill, "bill");
            this.f79424a = group;
            this.f79425b = groupBill;
            this.f79426c = bill;
        }

        @Override // com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.PaymentsGroupsBillsEditFlowContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BillType getF79426c() {
            return this.f79426c;
        }

        @Override // com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.PaymentsGroupsBillsEditFlowContract$InputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final PaymentGroup getF79424a() {
            return this.f79424a;
        }

        @Override // com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.PaymentsGroupsBillsEditFlowContract$InputData
        /* JADX INFO: renamed from: c, reason: from getter */
        public final i getF79425b() {
            return this.f79425b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditSplits)) {
                return false;
            }
            EditSplits editSplits = (EditSplits) obj2;
            return Intrinsics.f(this.f79424a, editSplits.f79424a) && Intrinsics.f(this.f79425b, editSplits.f79425b) && Intrinsics.f(this.f79426c, editSplits.f79426c);
        }

        public final int hashCode() {
            return this.f79426c.hashCode() + ((this.f79425b.hashCode() + (this.f79424a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79424a, i);
            dest.writeSerializable(this.f79425b);
            dest.writeParcelable(this.f79426c, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract BillType getF79426c();

    /* JADX INFO: renamed from: b */
    public abstract PaymentGroup getF79424a();

    /* JADX INFO: renamed from: c */
    public abstract i getF79425b();
}

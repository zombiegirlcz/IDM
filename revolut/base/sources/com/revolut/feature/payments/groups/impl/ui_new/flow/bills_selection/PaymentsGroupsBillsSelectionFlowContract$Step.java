package com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.bills_chooser.api.common.SplitMethod;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oq9.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/payments/groups/impl/ui_new/flow/bills_selection/PaymentsGroupsBillsSelectionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SelectBills", "SplitSummary", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_selection/PaymentsGroupsBillsSelectionFlowContract$Step$SelectBills;", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_selection/PaymentsGroupsBillsSelectionFlowContract$Step$SplitSummary;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PaymentsGroupsBillsSelectionFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_selection/PaymentsGroupsBillsSelectionFlowContract$Step$SelectBills;", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_selection/PaymentsGroupsBillsSelectionFlowContract$Step;", "<init>", "()V", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectBills extends PaymentsGroupsBillsSelectionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectBills f79441a = new SelectBills();

        @NotNull
        public static final Parcelable.Creator<SelectBills> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectBills.f79441a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectBills[i];
            }
        }

        private SelectBills() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_selection/PaymentsGroupsBillsSelectionFlowContract$Step$SplitSummary;", "Lcom/revolut/feature/payments/groups/impl/ui_new/flow/bills_selection/PaymentsGroupsBillsSelectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SplitSummary extends PaymentsGroupsBillsSelectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SplitSummary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f79442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f79443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SplitMethod f79444c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                o oVar = (o) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(SplitSummary.class, parcel, arrayList, iE, 1);
                }
                return new SplitSummary(oVar, arrayList, (SplitMethod) parcel.readParcelable(SplitSummary.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SplitSummary[i];
            }
        }

        public SplitSummary(o owner, List bills, SplitMethod method) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(bills, "bills");
            Intrinsics.checkNotNullParameter(method, "method");
            this.f79442a = owner;
            this.f79443b = bills;
            this.f79444c = method;
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
            return Intrinsics.f(this.f79442a, splitSummary.f79442a) && Intrinsics.f(this.f79443b, splitSummary.f79443b) && Intrinsics.f(this.f79444c, splitSummary.f79444c);
        }

        public final int hashCode() {
            return this.f79444c.hashCode() + p.a.d(this.f79442a.hashCode() * 31, 31, this.f79443b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79442a);
            Iterator itV = p.a.v(this.f79443b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f79444c, i);
        }
    }

    private PaymentsGroupsBillsSelectionFlowContract$Step() {
    }
}

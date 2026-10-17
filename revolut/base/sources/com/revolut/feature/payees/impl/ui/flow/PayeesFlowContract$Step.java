package com.revolut.feature.payees.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payees.impl.ui.PayeesFlowType;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/payees/impl/ui/flow/PayeesFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Overview", "PayeesList", "PayeesAddNew", "Lcom/revolut/feature/payees/impl/ui/flow/PayeesFlowContract$Step$Overview;", "Lcom/revolut/feature/payees/impl/ui/flow/PayeesFlowContract$Step$PayeesAddNew;", "Lcom/revolut/feature/payees/impl/ui/flow/PayeesFlowContract$Step$PayeesList;", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PayeesFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payees/impl/ui/flow/PayeesFlowContract$Step$Overview;", "Lcom/revolut/feature/payees/impl/ui/flow/PayeesFlowContract$Step;", "<init>", "()V", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Overview implements PayeesFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Overview f78997a = new Overview();

        @NotNull
        public static final Parcelable.Creator<Overview> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Overview.f78997a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Overview[i];
            }
        }

        private Overview() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payees/impl/ui/flow/PayeesFlowContract$Step$PayeesAddNew;", "Lcom/revolut/feature/payees/impl/ui/flow/PayeesFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PayeesAddNew implements PayeesFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PayeesAddNew> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PayeesFlowType f78998a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PayeesAddNew((PayeesFlowType) parcel.readParcelable(PayeesAddNew.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayeesAddNew[i];
            }
        }

        public PayeesAddNew(PayeesFlowType flowType) {
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            this.f78998a = flowType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PayeesAddNew) && Intrinsics.f(this.f78998a, ((PayeesAddNew) obj2).f78998a);
        }

        public final int hashCode() {
            return this.f78998a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f78998a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payees/impl/ui/flow/PayeesFlowContract$Step$PayeesList;", "Lcom/revolut/feature/payees/impl/ui/flow/PayeesFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PayeesList implements PayeesFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PayeesList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PayeesFlowType f78999a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PayeesList((PayeesFlowType) parcel.readParcelable(PayeesList.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayeesList[i];
            }
        }

        public PayeesList(PayeesFlowType flowType) {
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            this.f78999a = flowType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PayeesList) && Intrinsics.f(this.f78999a, ((PayeesList) obj2).f78999a);
        }

        public final int hashCode() {
            return this.f78999a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f78999a, i);
        }
    }
}

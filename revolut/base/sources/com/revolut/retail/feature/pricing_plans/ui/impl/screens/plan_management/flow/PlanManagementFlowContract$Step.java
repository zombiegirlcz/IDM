package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import hha.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_management/flow/PlanManagementFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PlanManagement", "TermsAndConditions", "CancelDowngrade", "SwitchToAnnual", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_management/flow/PlanManagementFlowContract$Step$CancelDowngrade;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_management/flow/PlanManagementFlowContract$Step$PlanManagement;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_management/flow/PlanManagementFlowContract$Step$SwitchToAnnual;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_management/flow/PlanManagementFlowContract$Step$TermsAndConditions;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PlanManagementFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_management/flow/PlanManagementFlowContract$Step$CancelDowngrade;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_management/flow/PlanManagementFlowContract$Step;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CancelDowngrade extends PlanManagementFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CancelDowngrade f103579a = new CancelDowngrade();

        @NotNull
        public static final Parcelable.Creator<CancelDowngrade> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CancelDowngrade.f103579a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelDowngrade[i];
            }
        }

        private CancelDowngrade() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_management/flow/PlanManagementFlowContract$Step$PlanManagement;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_management/flow/PlanManagementFlowContract$Step;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PlanManagement extends PlanManagementFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PlanManagement f103580a = new PlanManagement();

        @NotNull
        public static final Parcelable.Creator<PlanManagement> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PlanManagement.f103580a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanManagement[i];
            }
        }

        private PlanManagement() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_management/flow/PlanManagementFlowContract$Step$SwitchToAnnual;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_management/flow/PlanManagementFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SwitchToAnnual extends PlanManagementFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SwitchToAnnual> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f103581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f103582b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SwitchToAnnual((d) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SwitchToAnnual[i];
            }
        }

        public SwitchToAnnual(d pricingPlan, boolean z) {
            Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
            this.f103581a = pricingPlan;
            this.f103582b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SwitchToAnnual)) {
                return false;
            }
            SwitchToAnnual switchToAnnual = (SwitchToAnnual) obj2;
            return Intrinsics.f(this.f103581a, switchToAnnual.f103581a) && this.f103582b == switchToAnnual.f103582b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f103582b) + (this.f103581a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f103581a);
            dest.writeInt(this.f103582b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_management/flow/PlanManagementFlowContract$Step$TermsAndConditions;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_management/flow/PlanManagementFlowContract$Step;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TermsAndConditions extends PlanManagementFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TermsAndConditions f103583a = new TermsAndConditions();

        @NotNull
        public static final Parcelable.Creator<TermsAndConditions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TermsAndConditions.f103583a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermsAndConditions[i];
            }
        }

        private TermsAndConditions() {
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

    private PlanManagementFlowContract$Step() {
    }
}

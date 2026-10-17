package com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import com.revolut.kompot.navigable.flow.FlowStep;
import hha.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/PlanSelectionCoreFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SelectPlan", "PlanDowngrade", "CancelDowngrade", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/PlanSelectionCoreFlowContract$Step$CancelDowngrade;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/PlanSelectionCoreFlowContract$Step$PlanDowngrade;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/PlanSelectionCoreFlowContract$Step$SelectPlan;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PlanSelectionCoreFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/PlanSelectionCoreFlowContract$Step$CancelDowngrade;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/PlanSelectionCoreFlowContract$Step;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CancelDowngrade extends PlanSelectionCoreFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CancelDowngrade f103082a = new CancelDowngrade();

        @NotNull
        public static final Parcelable.Creator<CancelDowngrade> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CancelDowngrade.f103082a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/PlanSelectionCoreFlowContract$Step$PlanDowngrade;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/PlanSelectionCoreFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanDowngrade extends PlanSelectionCoreFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PlanDowngrade> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f103084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PricingPlanOffer f103085c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanDowngrade(parcel.readString(), i.valueOf(parcel.readString()), (PricingPlanOffer) parcel.readParcelable(PlanDowngrade.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanDowngrade[i];
            }
        }

        public PlanDowngrade(String selectedPlanId, i selectedBilling, PricingPlanOffer pricingPlanOffer) {
            Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
            Intrinsics.checkNotNullParameter(selectedBilling, "selectedBilling");
            this.f103083a = selectedPlanId;
            this.f103084b = selectedBilling;
            this.f103085c = pricingPlanOffer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanDowngrade)) {
                return false;
            }
            PlanDowngrade planDowngrade = (PlanDowngrade) obj2;
            return Intrinsics.f(this.f103083a, planDowngrade.f103083a) && this.f103084b == planDowngrade.f103084b && Intrinsics.f(this.f103085c, planDowngrade.f103085c);
        }

        public final int hashCode() {
            int iHashCode = (this.f103084b.hashCode() + (this.f103083a.hashCode() * 31)) * 31;
            PricingPlanOffer pricingPlanOffer = this.f103085c;
            return iHashCode + (pricingPlanOffer == null ? 0 : pricingPlanOffer.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103083a);
            dest.writeString(this.f103084b.name());
            dest.writeParcelable(this.f103085c, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/PlanSelectionCoreFlowContract$Step$SelectPlan;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/PlanSelectionCoreFlowContract$Step;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectPlan extends PlanSelectionCoreFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectPlan f103086a = new SelectPlan();

        @NotNull
        public static final Parcelable.Creator<SelectPlan> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectPlan.f103086a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectPlan[i];
            }
        }

        private SelectPlan() {
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

    private PlanSelectionCoreFlowContract$Step() {
    }
}

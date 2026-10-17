package com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import hha.d;
import hha.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/PlanSelectionCoreFlowContract$PlanSelectionParams", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanSelectionCoreFlowContract$PlanSelectionParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlanSelectionCoreFlowContract$PlanSelectionParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f103079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f103080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PricingPlanOffer f103081c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlanSelectionCoreFlowContract$PlanSelectionParams((d) parcel.readSerializable(), i.valueOf(parcel.readString()), (PricingPlanOffer) parcel.readParcelable(PlanSelectionCoreFlowContract$PlanSelectionParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanSelectionCoreFlowContract$PlanSelectionParams[i];
        }
    }

    public PlanSelectionCoreFlowContract$PlanSelectionParams(d selectedPlan, i selectedBilling, PricingPlanOffer pricingPlanOffer) {
        Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
        Intrinsics.checkNotNullParameter(selectedBilling, "selectedBilling");
        this.f103079a = selectedPlan;
        this.f103080b = selectedBilling;
        this.f103081c = pricingPlanOffer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanSelectionCoreFlowContract$PlanSelectionParams)) {
            return false;
        }
        PlanSelectionCoreFlowContract$PlanSelectionParams planSelectionCoreFlowContract$PlanSelectionParams = (PlanSelectionCoreFlowContract$PlanSelectionParams) obj2;
        return Intrinsics.f(this.f103079a, planSelectionCoreFlowContract$PlanSelectionParams.f103079a) && this.f103080b == planSelectionCoreFlowContract$PlanSelectionParams.f103080b && Intrinsics.f(this.f103081c, planSelectionCoreFlowContract$PlanSelectionParams.f103081c);
    }

    public final int hashCode() {
        int iHashCode = (this.f103080b.hashCode() + (this.f103079a.hashCode() * 31)) * 31;
        PricingPlanOffer pricingPlanOffer = this.f103081c;
        return iHashCode + (pricingPlanOffer == null ? 0 : pricingPlanOffer.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f103079a);
        dest.writeString(this.f103080b.name());
        dest.writeParcelable(this.f103081c, i);
    }
}

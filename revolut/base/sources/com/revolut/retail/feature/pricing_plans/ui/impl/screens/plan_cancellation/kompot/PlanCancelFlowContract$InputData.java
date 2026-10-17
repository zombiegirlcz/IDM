package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pricingplans.models.PricingPlanUpdateSource;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/PlanCancelFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanCancelFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PlanCancelFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f103482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PricingPlanUpdateSource f103483b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlanCancelFlowContract$InputData(parcel.readInt() != 0, (PricingPlanUpdateSource) parcel.readParcelable(PlanCancelFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanCancelFlowContract$InputData[i];
        }
    }

    public PlanCancelFlowContract$InputData(boolean z, PricingPlanUpdateSource pricingPlanUpdateSource) {
        this.f103482a = z;
        this.f103483b = pricingPlanUpdateSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanCancelFlowContract$InputData)) {
            return false;
        }
        PlanCancelFlowContract$InputData planCancelFlowContract$InputData = (PlanCancelFlowContract$InputData) obj2;
        return this.f103482a == planCancelFlowContract$InputData.f103482a && Intrinsics.f(this.f103483b, planCancelFlowContract$InputData.f103483b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f103482a) * 31;
        PricingPlanUpdateSource pricingPlanUpdateSource = this.f103483b;
        return iHashCode + (pricingPlanUpdateSource == null ? 0 : pricingPlanUpdateSource.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f103482a ? 1 : 0);
        dest.writeParcelable(this.f103483b, i);
    }
}

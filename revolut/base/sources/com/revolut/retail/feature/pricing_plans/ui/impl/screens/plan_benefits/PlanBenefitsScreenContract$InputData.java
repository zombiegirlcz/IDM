package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.pricing_plans.ui.impl.analytics.PricingPlanAnalyticsSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_benefits/PlanBenefitsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanBenefitsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PlanBenefitsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanBenefitsScreenContract$PlanReference f103457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanBenefitsScreenContract$UIConfig f103458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f103459c;
    public final PricingPlanAnalyticsSource d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlanBenefitsScreenContract$InputData((PlanBenefitsScreenContract$PlanReference) parcel.readParcelable(PlanBenefitsScreenContract$InputData.class.getClassLoader()), PlanBenefitsScreenContract$UIConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (PricingPlanAnalyticsSource) parcel.readParcelable(PlanBenefitsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanBenefitsScreenContract$InputData[i];
        }
    }

    public PlanBenefitsScreenContract$InputData(PlanBenefitsScreenContract$PlanReference planReference, PlanBenefitsScreenContract$UIConfig uiConfig, boolean z, PricingPlanAnalyticsSource pricingPlanAnalyticsSource) {
        Intrinsics.checkNotNullParameter(planReference, "planReference");
        Intrinsics.checkNotNullParameter(uiConfig, "uiConfig");
        this.f103457a = planReference;
        this.f103458b = uiConfig;
        this.f103459c = z;
        this.d = pricingPlanAnalyticsSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanBenefitsScreenContract$InputData)) {
            return false;
        }
        PlanBenefitsScreenContract$InputData planBenefitsScreenContract$InputData = (PlanBenefitsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f103457a, planBenefitsScreenContract$InputData.f103457a) && Intrinsics.f(this.f103458b, planBenefitsScreenContract$InputData.f103458b) && this.f103459c == planBenefitsScreenContract$InputData.f103459c && Intrinsics.f(this.d, planBenefitsScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(this.f103457a.hashCode() * 31, 31, this.f103458b.f103463a), 31, this.f103459c);
        PricingPlanAnalyticsSource pricingPlanAnalyticsSource = this.d;
        return iC + (pricingPlanAnalyticsSource == null ? 0 : pricingPlanAnalyticsSource.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f103457a, i);
        this.f103458b.writeToParcel(dest, i);
        dest.writeInt(this.f103459c ? 1 : 0);
        dest.writeParcelable(this.d, i);
    }

    public /* synthetic */ PlanBenefitsScreenContract$InputData(PlanBenefitsScreenContract$PlanReference planBenefitsScreenContract$PlanReference, PlanBenefitsScreenContract$UIConfig planBenefitsScreenContract$UIConfig, boolean z, int i) {
        this(planBenefitsScreenContract$PlanReference, (i & 2) != 0 ? new PlanBenefitsScreenContract$UIConfig(true) : planBenefitsScreenContract$UIConfig, z, (PricingPlanAnalyticsSource) null);
    }
}

package com.revolut.retail.feature.pricing_plans.ui.impl.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$PlanReference;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$UIConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v1.c;
import xfa.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureConfig$InternalPlanBenefits$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InternalPricingPlanFeatureConfig$InternalPlanBenefits$Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<InternalPricingPlanFeatureConfig$InternalPlanBenefits$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanBenefitsScreenContract$PlanReference f103329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f103330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlanBenefitsScreenContract$UIConfig f103331c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InternalPricingPlanFeatureConfig$InternalPlanBenefits$Destination((PlanBenefitsScreenContract$PlanReference) parcel.readParcelable(InternalPricingPlanFeatureConfig$InternalPlanBenefits$Destination.class.getClassLoader()), b.valueOf(parcel.readString()), PlanBenefitsScreenContract$UIConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InternalPricingPlanFeatureConfig$InternalPlanBenefits$Destination[i];
        }
    }

    public InternalPricingPlanFeatureConfig$InternalPlanBenefits$Destination(PlanBenefitsScreenContract$PlanReference planReference, b source, PlanBenefitsScreenContract$UIConfig uiConfig) {
        Intrinsics.checkNotNullParameter(planReference, "planReference");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(uiConfig, "uiConfig");
        this.f103329a = planReference;
        this.f103330b = source;
        this.f103331c = uiConfig;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final PlanBenefitsScreenContract$PlanReference getF103329a() {
        return this.f103329a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PlanBenefitsScreenContract$UIConfig getF103331c() {
        return this.f103331c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InternalPricingPlanFeatureConfig$InternalPlanBenefits$Destination)) {
            return false;
        }
        InternalPricingPlanFeatureConfig$InternalPlanBenefits$Destination internalPricingPlanFeatureConfig$InternalPlanBenefits$Destination = (InternalPricingPlanFeatureConfig$InternalPlanBenefits$Destination) obj2;
        return Intrinsics.f(this.f103329a, internalPricingPlanFeatureConfig$InternalPlanBenefits$Destination.f103329a) && this.f103330b == internalPricingPlanFeatureConfig$InternalPlanBenefits$Destination.f103330b && Intrinsics.f(this.f103331c, internalPricingPlanFeatureConfig$InternalPlanBenefits$Destination.f103331c);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f103331c.f103463a) + c.c(this.f103330b, this.f103329a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f103329a, i);
        dest.writeString(this.f103330b.name());
        this.f103331c.writeToParcel(dest, i);
    }
}

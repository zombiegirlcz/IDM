package com.revolut.retail.feature.pricing_plans.ui.impl.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import hha.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xfa.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureConfig$InternalPlanSwitch$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InternalPricingPlanFeatureConfig$InternalPlanSwitch$Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<InternalPricingPlanFeatureConfig$InternalPlanSwitch$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f103337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f103338b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InternalPricingPlanFeatureConfig$InternalPlanSwitch$Destination((d) parcel.readSerializable(), b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InternalPricingPlanFeatureConfig$InternalPlanSwitch$Destination[i];
        }
    }

    public InternalPricingPlanFeatureConfig$InternalPlanSwitch$Destination(d targetPlan, b source) {
        Intrinsics.checkNotNullParameter(targetPlan, "targetPlan");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f103337a = targetPlan;
        this.f103338b = source;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getF103338b() {
        return this.f103338b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getF103337a() {
        return this.f103337a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InternalPricingPlanFeatureConfig$InternalPlanSwitch$Destination)) {
            return false;
        }
        InternalPricingPlanFeatureConfig$InternalPlanSwitch$Destination internalPricingPlanFeatureConfig$InternalPlanSwitch$Destination = (InternalPricingPlanFeatureConfig$InternalPlanSwitch$Destination) obj2;
        return Intrinsics.f(this.f103337a, internalPricingPlanFeatureConfig$InternalPlanSwitch$Destination.f103337a) && this.f103338b == internalPricingPlanFeatureConfig$InternalPlanSwitch$Destination.f103338b;
    }

    public final int hashCode() {
        return this.f103338b.hashCode() + (this.f103337a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f103337a);
        dest.writeString(this.f103338b.name());
    }
}

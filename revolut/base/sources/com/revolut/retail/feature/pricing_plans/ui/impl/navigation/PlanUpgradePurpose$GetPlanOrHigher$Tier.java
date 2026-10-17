package com.revolut.retail.feature.pricing_plans.ui.impl.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import hha.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/navigation/PlanUpgradePurpose$GetPlanOrHigher$Tier", "", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanUpgradePurpose$GetPlanOrHigher$Tier implements PlanUpgradePurpose {

    @NotNull
    public static final Parcelable.Creator<PlanUpgradePurpose$GetPlanOrHigher$Tier> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f103364a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlanUpgradePurpose$GetPlanOrHigher$Tier(w0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanUpgradePurpose$GetPlanOrHigher$Tier[i];
        }
    }

    public PlanUpgradePurpose$GetPlanOrHigher$Tier(w0 planTier) {
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        this.f103364a = planTier;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PlanUpgradePurpose$GetPlanOrHigher$Tier) && this.f103364a == ((PlanUpgradePurpose$GetPlanOrHigher$Tier) obj2).f103364a;
    }

    public final int hashCode() {
        return this.f103364a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103364a.name());
    }
}

package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import hha.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_hub_v2/bottom_sheet/PlanRevPointsCardsScreenContract$Action", "Landroid/os/Parcelable;", "<init>", "()V", "NavigateRevPoints", "IncreaseRate", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_hub_v2/bottom_sheet/PlanRevPointsCardsScreenContract$Action$IncreaseRate;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_hub_v2/bottom_sheet/PlanRevPointsCardsScreenContract$Action$NavigateRevPoints;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PlanRevPointsCardsScreenContract$Action implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_hub_v2/bottom_sheet/PlanRevPointsCardsScreenContract$Action$IncreaseRate;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_hub_v2/bottom_sheet/PlanRevPointsCardsScreenContract$Action;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IncreaseRate extends PlanRevPointsCardsScreenContract$Action {

        @NotNull
        public static final Parcelable.Creator<IncreaseRate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f103529a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IncreaseRate((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncreaseRate[i];
            }
        }

        public IncreaseRate(d nextPricingPlan) {
            Intrinsics.checkNotNullParameter(nextPricingPlan, "nextPricingPlan");
            this.f103529a = nextPricingPlan;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof IncreaseRate) && Intrinsics.f(this.f103529a, ((IncreaseRate) obj2).f103529a);
        }

        public final int hashCode() {
            return this.f103529a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f103529a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_hub_v2/bottom_sheet/PlanRevPointsCardsScreenContract$Action$NavigateRevPoints;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_hub_v2/bottom_sheet/PlanRevPointsCardsScreenContract$Action;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NavigateRevPoints extends PlanRevPointsCardsScreenContract$Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigateRevPoints f103530a = new NavigateRevPoints();

        @NotNull
        public static final Parcelable.Creator<NavigateRevPoints> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NavigateRevPoints.f103530a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NavigateRevPoints[i];
            }
        }

        private NavigateRevPoints() {
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

    private PlanRevPointsCardsScreenContract$Action() {
    }
}

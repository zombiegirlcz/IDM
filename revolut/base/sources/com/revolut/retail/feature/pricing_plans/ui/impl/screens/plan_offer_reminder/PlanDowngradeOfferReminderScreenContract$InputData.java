package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_reminder;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPeriod;
import hha.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_offer_reminder/PlanDowngradeOfferReminderScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanDowngradeOfferReminderScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PlanDowngradeOfferReminderScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f103600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f103601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PricingPlanOfferPeriod f103602c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlanDowngradeOfferReminderScreenContract$InputData((d) parcel.readSerializable(), (d) parcel.readSerializable(), (PricingPlanOfferPeriod) parcel.readParcelable(PlanDowngradeOfferReminderScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanDowngradeOfferReminderScreenContract$InputData[i];
        }
    }

    public PlanDowngradeOfferReminderScreenContract$InputData(d currentPlan, d selectedPlan, PricingPlanOfferPeriod offerReminder) {
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
        Intrinsics.checkNotNullParameter(offerReminder, "offerReminder");
        this.f103600a = currentPlan;
        this.f103601b = selectedPlan;
        this.f103602c = offerReminder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanDowngradeOfferReminderScreenContract$InputData)) {
            return false;
        }
        PlanDowngradeOfferReminderScreenContract$InputData planDowngradeOfferReminderScreenContract$InputData = (PlanDowngradeOfferReminderScreenContract$InputData) obj2;
        return Intrinsics.f(this.f103600a, planDowngradeOfferReminderScreenContract$InputData.f103600a) && Intrinsics.f(this.f103601b, planDowngradeOfferReminderScreenContract$InputData.f103601b) && Intrinsics.f(this.f103602c, planDowngradeOfferReminderScreenContract$InputData.f103602c);
    }

    public final int hashCode() {
        return this.f103602c.hashCode() + ((this.f103601b.hashCode() + (this.f103600a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f103600a);
        dest.writeSerializable(this.f103601b);
        dest.writeParcelable(this.f103602c, i);
    }
}

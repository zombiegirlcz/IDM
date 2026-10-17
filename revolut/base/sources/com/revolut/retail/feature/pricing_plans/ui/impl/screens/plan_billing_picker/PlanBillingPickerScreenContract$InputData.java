package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_billing_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.pricing_plans.ui.impl.analytics.PricingPlanAnalyticsSource;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$Mode;
import com.revolut.retail.feature.pricing_plans.ui.impl.model.SelectedBillingPlan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_billing_picker/PlanBillingPickerScreenContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanBillingPickerScreenContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlanBillingPickerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectedBillingPlan f103477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanBillingPickerContract$Mode f103478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PricingPlanAnalyticsSource f103479c;
    public final xfa.a d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlanBillingPickerScreenContract$InputData((SelectedBillingPlan) parcel.readParcelable(PlanBillingPickerScreenContract$InputData.class.getClassLoader()), (PlanBillingPickerContract$Mode) parcel.readParcelable(PlanBillingPickerScreenContract$InputData.class.getClassLoader()), (PricingPlanAnalyticsSource) parcel.readParcelable(PlanBillingPickerScreenContract$InputData.class.getClassLoader()), (xfa.a) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanBillingPickerScreenContract$InputData[i];
        }
    }

    public PlanBillingPickerScreenContract$InputData(SelectedBillingPlan planReference, PlanBillingPickerContract$Mode mode, PricingPlanAnalyticsSource source, xfa.a aVar) {
        Intrinsics.checkNotNullParameter(planReference, "planReference");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f103477a = planReference;
        this.f103478b = mode;
        this.f103479c = source;
        this.d = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanBillingPickerScreenContract$InputData)) {
            return false;
        }
        PlanBillingPickerScreenContract$InputData planBillingPickerScreenContract$InputData = (PlanBillingPickerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f103477a, planBillingPickerScreenContract$InputData.f103477a) && Intrinsics.f(this.f103478b, planBillingPickerScreenContract$InputData.f103478b) && Intrinsics.f(this.f103479c, planBillingPickerScreenContract$InputData.f103479c) && Intrinsics.f(this.d, planBillingPickerScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f103479c.hashCode() + ((this.f103478b.hashCode() + (this.f103477a.hashCode() * 31)) * 31)) * 31;
        xfa.a aVar = this.d;
        return iHashCode + (aVar == null ? 0 : aVar.f305202a.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f103477a, i);
        dest.writeParcelable(this.f103478b, i);
        dest.writeParcelable(this.f103479c, i);
        dest.writeSerializable(this.d);
    }
}

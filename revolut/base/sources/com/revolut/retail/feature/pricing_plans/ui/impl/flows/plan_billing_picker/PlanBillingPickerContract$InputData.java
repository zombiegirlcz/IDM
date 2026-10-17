package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.pricing_plans.ui.impl.analytics.PricingPlanAnalyticsSource;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$Mode;
import com.revolut.retail.feature.pricing_plans.ui.impl.model.SelectedBillingPlan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xfa.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_billing_picker/PlanBillingPickerContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanBillingPickerContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlanBillingPickerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectedBillingPlan f103106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanBillingPickerContract$Mode f103107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PricingPlanAnalyticsSource f103108c;
    public final boolean d;
    public final xfa.a e;
    public final PlanBillingPickerContract$BillingOptionHandlingMode f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f103109g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlanBillingPickerContract$InputData((SelectedBillingPlan) parcel.readParcelable(PlanBillingPickerContract$InputData.class.getClassLoader()), (PlanBillingPickerContract$Mode) parcel.readParcelable(PlanBillingPickerContract$InputData.class.getClassLoader()), (PricingPlanAnalyticsSource) parcel.readParcelable(PlanBillingPickerContract$InputData.class.getClassLoader()), parcel.readInt() != 0, (xfa.a) parcel.readSerializable(), PlanBillingPickerContract$BillingOptionHandlingMode.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanBillingPickerContract$InputData[i];
        }
    }

    public PlanBillingPickerContract$InputData(SelectedBillingPlan selectedPlan, PlanBillingPickerContract$Mode mode, PricingPlanAnalyticsSource source, boolean z, xfa.a aVar, PlanBillingPickerContract$BillingOptionHandlingMode billingOptionHandlingMode, String str) {
        Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(billingOptionHandlingMode, "billingOptionHandlingMode");
        this.f103106a = selectedPlan;
        this.f103107b = mode;
        this.f103108c = source;
        this.d = z;
        this.e = aVar;
        this.f = billingOptionHandlingMode;
        this.f103109g = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanBillingPickerContract$InputData)) {
            return false;
        }
        PlanBillingPickerContract$InputData planBillingPickerContract$InputData = (PlanBillingPickerContract$InputData) obj2;
        return Intrinsics.f(this.f103106a, planBillingPickerContract$InputData.f103106a) && Intrinsics.f(this.f103107b, planBillingPickerContract$InputData.f103107b) && Intrinsics.f(this.f103108c, planBillingPickerContract$InputData.f103108c) && this.d == planBillingPickerContract$InputData.d && Intrinsics.f(this.e, planBillingPickerContract$InputData.e) && this.f == planBillingPickerContract$InputData.f && Intrinsics.f(this.f103109g, planBillingPickerContract$InputData.f103109g);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f103108c.hashCode() + ((this.f103107b.hashCode() + (this.f103106a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        xfa.a aVar = this.e;
        int iHashCode = (this.f.hashCode() + ((iC + (aVar == null ? 0 : aVar.f305202a.hashCode())) * 31)) * 31;
        String str = this.f103109g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f103106a, i);
        dest.writeParcelable(this.f103107b, i);
        dest.writeParcelable(this.f103108c, i);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeSerializable(this.e);
        this.f.writeToParcel(dest, i);
        dest.writeString(this.f103109g);
    }

    public /* synthetic */ PlanBillingPickerContract$InputData(SelectedBillingPlan selectedBillingPlan, PlanBillingPickerContract$Mode.Standalone standalone, PricingPlanAnalyticsSource pricingPlanAnalyticsSource, boolean z, PlanBillingPickerContract$BillingOptionHandlingMode planBillingPickerContract$BillingOptionHandlingMode, String str, int i) {
        this(selectedBillingPlan, standalone, pricingPlanAnalyticsSource, z, (xfa.a) null, (i & 32) != 0 ? PlanBillingPickerContract$BillingOptionHandlingMode.ReturnSelection : planBillingPickerContract$BillingOptionHandlingMode, str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PlanBillingPickerContract$InputData(SelectedBillingPlan selectedPlan, PlanBillingPickerContract$Mode.Standalone standalone, b source, boolean z, xfa.a aVar, int i) {
        PlanBillingPickerContract$Mode mode = (i & 2) != 0 ? PlanBillingPickerContract$Mode.Legacy.f103110a : standalone;
        aVar = (i & 16) != 0 ? null : aVar;
        PlanBillingPickerContract$BillingOptionHandlingMode billingOptionHandlingMode = PlanBillingPickerContract$BillingOptionHandlingMode.ReturnSelection;
        Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(billingOptionHandlingMode, "billingOptionHandlingMode");
        this(selectedPlan, mode, new PricingPlanAnalyticsSource.Predefined(source), z, aVar, billingOptionHandlingMode, (String) null);
    }
}

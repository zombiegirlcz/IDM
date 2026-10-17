package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanSwitchToAnnualSavings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanSwitchToAnnualSavings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PricingPlanSwitchToAnnualSavings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f102856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f102857b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PricingPlanSwitchToAnnualSavings(parcel.readDouble(), (dj0.d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanSwitchToAnnualSavings[i];
        }
    }

    public PricingPlanSwitchToAnnualSavings(double d, dj0.d moneySaved) {
        Intrinsics.checkNotNullParameter(moneySaved, "moneySaved");
        this.f102856a = d;
        this.f102857b = moneySaved;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanSwitchToAnnualSavings)) {
            return false;
        }
        PricingPlanSwitchToAnnualSavings pricingPlanSwitchToAnnualSavings = (PricingPlanSwitchToAnnualSavings) obj2;
        return Double.compare(this.f102856a, pricingPlanSwitchToAnnualSavings.f102856a) == 0 && Intrinsics.f(this.f102857b, pricingPlanSwitchToAnnualSavings.f102857b);
    }

    public final int hashCode() {
        return this.f102857b.hashCode() + (Double.hashCode(this.f102856a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.f102856a);
        dest.writeSerializable(this.f102857b);
    }
}

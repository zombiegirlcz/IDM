package com.revolut.retail.feature.pricing_plans.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingRefund;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanGiftBenefits$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanGiftBenefits$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PricingPlanGiftBenefits$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanGiftingRefund f102956b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PricingPlanGiftBenefits$InputData(parcel.readString(), (PlanGiftingRefund) parcel.readParcelable(PricingPlanGiftBenefits$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanGiftBenefits$InputData[i];
        }
    }

    public PricingPlanGiftBenefits$InputData(String giftId, PlanGiftingRefund planGiftingRefund) {
        Intrinsics.checkNotNullParameter(giftId, "giftId");
        this.f102955a = giftId;
        this.f102956b = planGiftingRefund;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF102955a() {
        return this.f102955a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PlanGiftingRefund getF102956b() {
        return this.f102956b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanGiftBenefits$InputData)) {
            return false;
        }
        PricingPlanGiftBenefits$InputData pricingPlanGiftBenefits$InputData = (PricingPlanGiftBenefits$InputData) obj2;
        return Intrinsics.f(this.f102955a, pricingPlanGiftBenefits$InputData.f102955a) && Intrinsics.f(this.f102956b, pricingPlanGiftBenefits$InputData.f102956b);
    }

    public final int hashCode() {
        int iHashCode = this.f102955a.hashCode() * 31;
        PlanGiftingRefund planGiftingRefund = this.f102956b;
        return iHashCode + (planGiftingRefund == null ? 0 : planGiftingRefund.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102955a);
        dest.writeParcelable(this.f102956b, i);
    }
}

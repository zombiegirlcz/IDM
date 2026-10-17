package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.info_bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$InfoBottomSheet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_page/info_bottom_sheet/PricingPlanInfoBottomSheetScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanInfoBottomSheetScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PricingPlanInfoBottomSheetScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlansDashboardLayout$PlanPageLayout$InfoBottomSheet f103620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f103621c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PricingPlanInfoBottomSheetScreenContract$InputData(parcel.readString(), (PlansDashboardLayout$PlanPageLayout$InfoBottomSheet) parcel.readParcelable(PricingPlanInfoBottomSheetScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanInfoBottomSheetScreenContract$InputData[i];
        }
    }

    public PricingPlanInfoBottomSheetScreenContract$InputData(String planId, PlansDashboardLayout$PlanPageLayout$InfoBottomSheet payload, boolean z) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f103619a = planId;
        this.f103620b = payload;
        this.f103621c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanInfoBottomSheetScreenContract$InputData)) {
            return false;
        }
        PricingPlanInfoBottomSheetScreenContract$InputData pricingPlanInfoBottomSheetScreenContract$InputData = (PricingPlanInfoBottomSheetScreenContract$InputData) obj2;
        return Intrinsics.f(this.f103619a, pricingPlanInfoBottomSheetScreenContract$InputData.f103619a) && Intrinsics.f(this.f103620b, pricingPlanInfoBottomSheetScreenContract$InputData.f103620b) && this.f103621c == pricingPlanInfoBottomSheetScreenContract$InputData.f103621c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f103621c) + ((this.f103620b.hashCode() + (this.f103619a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103619a);
        dest.writeParcelable(this.f103620b, i);
        dest.writeInt(this.f103621c ? 1 : 0);
    }
}

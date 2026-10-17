package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BottomSheet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_page/bottom_sheet/PlanPageBottomSheetContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanPageBottomSheetContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PlanPageBottomSheetContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlansDashboardLayout$PlanPageLayout$BottomSheet f103616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f103617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CircleBadgeModel f103618c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlanPageBottomSheetContract$InputData((PlansDashboardLayout$PlanPageLayout$BottomSheet) parcel.readParcelable(PlanPageBottomSheetContract$InputData.class.getClassLoader()), parcel.readInt() != 0, (CircleBadgeModel) parcel.readParcelable(PlanPageBottomSheetContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanPageBottomSheetContract$InputData[i];
        }
    }

    public PlanPageBottomSheetContract$InputData(PlansDashboardLayout$PlanPageLayout$BottomSheet bottomSheet, boolean z, CircleBadgeModel circleBadgeModel) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f103616a = bottomSheet;
        this.f103617b = z;
        this.f103618c = circleBadgeModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanPageBottomSheetContract$InputData)) {
            return false;
        }
        PlanPageBottomSheetContract$InputData planPageBottomSheetContract$InputData = (PlanPageBottomSheetContract$InputData) obj2;
        return Intrinsics.f(this.f103616a, planPageBottomSheetContract$InputData.f103616a) && this.f103617b == planPageBottomSheetContract$InputData.f103617b && Intrinsics.f(this.f103618c, planPageBottomSheetContract$InputData.f103618c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f103616a.hashCode() * 31, 31, this.f103617b);
        CircleBadgeModel circleBadgeModel = this.f103618c;
        return iC + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f103616a, i);
        dest.writeInt(this.f103617b ? 1 : 0);
        dest.writeParcelable(this.f103618c, i);
    }
}

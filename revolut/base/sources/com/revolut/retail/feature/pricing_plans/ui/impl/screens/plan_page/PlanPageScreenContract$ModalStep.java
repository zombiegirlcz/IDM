package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BottomSheet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_page/PlanPageScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "PlanPagerBottomSheet", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_page/PlanPageScreenContract$ModalStep$PlanPagerBottomSheet;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlanPageScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_page/PlanPageScreenContract$ModalStep$PlanPagerBottomSheet;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_page/PlanPageScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanPagerBottomSheet implements PlanPageScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PlanPagerBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlansDashboardLayout$PlanPageLayout$BottomSheet f103607a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanPagerBottomSheet((PlansDashboardLayout$PlanPageLayout$BottomSheet) parcel.readParcelable(PlanPagerBottomSheet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanPagerBottomSheet[i];
            }
        }

        public PlanPagerBottomSheet(PlansDashboardLayout$PlanPageLayout$BottomSheet bottomSheetScreen) {
            Intrinsics.checkNotNullParameter(bottomSheetScreen, "bottomSheetScreen");
            this.f103607a = bottomSheetScreen;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanPagerBottomSheet) && Intrinsics.f(this.f103607a, ((PlanPagerBottomSheet) obj2).f103607a);
        }

        public final int hashCode() {
            return this.f103607a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103607a, i);
        }
    }
}

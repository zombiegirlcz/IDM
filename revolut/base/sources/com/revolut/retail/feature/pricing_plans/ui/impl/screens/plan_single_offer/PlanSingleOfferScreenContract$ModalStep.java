package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BottomSheet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_single_offer/PlanSingleOfferScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "BottomSheet", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_single_offer/PlanSingleOfferScreenContract$ModalStep$BottomSheet;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PlanSingleOfferScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_single_offer/PlanSingleOfferScreenContract$ModalStep$BottomSheet;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_single_offer/PlanSingleOfferScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BottomSheet extends PlanSingleOfferScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlansDashboardLayout$PlanPageLayout$BottomSheet f103629a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BottomSheet((PlansDashboardLayout$PlanPageLayout$BottomSheet) parcel.readParcelable(BottomSheet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BottomSheet[i];
            }
        }

        public BottomSheet(PlansDashboardLayout$PlanPageLayout$BottomSheet bottomSheet) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            this.f103629a = bottomSheet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BottomSheet) && Intrinsics.f(this.f103629a, ((BottomSheet) obj2).f103629a);
        }

        public final int hashCode() {
            return this.f103629a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103629a, i);
        }
    }

    private PlanSingleOfferScreenContract$ModalStep() {
    }
}

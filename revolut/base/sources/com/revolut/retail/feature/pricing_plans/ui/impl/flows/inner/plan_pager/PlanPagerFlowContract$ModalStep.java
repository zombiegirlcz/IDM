package com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$InfoBottomSheet;
import hha.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "PlanPriceBreakdown", "InfoBottomSheet", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$ModalStep$InfoBottomSheet;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$ModalStep$PlanPriceBreakdown;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlanPagerFlowContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$ModalStep$InfoBottomSheet;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InfoBottomSheet implements PlanPagerFlowContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<InfoBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PlansDashboardLayout$PlanPageLayout$InfoBottomSheet f103051b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InfoBottomSheet(parcel.readString(), (PlansDashboardLayout$PlanPageLayout$InfoBottomSheet) parcel.readParcelable(InfoBottomSheet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InfoBottomSheet[i];
            }
        }

        public InfoBottomSheet(String planId, PlansDashboardLayout$PlanPageLayout$InfoBottomSheet payload) {
            Intrinsics.checkNotNullParameter(planId, "planId");
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.f103050a = planId;
            this.f103051b = payload;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InfoBottomSheet)) {
                return false;
            }
            InfoBottomSheet infoBottomSheet = (InfoBottomSheet) obj2;
            return Intrinsics.f(this.f103050a, infoBottomSheet.f103050a) && Intrinsics.f(this.f103051b, infoBottomSheet.f103051b);
        }

        public final int hashCode() {
            return this.f103051b.hashCode() + (this.f103050a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103050a);
            dest.writeParcelable(this.f103051b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$ModalStep$PlanPriceBreakdown;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanPriceBreakdown implements PlanPagerFlowContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PlanPriceBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f103053b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanPriceBreakdown((o) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanPriceBreakdown[i];
            }
        }

        public PlanPriceBreakdown(o charge, String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(charge, "charge");
            this.f103052a = title;
            this.f103053b = charge;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanPriceBreakdown)) {
                return false;
            }
            PlanPriceBreakdown planPriceBreakdown = (PlanPriceBreakdown) obj2;
            return Intrinsics.f(this.f103052a, planPriceBreakdown.f103052a) && Intrinsics.f(this.f103053b, planPriceBreakdown.f103053b);
        }

        public final int hashCode() {
            return this.f103053b.hashCode() + (this.f103052a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103052a);
            dest.writeSerializable(this.f103053b);
        }
    }
}

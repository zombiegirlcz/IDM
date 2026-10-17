package com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem;
import ggk.g1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$PlanPagerItem", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "<init>", "()V", "PlanLoadingItem", "PlanErrorItem", "PlanItem", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$PlanPagerItem$PlanErrorItem;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$PlanPagerItem$PlanItem;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$PlanPagerItem$PlanLoadingItem;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PlanPagerFlowContract$PlanPagerItem implements FixedIdPagerItem {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$PlanPagerItem$PlanErrorItem;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$PlanPagerItem;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PlanErrorItem extends PlanPagerFlowContract$PlanPagerItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PlanErrorItem f103054a = new PlanErrorItem();

        @NotNull
        public static final Parcelable.Creator<PlanErrorItem> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PlanErrorItem.f103054a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanErrorItem[i];
            }
        }

        private PlanErrorItem() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$PlanPagerItem$PlanItem;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$PlanPagerItem;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PlanItem extends PlanPagerFlowContract$PlanPagerItem {

        @NotNull
        public static final Parcelable.Creator<PlanItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g1 f103056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f103057c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanItem(parcel.readString(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanItem[i];
            }
        }

        public PlanItem(String planId, g1 g1Var) {
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f103055a = planId;
            this.f103056b = g1Var;
            this.f103057c = planId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!PlanItem.class.equals(obj2 != null ? obj2.getClass() : null)) {
                return false;
            }
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlowContract.PlanPagerItem.PlanItem");
            return Intrinsics.f(this.f103055a, ((PlanItem) obj2).f103055a);
        }

        @Override // com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem, com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF103057c() {
            return this.f103057c;
        }

        public final int hashCode() {
            return this.f103055a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103055a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$PlanPagerItem$PlanLoadingItem;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$PlanPagerItem;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PlanLoadingItem extends PlanPagerFlowContract$PlanPagerItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PlanLoadingItem f103058a = new PlanLoadingItem();

        @NotNull
        public static final Parcelable.Creator<PlanLoadingItem> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PlanLoadingItem.f103058a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanLoadingItem[i];
            }
        }

        private PlanLoadingItem() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private PlanPagerFlowContract$PlanPagerItem() {
    }
}

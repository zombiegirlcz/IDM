package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "ByOfferType", "ByPrompt", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$InputData$ByOfferType;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$InputData$ByPrompt;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlanOfferFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$InputData$ByOfferType;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByOfferType implements PlanOfferFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ByOfferType> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f103192b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByOfferType(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByOfferType[i];
            }
        }

        public ByOfferType(String offerType, boolean z) {
            Intrinsics.checkNotNullParameter(offerType, "offerType");
            this.f103191a = offerType;
            this.f103192b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ByOfferType)) {
                return false;
            }
            ByOfferType byOfferType = (ByOfferType) obj2;
            return Intrinsics.f(this.f103191a, byOfferType.f103191a) && this.f103192b == byOfferType.f103192b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f103192b) + (this.f103191a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103191a);
            dest.writeInt(this.f103192b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$InputData$ByPrompt;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "com/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/a", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByPrompt implements PlanOfferFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ByPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PricingPlanOfferPrompt.Available f103193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.a f103194b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByPrompt((PricingPlanOfferPrompt.Available) parcel.readParcelable(ByPrompt.class.getClassLoader()), com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByPrompt[i];
            }
        }

        public ByPrompt(PricingPlanOfferPrompt.Available offer, com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.a style) {
            Intrinsics.checkNotNullParameter(offer, "offer");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f103193a = offer;
            this.f103194b = style;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ByPrompt)) {
                return false;
            }
            ByPrompt byPrompt = (ByPrompt) obj2;
            return Intrinsics.f(this.f103193a, byPrompt.f103193a) && this.f103194b == byPrompt.f103194b;
        }

        public final int hashCode() {
            return this.f103194b.hashCode() + (this.f103193a.f102847a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103193a, i);
            dest.writeString(this.f103194b.name());
        }

        public /* synthetic */ ByPrompt(PricingPlanOfferPrompt.Available available) {
            this(available, com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.a.BOTTOM_SHEET);
        }
    }
}

package com.revolut.retail.feature.pricing_plans.ui.impl.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanContextualSelectionLayoutParams;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt;
import com.revolut.retail.feature.pricing_plans.ui.impl.analytics.PricingPlanAnalyticsSource;
import hha.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "PlanOffer", "PromptOffer", "PlanContextualSelection", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureDestination$PlanContextualSelection;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureDestination$PlanOffer;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureDestination$PromptOffer;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InternalPricingPlanFeatureDestination extends KompotDestination {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureDestination$PlanContextualSelection;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanContextualSelection implements InternalPricingPlanFeatureDestination {

        @NotNull
        public static final Parcelable.Creator<PlanContextualSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PricingPlanAnalyticsSource f103350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f103351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final w0 f103352c;
        public final PricingPlanContextualSelectionLayoutParams d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanContextualSelection((PricingPlanAnalyticsSource) parcel.readParcelable(PlanContextualSelection.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : w0.valueOf(parcel.readString()), (PricingPlanContextualSelectionLayoutParams) parcel.readParcelable(PlanContextualSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanContextualSelection[i];
            }
        }

        public PlanContextualSelection(PricingPlanAnalyticsSource source, String promptType, w0 w0Var, PricingPlanContextualSelectionLayoutParams pricingPlanContextualSelectionLayoutParams) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(promptType, "promptType");
            this.f103350a = source;
            this.f103351b = promptType;
            this.f103352c = w0Var;
            this.d = pricingPlanContextualSelectionLayoutParams;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PricingPlanContextualSelectionLayoutParams getD() {
            return this.d;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF103351b() {
            return this.f103351b;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final PricingPlanAnalyticsSource getF103350a() {
            return this.f103350a;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final w0 getF103352c() {
            return this.f103352c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanContextualSelection)) {
                return false;
            }
            PlanContextualSelection planContextualSelection = (PlanContextualSelection) obj2;
            return Intrinsics.f(this.f103350a, planContextualSelection.f103350a) && Intrinsics.f(this.f103351b, planContextualSelection.f103351b) && this.f103352c == planContextualSelection.f103352c && Intrinsics.f(this.d, planContextualSelection.d);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f103350a.hashCode() * 31, 31, this.f103351b);
            w0 w0Var = this.f103352c;
            int iHashCode = (iC + (w0Var == null ? 0 : w0Var.hashCode())) * 31;
            PricingPlanContextualSelectionLayoutParams pricingPlanContextualSelectionLayoutParams = this.d;
            return iHashCode + (pricingPlanContextualSelectionLayoutParams != null ? pricingPlanContextualSelectionLayoutParams.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103350a, i);
            dest.writeString(this.f103351b);
            w0 w0Var = this.f103352c;
            if (w0Var == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(w0Var.name());
            }
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureDestination$PlanOffer;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanOffer implements InternalPricingPlanFeatureDestination {

        @NotNull
        public static final Parcelable.Creator<PlanOffer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103353a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanOffer(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanOffer[i];
            }
        }

        public PlanOffer(String offerType) {
            Intrinsics.checkNotNullParameter(offerType, "offerType");
            this.f103353a = offerType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF103353a() {
            return this.f103353a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanOffer) && Intrinsics.f(this.f103353a, ((PlanOffer) obj2).f103353a);
        }

        public final int hashCode() {
            return this.f103353a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103353a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureDestination$PromptOffer;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PromptOffer implements InternalPricingPlanFeatureDestination {

        @NotNull
        public static final Parcelable.Creator<PromptOffer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PricingPlanOfferPrompt.Available f103354a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PromptOffer((PricingPlanOfferPrompt.Available) parcel.readParcelable(PromptOffer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PromptOffer[i];
            }
        }

        public PromptOffer(PricingPlanOfferPrompt.Available offer) {
            Intrinsics.checkNotNullParameter(offer, "offer");
            this.f103354a = offer;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PricingPlanOfferPrompt.Available getF103354a() {
            return this.f103354a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PromptOffer) && Intrinsics.f(this.f103354a, ((PromptOffer) obj2).f103354a);
        }

        public final int hashCode() {
            return this.f103354a.f102847a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103354a, i);
        }
    }
}

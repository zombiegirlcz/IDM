package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanOfferPrompt;", "Landroid/os/Parcelable;", "Available", "Unavailable", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanOfferPrompt$Available;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanOfferPrompt$Unavailable;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PricingPlanOfferPrompt extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanOfferPrompt$Available;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanOfferPrompt;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Available implements PricingPlanOfferPrompt {

        @NotNull
        public static final Parcelable.Creator<Available> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlanOfferPromptLayout f102847a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Available(PlanOfferPromptLayout.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Available[i];
            }
        }

        public Available(PlanOfferPromptLayout layout) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            this.f102847a = layout;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Available) && Intrinsics.f(this.f102847a, ((Available) obj2).f102847a);
        }

        public final int hashCode() {
            return this.f102847a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f102847a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanOfferPrompt$Unavailable;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanOfferPrompt;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Unavailable implements PricingPlanOfferPrompt {

        @NotNull
        public static final Parcelable.Creator<Unavailable> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PricingPlanOfferPromptErrorModel f102848a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Unavailable(PricingPlanOfferPromptErrorModel.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unavailable[i];
            }
        }

        public Unavailable(PricingPlanOfferPromptErrorModel error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f102848a = error;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Unavailable) && Intrinsics.f(this.f102848a, ((Unavailable) obj2).f102848a);
        }

        public final int hashCode() {
            return this.f102848a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f102848a.writeToParcel(dest, i);
        }
    }
}

package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetDescriptor;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_hub_v2/screen/PlanHubV2ScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ProductArticle", "PromptOffer", "BeDrivenModal", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_hub_v2/screen/PlanHubV2ScreenContract$ModalStep$BeDrivenModal;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_hub_v2/screen/PlanHubV2ScreenContract$ModalStep$ProductArticle;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_hub_v2/screen/PlanHubV2ScreenContract$ModalStep$PromptOffer;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlanHubV2ScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_hub_v2/screen/PlanHubV2ScreenContract$ModalStep$BeDrivenModal;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_hub_v2/screen/PlanHubV2ScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BeDrivenModal implements PlanHubV2ScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BeDrivenModal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PricingPlanBottomSheetDescriptor.BottomSheet f103559a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BeDrivenModal((PricingPlanBottomSheetDescriptor.BottomSheet) parcel.readParcelable(BeDrivenModal.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BeDrivenModal[i];
            }
        }

        public BeDrivenModal(PricingPlanBottomSheetDescriptor.BottomSheet bottomSheet) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            this.f103559a = bottomSheet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BeDrivenModal) && Intrinsics.f(this.f103559a, ((BeDrivenModal) obj2).f103559a);
        }

        public final int hashCode() {
            return this.f103559a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103559a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_hub_v2/screen/PlanHubV2ScreenContract$ModalStep$ProductArticle;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_hub_v2/screen/PlanHubV2ScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticle implements PlanHubV2ScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f103561b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new ProductArticle(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        public ProductArticle(String id10, Map params) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(params, "params");
            this.f103560a = id10;
            this.f103561b = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProductArticle)) {
                return false;
            }
            ProductArticle productArticle = (ProductArticle) obj2;
            return Intrinsics.f(this.f103560a, productArticle.f103560a) && Intrinsics.f(this.f103561b, productArticle.f103561b);
        }

        public final int hashCode() {
            return this.f103561b.hashCode() + (this.f103560a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103560a);
            Iterator itZ = j6.a.z(this.f103561b, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_hub_v2/screen/PlanHubV2ScreenContract$ModalStep$PromptOffer;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_hub_v2/screen/PlanHubV2ScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PromptOffer implements PlanHubV2ScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PromptOffer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PricingPlanOfferPrompt.Available f103562a;

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
            this.f103562a = offer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PromptOffer) && Intrinsics.f(this.f103562a, ((PromptOffer) obj2).f103562a);
        }

        public final int hashCode() {
            return this.f103562a.f102847a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103562a, i);
        }
    }
}

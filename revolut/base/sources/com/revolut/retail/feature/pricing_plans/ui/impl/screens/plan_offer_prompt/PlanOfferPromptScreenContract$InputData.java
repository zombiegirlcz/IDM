package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_offer_prompt/PlanOfferPromptScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "ByOfferType", "ByPrefetchedOffer", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_offer_prompt/PlanOfferPromptScreenContract$InputData$ByOfferType;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_offer_prompt/PlanOfferPromptScreenContract$InputData$ByPrefetchedOffer;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlanOfferPromptScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_offer_prompt/PlanOfferPromptScreenContract$InputData$ByPrefetchedOffer;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_offer_prompt/PlanOfferPromptScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByPrefetchedOffer implements PlanOfferPromptScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ByPrefetchedOffer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PricingPlanOfferPrompt.Available f103594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f103595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f103596c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByPrefetchedOffer((PricingPlanOfferPrompt.Available) parcel.readParcelable(ByPrefetchedOffer.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByPrefetchedOffer[i];
            }
        }

        public ByPrefetchedOffer(PricingPlanOfferPrompt.Available offer, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(offer, "offer");
            this.f103594a = offer;
            this.f103595b = z;
            this.f103596c = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ByPrefetchedOffer)) {
                return false;
            }
            ByPrefetchedOffer byPrefetchedOffer = (ByPrefetchedOffer) obj2;
            return Intrinsics.f(this.f103594a, byPrefetchedOffer.f103594a) && this.f103595b == byPrefetchedOffer.f103595b && this.f103596c == byPrefetchedOffer.f103596c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f103596c) + j6.a.c(this.f103594a.f102847a.hashCode() * 31, 31, this.f103595b);
        }

        @Override // com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.PlanOfferPromptScreenContract$InputData
        /* JADX INFO: renamed from: o5, reason: from getter */
        public final boolean getF103596c() {
            return this.f103596c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103594a, i);
            dest.writeInt(this.f103595b ? 1 : 0);
            dest.writeInt(this.f103596c ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: o5 */
    boolean getF103596c();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_offer_prompt/PlanOfferPromptScreenContract$InputData$ByOfferType;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_offer_prompt/PlanOfferPromptScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByOfferType implements PlanOfferPromptScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ByOfferType> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f103592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f103593c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByOfferType(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByOfferType[i];
            }
        }

        public ByOfferType(String offerType, boolean z, String str, boolean z3) {
            Intrinsics.checkNotNullParameter(offerType, "offerType");
            this.f103591a = offerType;
            this.f103592b = z;
            this.f103593c = str;
            this.d = z3;
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
            return Intrinsics.f(this.f103591a, byOfferType.f103591a) && this.f103592b == byOfferType.f103592b && Intrinsics.f(this.f103593c, byOfferType.f103593c) && this.d == byOfferType.d;
        }

        public final int hashCode() {
            int iC = j6.a.c(this.f103591a.hashCode() * 31, 31, this.f103592b);
            String str = this.f103593c;
            return Boolean.hashCode(this.d) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.PlanOfferPromptScreenContract$InputData
        /* JADX INFO: renamed from: o5, reason: from getter */
        public final boolean getF103596c() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103591a);
            dest.writeInt(this.f103592b ? 1 : 0);
            dest.writeString(this.f103593c);
            dest.writeInt(this.d ? 1 : 0);
        }

        public /* synthetic */ ByOfferType(int i, String str, boolean z, String str2) {
            this(str, z, (i & 4) != 0 ? null : str2, false);
        }
    }
}

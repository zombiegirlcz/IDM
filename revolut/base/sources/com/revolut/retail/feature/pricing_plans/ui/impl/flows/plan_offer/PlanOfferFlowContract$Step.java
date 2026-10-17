package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt;
import hha.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Prompt", "BottomSheetPromptOffer", "FullScreenPromptOffer", "PlanBenefits", "BillingPicker", "PlanDocuments", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$Step$BillingPicker;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$Step$BottomSheetPromptOffer;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$Step$FullScreenPromptOffer;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$Step$PlanBenefits;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$Step$PlanDocuments;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$Step$Prompt;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlanOfferFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$Step$BillingPicker;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillingPicker implements PlanOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BillingPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f103196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f103197c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillingPicker(parcel.readInt() == 0 ? null : i.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillingPicker[i];
            }
        }

        public BillingPicker(i iVar, String pricingPlanId, String str, String str2) {
            Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
            this.f103195a = pricingPlanId;
            this.f103196b = iVar;
            this.f103197c = str;
            this.d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BillingPicker)) {
                return false;
            }
            BillingPicker billingPicker = (BillingPicker) obj2;
            return Intrinsics.f(this.f103195a, billingPicker.f103195a) && this.f103196b == billingPicker.f103196b && Intrinsics.f(this.f103197c, billingPicker.f103197c) && Intrinsics.f(this.d, billingPicker.d);
        }

        public final int hashCode() {
            int iHashCode = this.f103195a.hashCode() * 31;
            i iVar = this.f103196b;
            int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
            String str = this.f103197c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103195a);
            i iVar = this.f103196b;
            if (iVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(iVar.name());
            }
            dest.writeString(this.f103197c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$Step$BottomSheetPromptOffer;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BottomSheetPromptOffer implements PlanOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BottomSheetPromptOffer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PricingPlanOfferPrompt.Available f103198a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BottomSheetPromptOffer((PricingPlanOfferPrompt.Available) parcel.readParcelable(BottomSheetPromptOffer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BottomSheetPromptOffer[i];
            }
        }

        public BottomSheetPromptOffer(PricingPlanOfferPrompt.Available prompt) {
            Intrinsics.checkNotNullParameter(prompt, "prompt");
            this.f103198a = prompt;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BottomSheetPromptOffer) && Intrinsics.f(this.f103198a, ((BottomSheetPromptOffer) obj2).f103198a);
        }

        public final int hashCode() {
            return this.f103198a.f102847a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103198a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$Step$FullScreenPromptOffer;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FullScreenPromptOffer implements PlanOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FullScreenPromptOffer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PricingPlanOfferPrompt.Available f103199a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FullScreenPromptOffer((PricingPlanOfferPrompt.Available) parcel.readParcelable(FullScreenPromptOffer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FullScreenPromptOffer[i];
            }
        }

        public FullScreenPromptOffer(PricingPlanOfferPrompt.Available prompt) {
            Intrinsics.checkNotNullParameter(prompt, "prompt");
            this.f103199a = prompt;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FullScreenPromptOffer) && Intrinsics.f(this.f103199a, ((FullScreenPromptOffer) obj2).f103199a);
        }

        public final int hashCode() {
            return this.f103199a.f102847a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103199a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$Step$PlanBenefits;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanBenefits implements PlanOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PlanBenefits> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103200a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanBenefits(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanBenefits[i];
            }
        }

        public PlanBenefits(String pricingPlanId) {
            Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
            this.f103200a = pricingPlanId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanBenefits) && Intrinsics.f(this.f103200a, ((PlanBenefits) obj2).f103200a);
        }

        public final int hashCode() {
            return this.f103200a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103200a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$Step$PlanDocuments;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanDocuments implements PlanOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PlanDocuments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f103201a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(PlanDocuments.class, parcel, arrayList, iE, 1);
                }
                return new PlanDocuments(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanDocuments[i];
            }
        }

        public PlanDocuments(List documents) {
            Intrinsics.checkNotNullParameter(documents, "documents");
            this.f103201a = documents;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanDocuments) && Intrinsics.f(this.f103201a, ((PlanDocuments) obj2).f103201a);
        }

        public final int hashCode() {
            return this.f103201a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f103201a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$Step$Prompt;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_offer/PlanOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Prompt implements PlanOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Prompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103202a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Prompt(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Prompt[i];
            }
        }

        public Prompt(String offerType) {
            Intrinsics.checkNotNullParameter(offerType, "offerType");
            this.f103202a = offerType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Prompt) && Intrinsics.f(this.f103202a, ((Prompt) obj2).f103202a);
        }

        public final int hashCode() {
            return this.f103202a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103202a);
        }
    }
}

package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_contextual_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanContextualSelectionLayoutParams;
import com.revolut.retail.feature.pricing_plans.ui.impl.analytics.PricingPlanAnalyticsSource;
import hha.i;
import hha.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_contextual_selection/PlanContextualSelectionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "PlanSelection", "PlanBenefits", "BillingPicker", "PlanDocuments", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_contextual_selection/PlanContextualSelectionFlowContract$Step$BillingPicker;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_contextual_selection/PlanContextualSelectionFlowContract$Step$PlanBenefits;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_contextual_selection/PlanContextualSelectionFlowContract$Step$PlanDocuments;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_contextual_selection/PlanContextualSelectionFlowContract$Step$PlanSelection;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlanContextualSelectionFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_contextual_selection/PlanContextualSelectionFlowContract$Step$BillingPicker;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_contextual_selection/PlanContextualSelectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillingPicker implements PlanContextualSelectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BillingPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f103144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f103145c;
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
            this.f103143a = pricingPlanId;
            this.f103144b = iVar;
            this.f103145c = str;
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
            return Intrinsics.f(this.f103143a, billingPicker.f103143a) && this.f103144b == billingPicker.f103144b && Intrinsics.f(this.f103145c, billingPicker.f103145c) && Intrinsics.f(this.d, billingPicker.d);
        }

        public final int hashCode() {
            int iHashCode = this.f103143a.hashCode() * 31;
            i iVar = this.f103144b;
            int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
            String str = this.f103145c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103143a);
            i iVar = this.f103144b;
            if (iVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(iVar.name());
            }
            dest.writeString(this.f103145c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_contextual_selection/PlanContextualSelectionFlowContract$Step$PlanBenefits;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_contextual_selection/PlanContextualSelectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanBenefits implements PlanContextualSelectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PlanBenefits> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103146a;

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
            this.f103146a = pricingPlanId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanBenefits) && Intrinsics.f(this.f103146a, ((PlanBenefits) obj2).f103146a);
        }

        public final int hashCode() {
            return this.f103146a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103146a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_contextual_selection/PlanContextualSelectionFlowContract$Step$PlanDocuments;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_contextual_selection/PlanContextualSelectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanDocuments implements PlanContextualSelectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PlanDocuments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f103147a;

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
            this.f103147a = documents;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanDocuments) && Intrinsics.f(this.f103147a, ((PlanDocuments) obj2).f103147a);
        }

        public final int hashCode() {
            return this.f103147a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f103147a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_contextual_selection/PlanContextualSelectionFlowContract$Step$PlanSelection;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_contextual_selection/PlanContextualSelectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanSelection implements PlanContextualSelectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PlanSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PricingPlanAnalyticsSource f103148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f103149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final w0 f103150c;
        public final PricingPlanContextualSelectionLayoutParams d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanSelection((PricingPlanAnalyticsSource) parcel.readParcelable(PlanSelection.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : w0.valueOf(parcel.readString()), (PricingPlanContextualSelectionLayoutParams) parcel.readParcelable(PlanSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanSelection[i];
            }
        }

        public PlanSelection(PricingPlanAnalyticsSource source, String promptType, w0 w0Var, PricingPlanContextualSelectionLayoutParams pricingPlanContextualSelectionLayoutParams) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(promptType, "promptType");
            this.f103148a = source;
            this.f103149b = promptType;
            this.f103150c = w0Var;
            this.d = pricingPlanContextualSelectionLayoutParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanSelection)) {
                return false;
            }
            PlanSelection planSelection = (PlanSelection) obj2;
            return Intrinsics.f(this.f103148a, planSelection.f103148a) && Intrinsics.f(this.f103149b, planSelection.f103149b) && this.f103150c == planSelection.f103150c && Intrinsics.f(this.d, planSelection.d);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f103148a.hashCode() * 31, 31, this.f103149b);
            w0 w0Var = this.f103150c;
            int iHashCode = (iC + (w0Var == null ? 0 : w0Var.hashCode())) * 31;
            PricingPlanContextualSelectionLayoutParams pricingPlanContextualSelectionLayoutParams = this.d;
            return iHashCode + (pricingPlanContextualSelectionLayoutParams != null ? pricingPlanContextualSelectionLayoutParams.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103148a, i);
            dest.writeString(this.f103149b);
            w0 w0Var = this.f103150c;
            if (w0Var == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(w0Var.name());
            }
            dest.writeParcelable(this.d, i);
        }
    }
}

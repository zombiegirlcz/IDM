package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pricingplans.models.cancel.PricingPlanCancelScreenConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import hha.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_downgrade/PlanDowngradeFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "BenefitsToLose", "PlanChangeConfirmation", "BlockDowngrade", "FeesAndRefunds", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_downgrade/PlanDowngradeFlowContract$Step$BenefitsToLose;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_downgrade/PlanDowngradeFlowContract$Step$BlockDowngrade;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_downgrade/PlanDowngradeFlowContract$Step$FeesAndRefunds;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_downgrade/PlanDowngradeFlowContract$Step$PlanChangeConfirmation;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PlanDowngradeFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_downgrade/PlanDowngradeFlowContract$Step$BenefitsToLose;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_downgrade/PlanDowngradeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BenefitsToLose extends PlanDowngradeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BenefitsToLose> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f103157b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BenefitsToLose(parcel.readString(), i.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BenefitsToLose[i];
            }
        }

        public BenefitsToLose(String selectedPlanId, i selectedBilling) {
            Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
            Intrinsics.checkNotNullParameter(selectedBilling, "selectedBilling");
            this.f103156a = selectedPlanId;
            this.f103157b = selectedBilling;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BenefitsToLose)) {
                return false;
            }
            BenefitsToLose benefitsToLose = (BenefitsToLose) obj2;
            return Intrinsics.f(this.f103156a, benefitsToLose.f103156a) && this.f103157b == benefitsToLose.f103157b;
        }

        public final int hashCode() {
            return this.f103157b.hashCode() + (this.f103156a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103156a);
            dest.writeString(this.f103157b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_downgrade/PlanDowngradeFlowContract$Step$BlockDowngrade;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_downgrade/PlanDowngradeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BlockDowngrade extends PlanDowngradeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BlockDowngrade> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f103158a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(BlockDowngrade.class, parcel, arrayList, iE, 1);
                }
                return new BlockDowngrade(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlockDowngrade[i];
            }
        }

        public BlockDowngrade(List ineligibilityReasons) {
            Intrinsics.checkNotNullParameter(ineligibilityReasons, "ineligibilityReasons");
            this.f103158a = ineligibilityReasons;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BlockDowngrade) && Intrinsics.f(this.f103158a, ((BlockDowngrade) obj2).f103158a);
        }

        public final int hashCode() {
            return this.f103158a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f103158a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_downgrade/PlanDowngradeFlowContract$Step$FeesAndRefunds;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_downgrade/PlanDowngradeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeesAndRefunds extends PlanDowngradeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FeesAndRefunds> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PricingPlanCancelScreenConfig f103159a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FeesAndRefunds((PricingPlanCancelScreenConfig) parcel.readParcelable(FeesAndRefunds.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeesAndRefunds[i];
            }
        }

        public FeesAndRefunds(PricingPlanCancelScreenConfig screenConfig) {
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            this.f103159a = screenConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FeesAndRefunds) && Intrinsics.f(this.f103159a, ((FeesAndRefunds) obj2).f103159a);
        }

        public final int hashCode() {
            return this.f103159a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103159a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_downgrade/PlanDowngradeFlowContract$Step$PlanChangeConfirmation;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_downgrade/PlanDowngradeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanChangeConfirmation extends PlanDowngradeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PlanChangeConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f103161b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanChangeConfirmation(parcel.readString(), i.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanChangeConfirmation[i];
            }
        }

        public PlanChangeConfirmation(String selectedPlanId, i selectedBilling) {
            Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
            Intrinsics.checkNotNullParameter(selectedBilling, "selectedBilling");
            this.f103160a = selectedPlanId;
            this.f103161b = selectedBilling;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanChangeConfirmation)) {
                return false;
            }
            PlanChangeConfirmation planChangeConfirmation = (PlanChangeConfirmation) obj2;
            return Intrinsics.f(this.f103160a, planChangeConfirmation.f103160a) && this.f103161b == planChangeConfirmation.f103161b;
        }

        public final int hashCode() {
            return this.f103161b.hashCode() + (this.f103160a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103160a);
            dest.writeString(this.f103161b.name());
        }
    }

    private PlanDowngradeFlowContract$Step() {
    }
}

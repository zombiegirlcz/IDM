package com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zm3.l;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/contact_selection/FamilyPlanContactSelectionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SelectContact", "ShowUpgradeToInvite", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/contact_selection/FamilyPlanContactSelectionFlowContract$Step$SelectContact;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/contact_selection/FamilyPlanContactSelectionFlowContract$Step$ShowUpgradeToInvite;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FamilyPlanContactSelectionFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/contact_selection/FamilyPlanContactSelectionFlowContract$Step$SelectContact;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/contact_selection/FamilyPlanContactSelectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectContact extends FamilyPlanContactSelectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectContact> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hha.d f102997a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectContact((hha.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectContact[i];
            }
        }

        public SelectContact(hha.d pricingPlan) {
            Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
            this.f102997a = pricingPlan;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectContact) && Intrinsics.f(this.f102997a, ((SelectContact) obj2).f102997a);
        }

        public final int hashCode() {
            return this.f102997a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f102997a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/contact_selection/FamilyPlanContactSelectionFlowContract$Step$ShowUpgradeToInvite;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/contact_selection/FamilyPlanContactSelectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowUpgradeToInvite extends FamilyPlanContactSelectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ShowUpgradeToInvite> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f102998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hha.d f102999b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowUpgradeToInvite((l) parcel.readSerializable(), (hha.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowUpgradeToInvite[i];
            }
        }

        public ShowUpgradeToInvite(l contact, hha.d requiredPlan) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            Intrinsics.checkNotNullParameter(requiredPlan, "requiredPlan");
            this.f102998a = contact;
            this.f102999b = requiredPlan;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ShowUpgradeToInvite)) {
                return false;
            }
            ShowUpgradeToInvite showUpgradeToInvite = (ShowUpgradeToInvite) obj2;
            return Intrinsics.f(this.f102998a, showUpgradeToInvite.f102998a) && Intrinsics.f(this.f102999b, showUpgradeToInvite.f102999b);
        }

        public final int hashCode() {
            return this.f102999b.hashCode() + (this.f102998a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f102998a);
            dest.writeSerializable(this.f102999b);
        }
    }

    private FamilyPlanContactSelectionFlowContract$Step() {
    }
}

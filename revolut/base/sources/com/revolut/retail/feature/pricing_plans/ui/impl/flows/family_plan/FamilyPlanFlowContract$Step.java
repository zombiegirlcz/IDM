package com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$AvailableOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lha.h;
import org.jetbrains.annotations.NotNull;
import zm3.l;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Intro", "SelectFamilyPlan", "ContactPicker", "PlanManagement", "MoreForFamily", "Invitation", "Checkout", "UpgradeToInvite", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step$Checkout;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step$ContactPicker;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step$Intro;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step$Invitation;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step$MoreForFamily;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step$PlanManagement;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step$SelectFamilyPlan;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step$UpgradeToInvite;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FamilyPlanFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step$Checkout;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Checkout extends FamilyPlanFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Checkout f102982a = new Checkout();

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Checkout.f102982a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        private Checkout() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step$ContactPicker;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContactPicker extends FamilyPlanFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ContactPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102983a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ContactPicker(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContactPicker[i];
            }
        }

        public ContactPicker(String familyId) {
            Intrinsics.checkNotNullParameter(familyId, "familyId");
            this.f102983a = familyId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ContactPicker) && Intrinsics.f(this.f102983a, ((ContactPicker) obj2).f102983a);
        }

        public final int hashCode() {
            return this.f102983a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102983a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step$Intro;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Intro extends FamilyPlanFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Intro f102984a = new Intro();

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Intro.f102984a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        private Intro() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step$Invitation;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Invitation extends FamilyPlanFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Invitation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f102985a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Invitation((h) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Invitation[i];
            }
        }

        public Invitation(h invitation) {
            Intrinsics.checkNotNullParameter(invitation, "invitation");
            this.f102985a = invitation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Invitation) && Intrinsics.f(this.f102985a, ((Invitation) obj2).f102985a);
        }

        public final int hashCode() {
            return this.f102985a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f102985a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step$MoreForFamily;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoreForFamily extends FamilyPlanFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MoreForFamily> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoreForFamilyScreenContract$AvailableOptions f102986a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoreForFamily(MoreForFamilyScreenContract$AvailableOptions.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoreForFamily[i];
            }
        }

        public MoreForFamily(MoreForFamilyScreenContract$AvailableOptions options) {
            Intrinsics.checkNotNullParameter(options, "options");
            this.f102986a = options;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MoreForFamily) && Intrinsics.f(this.f102986a, ((MoreForFamily) obj2).f102986a);
        }

        public final int hashCode() {
            return this.f102986a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f102986a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step$PlanManagement;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PlanManagement extends FamilyPlanFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PlanManagement f102987a = new PlanManagement();

        @NotNull
        public static final Parcelable.Creator<PlanManagement> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PlanManagement.f102987a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanManagement[i];
            }
        }

        private PlanManagement() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step$SelectFamilyPlan;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectFamilyPlan extends FamilyPlanFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectFamilyPlan f102988a = new SelectFamilyPlan();

        @NotNull
        public static final Parcelable.Creator<SelectFamilyPlan> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectFamilyPlan.f102988a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectFamilyPlan[i];
            }
        }

        private SelectFamilyPlan() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step$UpgradeToInvite;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/FamilyPlanFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpgradeToInvite extends FamilyPlanFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UpgradeToInvite> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f102989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hha.d f102990b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpgradeToInvite((l) parcel.readSerializable(), (hha.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpgradeToInvite[i];
            }
        }

        public UpgradeToInvite(l contact, hha.d requiredPlan) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            Intrinsics.checkNotNullParameter(requiredPlan, "requiredPlan");
            this.f102989a = contact;
            this.f102990b = requiredPlan;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UpgradeToInvite)) {
                return false;
            }
            UpgradeToInvite upgradeToInvite = (UpgradeToInvite) obj2;
            return Intrinsics.f(this.f102989a, upgradeToInvite.f102989a) && Intrinsics.f(this.f102990b, upgradeToInvite.f102990b);
        }

        public final int hashCode() {
            return this.f102990b.hashCode() + (this.f102989a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f102989a);
            dest.writeSerializable(this.f102990b);
        }
    }

    private FamilyPlanFlowContract$Step() {
    }
}

package com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.invitation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import hha.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lha.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/invitation/FamilyPlanInvitationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Invitation", "DeclineInvitation", "PlanBenefits", "GiftedPlanConfirmation", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/invitation/FamilyPlanInvitationFlowContract$Step$DeclineInvitation;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/invitation/FamilyPlanInvitationFlowContract$Step$GiftedPlanConfirmation;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/invitation/FamilyPlanInvitationFlowContract$Step$Invitation;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/invitation/FamilyPlanInvitationFlowContract$Step$PlanBenefits;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FamilyPlanInvitationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/invitation/FamilyPlanInvitationFlowContract$Step$DeclineInvitation;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/invitation/FamilyPlanInvitationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeclineInvitation extends FamilyPlanInvitationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DeclineInvitation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f103019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hha.d f103020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f103021c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeclineInvitation((k) parcel.readSerializable(), (hha.d) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeclineInvitation[i];
            }
        }

        public DeclineInvitation(k inviter, hha.d pricingPlan, boolean z) {
            Intrinsics.checkNotNullParameter(inviter, "inviter");
            Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
            this.f103019a = inviter;
            this.f103020b = pricingPlan;
            this.f103021c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DeclineInvitation)) {
                return false;
            }
            DeclineInvitation declineInvitation = (DeclineInvitation) obj2;
            return Intrinsics.f(this.f103019a, declineInvitation.f103019a) && Intrinsics.f(this.f103020b, declineInvitation.f103020b) && this.f103021c == declineInvitation.f103021c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f103021c) + ((this.f103020b.hashCode() + (this.f103019a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f103019a);
            dest.writeSerializable(this.f103020b);
            dest.writeInt(this.f103021c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/invitation/FamilyPlanInvitationFlowContract$Step$GiftedPlanConfirmation;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/invitation/FamilyPlanInvitationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GiftedPlanConfirmation extends FamilyPlanInvitationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<GiftedPlanConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hha.d f103022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hha.d f103023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f103024c;
        public final b0 d;
        public final k e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GiftedPlanConfirmation((hha.d) parcel.readSerializable(), (hha.d) parcel.readSerializable(), parcel.readInt() != 0, (b0) parcel.readSerializable(), (k) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiftedPlanConfirmation[i];
            }
        }

        public GiftedPlanConfirmation(hha.d currentPricingPlan, hha.d invitedPricingPlan, boolean z, b0 gift, k inviter) {
            Intrinsics.checkNotNullParameter(currentPricingPlan, "currentPricingPlan");
            Intrinsics.checkNotNullParameter(invitedPricingPlan, "invitedPricingPlan");
            Intrinsics.checkNotNullParameter(gift, "gift");
            Intrinsics.checkNotNullParameter(inviter, "inviter");
            this.f103022a = currentPricingPlan;
            this.f103023b = invitedPricingPlan;
            this.f103024c = z;
            this.d = gift;
            this.e = inviter;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GiftedPlanConfirmation)) {
                return false;
            }
            GiftedPlanConfirmation giftedPlanConfirmation = (GiftedPlanConfirmation) obj2;
            return Intrinsics.f(this.f103022a, giftedPlanConfirmation.f103022a) && Intrinsics.f(this.f103023b, giftedPlanConfirmation.f103023b) && this.f103024c == giftedPlanConfirmation.f103024c && Intrinsics.f(this.d, giftedPlanConfirmation.d) && Intrinsics.f(this.e, giftedPlanConfirmation.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + j6.a.c((this.f103023b.hashCode() + (this.f103022a.hashCode() * 31)) * 31, 31, this.f103024c)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f103022a);
            dest.writeSerializable(this.f103023b);
            dest.writeInt(this.f103024c ? 1 : 0);
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/invitation/FamilyPlanInvitationFlowContract$Step$Invitation;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/invitation/FamilyPlanInvitationFlowContract$Step;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Invitation extends FamilyPlanInvitationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Invitation f103025a = new Invitation();

        @NotNull
        public static final Parcelable.Creator<Invitation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Invitation.f103025a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Invitation[i];
            }
        }

        private Invitation() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/invitation/FamilyPlanInvitationFlowContract$Step$PlanBenefits;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/family_plan/invitation/FamilyPlanInvitationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanBenefits extends FamilyPlanInvitationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PlanBenefits> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hha.d f103026a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanBenefits((hha.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanBenefits[i];
            }
        }

        public PlanBenefits(hha.d pricingPlan) {
            Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
            this.f103026a = pricingPlan;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanBenefits) && Intrinsics.f(this.f103026a, ((PlanBenefits) obj2).f103026a);
        }

        public final int hashCode() {
            return this.f103026a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f103026a);
        }
    }

    private FamilyPlanInvitationFlowContract$Step() {
    }
}

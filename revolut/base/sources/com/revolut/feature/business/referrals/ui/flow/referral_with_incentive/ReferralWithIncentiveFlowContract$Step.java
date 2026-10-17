package com.revolut.feature.business.referrals.ui.flow.referral_with_incentive;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.business.referrals.ui.screens.referral_campaign_state.ReferralCampaignStateScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/business/referrals/ui/flow/referral_with_incentive/ReferralWithIncentiveFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Overview", "OverviewWithInviteContacts", "CampaignState", "InviteeDetails", "Lcom/revolut/feature/business/referrals/ui/flow/referral_with_incentive/ReferralWithIncentiveFlowContract$Step$CampaignState;", "Lcom/revolut/feature/business/referrals/ui/flow/referral_with_incentive/ReferralWithIncentiveFlowContract$Step$InviteeDetails;", "Lcom/revolut/feature/business/referrals/ui/flow/referral_with_incentive/ReferralWithIncentiveFlowContract$Step$Overview;", "Lcom/revolut/feature/business/referrals/ui/flow/referral_with_incentive/ReferralWithIncentiveFlowContract$Step$OverviewWithInviteContacts;", "feature_business_referrals_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ReferralWithIncentiveFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/business/referrals/ui/flow/referral_with_incentive/ReferralWithIncentiveFlowContract$Step$CampaignState;", "Lcom/revolut/feature/business/referrals/ui/flow/referral_with_incentive/ReferralWithIncentiveFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_business_referrals_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CampaignState extends ReferralWithIncentiveFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CampaignState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReferralCampaignStateScreenContract$InputData f64334a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CampaignState((ReferralCampaignStateScreenContract$InputData) parcel.readParcelable(CampaignState.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CampaignState[i];
            }
        }

        public CampaignState(ReferralCampaignStateScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f64334a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CampaignState) && Intrinsics.f(this.f64334a, ((CampaignState) obj2).f64334a);
        }

        public final int hashCode() {
            return this.f64334a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f64334a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/business/referrals/ui/flow/referral_with_incentive/ReferralWithIncentiveFlowContract$Step$InviteeDetails;", "Lcom/revolut/feature/business/referrals/ui/flow/referral_with_incentive/ReferralWithIncentiveFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_business_referrals_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InviteeDetails extends ReferralWithIncentiveFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InviteeDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64335a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InviteeDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InviteeDetails[i];
            }
        }

        public InviteeDetails(String businessId) {
            Intrinsics.checkNotNullParameter(businessId, "businessId");
            this.f64335a = businessId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InviteeDetails) && Intrinsics.f(this.f64335a, ((InviteeDetails) obj2).f64335a);
        }

        public final int hashCode() {
            return this.f64335a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64335a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/business/referrals/ui/flow/referral_with_incentive/ReferralWithIncentiveFlowContract$Step$Overview;", "Lcom/revolut/feature/business/referrals/ui/flow/referral_with_incentive/ReferralWithIncentiveFlowContract$Step;", "<init>", "()V", "feature_business_referrals_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Overview extends ReferralWithIncentiveFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Overview f64336a = new Overview();

        @NotNull
        public static final Parcelable.Creator<Overview> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Overview.f64336a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Overview[i];
            }
        }

        private Overview() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/business/referrals/ui/flow/referral_with_incentive/ReferralWithIncentiveFlowContract$Step$OverviewWithInviteContacts;", "Lcom/revolut/feature/business/referrals/ui/flow/referral_with_incentive/ReferralWithIncentiveFlowContract$Step;", "<init>", "()V", "feature_business_referrals_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OverviewWithInviteContacts extends ReferralWithIncentiveFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OverviewWithInviteContacts f64337a = new OverviewWithInviteContacts();

        @NotNull
        public static final Parcelable.Creator<OverviewWithInviteContacts> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OverviewWithInviteContacts.f64337a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OverviewWithInviteContacts[i];
            }
        }

        private OverviewWithInviteContacts() {
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

    private ReferralWithIncentiveFlowContract$Step() {
    }
}

package com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.InviteCampaignHomeControllerContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.ReferralsTroubleshooterTopLevelScreenContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.AllReferralsScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"com/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "InviteCampaignHome", "ReferralsTroubleshooter", "AllReferralsTroubleshooter", "InvitesList", "InviteDetails", "C2BReferrals", "C2BReferralsArticle", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step$AllReferralsTroubleshooter;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step$C2BReferrals;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step$C2BReferralsArticle;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step$InviteCampaignHome;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step$InviteDetails;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step$InvitesList;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step$ReferralsTroubleshooter;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ReferralsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step$AllReferralsTroubleshooter;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AllReferralsTroubleshooter extends ReferralsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AllReferralsTroubleshooter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AllReferralsScreenContract$InputData f81932a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AllReferralsTroubleshooter(AllReferralsScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllReferralsTroubleshooter[i];
            }
        }

        public AllReferralsTroubleshooter(AllReferralsScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f81932a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AllReferralsTroubleshooter) && Intrinsics.f(this.f81932a, ((AllReferralsTroubleshooter) obj2).f81932a);
        }

        public final int hashCode() {
            return this.f81932a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f81932a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step$C2BReferrals;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step;", "<init>", "()V", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C2BReferrals extends ReferralsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2BReferrals f81933a = new C2BReferrals();

        @NotNull
        public static final Parcelable.Creator<C2BReferrals> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return C2BReferrals.f81933a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C2BReferrals[i];
            }
        }

        private C2BReferrals() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step$C2BReferralsArticle;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C2BReferralsArticle extends ReferralsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<C2BReferralsArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f81934a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new C2BReferralsArticle((ProductArticleParams) parcel.readParcelable(C2BReferralsArticle.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C2BReferralsArticle[i];
            }
        }

        public C2BReferralsArticle(ProductArticleParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f81934a = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C2BReferralsArticle) && Intrinsics.f(this.f81934a, ((C2BReferralsArticle) obj2).f81934a);
        }

        public final int hashCode() {
            return this.f81934a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f81934a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step$InviteCampaignHome;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InviteCampaignHome extends ReferralsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InviteCampaignHome> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InviteCampaignHomeControllerContract$InputData f81935a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InviteCampaignHome(InviteCampaignHomeControllerContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InviteCampaignHome[i];
            }
        }

        public InviteCampaignHome(InviteCampaignHomeControllerContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f81935a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InviteCampaignHome) && Intrinsics.f(this.f81935a, ((InviteCampaignHome) obj2).f81935a);
        }

        public final int hashCode() {
            return this.f81935a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f81935a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step$InviteDetails;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InviteDetails extends ReferralsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InviteDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvitesDetailsContract$InputData f81936a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InviteDetails((InvitesDetailsContract$InputData) parcel.readParcelable(InviteDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InviteDetails[i];
            }
        }

        public InviteDetails(InvitesDetailsContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f81936a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InviteDetails) && Intrinsics.f(this.f81936a, ((InviteDetails) obj2).f81936a);
        }

        public final int hashCode() {
            return this.f81936a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f81936a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step$InvitesList;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvitesList extends ReferralsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InvitesList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InvitesListContract$InputData f81937a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvitesList(InvitesListContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvitesList[i];
            }
        }

        public InvitesList(InvitesListContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f81937a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InvitesList) && Intrinsics.f(this.f81937a, ((InvitesList) obj2).f81937a);
        }

        public final int hashCode() {
            return this.f81937a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f81937a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step$ReferralsTroubleshooter;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReferralsTroubleshooter extends ReferralsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReferralsTroubleshooter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReferralsTroubleshooterTopLevelScreenContract$InputData f81938a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReferralsTroubleshooter(ReferralsTroubleshooterTopLevelScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReferralsTroubleshooter[i];
            }
        }

        public ReferralsTroubleshooter(ReferralsTroubleshooterTopLevelScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f81938a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReferralsTroubleshooter) && Intrinsics.f(this.f81938a, ((ReferralsTroubleshooter) obj2).f81938a);
        }

        public final int hashCode() {
            return this.f81938a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f81938a.writeToParcel(dest, i);
        }
    }

    private ReferralsFlowContract$Step() {
    }
}

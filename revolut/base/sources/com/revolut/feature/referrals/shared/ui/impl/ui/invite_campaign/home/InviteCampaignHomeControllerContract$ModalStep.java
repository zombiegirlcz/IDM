package com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.referrals.common.data.api.domain.model.common.AdditionalInfo;
import com.revolut.feature.referrals.shared.ui.impl.ui.reward_details.RewardDetailsScreenContract$Input;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/referrals/shared/ui/impl/ui/invite_campaign/home/InviteCampaignHomeControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "IneligibilityDialog", "RewardDetails", "LearnMore", "InviteBottomSheetActions", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invite_campaign/home/InviteCampaignHomeControllerContract$ModalStep$IneligibilityDialog;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invite_campaign/home/InviteCampaignHomeControllerContract$ModalStep$InviteBottomSheetActions;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invite_campaign/home/InviteCampaignHomeControllerContract$ModalStep$LearnMore;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invite_campaign/home/InviteCampaignHomeControllerContract$ModalStep$RewardDetails;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InviteCampaignHomeControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/invite_campaign/home/InviteCampaignHomeControllerContract$ModalStep$IneligibilityDialog;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invite_campaign/home/InviteCampaignHomeControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IneligibilityDialog implements InviteCampaignHomeControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<IneligibilityDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81845a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IneligibilityDialog(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IneligibilityDialog[i];
            }
        }

        public IneligibilityDialog(String str) {
            this.f81845a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof IneligibilityDialog) && Intrinsics.f(this.f81845a, ((IneligibilityDialog) obj2).f81845a);
        }

        public final int hashCode() {
            String str = this.f81845a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81845a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/invite_campaign/home/InviteCampaignHomeControllerContract$ModalStep$InviteBottomSheetActions;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invite_campaign/home/InviteCampaignHomeControllerContract$ModalStep;", "<init>", "()V", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InviteBottomSheetActions implements InviteCampaignHomeControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InviteBottomSheetActions f81846a = new InviteBottomSheetActions();

        @NotNull
        public static final Parcelable.Creator<InviteBottomSheetActions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InviteBottomSheetActions.f81846a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InviteBottomSheetActions[i];
            }
        }

        private InviteBottomSheetActions() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/invite_campaign/home/InviteCampaignHomeControllerContract$ModalStep$LearnMore;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invite_campaign/home/InviteCampaignHomeControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LearnMore implements InviteCampaignHomeControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LearnMore> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AdditionalInfo f81847a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LearnMore((AdditionalInfo) parcel.readParcelable(LearnMore.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LearnMore[i];
            }
        }

        public LearnMore(AdditionalInfo additionalInfo) {
            Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
            this.f81847a = additionalInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LearnMore) && Intrinsics.f(this.f81847a, ((LearnMore) obj2).f81847a);
        }

        public final int hashCode() {
            return this.f81847a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f81847a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/invite_campaign/home/InviteCampaignHomeControllerContract$ModalStep$RewardDetails;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invite_campaign/home/InviteCampaignHomeControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RewardDetails implements InviteCampaignHomeControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RewardDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RewardDetailsScreenContract$Input f81848a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RewardDetails(RewardDetailsScreenContract$Input.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RewardDetails[i];
            }
        }

        public RewardDetails(RewardDetailsScreenContract$Input input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f81848a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RewardDetails) && Intrinsics.f(this.f81848a, ((RewardDetails) obj2).f81848a);
        }

        public final int hashCode() {
            return this.f81848a.f81952a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f81848a.writeToParcel(dest, i);
        }
    }
}

package com.revolut.feature.business.referrals.ui.screens.invite_contacts;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.business.feature.referrals.model.ReferralWithIncentiveCampaign$CampaignType;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/business/referrals/ui/screens/invite_contacts/InviteContactsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_business_referrals_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InviteContactsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InviteContactsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReferralWithIncentiveCampaign$CampaignType f64345c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InviteContactsScreenContract$InputData(parcel.readString(), parcel.readString(), (ReferralWithIncentiveCampaign$CampaignType) parcel.readParcelable(InviteContactsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InviteContactsScreenContract$InputData[i];
        }
    }

    public InviteContactsScreenContract$InputData(String referralUrl, String str, ReferralWithIncentiveCampaign$CampaignType referralWithIncentiveCampaign$CampaignType) {
        Intrinsics.checkNotNullParameter(referralUrl, "referralUrl");
        this.f64343a = referralUrl;
        this.f64344b = str;
        this.f64345c = referralWithIncentiveCampaign$CampaignType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InviteContactsScreenContract$InputData)) {
            return false;
        }
        InviteContactsScreenContract$InputData inviteContactsScreenContract$InputData = (InviteContactsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f64343a, inviteContactsScreenContract$InputData.f64343a) && Intrinsics.f(this.f64344b, inviteContactsScreenContract$InputData.f64344b) && Intrinsics.f(this.f64345c, inviteContactsScreenContract$InputData.f64345c);
    }

    public final int hashCode() {
        int iHashCode = this.f64343a.hashCode() * 31;
        String str = this.f64344b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ReferralWithIncentiveCampaign$CampaignType referralWithIncentiveCampaign$CampaignType = this.f64345c;
        return iHashCode2 + (referralWithIncentiveCampaign$CampaignType != null ? referralWithIncentiveCampaign$CampaignType.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64343a);
        dest.writeString(this.f64344b);
        dest.writeParcelable(this.f64345c, i);
    }
}

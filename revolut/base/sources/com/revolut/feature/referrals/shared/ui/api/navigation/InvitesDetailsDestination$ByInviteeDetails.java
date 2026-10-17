package com.revolut.feature.referrals.shared.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pwa.n;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/referrals/shared/ui/api/navigation/InvitesDetailsDestination$ByInviteeDetails", "", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvitesDetailsDestination$ByInviteeDetails implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<InvitesDetailsDestination$ByInviteeDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActiveOrPastInviteeDetails f81825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f81826b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvitesDetailsDestination$ByInviteeDetails((ActiveOrPastInviteeDetails) parcel.readParcelable(InvitesDetailsDestination$ByInviteeDetails.class.getClassLoader()), n.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvitesDetailsDestination$ByInviteeDetails[i];
        }
    }

    public InvitesDetailsDestination$ByInviteeDetails(ActiveOrPastInviteeDetails inviteeDetails, n referralCampaignV4Type) {
        Intrinsics.checkNotNullParameter(inviteeDetails, "inviteeDetails");
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        this.f81825a = inviteeDetails;
        this.f81826b = referralCampaignV4Type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvitesDetailsDestination$ByInviteeDetails)) {
            return false;
        }
        InvitesDetailsDestination$ByInviteeDetails invitesDetailsDestination$ByInviteeDetails = (InvitesDetailsDestination$ByInviteeDetails) obj2;
        return Intrinsics.f(this.f81825a, invitesDetailsDestination$ByInviteeDetails.f81825a) && this.f81826b == invitesDetailsDestination$ByInviteeDetails.f81826b;
    }

    public final int hashCode() {
        return this.f81826b.hashCode() + (this.f81825a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f81825a, i);
        dest.writeString(this.f81826b.name());
    }
}

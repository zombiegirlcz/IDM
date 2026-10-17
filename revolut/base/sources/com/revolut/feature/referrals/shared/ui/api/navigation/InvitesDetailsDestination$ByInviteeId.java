package com.revolut.feature.referrals.shared.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pwa.n;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/referrals/shared/ui/api/navigation/InvitesDetailsDestination$ByInviteeId", "", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvitesDetailsDestination$ByInviteeId implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<InvitesDetailsDestination$ByInviteeId> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f81828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f81829c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvitesDetailsDestination$ByInviteeId(parcel.readString(), n.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvitesDetailsDestination$ByInviteeId[i];
        }
    }

    public InvitesDetailsDestination$ByInviteeId(String inviteeId, n referralCampaignV4Type, boolean z) {
        Intrinsics.checkNotNullParameter(inviteeId, "inviteeId");
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        this.f81827a = inviteeId;
        this.f81828b = referralCampaignV4Type;
        this.f81829c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvitesDetailsDestination$ByInviteeId)) {
            return false;
        }
        InvitesDetailsDestination$ByInviteeId invitesDetailsDestination$ByInviteeId = (InvitesDetailsDestination$ByInviteeId) obj2;
        return Intrinsics.f(this.f81827a, invitesDetailsDestination$ByInviteeId.f81827a) && this.f81828b == invitesDetailsDestination$ByInviteeId.f81828b && this.f81829c == invitesDetailsDestination$ByInviteeId.f81829c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f81829c) + ((this.f81828b.hashCode() + (this.f81827a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81827a);
        dest.writeString(this.f81828b.name());
        dest.writeInt(this.f81829c ? 1 : 0);
    }
}

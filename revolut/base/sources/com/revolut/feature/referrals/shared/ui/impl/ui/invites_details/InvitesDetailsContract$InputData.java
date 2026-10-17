package com.revolut.feature.referrals.shared.ui.impl.ui.invites_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.DetailsScope;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pwa.n;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InvitesDetailsContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "ByInviteeDetails", "ByInviteId", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InvitesDetailsContract$InputData$ByInviteId;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InvitesDetailsContract$InputData$ByInviteeDetails;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvitesDetailsContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InvitesDetailsContract$InputData$ByInviteeDetails;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InvitesDetailsContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByInviteeDetails implements InvitesDetailsContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ByInviteeDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActiveOrPastInviteeDetails f81871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DetailsScope f81872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InviteDetailsCampaignType f81873c;
        public final n d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByInviteeDetails((ActiveOrPastInviteeDetails) parcel.readParcelable(ByInviteeDetails.class.getClassLoader()), (DetailsScope) parcel.readParcelable(ByInviteeDetails.class.getClassLoader()), (InviteDetailsCampaignType) parcel.readParcelable(ByInviteeDetails.class.getClassLoader()), n.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByInviteeDetails[i];
            }
        }

        public ByInviteeDetails(ActiveOrPastInviteeDetails inviteeDetails, DetailsScope detailsScope, InviteDetailsCampaignType campaignType, n referralCampaignV4Type) {
            Intrinsics.checkNotNullParameter(inviteeDetails, "inviteeDetails");
            Intrinsics.checkNotNullParameter(detailsScope, "detailsScope");
            Intrinsics.checkNotNullParameter(campaignType, "campaignType");
            Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
            this.f81871a = inviteeDetails;
            this.f81872b = detailsScope;
            this.f81873c = campaignType;
            this.d = referralCampaignV4Type;
        }

        @Override // com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData
        /* JADX INFO: renamed from: J2, reason: from getter */
        public final InviteDetailsCampaignType getF81873c() {
            return this.f81873c;
        }

        @Override // com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData
        /* JADX INFO: renamed from: Y, reason: from getter */
        public final n getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData
        /* JADX INFO: renamed from: e1, reason: from getter */
        public final DetailsScope getF81872b() {
            return this.f81872b;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ByInviteeDetails)) {
                return false;
            }
            ByInviteeDetails byInviteeDetails = (ByInviteeDetails) obj2;
            return Intrinsics.f(this.f81871a, byInviteeDetails.f81871a) && Intrinsics.f(this.f81872b, byInviteeDetails.f81872b) && Intrinsics.f(this.f81873c, byInviteeDetails.f81873c) && this.d == byInviteeDetails.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f81873c.hashCode() + ((this.f81872b.hashCode() + (this.f81871a.hashCode() * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f81871a, i);
            dest.writeParcelable(this.f81872b, i);
            dest.writeParcelable(this.f81873c, i);
            dest.writeString(this.d.name());
        }
    }

    /* JADX INFO: renamed from: J2 */
    InviteDetailsCampaignType getF81873c();

    /* JADX INFO: renamed from: Y */
    n getD();

    /* JADX INFO: renamed from: e1 */
    DetailsScope getF81872b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InvitesDetailsContract$InputData$ByInviteId;", "Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InvitesDetailsContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByInviteId implements InvitesDetailsContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ByInviteId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f81869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DetailsScope f81870c;
        public final InviteDetailsCampaignType d;
        public final n e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByInviteId(parcel.readString(), parcel.readInt() != 0, (DetailsScope) parcel.readParcelable(ByInviteId.class.getClassLoader()), (InviteDetailsCampaignType) parcel.readParcelable(ByInviteId.class.getClassLoader()), n.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByInviteId[i];
            }
        }

        public ByInviteId(String inviteId, boolean z, DetailsScope detailsScope, InviteDetailsCampaignType campaignType, n referralCampaignV4Type) {
            Intrinsics.checkNotNullParameter(inviteId, "inviteId");
            Intrinsics.checkNotNullParameter(detailsScope, "detailsScope");
            Intrinsics.checkNotNullParameter(campaignType, "campaignType");
            Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
            this.f81868a = inviteId;
            this.f81869b = z;
            this.f81870c = detailsScope;
            this.d = campaignType;
            this.e = referralCampaignV4Type;
        }

        @Override // com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData
        /* JADX INFO: renamed from: J2, reason: from getter */
        public final InviteDetailsCampaignType getF81873c() {
            return this.d;
        }

        @Override // com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData
        /* JADX INFO: renamed from: Y, reason: from getter */
        public final n getD() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData
        /* JADX INFO: renamed from: e1, reason: from getter */
        public final DetailsScope getF81872b() {
            return this.f81870c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ByInviteId)) {
                return false;
            }
            ByInviteId byInviteId = (ByInviteId) obj2;
            return Intrinsics.f(this.f81868a, byInviteId.f81868a) && this.f81869b == byInviteId.f81869b && Intrinsics.f(this.f81870c, byInviteId.f81870c) && Intrinsics.f(this.d, byInviteId.d) && this.e == byInviteId.e;
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.f81870c.hashCode() + j6.a.c(this.f81868a.hashCode() * 31, 31, this.f81869b)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81868a);
            dest.writeInt(this.f81869b ? 1 : 0);
            dest.writeParcelable(this.f81870c, i);
            dest.writeParcelable(this.d, i);
            dest.writeString(this.e.name());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ByInviteId(String str, boolean z, InviteDetailsCampaignType inviteDetailsCampaignType, n nVar, int i) {
            DetailsScope detailsScope;
            boolean z3 = (i & 2) != 0 ? false : z;
            if ((i & 4) != 0) {
                detailsScope = DetailsScope.Default.f81864a;
            } else {
                detailsScope = DetailsScope.HelpCenter.f81865a;
            }
            this(str, z3, detailsScope, inviteDetailsCampaignType, nVar);
        }
    }
}

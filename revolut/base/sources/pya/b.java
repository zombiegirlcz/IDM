package pya;

import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.DetailsScope;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InviteDetailsCampaignType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActiveOrPastInviteeDetails f240705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final owa.b f240706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f240707c;
    public final DetailsScope d;
    public final List e;
    public final InviteDetailsCampaignType f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f240708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f240709h;
    public final boolean i;

    public b(ActiveOrPastInviteeDetails inviteDetails, owa.b bVar, boolean z, DetailsScope detailsScope, List rewardTransactionsItems, InviteDetailsCampaignType campaignType, List list, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(inviteDetails, "inviteDetails");
        Intrinsics.checkNotNullParameter(detailsScope, "detailsScope");
        Intrinsics.checkNotNullParameter(rewardTransactionsItems, "rewardTransactionsItems");
        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
        this.f240705a = inviteDetails;
        this.f240706b = bVar;
        this.f240707c = z;
        this.d = detailsScope;
        this.e = rewardTransactionsItems;
        this.f = campaignType;
        this.f240708g = list;
        this.f240709h = z3;
        this.i = z4;
    }

    public static b a(b bVar, ActiveOrPastInviteeDetails activeOrPastInviteeDetails, owa.b bVar2, List list, List list2, boolean z, int i) {
        if ((i & 1) != 0) {
            activeOrPastInviteeDetails = bVar.f240705a;
        }
        ActiveOrPastInviteeDetails inviteDetails = activeOrPastInviteeDetails;
        if ((i & 2) != 0) {
            bVar2 = bVar.f240706b;
        }
        owa.b bVar3 = bVar2;
        boolean z3 = (i & 4) != 0 ? bVar.f240707c : true;
        DetailsScope detailsScope = bVar.d;
        List rewardTransactionsItems = (i & 16) != 0 ? bVar.e : list;
        InviteDetailsCampaignType campaignType = bVar.f;
        List list3 = (i & 64) != 0 ? bVar.f240708g : list2;
        boolean z4 = (i & 128) != 0 ? bVar.f240709h : z;
        boolean z6 = bVar.i;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(inviteDetails, "inviteDetails");
        Intrinsics.checkNotNullParameter(detailsScope, "detailsScope");
        Intrinsics.checkNotNullParameter(rewardTransactionsItems, "rewardTransactionsItems");
        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
        return new b(inviteDetails, bVar3, z3, detailsScope, rewardTransactionsItems, campaignType, list3, z4, z6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f240705a, bVar.f240705a) && Intrinsics.f(this.f240706b, bVar.f240706b) && this.f240707c == bVar.f240707c && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f240708g, bVar.f240708g) && this.f240709h == bVar.f240709h && this.i == bVar.i;
    }

    public final int hashCode() {
        int iHashCode = this.f240705a.hashCode() * 31;
        owa.b bVar = this.f240706b;
        int iHashCode2 = (this.f.hashCode() + p.a.d((this.d.hashCode() + j6.a.c((iHashCode + (bVar == null ? 0 : bVar.f230433a.hashCode())) * 31, 31, this.f240707c)) * 31, 31, this.e)) * 31;
        List list = this.f240708g;
        return Boolean.hashCode(this.i) + j6.a.c((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.f240709h);
    }
}

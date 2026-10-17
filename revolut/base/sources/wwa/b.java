package wwa;

import efm.r;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import pwa.i;
import pwa.n;
import uwa.j;
import uwa.q;
import w4l.h;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mwa.b f300637a;

    public b(mwa.b inviteCampaignRepository) {
        Intrinsics.checkNotNullParameter(inviteCampaignRepository, "inviteCampaignRepository");
        this.f300637a = inviteCampaignRepository;
    }

    public static r a(b bVar, i invitesListType, n referralCampaignV4Type, int i) {
        if ((i & 2) != 0) {
            referralCampaignV4Type = n.STANDARD;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(invitesListType, "invitesListType");
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        return mwa.b.a(bVar.f300637a, invitesListType, referralCampaignV4Type, 16);
    }

    public static r d(b bVar, boolean z, n referralCampaignV4Type, int i) {
        if ((i & 2) != 0) {
            referralCampaignV4Type = n.STANDARD;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        return rd0.e.c(mwa.b.c(bVar.f300637a, referralCampaignV4Type, z ? w4l.i.f294643c : h.f294642c, null, 2), g.f186406a);
    }

    public static r e(b bVar, n referralCampaignV4Type, int i) {
        if ((i & 1) != 0) {
            referralCampaignV4Type = n.STANDARD;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        return pd.b.r(rd0.e.c(mwa.b.c(bVar.f300637a, referralCampaignV4Type, null, null, 12), g.f186406a), new a(bVar, referralCampaignV4Type, 0));
    }

    public final r b(n referralCampaignV4Type) {
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        q qVar = (q) this.f300637a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return qVar.k.e(new uwa.e(referralCampaignV4Type), loadingStrategy);
    }

    public final vkm.d c(String str, int i, n campaignType) {
        Intrinsics.checkNotNullParameter(campaignType, "referralCampaignV4Type");
        q qVar = (q) this.f300637a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return qVar.f283597n.b(new j(str, i, campaignType), loadingStrategy);
    }
}

package mwa;

import efm.r;
import kotlin.jvm.internal.Intrinsics;
import pwa.i;
import pwa.n;
import uwa.d;
import uwa.f;
import uwa.g;
import uwa.q;
import w4l.k;
import zi0.c;

/* JADX INFO: loaded from: classes13.dex */
public interface b {
    static r a(b bVar, i invitesListType, n referralCampaignV4Type, int i) {
        q qVar = (q) bVar;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(invitesListType, "invitesListType");
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        return qVar.f283594j.f(new d(invitesListType, referralCampaignV4Type, null, null), true);
    }

    static r b(b bVar, n referralCampaignV4Type, boolean z, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        q qVar = (q) bVar;
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        return c.v(qVar.f283593h.f(new g(referralCampaignV4Type), z), new uwa.b(qVar, 0));
    }

    static vkm.d c(b bVar, n referralCampaignV4Type, k loadingStrategy, String str, int i) {
        if ((i & 4) != 0) {
            loadingStrategy = w4l.i.f294643c;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        q qVar = (q) bVar;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        x4l.c cVar = qVar.i;
        if (str == null) {
            str = null;
        }
        return cVar.b(new f(referralCampaignV4Type, null, str), loadingStrategy);
    }
}

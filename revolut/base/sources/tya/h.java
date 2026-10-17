package tya;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.shared.referrals.ui.impl.R$string;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pwa.n;
import rya.v;
import yp0.e0;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f275537a;

    public h(v paginatedInviteRowMapper, c inviteStatusUIMapper) {
        Intrinsics.checkNotNullParameter(paginatedInviteRowMapper, "paginatedInviteRowMapper");
        Intrinsics.checkNotNullParameter(inviteStatusUIMapper, "inviteStatusUIMapper");
        this.f275537a = paginatedInviteRowMapper;
    }

    public final aim.e a(ArrayList allInvites, boolean z, Throwable th10, d inviteItemType, n referralCampaignV4Type) {
        Intrinsics.checkNotNullParameter(allInvites, "allInvites");
        Intrinsics.checkNotNullParameter(inviteItemType, "inviteItemType");
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        aim.e eVarB = u.b();
        ArrayList activeItems = new ArrayList();
        ArrayList pastItems = new ArrayList();
        Iterator it8 = allInvites.iterator();
        while (it8.hasNext()) {
            pwa.j jVar = (pwa.j) it8.next();
            RowDelegate.Model modelA = this.f275537a.a(jVar, inviteItemType, referralCampaignV4Type);
            int i = g.f275536a[jVar.d.ordinal()];
            if (i == 1) {
                activeItems.add(modelA);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                pastItems.add(modelA);
            }
        }
        Object objB = th10 != null ? c.b("PAGINATION_ERROR_LIST_ID") : z ? nb0.b(pb0.Companion, "loading_item_PAGINATION_LOADING_ROW_LIST_ID", false, 0, false, 14) : null;
        Intrinsics.checkNotNullParameter(activeItems, "activeItems");
        Intrinsics.checkNotNullParameter(pastItems, "pastItems");
        aim.e eVarB2 = u.b();
        if (!activeItems.isEmpty()) {
            eVarB2.addAll(yp0.b.g((!pastItems.isEmpty() || objB == null) ? activeItems : d0.F0(objB, activeItems), c.i(R$string.referrals_invites_list_title_active, "active"), e0.OUTSIDE_BOX, 0, 0, 124));
        }
        if (!pastItems.isEmpty()) {
            eVarB2.addAll(yp0.b.g(objB != null ? d0.F0(objB, pastItems) : pastItems, c.i(R$string.referrals_invites_list_title_past, "past"), e0.OUTSIDE_BOX, 0, 0, 124));
        }
        if (activeItems.isEmpty() && pastItems.isEmpty() && objB != null) {
            List listC = u.c(objB);
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            eVarB2.addAll(listC);
        }
        eVarB.addAll(u.a(eVarB2));
        return u.a(eVarB);
    }
}

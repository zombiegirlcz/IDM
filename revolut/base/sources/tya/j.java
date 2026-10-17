package tya;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesRewardInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.InviteStepInfo;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pwa.n;
import pwa.o;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jxa.e f275538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f275539b;

    public j(jxa.e sharedContactsInteractor, c inviteStatusUIMapper) {
        Intrinsics.checkNotNullParameter(sharedContactsInteractor, "sharedContactsInteractor");
        Intrinsics.checkNotNullParameter(inviteStatusUIMapper, "inviteStatusUIMapper");
        this.f275538a = sharedContactsInteractor;
        this.f275539b = inviteStatusUIMapper;
    }

    public final RowDelegate.Model a(ActiveOrPastInviteeDetails invite, d type, n referralCampaignV4Type) {
        Intrinsics.checkNotNullParameter(invite, "invite");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        o oVar = invite.k;
        ArrayList arrayList = invite.f81694l;
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo = invite.f81693j;
        pwa.b inviteStatus = invite.f81695m;
        boolean z = oVar == o.TIERED;
        String str = invite.d;
        if (str == null) {
            str = invite.v;
        }
        String str2 = str;
        ContactImage contactImage = str2 != null ? new ContactImage((String) null, (String) null, str2, (String) null, (String) null, invite.b(), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4059) : this.f275538a.b(invite);
        if (contactImage == null) {
            return null;
        }
        String str3 = "INVITES_LIST_ID_" + invite.e;
        Intrinsics.checkNotNullParameter(inviteStatus, "status");
        Intrinsics.checkNotNullParameter(contactImage, "contactImage");
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(contactImage, cya.d.b(inviteStatus, z, activeOrPastInvitesRewardInfo), null, false, 28);
        TextClause textClause = new TextClause(invite.b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Intrinsics.checkNotNullParameter(inviteStatus, "inviteStatus");
        RowDelegate.Model.b bVar = inviteStatus == pwa.b.INELIGIBLE ? RowDelegate.Model.b.a.f53266a : RowDelegate.Model.b.c.f53268a;
        pwa.b bVar2 = invite.f81695m;
        Instant instant = invite.f81696n;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            String str4 = str3;
            ArrayList arrayList3 = arrayList;
            pwa.b bVar3 = bVar2;
            if (((InviteStepInfo) obj2).f81724a == pwa.e.DONE) {
                arrayList2.add(obj2);
            }
            str3 = str4;
            arrayList = arrayList3;
            bVar2 = bVar3;
        }
        return new RowDelegate.Model(str3, image40, textClause, null, 1, this.f275539b.e(bVar2, instant, type, new pwa.f(arrayList.size(), arrayList2.size()), invite.f81693j, z), null, null, 0, c.f(referralCampaignV4Type, activeOrPastInvitesRewardInfo, inviteStatus, z), false, null, false, bVar, null, null, null, null, null, invite, null, 0, 0, 0, 0, 532659144);
    }
}

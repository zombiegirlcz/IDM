package rya;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesRewardInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tya.c f258286a;

    public v(tya.c inviteStatusUIMapper) {
        Intrinsics.checkNotNullParameter(inviteStatusUIMapper, "inviteStatusUIMapper");
        this.f258286a = inviteStatusUIMapper;
    }

    public final RowDelegate.Model a(pwa.j invite, tya.d type, pwa.n referralCampaignV4Type) {
        Intrinsics.checkNotNullParameter(invite, "invite");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        pwa.o oVar = invite.f;
        String str = invite.f240362c;
        String str2 = invite.f240361b;
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo = invite.i;
        pwa.b inviteStatus = invite.e;
        boolean z = oVar == pwa.o.TIERED;
        String strQ = j6.a.q("paginated_invite_", invite.f240360a);
        ContactImage contactImage = new ContactImage((String) null, (String) null, invite.f240366l, (String) null, (String) null, com.google.android.gms.internal.mlkit_vision_face.a.o(str2, " ", str), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4059);
        Intrinsics.checkNotNullParameter(inviteStatus, "status");
        Intrinsics.checkNotNullParameter(contactImage, "contactImage");
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(contactImage, cya.d.b(inviteStatus, z, activeOrPastInvitesRewardInfo), null, false, 28);
        TextClause textClause = new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(str2, " ", str), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Intrinsics.checkNotNullParameter(inviteStatus, "inviteStatus");
        return new RowDelegate.Model(strQ, image40, textClause, null, 1, this.f258286a.e(inviteStatus, invite.f240365j, type, invite.f240364h, invite.i, z), null, null, 0, tya.c.f(referralCampaignV4Type, activeOrPastInvitesRewardInfo, inviteStatus, z), false, null, false, inviteStatus == pwa.b.INELIGIBLE ? RowDelegate.Model.b.a.f53266a : RowDelegate.Model.b.c.f53268a, null, null, null, null, null, invite, null, 0, 0, 0, 0, 532659144);
    }
}

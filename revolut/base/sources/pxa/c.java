package pxa;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.referrals.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import nii.l0;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import pwa.n;
import wwa.f;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends bn3.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f240591l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f240592m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final cl3.a f240593n;
    public final wwa.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y0 f240594p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y0 f240595q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y0 f240596r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y0 f240597s;

    public c(n referralCampaignV4Type, f inviteFriendsMessagingInteractor, cl3.a contactsInteractor, wwa.b inviteCampaignHomeInteractor) {
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        Intrinsics.checkNotNullParameter(inviteFriendsMessagingInteractor, "inviteFriendsMessagingInteractor");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(inviteCampaignHomeInteractor, "inviteCampaignHomeInteractor");
        this.f240591l = referralCampaignV4Type;
        this.f240592m = inviteFriendsMessagingInteractor;
        this.f240593n = contactsInteractor;
        this.o = inviteCampaignHomeInteractor;
        this.f240594p = new y0("DIALOG_ID", new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4);
        this.f240595q = new y0("DIALOG_ID", new l0(new TextLocalisedClause(R$string.referrals_invite_campaign_invite_friends_skipped_title, null, null, 14), new TextLocalisedClause(R$string.referrals_invite_campaign_invite_friends_skipped_description, null, null, 14), null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, false, null, 1012), false, 4);
        this.f240596r = new y0("DIALOG_ID", new z(new TextLocalisedClause(R$string.referrals_invite_campaign_invite_friends_failed_multiple_title, null, null, 14), new TextLocalisedClause(R$string.referrals_invite_campaign_invite_friends_failed_multiple_description, null, null, 14), new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
        this.f240597s = new y0("DIALOG_ID", new z(new TextLocalisedClause(R$string.referrals_invite_campaign_invite_friends_failed_one_title, null, null, 14), new TextLocalisedClause(R$string.referrals_invite_campaign_invite_friends_failed_one_description, null, null, 14), new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d1  */
    @Override // bn3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(java.util.List r17, nb6.p r18, kotlin.coroutines.Continuation r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pxa.c.Z2(java.util.List, nb6.p, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

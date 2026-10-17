package vwa;

import com.revolut.feature.referrals.common.data.impl.network.services.InviteFriendsMessagingService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i implements e4m.e {
    public static InviteFriendsMessagingService a(h hVar, ek.a converterFactory, ik0.b retrofitFactory, p9l.a referralsNetworkConfiguration) {
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(referralsNetworkConfiguration, "referralsNetworkConfiguration");
        Object objCreate = ik0.b.a(retrofitFactory, null, referralsNetworkConfiguration.getHostUrl(), converterFactory, null, 25).create(InviteFriendsMessagingService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        InviteFriendsMessagingService inviteFriendsMessagingService = (InviteFriendsMessagingService) objCreate;
        s.k(inviteFriendsMessagingService);
        return inviteFriendsMessagingService;
    }
}

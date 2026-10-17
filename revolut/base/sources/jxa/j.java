package jxa;

import com.revolut.feature.referrals.impl.referrals_flow.InviteFriendsViaContactsDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pwa.n;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final BridgeDestination a(n referralCampaignV4Type) {
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        return u0.c(u0.d(new InviteFriendsViaContactsDestination(referralCampaignV4Type)));
    }
}

package b5a;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ParcelableDestination;
import kotlin.jvm.internal.Intrinsics;
import nd.o;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f12478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f12479b;

    public b(n8b.a countryInteractor, o chooserIntentNavigationCommandFactory, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(chooserIntentNavigationCommandFactory, "chooserIntentNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f12478a = countryInteractor;
        this.f12479b = uiKitResources;
    }

    public final ParcelableDestination a() {
        if (!((o8b.c) this.f12478a).g()) {
            return new ReferralsBizFeatureConfig.InviteCampaignHomeNavigationDestination(false, false, null, null, 14);
        }
        return new BridgeDestination(o.i("", this.f12479b.b(new TextLocalisedClause(R$string.referral_text_in_tailored, u.c("https://www.revolut.com/en-IN/"), null, 12)).toString()));
    }
}

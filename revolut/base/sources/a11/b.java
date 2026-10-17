package a11;

import com.revolut.crypto.challenge.api.CryptoChallengeApi$FeatureToggles$CryptoPlanChallenge;
import com.revolut.crypto.challenge.api.navigation.CryptoChallengeRewardsDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f467b;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f466a = featureToggleInteractor;
        this.f467b = y0.b("crypto/campaigns/crypto-deposit-plan");
    }

    @Override // xii.b
    public final Set a() {
        return this.f467b;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (this.f466a.a(CryptoChallengeApi$FeatureToggles$CryptoPlanChallenge.f60102c)) {
            return null;
        }
        return CryptoChallengeRewardsDestination.f60103a;
    }
}

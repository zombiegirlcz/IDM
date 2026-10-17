package akf;

import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.feature.security_hub.api.navigation.SecurityHubDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f5814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f5815m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kl.t1 f5816n;

    public b0(klf.h0 commonDataSource, klf.m1 juniorDataSource, kl.t1 cardsFeatureAvailabilityChecker) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(cardsFeatureAvailabilityChecker, "cardsFeatureAvailabilityChecker");
        this.f5814l = commonDataSource;
        this.f5815m = juniorDataSource;
        this.f5816n = cardsFeatureAvailabilityChecker;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (a10.b.B(v1.Companion, t1.CARD_LIMITS, str)) {
            A2(new SecurityHubDestination((SecurityHubStartScreen) SecurityHubStartScreen.TransactionsLimits.f85391a, true, (String) null, true, 16));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

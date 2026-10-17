package llh;

import kbb.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.k f196801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2b.b f196802b;

    public a(ybl.k tradingAccountsInteractor, a2b.b cfdOnboardingConfigProvider, r wealthMainTabProvider) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(cfdOnboardingConfigProvider, "cfdOnboardingConfigProvider");
        Intrinsics.checkNotNullParameter(wealthMainTabProvider, "wealthMainTabProvider");
        this.f196801a = tradingAccountsInteractor;
        this.f196802b = cfdOnboardingConfigProvider;
    }
}

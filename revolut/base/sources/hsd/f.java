package hsd;

import g48.r0;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f155035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f155036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ppk.f f155037c;
    public final twg.c d;
    public final gte.a e;

    public f(r0 jointAccountsInteractor, n walletInteractor, ppk.f ratesInteractor, b jointNetWorthProductMapper, twg.c totalWealthPocketsInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(jointNetWorthProductMapper, "jointNetWorthProductMapper");
        Intrinsics.checkNotNullParameter(totalWealthPocketsInteractor, "totalWealthPocketsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f155035a = jointAccountsInteractor;
        this.f155036b = walletInteractor;
        this.f155037c = ratesInteractor;
        this.d = totalWealthPocketsInteractor;
        this.e = featureToggleInteractor;
    }
}

package f0c;

import ewh.x;
import ewh.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements cli.n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f131078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f131079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f131080c;
    public final h d;
    public final zjh.j e;

    public l(i revPointsRedeemScreenNavbarMapper, n revPointsRedeemWaysToRedeemMapper, d revPointsRedeemFeaturedRewardsMapper, h revPointsRedeemRewardsForYouMapper, a revPointsRedeemAnalyticsContextMapper, zjh.j legalEntityDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(revPointsRedeemScreenNavbarMapper, "revPointsRedeemScreenNavbarMapper");
        Intrinsics.checkNotNullParameter(revPointsRedeemWaysToRedeemMapper, "revPointsRedeemWaysToRedeemMapper");
        Intrinsics.checkNotNullParameter(revPointsRedeemFeaturedRewardsMapper, "revPointsRedeemFeaturedRewardsMapper");
        Intrinsics.checkNotNullParameter(revPointsRedeemRewardsForYouMapper, "revPointsRedeemRewardsForYouMapper");
        Intrinsics.checkNotNullParameter(revPointsRedeemAnalyticsContextMapper, "revPointsRedeemAnalyticsContextMapper");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        this.f131078a = revPointsRedeemScreenNavbarMapper;
        this.f131079b = revPointsRedeemWaysToRedeemMapper;
        this.f131080c = revPointsRedeemFeaturedRewardsMapper;
        this.d = revPointsRedeemRewardsForYouMapper;
        this.e = legalEntityDisclaimerMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        c0c.k domainState = (c0c.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (c0c.m) iii.c.f(domainState.f20209a, new x(29), new y(this, 14), new dn8.k(this, domainState, 29));
    }
}

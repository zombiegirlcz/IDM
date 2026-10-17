package e2f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements cli.n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2f.h f122053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final by5.a f122054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2f.j f122055c;
    public final g2f.q d;
    public final g2f.d e;

    public b(g2f.h rateMapper, by5.a giftCardSectionMapper, g2f.e brandsMapper, g2f.j redeemOptionsMapper, g2f.q airlineHowItWorksMapper, g2f.r milesDisclaimerMapper, g2f.d commonMapper) {
        Intrinsics.checkNotNullParameter(rateMapper, "rateMapper");
        Intrinsics.checkNotNullParameter(giftCardSectionMapper, "giftCardSectionMapper");
        Intrinsics.checkNotNullParameter(brandsMapper, "brandsMapper");
        Intrinsics.checkNotNullParameter(redeemOptionsMapper, "redeemOptionsMapper");
        Intrinsics.checkNotNullParameter(airlineHowItWorksMapper, "airlineHowItWorksMapper");
        Intrinsics.checkNotNullParameter(milesDisclaimerMapper, "milesDisclaimerMapper");
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        this.f122053a = rateMapper;
        this.f122054b = giftCardSectionMapper;
        this.f122055c = redeemOptionsMapper;
        this.d = airlineHowItWorksMapper;
        this.e = commonMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        n domainState = (n) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return this.e.a(domainState, new a76.c(0, this, b.class, "createLoadingState", "createLoadingState()Ljava/util/List;", 0, 11), new a97.i(2, this, b.class, "createAgentDetailsContent", "createAgentDetailsContent(Lcom/revolut/feature/trade_rev_points/models/TradeRevPointsAgent;Lcom/revolut/data/model/Data;)Ljava/util/List;", 0, 19));
    }
}

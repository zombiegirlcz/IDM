package e2f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 implements cli.n {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2f.h f122067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final by5.a f122068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2f.j f122069c;
    public final g2f.d d;

    public i0(g2f.h rateMapper, by5.a giftCardSectionMapper, g2f.e brandsMapper, g2f.j redeemOptionsMapper, g2f.a agentDescriptionMapper, g2f.d commonMapper) {
        Intrinsics.checkNotNullParameter(rateMapper, "rateMapper");
        Intrinsics.checkNotNullParameter(giftCardSectionMapper, "giftCardSectionMapper");
        Intrinsics.checkNotNullParameter(brandsMapper, "brandsMapper");
        Intrinsics.checkNotNullParameter(redeemOptionsMapper, "redeemOptionsMapper");
        Intrinsics.checkNotNullParameter(agentDescriptionMapper, "agentDescriptionMapper");
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        this.f122067a = rateMapper;
        this.f122068b = giftCardSectionMapper;
        this.f122069c = redeemOptionsMapper;
        this.d = commonMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        n domainState = (n) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return this.d.a(domainState, new a76.c(0, this, i0.class, "createLoadingState", "createLoadingState()Ljava/util/List;", 0, 12), new a97.i(2, this, i0.class, "createAgentDetailsContent", "createAgentDetailsContent(Lcom/revolut/feature/trade_rev_points/models/TradeRevPointsAgent;Lcom/revolut/data/model/Data;)Ljava/util/List;", 0, 20));
    }
}

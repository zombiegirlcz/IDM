package e2f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2f.h f122070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2f.k f122071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final by5.a f122072c;
    public final g2f.j d;
    public final g2f.d e;

    public j0(g2f.h rateMapper, g2f.k transactionHistoryMapper, by5.a giftCardSectionMapper, g2f.e brandsMapper, g2f.j redeemOptionsMapper, g2f.a agentDescriptionMapper, g2f.f logOutMapper, g2f.d commonMapper) {
        Intrinsics.checkNotNullParameter(rateMapper, "rateMapper");
        Intrinsics.checkNotNullParameter(transactionHistoryMapper, "transactionHistoryMapper");
        Intrinsics.checkNotNullParameter(giftCardSectionMapper, "giftCardSectionMapper");
        Intrinsics.checkNotNullParameter(brandsMapper, "brandsMapper");
        Intrinsics.checkNotNullParameter(redeemOptionsMapper, "redeemOptionsMapper");
        Intrinsics.checkNotNullParameter(agentDescriptionMapper, "agentDescriptionMapper");
        Intrinsics.checkNotNullParameter(logOutMapper, "logOutMapper");
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        this.f122070a = rateMapper;
        this.f122071b = transactionHistoryMapper;
        this.f122072c = giftCardSectionMapper;
        this.d = redeemOptionsMapper;
        this.e = commonMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        n domainState = (n) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return this.e.a(domainState, new a76.c(0, this, j0.class, "createLoadingState", "createLoadingState()Ljava/util/List;", 0, 13), new a8a.a(this, domainState, 23));
    }
}

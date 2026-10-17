package jzb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements cli.n {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f179720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f179721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f179722c;
    public final d0 d;
    public final l e;
    public final x f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zjh.j f179723g;

    public v(s revPointsEarnScreenNavBarMapper, h0 revPointsUpsellBannerMapper, p revPointsEarnCardSpendMapper, d0 revPointsEarnTopUpsSectionMapper, l bonusPointsSectionMapper, x topBrandsSectionMapper, zjh.j legalEntityDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(revPointsEarnScreenNavBarMapper, "revPointsEarnScreenNavBarMapper");
        Intrinsics.checkNotNullParameter(revPointsUpsellBannerMapper, "revPointsUpsellBannerMapper");
        Intrinsics.checkNotNullParameter(revPointsEarnCardSpendMapper, "revPointsEarnCardSpendMapper");
        Intrinsics.checkNotNullParameter(revPointsEarnTopUpsSectionMapper, "revPointsEarnTopUpsSectionMapper");
        Intrinsics.checkNotNullParameter(bonusPointsSectionMapper, "bonusPointsSectionMapper");
        Intrinsics.checkNotNullParameter(topBrandsSectionMapper, "topBrandsSectionMapper");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        this.f179720a = revPointsEarnScreenNavBarMapper;
        this.f179721b = revPointsUpsellBannerMapper;
        this.f179722c = revPointsEarnCardSpendMapper;
        this.d = revPointsEarnTopUpsSectionMapper;
        this.e = bonusPointsSectionMapper;
        this.f = topBrandsSectionMapper;
        this.f179723g = legalEntityDisclaimerMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        hzb.t domainState = (hzb.t) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (hzb.v) iii.c.f(domainState.f157123a, new jyk.d0(11), new jul.c(this, 18), new joa.j(this, domainState, 11));
    }
}

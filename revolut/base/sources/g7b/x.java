package g7b;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class x implements cli.n {

    @NotNull
    private static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7b.a f141164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i7b.i f141165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i7b.e f141166c;
    public final i7b.b d;
    public final i7b.m e;

    public x(i7b.a bannerItemMapper, i7b.i nextRewardItemsMapper, i7b.e cardBenefitItemsMapper, i7b.b benefitsSectionItemsMapper, i7b.h manageCardItemsMapper, i7b.m upsellBannerItemMapper) {
        Intrinsics.checkNotNullParameter(bannerItemMapper, "bannerItemMapper");
        Intrinsics.checkNotNullParameter(nextRewardItemsMapper, "nextRewardItemsMapper");
        Intrinsics.checkNotNullParameter(cardBenefitItemsMapper, "cardBenefitItemsMapper");
        Intrinsics.checkNotNullParameter(benefitsSectionItemsMapper, "benefitsSectionItemsMapper");
        Intrinsics.checkNotNullParameter(manageCardItemsMapper, "manageCardItemsMapper");
        Intrinsics.checkNotNullParameter(upsellBannerItemMapper, "upsellBannerItemMapper");
        this.f141164a = bannerItemMapper;
        this.f141165b = nextRewardItemsMapper;
        this.f141166c = cardBenefitItemsMapper;
        this.d = benefitsSectionItemsMapper;
        this.e = upsellBannerItemMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        n domainState = (n) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new p((List) iii.c.f(domainState.f141152a, new g64.c(this, 9), new g5k.f(7), new fyg.b(this, domainState, 10)));
    }
}

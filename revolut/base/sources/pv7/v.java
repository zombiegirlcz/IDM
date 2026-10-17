package pv7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements cli.n {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f240000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xv7.b f240001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xv7.f f240002c;
    public final xv7.d d;
    public final xv7.l e;
    public final yik.b f;

    public v(f01.c uiKitResources, xv7.b conditionsSectionMapper, xv7.f coveragesSectionMapper, xv7.q promotionSectionMapper, xv7.d contactsSectionMapper, xv7.n orderCardWidgetMapper, xv7.a activateCoverageWidgetMapper, xv7.l genericBannerMapper, xv7.j footerTextMapper, yik.b planAnimatedBackgroundTypeMapper) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(conditionsSectionMapper, "conditionsSectionMapper");
        Intrinsics.checkNotNullParameter(coveragesSectionMapper, "coveragesSectionMapper");
        Intrinsics.checkNotNullParameter(promotionSectionMapper, "promotionSectionMapper");
        Intrinsics.checkNotNullParameter(contactsSectionMapper, "contactsSectionMapper");
        Intrinsics.checkNotNullParameter(orderCardWidgetMapper, "orderCardWidgetMapper");
        Intrinsics.checkNotNullParameter(activateCoverageWidgetMapper, "activateCoverageWidgetMapper");
        Intrinsics.checkNotNullParameter(genericBannerMapper, "genericBannerMapper");
        Intrinsics.checkNotNullParameter(footerTextMapper, "footerTextMapper");
        Intrinsics.checkNotNullParameter(planAnimatedBackgroundTypeMapper, "planAnimatedBackgroundTypeMapper");
        this.f240000a = uiKitResources;
        this.f240001b = conditionsSectionMapper;
        this.f240002c = coveragesSectionMapper;
        this.d = contactsSectionMapper;
        this.e = genericBannerMapper;
        this.f = planAnimatedBackgroundTypeMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (r) iii.c.f(domainState.f239986a, new pui.a(this, 10), new psl.m(this, 21), new ox2.d(this, domainState, 23));
    }
}

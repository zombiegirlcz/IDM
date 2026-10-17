package zmj;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class r0 implements cli.n {

    @NotNull
    public static final q0 Companion = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gej.a f323583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final unj.e f323584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bnj.h f323585c;
    public final zjh.j d;
    public final bnj.l e;
    public final bnj.q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bnj.f f323586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f323587h;

    public r0(gej.a bytesFormatter, unj.e coverageItemMapper, bnj.h dataUsageItemMapper, fhj.d autoRenewalItemMapper, bnj.s statusItemsMapper, fhj.b activationInfoItemMapper, zjh.j actionButtonMapper, bnj.r renewedOnItemsMapper, bnj.l actionItemsMapper, bnj.q navBarConfigMapper, bnj.f externalNavigationSectionMapper) {
        Intrinsics.checkNotNullParameter(bytesFormatter, "bytesFormatter");
        Intrinsics.checkNotNullParameter(coverageItemMapper, "coverageItemMapper");
        Intrinsics.checkNotNullParameter(dataUsageItemMapper, "dataUsageItemMapper");
        Intrinsics.checkNotNullParameter(autoRenewalItemMapper, "autoRenewalItemMapper");
        Intrinsics.checkNotNullParameter(statusItemsMapper, "statusItemsMapper");
        Intrinsics.checkNotNullParameter(activationInfoItemMapper, "activationInfoItemMapper");
        Intrinsics.checkNotNullParameter(actionButtonMapper, "actionButtonMapper");
        Intrinsics.checkNotNullParameter(renewedOnItemsMapper, "renewedOnItemsMapper");
        Intrinsics.checkNotNullParameter(actionItemsMapper, "actionItemsMapper");
        Intrinsics.checkNotNullParameter(navBarConfigMapper, "navBarConfigMapper");
        Intrinsics.checkNotNullParameter(externalNavigationSectionMapper, "externalNavigationSectionMapper");
        this.f323583a = bytesFormatter;
        this.f323584b = coverageItemMapper;
        this.f323585c = dataUsageItemMapper;
        this.d = actionButtonMapper;
        this.e = actionItemsMapper;
        this.f = navBarConfigMapper;
        this.f323586g = externalNavigationSectionMapper;
        this.f323587h = te0.w.y0(new zj9.a(18));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        n domainState = (n) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (f0) iii.c.f(t1.z(domainState.f323568a, domainState.f323570c, domainState.f323569b, domainState.e, domainState.f323571g, domainState.f323574l, domainState.f323575m, domainState.f323572h), new zmb.c(this, 12), new zk1.p(this, 27), new zhl.l(this, domainState, 3));
    }
}

package ldk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 implements cli.n {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pdk.h f194161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yik.b f194162b;

    public a0(pdk.c headerContentMapper, pdk.d revealSectionMapper, pdk.h tilesGridMapper, pdk.a cellDetailsSectionMapper, pdk.b footerTextMapper, yik.b planAnimatedBackgroundTypeMapper) {
        Intrinsics.checkNotNullParameter(headerContentMapper, "headerContentMapper");
        Intrinsics.checkNotNullParameter(revealSectionMapper, "revealSectionMapper");
        Intrinsics.checkNotNullParameter(tilesGridMapper, "tilesGridMapper");
        Intrinsics.checkNotNullParameter(cellDetailsSectionMapper, "cellDetailsSectionMapper");
        Intrinsics.checkNotNullParameter(footerTextMapper, "footerTextMapper");
        Intrinsics.checkNotNullParameter(planAnimatedBackgroundTypeMapper, "planAnimatedBackgroundTypeMapper");
        this.f194161a = tilesGridMapper;
        this.f194162b = planAnimatedBackgroundTypeMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (x) iii.c.f(domainState.f194163a, new lbh.a(this, 25), new l9j.j(15), new koe.y(this, domainState, 13));
    }
}

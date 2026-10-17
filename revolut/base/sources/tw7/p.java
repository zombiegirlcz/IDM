package tw7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sr7.h f274944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sr7.i f274945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yik.b f274946c;

    public p(sr7.h bannerBuilder, sr7.i imageBuilder, yik.b planAnimatedBackgroundTypeMapper) {
        Intrinsics.checkNotNullParameter(bannerBuilder, "bannerBuilder");
        Intrinsics.checkNotNullParameter(imageBuilder, "imageBuilder");
        Intrinsics.checkNotNullParameter(planAnimatedBackgroundTypeMapper, "planAnimatedBackgroundTypeMapper");
        this.f274944a = bannerBuilder;
        this.f274945b = imageBuilder;
        this.f274946c = planAnimatedBackgroundTypeMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (j) iii.c.f(domainState.f274934a, new tsk.j(this, 22), new tq0.j(this, 29), new tvh.e(this, domainState, 1));
    }
}

package gq4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class t implements cli.n {

    @NotNull
    private static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final he2.b f145564a;

    public t(he2.b creditCardSectionMapper) {
        Intrinsics.checkNotNullParameter(creditCardSectionMapper, "creditCardSectionMapper");
        this.f145564a = creditCardSectionMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (l) iii.c.f(domainState.f145552c, new gn.a(26), new gp3.n(6), new fyg.b(this, domainState, 21));
    }
}

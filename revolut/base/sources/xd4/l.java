package xd4;

import cli.n;
import cli.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements n {

    @NotNull
    private static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z9l.i f304269a;

    public l(z9l.i progressionStepsMapper) {
        Intrinsics.checkNotNullParameter(progressionStepsMapper, "progressionStepsMapper");
        this.f304269a = progressionStepsMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (d) iii.c.f(domainState.f304256b, new x8h.d(this, domainState), new x2g.b(this, domainState), new wx6.k(this, domainState, 9));
    }
}

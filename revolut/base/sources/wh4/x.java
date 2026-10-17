package wh4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class x implements cli.n {

    @NotNull
    private static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c45.b f297416a;

    public x(c45.b accountMapper) {
        Intrinsics.checkNotNullParameter(accountMapper, "accountMapper");
        this.f297416a = accountMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (p) iii.c.f(domainState.f297396a, new wgk.f(this, 2), new wf0.b(this, 10), new vjh.c(this, 22));
    }
}

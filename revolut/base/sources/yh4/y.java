package yh4;

import kotlin.jvm.internal.Intrinsics;
import xo8.j0;

/* JADX INFO: loaded from: classes22.dex */
public final class y implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c45.b f313773a;

    public y(c45.b accountMapper) {
        Intrinsics.checkNotNullParameter(accountMapper, "accountMapper");
        this.f313773a = accountMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (o) iii.c.f(domainState.f313751a, new ye1.m(this, 27), new yd8.a(this, 10), new j0(this, 23));
    }
}

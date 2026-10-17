package jt4;

import cli.n;
import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final he2.b f178350a;

    public j(he2.b creditCardSectionMapper, lt4.e creditCardLargeButtonModelMapper) {
        Intrinsics.checkNotNullParameter(creditCardSectionMapper, "creditCardSectionMapper");
        Intrinsics.checkNotNullParameter(creditCardLargeButtonModelMapper, "creditCardLargeButtonModelMapper");
        this.f178350a = creditCardSectionMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (c) iii.c.f(domainState.f178338a, new jt2.d(1), new jme.f(23), new j75.i(this, 14));
    }
}

package bv4;

import bn4.y;
import bt9.t;
import cli.n;
import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f90.b f18967a;

    public j(f90.b pluralFormatter) {
        Intrinsics.checkNotNullParameter(pluralFormatter, "pluralFormatter");
        this.f18967a = pluralFormatter;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(domainState.f18960a, new t(this, 13), new y(this, 24), new b88.o(this, 19));
    }
}

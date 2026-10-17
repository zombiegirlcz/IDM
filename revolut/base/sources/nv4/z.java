package nv4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class z implements cli.n {

    @NotNull
    public static final x Companion = new x();

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (p) iii.c.f(domainState.d, new nrd.g(this, 10), new nsl.d(this, 6), new nrd.i(this, domainState, 3));
    }
}

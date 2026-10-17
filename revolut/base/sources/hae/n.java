package hae;

import cli.o;
import h43.q;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.l f150502a;

    public n(thf.l transactionItemMapper) {
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        this.f150502a = transactionItemMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new h(domainState.f150486a, (List) iii.c.f(domainState.f150487b, new ha1.k(this, 26), new q(27), new gna.i(this, 20)));
    }
}

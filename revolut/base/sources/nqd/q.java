package nqd;

import kotlin.jvm.internal.Intrinsics;
import nmb.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pqd.f f218427a;

    public q(pqd.f incomeSorterWithTransactionMapper) {
        Intrinsics.checkNotNullParameter(incomeSorterWithTransactionMapper, "incomeSorterWithTransactionMapper");
        this.f218427a = incomeSorterWithTransactionMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (e) iii.c.f(domainState.f218404a, new nnf.h(this, 25), new v(24), new mgh.i(this, 29));
    }
}

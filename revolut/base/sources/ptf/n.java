package ptf;

import cli.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.n f239672a;

    public n(whf.n transactionsListMapper) {
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        this.f239672a = transactionsListMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(domainState.f239659a, new psl.e(this), new psl.m(this, 8), new ox2.d(this, domainState, 21));
    }
}

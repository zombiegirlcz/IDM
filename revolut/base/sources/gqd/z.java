package gqd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class z implements cli.n {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.n f145706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f145707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9l.a f145708c;

    public z(whf.n transactionsListItemMapper, r destinationMapper, j9l.a moneyCalculator) {
        Intrinsics.checkNotNullParameter(transactionsListItemMapper, "transactionsListItemMapper");
        Intrinsics.checkNotNullParameter(destinationMapper, "destinationMapper");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        this.f145706a = transactionsListItemMapper;
        this.f145707b = destinationMapper;
        this.f145708c = moneyCalculator;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(domainState.f145678a, new gqa.a(this), new gp3.n(8), new gna.i(this, 6));
    }
}

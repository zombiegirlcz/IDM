package o42;

import cli.n;
import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a12.k f221988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whf.n f221989b;

    public m(a12.k moneyRequestsMapper, whf.n transactionsListMapper) {
        Intrinsics.checkNotNullParameter(moneyRequestsMapper, "moneyRequestsMapper");
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        this.f221988a = moneyRequestsMapper;
        this.f221989b = transactionsListMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g((List) iii.c.f(domainState.f221979a, new o2g.f(this, 14), new nz7.g(27), new nrd.i(this, 11)));
    }
}

package ma;

import kotlin.jvm.internal.Intrinsics;
import m9d.j1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class q implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f203855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.d f203856b;

    public q(f01.c uiKitResources, thf.d transactionIconResourcesMapper) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        this.f203855a = uiKitResources;
        this.f203856b = transactionIconResourcesMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (n) iii.c.f(domainState.f203843a, new m9l.d(1), new j1(2), new m88.c(this, domainState, 2));
    }
}

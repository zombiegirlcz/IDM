package zl1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ymk.y;

/* JADX INFO: loaded from: classes20.dex */
public final class t implements cli.n {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v02.a f323172a;

    public t(v02.a aliasMapper) {
        Intrinsics.checkNotNullParameter(aliasMapper, "aliasMapper");
        this.f323172a = aliasMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(domainState.f323156a, new zke.f(27), new zk1.p(11), new y(this, 16));
    }
}

package bi2;

import bb2.t;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v02.a f15393a;

    public q(v02.a aliasMapper) {
        Intrinsics.checkNotNullParameter(aliasMapper, "aliasMapper");
        this.f15393a = aliasMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new c((List) iii.c.f(domainState.f15374a, new bek.a(22), new t(24), new b88.o(this, 6)));
    }
}

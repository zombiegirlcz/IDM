package uk2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class y implements cli.n {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.c f280672a;

    public y(qd0.c localizedDistanceUnitFactory) {
        Intrinsics.checkNotNullParameter(localizedDistanceUnitFactory, "localizedDistanceUnitFactory");
        this.f280672a = localizedDistanceUnitFactory;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new c((List) iii.c.f(domainState.f280641a, new uj6.v(this, 4), new uj8.j(this, 3), new w(this, 0)), (lw0.m) iii.c.f(domainState.f280641a, new ud3.n(this, 26), new uj8.j(this, 2), new u3b.h(this, 15)));
    }
}

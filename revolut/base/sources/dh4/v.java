package dh4;

import dee.a0;
import kotlin.jvm.internal.Intrinsics;
import mx4.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class v implements cli.n {

    @NotNull
    private static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f114766a;

    public v(z mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f114766a = mapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (l) iii.c.f(domainState.f114744a, new dg3.d(this, 3), new a0(this), new cab.m(this, domainState, 23));
    }
}

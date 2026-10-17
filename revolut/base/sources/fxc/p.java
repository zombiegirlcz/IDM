package fxc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3i.b f138800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f138801b;

    public p(n3i.b externalCardMapper, b externalCardStatusMapper) {
        Intrinsics.checkNotNullParameter(externalCardMapper, "externalCardMapper");
        Intrinsics.checkNotNullParameter(externalCardStatusMapper, "externalCardStatusMapper");
        this.f138800a = externalCardMapper;
        this.f138801b = externalCardStatusMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (m) iii.c.f(domainState.f138793a, new fwf.n(7), new fv0.c(this, 10), new f0e.i(this, domainState, 28));
    }
}

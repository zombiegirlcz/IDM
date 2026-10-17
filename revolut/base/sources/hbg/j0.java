package hbg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class j0 implements cli.n {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hag.f f150701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hag.c f150702b;

    public j0(hag.f itemMapper, hag.c itemFactory) {
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(itemFactory, "itemFactory");
        this.f150701a = itemMapper;
        this.f150702b = itemFactory;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (v) iii.c.f(domainState.f150703a, new h56.a(this, domainState, 22), new h1c.c(domainState, 26), new hb4.n(domainState, this, 4));
    }
}

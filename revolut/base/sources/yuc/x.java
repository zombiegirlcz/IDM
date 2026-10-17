package yuc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements cli.n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xtc.c f317001a;

    public x(xtc.c securityHubCardItemMapper) {
        Intrinsics.checkNotNullParameter(securityHubCardItemMapper, "securityHubCardItemMapper");
        this.f317001a = securityHubCardItemMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new o((List) iii.c.f(domainState.f316979b, new ysk.a(13), new ypg.h(24), new y66.q(this, domainState, 14)));
    }
}

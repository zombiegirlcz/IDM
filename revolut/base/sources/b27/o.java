package b27;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements cli.n {

    @NotNull
    public static final m Companion = new m();

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i((List) iii.c.f(domainState.f11911a, new b0a.j(8), new axd.e(18), new b0c.a(this, 2)));
    }
}

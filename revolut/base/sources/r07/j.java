package r07;

import cli.n;
import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qz9.u;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g((List) iii.c.f(domainState.f250708a, new qz9.b(25), new u(4), new qk2.h(this, 8)));
    }
}

package tre;

import cli.n;
import cli.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(domainState.f273784a, new tpi.g(10), new tq0.j(6), new sr8.a(this, 22));
    }
}

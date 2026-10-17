package s2e;

import cli.n;
import cli.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(domainState.f259292b, new s1c.a(this, 15), new s20.c(this, 3), new ri4.o(24, domainState, false, this));
    }
}

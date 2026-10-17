package epd;

import ec8.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements cli.n {

    @NotNull
    public static final n Companion = new n();

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(domainState.f128159a, new ep2.l(this, 5), new en6.a(10), new q(this, domainState, 10));
    }
}

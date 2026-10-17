package iqg;

import i6j.q;
import ip0.qn0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new k((List) iii.c.f(domainState.f167838a, new ip4.m(this, 8), new qn0(18), new igh.o(this, domainState, 13)), (lw0.m) iii.c.f(domainState.f167838a, new ip4.m(9), new qn0(19), new q(14)));
    }
}

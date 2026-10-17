package oog;

import cli.o;
import kotlin.jvm.internal.Intrinsics;
import ood.g0;
import ood.o0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (j) iii.c.f(domainState.f227102a, new o0(6), new g0(8), new nrd.i(this, domainState, 22));
    }
}

package zt4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ymk.y;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        zt4.a domainState = (zt4.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f325067a, new zr2.o(this, 16), new zo2.h(this, domainState), new y(this, domainState, 24));
    }
}

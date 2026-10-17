package ry5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements g {

    @NotNull
    public static final C1431a Companion = new C1431a();

    /* JADX INFO: renamed from: ry5.a$a, reason: collision with other inner class name */
    public static final class C1431a {
        private C1431a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new m(ce9.m.y(domainState.f258227a, new rxb.b(16), new ru5.m(20), new ri4.o(17, domainState, false, this), new rrd.l(this, 24), new ru5.m(21)));
    }
}

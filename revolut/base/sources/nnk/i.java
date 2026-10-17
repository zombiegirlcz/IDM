package nnk;

import cli.j;
import cli.n;
import cli.o;
import kotlin.jvm.internal.Intrinsics;
import nmb.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (f) iii.c.f(domainState.f217712a, new nnf.h(this, 4), new v(9), new ngh.i(this, 2));
    }
}

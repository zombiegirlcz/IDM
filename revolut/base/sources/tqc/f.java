package tqc;

import cli.j;
import cli.n;
import cli.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static boolean a(cqc.a aVar) {
        cqc.d dVar = aVar.f108072b;
        return dVar == cqc.d.OPEN || dVar == cqc.d.PENDING_REVIEW;
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (d) iii.c.f(domainState.f273548a, new tpi.g(this, 1), new tq0.j(this, 1), new sr8.a(this, 21));
    }
}

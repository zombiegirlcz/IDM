package hkb;

import cli.j;
import cli.n;
import cli.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements n {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        hkb.a domainState = (hkb.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (cii.b) iii.c.f(domainState.f152908a, new hhd.n(this, 15), new e(this), new gzb.d(this, 15));
    }
}

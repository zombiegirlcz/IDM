package evj;

import cli.n;
import cli.o;
import ip0.cl0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        evj.a domainState = (evj.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        cl0 cl0Var = new cl0("TIME_PICKER", domainState.f129969a, null, null, 12);
        yp0.b.l(cl0Var, 0, 0, 0, 0, null, false, 63);
        return new d(u.c(cl0Var));
    }
}

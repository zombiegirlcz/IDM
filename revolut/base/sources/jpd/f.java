package jpd;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.g5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        jpd.a domainState = (jpd.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        g5 g5Var = new g5("date_picker_modal", domainState.f177259b, domainState.f177258a, true, null, domainState.f177260c, domainState.d, null, null, null, 0, 0, 1048368);
        yp0.b.l(g5Var, 0, 0, 0, 0, null, false, 63);
        return new b(u.c(g5Var));
    }
}

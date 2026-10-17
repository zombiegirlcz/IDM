package nd8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n87.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements cli.n {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new h((List) iii.c.f(domainState.f214336a, new i(0), new r(20), new mig.a(this, 28)));
    }
}

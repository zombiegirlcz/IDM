package i6g;

import i2l.n0;
import i4h.q;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i(domainState.f158995a.length() < 3 ? f0.f322471a : (List) iii.c.f(domainState.f158996b, new q(27), new n0(19), new hnc.a(19, domainState, this)));
    }
}

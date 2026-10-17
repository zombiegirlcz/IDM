package sy6;

import cli.n;
import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ss4.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new h((List) iii.c.f(domainState.f266630a, new sx2.g(27), new a0(19), new sa5.b(this, domainState, 19)));
    }
}

package ma2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m9d.j1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new n((List) iii.c.f(domainState.f203923b, new m9l.d(this, 17), new j1(5), new ldj.g(this, 23)), domainState.f203923b.getContent() != null);
    }
}

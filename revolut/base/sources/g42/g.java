package g42;

import cli.j;
import cli.n;
import cli.o;
import fq7.k;
import g3e.h;
import g3e.s;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        g42.a domainState = (g42.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new b(domainState.f140322c, domainState.d, (List) iii.c.f(domainState.f140320a, new h(5), new s(1), new k(this, 8)), ((List) domainState.f140320a.getContent()) != null ? !r1.isEmpty() : false);
    }
}

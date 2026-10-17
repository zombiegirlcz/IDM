package f96;

import cli.n;
import cli.o;
import f5g.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f96.a domainState = (f96.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new d((List) iii.c.f(domainState.f132836a, new f7l.c(3), new l(10), new et6.a(this, 16)));
    }
}

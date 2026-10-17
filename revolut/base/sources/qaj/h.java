package qaj;

import cli.j;
import cli.n;
import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pv7.t;
import q97.l1;
import q97.q2;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new f((List) iii.c.f(domainState.f244043a, new l1(28), new q2(this), new t(this, 21)));
    }
}

package rpd;

import cli.n;
import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rnd.d0;
import rp0.n0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pqd.f f256375a;

    public m(pqd.f incomeSorterWithTransactionMapper) {
        Intrinsics.checkNotNullParameter(incomeSorterWithTransactionMapper, "incomeSorterWithTransactionMapper");
        this.f256375a = incomeSorterWithTransactionMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listL = v.l((qv0.i) iii.c.f(domainState.f256363a, new n0(29), new d0(6), new ri4.o(this, 7)));
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new g(listL);
    }
}

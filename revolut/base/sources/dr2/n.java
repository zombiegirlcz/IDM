package dr2;

import cli.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements cli.n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (Intrinsics.f(domainState.f117075b, f.f117076a)) {
            return new h(domainState.f117074a);
        }
        throw new NoWhenBranchMatchedException();
    }
}

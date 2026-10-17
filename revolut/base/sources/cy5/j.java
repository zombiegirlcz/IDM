package cy5;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Clause clause = domainState.e;
        return new f(domainState.f110046a, clause, domainState.f, d0.E0(domainState.d, d0.E0(domainState.f110048c, domainState.f110047b)));
    }
}

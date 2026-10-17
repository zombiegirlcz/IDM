package w3b;

import cli.n;
import cli.o;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        cii.b bVar;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f294256b;
        return (data == null || (bVar = (cii.b) iii.c.f(data, new w29.a(this, 12), new w2.d(11), new vjh.c(this, domainState, 10))) == null) ? new cii.b(null, f0.f322471a, null) : bVar;
    }
}

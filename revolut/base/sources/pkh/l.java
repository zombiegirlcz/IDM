package pkh;

import cli.n;
import cli.o;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        j jVar2;
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f237189a;
        return (data == null || (jVar2 = (j) iii.c.f(data, new pj9.n(15), new pj9.m(10), new p2b.a(16))) == null) ? new j(null, null, f0.f322471a) : jVar2;
    }
}

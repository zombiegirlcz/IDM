package s4b;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import rd3.x;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements n {
    @Override // cli.n
    public final o c(j jVar) {
        cii.b bVar;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f259805a;
        return (data == null || (bVar = (cii.b) iii.c.f(data, new e(0), new s20.c(15), new x(18))) == null) ? new cii.b(null, f0.f322471a, null) : bVar;
    }
}

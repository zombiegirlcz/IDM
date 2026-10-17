package fwk;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.data.model.Data;
import fq7.k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements n {
    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f138704a;
        List list = data != null ? (List) iii.c.f(data, new fwf.n(3), new fv0.c(6), new k(this, 2)) : null;
        if (list == null) {
            list = f0.f322471a;
        }
        return new d(list);
    }
}

package p3b;

import cli.n;
import cli.o;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import ox5.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        cii.b bVar;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f232709a;
        return (data == null || (bVar = (cii.b) iii.c.f(data, new p0g.b(this, 23), new d0(24), new nrd.i(this, domainState, 29))) == null) ? new cii.b(null, f0.f322471a, null) : bVar;
    }
}

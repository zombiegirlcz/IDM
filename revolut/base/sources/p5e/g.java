package p5e;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p5a.m;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f233104c;
        List list = data != null ? (List) iii.c.f(data, new m(this, 1), new p4a.g(9), new p40.n(this, domainState, 1)) : null;
        if (list == null) {
            list = f0.f322471a;
        }
        return new f(list);
    }
}

package i2h;

import cli.n;
import cli.o;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f157936c;
        List list = data != null ? (List) iii.c.f(data, new i0k.f(this), new hy2.b(28), new hnc.a(11, domainState, this)) : null;
        if (list == null) {
            list = f0.f322471a;
        }
        return new g(list);
    }
}

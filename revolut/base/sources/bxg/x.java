package bxg;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class x implements cli.n {

    @NotNull
    public static final u Companion = new u();

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f19688a;
        n nVar = data != null ? (n) iii.c.f(data, new t(0), new bw4.t(13), new b0c.a(18)) : null;
        Data data2 = domainState.f19688a;
        List list = data2 != null ? (List) iii.c.f(data2, new t(1), new bw4.t(14), new b0c.a(this, 19)) : null;
        if (list == null) {
            list = f0.f322471a;
        }
        return new o(nVar, list);
    }
}

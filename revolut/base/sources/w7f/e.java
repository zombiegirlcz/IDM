package w7f;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements n {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nmc.d f295519a;

    public e(nmc.d roboPortfolioUIMapper) {
        Intrinsics.checkNotNullParameter(roboPortfolioUIMapper, "roboPortfolioUIMapper");
        this.f295519a = roboPortfolioUIMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        List list;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f295517a;
        if (data == null || (list = (List) iii.c.f(data, new w6h.f(5), new w6b.a(7), new vjh.c(this, 15))) == null) {
            list = f0.f322471a;
        }
        return new c(list);
    }
}

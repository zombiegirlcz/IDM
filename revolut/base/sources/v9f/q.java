package v9f;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements cli.n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f287045a = w.y0(new v4a.a(9));

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List list;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f287034b;
        if (data == null || (list = (List) iii.c.f(data, new v25.k(this, 23), new v78.d(6), new uw2.n(this, 14))) == null) {
            list = f0.f322471a;
        }
        return new k(domainState.f287033a, list);
    }
}

package k2h;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements cli.n {

    @NotNull
    private static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final adh.c f180599a;

    public q(adh.c instrumentToRowMapper, h2h.a searchMapper) {
        Intrinsics.checkNotNullParameter(instrumentToRowMapper, "instrumentToRowMapper");
        Intrinsics.checkNotNullParameter(searchMapper, "searchMapper");
        this.f180599a = instrumentToRowMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.d;
        List list = data != null ? (List) iii.c.f(data, new k1g.n(this), new k1f.n(5), new joa.j(this, domainState, 13)) : null;
        if (list == null) {
            list = f0.f322471a;
        }
        return new h(list);
    }
}

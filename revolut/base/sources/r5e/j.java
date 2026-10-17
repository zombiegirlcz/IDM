package r5e;

import cli.n;
import cli.o;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q87.z;
import qz9.u;
import r40.y0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r4e.c f251592a;

    public j(r4e.c scenarioMapper) {
        Intrinsics.checkNotNullParameter(scenarioMapper, "scenarioMapper");
        this.f251592a = scenarioMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        List list;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f251589a;
        if (data == null || (list = (List) iii.c.f(data, new y0(20), new u(29), new z(this, domainState, 25))) == null) {
            list = f0.f322471a;
        }
        return new h(list);
    }
}

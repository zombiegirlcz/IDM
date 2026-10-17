package wt7;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt7.b f299838a;

    public j(yt7.b documentsMapper) {
        Intrinsics.checkNotNullParameter(documentsMapper, "documentsMapper");
        this.f299838a = documentsMapper;
    }

    public static g a(List list, boolean z) {
        m70.a.c(t0.f186434a);
        return new g(list, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), z, f0.f322471a, null, false);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(domainState.f299827a, new wsg.a(this, 15), new wsg.e(this, 16), new vh2.o(this, domainState, 24));
    }
}

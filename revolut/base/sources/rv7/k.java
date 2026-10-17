package rv7;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ru5.m;
import ru6.r;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv7.h f257733a;

    public k(xv7.h documentsMapper) {
        Intrinsics.checkNotNullParameter(documentsMapper, "documentsMapper");
        this.f257733a = documentsMapper;
    }

    public static i a(List list, boolean z) {
        m70.a.c(t0.f186434a);
        return new i(list, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), z, f0.f322471a, null, false);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f257722a, new r(this, 7), new m(this), new rbe.c(this, domainState, 16));
    }
}

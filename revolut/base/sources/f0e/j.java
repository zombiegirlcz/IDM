package f0e;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import ewh.y;
import f0d.k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wxd.s;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f131118a;

    public j(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f131118a = uiKitResources;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        String str;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        s sVar = (s) domainState.f131103a.getContent();
        return new c((sVar == null || (str = sVar.f300883a) == null) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (List) iii.c.f(domainState.f131103a, new k(3), new y(16), new i(this, domainState, 0)));
    }
}

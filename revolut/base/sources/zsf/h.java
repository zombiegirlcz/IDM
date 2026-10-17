package zsf;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.ck0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextDelegate.Model model = new TextDelegate.Model("ADDITIONAL_INFO_DISCLOSURE_BODY", new TextClause(domainState.f324913a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ck0(0), null, null, 0, 0, 0, 0, 2036);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new f(u.c(model));
    }
}

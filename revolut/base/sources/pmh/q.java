package pmh;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class q {

    @NotNull
    public static final o Companion = new o();

    public final RowDelegate.Model a(nel.n nVar) {
        String strP = p.a.p("all-funds-instrument-", nVar.f214596b, "-list-id");
        TextClause textClause = new TextClause(nVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = nVar.o;
        return new RowDelegate.Model(strP, nbh.a.b(nVar), null, null, textClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, false, false, null, null, null, null, null, new d(nVar), null, 0, 0, 0, 0, 1056946028);
    }
}

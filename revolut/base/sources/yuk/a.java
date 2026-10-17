package yuk;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import nel.d;
import nel.n;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    public static TextClause a(n nVar) {
        nel.a aVar = nVar.f214599h;
        d dVar = aVar instanceof d ? (d) aVar : null;
        if ((dVar != null ? dVar.f214563b : null) == null || dVar.f214562a == null) {
            return new TextClause(nVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        String str = dVar.f214564c;
        if (str == null) {
            str = nVar.d;
        }
        return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}

package mch;

import aq4.j;
import aw0.e4;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import ich.p;
import java.util.List;
import lk7.n;
import zzg.g;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static p a(Data data, TextLocalisedClause textLocalisedClause) {
        String str;
        Clause clause = (Clause) iii.c.f(data, new m9l.d(29), new j(2, textLocalisedClause), new n(textLocalisedClause, 26));
        g gVar = (g) data.getContent();
        return new p(clause, (gVar == null || (str = gVar.d) == null) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, e4.GONE);
    }
}

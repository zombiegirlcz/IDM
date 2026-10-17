package oga;

import aw0.o9;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public abstract class k {
    public static final TextClause a(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String str = jVar.f225075a;
        List<h> list = jVar.f225076b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (h hVar : list) {
            if (hVar == null) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new MoneyClause(hVar.f225074a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4));
        }
        return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) arrayList, 94);
    }
}

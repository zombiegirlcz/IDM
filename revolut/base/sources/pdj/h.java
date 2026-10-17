package pdj;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import jki.n;
import zhm.p;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements n {
    @Override // jki.n
    public final List c() {
        kdj.b[] bVarArrValues = kdj.b.values();
        if (bVarArrValues.length > 1) {
            p.B(new g(), bVarArrValues);
        }
        ArrayList arrayList = new ArrayList(bVarArrValues.length);
        for (kdj.b bVar : bVarArrValues) {
            e.Companion.getClass();
            arrayList.add(new CellDetailsChevronDelegate.Model(j6.a.q("FAQ_ITEM_", bVar.name()), new TextLocalisedClause(bVar.c(), null, null, 14), 0, false, bVar, null, null, 2028));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }
}

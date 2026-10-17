package c11;

import aw0.o9;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.crypto.challenge.impl.dialog.conditions.ConditionsBottomSheetContract$InputData;
import com.revolut.crypto.challenge.impl.model.ChallengeTier;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f20318a = new c();

    private c() {
    }

    public static Object a(ConditionsBottomSheetContract$InputData conditionsBottomSheetContract$InputData, f11.c cVar) {
        Object next;
        dj0.d dVar;
        Iterator it8 = conditionsBottomSheetContract$InputData.f60104a.d.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((ChallengeTier) next).f60111a == cVar) {
                break;
            }
        }
        ChallengeTier challengeTier = (ChallengeTier) next;
        return (challengeTier == null || (dVar = challengeTier.f60112b) == null) ? new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new MoneyClause(dVar, new MoneyClause.Format.Shorts(false, 63), null, null, 12);
    }
}

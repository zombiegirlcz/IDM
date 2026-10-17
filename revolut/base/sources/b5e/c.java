package b5e;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import x2h.b;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c {
    public static final TextLocalisedClause a(a aVar) {
        int i;
        int i2 = b.f12490a[aVar.ordinal()];
        if (i2 == 1) {
            i = R$string.wealth_action_buy;
        } else if (i2 == 2) {
            i = R$string.wealth_action_sell;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_action_get_started;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public static final Pair b(x2h.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (!(bVar instanceof x2h.a)) {
            if (bVar.equals(b.a.f302572a)) {
                return new Pair(a.GET_STARTED_BUY, null);
            }
            if (bVar.equals(b.C1676b.f302573a)) {
                return new Pair(null, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        a aVar = a.BUY;
        x2h.a aVar2 = (x2h.a) bVar;
        if (!aVar2.f302570a) {
            aVar = null;
        }
        a aVar3 = a.SELL;
        if (!aVar2.f302571b) {
            aVar3 = null;
        }
        return aVar != null ? new Pair(aVar, aVar3) : new Pair(aVar3, null);
    }
}

package wlk;

import aw0.o9;
import com.revolut.core.ui_kit.models.MoneyClause;
import hha.d;
import hha.g;
import hha.i;
import java.util.Iterator;
import jli.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {
    public static final MoneyClause a(d dVar, i billingCode) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(billingCode, "billingCode");
        int i = a.f298524a[billingCode.ordinal()];
        if (i == 1) {
            Iterator it8 = dVar.f152291h.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((g) next).f152306a, e.f175845h)) {
                    break;
                }
            }
            g gVar = (g) next;
            if (gVar != null) {
                return new MoneyClause(gVar.f152308c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator it9 = dVar.f152291h.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it9.next();
                if (Intrinsics.f(((g) next2).f152306a, e.f175842b)) {
                    break;
                }
            }
            g gVar2 = (g) next2;
            if (gVar2 != null) {
                return new MoneyClause(gVar2.f152308c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
            }
        }
        return null;
    }
}

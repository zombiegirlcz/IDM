package ik7;

import anf.k;
import aw0.k7;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.feature.insurance.api.models.CFACClaimExpense;
import java.util.ArrayList;
import java.util.List;
import k71.p;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.g f161906a;

    public j(thf.g transactionItemMapper) {
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        this.f161906a = transactionItemMapper;
    }

    public final ArrayList a(List expenses, boolean z) {
        Intrinsics.checkNotNullParameter(expenses, "expenses");
        List<CFACClaimExpense> list = expenses;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (CFACClaimExpense cFACClaimExpense : list) {
            a3 a3Var = cFACClaimExpense.f74926a;
            q.Companion.getClass();
            RowDelegate.Model modelP = ((k) this.f161906a).p(a3Var, p.a(), new thf.f(false, 3));
            dj0.d dVar = cFACClaimExpense.f74927b;
            if (dVar == null) {
                dVar = cFACClaimExpense.f74926a.k;
            }
            arrayList.add(RowDelegate.Model.x(modelP, null, null, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, null, 12), null, null, false, 126), z, null, cFACClaimExpense, 0, 0, 0, 0, null, -4197377, 15));
        }
        return arrayList;
    }
}

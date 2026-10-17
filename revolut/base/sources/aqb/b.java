package aqb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a aVar = (com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a) ((j) this.receiver);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.u;
        String str = model.f53228a;
        if (obj4 instanceof p) {
            p pVar = (p) obj4;
            if (pVar instanceof k) {
                aVar.x2(new an4.f(pVar, 26));
                Unit unit = Unit.f186387a;
            } else if (pVar instanceof n) {
                aVar.l2(new u(aVar, pVar, null, 0), new yi5.b(26));
            } else if (pVar instanceof o) {
                aVar.l2(new u(aVar, pVar, null, 1), new yi5.b(26));
            } else if (pVar instanceof m) {
                aVar.l2(new v(aVar, pVar, null, 0), new yi5.b(26));
            } else {
                if (!(pVar instanceof l)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.l2(new v(aVar, pVar, null, 1), new yi5.b(26));
            }
        } else if (Intrinsics.f(str, "SAVINGS_ACCOUNT_LIST_ID")) {
            aVar.x2(new anf.p(29));
        } else {
            Object obj5 = model.u;
            IllegalStateException illegalStateException = new IllegalStateException(a0.d.s("Unexpected rowDelegate click, listId=", str, ", parcelType=", obj5 != null ? obj5.getClass().getSimpleName() : "null"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return Unit.f186387a;
    }
}

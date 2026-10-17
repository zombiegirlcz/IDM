package is2;

import com.revolut.feature.transactions.api.kompot.TransactionDetailsApi$Toggles$BackendDrivenCanBeBlocked;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.cc;
import tof.ea;
import tof.h9;
import tof.i7;
import tof.j1;
import tof.na;
import tof.qb;
import tof.s9;
import tof.v6;
import tof.y6;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b f168089b;

    public /* synthetic */ k(com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b bVar, int i) {
        this.f168088a = i;
        this.f168089b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        i7 h9Var;
        int i = this.f168088a;
        com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b bVar = this.f168089b;
        switch (i) {
            case 0:
                List recurringPayments = (List) obj2;
                Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : recurringPayments) {
                    if (qua.u.k((qua.p) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    Set set = ((qua.p) it8.next()).G;
                    if (set != null) {
                        arrayList2.add(set);
                    }
                }
                Set setI1 = d0.i1(zhm.w.u(arrayList2));
                if (((jte.d) bVar.f64273x).c(TransactionDetailsApi$Toggles$BackendDrivenCanBeBlocked.f91958c)) {
                    j1[] elements = {j1.ALLOWED, j1.RESTRICTED};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    h9Var = new ea(kotlin.collections.d.y0(elements));
                } else {
                    h9Var = new h9(true);
                }
                i7.c cVar = i7.Companion;
                i7[] i7VarArr = {h9Var, new cc(zhm.u.c(y6.CARD_PAYMENT)), new qb(zhm.v.k(v6.PENDING, v6.COMPLETED, v6.DECLINED)), new na(new s9(setI1)), bVar.z2()};
                cVar.getClass();
                break;
            case 1:
                bVar.x2(new ip4.m(21));
                break;
            default:
                bVar.x2(new ip4.m(24));
                break;
        }
        return Unit.f186387a;
    }
}

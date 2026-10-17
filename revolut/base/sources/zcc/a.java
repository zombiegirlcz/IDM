package zcc;

import com.revolut.feature.revolutpay.api.shared.domain.models.payment.SplitBillPaymentParams;
import dj0.d;
import kotlin.jvm.internal.Intrinsics;
import pyd.c;
import q6c.h;
import q6c.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static o a(h orderDetails, SplitBillPaymentParams splitBillPaymentParams) {
        d dVar;
        d dVar2;
        d dVar3;
        Intrinsics.checkNotNullParameter(orderDetails, "orderDetails");
        if (splitBillPaymentParams != null) {
            long j2 = splitBillPaymentParams.f84345a;
            xi0.b bVar = orderDetails.f242543l;
            long j3 = orderDetails.f;
            long j5 = orderDetails.i;
            xi0.b bVar2 = orderDetails.f242543l;
            dVar2 = new d(j2, bVar);
            Long l2 = splitBillPaymentParams.f84346b;
            d dVar4 = l2 != null ? new d(l2.longValue(), bVar2) : null;
            if (dVar4 == null) {
                dVar = new d(j5, bVar2);
                if (!dVar2.equals(new d(j3, bVar2))) {
                    dVar = null;
                }
            } else {
                dVar = dVar4;
            }
            d dVarH = c.H(dVar2, dVar4);
            if (!dVarH.i(c.H(new d(j3, bVar2), new d(j5, bVar2)))) {
                dVarH = null;
            }
            dVar3 = dVarH;
        } else {
            orderDetails.getClass();
            xi0.b bVar3 = orderDetails.f242543l;
            dVar = new d(orderDetails.i, bVar3);
            dVar2 = new d(orderDetails.f, bVar3);
            dVar3 = null;
        }
        d dVar5 = dVar2;
        orderDetails.getClass();
        xi0.b bVar4 = orderDetails.f242543l;
        d dVar6 = new d(orderDetails.f, bVar4);
        d dVar7 = new d(orderDetails.f242542j, bVar4);
        d dVar8 = !dVar7.k() ? dVar7 : null;
        d dVar9 = new d(orderDetails.k, bVar4);
        d dVar10 = !dVar9.k() ? dVar9 : null;
        d dVar11 = new d(orderDetails.f242540g, bVar4);
        d dVar12 = new d(orderDetails.f242541h, bVar4);
        return new o(dVar10, !dVar12.k() ? dVar12 : null, dVar8, dVar11, dVar6, (dVar == null || dVar.k()) ? null : dVar, dVar3, dVar5);
    }
}

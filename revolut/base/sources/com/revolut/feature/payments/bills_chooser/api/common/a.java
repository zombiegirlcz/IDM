package com.revolut.feature.payments.bills_chooser.api.common;

import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import dj0.d;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qua.p;
import xi0.b;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    public static final b a(List list) {
        d dVarB;
        Intrinsics.checkNotNullParameter(list, "<this>");
        BillType billType = (BillType) d0.d0(list);
        if (billType == null || (dVarB = b(billType)) == null) {
            return null;
        }
        return dVarB.f115083b;
    }

    public static final d b(BillType billType) {
        Intrinsics.checkNotNullParameter(billType, "<this>");
        if (billType instanceof BillType.CustomBill) {
            return ((BillType.CustomBill) billType).f79174b;
        }
        if (billType instanceof BillType.TransactionBill) {
            return ((BillType.TransactionBill) billType).f79176a.k;
        }
        if (!(billType instanceof BillType.RecurringPaymentBill)) {
            throw new NoWhenBranchMatchedException();
        }
        p pVar = ((BillType.RecurringPaymentBill) billType).f79175a;
        Long l2 = pVar.f249323j;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        xi0.a aVar = b.Companion;
        String str = pVar.i;
        aVar.getClass();
        return new d(jLongValue, xi0.a.a(str));
    }

    public static final b c(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return b((BillType) d0.b0(list)).f115083b;
    }
}

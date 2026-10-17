package cde;

import kotlin.jvm.internal.Intrinsics;
import tof.cc;
import tof.i7;
import tof.y6;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final cc a(i7.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        y6[] y6VarArr = {y6.FEE_REVERSAL, y6.ATM, y6.CARD_CREDIT, y6.CARD_CREDIT_RETURN, y6.CARD_REFUND, y6.TAX_REFUND, y6.TAX, y6.CHARGEBACK_REVERSAL, y6.CARD_CHARGEBACK, y6.CREDIT_INTEREST, y6.REV_PAYMENT, y6.REV_PAYMENT_REFUND, y6.MERCHANT_PAYMENT, y6.MERCHANT_REFUND, y6.MERCHANT_FEE, y6.MERCHANT_FEE_RVSL, y6.MERCHANT_CB, y6.MERCHANT_CB_RVSL, y6.CASHBACK_REVERSAL, y6.CASHBACK, y6.CARD_PAYMENT, y6.FEE};
        cVar.getClass();
        return i7.c.d(y6VarArr);
    }
}

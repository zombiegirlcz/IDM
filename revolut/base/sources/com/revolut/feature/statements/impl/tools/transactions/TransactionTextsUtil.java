package com.revolut.feature.statements.impl.tools.transactions;

import androidx.annotation.NonNull;
import qd0.b;
import u80.j;
import u80.k;

/* JADX INFO: loaded from: classes7.dex */
public final class TransactionTextsUtil {
    private TransactionTextsUtil() {
    }

    @NonNull
    public static String getBalance(@NonNull TransactionDbModel transactionDbModel, b bVar) {
        if (transactionDbModel.getBalance() == null || transactionDbModel.pocketCcy == null) {
            return "---";
        }
        k.Companion.getClass();
        k kVarA = j.a(bVar);
        kVarA.q(transactionDbModel.getBalance().longValue());
        kVarA.s(transactionDbModel.pocketCcy);
        kVarA.u = true;
        return kVarA.a();
    }

    @NonNull
    public static String getFxPartyDisplayStringUnsignedNoCurrencySymbol(@NonNull TransactionDbModel transactionDbModel, b bVar) {
        k.Companion.getClass();
        k kVarA = j.a(bVar);
        kVarA.q(TransactionMoneyUtil.getSignedFxPartyAmount(transactionDbModel));
        kVarA.s(transactionDbModel.feeFxCcy);
        kVarA.i = true;
        kVarA.f278053m = true;
        return kVarA.a();
    }
}

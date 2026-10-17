package com.revolut.feature.statements.impl.tools.transactions;

import androidx.annotation.NonNull;
import com.revolut.data.common.models.money.MoneySerializable;

/* JADX INFO: loaded from: classes7.dex */
public class TransactionMoneyUtil {
    private static boolean differentSigns(long j2, long j3) {
        return ((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)) < 0) != ((j3 > 0L ? 1 : (j3 == 0L ? 0 : -1)) < 0);
    }

    public static MoneySerializable getMoney(Long l2, @NonNull String str) {
        if (l2 != null) {
            return new MoneySerializable(l2.longValue(), str);
        }
        return null;
    }

    public static long getSignedFxPartyAmount(TransactionDbModel transactionDbModel) {
        Long lValueOf = transactionDbModel.fxPartyAmount;
        try {
            if (transactionDbModel.type == TransactionType.EXCHANGE) {
                if (!differentSigns(transactionDbModel.getAmount().getAmount(), transactionDbModel.fxPartyAmount.longValue())) {
                    lValueOf = Long.valueOf(transactionDbModel.fxPartyAmount.longValue() * (-1));
                }
            } else if (differentSigns(transactionDbModel.getAmount().getAmount(), transactionDbModel.fxPartyAmount.longValue())) {
                lValueOf = Long.valueOf(transactionDbModel.fxPartyAmount.longValue() * (-1));
            }
        } catch (Exception unused) {
        }
        return lValueOf.longValue();
    }
}

package com.revolut.feature.statements.impl.tools.transactions;

import androidx.annotation.NonNull;
import com.revolut.feature.statements.impl.tools.transactions.extras.TransactionRecipientDto;

/* JADX INFO: loaded from: classes7.dex */
public final class TransactionObjUtil {
    static final String BALANCE_PLACEHOLDER = "---";

    public static String getPhone(@NonNull TransactionDbModel transactionDbModel) {
        TransactionRecipientDto transactionRecipientDto = transactionDbModel.getExtras().recipient;
        if (transactionRecipientDto != null) {
            return transactionRecipientDto.getPhone();
        }
        if (transactionDbModel.getExtraAttributes() != null) {
            return TransactionExtraAttrsUtil.getRecipientPhone(transactionDbModel);
        }
        return null;
    }

    public static boolean isAuto(TransactionDbModel transactionDbModel) {
        return (transactionDbModel == null || transactionDbModel.getExtras() == null || !TransactionExtraAttrsUtil.getAutomatic(transactionDbModel)) ? false : true;
    }
}

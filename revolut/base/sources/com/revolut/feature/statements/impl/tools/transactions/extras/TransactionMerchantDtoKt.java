package com.revolut.feature.statements.impl.tools.transactions.extras;

import kotlin.Metadata;
import q61.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionMerchantDto;", "Lq61/a;", "toDomain", "(Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionMerchantDto;)Lq61/a;", "retail_feature_statements_impl_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class TransactionMerchantDtoKt {
    public static final a toDomain(TransactionMerchantDto transactionMerchantDto) {
        if (transactionMerchantDto != null) {
            return new a(transactionMerchantDto.getId(), transactionMerchantDto.getMerchantId(), transactionMerchantDto.getMcc(), transactionMerchantDto.getCity(), transactionMerchantDto.getCountry(), transactionMerchantDto.getAddress(), transactionMerchantDto.getState(), transactionMerchantDto.getLogo(), transactionMerchantDto.getName(), transactionMerchantDto.getBgColor(), transactionMerchantDto.getCategory(), transactionMerchantDto.getPostCode());
        }
        return null;
    }
}

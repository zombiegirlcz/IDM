package com.revolut.feature.statements.impl.tools.transactions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"isTfl", "", "Lcom/revolut/feature/statements/impl/tools/transactions/TransactionDbModel;", "retail_feature_statements_impl_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class TransactionLegacyExtensionsKt {
    public static final boolean isTfl(@NotNull TransactionDbModel transactionDbModel) {
        Intrinsics.checkNotNullParameter(transactionDbModel, "<this>");
        return "tfl".equals(transactionDbModel.logo);
    }
}

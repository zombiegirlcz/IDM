package com.revolut.feature.categorisation.impl.network;

import efm.b;
import kotlin.Metadata;
import ne3.a;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.PATCH;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/categorisation/impl/network/TransactionsCategorisationService;", "", "Lne3/a;", "body", "Lefm/b;", "updateCategory", "(Lne3/a;)Lefm/b;", "Lne3/b;", "updateCategoryForFutureTransactions", "(Lne3/b;)Lefm/b;", "feature_categorization_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransactionsCategorisationService {
    @PATCH("/user/current/transactions/tag")
    @NotNull
    b updateCategory(@Body @NotNull a body);

    @PATCH("/user/current/transactions/category")
    @NotNull
    b updateCategoryForFutureTransactions(@Body @NotNull ne3.b body);
}

package com.revolut.retail.feature.impl.budgeting.network.services;

import efm.b;
import efm.d0;
import java.util.List;
import jrj.a;
import jrj.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\r\u001a\u00020\u00022\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\n\u001a\u00020\u000eH'¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\r\u001a\u00020\u00022\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/impl/budgeting/network/services/BudgetingService;", "", "", "walletId", "Lefm/d0;", "", "Ljrj/c;", "getWalletBudgets", "(Ljava/lang/String;)Lefm/d0;", "Ljrj/a;", "body", "createWalletBudget", "(Ljrj/a;)Lefm/d0;", "id", "Ljrj/b;", "updateWalletBudget", "(Ljava/lang/String;Ljava/lang/String;Ljrj/b;)Lefm/d0;", "Lefm/b;", "deleteWalletBudget", "(Ljava/lang/String;Ljava/lang/String;)Lefm/b;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BudgetingService {
    @POST("/wallet-budget")
    @NotNull
    d0<c> createWalletBudget(@Body @NotNull a body);

    @DELETE("/wallet-budget/{id}")
    @NotNull
    b deleteWalletBudget(@Path("id") @NotNull String id10, @Query("walletId") String walletId);

    @GET("/wallet-budget")
    @NotNull
    d0<List<c>> getWalletBudgets(@Query("walletId") String walletId);

    @PATCH("/wallet-budget/{id}")
    @NotNull
    d0<c> updateWalletBudget(@Path("id") @NotNull String id10, @Query("walletId") String walletId, @Body @NotNull jrj.b body);
}

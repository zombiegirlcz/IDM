package com.revolut.retail.feature.impl.budget.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import vqj.a;
import vqj.c;
import vqj.g;
import vqj.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0013\u001a\u00020\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/impl/budget/network/BudgetService;", "", "", "walletId", "", "Lvqj/a;", "getWalletBudgets", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "from", "to", "Lvqj/c;", "getBudgetHistory", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lvqj/g;", "body", "createWalletBudget", "(Lvqj/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "Lvqj/h;", "updateWalletBudget", "(Ljava/lang/String;Ljava/lang/String;Lvqj/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deleteWalletBudget", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BudgetService {
    @POST("/wallet-budget")
    Object createWalletBudget(@Body @NotNull g gVar, @NotNull Continuation<? super a> continuation);

    @DELETE("/wallet-budget/{id}")
    Object deleteWalletBudget(@Path("id") @NotNull String str, @NotNull @Query("walletId") String str2, @NotNull Continuation<? super Unit> continuation);

    @GET("/wallet-budget/history")
    Object getBudgetHistory(@NotNull @Query("walletId") String str, @NotNull @Query("from") String str2, @NotNull @Query("to") String str3, @NotNull Continuation<? super c> continuation);

    @GET("/wallet-budget")
    Object getWalletBudgets(@NotNull @Query("walletId") String str, @NotNull Continuation<? super List<a>> continuation);

    @PATCH("/wallet-budget/{id}")
    Object updateWalletBudget(@Path("id") @NotNull String str, @NotNull @Query("walletId") String str2, @Body @NotNull h hVar, @NotNull Continuation<? super a> continuation);
}

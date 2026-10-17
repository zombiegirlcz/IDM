package com.revolut.retail.feature.impl.income_sorter.network;

import htj.c;
import htj.i0;
import htj.l;
import htj.l0;
import htj.u;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J$\u0010\u0003\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0003\u0010\u0007J$\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\bH§@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\bH§@¢\u0006\u0004\b\u0019\u0010\u0012J<\u0010\u001e\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\b2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u001d\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00062\b\b\u0001\u0010 \u001a\u00020\bH§@¢\u0006\u0004\b!\u0010\u0012¨\u0006\"À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/impl/income_sorter/network/IncomeSorterService;", "", "Lhtj/c;", "createIncomeSorter", "", "forceActivate", "", "(Lhtj/c;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "Lhtj/l0;", "update", "updateIncomeSorter", "(Ljava/lang/String;Lhtj/l0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "walletId", "", "Lhtj/l;", "getIncomeSorters", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "timestamp", "Lhtj/u;", "getIncomeSorterExecutions", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executionId", "retryIncomeSorterExecution", "savePreferences", "approvalMode", "Lhtj/i0;", "executionUpdateBody", "updateExecution", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lhtj/i0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incomeSorterId", "deleteIncomeSorter", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IncomeSorterService {
    @POST("/income-sorters")
    Object createIncomeSorter(@Body @NotNull c cVar, @Query("forceActivate") boolean z, @NotNull Continuation<? super Unit> continuation);

    @DELETE("/income-sorters/{incomeSorterId}")
    Object deleteIncomeSorter(@Path("incomeSorterId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("/income-sorters/executions")
    Object getIncomeSorterExecutions(@NotNull @Query("walletId") String str, @Query("lastModified") long j2, @NotNull Continuation<? super u> continuation);

    @GET("/income-sorters")
    Object getIncomeSorters(@NotNull @Query("walletId") String str, @NotNull Continuation<? super List<l>> continuation);

    @POST("/income-sorters/executions/{id}/attempts")
    Object retryIncomeSorterExecution(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @PATCH("/income-sorters/executions/{executionId}")
    Object updateExecution(@Path("executionId") @NotNull String str, @Query("savePreferences") Boolean bool, @Query("approvalMode") String str2, @Body @NotNull i0 i0Var, @NotNull Continuation<? super Unit> continuation);

    @PATCH("/income-sorters/{id}")
    Object updateIncomeSorter(@Path("id") @NotNull String str, @Body @NotNull l0 l0Var, @NotNull Continuation<? super Unit> continuation);
}

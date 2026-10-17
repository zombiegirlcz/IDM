package com.revolut.feature.shared.savings.impl.core.account.data.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import qbd.g;
import qbd.h0;
import qbd.k0;
import qbd.v;
import qbd.y;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000b\u0010\tJ$\u0010\u000e\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00032\b\b\u0001\u0010\r\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0014\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0017\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/savings/impl/core/account/data/network/SavingsAccountService;", "", "", "Lqbd/v;", "getSavingsAccounts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "accountId", "getSavingsAccount", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deleteSavingsAccount", "Lqbd/y;", "request", "updateSavingsAccount", "(Ljava/lang/String;Lqbd/y;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqbd/g;", "createSavingsAccount", "(Lqbd/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqbd/k0;", "withdrawFromSavingsAccount", "(Ljava/lang/String;Lqbd/k0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqbd/h0;", "topUpSavingsAccount", "(Ljava/lang/String;Lqbd/h0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_shared_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SavingsAccountService {
    @POST("savings/accounts")
    Object createSavingsAccount(@Body @NotNull g gVar, @NotNull Continuation<? super v> continuation);

    @DELETE("savings/accounts/{accountId}")
    Object deleteSavingsAccount(@Path("accountId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("savings/accounts/{accountId}")
    Object getSavingsAccount(@Path("accountId") @NotNull String str, @NotNull Continuation<? super v> continuation);

    @GET("savings/accounts")
    Object getSavingsAccounts(@NotNull Continuation<? super List<v>> continuation);

    @POST("/savings/accounts/{accountId}/topup")
    Object topUpSavingsAccount(@Path("accountId") @NotNull String str, @Body @NotNull h0 h0Var, @NotNull Continuation<? super Unit> continuation);

    @PATCH("savings/accounts/{accountId}")
    Object updateSavingsAccount(@Path("accountId") @NotNull String str, @Body @NotNull y yVar, @NotNull Continuation<? super v> continuation);

    @POST("/savings/accounts/{accountId}/withdraw")
    Object withdrawFromSavingsAccount(@Path("accountId") @NotNull String str, @Body @NotNull k0 k0Var, @NotNull Continuation<? super Unit> continuation);
}

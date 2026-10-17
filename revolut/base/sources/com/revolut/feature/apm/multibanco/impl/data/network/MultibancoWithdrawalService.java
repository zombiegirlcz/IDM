package com.revolut.feature.apm.multibanco.impl.data.network;

import e72.i;
import e72.j;
import java.util.List;
import jo3.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u0005H§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\f\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0014\u0010\u000e¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/data/network/MultibancoWithdrawalService;", "", "Le72/j;", "getWithdrawalConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "from", "to", "", "Le72/i;", "getWithdrawalCodes", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "getWithdrawalCode", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljo3/a;", "body", "postWithdrawal", "(Ljo3/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "postWithdrawalCancel", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MultibancoWithdrawalService {
    @GET("mbway/atm-withdrawal/{id}")
    Object getWithdrawalCode(@Path("id") @NotNull String str, @NotNull Continuation<? super i> continuation);

    @GET("mbway/atm-withdrawal")
    Object getWithdrawalCodes(@NotNull @Query("from") String str, @NotNull @Query("to") String str2, @NotNull Continuation<? super List<i>> continuation);

    @GET("mbway/config/withdrawal")
    Object getWithdrawalConfig(@NotNull Continuation<? super j> continuation);

    @POST("mbway/atm-withdrawal")
    Object postWithdrawal(@Body @NotNull a aVar, @NotNull Continuation<? super i> continuation);

    @POST("mbway/atm-withdrawal/{id}/cancel")
    Object postWithdrawalCancel(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);
}

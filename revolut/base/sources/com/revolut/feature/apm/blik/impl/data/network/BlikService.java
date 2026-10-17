package com.revolut.feature.apm.blik.impl.data.network;

import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import zt1.a;
import zt1.e;
import zt1.h;
import zt1.k;
import zt1.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\bJ#\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0005H'¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00052\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0004\b\u0018\u0010\bJ)\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00052\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00052\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u001e\u0010\b¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/blik/impl/data/network/BlikService;", "", "", "type", "currency", "Lefm/d0;", "Lzt1/a;", "getBlikCode", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "refreshBlikCode", "id", "origin", "Lefm/b;", "blikCodeCopied", "(Ljava/lang/String;Ljava/lang/String;)Lefm/b;", "Lzt1/e;", "getBlikP2PTerms", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lzt1/k;", "getBlikTransactions", "()Lefm/d0;", "pocketId", "Lzt1/l;", "confirmBlikTransaction", "Lzt1/b;", "body", "declineBlikTransaction", "(Ljava/lang/String;Lzt1/b;)Lefm/d0;", "Lzt1/h;", "getQuote", "feature_apm_blik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BlikService {
    @POST("token-transfers/token/{id}/copied")
    @NotNull
    b blikCodeCopied(@Path("id") @NotNull String id10, @NotNull @Query("origin") String origin);

    @POST("blik/payments/{id}/confirm")
    @NotNull
    d0<l> confirmBlikTransaction(@Path("id") @NotNull String id10, @NotNull @Query("pocketId") String pocketId);

    @POST("blik/payments/{id}/decline")
    @NotNull
    d0<l> declineBlikTransaction(@Path("id") @NotNull String id10, @Body @NotNull zt1.b body);

    @GET("token-transfers/token")
    @NotNull
    d0<a> getBlikCode(@NotNull @Query("type") String type, @NotNull @Query("currency") String currency);

    @GET("blik/p2p-terms-eligibility")
    Object getBlikP2PTerms(@NotNull Continuation<? super e> continuation);

    @GET("blik/payments")
    @NotNull
    d0<List<k>> getBlikTransactions();

    @GET("blik/payments/{id}/quote")
    @NotNull
    d0<h> getQuote(@Path("id") @NotNull String id10, @Query("pocketId") String pocketId);

    @POST("token-transfers/token")
    @NotNull
    d0<a> refreshBlikCode(@NotNull @Query("type") String type, @NotNull @Query("currency") String currency);
}

package com.revolut.feature.topup_screen.impl.data.network.service;

import com.revolut.data.network.models.openbanking.TopUpResponseDto;
import com.revolut.data.network.models.openbanking.TopupRequestDto;
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
import retrofit2.http.Tag;
import sue.j;
import wj0.b;
import wue.a;
import wue.c;
import wue.d;
import wue.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0007J$\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\r\u001a\u00020\u00122\b\b\u0003\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0003\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001d\u001a\u00020\u00102\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0003\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u001d\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\u001e\u001a\u00020\u0002H§@¢\u0006\u0004\b \u0010\u000bJ\u001a\u0010!\u001a\u00020\u00102\b\b\u0001\u0010\u001e\u001a\u00020\u0002H§@¢\u0006\u0004\b!\u0010\u000b¨\u0006\"À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/data/network/service/StoredMethodService;", "", "", "accountDetailsId", "type", "Lwue/c;", "getDetailedStoredMethod", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "externalPocketId", "Lwue/e;", "getStoredMethodIdByExternalPockedId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwue/d;", "body", "editLabel", "(Ljava/lang/String;Lwue/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "removeMethod", "Lwue/a;", "Lwj0/b;", "idempotencyTag", "Lwue/b;", "createStoredMethod", "(Lwue/a;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/revolut/data/network/models/openbanking/TopupRequestDto;", "requestDto", "Lcom/revolut/data/network/models/openbanking/TopUpResponseDto;", "topUpViaAccountDetails", "(Lcom/revolut/data/network/models/openbanking/TopupRequestDto;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nonOauthTopUpViaAccountDetails", "storedMethodId", "Lsue/j;", "getIndiaStoredMethodDetail", "removeIndiaStoredMethodDetail", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StoredMethodService {
    @POST("external-institutions/stored-methods")
    Object createStoredMethod(@Body @NotNull a aVar, @Tag @NotNull b bVar, @NotNull Continuation<? super wue.b> continuation);

    @PATCH("external-institutions/stored-methods/{id}")
    Object editLabel(@Path("id") @NotNull String str, @Body @NotNull d dVar, @NotNull Continuation<? super d> continuation);

    @GET("external-institutions/stored-methods/{id}")
    Object getDetailedStoredMethod(@Path("id") @NotNull String str, @Query("type") String str2, @NotNull Continuation<? super c> continuation);

    @GET("topup/stored-methods/{storedMethodId}")
    Object getIndiaStoredMethodDetail(@Path("storedMethodId") @NotNull String str, @NotNull Continuation<? super j> continuation);

    @GET("external-institutions/stored-methods/account-bindings/{externalPocketId}")
    Object getStoredMethodIdByExternalPockedId(@Path("externalPocketId") @NotNull String str, @NotNull Continuation<? super e> continuation);

    @POST("/topup/direct-debit/account-details")
    Object nonOauthTopUpViaAccountDetails(@Body @NotNull TopupRequestDto topupRequestDto, @Tag @NotNull b bVar, @NotNull Continuation<? super Unit> continuation);

    @DELETE("topup/stored-methods/{storedMethodId}")
    Object removeIndiaStoredMethodDetail(@Path("storedMethodId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @DELETE("external-institutions/stored-methods/{id}")
    Object removeMethod(@Path("id") @NotNull String str, @Query("type") String str2, @NotNull Continuation<? super Unit> continuation);

    @POST("/topup/direct-debit/account-details")
    Object topUpViaAccountDetails(@Body @NotNull TopupRequestDto topupRequestDto, @Tag @NotNull b bVar, @NotNull Continuation<? super TopUpResponseDto> continuation);
}

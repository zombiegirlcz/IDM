package com.revolut.feature.topup_screen.impl.data.network.service.japan;

import com.revolut.data.network.models.openbanking.AuthorizationRequestDto;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Tag;
import tue.a;
import tue.c;
import tue.d;
import wj0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/data/network/service/japan/JapanInboundOpenBankingService;", "", "Lcom/revolut/data/network/models/openbanking/AuthorizationRequestDto;", "authorizationDto", "Ltue/a;", "getJapanOpenBankingAuthorizationContent", "(Lcom/revolut/data/network/models/openbanking/AuthorizationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltue/d;", "requestDto", "Lwj0/b;", "idempotencyTag", "Ltue/c;", "topUpViaJapanOpenBankingDirect", "(Ltue/d;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JapanInboundOpenBankingService {
    @POST("/external-institutions/application")
    Object getJapanOpenBankingAuthorizationContent(@Body @NotNull AuthorizationRequestDto authorizationRequestDto, @NotNull Continuation<? super a> continuation);

    @POST("/topup/gmo_pg_bank_direct")
    Object topUpViaJapanOpenBankingDirect(@Body @NotNull d dVar, @Tag @NotNull b bVar, @NotNull Continuation<? super c> continuation);
}

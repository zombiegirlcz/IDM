package com.revolut.shared.feature.card.request.impl.data.service;

import e6l.a;
import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Tag;
import z5l.c;
import z5l.e;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\u0006H'¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/card/request/impl/data/service/LegacyCardRequestService;", "Le6l/a;", "Lz5l/c;", "cardRequestCreate", "Lwj0/b;", "idempotencyTag", "Lefm/d0;", "Lz5l/e;", "requestCard", "(Lz5l/c;Lwj0/b;)Lefm/d0;", "", "getCardRequests", "()Lefm/d0;", "", "requestId", "updateCardRequest", "(Ljava/lang/String;Lz5l/c;)Lefm/d0;", "Lefm/b;", "deleteCardRequest", "(Ljava/lang/String;)Lefm/b;", "feature_shared_card_request_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LegacyCardRequestService extends a {
    @Override // e6l.a
    @DELETE("cards/requests/{requestId}")
    @NotNull
    b deleteCardRequest(@Path("requestId") @NotNull String requestId);

    @GET("cards/requests")
    @NotNull
    d0<List<e>> getCardRequests();

    @POST("cards/requests")
    @NotNull
    d0<e> requestCard(@Body @NotNull c cardRequestCreate, @Tag @NotNull wj0.b idempotencyTag);

    @PUT("cards/requests/{requestId}")
    @NotNull
    d0<e> updateCardRequest(@Path("requestId") @NotNull String requestId, @Body @NotNull c cardRequestCreate);
}

package com.revolut.shared.feature.card.request.impl.data.service;

import e6l.a;
import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import z5l.c;
import z5l.e;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cJ)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ2\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0010\u001a\u00020\u000bH'¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u00132\b\b\u0001\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00132\b\b\u0001\u0010\u0010\u001a\u00020\u000bH'¢\u0006\u0004\b\u001a\u0010\u0015¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/card/request/impl/data/service/CardRequestService;", "Le6l/a;", "Lz5l/c;", "cardRequestCreate", "Lwj0/b;", "idempotencyTag", "Lefm/d0;", "Lz5l/e;", "requestCard", "(Lz5l/c;Lwj0/b;)Lefm/d0;", "", "", "states", "experiments", "getCardRequests", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestId", "updateCardRequest", "(Ljava/lang/String;Lz5l/c;)Lefm/d0;", "Lefm/b;", "deleteCardRequest", "(Ljava/lang/String;)Lefm/b;", "Lz5l/a;", "cardApproveRequestDto", "approveRequest", "(Ljava/lang/String;Lz5l/a;)Lefm/b;", "declineRequest", "Companion", "a", "feature_shared_card_request_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardRequestService extends a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f104712a;

    /* JADX INFO: renamed from: com.revolut.shared.feature.card.request.impl.data.service.CardRequestService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f104712a = new Companion();

        private Companion() {
        }
    }

    @POST("youth/cards/requests/{requestId}/approve")
    @NotNull
    b approveRequest(@Path("requestId") @NotNull String requestId, @Body @NotNull z5l.a cardApproveRequestDto);

    @POST("youth/cards/requests/{requestId}/decline")
    @NotNull
    b declineRequest(@Path("requestId") @NotNull String requestId);

    @Override // e6l.a
    @DELETE("youth/cards/requests/{requestId}")
    @NotNull
    b deleteCardRequest(@Path("requestId") @NotNull String requestId);

    @GET("youth/cards/requests")
    Object getCardRequests(@NotNull @Query("state") List<String> list, @Header("X-Enabled-Experiments") String str, @NotNull Continuation<? super List<e>> continuation);

    @POST("youth/cards/requests")
    @NotNull
    d0<e> requestCard(@Body @NotNull c cardRequestCreate, @Tag @NotNull wj0.b idempotencyTag);

    @PUT("youth/cards/requests/{requestId}")
    @NotNull
    d0<e> updateCardRequest(@Path("requestId") @NotNull String requestId, @Body @NotNull c cardRequestCreate);
}

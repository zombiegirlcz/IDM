package com.revolut.feature.junior.card_request.impl.data.service;

import a98.a;
import a98.c;
import efm.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u0003H'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior/card_request/impl/data/service/JuniorCardRequestService;", "", "", "", "", "La98/c;", "getCardRequests", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "La98/a;", "cardApproveRequestDto", "Lefm/b;", "approveRequest", "(Ljava/lang/String;La98/a;)Lefm/b;", "declineRequest", "(Ljava/lang/String;)Lefm/b;", "feature_junior_card_request_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorCardRequestService {
    @POST("youth/cards/requests/{requestId}/approve")
    @NotNull
    b approveRequest(@Path("requestId") @NotNull String id10, @Body @NotNull a cardApproveRequestDto);

    @POST("youth/cards/requests/{requestId}/decline")
    @NotNull
    b declineRequest(@Path("requestId") @NotNull String id10);

    @GET("youth/cards/requests")
    Object getCardRequests(@NotNull Continuation<? super Map<String, ? extends List<c>>> continuation);
}

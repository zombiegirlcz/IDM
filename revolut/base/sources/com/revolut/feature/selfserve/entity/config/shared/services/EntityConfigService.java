package com.revolut.feature.selfserve.entity.config.shared.services;

import efm.b;
import efm.d0;
import gr2.y;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J0\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00132\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0016\u0010\u0015J#\u0010\u0017\u001a\u00020\u00132\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0017\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00132\b\b\u0001\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b2\b\b\u0001\u0010\u001a\u001a\u00020\u0002H'¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/selfserve/entity/config/shared/services/EntityConfigService;", "", "", "flowName", "", "queries", "Lgr2/y;", "getEntityConfigByFlow", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ticketId", "getEntityConfigByTicket", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "ticketIds", "getEntitiesConfigsByTickets", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "path", "Lokhttp3/RequestBody;", "body", "Lefm/b;", "executePostRequest", "(Ljava/lang/String;Lokhttp3/RequestBody;)Lefm/b;", "executePutRequest", "executePatchRequest", "executeDeleteRequest", "(Ljava/lang/String;)Lefm/b;", "transactionId", "Lefm/d0;", "getSectionsForTransactionChargeback", "(Ljava/lang/String;)Lefm/d0;", "feature_selfserve_entity_config_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EntityConfigService {
    @DELETE("{path}")
    @NotNull
    b executeDeleteRequest(@Path(encoded = true, value = "path") @NotNull String path);

    @PATCH("{path}")
    @NotNull
    b executePatchRequest(@Path(encoded = true, value = "path") @NotNull String path, @Body @NotNull RequestBody body);

    @POST("{path}")
    @NotNull
    b executePostRequest(@Path(encoded = true, value = "path") @NotNull String path, @Body @NotNull RequestBody body);

    @PUT("{path}")
    @NotNull
    b executePutRequest(@Path(encoded = true, value = "path") @NotNull String path, @Body @NotNull RequestBody body);

    @GET("/tickets/detailed")
    Object getEntitiesConfigsByTickets(@NotNull @Query("ticketIds") List<String> list, @NotNull Continuation<? super List<y>> continuation);

    @GET("/self-serve/home/flows/{flow}")
    Object getEntityConfigByFlow(@Path(ib.b.Flow) @NotNull String str, @QueryMap @NotNull Map<String, String> map, @NotNull Continuation<? super y> continuation);

    @GET("/tickets/{ticketId}")
    Object getEntityConfigByTicket(@Path("ticketId") @NotNull String str, @NotNull Continuation<? super y> continuation);

    @GET("tickets/v2/latest/origin-entities/{transactionId}/sections?entityType=TRANSACTION&ticketType=CHARGEBACK")
    @NotNull
    d0<y> getSectionsForTransactionChargeback(@Path("transactionId") @NotNull String transactionId);
}

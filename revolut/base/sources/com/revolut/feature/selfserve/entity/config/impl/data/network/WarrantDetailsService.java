package com.revolut.feature.selfserve.entity.config.impl.data.network;

import java.util.Map;
import jo3.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/selfserve/entity/config/impl/data/network/WarrantDetailsService;", "", "", "ticketId", "", "Ljo3/a;", "getWarrantDetailsByTicket", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_selfserve_entity_config_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WarrantDetailsService {
    @GET("/warrantDetails")
    Object getWarrantDetailsByTicket(@NotNull @Query("ticketId") String str, @NotNull Continuation<? super Map<String, a>> continuation);
}

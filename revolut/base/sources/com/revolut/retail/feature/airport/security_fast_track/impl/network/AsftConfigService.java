package com.revolut.retail.feature.airport.security_fast_track.impl.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import oti.d0;
import oti.q1;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/network/AsftConfigService;", "", "Loti/d0;", "getConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Loti/q1;", "getProductArticle", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AsftConfigService {
    @GET("/fast-track/config")
    Object getConfig(@NotNull Continuation<? super d0> continuation);

    @GET("/fast-track/product-article")
    Object getProductArticle(@NotNull Continuation<? super q1> continuation);
}

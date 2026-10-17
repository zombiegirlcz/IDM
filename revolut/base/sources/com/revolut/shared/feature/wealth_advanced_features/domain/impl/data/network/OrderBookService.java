package com.revolut.shared.feature.wealth_advanced_features.domain.impl.data.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import lgl.a;
import lgl.b;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/wealth_advanced_features/domain/impl/data/network/OrderBookService;", "", "", "securityRef", "Llgl/b;", "getOrderBook", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Llgl/a;", "getAvailability", "feature_shared_wealth_advanced_features_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OrderBookService {
    @GET("order-book/availability/{securityRef}")
    Object getAvailability(@Path("securityRef") @NotNull String str, @NotNull Continuation<? super a> continuation);

    @GET("order-book/snapshot/{securityRef}")
    Object getOrderBook(@Path("securityRef") @NotNull String str, @NotNull Continuation<? super b> continuation);
}

package com.revolut.feature.cryptocommodity_invest.impl.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import qw5.b;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/impl/network/CryptoTrendingService;", "", "Lqw5/b$c;", "timeSpan", "Lqw5/b$b;", "assetType", "Lqw5/b;", "getTrending", "(Lqw5/b$c;Lqw5/b$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoTrendingService {
    @GET("/instruments/trending")
    Object getTrending(@Query("timeSpan") b.c cVar, @NotNull @Query("assetType") b.EnumC1371b enumC1371b, @NotNull Continuation<? super b> continuation);
}

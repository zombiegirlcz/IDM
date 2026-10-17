package com.revolut.feature.wealth.impl.data.network.topmovers;

import com.revolut.feature.wealth.impl.data.network.topmovers.a;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/topmovers/TopMoversService;", "", "Lcom/revolut/feature/wealth/impl/data/network/topmovers/a$a;", "assetType", "Lcom/revolut/feature/wealth/impl/data/network/topmovers/a$c;", "timeSpan", "Lefm/d0;", "Lcom/revolut/feature/wealth/impl/data/network/topmovers/a;", "getTopMovers", "(Lcom/revolut/feature/wealth/impl/data/network/topmovers/a$a;Lcom/revolut/feature/wealth/impl/data/network/topmovers/a$c;)Lefm/d0;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TopMoversService {
    @GET("instruments/top-movers")
    @NotNull
    d0<a> getTopMovers(@NotNull @Query("assetType") a.EnumC0585a assetType, @NotNull @Query("timeSpan") a.c timeSpan);
}

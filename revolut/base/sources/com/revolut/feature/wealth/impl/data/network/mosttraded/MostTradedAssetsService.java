package com.revolut.feature.wealth.impl.data.network.mosttraded;

import com.revolut.feature.wealth.impl.data.network.mosttraded.a;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J5\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/mosttraded/MostTradedAssetsService;", "", "Lcom/revolut/feature/wealth/impl/data/network/mosttraded/a$a;", "assetType", "Lcom/revolut/feature/wealth/impl/data/network/mosttraded/a$d;", "timeSpan", "Lcom/revolut/feature/wealth/impl/data/network/mosttraded/a$c;", "securityType", "Lefm/d0;", "Lcom/revolut/feature/wealth/impl/data/network/mosttraded/a;", "getMostTraded", "(Lcom/revolut/feature/wealth/impl/data/network/mosttraded/a$a;Lcom/revolut/feature/wealth/impl/data/network/mosttraded/a$d;Lcom/revolut/feature/wealth/impl/data/network/mosttraded/a$c;)Lefm/d0;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MostTradedAssetsService {
    @GET("instruments/most-traded")
    @NotNull
    d0<a> getMostTraded(@NotNull @Query("assetType") a.EnumC0584a assetType, @NotNull @Query("timeSpan") a.d timeSpan, @Query("securityType") a.c securityType);
}

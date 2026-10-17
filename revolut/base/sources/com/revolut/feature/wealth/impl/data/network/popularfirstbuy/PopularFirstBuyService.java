package com.revolut.feature.wealth.impl.data.network.popularfirstbuy;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import w7h.a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00050\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/popularfirstbuy/PopularFirstBuyService;", "", "Lefm/d0;", "", "Lw7h/a;", "Lcom/revolut/feature/wealth/impl/data/network/popularfirstbuy/PopularFirstBuyDto;", "getPopularFirstBuy", "()Lefm/d0;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PopularFirstBuyService {
    @GET("instruments/collections/popular-first-time-buys")
    @NotNull
    d0<List<a>> getPopularFirstBuy();
}

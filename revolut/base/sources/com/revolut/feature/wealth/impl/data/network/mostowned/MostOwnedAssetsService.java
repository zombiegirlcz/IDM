package com.revolut.feature.wealth.impl.data.network.mostowned;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;
import v7h.a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J1\u0010\b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00070\u00052\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/mostowned/MostOwnedAssetsService;", "", "", "", "securityType", "Lefm/d0;", "Lv7h/a;", "Lcom/revolut/feature/wealth/impl/data/network/mostowned/MostOwnedAssetsDto;", "getMostOwned", "(Ljava/util/List;)Lefm/d0;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MostOwnedAssetsService {
    @GET("instruments/collections/most-owned")
    @NotNull
    d0<List<a>> getMostOwned(@Query("securityType") List<String> securityType);
}

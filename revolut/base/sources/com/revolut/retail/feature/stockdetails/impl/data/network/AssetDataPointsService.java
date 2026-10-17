package com.revolut.retail.feature.stockdetails.impl.data.network;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import krk.b;
import krk.e;
import krk.l;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J4\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/data/network/AssetDataPointsService;", "", "", "ref", "Lkrk/e;", "request", "", "Lkrk/b;", "Lkrk/l;", "Lcom/revolut/retail/feature/stockdetails/impl/data/network/model/data_points/AssetDataPointsSeriesResponse;", "getSeries", "(Ljava/lang/String;Lkrk/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AssetDataPointsService {
    @POST("/trading/instrument/{ref}/series")
    Object getSeries(@Path("ref") @NotNull String str, @Body @NotNull e eVar, @NotNull Continuation<? super Map<b, ? extends l>> continuation);
}

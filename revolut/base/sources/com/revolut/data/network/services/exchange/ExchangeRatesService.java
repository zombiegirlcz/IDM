package com.revolut.data.network.services.exchange;

import com.revolut.data.network.models.exchange.ExchangeRateDto;
import com.revolut.data.network.models.exchange.Side;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/data/network/services/exchange/ExchangeRatesService;", "", "", "symbol", "", "amount", "Lcom/revolut/data/network/models/exchange/Side;", "side", "Lefm/d0;", "Lcom/revolut/data/network/models/exchange/ExchangeRateDto;", "getConversion", "(Ljava/lang/String;JLcom/revolut/data/network/models/exchange/Side;)Lefm/d0;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ExchangeRatesService {
    @GET("quote/{symbol}")
    @NotNull
    d0<ExchangeRateDto> getConversion(@Path("symbol") @NotNull String symbol, @Query("amount") long amount, @NotNull @Query("side") Side side);
}

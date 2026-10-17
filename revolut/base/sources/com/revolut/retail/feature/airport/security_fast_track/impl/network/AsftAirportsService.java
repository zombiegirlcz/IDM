package com.revolut.retail.feature.airport.security_fast_track.impl.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import oti.i;
import oti.z1;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/network/AsftAirportsService;", "", "Loti/i;", "getAirportCips", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "terminalId", "Loti/z1;", "getTerminal", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AsftAirportsService {
    @GET("/fast-track/airport-cips")
    Object getAirportCips(@NotNull Continuation<? super i> continuation);

    @GET("/fast-track/airport-cips/{terminalId}")
    Object getTerminal(@Path("terminalId") @NotNull String str, @NotNull Continuation<? super z1> continuation);
}

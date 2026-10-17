package com.revolut.feature.wealth.options.ui.impl.data.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import meh.c;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H§@¢\u0006\u0004\b\u0006\u0010\u0007Jd\u0010\u0010\u001a\u00020\u000f2\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0001\u0010\b\u001a\u00020\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/options/ui/impl/data/network/OptionsApiService;", "", "", "Lcom/revolut/shared/feature/wealth/models/instrument/InstrumentRef;", "instrumentRef", "", "getExpirationDates", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expirationDate", "contractType", "offset", "range", "", "limit", "order", "Lmeh/c;", "getOptionChain", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_wealth_options_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OptionsApiService {
    @GET("trading/options/{underlyingCurrency}/expiration-dates")
    Object getExpirationDates(@Path("underlyingCurrency") @NotNull String str, @NotNull Continuation<? super List<String>> continuation);

    @GET("trading/options/{underlyingCurrency}/chain")
    Object getOptionChain(@Path("underlyingCurrency") @NotNull String str, @NotNull @Query("expirationDate") String str2, @Query("contractType") String str3, @Query("offset") String str4, @Query("range") String str5, @Query("limit") Integer num, @Query("order") String str6, @NotNull Continuation<? super c> continuation);
}

package com.revolut.feature.individual_flags.data.network;

import ch7.b;
import ch7.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/individual_flags/data/network/IndividualFlagsService;", "", "", "endpointName", "", "Lch7/b;", "getAll", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flag", "getFlag", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lch7/d;", "request", "Lretrofit2/Response;", "", "update", "(Ljava/lang/String;Ljava/lang/String;Lch7/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_individual_flags_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IndividualFlagsService {
    @GET("{endpointName}")
    Object getAll(@Path(encoded = true, value = "endpointName") @NotNull String str, @NotNull Continuation<? super List<b>> continuation);

    @GET("{endpointName}/{flag}")
    Object getFlag(@Path(encoded = true, value = "endpointName") @NotNull String str, @Path("flag") @NotNull String str2, @NotNull Continuation<? super b> continuation);

    @PUT("{endpointName}/{flag}")
    Object update(@Path(encoded = true, value = "endpointName") @NotNull String str, @Path("flag") @NotNull String str2, @Body @NotNull d dVar, @NotNull Continuation<? super Response<Unit>> continuation);
}

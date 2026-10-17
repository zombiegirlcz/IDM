package com.revolut.retail.feature.esim.impl.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mfj.c;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\u0014\b\u0001\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\b\u001a\u00020\u0003H§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\b\u001a\u00020\u0003H§@¢\u0006\u0004\b\r\u0010\f¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/network/EsimEventsService;", "", "", "", "simProfileIds", "Lmfj/c;", "getEvents", "([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "dismissEvent", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hideEvent", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimEventsService {
    @POST("/connect/events/{id}/dismiss")
    Object dismissEvent(@Path("id") @NotNull String str, @NotNull Continuation<? super Response<ResponseBody>> continuation);

    @GET("/connect/events")
    Object getEvents(@NotNull @Query("sim-profile-id") String[] strArr, @NotNull Continuation<? super c> continuation);

    @POST("/connect/events/{id}/hide")
    Object hideEvent(@Path("id") @NotNull String str, @NotNull Continuation<? super Response<ResponseBody>> continuation);
}

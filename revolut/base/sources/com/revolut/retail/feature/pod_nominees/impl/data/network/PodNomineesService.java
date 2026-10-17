package com.revolut.retail.feature.pod_nominees.impl.data.network;

import efm.d0;
import fek.a;
import fek.b;
import fek.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000e\u0010\fJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\r\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pod_nominees/impl/data/network/PodNomineesService;", "", "Lefm/d0;", "", "Lfek/b;", "getPodNominees", "()Lefm/d0;", "", "idempotencyKey", "Lfek/c;", "podNomineeDto", "addPodNominees", "(Ljava/lang/String;Lfek/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "editPodNominees", "Lfek/a;", "percentagesDto", "editPercentage", "(Lfek/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePodNominee", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_pod_nominees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PodNomineesService {
    @POST("/account-nominees")
    Object addPodNominees(@Header("X-Idempotency-Key") @NotNull String str, @Body @NotNull c cVar, @NotNull Continuation<? super List<b>> continuation);

    @DELETE("/account-nominees/{id}")
    Object deletePodNominee(@Path("id") @NotNull String str, @NotNull Continuation<? super List<b>> continuation);

    @POST("/account-nominees/proportions")
    Object editPercentage(@Body @NotNull a aVar, @NotNull Continuation<? super List<b>> continuation);

    @PATCH("/account-nominees/{id}")
    Object editPodNominees(@Path("id") @NotNull String str, @Body @NotNull c cVar, @NotNull Continuation<? super List<b>> continuation);

    @GET("/account-nominees")
    @NotNull
    d0<List<b>> getPodNominees();
}

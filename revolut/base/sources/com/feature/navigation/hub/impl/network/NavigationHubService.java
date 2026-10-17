package com.feature.navigation.hub.impl.network;

import ia.e;
import ia.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/feature/navigation/hub/impl/network/NavigationHubService;", "", "", "workflowStepId", "Lia/f;", "getNavigationHubContent", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lia/e;", "Lretrofit2/Response;", "", "completeNavigationHub", "(Lia/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_navigation_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface NavigationHubService {
    @POST("/self-serve/home/flows/navigation-hub/complete")
    Object completeNavigationHub(@Body @NotNull e eVar, @NotNull Continuation<? super Response<Unit>> continuation);

    @GET("/self-serve/home/flows/navigation-hub")
    Object getNavigationHubContent(@NotNull @Query("workflowStepId") String str, @NotNull Continuation<? super f> continuation);
}

package com.feature.user.details.impl.network;

import ab.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import za.a;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/feature/user/details/impl/network/UserDetailsService;", "", "Lab/f;", "getUserDetails", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lza/a;", "selectedField", "Lretrofit2/Response;", "", "editField", "(Lza/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_user_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UserDetailsService {
    @POST("/workflows/periodic-review-action")
    Object editField(@Body @NotNull a aVar, @NotNull Continuation<? super Response<Unit>> continuation);

    @GET("/self-serve/home/flows/periodic-review-all")
    Object getUserDetails(@NotNull Continuation<? super f> continuation);
}

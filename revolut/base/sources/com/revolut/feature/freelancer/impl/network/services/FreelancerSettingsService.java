package com.revolut.feature.freelancer.impl.network.services;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import pt6.a;
import pt6.b;
import pt6.c;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Tag;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/services/FreelancerSettingsService;", "", "Lpt6/a;", "request", "Lretrofit2/Response;", "", "changeEmail", "(Lpt6/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpt6/c;", "code", "verifyCode", "(Lpt6/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpt6/b;", "Lwj0/b;", "idempotencyTag", "changeUrl", "(Lpt6/b;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerSettingsService {
    @POST("/acquiring/merchant/email/code")
    Object changeEmail(@Body @NotNull a aVar, @NotNull Continuation<? super Response<Unit>> continuation);

    @POST("/acquiring/merchant/change-requests")
    Object changeUrl(@Body @NotNull b bVar, @Tag @NotNull wj0.b bVar2, @NotNull Continuation<? super Response<Unit>> continuation);

    @POST("/acquiring/merchant/email/confirm")
    Object verifyCode(@Body @NotNull c cVar, @NotNull Continuation<? super Response<Unit>> continuation);
}

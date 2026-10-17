package com.revolut.feature.freelancer.impl.network.services;

import com.revolut.feature.freelancer.impl.network.models.b;
import com.revolut.feature.freelancer.impl.network.models.c;
import com.revolut.feature.freelancer.impl.network.models.c0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import ro3.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0004¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/services/FreelancerAccountService;", "", "Lcom/revolut/feature/freelancer/impl/network/models/b;", "getFreelancerAccountDetails", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/revolut/feature/freelancer/impl/network/models/c;", "addNewAccountDto", "Lro3/e;", "addFreelancerPocket", "(Lcom/revolut/feature/freelancer/impl/network/models/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/revolut/feature/freelancer/impl/network/models/c0;", "joinCampaignParamsDto", "Lretrofit2/Response;", "", "uploadJoinCampaignParams", "(Lcom/revolut/feature/freelancer/impl/network/models/c0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "closeAccount", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerAccountService {
    @POST("/acquiring/merchant/pocket")
    Object addFreelancerPocket(@Body @NotNull c cVar, @NotNull Continuation<? super e> continuation);

    @POST("/acquiring/merchant/close-account")
    Object closeAccount(@NotNull Continuation<? super Unit> continuation);

    @GET("/acquiring/merchant")
    Object getFreelancerAccountDetails(@NotNull Continuation<? super b> continuation);

    @POST("/acquiring/merchant/applicant")
    Object uploadJoinCampaignParams(@Body @NotNull c0 c0Var, @NotNull Continuation<? super Response<Unit>> continuation);
}

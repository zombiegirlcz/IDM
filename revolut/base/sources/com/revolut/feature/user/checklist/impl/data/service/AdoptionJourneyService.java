package com.revolut.feature.user.checklist.impl.data.service;

import fmg.p;
import fmg.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import yhm.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/user/checklist/impl/data/service/AdoptionJourneyService;", "", "Lfmg/p;", "getAdoptionJourney", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfmg/s;", "request", "", "sendStepCompletion", "(Lfmg/s;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_user_checklist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public interface AdoptionJourneyService {
    @GET("adoption-journey")
    Object getAdoptionJourney(@NotNull Continuation<? super p> continuation);

    @POST("adoption-journey/step-completion")
    Object sendStepCompletion(@Body @NotNull s sVar, @NotNull Continuation<? super Unit> continuation);
}

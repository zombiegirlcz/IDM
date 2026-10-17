package com.revolut.feature.freelancer.impl.network.services;

import com.revolut.feature.freelancer.impl.network.models.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/services/FreelancerProTrackService;", "", "Lcom/revolut/feature/freelancer/impl/network/models/x;", "proTrack", "", "completeProTrack", "(Lcom/revolut/feature/freelancer/impl/network/models/x;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "skipProTrack", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerProTrackService {
    @POST("/acquiring/pro-track/complete")
    Object completeProTrack(@Body @NotNull x xVar, @NotNull Continuation<? super Unit> continuation);

    @POST("/acquiring/pro-track/skip")
    Object skipProTrack(@Body @NotNull x xVar, @NotNull Continuation<? super Unit> continuation);
}

package com.revolut.feature.rev_points.impl.data.network;

import hxb.a0;
import hxb.b0;
import hxb.t;
import hxb.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\u0004J\u001a\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/rev_points/impl/data/network/RevPointsPersonalisationService;", "", "Lhxb/v;", "getPreferences", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhxb/b0;", "request", "", "updatePreferences", "(Lhxb/b0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhxb/t;", "getBrands", "Lhxb/a0;", "updateBrands", "(Lhxb/a0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevPointsPersonalisationService {
    @GET("loyalty/personalisation/brands")
    Object getBrands(@NotNull Continuation<? super t> continuation);

    @GET("loyalty/personalisation/preferences")
    Object getPreferences(@NotNull Continuation<? super v> continuation);

    @POST("loyalty/personalisation/brands")
    Object updateBrands(@Body @NotNull a0 a0Var, @NotNull Continuation<? super Unit> continuation);

    @POST("loyalty/personalisation/preferences")
    Object updatePreferences(@Body @NotNull b0 b0Var, @NotNull Continuation<? super Unit> continuation);
}

package com.revolut.feature.junior_settings.impl.services;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import rn8.d;
import rn8.e;
import rn8.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\bJ)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/services/JuniorSettingsService;", "", "", "juniorId", "Lefm/d0;", "", "Lrn8/e;", "getCurrentProducts", "(Ljava/lang/String;)Lefm/d0;", "Lrn8/f;", "getJuniorReferralSetting", "request", "updateJuniorReferralSetting", "(Ljava/lang/String;Lrn8/f;)Lefm/d0;", "Lrn8/d;", "getJuniorPaymentsSettings", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateJuniorPaymentsSettings", "(Ljava/lang/String;Lrn8/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorSettingsService {
    @GET("/user/{id}/pricing")
    @NotNull
    d0<List<e>> getCurrentProducts(@Path("id") @NotNull String juniorId);

    @GET("youth/user/{id}/settings/payments")
    Object getJuniorPaymentsSettings(@Path("id") @NotNull String str, @NotNull Continuation<? super d> continuation);

    @GET("youth/user/{id}/settings/referrals")
    @NotNull
    d0<f> getJuniorReferralSetting(@Path("id") @NotNull String juniorId);

    @PATCH("youth/user/{id}/settings/payments")
    Object updateJuniorPaymentsSettings(@Path("id") @NotNull String str, @Body @NotNull d dVar, @NotNull Continuation<? super d> continuation);

    @PATCH("youth/user/{id}/settings/referrals")
    @NotNull
    d0<f> updateJuniorReferralSetting(@Path("id") @NotNull String juniorId, @Body @NotNull f request);
}

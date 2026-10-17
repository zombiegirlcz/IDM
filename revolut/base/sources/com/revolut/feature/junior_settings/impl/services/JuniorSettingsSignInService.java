package com.revolut.feature.junior_settings.impl.services;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rn8.i;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/services/JuniorSettingsSignInService;", "", "", "juniorId", "Lrn8/i;", "getSignInConfig", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deletePhone", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorSettingsSignInService {
    @DELETE("youth/users/{id}/phone")
    Object deletePhone(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("youth/users/{id}/sign-in-methods/config")
    Object getSignInConfig(@Path("id") @NotNull String str, @NotNull Continuation<? super i> continuation);
}

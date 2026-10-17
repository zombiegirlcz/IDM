package com.revolut.feature.apm.core.impl.data.network.settings;

import fz1.g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/impl/data/network/settings/ApmSettingsService;", "", "", "product", "Lfz1/g;", "getSettings", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "settings", "updateSettings", "(Ljava/lang/String;Lfz1/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmSettingsService {
    @GET("/apm/{product}/settings")
    Object getSettings(@Path("product") @NotNull String str, @NotNull Continuation<? super g> continuation);

    @PUT("/apm/{product}/settings")
    Object updateSettings(@Path("product") @NotNull String str, @Body @NotNull g gVar, @NotNull Continuation<? super g> continuation);
}

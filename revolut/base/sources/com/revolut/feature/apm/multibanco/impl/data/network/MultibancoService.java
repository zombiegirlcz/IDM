package com.revolut.feature.apm.multibanco.impl.data.network;

import e72.f;
import e72.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\u0004¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/data/network/MultibancoService;", "", "Le72/g;", "getMultibancoUserRegistrationStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Le72/f;", "getMultibancoUserRegistrationData", "", "postMultibancoRenewService", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MultibancoService {
    @GET("mbway/user/registration")
    Object getMultibancoUserRegistrationData(@NotNull Continuation<? super f> continuation);

    @GET("mbway/user")
    Object getMultibancoUserRegistrationStatus(@NotNull Continuation<? super g> continuation);

    @POST("mbway/user/renew")
    Object postMultibancoRenewService(@NotNull Continuation<? super Unit> continuation);
}

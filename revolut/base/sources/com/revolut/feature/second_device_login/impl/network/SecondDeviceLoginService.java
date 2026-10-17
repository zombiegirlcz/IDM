package com.revolut.feature.second_device_login.impl.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ktc.c;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/second_device_login/impl/network/SecondDeviceLoginService;", "", "Lktc/c;", "body", "Lretrofit2/Response;", "", "acknowledgeNewDevice", "(Lktc/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_second_device_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SecondDeviceLoginService {
    @POST("security-hub/device/acknowledge-new")
    Object acknowledgeNewDevice(@Body @NotNull c cVar, @NotNull Continuation<? super Response<Unit>> continuation);
}

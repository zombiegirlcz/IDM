package com.revolut.feature.junior_core.impl.services;

import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import ve8.f;
import ze8.a;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\u000b¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_core/impl/services/JuniorAccountService;", "", "", "registeredIdentityId", "Lefm/d0;", "", "Lxe8/a;", "getYouthUsersProducts", "(Ljava/lang/String;)Lefm/d0;", "Lwe8/b;", "getYouthUsersKyc", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "juniorId", "Lefm/b;", "closeAccount", "(Ljava/lang/String;)Lefm/b;", "cancelClosureRequest", "Lve8/f;", "getJuniorPlanConfigurations", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lze8/a;", "getJuniorWalletConfigurations", "feature_junior_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorAccountService {
    @POST("/youth/users/{juniorId}/decline-closure")
    @NotNull
    b cancelClosureRequest(@Path("juniorId") @NotNull String juniorId);

    @POST("/youth/users/{juniorId}/close")
    @NotNull
    b closeAccount(@Path("juniorId") @NotNull String juniorId);

    @GET("/youth/config")
    Object getJuniorPlanConfigurations(@NotNull Continuation<? super f> continuation);

    @GET("/youth/users/{juniorId}/wallet/config")
    Object getJuniorWalletConfigurations(@Path("juniorId") @NotNull String str, @NotNull Continuation<? super a> continuation);

    @GET("/youth/users/kyc")
    Object getYouthUsersKyc(@Header("X-Registered-Identity") @NotNull String str, @NotNull Continuation<? super List<we8.b>> continuation);

    @GET("/youth/users/products")
    @NotNull
    d0<List<xe8.a>> getYouthUsersProducts(@Header("X-Registered-Identity") @NotNull String registeredIdentityId);
}

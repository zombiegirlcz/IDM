package com.revolut.feature.junior_remote_login.impl.data.service;

import com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation;
import dl8.d;
import el8.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\r\u0010\fJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u0007J\u001a\u0010\u0010\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_remote_login/impl/data/service/JuniorRemoteLoginService;", "", "", "juniorId", "Lretrofit2/Response;", "Lcom/revolut/feature/junior_remote_login/api/model/RemoteLoginInvitation$Present;", "getRemoteLoginInvitations", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldl8/d;", "request", "", "createRemoteLoginInvitation", "(Ljava/lang/String;Ldl8/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRemoteLoginInvitation", "cancelRemoteLoginInvitation", "Lel8/c;", "confirmIdentity", "(Lel8/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorRemoteLoginService {
    @DELETE("youth/{juniorId}/login-invitation")
    Object cancelRemoteLoginInvitation(@Path("juniorId") @NotNull String str, @NotNull Continuation<? super Response<Unit>> continuation);

    @POST("youth/e2e/identity/confirm")
    Object confirmIdentity(@Body @NotNull c cVar, @NotNull Continuation<? super Unit> continuation);

    @POST("youth/{juniorId}/login-invitation")
    Object createRemoteLoginInvitation(@Path("juniorId") @NotNull String str, @Body @NotNull d dVar, @NotNull Continuation<? super Response<Unit>> continuation);

    @GET("youth/{juniorId}/login-invitation")
    Object getRemoteLoginInvitations(@Path("juniorId") @NotNull String str, @NotNull Continuation<? super Response<RemoteLoginInvitation.Present>> continuation);

    @PUT("youth/{juniorId}/login-invitation")
    Object updateRemoteLoginInvitation(@Path("juniorId") @NotNull String str, @Body @NotNull d dVar, @NotNull Continuation<? super Response<Unit>> continuation);
}

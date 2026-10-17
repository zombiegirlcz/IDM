package com.revolut.feature.shared.network_authentication.impl.network;

import efm.d0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import pad.a;
import pad.c;
import pad.d;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import zj0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/network_authentication/impl/network/TokenService;", "", "Lpad/c;", "request", "Lefm/d0;", "Lpad/d;", "refreshToken", "(Lpad/c;)Lefm/d0;", "Lpad/a;", "", "tokenType", "Lpad/b;", "refreshScopedToken", "(Lpad/a;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getScopedToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "a", "feature_shared_network_authentication_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TokenService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f86424a;

    /* JADX INFO: renamed from: com.revolut.feature.shared.network_authentication.impl.network.TokenService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f86424a = new Companion();

        private Companion() {
        }
    }

    @b
    @POST("token")
    Object getScopedToken(@Header("X-Token-Type") @NotNull String str, @NotNull Continuation<? super pad.b> continuation);

    @PUT("token")
    @b
    Object refreshScopedToken(@Body @NotNull a aVar, @Header("X-Token-Type") @NotNull String str, @NotNull Continuation<? super pad.b> continuation);

    @PUT("token")
    @b
    @NotNull
    @Headers({"X-Force-App-Auth: true"})
    d0<d> refreshToken(@Body @NotNull c request);
}

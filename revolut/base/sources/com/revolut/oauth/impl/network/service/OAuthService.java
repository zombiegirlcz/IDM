package com.revolut.oauth.impl.network.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import zmi.f;
import zmi.l;
import zmi.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011JD\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/oauth/impl/network/service/OAuthService;", "", "", "responseType", "clientId", "scope", "redirectUri", "codeChallengeMethod", "Lzmi/o;", "getConsent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lzmi/l;", "request", "Lzmi/f;", "confirmConsent", "(Lzmi/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "a", "revolut_oauth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OAuthService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.f98488a;

    /* JADX INFO: renamed from: com.revolut.oauth.impl.network.service.OAuthService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f98488a = new Companion();

        private Companion() {
        }
    }

    @Headers({"CUSTOM_APP_AUTH_NAME: true", "Accept: application/json"})
    @POST("api/oauth/authorize")
    Object confirmConsent(@Body @NotNull l lVar, @NotNull Continuation<? super f> continuation);

    @Headers({"CUSTOM_APP_AUTH_NAME: true", "Accept: application/json"})
    @GET("api/oauth/consent")
    Object getConsent(@NotNull @Query("response_type") String str, @NotNull @Query("client_id") String str2, @Query("scope") String str3, @NotNull @Query("redirect_uri") String str4, @NotNull @Query("code_challenge_method") String str5, @NotNull Continuation<? super o> continuation);
}

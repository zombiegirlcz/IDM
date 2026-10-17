package com.revolut.feature.shared.signin.impl.data;

import gdd.c;
import gdd.h;
import gdd.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/signin/impl/data/SigninService;", "", "Lgdd/i;", "body", "Lgdd/c;", "signIn", "(Lgdd/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgdd/h;", "signInWithAccessToken", "(Lgdd/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "signOut", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_shared_signin_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SigninService {
    @Headers({"X-Integrity-Check: none"})
    @POST("signin")
    Object signIn(@Body @NotNull i iVar, @NotNull Continuation<? super c> continuation);

    @Headers({"X-Integrity-Check: none"})
    @POST("signin")
    Object signInWithAccessToken(@Body @NotNull h hVar, @NotNull Continuation<? super c> continuation);

    @POST("signout")
    Object signOut(@NotNull Continuation<? super Unit> continuation);
}

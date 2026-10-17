package com.revolut.feature.junior.account_activation.impl.data.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import pi8.d;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Tag;
import u58.c;
import wj0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J.\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/data/network/JuniorAsyncAccountActivationService;", "", "Lwj0/b;", "idempotencyTag", "", "juniorRegisteredIdentityId", "Lu58/c;", "request", "Lpi8/d;", "activateJunior", "(Lwj0/b;Ljava/lang/String;Lu58/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorAsyncAccountActivationService {
    @POST("/youth/users/{juniorRegisteredIdentityId}/activate")
    Object activateJunior(@Tag @NotNull b bVar, @Path("juniorRegisteredIdentityId") @NotNull String str, @Body @NotNull c cVar, @NotNull Continuation<? super d> continuation);
}

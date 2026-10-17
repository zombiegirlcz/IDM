package com.revolut.feature.junior_onboarding.impl.service;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import pi8.d;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Tag;
import uh8.f;
import wj0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/service/JuniorCreationService;", "", "Lwj0/b;", "idempotencyTag", "Luh8/f;", "account", "Lpi8/d;", "createJunior", "(Lwj0/b;Luh8/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "notifyOnboardingStarted", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorCreationService {
    @POST("/youth/users/create")
    Object createJunior(@Tag @NotNull b bVar, @Body @NotNull f fVar, @NotNull Continuation<? super d> continuation);

    @POST("/youth/onboarding/notify")
    Object notifyOnboardingStarted(@NotNull Continuation<? super Unit> continuation);
}

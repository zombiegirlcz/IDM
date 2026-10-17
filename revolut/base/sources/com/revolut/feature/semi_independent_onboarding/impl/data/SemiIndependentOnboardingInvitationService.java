package com.revolut.feature.semi_independent_onboarding.impl.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import z0d.f;
import z0d.i;
import z0d.l;
import z0d.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/semi_independent_onboarding/impl/data/SemiIndependentOnboardingInvitationService;", "", "Lz0d/l;", "request", "Lz0d/o;", "sendGuardianInvitation", "(Lz0d/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "invitationId", "Lz0d/i;", "sendGuardianInvitationReminder", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lz0d/f;", "getGuardianInvitations", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_semi_independent_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SemiIndependentOnboardingInvitationService {
    @GET("teen/guardian-invitations")
    Object getGuardianInvitations(@NotNull Continuation<? super List<f>> continuation);

    @POST("teen/guardian-invitations")
    Object sendGuardianInvitation(@Body @NotNull l lVar, @NotNull Continuation<? super o> continuation);

    @POST("teen/guardian-invitations/{id}/reminder")
    Object sendGuardianInvitationReminder(@Path("id") @NotNull String str, @NotNull Continuation<? super i> continuation);
}

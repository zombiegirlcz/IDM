package com.revolut.retail.feature.pricing_plans.impl.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import lfk.a;
import lfk.b;
import lfk.e;
import lfk.g;
import lfk.i;
import lfk.j;
import lfk.k;
import lfk.l;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import yhm.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0011\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\tJ$\u0010\u0014\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\u0018\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001a\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001c\u0010\tJ$\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u001f\u001a\u00020\rH§@¢\u0006\u0004\b\u001f\u0010\tJ\u001a\u0010!\u001a\u00020 2\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b!\u0010\u0006J\u0010\u0010#\u001a\u00020\"H§@¢\u0006\u0004\b#\u0010\t¨\u0006$À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/impl/network/FamilyPlanService;", "", "", "code", "Llfk/k;", "getMemberEligibilityByCode", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmfk/a;", "getFamilyPlanInvitations", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "familyId", "Llfk/j;", "body", "", "inviteMember", "(Ljava/lang/String;Llfk/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Llfk/l;", "getFamilyPlanSubscribeInfo", "getFamilySubscribeInfo", "memberId", "removeMember", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invitationId", "Llfk/i;", "patchInvitation", "(Ljava/lang/String;Ljava/lang/String;Llfk/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFamily", "Llfk/a;", "getCurrentFamily", "Llfk/g;", "getInvitationInfo", "createFamily", "Llfk/e;", "getFamilyCancellationPreview", "Llfk/b;", "getFamilyLimits", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FamilyPlanService {
    @POST("/families")
    Object createFamily(@NotNull Continuation<? super Unit> continuation);

    @DELETE("families/{familyId}")
    Object deleteFamily(@Path("familyId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("/families/current")
    Object getCurrentFamily(@NotNull Continuation<? super a> continuation);

    @GET("/families/{familyId}/cancellation-preview")
    Object getFamilyCancellationPreview(@Path("familyId") @NotNull String str, @NotNull Continuation<? super e> continuation);

    @GET("/families/limits")
    Object getFamilyLimits(@NotNull Continuation<? super b> continuation);

    @GET("/families/invitations")
    Object getFamilyPlanInvitations(@NotNull Continuation<? super mfk.a> continuation);

    @GET("plans/families/info")
    @d
    Object getFamilyPlanSubscribeInfo(@NotNull Continuation<? super l> continuation);

    @GET("families/info")
    Object getFamilySubscribeInfo(@NotNull Continuation<? super l> continuation);

    @GET("/plans/families/{familyId}/invitations/{invitationId}/info")
    Object getInvitationInfo(@Path("familyId") @NotNull String str, @Path("invitationId") @NotNull String str2, @NotNull Continuation<? super g> continuation);

    @GET("/families/members/eligibility")
    Object getMemberEligibilityByCode(@NotNull @Query("code") String str, @NotNull Continuation<? super k> continuation);

    @PUT("/families/{familyId}/invitations")
    Object inviteMember(@Path("familyId") @NotNull String str, @Body @NotNull j jVar, @NotNull Continuation<? super Unit> continuation);

    @PATCH("/plans/families/{familyId}/invitations/{invitationId}")
    Object patchInvitation(@Path("familyId") @NotNull String str, @Path("invitationId") @NotNull String str2, @Body @NotNull i iVar, @NotNull Continuation<? super Unit> continuation);

    @DELETE("families/{familyId}/members/{memberId}")
    Object removeMember(@Path("familyId") @NotNull String str, @Path("memberId") @NotNull String str2, @NotNull Continuation<? super Unit> continuation);
}

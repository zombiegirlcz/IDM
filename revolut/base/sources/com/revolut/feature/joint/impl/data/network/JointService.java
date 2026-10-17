package com.revolut.feature.joint.impl.data.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import z38.b;
import z38.c;
import z38.d;
import z38.f;
import z38.h;
import z38.k;
import z38.l;
import z38.m;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0004\b\n\u0010\bJ\u001a\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0011\u0010\u0004J\u001a\u0010\u0013\u001a\u00020\r2\b\b\u0001\u0010\u0012\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0013\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0012\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0015\u0010\bJ\u001a\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0012\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0017\u0010\bJ\u001a\u0010\u0018\u001a\u00020\r2\b\b\u0001\u0010\u0012\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0018\u0010\bJ\u0010\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001a\u0010\u0004J\u001a\u0010\u001c\u001a\u00020\r2\b\b\u0001\u0010\u001b\u001a\u00020\u0005H§@¢\u0006\u0004\b\u001c\u0010\bJ\u001a\u0010\u001f\u001a\u00020\r2\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001f\u0010 J \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\b\b\u0001\u0010!\u001a\u00020\u0005H§@¢\u0006\u0004\b$\u0010\b¨\u0006%À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/joint/impl/data/network/JointService;", "", "Lz38/d;", "getUserEligibility", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "phone", "getUserInvitationEligibilityByPhone", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "code", "getUserInvitationEligibilityByCode", "Lz38/f;", "invitation", "", "inviteUsers", "(Lz38/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lz38/m;", "getPendingInvitations", "invitationId", "rejectInvitation", "Lz38/l;", "acceptInvitation", "Lz38/c;", "createAccount", "remindInvitee", "Lz38/b;", "getJointAccounts", "jointAccountId", "terminateJointAccount", "Lz38/h;", "params", "sendMcyInvitation", "(Lz38/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pocketType", "", "Lz38/k;", "getPartnerLinkedCards", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JointService {
    @POST("/joint-invitations/{id}/accept")
    Object acceptInvitation(@Path("id") @NotNull String str, @NotNull Continuation<? super l> continuation);

    @POST("/joint-invitations/{id}/create-account")
    Object createAccount(@Path("id") @NotNull String str, @NotNull Continuation<? super c> continuation);

    @GET("/joint-accounts")
    Object getJointAccounts(@NotNull Continuation<? super b> continuation);

    @GET("/my-card/joint-account/partner/linked-cards")
    Object getPartnerLinkedCards(@NotNull @Query("pocketType") String str, @NotNull Continuation<? super List<k>> continuation);

    @GET("/joint-invitations")
    Object getPendingInvitations(@NotNull Continuation<? super m> continuation);

    @GET("/joint-eligibility")
    Object getUserEligibility(@NotNull Continuation<? super d> continuation);

    @GET("/joint-invitations/eligibility")
    Object getUserInvitationEligibilityByCode(@NotNull @Query("code") String str, @NotNull Continuation<? super d> continuation);

    @GET("/joint-invitations/eligibility")
    Object getUserInvitationEligibilityByPhone(@NotNull @Query("phone") String str, @NotNull Continuation<? super d> continuation);

    @POST("/joint-invitations")
    Object inviteUsers(@Body @NotNull f fVar, @NotNull Continuation<? super Unit> continuation);

    @POST("/joint-invitations/{id}/reject")
    Object rejectInvitation(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("/joint-invitations/{id}/ping")
    Object remindInvitee(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("/joint-invitations/mcy")
    Object sendMcyInvitation(@Body @NotNull h hVar, @NotNull Continuation<? super Unit> continuation);

    @POST("/joint-accounts/{id}/terminate")
    Object terminateJointAccount(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);
}

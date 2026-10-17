package com.revolut.feature.payments.messaging.data.impl.data.database.network.service;

import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kv9.a;
import kv9.h;
import kv9.m;
import kv9.q;
import kv9.u;
import kv9.v;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J=\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u000b\u0010\fJG\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u000e\u001a\u00020\r2\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\b2\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\b2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0017\u001a\u00020\rH'¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u00020\u00182\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u001b\u001a\u00020\rH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\b2\b\b\u0001\u0010\u001f\u001a\u00020\u001eH'¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\b2\b\b\u0001\u0010$\u001a\u00020#H'¢\u0006\u0004\b%\u0010&J)\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\b2\b\b\u0001\u0010'\u001a\u00020\r2\b\b\u0001\u0010)\u001a\u00020(H'¢\u0006\u0004\b*\u0010+J\u0019\u0010,\u001a\u00020\u00182\b\b\u0001\u0010'\u001a\u00020\rH'¢\u0006\u0004\b,\u0010\u001a¨\u0006-À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/impl/data/database/network/service/SocialPaymentsService;", "", "", "from", "", "limit", "", "excludeDeleted", "Lefm/d0;", "", "Lkv9/h;", "getMessages", "(Ljava/lang/Long;Ljava/lang/Integer;Z)Lefm/d0;", "", "groupId", "getGroupMessages", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Z)Lefm/d0;", "Lkv9/u;", "request", "sendMessage", "(Lkv9/u;)Lefm/d0;", "sendGroupMessage", "(Ljava/lang/String;Lkv9/u;)Lefm/d0;", "id", "Lefm/b;", "deleteMessage", "(Ljava/lang/String;)Lefm/b;", "messageId", "deleteGroupMessage", "(Ljava/lang/String;Ljava/lang/String;)Lefm/b;", "Lkv9/q;", "recipient", "Lkv9/a;", "getContactEligibility", "(Lkv9/q;)Lefm/d0;", "Lkv9/m;", "newReaction", "addNewReaction", "(Lkv9/m;)Lefm/d0;", "parentMessageId", "Lkv9/v;", "updateReactionDto", "updateReaction", "(Ljava/lang/String;Lkv9/v;)Lefm/d0;", "removeReaction", "feature_payments_messaging_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SocialPaymentsService {
    @POST("/messages/reactions")
    @NotNull
    d0<h> addNewReaction(@Body @NotNull m newReaction);

    @DELETE("/groups/{groupId}/messages/{messageId}")
    @NotNull
    b deleteGroupMessage(@Path("groupId") @NotNull String groupId, @Path("messageId") @NotNull String messageId);

    @DELETE("/messages/{id}")
    @NotNull
    b deleteMessage(@Path("id") @NotNull String id10);

    @POST("/messages/eligibility")
    @NotNull
    d0<a> getContactEligibility(@Body @NotNull q recipient);

    @GET("/groups/{groupId}/messages")
    @NotNull
    d0<List<h>> getGroupMessages(@Path("groupId") @NotNull String groupId, @Query("from") Long from, @Query("limit") Integer limit, @Query("excludeDeleted") boolean excludeDeleted);

    @GET("/messages")
    @NotNull
    d0<List<h>> getMessages(@Query("from") Long from, @Query("limit") Integer limit, @Query("excludeDeleted") boolean excludeDeleted);

    @DELETE("/messages/reactions/{parentMessageId}")
    @NotNull
    b removeReaction(@Path("parentMessageId") @NotNull String parentMessageId);

    @POST("/groups/{group_id}/messages")
    @NotNull
    d0<h> sendGroupMessage(@Path("group_id") @NotNull String groupId, @Body @NotNull u request);

    @POST("/messages")
    @NotNull
    d0<h> sendMessage(@Body @NotNull u request);

    @PUT("/messages/reactions/{parentMessageId}")
    @NotNull
    d0<h> updateReaction(@Path("parentMessageId") @NotNull String parentMessageId, @Body @NotNull v updateReactionDto);
}

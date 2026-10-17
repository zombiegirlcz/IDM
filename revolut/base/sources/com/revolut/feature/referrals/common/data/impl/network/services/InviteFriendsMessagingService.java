package com.revolut.feature.referrals.common.data.impl.network.services;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import ywa.c;
import ywa.f;
import ywa.i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/referrals/common/data/impl/network/services/InviteFriendsMessagingService;", "", "", "campaignType", "Lywa/c;", "friendsValidationRequestDto", "Lrwa/i;", "validateFriends", "(Ljava/lang/String;Lywa/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lywa/i;", "inviteMessagesBody", "Lywa/f;", "sendMessages", "(Ljava/lang/String;Lywa/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_shared_referrals_common_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InviteFriendsMessagingService {
    @POST("/invitation/internal/{campaignType}/message")
    Object sendMessages(@Path("campaignType") @NotNull String str, @Body @NotNull i iVar, @NotNull Continuation<? super f> continuation);

    @POST("/invitation/internal/{campaignType}")
    Object validateFriends(@Path("campaignType") @NotNull String str, @Body @NotNull c cVar, @NotNull Continuation<? super rwa.i> continuation);
}

package com.revolut.chat.data.network;

import b20.d;
import efm.d0;
import gim.i;
import i20.b0;
import i20.x;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o20.a;
import o20.b;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\bH§@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0017\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001dH§@¢\u0006\u0004\b \u0010\u001fJb\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010%\u001a\u0004\u0018\u00010$2\u0010\b\u0003\u0010&\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\bH§@¢\u0006\u0004\b'\u0010(¨\u0006)À\u0006\u0003"}, d2 = {"Lcom/revolut/chat/data/network/MessagesApi;", "", "Ljava/util/UUID;", "ticketId", "", "limit", "Lorg/joda/time/Instant;", "since", "", "Li20/b0;", "getMessageListHistory", "(Ljava/util/UUID;ILorg/joda/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Li20/d0;", "message", "correlationId", "Lefm/d0;", "sendMessage", "(Ljava/util/UUID;Li20/d0;Ljava/util/UUID;)Lefm/d0;", "Lo20/a;", "body", "sendFileAsync", "(Ljava/util/UUID;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo20/b;", "sendFileBulk", "(Ljava/util/UUID;Lo20/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/RequestBody;", "Lo20/d;", "uploadContent", "(Ljava/util/UUID;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Li20/x;", "getGreetingMessages", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGreetingAssistantMessages", "sinceMessageId", "beforeMessageId", "feedId", "", "ticketType", "payloadKinds", "getSingleFeedMessages", "(ILjava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MessagesApi {
    static /* synthetic */ Object a(MessagesApi messagesApi, UUID uuid, UUID uuid2, String str, i iVar, int i) {
        if ((i & 16) != 0) {
            str = null;
        }
        return messagesApi.getSingleFeedMessages(100, null, uuid, uuid2, str, null, iVar);
    }

    @GET("/api/client/greeting-messages/assistant")
    Object getGreetingAssistantMessages(@NotNull Continuation<? super x> continuation);

    @GET("/api/client/greeting-messages")
    Object getGreetingMessages(@NotNull Continuation<? super x> continuation);

    @GET("api/client/tickets/{id}/messages/history")
    Object getMessageListHistory(@Path("id") @NotNull UUID uuid, @Query("limit") int i, @Query("before") Instant instant, @NotNull Continuation<? super List<b0>> continuation);

    @GET("/api/client/messages")
    Object getSingleFeedMessages(@Query("limit") int i, @Query("sinceMessageId") UUID uuid, @Query("beforeMessageId") UUID uuid2, @Query("feedId") UUID uuid3, @Query("ticketType") String str, @Query("payloadKinds") List<String> list, @NotNull Continuation<? super List<b0>> continuation);

    @POST("/api/client/tickets/{ticketId}/messages/upload/async")
    Object sendFileAsync(@Path("ticketId") @NotNull UUID uuid, @Body @NotNull List<a> list, @NotNull Continuation<? super List<b0>> continuation);

    @POST("/api/client/tickets/{ticketId}/messages/upload/bulk")
    Object sendFileBulk(@Path("ticketId") @NotNull UUID uuid, @Body @NotNull b bVar, @NotNull Continuation<? super b0> continuation);

    @POST("/api/client/tickets/{ticketId}/messages/text")
    @NotNull
    d0<b0> sendMessage(@Path("ticketId") @NotNull UUID ticketId, @Body @NotNull i20.d0 message, @NotNull @Query("correlationId") UUID correlationId);

    @d
    @POST("/api/client/tickets/{ticketId}/messages/upload/content")
    Object uploadContent(@Path("ticketId") @NotNull UUID uuid, @Body @NotNull RequestBody requestBody, @NotNull Continuation<? super List<o20.d>> continuation);
}

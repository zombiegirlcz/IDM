package com.revolut.chat.data.network;

import efm.b;
import efm.d0;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import m20.a;
import m20.d;
import m20.f;
import m20.g;
import m20.n;
import m20.q;
import m20.s;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H'¢\u0006\u0004\b\u0007\u0010\u0005J9\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000f0\u00022\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH'¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u001dH'¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002H'¢\u0006\u0004\b!\u0010\u0005J\u0019\u0010\"\u001a\u00020\u001a2\b\b\u0001\u0010\u0015\u001a\u00020\u0014H'¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u001a2\b\b\u0001\u0010\u0015\u001a\u00020\u0014H'¢\u0006\u0004\b$\u0010#J/\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000f0\u00022\b\b\u0001\u0010&\u001a\u00020%2\b\b\u0001\u0010(\u001a\u00020'H'¢\u0006\u0004\b)\u0010*J!\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u0014H'¢\u0006\u0004\b,\u0010\u0017J\u0019\u0010.\u001a\u00020\u001a2\b\b\u0001\u0010-\u001a\u00020\u0014H'¢\u0006\u0004\b.\u0010#J\u001f\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00022\b\b\u0001\u0010/\u001a\u00020\u0014H'¢\u0006\u0004\b1\u0010\u0017J\u001f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00022\b\b\u0001\u0010/\u001a\u00020\bH'¢\u0006\u0004\b3\u00104J\u0019\u00105\u001a\u00020\u001a2\b\b\u0001\u0010/\u001a\u00020\u0014H'¢\u0006\u0004\b5\u0010#J%\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f0\u00022\b\b\u0001\u0010/\u001a\u00020\u0014H'¢\u0006\u0004\b6\u0010\u0017J\u001f\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00022\b\b\u0001\u0010/\u001a\u00020\u0014H'¢\u0006\u0004\b8\u0010\u0017J#\u0010:\u001a\u00020\u001a2\b\b\u0001\u0010/\u001a\u00020\u00142\b\b\u0001\u0010\u0019\u001a\u000209H'¢\u0006\u0004\b:\u0010;J-\u0010?\u001a\u00020\u001a2\b\b\u0001\u0010/\u001a\u00020\u00142\b\b\u0001\u0010<\u001a\u00020\u00142\b\b\u0001\u0010>\u001a\u00020=H'¢\u0006\u0004\b?\u0010@J\u0010\u0010B\u001a\u00020AH§@¢\u0006\u0004\bB\u0010CJ\u001f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\b\b\u0001\u0010/\u001a\u00020\u0014H'¢\u0006\u0004\bD\u0010\u0017J\u0019\u0010E\u001a\u00020\u001a2\b\b\u0001\u0010/\u001a\u00020\u0014H'¢\u0006\u0004\bE\u0010#J$\u0010H\u001a\u00020G2\b\b\u0001\u0010-\u001a\u00020\u00142\b\b\u0001\u0010\u0019\u001a\u00020FH§@¢\u0006\u0004\bH\u0010IJ\u001a\u0010K\u001a\u00020J2\b\b\u0001\u0010-\u001a\u00020\u0014H§@¢\u0006\u0004\bK\u0010LJ\u0016\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u000fH§@¢\u0006\u0004\bN\u0010CJ\u001a\u0010O\u001a\u00020G2\b\b\u0001\u0010+\u001a\u00020\u0014H§@¢\u0006\u0004\bO\u0010L¨\u0006PÀ\u0006\u0003"}, d2 = {"Lcom/revolut/chat/data/network/TicketsInfoApi;", "", "Lefm/d0;", "Lg20/b;", "getInbox", "()Lefm/d0;", "Lg20/a;", "getClientInfo", "", "category", "source", "ticketType", "Lm20/g;", "getNextTicket", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "", "types", "Lm20/n;", "getTicketList", "(Ljava/util/List;)Lefm/d0;", "Ljava/util/UUID;", "ticketID", "getTicket", "(Ljava/util/UUID;)Lefm/d0;", "Ld20/a;", "requestBody", "Lefm/b;", "submitTicketSuggestedAction", "(Ljava/util/UUID;Ld20/a;)Lefm/b;", "Lm20/q;", "ticketMetadata", "openTicket", "(Lm20/q;)Lefm/d0;", "openAssistantTicket", "dismissTicket", "(Ljava/util/UUID;)Lefm/b;", "dismissCallTile", "Lorg/joda/time/Instant;", "before", "", "limit", "getResolvedTickets", "(Lorg/joda/time/Instant;I)Lefm/d0;", "feedId", "getLastTicket", "ticketId", "closeTicket", "id", "Lm20/a;", "getAgent", "Lm20/s;", "getFileUrl", "(Ljava/lang/String;)Lefm/d0;", "markRead", "getFeedbackList", "Lm20/d;", "getAvailability", "Lm20/f;", "changeLanguage", "(Ljava/util/UUID;Lm20/f;)Lefm/b;", "correlationId", "Lokhttp3/RequestBody;", "body", "sendStructuredMessage", "(Ljava/util/UUID;Ljava/util/UUID;Lokhttp3/RequestBody;)Lefm/b;", "Lp20/a;", "getWsConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolveTicket", "cancelTicket", "Lk20/b;", "", "rateTicketExperience", "(Ljava/util/UUID;Lk20/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lk20/d;", "getRatings", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lh20/a;", "getFeeds", "archiveFeed", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TicketsInfoApi {
    @POST("/api/client/feeds/{id}/archive")
    Object archiveFeed(@Path("id") @NotNull UUID uuid, @NotNull Continuation<? super Unit> continuation);

    @POST("/api/client/tickets/{id}/cancel")
    @NotNull
    b cancelTicket(@Path("id") @NotNull UUID id10);

    @POST("/api/client/tickets/{id}/language")
    @NotNull
    b changeLanguage(@Path("id") @NotNull UUID id10, @Body @NotNull f requestBody);

    @POST("/api/client/tickets/{ticketId}/close")
    @NotNull
    b closeTicket(@Path("ticketId") @NotNull UUID ticketId);

    @POST("/api/client/tickets/{id}/dismiss-call-tile")
    @NotNull
    b dismissCallTile(@Path("id") @NotNull UUID ticketID);

    @POST("/api/client/tickets/{id}/dismiss")
    @NotNull
    b dismissTicket(@Path("id") @NotNull UUID ticketID);

    @GET("/api/client/agents/{id}/info")
    @NotNull
    d0<a> getAgent(@Path("id") @NotNull UUID id10);

    @GET("/api/client/tickets/{id}/availability")
    @NotNull
    d0<d> getAvailability(@Path("id") @NotNull UUID id10);

    @GET("/api/client/info")
    @NotNull
    d0<g20.a> getClientInfo();

    @GET("/api/client/tickets/{id}/feedback-options")
    @NotNull
    d0<List<Object>> getFeedbackList(@Path("id") @NotNull UUID id10);

    @GET("/api/client/feeds")
    Object getFeeds(@NotNull Continuation<? super List<h20.a>> continuation);

    @GET("/api/client/uploads/{id}?type=JSON")
    @NotNull
    d0<s> getFileUrl(@Path("id") @NotNull String id10);

    @GET("/api/client/tickets/summary")
    @NotNull
    d0<g20.b> getInbox();

    @GET("/api/client/tickets/last")
    @NotNull
    d0<n> getLastTicket(@Query("feedId") UUID feedId);

    @GET("/api/client/tickets/next")
    @NotNull
    d0<g> getNextTicket(@Query("category") String category, @Query("source") String source, @Query("ticketType") String ticketType);

    @GET("/api/client/tickets/{id}/ratings")
    Object getRatings(@Path("id") @NotNull UUID uuid, @NotNull Continuation<? super k20.d> continuation);

    @GET("/api/client/tickets/history")
    @NotNull
    d0<List<n>> getResolvedTickets(@NotNull @Query("before") Instant before, @Query("limit") int limit);

    @GET("/api/client/tickets/{id}")
    @NotNull
    d0<n> getTicket(@Path("id") @NotNull UUID ticketID);

    @GET("/api/client/tickets")
    @NotNull
    d0<List<n>> getTicketList(@NotNull @Query("ticketType") List<String> types);

    @GET("/api/client/ws/config")
    Object getWsConfig(@NotNull Continuation<? super p20.a> continuation);

    @POST("/api/client/tickets/{id}/messages/read")
    @NotNull
    b markRead(@Path("id") @NotNull UUID id10);

    @POST("/api/client/tickets/assistant")
    @NotNull
    d0<n> openAssistantTicket();

    @POST("/api/client/tickets")
    @NotNull
    d0<n> openTicket(@Body @NotNull q ticketMetadata);

    @POST("/api/client/tickets/{id}/rate-experience")
    Object rateTicketExperience(@Path("id") @NotNull UUID uuid, @Body @NotNull k20.b bVar, @NotNull Continuation<? super Unit> continuation);

    @POST("/api/client/tickets/{id}/resolve")
    @NotNull
    d0<n> resolveTicket(@Path("id") @NotNull UUID id10);

    @POST("api/client/tickets/{id}/messages/structured")
    @NotNull
    @Multipart
    b sendStructuredMessage(@Path("id") @NotNull UUID id10, @NotNull @Query("correlationId") UUID correlationId, @NotNull @Part("body") RequestBody body);

    @POST("/api/client/tickets/{id}/submit-action")
    @NotNull
    b submitTicketSuggestedAction(@Path("id") @NotNull UUID ticketID, @Body @NotNull d20.a requestBody);
}

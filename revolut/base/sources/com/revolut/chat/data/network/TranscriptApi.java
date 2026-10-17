package com.revolut.chat.data.network;

import java.time.LocalDate;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import n20.b;
import n20.c;
import n20.d;
import n20.e;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\t\u001a\u00020\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ2\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0006J\u001a\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0006J\u001a\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0006¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/revolut/chat/data/network/TranscriptApi;", "", "Ljava/util/UUID;", "feedId", "Ln20/d;", "requestTranscript", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ln20/c;", "request", "requestTranscriptWithRange", "(Ljava/util/UUID;Ln20/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/time/LocalDate;", "start", "end", "Ln20/b;", "getAvailableDates", "(Ljava/util/UUID;Ljava/time/LocalDate;Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTranscript", "ticketID", "requestTranscriptForTicket", "getTranscriptForTicket", "transcriptId", "Ln20/e;", "getTranscriptLink", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TranscriptApi {
    @GET("/api/client/tickets/transcription/available-days")
    Object getAvailableDates(@NotNull @Query("feedId") UUID uuid, @Query("start") LocalDate localDate, @Query("end") LocalDate localDate2, @NotNull Continuation<? super b> continuation);

    @GET("/api/client/tickets/transcription")
    Object getTranscript(@Query("feedId") UUID uuid, @NotNull Continuation<? super d> continuation);

    @GET("/api/client/tickets/{id}/transcription")
    Object getTranscriptForTicket(@Path("id") @NotNull UUID uuid, @NotNull Continuation<? super d> continuation);

    @GET("/api/client/transcriptions/{id}/download?type=JSON")
    Object getTranscriptLink(@Path("id") @NotNull UUID uuid, @NotNull Continuation<? super e> continuation);

    @POST("/api/client/tickets/transcription")
    Object requestTranscript(@Query("feedId") UUID uuid, @NotNull Continuation<? super d> continuation);

    @POST("/api/client/tickets/{id}/transcription")
    Object requestTranscriptForTicket(@Path("id") @NotNull UUID uuid, @NotNull Continuation<? super d> continuation);

    @POST("/api/client/tickets/transcription")
    Object requestTranscriptWithRange(@Query("feedId") UUID uuid, @Body @NotNull c cVar, @NotNull Continuation<? super d> continuation);
}

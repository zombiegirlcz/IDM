package com.revolut.feature.junior_coparent.impl.services;

import ce8.a;
import ce8.c;
import ce8.e;
import com.revolut.feature.junior_coparent.api.models.InvitationAcceptanceResponse;
import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u00142\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\r2\b\b\u0001\u0010\u0018\u001a\u00020\u0002H'¢\u0006\u0004\b\u0019\u0010\u000fJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0010H§@¢\u0006\u0004\b\u001b\u0010\u0013J \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d2\b\b\u0001\u0010\u001c\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001e\u0010\f¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_coparent/impl/services/JuniorCoparentService;", "", "", "juniorId", "Lce8/b;", "invitation", "", "sendInvitation", "(Ljava/lang/String;Lce8/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invitationId", "Lcom/revolut/feature/junior_coparent/api/models/InvitationAcceptanceResponse;", "acceptInvitation", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lefm/b;", "declineInvitation", "(Ljava/lang/String;)Lefm/b;", "", "Lce8/e;", "getInvitationApplications", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lefm/d0;", "Lce8/a;", "getCoparents", "(Ljava/lang/String;)Lefm/d0;", "coparentId", "removeCoparent", "Lce8/c;", "getCoparentRequests", "requestId", "Lretrofit2/Response;", "declineCoparentRequest", "feature_junior_coparent_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorCoparentService {
    @POST("/youth/guardians/invitations/{invitationId}/accept")
    Object acceptInvitation(@Path("invitationId") @NotNull String str, @NotNull Continuation<? super InvitationAcceptanceResponse> continuation);

    @POST("/youth/guardians/requests/{requestId}/decline")
    Object declineCoparentRequest(@Path("requestId") @NotNull String str, @NotNull Continuation<? super Response<Unit>> continuation);

    @POST("/youth/guardians/invitations/{invitationId}/decline")
    @NotNull
    b declineInvitation(@Path("invitationId") @NotNull String invitationId);

    @GET("/youth/guardians/requests")
    Object getCoparentRequests(@NotNull Continuation<? super List<c>> continuation);

    @GET("/youth/users/{juniorId}/guardians")
    @NotNull
    d0<List<a>> getCoparents(@Path("juniorId") @NotNull String juniorId);

    @GET("/youth/guardians/invitations")
    Object getInvitationApplications(@NotNull Continuation<? super List<e>> continuation);

    @DELETE("/youth/guardians/{coparentId}")
    @NotNull
    b removeCoparent(@Path("coparentId") @NotNull String coparentId);

    @POST("/youth/users/{juniorId}/guardians/invitations")
    Object sendInvitation(@Path("juniorId") @NotNull String str, @Body @NotNull ce8.b bVar, @NotNull Continuation<? super Unit> continuation);
}

package com.revolut.feature.payments.groups.impl.data.network.services;

import cr9.b0;
import cr9.c0;
import cr9.f;
import cr9.f0;
import cr9.g;
import cr9.l;
import cr9.q;
import cr9.r;
import cr9.s;
import cr9.t;
import cr9.u;
import cr9.v;
import cr9.w;
import dr9.a;
import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody$Part;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 Q2\u00020\u0001:\u0001RJ%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\rH'¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\rH'¢\u0006\u0004\b\u0013\u0010\u0011J/\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0019\u001a\u00020\u001cH'¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0019\u001a\u00020\u001fH'¢\u0006\u0004\b \u0010!J$\u0010#\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0019\u001a\u00020\"H§@¢\u0006\u0004\b#\u0010$J3\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0019\u001a\u00020%H'¢\u0006\u0004\b&\u0010'J3\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010)\u001a\u00020(H'¢\u0006\u0004\b*\u0010+J/\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0019\u001a\u00020,H'¢\u0006\u0004\b-\u0010.J-\u00103\u001a\u0002022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0019\u001a\u00020/2\b\b\u0001\u00101\u001a\u000200H'¢\u0006\u0004\b3\u00104J#\u00106\u001a\u0002022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u00105\u001a\u00020\tH'¢\u0006\u0004\b6\u00107J#\u00109\u001a\u0002022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u00108\u001a\u00020\tH'¢\u0006\u0004\b9\u00107J)\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b:\u0010\fJ#\u0010<\u001a\u0002022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0019\u001a\u00020;H'¢\u0006\u0004\b<\u0010=J#\u0010>\u001a\u0002022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u00108\u001a\u00020\tH'¢\u0006\u0004\b>\u00107J#\u0010?\u001a\u0002022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0019\u001a\u00020;H'¢\u0006\u0004\b?\u0010=J9\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u00105\u001a\u00020\t2\b\b\u0001\u0010\u0019\u001a\u00020@H'¢\u0006\u0004\bA\u0010BJ\u0019\u0010C\u001a\u0002022\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\bC\u0010DJ\u0019\u0010E\u001a\u0002022\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\bE\u0010DJ\u001a\u0010H\u001a\u00020G2\b\b\u0001\u0010F\u001a\u00020\tH§@¢\u0006\u0004\bH\u0010IJ\u001a\u0010J\u001a\u00020\u00062\b\b\u0001\u0010F\u001a\u00020\tH§@¢\u0006\u0004\bJ\u0010IJ$\u0010L\u001a\u00020K2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0003\u00101\u001a\u000200H§@¢\u0006\u0004\bL\u0010MJ\u001a\u0010O\u001a\u00020N2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\bO\u0010IJ#\u0010P\u001a\u0002022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u00105\u001a\u00020\tH'¢\u0006\u0004\bP\u00107¨\u0006SÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/data/network/services/PaymentsGroupsService;", "", "", "baseCurrencyHeader", "Lefm/d0;", "", "Lcr9/v;", "getGroups", "(Z)Lefm/d0;", "", "groupId", "getGroup", "(ZLjava/lang/String;)Lefm/d0;", "", "fromTimestamp", "Lcr9/l;", "getGroupBills", "(Ljava/lang/String;Ljava/lang/Long;)Lefm/d0;", "Lcr9/c0;", "getGroupSettlements", "includeAll", "Lcr9/u;", "getGroupDebts", "(Ljava/lang/String;Z)Lefm/d0;", "Lcr9/t;", "requestDto", "createGroup", "(ZLcr9/t;)Lefm/d0;", "Lcr9/r;", "changeMembers", "(ZLjava/lang/String;Lcr9/r;)Lefm/d0;", "Ldr9/b;", "changeCalculationType", "(Ljava/lang/String;Ldr9/b;)Lefm/d0;", "Ldr9/a;", "changeBaseCurrency", "(Ljava/lang/String;Ldr9/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcr9/s;", "changeName", "(ZLjava/lang/String;Lcr9/s;)Lefm/d0;", "Lokhttp3/MultipartBody$Part;", "imagePart", "changeImage", "(ZLjava/lang/String;Lokhttp3/MultipartBody$Part;)Lefm/d0;", "Lcr9/f;", "addBills", "(Ljava/lang/String;Lcr9/f;)Lefm/d0;", "Lcr9/g;", "Lwj0/b;", "idempotencyTag", "Lefm/b;", "addMultiSettlements", "(Ljava/lang/String;Lcr9/g;Lwj0/b;)Lefm/b;", "billId", "removeBill", "(Ljava/lang/String;Ljava/lang/String;)Lefm/b;", "memberId", "removeMember", "removeImage", "Lcr9/b0;", "remindMembersDebt", "(Ljava/lang/String;Lcr9/b0;)Lefm/b;", "remindMemberInvite", "remindMembersInvite", "Lcr9/f0;", "updateBill", "(Ljava/lang/String;Ljava/lang/String;Lcr9/f0;)Lefm/d0;", "acceptGroupParticipation", "(Ljava/lang/String;)Lefm/b;", "leaveGroup", "code", "Lcr9/q;", "getGroupByCodeDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinGroupByCode", "Lcr9/w;", "getGroupInviteLink", "(Ljava/lang/String;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcr9/b;", "getMessagesEligibility", "deleteBillReceipt", "Companion", "a", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PaymentsGroupsService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f79320a;

    /* JADX INFO: renamed from: com.revolut.feature.payments.groups.impl.data.network.services.PaymentsGroupsService$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f79320a = new Companion();

        private Companion() {
        }
    }

    @POST("groups/{groupId}/members/me/acceptance")
    @NotNull
    b acceptGroupParticipation(@Path("groupId") @NotNull String groupId);

    @POST("groups/{groupId}/bills")
    @NotNull
    d0<List<l>> addBills(@Path("groupId") @NotNull String groupId, @Body @NotNull f requestDto);

    @POST("groups/{groupId}/settlements")
    @NotNull
    b addMultiSettlements(@Path("groupId") @NotNull String groupId, @Body @NotNull g requestDto, @Tag @NotNull wj0.b idempotencyTag);

    @PATCH("groups/{groupId}")
    Object changeBaseCurrency(@Path("groupId") @NotNull String str, @Body @NotNull a aVar, @NotNull Continuation<? super v> continuation);

    @PATCH("groups/{groupId}")
    @NotNull
    d0<v> changeCalculationType(@Path("groupId") @NotNull String groupId, @Body @NotNull dr9.b requestDto);

    @PUT("groups/{groupId}/banner")
    @NotNull
    @Multipart
    d0<v> changeImage(@Header("X-Base-Currency-Group") boolean baseCurrencyHeader, @Path("groupId") @NotNull String groupId, @NotNull @Part MultipartBody$Part imagePart);

    @POST("groups/{groupId}/members")
    @NotNull
    d0<v> changeMembers(@Header("X-Base-Currency-Group") boolean baseCurrencyHeader, @Path("groupId") @NotNull String groupId, @Body @NotNull r requestDto);

    @PATCH("groups/{groupId}")
    @NotNull
    d0<v> changeName(@Header("X-Base-Currency-Group") boolean baseCurrencyHeader, @Path("groupId") @NotNull String groupId, @Body @NotNull s requestDto);

    @POST("groups")
    @NotNull
    d0<v> createGroup(@Header("X-Base-Currency-Group") boolean baseCurrencyHeader, @Body @NotNull t requestDto);

    @DELETE("groups/{groupId}/bills/{billId}/receipt")
    @NotNull
    b deleteBillReceipt(@Path("groupId") @NotNull String groupId, @Path("billId") @NotNull String billId);

    @GET("groups/{groupId}")
    @NotNull
    d0<v> getGroup(@Header("X-Base-Currency-Group") boolean baseCurrencyHeader, @Path("groupId") @NotNull String groupId);

    @GET("groups/{groupId}/bills")
    @NotNull
    d0<List<l>> getGroupBills(@Path("groupId") @NotNull String groupId, @Query("from") Long fromTimestamp);

    @GET("groups/links/{code}")
    Object getGroupByCodeDetails(@Path("code") @NotNull String str, @NotNull Continuation<? super q> continuation);

    @GET("groups/{groupId}/debts")
    @NotNull
    d0<List<u>> getGroupDebts(@Path("groupId") @NotNull String groupId, @Query("includeAll") boolean includeAll);

    @POST("groups/{groupId}/link")
    Object getGroupInviteLink(@Path("groupId") @NotNull String str, @Tag @NotNull wj0.b bVar, @NotNull Continuation<? super w> continuation);

    @GET("groups/{groupId}/settlements")
    @NotNull
    d0<List<c0>> getGroupSettlements(@Path("groupId") @NotNull String groupId, @Query("from") Long fromTimestamp);

    @GET("groups")
    @NotNull
    d0<List<v>> getGroups(@Header("X-Base-Currency-Group") boolean baseCurrencyHeader);

    @GET("groups/{groupId}/messages/eligibility")
    Object getMessagesEligibility(@Path("groupId") @NotNull String str, @NotNull Continuation<? super cr9.b> continuation);

    @POST("/groups/links/{code}/join")
    Object joinGroupByCode(@Path("code") @NotNull String str, @NotNull Continuation<? super v> continuation);

    @DELETE("groups/{groupId}/members/me")
    @NotNull
    b leaveGroup(@Path("groupId") @NotNull String groupId);

    @POST("groups/{groupId}/members/{memberId}/reminders/invite")
    @NotNull
    b remindMemberInvite(@Path("groupId") @NotNull String groupId, @Path("memberId") @NotNull String memberId);

    @POST("groups/{groupId}/reminders/debts")
    @NotNull
    b remindMembersDebt(@Path("groupId") @NotNull String groupId, @Body @NotNull b0 requestDto);

    @POST("groups/{groupId}/reminders/invite")
    @NotNull
    b remindMembersInvite(@Path("groupId") @NotNull String groupId, @Body @NotNull b0 requestDto);

    @DELETE("groups/{groupId}/bills/{billId}")
    @NotNull
    b removeBill(@Path("groupId") @NotNull String groupId, @Path("billId") @NotNull String billId);

    @DELETE("groups/{groupId}/banner")
    @NotNull
    d0<v> removeImage(@Header("X-Base-Currency-Group") boolean baseCurrencyHeader, @Path("groupId") @NotNull String groupId);

    @DELETE("groups/{groupId}/members/{memberId}")
    @NotNull
    b removeMember(@Path("groupId") @NotNull String groupId, @Path("memberId") @NotNull String memberId);

    @PUT("groups/{groupId}/bills/{billId}")
    @NotNull
    d0<List<l>> updateBill(@Path("groupId") @NotNull String groupId, @Path("billId") @NotNull String billId, @Body @NotNull f0 requestDto);
}

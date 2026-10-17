package com.revolut.retail.feature.pricing_plans.waitlist.impl.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import mok.a;
import mok.b;
import mok.c;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import yhm.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J@\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\rJ\u001a\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/waitlist/impl/network/WaitlistService;", "", "", "planTier", "", "state", "referralCode", "Lmok/b;", "getWaitlistEntries", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "entryId", "", "acknowledgeEntry", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acceptEntry", "Lmok/c;", "getEntryLayout", "Lmok/a;", "request", "acceptInvitationByExistingUser", "(Lmok/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WaitlistService {
    @POST("plans/waitlist/entries/{id}/accept")
    Object acceptEntry(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("v2/invitation/accept-by-existing-user")
    @d
    Object acceptInvitationByExistingUser(@Body @NotNull a aVar, @NotNull Continuation<? super Unit> continuation);

    @POST("plans/waitlist/entries/{id}/acknowledge")
    Object acknowledgeEntry(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("plans/waitlist/entries/{id}/layout")
    Object getEntryLayout(@Path("id") @NotNull String str, @NotNull Continuation<? super c> continuation);

    @GET("plans/waitlist/entries")
    Object getWaitlistEntries(@Query("planTier") String str, @Query("state") List<String> list, @Query("referralCode") String str2, @NotNull Continuation<? super List<b>> continuation);
}

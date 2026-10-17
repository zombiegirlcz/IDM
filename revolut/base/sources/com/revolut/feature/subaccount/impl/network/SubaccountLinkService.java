package com.revolut.feature.subaccount.impl.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import w6e.f;
import w6e.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0004\tJ\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/subaccount/impl/network/SubaccountLinkService;", "", "", "pocketId", "Lw6e/f;", "getPersonalSubaccountLinkCode", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "revTag", "linkCode", "Lw6e/i;", "getForeignSubaccountDescription", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SubaccountLinkService {
    @GET("pocket-profile/{revTag}/{linkCode}")
    Object getForeignSubaccountDescription(@Path("revTag") @NotNull String str, @Path("linkCode") @NotNull String str2, @NotNull Continuation<? super i> continuation);

    @POST("pocket-profile/{pocketId}/code")
    Object getPersonalSubaccountLinkCode(@Path("pocketId") @NotNull String str, @NotNull Continuation<? super f> continuation);
}

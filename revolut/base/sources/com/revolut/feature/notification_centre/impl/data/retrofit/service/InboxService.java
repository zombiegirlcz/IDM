package com.revolut.feature.notification_centre.impl.data.retrofit.service;

import a79.d;
import a79.g;
import a79.m;
import efm.b;
import efm.d0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0004\b\u0006\u0010\fJ#\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00102\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0013\u0010\u0012J#\u0010\u0014\u001a\u00020\u00102\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0014\u0010\u0012J\u0019\u0010\u0017\u001a\u00020\u00102\b\b\u0001\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/notification_centre/impl/data/retrofit/service/InboxService;", "", "", "viewType", "Lefm/d0;", "La79/m;", "getMessages", "(Ljava/lang/String;)Lefm/d0;", "", "limit", "", "to", "(ILjava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "itemId", "La79/d;", "inboxCallbackRequestDto", "Lefm/b;", "setMessageViewed", "(Ljava/lang/String;La79/d;)Lefm/b;", "setMessageOpen", "hideMessage", "La79/g;", "inboxImpressionsDto", "setInboxImpressions", "(La79/g;)Lefm/b;", "feature_notification_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InboxService {
    @GET("/inbox")
    @NotNull
    d0<m> getMessages(@Query("viewType") String viewType);

    @GET("/inbox")
    Object getMessages(@Query("limit") int i, @Query("to") Long l2, @NotNull Continuation<? super m> continuation);

    @POST("/inbox/{itemId}/close")
    @NotNull
    b hideMessage(@Path("itemId") @NotNull String itemId, @Body @NotNull d inboxCallbackRequestDto);

    @POST("/inbox/impressions")
    @NotNull
    b setInboxImpressions(@Body @NotNull g inboxImpressionsDto);

    @POST("/inbox/{itemId}/open")
    @NotNull
    b setMessageOpen(@Path("itemId") @NotNull String itemId, @Body @NotNull d inboxCallbackRequestDto);

    @zj0.b
    @POST("/inbox/{itemId}/view")
    @NotNull
    b setMessageViewed(@Path("itemId") @NotNull String itemId, @Body @NotNull d inboxCallbackRequestDto);
}

package com.revolut.feature.support.impl.data.network.service;

import bde.b;
import bde.o;
import bde.q;
import bde.s;
import bde.t;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H'¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\u0005H'¢\u0006\u0004\b\u000b\u0010\tJG\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00060\u00052\b\b\u0001\u0010\f\u001a\u00020\u00072\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H'¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00060\u00052\b\b\u0001\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00052\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H'¢\u0006\u0004\b\u001a\u0010\tJ\u001b\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H'¢\u0006\u0004\b\u001b\u0010\tJ%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00060\u00052\b\b\u0001\u0010\f\u001a\u00020\u0007H'¢\u0006\u0004\b\u0010\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/support/impl/data/network/service/SupportService;", "", "Lefm/b;", "terminateAccount", "()Lefm/b;", "Lefm/d0;", "", "", "getTerminationObstacles", "()Lefm/d0;", "Lbde/o;", "getBanner", "id", "types", "labels", "Lbde/q;", "getTroubleshootingForTransaction", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lefm/d0;", "Lbde/t;", "userActionRequest", "getTroubleshootingFeed", "(Lbde/t;)Lefm/d0;", "cardId", "Lbde/b;", "getCardTroubleshooting", "(Ljava/lang/String;)Lefm/d0;", "getFeedbackProducts", "getFeedbackIssues", "Lbde/s;", "getTroubleshootingSuggestions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SupportService {
    @GET("support/banner")
    @NotNull
    d0<List<o>> getBanner();

    @GET("support/troubleshooting/card-delivery")
    @NotNull
    d0<b> getCardTroubleshooting(@Query("cardId") String cardId);

    @GET("support/prods")
    @NotNull
    d0<List<String>> getFeedbackIssues();

    @GET("support/prods")
    @NotNull
    d0<List<String>> getFeedbackProducts();

    @GET("user/current/terminate/check")
    @NotNull
    d0<List<String>> getTerminationObstacles();

    @POST("support/troubleshooting/feed?types=FAQ&types=CARD_DELIVERY_TROUBLESHOOTING&types=DEEP_LINK&types=HYPERLINK")
    @NotNull
    d0<List<q>> getTroubleshootingFeed(@Body @NotNull t userActionRequest);

    @GET("support/troubleshooting/transaction/{id}?types=DEEP_LINK&types=HYPERLINK")
    @NotNull
    d0<List<q>> getTroubleshootingForTransaction(@Path("id") @NotNull String id10);

    @GET("/support/troubleshooting/transaction/{id}")
    @NotNull
    d0<List<q>> getTroubleshootingForTransaction(@Path("id") @NotNull String id10, @NotNull @Query("types") List<String> types, @Query("labels") List<String> labels);

    @GET("troubleshooting/suggestions")
    Object getTroubleshootingSuggestions(@NotNull Continuation<? super s> continuation);

    @DELETE("user/current")
    @NotNull
    efm.b terminateAccount();
}

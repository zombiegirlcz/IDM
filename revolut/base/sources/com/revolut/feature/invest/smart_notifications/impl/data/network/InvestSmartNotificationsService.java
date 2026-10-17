package com.revolut.feature.invest.smart_notifications.impl.data.network;

import j18.d;
import j18.n;
import java.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import l2l.a;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JF\u0010\f\u001a\u00020\u000b2\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H§@¢\u0006\u0004\b\f\u0010\rJP\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/invest/smart_notifications/impl/data/network/InvestSmartNotificationsService;", "", "", "Ll2l/a;", "assetsFilters", "", "limit", "Ljava/time/Instant;", "to", "Lj18/a;", "types", "Lj18/n;", "getFeed", "(Ljava/util/List;ILjava/time/Instant;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "ref", "getFeedByRef", "(Ljava/lang/String;Ljava/util/List;ILjava/time/Instant;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/Response;", "Lj18/d;", "getAirTip", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_invest_smart_notifications_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvestSmartNotificationsService {
    @GET("/trading/feed/{ref}/insight/relevant")
    Object getAirTip(@Path("ref") @NotNull String str, @NotNull Continuation<? super Response<d>> continuation);

    @GET("/trading/feed")
    Object getFeed(@NotNull @Query("assetsFilters") List<a> list, @Query("limit") int i, @Query("to") Instant instant, @NotNull @Query("types") List<j18.a> list2, @NotNull Continuation<n> continuation);

    @GET("/trading/feed/{ref}")
    Object getFeedByRef(@Path("ref") @NotNull String str, @NotNull @Query("assetsFilters") List<a> list, @Query("limit") int i, @Query("to") Instant instant, @NotNull @Query("types") List<j18.a> list2, @NotNull Continuation<n> continuation);
}

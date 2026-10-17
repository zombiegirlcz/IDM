package com.revolut.retail.feature_widgets.impl.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import t2l.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J8\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJ0\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00072\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature_widgets/impl/network/WidgetService;", "", "", "context", "modifiedSince", "exp", "Lretrofit2/Response;", "Lt2l/b;", "getWidgetSettings", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "settings", "", "putWidgetSettings", "(Ljava/lang/String;Lt2l/b;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_widgets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WidgetService {
    @GET("user/current/settings/feed/interactive/{context}")
    Object getWidgetSettings(@Path("context") @NotNull String str, @Header("If-Modified-Since") String str2, @Query("exp") String str3, @NotNull Continuation<? super Response<b>> continuation);

    @PUT("user/current/settings/feed/interactive/{context}")
    Object putWidgetSettings(@Path("context") @NotNull String str, @Body @NotNull b bVar, @Query("exp") String str2, @NotNull Continuation<? super Unit> continuation);
}

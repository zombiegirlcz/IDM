package com.revolut.feature.notification_centre.impl.data.retrofit.service;

import a79.a;
import a79.b;
import efm.d0;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J5\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/notification_centre/impl/data/retrofit/service/ArticleService;", "", "", "id", "", "params", "Lefm/d0;", "La79/b;", "getArticle", "(Ljava/lang/String;Ljava/util/Map;)Lefm/d0;", "La79/a;", "articleCallbackRequest", "Lefm/b;", "markArticleAsOpened", "(Ljava/lang/String;La79/a;)Lefm/b;", "feature_notification_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ArticleService {
    @GET("/articles/{id}")
    @NotNull
    d0<b> getArticle(@Path("id") @NotNull String id10, @QueryMap @NotNull Map<String, String> params);

    @POST("/articles/{id}/open")
    @NotNull
    efm.b markArticleAsOpened(@Path("id") @NotNull String id10, @Body @NotNull a articleCallbackRequest);
}

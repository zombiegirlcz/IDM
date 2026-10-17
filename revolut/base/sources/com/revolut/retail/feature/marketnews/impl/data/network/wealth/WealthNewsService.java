package com.revolut.retail.feature.marketnews.impl.data.network.wealth;

import efm.d0;
import h0k.c;
import h0k.f;
import java.util.List;
import kotlin.Metadata;
import l2l.a;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J1\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\t\u0010\nJ[\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00032\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\t\u0010\u0010Ja\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u00032\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u0003H'¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/data/network/wealth/WealthNewsService;", "", "", "", "keywords", "", "limit", "Lefm/d0;", "Lh0k/f;", "getWealthNews", "(Ljava/util/List;Ljava/lang/Integer;)Lefm/d0;", "assetType", "currency", "market", "publishedBefore", "publishedAfter", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lefm/d0;", "category", "Ll2l/a;", "assetsFilters", "getPersonalisedWealthNews", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lefm/d0;", "articleId", "Lh0k/c;", "getNewsArticle", "(Ljava/lang/String;)Lefm/d0;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WealthNewsService {
    @GET("/wealth/news/{articleId}")
    @NotNull
    d0<c> getNewsArticle(@Path("articleId") @NotNull String articleId);

    @GET("/wealth/news/{assetType}/personalised")
    @NotNull
    d0<f> getPersonalisedWealthNews(@Path("assetType") @NotNull String category, @Query("currency") String currency, @Query("assetsFilters") List<a> assetsFilters, @Query("publishedBefore") String publishedBefore, @Query("publishedAfter") String publishedAfter, @Query("limit") Integer limit);

    @GET("/wealth/news/{assetType}")
    @NotNull
    d0<f> getWealthNews(@Path("assetType") @NotNull String assetType, @Query("currency") String currency, @Query("market") String market, @Query("publishedBefore") String publishedBefore, @Query("publishedAfter") String publishedAfter, @Query("limit") Integer limit);

    @GET("/wealth/news")
    @NotNull
    d0<f> getWealthNews(@NotNull @Query("keywords") List<String> keywords, @Query("limit") Integer limit);
}

package com.revolut.data.network.services;

import com.revolut.data.network.models.news.NewsItemDto;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b`\u0018\u0000 \r2\u00020\u0001:\u0001\u000eJ%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H'¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\b¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/data/network/services/NewsService;", "", "", "scope", "Lefm/d0;", "", "Lcom/revolut/data/network/models/news/NewsItemDto;", "getNews", "(Ljava/lang/String;)Lefm/d0;", "getIncidentNews", "()Lefm/d0;", "id", "getNewsById", "Companion", "a", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface NewsService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f60250a;

    /* JADX INFO: renamed from: com.revolut.data.network.services.NewsService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f60250a = new Companion();

        private Companion() {
        }
    }

    @GET("/news/incidents")
    @NotNull
    d0<List<NewsItemDto>> getIncidentNews();

    @GET("/news")
    @NotNull
    d0<List<NewsItemDto>> getNews(@NotNull @Query("scope") String scope);

    @GET("/news/{id}")
    @NotNull
    d0<NewsItemDto> getNewsById(@Path("id") @NotNull String id10);
}

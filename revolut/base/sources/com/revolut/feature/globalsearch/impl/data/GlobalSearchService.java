package com.revolut.feature.globalsearch.impl.data;

import c97.c;
import c97.e;
import c97.k;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0001\u0010\n\u001a\u00020\u0006H§@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0005¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/globalsearch/impl/data/GlobalSearchService;", "", "", "Lc97/c;", "getSearchPreferences", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "query", "", "types", "context", "Lc97/e;", "search", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lc97/k;", "getGlobalSearchSettings", "feature_global_search_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface GlobalSearchService {
    @GET("/global-search/settings")
    Object getGlobalSearchSettings(@NotNull Continuation<? super k> continuation);

    @GET("/user/current/global-search/v2/preferences")
    Object getSearchPreferences(@NotNull Continuation<? super List<c>> continuation);

    @GET("global-search")
    Object search(@NotNull @Query("query") String str, @NotNull @Query("type") Set<String> set, @NotNull @Query("context") String str2, @NotNull Continuation<? super e> continuation);
}

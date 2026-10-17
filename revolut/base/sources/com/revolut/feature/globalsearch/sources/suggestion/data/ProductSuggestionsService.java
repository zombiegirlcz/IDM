package com.revolut.feature.globalsearch.sources.suggestion.data;

import ea7.b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\u00020\u00072\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/globalsearch/sources/suggestion/data/ProductSuggestionsService;", "", "", "", "contexts", "", "limitPerContext", "Lea7/b;", "getProductSuggestions", "(Ljava/util/Set;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_global_search_sources_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ProductSuggestionsService {
    @GET("/global-search/suggestions/products")
    Object getProductSuggestions(@NotNull @Query("context") Set<String> set, @Query("limitPerContext") int i, @NotNull Continuation<? super b> continuation);
}

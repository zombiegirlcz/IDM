package com.revolut.feature.category_boost.impl.data.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import re3.g;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/category_boost/impl/data/service/CategoryBoostService;", "", "Lre3/g;", "getBoosts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_category_boost_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CategoryBoostService {
    @GET("user/current/category-boosts")
    Object getBoosts(@NotNull Continuation<? super g> continuation);
}

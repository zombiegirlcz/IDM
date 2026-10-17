package com.revolut.core.faq.data.network;

import dg0.a;
import dg0.b;
import dg0.c;
import dg0.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006J\u001a\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/faq/data/network/AiSearchService;", "", "Ldg0/b;", "request", "Ldg0/c;", "requestSearch", "(Ldg0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldg0/a;", "getCompletions", "", "searchRequestId", "Ldg0/d;", "getSearchResults", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AiSearchService {
    @POST("support/ai-search/completions")
    Object getCompletions(@Body @NotNull b bVar, @NotNull Continuation<? super a> continuation);

    @GET("support/ai-search/{searchRequestId}")
    Object getSearchResults(@Path("searchRequestId") @NotNull String str, @NotNull Continuation<? super d> continuation);

    @POST("support/ai-search")
    Object requestSearch(@Body @NotNull b bVar, @NotNull Continuation<? super c> continuation);
}

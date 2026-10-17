package com.revolut.core.faq.data.network;

import cg0.e;
import cg0.f;
import cg0.k;
import cg0.m;
import cg0.o;
import efm.d0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JC\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H'¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u00062\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H'¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0002H'¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u001b\u001a\u00020\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00022\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0002H'¢\u0006\u0004\b\u001e\u0010\u0018J0\u0010\u001f\u001a\u00020\u001d2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00022\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0019H§@¢\u0006\u0004\b\u001f\u0010\u001c¨\u0006 À\u0006\u0003"}, d2 = {"Lcom/revolut/core/faq/data/network/FaqService;", "", "", "scope", "", "headers", "Lefm/d0;", "Lretrofit2/Response;", "", "Lcg0/f;", "getFaqScoped", "(Ljava/lang/String;Ljava/util/Map;)Lefm/d0;", "key", "Lcg0/k;", "getFaqArticleByKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lefm/d0;", "Lcg0/e;", "count", "", "postFaqCount", "(Ljava/lang/String;Lcg0/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userInput", "Lcg0/o;", "getScopedSearchSuggestedCompletions", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "", "limit", "getScopedSearchSuggestedCompletionsSuspended", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcg0/m;", "getScopedSearchFaqs", "getScopedSearchFaqsSuspended", "core_faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FaqService {
    @GET("support/faq/{scope}/{key}")
    @NotNull
    d0<Response<k>> getFaqArticleByKey(@Path(encoded = true, value = "key") @NotNull String key, @Path(encoded = true, value = "scope") @NotNull String scope, @HeaderMap @NotNull Map<String, String> headers);

    @GET("support/faq/{scope}")
    @NotNull
    d0<Response<List<f>>> getFaqScoped(@Path(encoded = true, value = "scope") @NotNull String scope, @HeaderMap @NotNull Map<String, String> headers);

    @GET("support/faq-search/{scope}")
    @NotNull
    d0<Response<m>> getScopedSearchFaqs(@Path(encoded = true, value = "scope") @NotNull String scope, @NotNull @Query("user_input") String userInput);

    @GET("support/faq-search/{scope}")
    Object getScopedSearchFaqsSuspended(@Path(encoded = true, value = "scope") @NotNull String str, @NotNull @Query("user_input") String str2, @Query("limit") Integer num, @NotNull Continuation<? super m> continuation);

    @GET("support/faq-search-completion/{scope}")
    @NotNull
    d0<o> getScopedSearchSuggestedCompletions(@Path(encoded = true, value = "scope") @NotNull String scope, @NotNull @Query("user_input") String userInput);

    @GET("support/faq-search-completion/{scope}")
    Object getScopedSearchSuggestedCompletionsSuspended(@Path(encoded = true, value = "scope") @NotNull String str, @NotNull @Query("user_input") String str2, @Query("limit") Integer num, @NotNull Continuation<? super o> continuation);

    @POST("support/faq/{scope}/count")
    Object postFaqCount(@Path(encoded = true, value = "scope") @NotNull String str, @Body @NotNull e eVar, @NotNull Continuation<? super Unit> continuation);
}

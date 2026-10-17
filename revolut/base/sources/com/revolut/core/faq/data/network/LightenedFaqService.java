package com.revolut.core.faq.data.network;

import cg0.k;
import cg0.y;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JB\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0016\b\u0001\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ>\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0016\b\u0001\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/faq/data/network/LightenedFaqService;", "", "", "key", "scope", "", "headers", "Lretrofit2/Response;", "Lcg0/k;", "getFaqArticleByKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcg0/y;", "getFaqTreeLight", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LightenedFaqService {
    @GET("support/faq/{scope}/{key}")
    Object getFaqArticleByKey(@Path(encoded = true, value = "key") @NotNull String str, @Path(encoded = true, value = "scope") @NotNull String str2, @HeaderMap @NotNull Map<String, String> map, @NotNull Continuation<? super Response<k>> continuation);

    @GET("support/faq-tree/v1/{scope}")
    Object getFaqTreeLight(@Path(encoded = true, value = "scope") @NotNull String str, @HeaderMap @NotNull Map<String, String> map, @NotNull Continuation<? super Response<List<y>>> continuation);
}

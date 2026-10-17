package com.revolut.shared.feature.wealth.domain.impl.data.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ldl.a;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J:\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u00062\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/wealth/domain/impl/data/network/PerformanceParametersService;", "", "", "", "portfolioIds", "ifModifiedSince", "Lretrofit2/Response;", "Lldl/a;", "getPerformanceParameters", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PerformanceParametersService {
    @GET("trading/users/current/performance-parameters")
    Object getPerformanceParameters(@Query("portfolioId") List<String> list, @Header("If-Modified-Since") String str, @NotNull Continuation<? super Response<List<a>>> continuation);
}

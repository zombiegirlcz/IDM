package com.revolut.feature.robo.impl.data.network;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import tlc.a;
import vlc.b;
import vlc.d;
import vlc.e;
import vlc.r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\n\u0010\bJ'\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\f\u0010\bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\bJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\bJ?\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H'¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u00012\b\b\u0001\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001e\u0010\u001bJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00052\b\b\u0001\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b \u0010\u001bJ5\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\"\u0010#¨\u0006$À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/robo/impl/data/network/TemplateService;", "", "", "portfolioId", "Lefm/d0;", "", "Lvlc/d;", "getTemplatesByPortfolio", "(Ljava/lang/String;)Lefm/d0;", "accountId", "getTemplatesByAccount", "availableAccountId", "getTemplatesByAvailableAccount", "templateId", "getTemplate", "Lvlc/e;", "getTemplateProjection", "Lvlc/r;", "timeSpan", "benchmark", "", "ignoreEffectiveTimeSpan", "Lvlc/b;", "getTemplatePerformance", "(Ljava/lang/String;Lvlc/r;Ljava/lang/String;Z)Lefm/d0;", "Lulc/a;", "getTemplateRiskMetrics", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTemplatesStats", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTemplateStats", "Ltlc/a;", "getTemplateBenchmarks", "Lvlc/a;", "getTemplateDrawdown", "(Ljava/lang/String;Lvlc/r;Ljava/lang/String;)Lefm/d0;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TemplateService {
    @GET("trading/robo/templates/{templateId}")
    @NotNull
    d0<d> getTemplate(@Path("templateId") @NotNull String templateId);

    @GET("trading/robo/templates/{templateId}/benchmarks")
    Object getTemplateBenchmarks(@Path("templateId") @NotNull String str, @NotNull Continuation<? super List<a>> continuation);

    @GET("trading/robo/templates/{templateId}/drawdown/{timeSpan}")
    @NotNull
    d0<vlc.a> getTemplateDrawdown(@Path("templateId") @NotNull String templateId, @Path("timeSpan") @NotNull r timeSpan, @Query("benchmark") String benchmark);

    @GET("trading/robo/templates/{templateId}/performance/{timeSpan}")
    @NotNull
    d0<b> getTemplatePerformance(@Path("templateId") @NotNull String templateId, @Path("timeSpan") @NotNull r timeSpan, @Query("benchmark") String benchmark, @Query("ignoreEffectiveTimeSpan") boolean ignoreEffectiveTimeSpan);

    @GET("trading/robo/templates/{templateId}/projection")
    @NotNull
    d0<e> getTemplateProjection(@Path("templateId") @NotNull String templateId);

    @GET("trading/robo/templates/{templateId}/risk-metrics")
    Object getTemplateRiskMetrics(@Path("templateId") @NotNull String str, @NotNull Continuation<? super ulc.a> continuation);

    @GET("trading/robo/templates/{templateId}/stats")
    Object getTemplateStats(@Path("templateId") @NotNull String str, @NotNull Continuation<Object> continuation);

    @GET("trading/robo/templates")
    @NotNull
    d0<List<d>> getTemplatesByAccount(@Query("accountId") String accountId);

    @GET("trading/robo/templates")
    @NotNull
    d0<List<d>> getTemplatesByAvailableAccount(@Query("availableAccountId") String availableAccountId);

    @GET("trading/robo/templates")
    @NotNull
    d0<List<d>> getTemplatesByPortfolio(@Query("portfolioId") String portfolioId);

    @GET("trading/robo/templates/stats")
    Object getTemplatesStats(@Query("accountId") String str, @Query("availableAccountId") String str2, @NotNull Continuation<? super List<Object>> continuation);
}

package com.onfido.android.sdk.capture.internal.performance.repository;

import a09.r;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.AnalyticsRepository;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalyticsMapper;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsEvent;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.network.AnalyticsRequest;
import com.onfido.android.sdk.capture.network.error.ErrorHandler;
import igm.o;
import io.reactivex.rxjava3.core.Completable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ogm.a;
import org.jetbrains.annotations.NotNull;
import tgm.b;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/performance/repository/PerformanceAnalyticsRepository;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/AnalyticsRepository;", "performanceAnalyticsApi", "Lcom/onfido/android/sdk/capture/internal/performance/repository/PerformanceAnalyticsApi;", "onfidoAnalyticsMapper", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalyticsMapper;", "errorHandler", "Lcom/onfido/android/sdk/capture/network/error/ErrorHandler;", "(Lcom/onfido/android/sdk/capture/internal/performance/repository/PerformanceAnalyticsApi;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalyticsMapper;Lcom/onfido/android/sdk/capture/network/error/ErrorHandler;)V", "track", "Lio/reactivex/rxjava3/core/Completable;", "event", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PerformanceAnalyticsRepository implements AnalyticsRepository {

    @NotNull
    private final ErrorHandler errorHandler;

    @NotNull
    private final OnfidoAnalyticsMapper onfidoAnalyticsMapper;

    @NotNull
    private final PerformanceAnalyticsApi performanceAnalyticsApi;

    public PerformanceAnalyticsRepository(@NotNull PerformanceAnalyticsApi performanceAnalyticsApi, @NotNull OnfidoAnalyticsMapper onfidoAnalyticsMapper, @NotNull ErrorHandler errorHandler) {
        Intrinsics.checkNotNullParameter(performanceAnalyticsApi, "performanceAnalyticsApi");
        Intrinsics.checkNotNullParameter(onfidoAnalyticsMapper, "onfidoAnalyticsMapper");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        this.performanceAnalyticsApi = performanceAnalyticsApi;
        this.onfidoAnalyticsMapper = onfidoAnalyticsMapper;
        this.errorHandler = errorHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnalyticsRequest track$lambda$0(PerformanceAnalyticsRepository this$0, AnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "$event");
        return this$0.onfidoAnalyticsMapper.mapEventToRequest(event);
    }

    @Override // com.onfido.android.sdk.capture.internal.analytics.inhouse.AnalyticsRepository
    @NotNull
    public Completable track(@NotNull AnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        b bVar = new b(new r(this, event, 14), 3);
        final PerformanceAnalyticsApi performanceAnalyticsApi = this.performanceAnalyticsApi;
        Completable completableF = new a(bVar, new o() { // from class: com.onfido.android.sdk.capture.internal.performance.repository.PerformanceAnalyticsRepository.track.2
            @Override // igm.o
            @NotNull
            public final Completable apply(@NotNull AnalyticsRequest p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return performanceAnalyticsApi.track(p0);
            }
        }, 6).f(this.errorHandler.handleError());
        Intrinsics.checkNotNullExpressionValue(completableF, "compose(...)");
        return completableF;
    }
}

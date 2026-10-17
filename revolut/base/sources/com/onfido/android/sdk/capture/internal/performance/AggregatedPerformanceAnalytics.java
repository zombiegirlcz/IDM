package com.onfido.android.sdk.capture.internal.performance;

import android.content.Context;
import com.onfido.android.sdk.capture.common.di.qualifier.ApplicationContext;
import com.onfido.android.sdk.capture.internal.performance.domain.PerformanceEvent;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/performance/AggregatedPerformanceAnalytics;", "Lcom/onfido/android/sdk/capture/internal/performance/PerformanceAnalytics;", "performanceAnalyticsImpl", "Lcom/onfido/android/sdk/capture/internal/performance/PerformanceAnalyticsImpl;", "context", "Landroid/content/Context;", "(Lcom/onfido/android/sdk/capture/internal/performance/PerformanceAnalyticsImpl;Landroid/content/Context;)V", "analytics", "", "firebasePerformanceAnalytics", "clearEvents", "", "trackEnd", "endEvent", "Lcom/onfido/android/sdk/capture/internal/performance/domain/PerformanceEvent;", "trackStart", "startEvent", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AggregatedPerformanceAnalytics implements PerformanceAnalytics {

    @NotNull
    private final List<PerformanceAnalytics> analytics;
    private final PerformanceAnalytics firebasePerformanceAnalytics;

    public AggregatedPerformanceAnalytics(@NotNull PerformanceAnalyticsImpl performanceAnalyticsImpl, @ApplicationContext @NotNull Context context) {
        Intrinsics.checkNotNullParameter(performanceAnalyticsImpl, "performanceAnalyticsImpl");
        Intrinsics.checkNotNullParameter(context, "context");
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(PerformanceAnalytics.class, context.getClassLoader());
        Intrinsics.checkNotNullExpressionValue(serviceLoaderLoad, "load(...)");
        PerformanceAnalytics performanceAnalytics = (PerformanceAnalytics) d0.c0(serviceLoaderLoad);
        this.firebasePerformanceAnalytics = performanceAnalytics;
        PerformanceAnalytics[] elements = {performanceAnalyticsImpl, performanceAnalytics};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.analytics = d.L(elements);
    }

    @Override // com.onfido.android.sdk.capture.internal.performance.PerformanceAnalytics
    public void clearEvents() {
        Iterator<T> it8 = this.analytics.iterator();
        while (it8.hasNext()) {
            ((PerformanceAnalytics) it8.next()).clearEvents();
        }
    }

    @Override // com.onfido.android.sdk.capture.internal.performance.PerformanceAnalytics
    public void trackEnd(@NotNull PerformanceEvent endEvent) {
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        Iterator<T> it8 = this.analytics.iterator();
        while (it8.hasNext()) {
            ((PerformanceAnalytics) it8.next()).trackEnd(endEvent);
        }
    }

    @Override // com.onfido.android.sdk.capture.internal.performance.PerformanceAnalytics
    public void trackStart(@NotNull PerformanceEvent startEvent) {
        Intrinsics.checkNotNullParameter(startEvent, "startEvent");
        Iterator<T> it8 = this.analytics.iterator();
        while (it8.hasNext()) {
            ((PerformanceAnalytics) it8.next()).trackStart(startEvent);
        }
    }
}

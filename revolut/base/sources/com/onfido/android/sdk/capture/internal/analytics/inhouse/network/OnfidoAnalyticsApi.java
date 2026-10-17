package com.onfido.android.sdk.capture.internal.analytics.inhouse.network;

import al.a;
import io.reactivex.rxjava3.core.Completable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/OnfidoAnalyticsApi;", "", "track", "Lio/reactivex/rxjava3/core/Completable;", "request", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/AnalyticsRequest;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface OnfidoAnalyticsApi {
    @POST("/analytics")
    @a(version = "v4")
    @NotNull
    Completable track(@Body @NotNull AnalyticsRequest request);
}

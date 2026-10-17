package com.onfido.android.sdk.capture.internal.util.logging.network;

import al.a;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/logging/network/OnfidoLoggerApi;", "", "log", "Lio/reactivex/rxjava3/core/Single;", "Lcom/onfido/android/sdk/capture/internal/util/logging/network/LoggerResponse;", "request", "Lcom/onfido/android/sdk/capture/internal/util/logging/network/LoggerRequest;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface OnfidoLoggerApi {
    @POST("/sdk/logger")
    @a(version = "v4")
    @NotNull
    Single<LoggerResponse> log(@Body @NotNull LoggerRequest request);
}

package com.onfido.android.sdk.capture.internal.util.logging;

import a09.r;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.internal.util.logging.network.LoggerRequest;
import com.onfido.android.sdk.capture.internal.util.logging.network.LoggerResponse;
import com.onfido.android.sdk.capture.internal.util.logging.network.OnfidoLoggerApi;
import com.onfido.android.sdk.capture.network.error.ErrorHandler;
import igm.o;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.core.SingleTransformer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kgm.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lgm.c;
import ogm.q;
import org.jetbrains.annotations.NotNull;
import pgm.o1;
import tgm.b;
import tgm.g;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0017\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0012J\u001d\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000fH\u0010¢\u0006\u0002\b\u0014J\u0016\u0010\u0015\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0012J\r\u0010\u0017\u001a\u00020\u0011H\u0010¢\u0006\u0002\b\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/logging/LoggerRepository;", "", "loggerApi", "Lcom/onfido/android/sdk/capture/internal/util/logging/network/OnfidoLoggerApi;", "onfidoLogMapper", "Lcom/onfido/android/sdk/capture/internal/util/logging/OnfidoLogMapper;", "errorHandler", "Lcom/onfido/android/sdk/capture/network/error/ErrorHandler;", "loggerCachingDataSource", "Lcom/onfido/android/sdk/capture/internal/util/logging/LoggerCachingDataSource;", "(Lcom/onfido/android/sdk/capture/internal/util/logging/network/OnfidoLoggerApi;Lcom/onfido/android/sdk/capture/internal/util/logging/OnfidoLogMapper;Lcom/onfido/android/sdk/capture/network/error/ErrorHandler;Lcom/onfido/android/sdk/capture/internal/util/logging/LoggerCachingDataSource;)V", "getLogBatches", "", "Lcom/onfido/android/sdk/capture/internal/util/logging/OnfidoRemoteLog;", "filterOutSmallSizeBatches", "", "log", "", "onfidoRemoteLog", "sendImmediately", "log$onfido_capture_sdk_core_release", "sendLogs", "logs", "submitLogs", "submitLogs$onfido_capture_sdk_core_release", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class LoggerRepository {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int DEFAULT_BATCH_LOGS_COUNT = 20;

    @Deprecated
    public static final long DEFAULT_RETRY_COUNT = 3;

    @NotNull
    private final ErrorHandler errorHandler;

    @NotNull
    private final OnfidoLoggerApi loggerApi;

    @NotNull
    private final LoggerCachingDataSource loggerCachingDataSource;

    @NotNull
    private final OnfidoLogMapper onfidoLogMapper;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/logging/LoggerRepository$Companion;", "", "()V", "DEFAULT_BATCH_LOGS_COUNT", "", "DEFAULT_RETRY_COUNT", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LoggerRepository(@NotNull OnfidoLoggerApi loggerApi, @NotNull OnfidoLogMapper onfidoLogMapper, @NotNull ErrorHandler errorHandler, @NotNull LoggerCachingDataSource loggerCachingDataSource) {
        Intrinsics.checkNotNullParameter(loggerApi, "loggerApi");
        Intrinsics.checkNotNullParameter(onfidoLogMapper, "onfidoLogMapper");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(loggerCachingDataSource, "loggerCachingDataSource");
        this.loggerApi = loggerApi;
        this.onfidoLogMapper = onfidoLogMapper;
        this.errorHandler = errorHandler;
        this.loggerCachingDataSource = loggerCachingDataSource;
    }

    private List<List<OnfidoRemoteLog>> getLogBatches(boolean filterOutSmallSizeBatches) {
        ArrayList arrayListS = d0.S(this.loggerCachingDataSource.getLogs(), 20);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : arrayListS) {
            List list = (List) obj2;
            if (!filterOutSmallSizeBatches || list.size() == 20) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    private void sendLogs(final List<OnfidoRemoteLog> logs) {
        this.loggerCachingDataSource.removeAll(logs);
        b bVar = new b(new r(this, logs, 16), 3);
        final OnfidoLoggerApi onfidoLoggerApi = this.loggerApi;
        g gVar = new g(bVar, new o() { // from class: com.onfido.android.sdk.capture.internal.util.logging.LoggerRepository.sendLogs.2
            @Override // igm.o
            @NotNull
            public final Single<LoggerResponse> apply(@NotNull LoggerRequest p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return onfidoLoggerApi.log(p0);
            }
        }, 0);
        SingleTransformer singleTransformerM3708handleError = this.errorHandler.m3708handleError();
        Objects.requireNonNull(singleTransformerM3708handleError, "transformer is null");
        SingleSource singleSourceA = singleTransformerM3708handleError.a(gVar);
        Objects.requireNonNull(singleSourceA, "source is null");
        Object bVar2 = singleSourceA instanceof Single ? (Single) singleSourceA : new b(singleSourceA, 4);
        new o1((bVar2 instanceof c ? ((c) bVar2).b() : new q(bVar2, 5)).h(j.f)).i(new igm.g() { // from class: com.onfido.android.sdk.capture.internal.util.logging.LoggerRepository.sendLogs.3
            @Override // igm.g
            public final void accept(@NotNull LoggerResponse it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
            }
        }, new igm.g() { // from class: com.onfido.android.sdk.capture.internal.util.logging.LoggerRepository.sendLogs.4
            @Override // igm.g
            public final void accept(@NotNull Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                if (!(error instanceof IOException)) {
                    Timber.INSTANCE.e(error);
                }
                LoggerRepository.this.loggerCachingDataSource.addAll(logs);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LoggerRequest sendLogs$lambda$3(LoggerRepository this$0, List logs) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(logs, "$logs");
        return this$0.onfidoLogMapper.mapLogToRequest(logs);
    }

    public synchronized void log$onfido_capture_sdk_core_release(@NotNull OnfidoRemoteLog onfidoRemoteLog, boolean sendImmediately) {
        try {
            Intrinsics.checkNotNullParameter(onfidoRemoteLog, "onfidoRemoteLog");
            if (sendImmediately) {
                sendLogs(u.c(onfidoRemoteLog));
            } else {
                this.loggerCachingDataSource.add(onfidoRemoteLog);
                Iterator<T> it8 = getLogBatches(true).iterator();
                while (it8.hasNext()) {
                    sendLogs((List) it8.next());
                }
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public void submitLogs$onfido_capture_sdk_core_release() {
        Iterator<T> it8 = getLogBatches(false).iterator();
        while (it8.hasNext()) {
            sendLogs((List) it8.next());
        }
    }
}

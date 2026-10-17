package com.onfido.android.sdk.capture.internal.util.logging;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&¨\u0006\u000b"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/logging/LoggerCachingDataSource;", "", "add", "", "log", "Lcom/onfido/android/sdk/capture/internal/util/logging/OnfidoRemoteLog;", "addAll", "logs", "", "getLogs", "removeAll", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LoggerCachingDataSource {
    void add(@NotNull OnfidoRemoteLog log2);

    void addAll(@NotNull List<OnfidoRemoteLog> logs);

    @NotNull
    List<OnfidoRemoteLog> getLogs();

    void removeAll(@NotNull List<OnfidoRemoteLog> logs);
}

package com.revolut.feature.alipay_plus.mpm.support;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u0010¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/support/APMPMLog;", "", "<init>", "()V", "emit", "", "handler", "Lcom/revolut/feature/alipay_plus/mpm/support/APMPMLogHandler;", "level", "Lcom/revolut/feature/alipay_plus/mpm/support/APMPMLogLevel;", "category", "Lcom/revolut/feature/alipay_plus/mpm/support/APMPMLogCategory;", "name", "", "message", "metadata", "", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMLog {

    @NotNull
    public static final APMPMLog INSTANCE = new APMPMLog();

    private APMPMLog() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void emit$default(APMPMLog aPMPMLog, APMPMLogHandler aPMPMLogHandler, APMPMLogLevel aPMPMLogLevel, APMPMLogCategory aPMPMLogCategory, String str, String str2, Map map, int i, Object obj2) {
        if ((i & 32) != 0) {
            map = r0.g();
        }
        aPMPMLog.emit(aPMPMLogHandler, aPMPMLogLevel, aPMPMLogCategory, str, str2, map);
    }

    public final void emit(APMPMLogHandler handler, @NotNull APMPMLogLevel level, @NotNull APMPMLogCategory category, @NotNull String name, @NotNull String message, @NotNull Map<String, String> metadata) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        if (handler != null) {
            handler.onLog(new APMPMLogEvent(level, category, name, message, metadata));
        }
    }
}

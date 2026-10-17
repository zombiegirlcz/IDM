package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJG\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\nJ1\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\nJ'\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\nR\u0014\u0010\u0016\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/appsflyer/internal/AFg1dSDK;", "Lcom/appsflyer/internal/AFg1cSDK;", "Lcom/appsflyer/internal/AFg1bSDK;", "p0", "", "p1", "", "p2", "", "d", "(Lcom/appsflyer/internal/AFg1bSDK;Ljava/lang/String;Z)V", "", "p3", "p4", "p5", "p6", "e", "(Lcom/appsflyer/internal/AFg1bSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1bSDK;Ljava/lang/String;)V", "i", "Lcom/appsflyer/AFLogger$LogLevel;", "AFKeystoreWrapper", "(Lcom/appsflyer/AFLogger$LogLevel;Lcom/appsflyer/internal/AFg1bSDK;Ljava/lang/String;Ljava/lang/Throwable;)V", "AFInAppEventParameterName", "(Lcom/appsflyer/AFLogger$LogLevel;)Z", "v", "w", "getShouldExtendMsg", "()Z", "<init>", "()V", "AFa1vSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AFg1dSDK extends AFg1cSDK {

    public /* synthetic */ class AFa1zSDK {
        public static final /* synthetic */ int[] AFInAppEventParameterName;

        static {
            int[] iArr = new int[AFLogger.LogLevel.values().length];
            iArr[AFLogger.LogLevel.DEBUG.ordinal()] = 1;
            iArr[AFLogger.LogLevel.INFO.ordinal()] = 2;
            iArr[AFLogger.LogLevel.WARNING.ordinal()] = 3;
            iArr[AFLogger.LogLevel.VERBOSE.ordinal()] = 4;
            iArr[AFLogger.LogLevel.ERROR.ordinal()] = 5;
            iArr[AFLogger.LogLevel.NONE.ordinal()] = 6;
            AFInAppEventParameterName = iArr;
        }
    }

    private static boolean AFInAppEventParameterName(AFLogger.LogLevel p0) {
        return p0.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    private final void AFKeystoreWrapper(AFLogger.LogLevel p0, AFg1bSDK p17, String p2, Throwable p3) {
        if (AFInAppEventParameterName(p0)) {
            AFInAppEventParameterName(p2, p17);
            int i = AFa1zSDK.AFInAppEventParameterName[p0.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4 || i != 5) {
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void d(@NotNull AFg1bSDK p0, @NotNull String p17, boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p17, "");
        AFKeystoreWrapper(AFLogger.LogLevel.DEBUG, p0, p17, null);
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void e(@NotNull AFg1bSDK p0, @NotNull String p17, @NotNull Throwable p2, boolean p3, boolean p42, boolean p510, boolean p66) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p17, "");
        Intrinsics.checkNotNullParameter(p2, "");
        if (p42) {
            AFKeystoreWrapper(AFLogger.LogLevel.ERROR, p0, p17, p2);
        } else if (p3) {
            AFKeystoreWrapper(AFLogger.LogLevel.DEBUG, p0, p17, null);
        }
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void force(@NotNull AFg1bSDK p0, @NotNull String p17) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p17, "");
        if (AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            return;
        }
        withTag$SDK_prodRelease(p17, p0);
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final boolean getShouldExtendMsg() {
        return AFLogger.LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void i(@NotNull AFg1bSDK p0, @NotNull String p17, boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p17, "");
        AFKeystoreWrapper(AFLogger.LogLevel.INFO, p0, p17, null);
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void v(@NotNull AFg1bSDK p0, @NotNull String p17, boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p17, "");
        AFKeystoreWrapper(AFLogger.LogLevel.VERBOSE, p0, p17, null);
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void w(@NotNull AFg1bSDK p0, @NotNull String p17, boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p17, "");
        AFKeystoreWrapper(AFLogger.LogLevel.WARNING, p0, p17, null);
    }
}

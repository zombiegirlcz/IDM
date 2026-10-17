package com.appsflyer.internal;

import ch.qos.logback.core.net.SyslogConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0017\b&\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJO\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0014\u0010\nJ)\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0015\u0010\nJ)\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0016\u0010\nJ\u001d\u0010\u0018\u001a\u00020\u0004*\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0002H\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u0004*\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u00068\u0017X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/appsflyer/internal/AFg1cSDK;", "", "Lcom/appsflyer/internal/AFg1bSDK;", "tag", "", "msg", "", "shouldRemoteDebug", "", "d", "(Lcom/appsflyer/internal/AFg1bSDK;Ljava/lang/String;Z)V", "", "throwable", "printMsg", "printThrowable", "shouldReportToExManager", "e", "(Lcom/appsflyer/internal/AFg1bSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1bSDK;Ljava/lang/String;)V", "i", "v", "w", "p0", "AFInAppEventParameterName", "(Ljava/lang/String;Lcom/appsflyer/internal/AFg1bSDK;)Ljava/lang/String;", "withTag$SDK_prodRelease", "values", "Z", "getShouldExtendMsg", "()Z", "shouldExtendMsg", "<init>", "()V", "AFa1zSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class AFg1cSDK {

    /* JADX INFO: renamed from: values, reason: from kotlin metadata */
    private final boolean shouldExtendMsg;
    public static long AFKeystoreWrapper = System.currentTimeMillis();

    public static /* synthetic */ void d$default(AFg1cSDK aFg1cSDK, AFg1bSDK aFg1bSDK, String str, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFg1cSDK.d(aFg1bSDK, str, z);
    }

    public static /* synthetic */ void e$default(AFg1cSDK aFg1cSDK, AFg1bSDK aFg1bSDK, String str, Throwable th10, boolean z, boolean z3, boolean z4, boolean z6, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            z3 = true;
        }
        if ((i & 32) != 0) {
            z4 = true;
        }
        if ((i & 64) != 0) {
            z6 = true;
        }
        aFg1cSDK.e(aFg1bSDK, str, th10, z, z3, z4, z6);
    }

    public static /* synthetic */ void i$default(AFg1cSDK aFg1cSDK, AFg1bSDK aFg1bSDK, String str, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFg1cSDK.i(aFg1bSDK, str, z);
    }

    public static /* synthetic */ void v$default(AFg1cSDK aFg1cSDK, AFg1bSDK aFg1bSDK, String str, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFg1cSDK.v(aFg1bSDK, str, z);
    }

    public static /* synthetic */ void w$default(AFg1cSDK aFg1cSDK, AFg1bSDK aFg1bSDK, String str, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFg1cSDK.w(aFg1bSDK, str, z);
    }

    @NotNull
    public final String AFInAppEventParameterName(String str, @NotNull AFg1bSDK aFg1bSDK) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        if (str == null || d0.W(str)) {
            str = "null";
        }
        String strWithTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFg1bSDK);
        if (!getShouldExtendMsg()) {
            return strWithTag$SDK_prodRelease;
        }
        StringBuilder sb6 = new StringBuilder("(");
        sb6.append(System.currentTimeMillis() - AFKeystoreWrapper);
        sb6.append(") [");
        sb6.append(Thread.currentThread().getName());
        sb6.append("] ");
        sb6.append(strWithTag$SDK_prodRelease);
        return sb6.toString();
    }

    public final void d(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        d$default(this, aFg1bSDK, str, false, 4, null);
    }

    public final void e(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, @NotNull Throwable th10) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th10, "");
        e$default(this, aFg1bSDK, str, th10, false, false, false, false, SyslogConstants.LOG_CLOCK, null);
    }

    public void force(@NotNull AFg1bSDK tag2, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag2, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    public final void i(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        i$default(this, aFg1bSDK, str, false, 4, null);
    }

    public final void v(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        v$default(this, aFg1bSDK, str, false, 4, null);
    }

    public final void w(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        w$default(this, aFg1bSDK, str, false, 4, null);
    }

    @NotNull
    public final String withTag$SDK_prodRelease(@NotNull String str, @NotNull AFg1bSDK aFg1bSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        StringBuilder sb6 = new StringBuilder("[");
        sb6.append(aFg1bSDK.AFKeystoreWrapper);
        sb6.append("] ");
        sb6.append(str);
        return sb6.toString();
    }

    public void d(@NotNull AFg1bSDK tag2, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag2, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public final void e(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, @NotNull Throwable th10, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th10, "");
        e$default(this, aFg1bSDK, str, th10, z, false, false, false, 112, null);
    }

    public void i(@NotNull AFg1bSDK tag2, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag2, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public void v(@NotNull AFg1bSDK tag2, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag2, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public void w(@NotNull AFg1bSDK tag2, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag2, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public final void e(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, @NotNull Throwable th10, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th10, "");
        e$default(this, aFg1bSDK, str, th10, z, z3, false, false, 96, null);
    }

    public final void e(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, @NotNull Throwable th10, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th10, "");
        e$default(this, aFg1bSDK, str, th10, z, z3, z4, false, 64, null);
    }

    public void e(@NotNull AFg1bSDK tag2, @NotNull String msg, @NotNull Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag2, "");
        Intrinsics.checkNotNullParameter(msg, "");
        Intrinsics.checkNotNullParameter(throwable, "");
    }
}

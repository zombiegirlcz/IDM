package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import yhm.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u001b\u0010\f\u001a\u00020\u00058GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\n\u0010\u0007R\u001b\u0010\r\u001a\u00020\u00058GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0007R\u0014\u0010\u0006\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFg1tSDK;", "", "", "values", "()J", "", "valueOf", "()Z", "Lcom/appsflyer/internal/AFd1sSDK;", "Lcom/appsflyer/internal/AFd1sSDK;", "AFKeystoreWrapper", "Lkotlin/Lazy;", "AFInAppEventParameterName", "AFInAppEventType", "Lcom/appsflyer/internal/AFg1sSDK;", "Lcom/appsflyer/internal/AFg1sSDK;", "p0", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1sSDK;Lcom/appsflyer/internal/AFg1sSDK;)V", "AFa1tSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AFg1tSDK {

    /* JADX INFO: renamed from: AFInAppEventType, reason: from kotlin metadata */
    @NotNull
    private final AFg1sSDK valueOf;

    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    private final Lazy AFInAppEventType;

    /* JADX INFO: renamed from: valueOf, reason: from kotlin metadata */
    @NotNull
    private final Lazy AFInAppEventParameterName;

    /* JADX INFO: renamed from: values, reason: from kotlin metadata */
    @NotNull
    private final AFd1sSDK AFKeystoreWrapper;
    private static final long AFInAppEventParameterName = TimeUnit.HOURS.toSeconds(24);

    /* JADX INFO: renamed from: com.appsflyer.internal.AFg1tSDK$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "valueOf", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass4 extends u implements Function0<Boolean> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFg1tSDK.this.AFKeystoreWrapper.AFInAppEventType("com.appsflyer.rc.staging")));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFg1tSDK$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "values", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass5 extends u implements Function0<Boolean> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFg1tSDK.this.AFKeystoreWrapper.AFInAppEventType("com.appsflyer.rc.sandbox")));
        }
    }

    public AFg1tSDK(@NotNull AFd1sSDK aFd1sSDK, @NotNull AFg1sSDK aFg1sSDK) {
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFg1sSDK, "");
        this.AFKeystoreWrapper = aFd1sSDK;
        this.valueOf = aFg1sSDK;
        this.AFInAppEventParameterName = yhm.j.b(new AnonymousClass5());
        this.AFInAppEventType = yhm.j.b(new AnonymousClass4());
    }

    public final boolean AFInAppEventParameterName() {
        return ((Boolean) this.AFInAppEventType.getValue()).booleanValue();
    }

    public final boolean valueOf() {
        AFh1dSDK aFh1dSDK;
        AFh1aSDK aFh1aSDK = this.valueOf.AFKeystoreWrapper;
        if (aFh1aSDK == null) {
            AFg1cSDK.i$default(AFLogger.INSTANCE, AFg1bSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFh1hSDK aFh1hSDK = aFh1aSDK.AFInAppEventParameterName;
        boolean zAFInAppEventType = (aFh1hSDK == null || (aFh1dSDK = aFh1hSDK.values) == null) ? false : aFh1dSDK.AFInAppEventType();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AFg1sSDK aFg1sSDK = this.valueOf;
        return zAFInAppEventType || jCurrentTimeMillis - aFg1sSDK.valueOf > TimeUnit.SECONDS.toMillis(aFg1sSDK.values);
    }

    public final long values() {
        Object objA;
        String strAFInAppEventType = this.AFKeystoreWrapper.AFInAppEventType("com.appsflyer.rc.cache.max-age-fallback");
        if (strAFInAppEventType == null) {
            return AFInAppEventParameterName;
        }
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = Long.valueOf(Long.parseLong(strAFInAppEventType));
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            StringBuilder sb6 = new StringBuilder("Can't read maxAgeFallback from Manifest: ");
            sb6.append(thA.getMessage());
            AFLogger.afErrorLog(sb6.toString(), thA);
            objA = Long.valueOf(AFInAppEventParameterName);
        }
        return ((Number) objA).longValue();
    }

    public final boolean AFKeystoreWrapper() {
        return ((Boolean) this.AFInAppEventParameterName.getValue()).booleanValue();
    }
}

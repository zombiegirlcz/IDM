package com.revolut.feature.alipay_plus.mpm.model;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB#\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u000eB\u001b\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u000fJ\u0006\u0010\u0013\u001a\u00020\u0011J\u0010\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0005J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0005J\u0006\u0010\u0019\u001a\u00020\u0007J\u0013\u0010\u001a\u001a\u00020\u0005*\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010\u001bR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMRemoteConfiguration;", "", "storage", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMRemoteConfigurationStorage;", "refreshIntervalMillis", "", "marker", "", "<init>", "(Lcom/revolut/feature/alipay_plus/mpm/model/APMPMRemoteConfigurationStorage;JLkotlin/Unit;)V", "context", "Landroid/content/Context;", "cacheKeyPrefix", "", "(Landroid/content/Context;Ljava/lang/String;J)V", "(Lcom/revolut/feature/alipay_plus/mpm/model/APMPMRemoteConfigurationStorage;J)V", "cachedConfig", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMRemoteBasicConfig;", "lastUpdateMillis", "getConfig", "shouldUpdate", "", "nowMillis", "updateConfig", "config", "clearCache", "orZero", "(Ljava/lang/Long;)J", "Companion", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMRemoteConfiguration {
    public static final long DEFAULT_REFRESH_INTERVAL_MILLIS = 604800000;

    @NotNull
    private APMPMRemoteBasicConfig cachedConfig;
    private long lastUpdateMillis;
    private final long refreshIntervalMillis;
    private final APMPMRemoteConfigurationStorage storage;

    @NotNull
    public static final String DEFAULT_CACHE_KEY_PREFIX = "com.alipayplus.mpp.nonsdk.remoteconfig";

    private APMPMRemoteConfiguration(APMPMRemoteConfigurationStorage aPMPMRemoteConfigurationStorage, long j2, Unit unit) {
        this.storage = aPMPMRemoteConfigurationStorage;
        this.refreshIntervalMillis = j2;
        this.cachedConfig = new APMPMRemoteBasicConfig(null, null, null, null, 15, null);
    }

    private final long orZero(Long l2) {
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    public static /* synthetic */ boolean shouldUpdate$default(APMPMRemoteConfiguration aPMPMRemoteConfiguration, long j2, int i, Object obj2) {
        if ((i & 1) != 0) {
            j2 = System.currentTimeMillis();
        }
        return aPMPMRemoteConfiguration.shouldUpdate(j2);
    }

    public static /* synthetic */ void updateConfig$default(APMPMRemoteConfiguration aPMPMRemoteConfiguration, APMPMRemoteBasicConfig aPMPMRemoteBasicConfig, long j2, int i, Object obj2) {
        if ((i & 2) != 0) {
            j2 = System.currentTimeMillis();
        }
        aPMPMRemoteConfiguration.updateConfig(aPMPMRemoteBasicConfig, j2);
    }

    public final void clearCache() {
        this.cachedConfig = new APMPMRemoteBasicConfig(null, null, null, null, 15, null);
        this.lastUpdateMillis = 0L;
        APMPMRemoteConfigurationStorage aPMPMRemoteConfigurationStorage = this.storage;
        if (aPMPMRemoteConfigurationStorage != null) {
            aPMPMRemoteConfigurationStorage.clear();
        }
    }

    @NotNull
    public final APMPMRemoteBasicConfig getConfig() {
        APMPMRemoteBasicConfig config;
        APMPMRemoteConfigurationStorage aPMPMRemoteConfigurationStorage = this.storage;
        if (aPMPMRemoteConfigurationStorage == null || (config = aPMPMRemoteConfigurationStorage.readConfig()) == null) {
            return this.cachedConfig;
        }
        this.cachedConfig = config;
        return config;
    }

    public final boolean shouldUpdate(long nowMillis) {
        APMPMRemoteConfigurationStorage aPMPMRemoteConfigurationStorage = this.storage;
        long jOrZero = orZero(aPMPMRemoteConfigurationStorage != null ? Long.valueOf(aPMPMRemoteConfigurationStorage.readLastUpdateMillis()) : null);
        if (jOrZero <= 0) {
            jOrZero = this.lastUpdateMillis;
        }
        return jOrZero == 0 || nowMillis - jOrZero >= this.refreshIntervalMillis;
    }

    public final void updateConfig(@NotNull APMPMRemoteBasicConfig config, long nowMillis) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.cachedConfig = config;
        this.lastUpdateMillis = nowMillis;
        APMPMRemoteConfigurationStorage aPMPMRemoteConfigurationStorage = this.storage;
        if (aPMPMRemoteConfigurationStorage != null) {
            aPMPMRemoteConfigurationStorage.writeConfig(config, nowMillis);
        }
    }

    public /* synthetic */ APMPMRemoteConfiguration(Context context, String str, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : context, (i & 2) != 0 ? "com.alipayplus.mpp.nonsdk.remoteconfig" : str, (i & 4) != 0 ? 604800000L : j2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public APMPMRemoteConfiguration(Context context, @NotNull String cacheKeyPrefix, long j2) {
        Context applicationContext;
        Intrinsics.checkNotNullParameter(cacheKeyPrefix, "cacheKeyPrefix");
        this((context == null || (applicationContext = context.getApplicationContext()) == null) ? null : new SharedPreferencesRemoteConfigurationStorage(applicationContext, cacheKeyPrefix), j2, Unit.f186387a);
    }

    public /* synthetic */ APMPMRemoteConfiguration(APMPMRemoteConfigurationStorage aPMPMRemoteConfigurationStorage, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aPMPMRemoteConfigurationStorage, (i & 2) != 0 ? 604800000L : j2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public APMPMRemoteConfiguration(@NotNull APMPMRemoteConfigurationStorage storage, long j2) {
        this(storage, j2, Unit.f186387a);
        Intrinsics.checkNotNullParameter(storage, "storage");
    }
}

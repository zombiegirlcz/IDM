package com.revolut.feature.alipay_plus.mpm.model;

import a0.d;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/SharedPreferencesRemoteConfigurationStorage;", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMRemoteConfigurationStorage;", "context", "Landroid/content/Context;", "cacheKeyPrefix", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "preferences", "Landroid/content/SharedPreferences;", "cacheDataKey", "timestampKey", "readConfig", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMRemoteBasicConfig;", "readLastUpdateMillis", "", "writeConfig", "", "config", "nowMillis", "clear", "Companion", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class SharedPreferencesRemoteConfigurationStorage implements APMPMRemoteConfigurationStorage {

    @NotNull
    private final String cacheDataKey;

    @NotNull
    private final SharedPreferences preferences;

    @NotNull
    private final String timestampKey;

    @NotNull
    private static final String PREFERENCE_NAME = "apmpm_nonsdk_remote_configuration";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/SharedPreferencesRemoteConfigurationStorage$Companion;", "", "<init>", "()V", "PREFERENCE_NAME", "", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SharedPreferencesRemoteConfigurationStorage(@NotNull Context context, @NotNull String cacheKeyPrefix) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cacheKeyPrefix, "cacheKeyPrefix");
        SharedPreferences sharedPreferences = context.getSharedPreferences("apmpm_nonsdk_remote_configuration", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.preferences = sharedPreferences;
        this.cacheDataKey = d.r(cacheKeyPrefix, ".cache");
        this.timestampKey = d.r(cacheKeyPrefix, ".timestamp");
    }

    @Override // com.revolut.feature.alipay_plus.mpm.model.APMPMRemoteConfigurationStorage
    public void clear() {
        try {
            m.Companion companion = m.INSTANCE;
            this.preferences.edit().remove(this.cacheDataKey).remove(this.timestampKey).apply();
            Unit unit = Unit.f186387a;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            o.a(th10);
        }
    }

    @Override // com.revolut.feature.alipay_plus.mpm.model.APMPMRemoteConfigurationStorage
    public APMPMRemoteBasicConfig readConfig() {
        Object objA;
        Object objA2;
        try {
            m.Companion companion = m.INSTANCE;
            objA = this.preferences.getString(this.cacheDataKey, null);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        String str = (String) objA;
        if (str == null) {
            return null;
        }
        try {
            objA2 = APMPMRemoteBasicConfig.INSTANCE.fromJson(new JSONObject(str));
        } catch (Throwable th11) {
            m.Companion companion3 = m.INSTANCE;
            objA2 = o.a(th11);
        }
        return (APMPMRemoteBasicConfig) (objA2 instanceof n ? null : objA2);
    }

    @Override // com.revolut.feature.alipay_plus.mpm.model.APMPMRemoteConfigurationStorage
    public long readLastUpdateMillis() {
        Object objA;
        try {
            m.Companion companion = m.INSTANCE;
            objA = Long.valueOf(this.preferences.getLong(this.timestampKey, 0L));
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = 0L;
        }
        return ((Number) objA).longValue();
    }

    @Override // com.revolut.feature.alipay_plus.mpm.model.APMPMRemoteConfigurationStorage
    public void writeConfig(@NotNull APMPMRemoteBasicConfig config, long nowMillis) {
        Intrinsics.checkNotNullParameter(config, "config");
        try {
            m.Companion companion = m.INSTANCE;
            this.preferences.edit().putString(this.cacheDataKey, config.toJson().toString()).putLong(this.timestampKey, nowMillis).apply();
            Unit unit = Unit.f186387a;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            o.a(th10);
        }
    }
}

package com.revolut.feature.alipay_plus.mpm.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0007H&¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMRemoteConfigurationStorage;", "", "readConfig", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMRemoteBasicConfig;", "readLastUpdateMillis", "", "writeConfig", "", "config", "nowMillis", "clear", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface APMPMRemoteConfigurationStorage {
    void clear();

    APMPMRemoteBasicConfig readConfig();

    long readLastUpdateMillis();

    void writeConfig(@NotNull APMPMRemoteBasicConfig config, long nowMillis);
}

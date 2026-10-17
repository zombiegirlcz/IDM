package com.revolut.feature.alipay_plus.mpm.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMConfiguration;", "", "clientId", "", "envType", "siteName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "getEnvType", "getSiteName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class APMPMConfiguration {

    @NotNull
    private final String clientId;
    private final String envType;
    private final String siteName;

    public APMPMConfiguration(@NotNull String clientId, String str, String str2) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        this.clientId = clientId;
        this.envType = str;
        this.siteName = str2;
    }

    public static /* synthetic */ APMPMConfiguration copy$default(APMPMConfiguration aPMPMConfiguration, String str, String str2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = aPMPMConfiguration.clientId;
        }
        if ((i & 2) != 0) {
            str2 = aPMPMConfiguration.envType;
        }
        if ((i & 4) != 0) {
            str3 = aPMPMConfiguration.siteName;
        }
        return aPMPMConfiguration.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEnvType() {
        return this.envType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSiteName() {
        return this.siteName;
    }

    @NotNull
    public final APMPMConfiguration copy(@NotNull String clientId, String envType, String siteName) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        return new APMPMConfiguration(clientId, envType, siteName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APMPMConfiguration)) {
            return false;
        }
        APMPMConfiguration aPMPMConfiguration = (APMPMConfiguration) other;
        return Intrinsics.f(this.clientId, aPMPMConfiguration.clientId) && Intrinsics.f(this.envType, aPMPMConfiguration.envType) && Intrinsics.f(this.siteName, aPMPMConfiguration.siteName);
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    public final String getEnvType() {
        return this.envType;
    }

    public final String getSiteName() {
        return this.siteName;
    }

    public int hashCode() {
        int iHashCode = this.clientId.hashCode() * 31;
        String str = this.envType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.siteName;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ APMPMConfiguration(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}

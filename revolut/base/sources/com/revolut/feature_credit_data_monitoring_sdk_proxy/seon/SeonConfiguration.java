package com.revolut.feature_credit_data_monitoring_sdk_proxy.seon;

import android.content.Context;
import androidx.annotation.Keep;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/revolut/feature_credit_data_monitoring_sdk_proxy/seon/SeonConfiguration;", "", "sessionId", "", "context", "Landroid/content/Context;", "dnsTimeout", "", "isLoggingEnabled", "", "<init>", "(Ljava/lang/String;Landroid/content/Context;IZ)V", "getSessionId", "()Ljava/lang/String;", "getContext", "()Landroid/content/Context;", "getDnsTimeout", "()I", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "feature_credit_data_monitoring_sdk_proxy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SeonConfiguration {

    @NotNull
    private final Context context;
    private final int dnsTimeout;
    private final boolean isLoggingEnabled;

    @NotNull
    private final String sessionId;

    public SeonConfiguration(@NotNull String sessionId, @NotNull Context context, int i, boolean z) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(context, "context");
        this.sessionId = sessionId;
        this.context = context;
        this.dnsTimeout = i;
        this.isLoggingEnabled = z;
    }

    public static /* synthetic */ SeonConfiguration copy$default(SeonConfiguration seonConfiguration, String str, Context context, int i, boolean z, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = seonConfiguration.sessionId;
        }
        if ((i2 & 2) != 0) {
            context = seonConfiguration.context;
        }
        if ((i2 & 4) != 0) {
            i = seonConfiguration.dnsTimeout;
        }
        if ((i2 & 8) != 0) {
            z = seonConfiguration.isLoggingEnabled;
        }
        return seonConfiguration.copy(str, context, i, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDnsTimeout() {
        return this.dnsTimeout;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsLoggingEnabled() {
        return this.isLoggingEnabled;
    }

    @NotNull
    public final SeonConfiguration copy(@NotNull String sessionId, @NotNull Context context, int dnsTimeout, boolean isLoggingEnabled) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(context, "context");
        return new SeonConfiguration(sessionId, context, dnsTimeout, isLoggingEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeonConfiguration)) {
            return false;
        }
        SeonConfiguration seonConfiguration = (SeonConfiguration) other;
        return Intrinsics.f(this.sessionId, seonConfiguration.sessionId) && Intrinsics.f(this.context, seonConfiguration.context) && this.dnsTimeout == seonConfiguration.dnsTimeout && this.isLoggingEnabled == seonConfiguration.isLoggingEnabled;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final int getDnsTimeout() {
        return this.dnsTimeout;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLoggingEnabled) + a.b(this.dnsTimeout, (this.context.hashCode() + (this.sessionId.hashCode() * 31)) * 31, 31);
    }

    public final boolean isLoggingEnabled() {
        return this.isLoggingEnabled;
    }

    public /* synthetic */ SeonConfiguration(String str, Context context, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, context, (i2 & 4) != 0 ? 0 : i, z);
    }
}

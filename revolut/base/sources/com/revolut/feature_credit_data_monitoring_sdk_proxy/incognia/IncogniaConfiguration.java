package com.revolut.feature_credit_data_monitoring_sdk_proxy.incognia;

import android.content.Context;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006!"}, d2 = {"Lcom/revolut/feature_credit_data_monitoring_sdk_proxy/incognia/IncogniaConfiguration;", "", "incogniaApplicationId", "", "isLoggingEnabled", "", "context", "Landroid/content/Context;", "accountId", "countryCode", "creditApplicationId", "<init>", "(Ljava/lang/String;ZLandroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIncogniaApplicationId", "()Ljava/lang/String;", "()Z", "getContext", "()Landroid/content/Context;", "getAccountId", "getCountryCode", "getCreditApplicationId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature_credit_data_monitoring_sdk_proxy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncogniaConfiguration {

    @NotNull
    private final String accountId;

    @NotNull
    private final Context context;

    @NotNull
    private final String countryCode;

    @NotNull
    private final String creditApplicationId;

    @NotNull
    private final String incogniaApplicationId;
    private final boolean isLoggingEnabled;

    public IncogniaConfiguration(@NotNull String incogniaApplicationId, boolean z, @NotNull Context context, @NotNull String accountId, @NotNull String countryCode, @NotNull String creditApplicationId) {
        Intrinsics.checkNotNullParameter(incogniaApplicationId, "incogniaApplicationId");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(creditApplicationId, "creditApplicationId");
        this.incogniaApplicationId = incogniaApplicationId;
        this.isLoggingEnabled = z;
        this.context = context;
        this.accountId = accountId;
        this.countryCode = countryCode;
        this.creditApplicationId = creditApplicationId;
    }

    public static /* synthetic */ IncogniaConfiguration copy$default(IncogniaConfiguration incogniaConfiguration, String str, boolean z, Context context, String str2, String str3, String str4, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = incogniaConfiguration.incogniaApplicationId;
        }
        if ((i & 2) != 0) {
            z = incogniaConfiguration.isLoggingEnabled;
        }
        if ((i & 4) != 0) {
            context = incogniaConfiguration.context;
        }
        if ((i & 8) != 0) {
            str2 = incogniaConfiguration.accountId;
        }
        if ((i & 16) != 0) {
            str3 = incogniaConfiguration.countryCode;
        }
        if ((i & 32) != 0) {
            str4 = incogniaConfiguration.creditApplicationId;
        }
        String str5 = str3;
        String str6 = str4;
        return incogniaConfiguration.copy(str, z, context, str2, str5, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIncogniaApplicationId() {
        return this.incogniaApplicationId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsLoggingEnabled() {
        return this.isLoggingEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCreditApplicationId() {
        return this.creditApplicationId;
    }

    @NotNull
    public final IncogniaConfiguration copy(@NotNull String incogniaApplicationId, boolean isLoggingEnabled, @NotNull Context context, @NotNull String accountId, @NotNull String countryCode, @NotNull String creditApplicationId) {
        Intrinsics.checkNotNullParameter(incogniaApplicationId, "incogniaApplicationId");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(creditApplicationId, "creditApplicationId");
        return new IncogniaConfiguration(incogniaApplicationId, isLoggingEnabled, context, accountId, countryCode, creditApplicationId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncogniaConfiguration)) {
            return false;
        }
        IncogniaConfiguration incogniaConfiguration = (IncogniaConfiguration) other;
        return Intrinsics.f(this.incogniaApplicationId, incogniaConfiguration.incogniaApplicationId) && this.isLoggingEnabled == incogniaConfiguration.isLoggingEnabled && Intrinsics.f(this.context, incogniaConfiguration.context) && Intrinsics.f(this.accountId, incogniaConfiguration.accountId) && Intrinsics.f(this.countryCode, incogniaConfiguration.countryCode) && Intrinsics.f(this.creditApplicationId, incogniaConfiguration.creditApplicationId);
    }

    @NotNull
    public final String getAccountId() {
        return this.accountId;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getCreditApplicationId() {
        return this.creditApplicationId;
    }

    @NotNull
    public final String getIncogniaApplicationId() {
        return this.incogniaApplicationId;
    }

    public int hashCode() {
        return this.creditApplicationId.hashCode() + a.c(a.c((this.context.hashCode() + j6.a.c(this.incogniaApplicationId.hashCode() * 31, 31, this.isLoggingEnabled)) * 31, 31, this.accountId), 31, this.countryCode);
    }

    public final boolean isLoggingEnabled() {
        return this.isLoggingEnabled;
    }
}

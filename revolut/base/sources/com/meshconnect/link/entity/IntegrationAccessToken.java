package com.meshconnect.link.entity;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/meshconnect/link/entity/IntegrationAccessToken;", "", "accountId", "", "accountName", "accessToken", "brokerType", "brokerName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/String;", "getAccountName", "getAccessToken", "getBrokerType", "getBrokerName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class IntegrationAccessToken {

    @NotNull
    private final String accessToken;

    @NotNull
    private final String accountId;

    @NotNull
    private final String accountName;

    @NotNull
    private final String brokerName;

    @NotNull
    private final String brokerType;

    public IntegrationAccessToken(@NotNull String accountId, @NotNull String accountName, @NotNull String accessToken, @NotNull String brokerType, @NotNull String brokerName) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(brokerType, "brokerType");
        Intrinsics.checkNotNullParameter(brokerName, "brokerName");
        this.accountId = accountId;
        this.accountName = accountName;
        this.accessToken = accessToken;
        this.brokerType = brokerType;
        this.brokerName = brokerName;
    }

    public static /* synthetic */ IntegrationAccessToken copy$default(IntegrationAccessToken integrationAccessToken, String str, String str2, String str3, String str4, String str5, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = integrationAccessToken.accountId;
        }
        if ((i & 2) != 0) {
            str2 = integrationAccessToken.accountName;
        }
        if ((i & 4) != 0) {
            str3 = integrationAccessToken.accessToken;
        }
        if ((i & 8) != 0) {
            str4 = integrationAccessToken.brokerType;
        }
        if ((i & 16) != 0) {
            str5 = integrationAccessToken.brokerName;
        }
        String str6 = str5;
        String str7 = str3;
        return integrationAccessToken.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBrokerType() {
        return this.brokerType;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBrokerName() {
        return this.brokerName;
    }

    @NotNull
    public final IntegrationAccessToken copy(@NotNull String accountId, @NotNull String accountName, @NotNull String accessToken, @NotNull String brokerType, @NotNull String brokerName) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(brokerType, "brokerType");
        Intrinsics.checkNotNullParameter(brokerName, "brokerName");
        return new IntegrationAccessToken(accountId, accountName, accessToken, brokerType, brokerName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntegrationAccessToken)) {
            return false;
        }
        IntegrationAccessToken integrationAccessToken = (IntegrationAccessToken) other;
        return Intrinsics.f(this.accountId, integrationAccessToken.accountId) && Intrinsics.f(this.accountName, integrationAccessToken.accountName) && Intrinsics.f(this.accessToken, integrationAccessToken.accessToken) && Intrinsics.f(this.brokerType, integrationAccessToken.brokerType) && Intrinsics.f(this.brokerName, integrationAccessToken.brokerName);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    public final String getAccountId() {
        return this.accountId;
    }

    @NotNull
    public final String getAccountName() {
        return this.accountName;
    }

    @NotNull
    public final String getBrokerName() {
        return this.brokerName;
    }

    @NotNull
    public final String getBrokerType() {
        return this.brokerType;
    }

    public int hashCode() {
        return this.brokerName.hashCode() + a.c(a.c(a.c(this.accountId.hashCode() * 31, 31, this.accountName), 31, this.accessToken), 31, this.brokerType);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("IntegrationAccessToken(accountId=");
        sb6.append(this.accountId);
        sb6.append(", accountName=");
        sb6.append(this.accountName);
        sb6.append(", accessToken=");
        sb6.append(this.accessToken);
        sb6.append(", brokerType=");
        sb6.append(this.brokerType);
        sb6.append(", brokerName=");
        return j6.a.u(sb6, this.brokerName, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}

package com.onfido.api.client.token;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public abstract class InternalToken implements Serializable {
    private String appId;
    private final boolean isDemoToken;

    @NotNull
    private String region;

    @NotNull
    private final String tokenValue;

    public InternalToken(String tokenValue, String str) {
        Intrinsics.checkNotNullParameter(tokenValue, "tokenValue");
        this.tokenValue = tokenValue;
        this.appId = str;
        this.region = "EU";
        this.isDemoToken = "demo".equals(tokenValue);
    }

    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    public final String getTokenValue() {
        return this.tokenValue;
    }

    public final boolean isDemoToken() {
        return this.isDemoToken;
    }

    public final void setAppId(String str) {
        this.appId = str;
    }

    public final void setRegion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.region = str;
    }
}

package com.revolut.network.auth;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tmi.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/network/auth/RetailRevolutOauthConfiguration;", "Ltmi/b;", "<init>", "()V", "", "getAuthHostUrl", "()Ljava/lang/String;", "authHostUrl", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RetailRevolutOauthConfiguration implements b {

    @NotNull
    public static final RetailRevolutOauthConfiguration INSTANCE = new RetailRevolutOauthConfiguration();

    private RetailRevolutOauthConfiguration() {
    }

    @Override // tmi.b
    @NotNull
    public String getAuthHostUrl() {
        return "https://auth.revolut.com";
    }
}

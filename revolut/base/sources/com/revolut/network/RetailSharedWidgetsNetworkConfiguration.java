package com.revolut.network;

import csh.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/network/RetailSharedWidgetsNetworkConfiguration;", "Lcsh/c;", "<init>", "()V", "", "getHostUrl", "()Ljava/lang/String;", "hostUrl", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RetailSharedWidgetsNetworkConfiguration implements c {

    @NotNull
    public static final RetailSharedWidgetsNetworkConfiguration INSTANCE = new RetailSharedWidgetsNetworkConfiguration();

    private RetailSharedWidgetsNetworkConfiguration() {
    }

    @Override // csh.c
    @NotNull
    public String getHostUrl() {
        return "https://api.revolut.com";
    }

    @Override // csh.c
    public /* bridge */ boolean shouldUseSharedService() {
        return true;
    }
}

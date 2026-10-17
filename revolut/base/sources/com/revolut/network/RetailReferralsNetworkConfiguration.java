package com.revolut.network;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/network/RetailReferralsNetworkConfiguration;", "Lp9l/a;", "<init>", "()V", "", "getHostUrl", "()Ljava/lang/String;", "hostUrl", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RetailReferralsNetworkConfiguration implements p9l.a {

    @NotNull
    public static final RetailReferralsNetworkConfiguration INSTANCE = new RetailReferralsNetworkConfiguration();

    private RetailReferralsNetworkConfiguration() {
    }

    @Override // p9l.a
    @NotNull
    public String getHostUrl() {
        return "https://api.revolut.com";
    }
}

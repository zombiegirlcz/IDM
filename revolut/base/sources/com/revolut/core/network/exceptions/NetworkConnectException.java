package com.revolut.core.network.exceptions;

import d0m.b;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import ulm.x0;
import v0.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/network/exceptions/NetworkConnectException;", "Ljava/io/IOException;", "Companion", "a", "core_network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NetworkConnectException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f51446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51447b;

    /* JADX WARN: Illegal instructions before constructor call */
    public NetworkConnectException(String httpMethod, x0 httpUrl, boolean z, Exception cause) {
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        Intrinsics.checkNotNullParameter(httpUrl, "httpUrl");
        Intrinsics.checkNotNullParameter(cause, "cause");
        Regex regex = b.f110450a;
        StringBuilder sbM = a.m("Request URL: ", httpMethod, " ", b.a(String.valueOf(httpUrl)), ", isOnline: ");
        sbM.append(z);
        super(sbM.toString(), cause);
        this.f51446a = z;
        this.f51447b = httpMethod;
    }
}

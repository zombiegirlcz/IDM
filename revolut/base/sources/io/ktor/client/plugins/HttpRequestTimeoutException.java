package io.ktor.client.plugins;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import skm.w;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/HttpRequestTimeoutException;", "Ljava/io/IOException;", "Lkotlinx/io/IOException;", "Lskm/w;", "ktor-client-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HttpRequestTimeoutException extends IOException implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f163028b;

    public HttpRequestTimeoutException(String url2, Long l2, Throwable th10) {
        Intrinsics.checkNotNullParameter(url2, "url");
        StringBuilder sb6 = new StringBuilder("Request timeout has expired [url=");
        sb6.append(url2);
        sb6.append(", request_timeout=");
        sb6.append(l2 == null ? "unknown" : l2);
        sb6.append(" ms]");
        super(sb6.toString(), th10);
        this.f163027a = url2;
        this.f163028b = l2;
    }

    @Override // skm.w
    public final Throwable a() {
        return new HttpRequestTimeoutException(this.f163027a, this.f163028b, getCause());
    }
}
